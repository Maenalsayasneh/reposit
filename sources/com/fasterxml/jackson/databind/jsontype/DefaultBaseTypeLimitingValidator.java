package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import java.io.Closeable;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class DefaultBaseTypeLimitingValidator extends PolymorphicTypeValidator implements Serializable {

    public static final class a {
        public static final a a = new a();
        public final Set<String> b;

        public a() {
            HashSet hashSet = new HashSet();
            this.b = hashSet;
            hashSet.add(Object.class.getName());
            hashSet.add(Closeable.class.getName());
            hashSet.add(Serializable.class.getName());
            hashSet.add(AutoCloseable.class.getName());
            hashSet.add(Cloneable.class.getName());
            hashSet.add("java.util.logging.Handler");
            hashSet.add("javax.naming.Referenceable");
            hashSet.add("javax.sql.DataSource");
        }
    }

    public PolymorphicTypeValidator.Validity a(MapperConfig<?> mapperConfig, JavaType javaType) {
        if (a.a.b.contains(javaType.c.getName())) {
            return PolymorphicTypeValidator.Validity.DENIED;
        }
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    public PolymorphicTypeValidator.Validity b(MapperConfig<?> mapperConfig, JavaType javaType, String str) {
        return PolymorphicTypeValidator.Validity.INDETERMINATE;
    }

    public PolymorphicTypeValidator.Validity c(MapperConfig<?> mapperConfig, JavaType javaType, JavaType javaType2) {
        return PolymorphicTypeValidator.Validity.ALLOWED;
    }
}
