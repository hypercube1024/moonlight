package com.moonlightsource.idl.compiler.model;

import java.util.EnumSet;

/**
 * @author Pengtao Qiu
 */
public enum TypeEnum {
    BOOLEAN("boolean"), BYTE("byte"), SHORT("short"), CHAR("char"), INT("int"), LONG("long"), FLOAT("float"), DOUBLE("double"), STRING("string"),

    LIST("list"), SET("set"), MAP("map"),

    REFERENCE("reference");

    private final String keyword;

    TypeEnum(String keyword) {
        this.keyword = keyword;
    }

    public static final EnumSet<TypeEnum> BASE_TYPE_ENUMS = EnumSet.of(BOOLEAN, BYTE, SHORT, CHAR, INT, LONG, FLOAT, DOUBLE, STRING);

    public static final EnumSet<TypeEnum> CONTAINER_TYPE_ENUMS = EnumSet.of(LIST, SET, MAP);


    public boolean isBaseType() {
        return BASE_TYPE_ENUMS.contains(this);
    }

    public boolean isContainerType() {
        return CONTAINER_TYPE_ENUMS.contains(this);
    }

    public boolean isReferenceType() {
        return this == REFERENCE;
    }

    public String getKeyword() {
        return keyword;
    }
}
