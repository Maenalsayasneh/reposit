package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.EnumResolver;
import i0.f.a.b.i.e;
import i0.f.a.b.m.c;
import i0.f.a.c.d;
import i0.f.a.c.h;
import i0.f.a.c.j.a;
import i0.f.a.c.t.f;
import i0.f.a.c.t.r;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

@a
public class StdKeyDeserializer extends h implements Serializable {
    public final int c;
    public final Class<?> d;
    public final FromStringDeserializer<?> q;

    public static final class DelegatingKD extends h implements Serializable {
        public final Class<?> c;
        public final d<?> d;

        public DelegatingKD(Class<?> cls, d<?> dVar) {
            this.c = cls;
            this.d = dVar;
        }

        public final Object a(String str, DeserializationContext deserializationContext) throws IOException {
            if (str == null) {
                return null;
            }
            r rVar = new r(deserializationContext.Z1, deserializationContext);
            rVar.Q0(str);
            try {
                JsonParser f1 = rVar.f1();
                f1.M0();
                Object d2 = this.d.d(f1, deserializationContext);
                if (d2 != null) {
                    return d2;
                }
                deserializationContext.X(this.c, str, "not a valid representation", new Object[0]);
                throw null;
            } catch (Exception e) {
                deserializationContext.X(this.c, str, "not a valid representation: %s", e.getMessage());
                throw null;
            }
        }
    }

    @a
    public static final class EnumKD extends StdKeyDeserializer {
        public EnumResolver Y1;
        public final Enum<?> Z1;
        public final EnumResolver x;
        public final AnnotatedMethod y;

        public EnumKD(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
            super(-1, enumResolver.c);
            this.x = enumResolver;
            this.y = annotatedMethod;
            this.Z1 = enumResolver.x;
        }

        public Object b(String str, DeserializationContext deserializationContext) throws IOException {
            EnumResolver enumResolver;
            AnnotatedMethod annotatedMethod = this.y;
            if (annotatedMethod != null) {
                try {
                    return annotatedMethod.v(str);
                } catch (Exception e) {
                    Throwable s = f.s(e);
                    String message = s.getMessage();
                    f.K(s);
                    f.I(s);
                    throw new IllegalArgumentException(message, s);
                }
            } else {
                if (deserializationContext.d0(DeserializationFeature.READ_ENUMS_USING_TO_STRING)) {
                    enumResolver = this.Y1;
                    if (enumResolver == null) {
                        synchronized (this) {
                            enumResolver = EnumResolver.d(deserializationContext.q, this.x.c);
                            this.Y1 = enumResolver;
                        }
                    }
                } else {
                    enumResolver = this.x;
                }
                Enum enumR = enumResolver.q.get(str);
                if (enumR == null && enumResolver.y) {
                    Iterator<Map.Entry<String, Enum<?>>> it = enumResolver.q.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            enumR = null;
                            break;
                        }
                        Map.Entry next = it.next();
                        if (str.equalsIgnoreCase((String) next.getKey())) {
                            enumR = (Enum) next.getValue();
                            break;
                        }
                    }
                }
                if (enumR != null) {
                    return enumR;
                }
                if (this.Z1 != null && deserializationContext.d0(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                    return this.Z1;
                }
                if (deserializationContext.d0(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                    return enumR;
                }
                deserializationContext.X(this.d, str, "not one of the values accepted for Enum class: %s", enumResolver.q.keySet());
                throw null;
            }
        }
    }

    public static final class StringCtorKeyDeserializer extends StdKeyDeserializer {
        public final Constructor<?> x;

        public StringCtorKeyDeserializer(Constructor<?> constructor) {
            super(-1, constructor.getDeclaringClass());
            this.x = constructor;
        }

        public Object b(String str, DeserializationContext deserializationContext) throws Exception {
            return this.x.newInstance(new Object[]{str});
        }
    }

    public static final class StringFactoryKeyDeserializer extends StdKeyDeserializer {
        public final Method x;

        public StringFactoryKeyDeserializer(Method method) {
            super(-1, method.getDeclaringClass());
            this.x = method;
        }

        public Object b(String str, DeserializationContext deserializationContext) throws Exception {
            return this.x.invoke((Object) null, new Object[]{str});
        }
    }

    @a
    public static final class StringKD extends StdKeyDeserializer {
        public static final StringKD x = new StringKD(String.class);
        public static final StringKD y = new StringKD(Object.class);

