/*
 * SLD Editor - The Open Source Java SLD Editor
 *
 * Copyright (C) 2016, SCISYS UK Limited
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.sldeditor.tool.layerstyle;

import com.sldeditor.common.NodeInterface;
import com.sldeditor.common.SLDDataInterface;
import com.sldeditor.common.data.GeoServerConnection;
import com.sldeditor.common.data.GeoServerLayer;
import com.sldeditor.common.data.StyleWrapper;
import com.sldeditor.common.localisation.Localisation;
import com.sldeditor.datasource.extension.filesystem.node.geoserver.GeoServerLayerHeadingNode;
import com.sldeditor.datasource.extension.filesystem.node.geoserver.GeoServerLayerNode;
import com.sldeditor.datasource.extension.filesystem.node.geoserver.GeoServerWorkspaceNode;
import com.sldeditor.tool.ToolButton;
import com.sldeditor.tool.ToolInterface;
import com.sldeditor.tool.ToolPanel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.tree.TreeNode;

/**
 * Tool to allow the GeoServer layers to be updated.
 *
 * @author Robert Ward (SCISYS)
 */
public class GeoServerLayerUpdateTool implements ToolInterface {

    /** The Constant PANEL_WIDTH. */
    private static final int PANEL_WIDTH = 60;

    /** The panel. */
    private JPanel panel;

    /** The geo server layer update. */
    private GeoServerLayerUpdateInterface geoServerLayerUpdate = null;

    /** The layer list. */
    protected List<GeoServerLayer> layerList = new ArrayList<>();

    /** The connection data. */
    protected GeoServerConnection connection = null;

    /** The supported node type list. */
    private static List<Class<?>> supportedNodeTypeList = new ArrayList<>();

    /**
     * Instantiates a new GeoServer layer update tool.
     *
     * @param geoServerLayerUpdate the geo server layer update
     */
    public GeoServerLayerUpdateTool(GeoServerLayerUpdateInterface geoServerLayerUpdate) {
        super();

        this.geoServerLayerUpdate = geoServerLayerUpdate;

        populateSupportedTypes();

        createUI();
    }

    /** Populate supported node types. */
    private void populateSupportedTypes() {
        if (supportedNodeTypeList.isEmpty()) {
            supportedNodeTypeList.add(GeoServerLayerHeadingNode.class);
            supportedNodeTypeList.add(GeoServerWorkspaceNode.class);
            supportedNodeTypeList.add(GeoServerLayerNode.class);
        }
    }

