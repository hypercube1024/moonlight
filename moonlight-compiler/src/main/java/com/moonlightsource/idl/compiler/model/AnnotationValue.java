package com.moonlightsource.idl.compiler.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Pengtao Qiu
 */
public class AnnotationValue {

    private final DefinitionReference annotationDefinitionReference;
    private final Map<AnnotationFieldDefinition, List<Object>> fieldMap;

    public AnnotationValue(DefinitionReference annotationDefinitionReference, Map<AnnotationFieldDefinition, List<Object>> fieldMap) {
        this.annotationDefinitionReference = annotationDefinitionReference;
        this.fieldMap = fieldMap;
    }

    public Object getValue(String fieldName) {
        Map<String, List<Object>> fieldNameMap = new HashMap<>();
        fieldMap.forEach((k, v) -> fieldNameMap.put(k.getName(), v));

        List<Object> ret = fieldNameMap.get(fieldName);
        if (ret != null && !ret.isEmpty()) {
            return ret.get(0);
        } else {
            return null;
        }
    }

    public List<Object> getValues(String fieldName) {
        Map<String, List<Object>> fieldNameMap = new HashMap<>();
        fieldMap.forEach((k, v) -> fieldNameMap.put(k.getName(), v));

        List<Object> ret = fieldNameMap.get(fieldName);
        if (ret != null && !ret.isEmpty()) {
            return ret;
        } else {
            return Collections.emptyList();
        }
    }

    public AnnotationDefinition getAnnotationDefinition() {
        return (AnnotationDefinition) annotationDefinitionReference.getClassDefinition();
    }
}
