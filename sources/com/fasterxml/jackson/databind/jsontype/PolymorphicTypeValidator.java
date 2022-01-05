package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import java.io.Serializable;

public abstract class PolymorphicTypeValidator implements Serializable {

    public static abstract class Base extends PolymorphicTypeValidator implements Serializable {
    }

    public enum Validity {
        ALLOWED,
        DENIED,
        INDETERMINATE
    }

    public abstract Validity a(MapperConfig<?> mapperConfig, JavaType javaType);

    public abstract Validity b(MapperConfig<?> mapperConfig, JavaType javaType, String str) throws JsonMappingException;

    public abstract Validity c(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) throws JsonMappingException;
}
