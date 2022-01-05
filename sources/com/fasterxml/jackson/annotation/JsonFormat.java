package com.fasterxml.jackson.annotation;

import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonFormat {

    public enum Feature {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        ACCEPT_CASE_INSENSITIVE_PROPERTIES,
        ACCEPT_CASE_INSENSITIVE_VALUES,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES,
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE
    }

    public enum Shape {
        ANY,
        NATURAL,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN,
        BINARY;

        public boolean isNumeric() {
            return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
        }

        public boolean isStructured() {
            return this == OBJECT || this == ARRAY;
        }
    }

    public static class Value implements Serializable {
        public static final Value c = new Value();
        public final Boolean Y1;
        public final a Z1;
        public transient TimeZone a2;
        public final String d;
        public final Shape q;
        public final Locale x;
        public final String y;

        public Value() {
            this("", Shape.ANY, "", "", a.a, (Boolean) null);
        }

        public static <T> boolean a(T t, T t2) {
            if (t == null) {
                return t2 == null;
            }
            if (t2 == null) {
                return false;
            }
            return t.equals(t2);
        }

        public Boolean b(Feature feature) {
            a aVar = this.Z1;
            Objects.requireNonNull(aVar);
            int ordinal = 1 << feature.ordinal();
            if ((aVar.c & ordinal) != 0) {
                return Boolean.FALSE;
            }
            if ((ordinal & aVar.b) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        public TimeZone c() {
            TimeZone timeZone = this.a2;
            if (timeZone != null) {
                return timeZone;
            }
            String str = this.y;
            if (str == null) {
                return null;
            }
            TimeZone timeZone2 = DesugarTimeZone.getTimeZone(str);
            this.a2 = timeZone2;
            return timeZone2;
        }

        public boolean d() {
            return this.x != null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = r1.y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean e() {
            /*
                r1 = this;
                java.util.TimeZone r0 = r1.a2
                if (r0 != 0) goto L_0x0011
                java.lang.String r0 = r1.y
                if (r0 == 0) goto L_0x000f
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x000f
                goto L_0x0011
            L_0x000f:
                r0 = 0
                goto L_0x0012
            L_0x0011:
                r0 = 1
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.annotation.JsonFormat.Value.e():boolean");
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != Value.class) {
                return false;
            }
            Value value = (Value) obj;
            if (this.q != value.q || !this.Z1.equals(value.Z1)) {
                return false;
            }
            if (!a(this.Y1, value.Y1) || !a(this.y, value.y) || !a(this.d, value.d) || !a(this.a2, value.a2) || !a(this.x, value.x)) {
                return false;
            }
            return true;
        }

        public final Value f(Value value) {
            Value value2;
            TimeZone timeZone;
            String str;
            if (value == null || value == (value2 = c) || value == this) {
                return this;
            }
            if (this == value2) {
                return value;
            }
            String str2 = value.d;
            if (str2 == null || str2.isEmpty()) {
                str2 = this.d;
            }
            String str3 = str2;
            Shape shape = value.q;
            if (shape == Shape.ANY) {
                shape = this.q;
            }
            Shape shape2 = shape;
            Locale locale = value.x;
            if (locale == null) {
                locale = this.x;
            }
            Locale locale2 = locale;
            a aVar = this.Z1;
            if (aVar == null) {
                aVar = value.Z1;
            } else {
                a aVar2 = value.Z1;
                if (aVar2 != null) {
                    int i = aVar2.c;
                    int i2 = aVar2.b;
                    if (!(i == 0 && i2 == 0)) {
                        int i3 = aVar.b;
                        if (i3 == 0 && aVar.c == 0) {
                            aVar = aVar2;
                        } else {
                            int i4 = ((~i) & i3) | i2;
                            int i5 = aVar.c;
                            int i6 = i | ((~i2) & i5);
                            if (!(i4 == i3 && i6 == i5)) {
                                aVar = new a(i4, i6);
                            }
                        }
                    }
                }
            }
            a aVar3 = aVar;
            Boolean bool = value.Y1;
            if (bool == null) {
                bool = this.Y1;
            }
            Boolean bool2 = bool;
            String str4 = value.y;
            if (str4 == null || str4.isEmpty()) {
                str = this.y;
                timeZone = this.a2;
            } else {
                timeZone = value.a2;
                str = str4;
            }
            return new Value(str3, shape2, locale2, str, timeZone, aVar3, bool2);
        }

        public int hashCode() {
            String str = this.y;
            int hashCode = str == null ? 1 : str.hashCode();
            String str2 = this.d;
            if (str2 != null) {
                hashCode ^= str2.hashCode();
            }
            int hashCode2 = this.q.hashCode() + hashCode;
            Boolean bool = this.Y1;
            if (bool != null) {
                hashCode2 ^= bool.hashCode();
            }
            Locale locale = this.x;
            if (locale != null) {
                hashCode2 += locale.hashCode();
            }
            return this.Z1.hashCode() ^ hashCode2;
        }

        public String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", new Object[]{this.d, this.q, this.Y1, this.x, this.y, this.Z1});
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Value(java.lang.String r14, com.fasterxml.jackson.annotation.JsonFormat.Shape r15, java.lang.String r16, java.lang.String r17, com.fasterxml.jackson.annotation.JsonFormat.a r18, java.lang.Boolean r19) {
            /*
                r13 = this;
                r0 = r16
                r1 = r17
                java.lang.String r2 = "##default"
                r3 = 0
                if (r0 == 0) goto L_0x001d
                int r4 = r16.length()
                if (r4 == 0) goto L_0x001d
                boolean r4 = r2.equals(r0)
                if (r4 == 0) goto L_0x0016
                goto L_0x001d
            L_0x0016:
                java.util.Locale r4 = new java.util.Locale
                r4.<init>(r0)
                r8 = r4
                goto L_0x001e
            L_0x001d:
                r8 = r3
            L_0x001e:
                if (r1 == 0) goto L_0x002f
                int r0 = r17.length()
                if (r0 == 0) goto L_0x002f
                boolean r0 = r2.equals(r1)
                if (r0 == 0) goto L_0x002d
                goto L_0x002f
            L_0x002d:
                r9 = r1
                goto L_0x0030
            L_0x002f:
                r9 = r3
            L_0x0030:
                r10 = 0
                r5 = r13
                r6 = r14
                r7 = r15
                r11 = r18
                r12 = r19
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.annotation.JsonFormat.Value.<init>(java.lang.String, com.fasterxml.jackson.annotation.JsonFormat$Shape, java.lang.String, java.lang.String, com.fasterxml.jackson.annotation.JsonFormat$a, java.lang.Boolean):void");
        }

        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, a aVar, Boolean bool) {
            this.d = str == null ? "" : str;
            this.q = shape == null ? Shape.ANY : shape;
            this.x = locale;
            this.a2 = timeZone;
            this.y = str2;
            this.Z1 = aVar == null ? a.a : aVar;
            this.Y1 = bool;
        }
    }

    public static class a {
        public static final a a = new a(0, 0);
        public final int b;
        public final int c;

        public a(int i, int i2) {
            this.b = i;
            this.c = i2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            if (aVar.b == this.b && aVar.c == this.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.c + this.b;
        }

        public String toString() {
            if (this == a) {
                return "EMPTY";
            }
            return String.format("(enabled=0x%x,disabled=0x%x)", new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
        }
    }

    OptBoolean lenient() default OptBoolean.DEFAULT;

    String locale() default "##default";

    String pattern() default "";

    Shape shape() default Shape.ANY;

    String timezone() default "##default";

    Feature[] with() default {};

    Feature[] without() default {};
}
