//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: [TEXT REMOVED by maven-replacer-plugin]
//


package com.sldeditor.common.xml.ui;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldIdEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FieldIdEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="GEOMETRY"/>
 *     &lt;enumeration value="TITLE"/>
 *     &lt;enumeration value="SYMBOL_TYPE"/>
 *     &lt;enumeration value="SIZE"/>
 *     &lt;enumeration value="ANGLE"/>
 *     &lt;enumeration value="DISPLACEMENT_X"/>
 *     &lt;enumeration value="DISPLACEMENT_Y"/>
 *     &lt;enumeration value="ANCHOR_POINT_V"/>
 *     &lt;enumeration value="ANCHOR_POINT_H"/>
 *     &lt;enumeration value="GAP"/>
 *     &lt;enumeration value="INITIAL_GAP"/>
 *     &lt;enumeration value="OVERALL_OPACITY"/>
 *     &lt;enumeration value="FILTER"/>
 *     &lt;enumeration value="FILL_COLOUR"/>
 *     &lt;enumeration value="DEFAULT_STYLE"/>
 *     &lt;enumeration value="ELSE_FILTER"/>
 *     &lt;enumeration value="EXTERNAL_GRAPHIC"/>
 *     &lt;enumeration value="LABEL"/>
 *     &lt;enumeration value="DESCRIPTION"/>
 *     &lt;enumeration value="MINIMUM_SCALE"/>
 *     &lt;enumeration value="MAXIMUM_SCALE"/>
 *     &lt;enumeration value="UOM"/>
 *     &lt;enumeration value="NAME"/>
 *     &lt;enumeration value="POINT_FILL_OPACITY"/>
 *     &lt;enumeration value="POINT_STROKE_OPACITY"/>
 *     &lt;enumeration value="LINE_FILL_OPACITY"/>
 *     &lt;enumeration value="LINE_STROKE_OPACITY"/>
 *     &lt;enumeration value="POLYGON_FILL_OPACITY"/>
 *     &lt;enumeration value="POLYGON_STROKE_OPACITY"/>
 *     &lt;enumeration value="TEXT_OPACITY"/>
 *     &lt;enumeration value="STROKE_STYLE"/>
 *     &lt;enumeration value="STROKE_FILL_COLOUR"/>
 *     &lt;enumeration value="STROKE_FILL_WIDTH"/>
 *     &lt;enumeration value="STROKE_WIDTH"/>
 *     &lt;enumeration value="STROKE_LINE_JOIN"/>
 *     &lt;enumeration value="STROKE_LINE_CAP"/>
 *     &lt;enumeration value="STROKE_DASH_ARRAY"/>
 *     &lt;enumeration value="STROKE_OFFSET"/>
 *     &lt;enumeration value="STROKE_STROKE_COLOUR"/>
 *     &lt;enumeration value="STROKE_SYMBOL_SIZE"/>
 *     &lt;enumeration value="STROKE_SYMBOL_ANGLE"/>
 *     &lt;enumeration value="STROKE_SYMBOL_DISPLACEMENT_X"/>
 *     &lt;enumeration value="STROKE_SYMBOL_DISPLACEMENT_Y"/>
 *     &lt;enumeration value="STROKE_SYMBOL_ANCHOR_POINT_V"/>
 *     &lt;enumeration value="STROKE_SYMBOL_ANCHOR_POINT_H"/>
 *     &lt;enumeration value="STROKE_SYMBOL_GAP"/>
 *     &lt;enumeration value="STROKE_SYMBOL_INITIAL_GAP"/>
 *     &lt;enumeration value="FONT_FAMILY"/>
 *     &lt;enumeration value="FONT_STYLE"/>
 *     &lt;enumeration value="FONT_WEIGHT"/>
 *     &lt;enumeration value="FONT_SIZE"/>
 *     &lt;enumeration value="FONT_PREVIEW"/>
 *     &lt;enumeration value="HALO_COLOUR"/>
 *     &lt;enumeration value="HALO_RADIUS"/>
 *     &lt;enumeration value="VO_TEXT_LABEL"/>
 *     &lt;enumeration value="LABEL_ALLOW_OVERRUNS"/>
 *     &lt;enumeration value="LABEL_AUTO_WRAP"/>
 *     &lt;enumeration value="LABEL_CONFLICT_RESOLUTION"/>
 *     &lt;enumeration value="LABEL_FOLLOW_LINE"/>
 *     &lt;enumeration value="LABEL_FORCE_LEFT_TO_RIGHT"/>
 *     &lt;enumeration value="LABEL_GOODNESS_OF_FIT"/>
 *     &lt;enumeration value="LABEL_GRAPHIC_MARGIN"/>
 *     &lt;enumeration value="LABEL_GRAPHIC_RESIZE"/>
 *     &lt;enumeration value="LABEL_GROUP"/>
 *     &lt;enumeration value="LABEL_LABEL_ALL_GROUP"/>
 *     &lt;enumeration value="LABEL_LABEL_REPEAT"/>
 *     &lt;enumeration value="LABEL_MAX_ANGLE_DELTA"/>
 *     &lt;enumeration value="LABEL_MAX_DISPLACEMENT"/>
 *     &lt;enumeration value="LABEL_MIN_GROUP_DISTANCE"/>
 *     &lt;enumeration value="LABEL_PARTIALS"/>
 *     &lt;enumeration value="LABEL_POLYGONALIGN"/>
 *     &lt;enumeration value="LABEL_SPACE_AROUND"/>
 *     &lt;enumeration value="LABEL_UNDERLINE"/>
 *     &lt;enumeration value="MAX_DISPLACEMENT"/>
 *     &lt;enumeration value="PERPENDICULAR_OFFSET"/>
 *     &lt;enumeration value="LABEL_PLACEMENT"/>
 *     &lt;enumeration value="ALIGN"/>
 *     &lt;enumeration value="REPEATED"/>
 *     &lt;enumeration value="GENERALISED_LINE"/>
 *     &lt;enumeration value="TRANSFORMATION"/>
 *     &lt;enumeration value="TTF_SYMBOL"/>
 *     &lt;enumeration value="RANDOM_FILL_ACTIVATE"/>
 *     &lt;enumeration value="RANDOM_FILL_TILE_SIZE"/>
 *     &lt;enumeration value="RANDOM_FILL_ROTATION"/>
 *     &lt;enumeration value="RANDOM_FILL_SYMBOL_COUNT"/>
 *     &lt;enumeration value="RANDOM_FILL_RANDOM_SEED"/>
 *     &lt;enumeration value="WINDBARBS"/>
 *     &lt;enumeration value="WINDBARB_WINDSPEED"/>
 *     &lt;enumeration value="WINDBARB_WINDSPEED_UNITS"/>
 *     &lt;enumeration value="WINDBARB_NORTHERN_HEMISPHERE"/>
 *     &lt;enumeration value="WKT"/>
 *     &lt;enumeration value="FUNCTION"/>
 *     &lt;enumeration value="RASTER_OPACITY"/>
 *     &lt;enumeration value="RASTER_CONTRAST_GAMMAVALUE"/>
 *     &lt;enumeration value="RASTER_OVERLAP_BEHAVIOUR"/>
 *     &lt;enumeration value="RASTER_SHADEDRELIEF_BRIGHTNESS"/>
 *     &lt;enumeration value="RASTER_SHADEDRELIEF_FACTOR"/>
 *     &lt;enumeration value="RASTER_COLOURMAP_TYPE"/>
 *     &lt;enumeration value="RASTER_COLOURMAP"/>
 *     &lt;enumeration value="RASTER_RGB_RED_NAME"/>
 *     &lt;enumeration value="RASTER_RGB_CHANNEL_RED_CONTRAST_GAMMA"/>
 *     &lt;enumeration value="RASTER_RGB_GREEN_NAME"/>
 *     &lt;enumeration value="RASTER_RGB_CHANNEL_GREEN_CONTRAST_GAMMA"/>
 *     &lt;enumeration value="RASTER_RGB_BLUE_NAME"/>
 *     &lt;enumeration value="RASTER_RGB_CHANNEL_BLUE_CONTRAST_GAMMA"/>
 *     &lt;enumeration value="RASTER_RGB_GREY_NAME"/>
 *     &lt;enumeration value="RASTER_RGB_CHANNEL_GREY_CONTRAST_GAMMA"/>
 *     &lt;enumeration value="RASTER_COLOURMAP_ENTRY_LABEL"/>
 *     &lt;enumeration value="RASTER_COLOURMAP_ENTRY_COLOUR"/>
 *     &lt;enumeration value="RASTER_COLOURMAP_ENTRY_OPACITY"/>
 *     &lt;enumeration value="RASTER_COLOURMAP_ENTRY_QUANTITY"/>
 *     &lt;enumeration value="VO_RASTER_RED_CONTRAST_METHOD_NORMALIZE"/>
 *     &lt;enumeration value="VO_RASTER_NORMALIZE_ALGORITHM_RED"/>
 *     &lt;enumeration value="VO_RASTER_NORMALIZE_MIN_VALUE_RED"/>
 *     &lt;enumeration value="VO_RASTER_NORMALIZE_MAX_VALUE_RED"/>
 *     &lt;enumeration value="VO_RASTER_GREEN_CONTRAST_METHOD_NORMALIZE"/>
 *     &lt;enumeration value="VO_RASTER_NORMALIZE_ALGORITHM_GREEN"/>
 *     &lt;enumeration value="VO_RASTER_NORMALIZE_MIN_VALUE_GREEN"/>
 *     &lt;enumeration value="VO_RASTER_NORMALIZE_MAX_VALUE_GREEN"/>
 *     &lt;enumeration value="VO_RASTER_BLUE_CONTRAST_METHOD_NORMALIZE"/>
 *     &lt;enumeration value="VO_RASTER_NORMALIZE_ALGORITHM_BLUE"/>
 *     &lt;enumeration value="VO_RASTER_NORMALIZE_MIN_VALUE_BLUE"/>
 *     &lt;enumeration value="VO_RASTER_NORMALIZE_MAX_VALUE_BLUE"/>
 *     &lt;enumeration value="VO_RASTER_GREY_CONTRAST_METHOD_NORMALIZE"/>
 *     &lt;enumeration value="VO_RASTER_NORMALIZE_ALGORITHM_GREY"/>
 *     &lt;enumeration value="VO_RASTER_NORMALIZE_MIN_VALUE_GREY"/>
 *     &lt;enumeration value="VO_RASTER_NORMALIZE_MAX_VALUE_GREY"/>
 *     &lt;enumeration value="VO_RASTER_OVERALL_CONTRAST_METHOD_NORMALIZE"/>
 *     &lt;enumeration value="VO_RASTER_NORMALIZE_ALGORITHM_OVERALL"/>
 *     &lt;enumeration value="VO_RASTER_NORMALIZE_MIN_VALUE_OVERALL"/>
 *     &lt;enumeration value="VO_RASTER_NORMALIZE_MAX_VALUE_OVERALL"/>
 *     &lt;enumeration value="REMOTE_OWS_SERVICE"/>
 *     &lt;enumeration value="REMOTE_OWS_ONLINERESOURCE"/>
 *     &lt;enumeration value="INLINE_FEATURE"/>
 *     &lt;enumeration value="LAYER_FEATURE_CONSTRAINTS"/>
 *     &lt;enumeration value="COLOUR_RAMP_TYPE"/>
 *     &lt;enumeration value="COLOUR_RAMP_COLOUR"/>
 *     &lt;enumeration value="COLOUR_RAMP_REVERSE"/>
 *     &lt;enumeration value="VO_POINT_RANDOMFILL"/>
 *     &lt;enumeration value="VO_POLYGON_RANDOMFILL"/>
 *     &lt;enumeration value="VO_SHAPE"/>
 *     &lt;enumeration value="VO_EXTSHAPE"/>
 *     &lt;enumeration value="VO_ARROW"/>
 *     &lt;enumeration value="VO_ARROW_THICKNESS"/>
 *     &lt;enumeration value="VO_ARROW_HEIGHT_OVER_WIDTH"/>
 *     &lt;enumeration value="VO_ARROW_HEAD"/>
 *     &lt;enumeration value="VO_QGIS"/>
 *     &lt;enumeration value="VO_TEXT_LABEL_UNDERLINE"/>
 *     &lt;enumeration value="VO_TEXTSYMBOLIZER_2"/>
 *     &lt;enumeration value="VO_TEXTSYMBOLIZER_2_FEATURE_DESCRIPTION"/>
 *     &lt;enumeration value="VO_TEXTSYMBOLIZER_2_SNIPPET"/>
 *     &lt;enumeration value="VO_TEXTSYMBOLIZER_2_SYMBOL_TYPE"/>
 *     &lt;enumeration value="VO_TEXTSYMBOLIZER_2_ANGLE"/>
 *     &lt;enumeration value="VO_TEXTSYMBOLIZER_2_SIZE"/>
 *     &lt;enumeration value="VO_TEXTSYMBOLIZER_2_OVERALL_OPACITY"/>
 *     &lt;enumeration value="VO_TEXTSYMBOLIZER_2_FILL_COLOUR"/>
 *     &lt;enumeration value="VO_TEXTSYMBOLIZER_2_FILL_OPACITY"/>
 *     &lt;enumeration value="VO_TEXTSYMBOLIZER_2_STROKE_FILL_COLOUR"/>
 *     &lt;enumeration value="VO_TEXTSYMBOLIZER_2_STROKE_OPACITY"/>
 *     &lt;enumeration value="VO_TEXTSYMBOLIZER_2_STROKE_FILL_WIDTH"/>
 *     &lt;enumeration value="VO_TEXTSYMBOLIZER_2_OTHERTEXT_TARGET"/>
 *     &lt;enumeration value="VO_TEXTSYMBOLIZER_2_OTHERTEXT_TEXT"/>
 *     &lt;enumeration value="VO_TEXT_SPACING"/>
 *     &lt;enumeration value="VO_TEXT_SPACING_WORD"/>
 *     &lt;enumeration value="VO_TEXT_SPACING_CHAR"/>
 *     &lt;enumeration value="VO_FTS_COMPOSITE"/>
 *     &lt;enumeration value="VO_FTS_COMPOSITE_OPTION"/>
 *     &lt;enumeration value="VO_FTS_COMPOSITE_OPACITY"/>
 *     &lt;enumeration value="VO_FTS_COMPOSITE_BASE"/>
 *     &lt;enumeration value="VO_FTS_COMPOSITE_BASE_BOOL"/>
 *     &lt;enumeration value="VO_FTS_RULE_EVALUATION"/>
 *     &lt;enumeration value="VO_FTS_RULE_EVALUATION_OPTION"/>
 *     &lt;enumeration value="VO_FTS_SORTBY"/>
 *     &lt;enumeration value="VO_FTS_SORTBY_MULTIOPTION_SORTBY_LIST"/>
 *     &lt;enumeration value="VO_FTS_SORTBY_MULTIOPTION_SORTBY_GROUP_PROPERTIES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FieldIdEnum")
