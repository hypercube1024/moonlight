package com.moonlightsource.idl.compiler.model;

import java.util.EnumSet;

/**
 * @author Pengtao Qiu
 */
public enum TypeEnum {
    BOOLEAN, BYTE, SHORT, CHAR, INT, LONG, FLOAT, DOUBLE, STRING,

    LIST, SET, MAP,

    STRUCT, ENUM, INTERFACE, ANNOTATION,

    GENERIC, VOID;


    private static final EnumSet<TypeEnum> BASE_TYPE_ENUMS = EnumSet.of(
            BOOLEAN, BYTE, SHORT, CHAR, INT, LONG, FLOAT, DOUBLE, STRING
    );

    private static final EnumSet<TypeEnum> CONTAINER_TYPE_ENUMS = EnumSet.of(LIST, SET, MAP);

    private static final EnumSet<TypeEnum> CUSTOM_TYPE_ENUMS = EnumSet.of(STRUCT, ENUM, INTERFACE, ANNOTATION);

    public boolean isBaseType() {
        return BASE_TYPE_ENUMS.contains(this);
    }

    public boolean isContainerType() {
        return CONTAINER_TYPE_ENUMS.contains(this);
    }

    public boolean isCustomType() {
        return CUSTOM_TYPE_ENUMS.contains(this);
    }
}