        public StringKD(Class<?> cls) {
            super(-1, cls);
        }

        public Object a(String str, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            return str;
        }
    }

    public StdKeyDeserializer(int i, Class<?> cls) {
        this.c = i;
        this.d = cls;
        this.q = null;
    }

    public Object a(String str, DeserializationContext deserializationContext) throws IOException {
        if (str == null) {
            return null;
        }
        try {
            Object b = b(str, deserializationContext);
            if (b != null) {
                return b;
            }
            if (f.w(this.d) && deserializationContext.q.F(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            deserializationContext.X(this.d, str, "not a valid representation", new Object[0]);
            throw null;
        } catch (Exception e) {
            deserializationContext.X(this.d, str, "not a valid representation, problem: (%s) %s", e.getClass().getName(), f.j(e));
            throw null;
        }
    }

    public Object b(String str, DeserializationContext deserializationContext) throws Exception {
        switch (this.c) {
            case 1:
                if ("true".equals(str)) {
                    return Boolean.TRUE;
                }
                if ("false".equals(str)) {
                    return Boolean.FALSE;
                }
                deserializationContext.X(this.d, str, "value not 'true' or 'false'", new Object[0]);
                throw null;
            case 2:
                int parseInt = Integer.parseInt(str);
                if (parseInt >= -128 && parseInt <= 255) {
                    return Byte.valueOf((byte) parseInt);
                }
                deserializationContext.X(this.d, str, "overflow, value cannot be represented as 8-bit value", new Object[0]);
                throw null;
            case 3:
                int parseInt2 = Integer.parseInt(str);
                if (parseInt2 >= -32768 && parseInt2 <= 32767) {
                    return Short.valueOf((short) parseInt2);
                }
                deserializationContext.X(this.d, str, "overflow, value cannot be represented as 16-bit value", new Object[0]);
                throw null;
            case 4:
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                deserializationContext.X(this.d, str, "can only convert 1-character Strings", new Object[0]);
                throw null;
            case 5:
                return Integer.valueOf(Integer.parseInt(str));
            case 6:
                return Long.valueOf(Long.parseLong(str));
            case 7:
                return Float.valueOf((float) e.c(str));
            case 8:
                return Double.valueOf(e.c(str));
            case 9:
                try {
                    return this.q.y0(str, deserializationContext);
                } catch (IllegalArgumentException e) {
                    c(deserializationContext, str, e);
                    throw null;
                }
            case 10:
                return deserializationContext.h0(str);
            case 11:
                Date h02 = deserializationContext.h0(str);
                Calendar instance = Calendar.getInstance(deserializationContext.J());
                instance.setTime(h02);
                return instance;
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e2) {
                    c(deserializationContext, str, e2);
                    throw null;
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e3) {
                    c(deserializationContext, str, e3);
                    throw null;
                }
            case 14:
                try {
                    return new URL(str);
                } catch (MalformedURLException e4) {
                    c(deserializationContext, str, e4);
                    throw null;
                }
            case 15:
                try {
                    return deserializationContext.i().n(str);
                } catch (Exception unused) {
                    deserializationContext.X(this.d, str, "unable to parse key as Class", new Object[0]);
                    throw null;
                }
            case 16:
                try {
                    return this.q.y0(str, deserializationContext);
                } catch (IllegalArgumentException e5) {
                    c(deserializationContext, str, e5);
                    throw null;
                }
            case 17:
                try {
                    Base64Variant base64Variant = deserializationContext.q.d.e2;
                    Objects.requireNonNull(base64Variant);
                    c cVar = new c();
                    base64Variant.d(str, cVar);
                    return cVar.k();
                } catch (IllegalArgumentException e6) {
                    c(deserializationContext, str, e6);
                    throw null;
                }
            default:
                StringBuilder P0 = i0.d.a.a.a.P0("Internal error: unknown key type ");
                P0.append(this.d);
                throw new IllegalStateException(P0.toString());
        }
    }

    public Object c(DeserializationContext deserializationContext, String str, Exception exc) throws IOException {
        deserializationContext.X(this.d, str, "problem: %s", f.j(exc));
        throw null;
    }

    public StdKeyDeserializer(int i, Class<?> cls, FromStringDeserializer<?> fromStringDeserializer) {
        this.c = i;
        this.d = cls;
        this.q = fromStringDeserializer;
    }
}