    /** Creates the ui. */
    private void createUI() {
        panel = new JPanel();
        panel.setBorder(
                BorderFactory.createTitledBorder(
                        Localisation.getString(
                                GeoServerLayerUpdateTool.class, "GeoServerLayerUpdateTool.title")));

        JButton button =
                new ToolButton(
                        Localisation.getString(
                                GeoServerLayerUpdateTool.class, "GeoServerLayerUpdateTool.layer"),
                        "tool/layerupdate.png");
        button.setEnabled(true);
        button.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        layerUpdateButtonPressed();
                    }
                });

        panel.add(button);
        panel.setPreferredSize(new Dimension(PANEL_WIDTH, ToolPanel.TOOL_PANEL_HEIGHT));
    }

    /*
     * (non-Javadoc)
     *
     * @see com.sldeditor.tool.ToolInterface#getPanel()
     */
    @Override
    public JPanel getPanel() {
        return panel;
    }

    /*
     * (non-Javadoc)
     *
     * @see com.sldeditor.tool.ToolInterface#setSelectedItems(java.util.List, java.util.List)
     */
    @Override
    public void setSelectedItems(
            List<NodeInterface> nodeTypeList, List<SLDDataInterface> sldDataList) {
        layerList.clear();
        connection = null;

        for (NodeInterface node : nodeTypeList) {
            if (node instanceof GeoServerLayerNode) {
                GeoServerLayerNode layerNode = (GeoServerLayerNode) node;

                selectGeoServerLayerNode(layerNode);
            } else if (node instanceof GeoServerLayerHeadingNode) {
                GeoServerLayerHeadingNode layerHeadingNode = (GeoServerLayerHeadingNode) node;

                selectGeoServerLayerNode(layerHeadingNode);
            } else if (node instanceof GeoServerWorkspaceNode) {
                GeoServerWorkspaceNode workspaceNode = (GeoServerWorkspaceNode) node;

                selectGeoServerWorkspaceNode(workspaceNode);
            }
        }
    }

    /**
     * Select geo server workspace node.
     *
     * @param workspaceNode the workspace node
     */
    private void selectGeoServerWorkspaceNode(GeoServerWorkspaceNode workspaceNode) {
        if (!workspaceNode.isStyle()) {
            connection = workspaceNode.getConnection();

            extractWorkspaceLayers(workspaceNode);
        }
    }

    /**
     * Select geo server layer node.
     *
     * @param layerNode the layer node
     */
    private void selectGeoServerLayerNode(GeoServerLayerNode layerNode) {
        GeoServerLayer layer = layerNode.getLayer();
        layerList.add(layer);

        if (connection == null) {
            connection = layer.getConnection();
        }
    }

    /**
     * Select geo server layer node.
     *
     * @param layerHeadingNode the layer heading node
     */
    private void selectGeoServerLayerNode(GeoServerLayerHeadingNode layerHeadingNode) {
        connection = layerHeadingNode.getConnection();

        for (int workspaceIndex = 0;
                workspaceIndex < layerHeadingNode.getChildCount();
                workspaceIndex++) {
            TreeNode treeNode = layerHeadingNode.getChildAt(workspaceIndex);
            if (treeNode instanceof GeoServerWorkspaceNode) {
                GeoServerWorkspaceNode workspaceNode = (GeoServerWorkspaceNode) treeNode;

                extractWorkspaceLayers(workspaceNode);
            }
        }
    }

    /**
     * Extract workspace layers.
     *
     * @param workspaceNode the workspace node
     */
    private void extractWorkspaceLayers(GeoServerWorkspaceNode workspaceNode) {
        for (int layerIndex = 0; layerIndex < workspaceNode.getChildCount(); layerIndex++) {
            TreeNode childTreeNode = workspaceNode.getChildAt(layerIndex);
            if (childTreeNode instanceof GeoServerLayerNode) {
                GeoServerLayerNode layerNode = (GeoServerLayerNode) childTreeNode;

                GeoServerLayer layer = layerNode.getLayer();

                layerList.add(layer);
            }
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see com.sldeditor.tool.ToolInterface#getToolName()
     */
    @Override
    public String getToolName() {
        return getClass().getName();
    }

    /*
     * (non-Javadoc)
     *
     * @see com.sldeditor.tool.ToolInterface#supports(java.util.List, java.util.List)
     */
    @Override
    public boolean supports(
            List<Class<?>> uniqueNodeTypeList,
            List<NodeInterface> nodeTypeList,
            List<SLDDataInterface> sldDataList) {
        if (uniqueNodeTypeList.size() == 1) {
            NodeInterface node = nodeTypeList.get(0);

            if (supportedNodeTypeList.contains(node.getClass())) {
                // If its a workspace, only allow workspaces in the layer tree
                if (node.getClass() == GeoServerWorkspaceNode.class) {
                    GeoServerWorkspaceNode workspaceNode = (GeoServerWorkspaceNode) node;

                    return (!workspaceNode.isStyle());
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /** Layer update button pressed. */
    protected void layerUpdateButtonPressed() {
        ConfigureLayerStyleDialog dlg = new ConfigureLayerStyleDialog();

        if (geoServerLayerUpdate != null) {
            Map<String, List<StyleWrapper>> styleMap = geoServerLayerUpdate.getStyleMap(connection);

            if (dlg.populate(styleMap, layerList)) {
                geoServerLayerUpdate.updateLayerStyle(dlg.getUpdatedLayerStyles());
            }
        }
    }
}
