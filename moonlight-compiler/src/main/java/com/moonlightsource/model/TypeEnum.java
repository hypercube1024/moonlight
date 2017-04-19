package com.moonlightsource.model;

import java.util.EnumSet;

/**
 * @author Pengtao Qiu
 */
public enum TypeEnum {
    BOOLEAN,
    BYTE,
    SHORT,
    CHAR,
    INT,
    LONG,
    FLOAT,
    DOUBLE,
    STRING,

    LIST,
    SET,
    MAP,

    STRUCT,
    ENUM,
    INTERFACE,
    ANNOTATION,
    VOID;


    private static final EnumSet<TypeEnum> BASE_TYPE_ENUMS = EnumSet.of(
            BOOLEAN,
            BYTE,
            SHORT,
            CHAR,
            INT,
            LONG,
            FLOAT,
            DOUBLE,
            STRING
    );

    private static final EnumSet<TypeEnum> CONTAINER_TYPE_ENUMS = EnumSet.of(
            LIST,
            SET,
            MAP
    );

    public boolean isBaseType() {
        return BASE_TYPE_ENUMS.contains(this);
    }

    public boolean isContainerType() {
        return CONTAINER_TYPE_ENUMS.contains(this);
    }

}
