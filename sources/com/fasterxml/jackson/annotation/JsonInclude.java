package com.fasterxml.jackson.annotation;

import i0.d.a.a.a;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonInclude {

    public enum Include {
        ALWAYS,
        NON_NULL,
        NON_ABSENT,
        NON_EMPTY,
        NON_DEFAULT,
        CUSTOM,
        USE_DEFAULTS
    }

    public static class Value implements Serializable {
        public static final Value c;
        public final Include d;
        public final Include q;
        public final Class<?> x;
        public final Class<?> y;

        static {
            Include include = Include.USE_DEFAULTS;
            c = new Value(include, include, (Class<?>) null, (Class<?>) null);
        }

        public Value(Include include, Include include2, Class<?> cls, Class<?> cls2) {
            this.d = include == null ? Include.USE_DEFAULTS : include;
            this.q = include2 == null ? Include.USE_DEFAULTS : include2;
            this.x = cls == Void.class ? null : cls;
            this.y = cls2 == Void.class ? null : cls2;
        }

        public Value a(Value value) {
            if (!(value == null || value == c)) {
                Include include = value.d;
                Include include2 = value.q;
                Class<?> cls = value.x;
                Class<?> cls2 = value.y;
                Include include3 = this.d;
                boolean z = true;
                boolean z2 = (include == include3 || include == Include.USE_DEFAULTS) ? false : true;
                Include include4 = this.q;
                boolean z3 = (include2 == include4 || include2 == Include.USE_DEFAULTS) ? false : true;
                Class<?> cls3 = this.x;
                if (cls == cls3 && cls2 == cls3) {
                    z = false;
                }
                if (z2) {
                    if (z3) {
                        return new Value(include, include2, cls, cls2);
                    }
                    return new Value(include, include4, cls, cls2);
                } else if (z3) {
                    return new Value(include3, include2, cls, cls2);
                } else {
                    if (z) {
                        return new Value(include3, include4, cls, cls2);
                    }
                }
            }
            return this;
        }

        public Value b(Include include) {
            return include == this.d ? this : new Value(include, this.q, this.x, this.y);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != Value.class) {
                return false;
            }
            Value value = (Value) obj;
            if (value.d == this.d && value.q == this.q && value.x == this.x && value.y == this.y) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.q.hashCode() + (this.d.hashCode() << 2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(80);
            sb.append("JsonInclude.Value(value=");
            sb.append(this.d);
            sb.append(",content=");
            sb.append(this.q);
            if (this.x != null) {
                sb.append(",valueFilter=");
                a.p(this.x, sb, ".class");
            }
            if (this.y != null) {
                sb.append(",contentFilter=");
                a.p(this.y, sb, ".class");
            }
            sb.append(')');
            return sb.toString();
        }
    }

    Include content() default Include.ALWAYS;

    Class<?> contentFilter() default Void.class;

    Include value() default Include.ALWAYS;

    Class<?> valueFilter() default Void.class;
}