@XmlEnum
public enum FieldIdEnum {

    UNKNOWN,
    GEOMETRY,
    TITLE,
    SYMBOL_TYPE,
    SIZE,
    ANGLE,
    DISPLACEMENT_X,
    DISPLACEMENT_Y,
    ANCHOR_POINT_V,
    ANCHOR_POINT_H,
    GAP,
    INITIAL_GAP,
    OVERALL_OPACITY,
    FILTER,
    FILL_COLOUR,
    DEFAULT_STYLE,
    ELSE_FILTER,
    EXTERNAL_GRAPHIC,
    LABEL,
    DESCRIPTION,
    MINIMUM_SCALE,
    MAXIMUM_SCALE,
    UOM,
    NAME,
    POINT_FILL_OPACITY,
    POINT_STROKE_OPACITY,
    LINE_FILL_OPACITY,
    LINE_STROKE_OPACITY,
    POLYGON_FILL_OPACITY,
    POLYGON_STROKE_OPACITY,
    TEXT_OPACITY,
    STROKE_STYLE,
    STROKE_FILL_COLOUR,
    STROKE_FILL_WIDTH,
    STROKE_WIDTH,
    STROKE_LINE_JOIN,
    STROKE_LINE_CAP,
    STROKE_DASH_ARRAY,
    STROKE_OFFSET,
    STROKE_STROKE_COLOUR,
    STROKE_SYMBOL_SIZE,
    STROKE_SYMBOL_ANGLE,
    STROKE_SYMBOL_DISPLACEMENT_X,
    STROKE_SYMBOL_DISPLACEMENT_Y,
    STROKE_SYMBOL_ANCHOR_POINT_V,
    STROKE_SYMBOL_ANCHOR_POINT_H,
    STROKE_SYMBOL_GAP,
    STROKE_SYMBOL_INITIAL_GAP,
    FONT_FAMILY,
    FONT_STYLE,
    FONT_WEIGHT,
    FONT_SIZE,
    FONT_PREVIEW,
    HALO_COLOUR,
    HALO_RADIUS,
    VO_TEXT_LABEL,
    LABEL_ALLOW_OVERRUNS,
    LABEL_AUTO_WRAP,
    LABEL_CONFLICT_RESOLUTION,
    LABEL_FOLLOW_LINE,
    LABEL_FORCE_LEFT_TO_RIGHT,
    LABEL_GOODNESS_OF_FIT,
    LABEL_GRAPHIC_MARGIN,
    LABEL_GRAPHIC_RESIZE,
    LABEL_GROUP,
    LABEL_LABEL_ALL_GROUP,
    LABEL_LABEL_REPEAT,
    LABEL_MAX_ANGLE_DELTA,
    LABEL_MAX_DISPLACEMENT,
    LABEL_MIN_GROUP_DISTANCE,
    LABEL_PARTIALS,
    LABEL_POLYGONALIGN,
    LABEL_SPACE_AROUND,
    LABEL_UNDERLINE,
    MAX_DISPLACEMENT,
    PERPENDICULAR_OFFSET,
    LABEL_PLACEMENT,
    ALIGN,
    REPEATED,
    GENERALISED_LINE,
    TRANSFORMATION,
    TTF_SYMBOL,
    RANDOM_FILL_ACTIVATE,
    RANDOM_FILL_TILE_SIZE,
    RANDOM_FILL_ROTATION,
    RANDOM_FILL_SYMBOL_COUNT,
    RANDOM_FILL_RANDOM_SEED,
    WINDBARBS,
    WINDBARB_WINDSPEED,
    WINDBARB_WINDSPEED_UNITS,
    WINDBARB_NORTHERN_HEMISPHERE,
    WKT,
    FUNCTION,
    RASTER_OPACITY,
    RASTER_CONTRAST_GAMMAVALUE,
    RASTER_OVERLAP_BEHAVIOUR,
    RASTER_SHADEDRELIEF_BRIGHTNESS,
    RASTER_SHADEDRELIEF_FACTOR,
    RASTER_COLOURMAP_TYPE,
    RASTER_COLOURMAP,
    RASTER_RGB_RED_NAME,
    RASTER_RGB_CHANNEL_RED_CONTRAST_GAMMA,
    RASTER_RGB_GREEN_NAME,
    RASTER_RGB_CHANNEL_GREEN_CONTRAST_GAMMA,
    RASTER_RGB_BLUE_NAME,
    RASTER_RGB_CHANNEL_BLUE_CONTRAST_GAMMA,
    RASTER_RGB_GREY_NAME,
    RASTER_RGB_CHANNEL_GREY_CONTRAST_GAMMA,
    RASTER_COLOURMAP_ENTRY_LABEL,
    RASTER_COLOURMAP_ENTRY_COLOUR,
    RASTER_COLOURMAP_ENTRY_OPACITY,
    RASTER_COLOURMAP_ENTRY_QUANTITY,
    VO_RASTER_RED_CONTRAST_METHOD_NORMALIZE,
    VO_RASTER_NORMALIZE_ALGORITHM_RED,
    VO_RASTER_NORMALIZE_MIN_VALUE_RED,
    VO_RASTER_NORMALIZE_MAX_VALUE_RED,
    VO_RASTER_GREEN_CONTRAST_METHOD_NORMALIZE,
    VO_RASTER_NORMALIZE_ALGORITHM_GREEN,
    VO_RASTER_NORMALIZE_MIN_VALUE_GREEN,
    VO_RASTER_NORMALIZE_MAX_VALUE_GREEN,
    VO_RASTER_BLUE_CONTRAST_METHOD_NORMALIZE,
    VO_RASTER_NORMALIZE_ALGORITHM_BLUE,
    VO_RASTER_NORMALIZE_MIN_VALUE_BLUE,
    VO_RASTER_NORMALIZE_MAX_VALUE_BLUE,
    VO_RASTER_GREY_CONTRAST_METHOD_NORMALIZE,
    VO_RASTER_NORMALIZE_ALGORITHM_GREY,
    VO_RASTER_NORMALIZE_MIN_VALUE_GREY,
    VO_RASTER_NORMALIZE_MAX_VALUE_GREY,
    VO_RASTER_OVERALL_CONTRAST_METHOD_NORMALIZE,
    VO_RASTER_NORMALIZE_ALGORITHM_OVERALL,
    VO_RASTER_NORMALIZE_MIN_VALUE_OVERALL,
    VO_RASTER_NORMALIZE_MAX_VALUE_OVERALL,
    REMOTE_OWS_SERVICE,
    REMOTE_OWS_ONLINERESOURCE,
    INLINE_FEATURE,
    LAYER_FEATURE_CONSTRAINTS,
    COLOUR_RAMP_TYPE,
    COLOUR_RAMP_COLOUR,
    COLOUR_RAMP_REVERSE,
    VO_POINT_RANDOMFILL,
    VO_POLYGON_RANDOMFILL,
    VO_SHAPE,
    VO_EXTSHAPE,
    VO_ARROW,
    VO_ARROW_THICKNESS,
    VO_ARROW_HEIGHT_OVER_WIDTH,
    VO_ARROW_HEAD,
    VO_QGIS,
    VO_TEXT_LABEL_UNDERLINE,
    VO_TEXTSYMBOLIZER_2,
    VO_TEXTSYMBOLIZER_2_FEATURE_DESCRIPTION,
    VO_TEXTSYMBOLIZER_2_SNIPPET,
    VO_TEXTSYMBOLIZER_2_SYMBOL_TYPE,
    VO_TEXTSYMBOLIZER_2_ANGLE,
    VO_TEXTSYMBOLIZER_2_SIZE,
    VO_TEXTSYMBOLIZER_2_OVERALL_OPACITY,
    VO_TEXTSYMBOLIZER_2_FILL_COLOUR,
    VO_TEXTSYMBOLIZER_2_FILL_OPACITY,
    VO_TEXTSYMBOLIZER_2_STROKE_FILL_COLOUR,
    VO_TEXTSYMBOLIZER_2_STROKE_OPACITY,
    VO_TEXTSYMBOLIZER_2_STROKE_FILL_WIDTH,
    VO_TEXTSYMBOLIZER_2_OTHERTEXT_TARGET,
    VO_TEXTSYMBOLIZER_2_OTHERTEXT_TEXT,
    VO_TEXT_SPACING,
    VO_TEXT_SPACING_WORD,
    VO_TEXT_SPACING_CHAR,
    VO_FTS_COMPOSITE,
    VO_FTS_COMPOSITE_OPTION,
    VO_FTS_COMPOSITE_OPACITY,
    VO_FTS_COMPOSITE_BASE,
    VO_FTS_COMPOSITE_BASE_BOOL,
    VO_FTS_RULE_EVALUATION,
    VO_FTS_RULE_EVALUATION_OPTION,
    VO_FTS_SORTBY,
    VO_FTS_SORTBY_MULTIOPTION_SORTBY_LIST,
    VO_FTS_SORTBY_MULTIOPTION_SORTBY_GROUP_PROPERTIES;

    public String value() {
        return name();
    }

    public static FieldIdEnum fromValue(String v) {
        return valueOf(v);
    }

}
