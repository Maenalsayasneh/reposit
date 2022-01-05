package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JacksonInject {

    public static class Value implements Serializable {
        public static final Value c = new Value((Object) null, (Boolean) null);
        public final Object d;
        public final Boolean q;

        public Value(Object obj, Boolean bool) {
            this.d = obj;
            this.q = bool;
        }

        public static Value a(Object obj, Boolean bool) {
            if ("".equals(obj)) {
                obj = null;
            }
            if (obj == null && bool == null) {
                return c;
            }
            return new Value(obj, bool);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == Value.class) {
                Value value = (Value) obj;
                if (OptBoolean.equals(this.q, value.q)) {
                    Object obj2 = this.d;
                    if (obj2 != null) {
                        return obj2.equals(value.d);
                    }
                    if (value.d == null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.d;
            int i = 1;
            if (obj != null) {
                i = 1 + obj.hashCode();
            }
            Boolean bool = this.q;
            return bool != null ? i + bool.hashCode() : i;
        }

        public String toString() {
            return String.format("JacksonInject.Value(id=%s,useInput=%s)", new Object[]{this.d, this.q});
        }
    }

    OptBoolean useInput() default OptBoolean.DEFAULT;

    String value() default "";
}
