package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.type.LogicalType;
import i0.d.a.a.a;
import i0.f.a.b.m.k;
import i0.f.a.c.t.f;
import j$.util.DesugarTimeZone;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

public abstract class FromStringDeserializer<T> extends StdScalarDeserializer<T> {
    public static final /* synthetic */ int x = 0;

    public static class Std extends FromStringDeserializer<Object> {
        public final int y;

        public Std(Class<?> cls, int i) {
            super(cls);
            this.y = i;
        }

        public Object A0(DeserializationContext deserializationContext) throws IOException {
            return k(deserializationContext);
        }

        public int C0(String str) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '_' || charAt == '-') {
                    return i;
                }
            }
            return -1;
        }

        public Object k(DeserializationContext deserializationContext) throws JsonMappingException {
            int i = this.y;
            if (i == 3) {
                return URI.create("");
            }
            if (i != 8) {
                return null;
            }
            return Locale.ROOT;
        }

        public Object y0(String str, DeserializationContext deserializationContext) throws IOException {
            switch (this.y) {
                case 1:
                    return new File(str);
                case 2:
                    return new URL(str);
                case 3:
                    return URI.create(str);
                case 4:
                    try {
                        return deserializationContext.i().n(str);
                    } catch (Exception e) {
                        deserializationContext.N(this.d, str, f.s(e));
                        throw null;
                    }
                case 5:
                    return deserializationContext.i().h(str);
                case 6:
                    return Currency.getInstance(str);
                case 7:
                    return Pattern.compile(str);
                case 8:
                    int C0 = C0(str);
                    if (C0 < 0) {
                        return new Locale(str);
                    }
                    String substring = str.substring(0, C0);
                    String substring2 = str.substring(C0 + 1);
                    int C02 = C0(substring2);
                    if (C02 < 0) {
                        return new Locale(substring, substring2);
                    }
                    return new Locale(substring, substring2.substring(0, C02), substring2.substring(C02 + 1));
                case 9:
                    return Charset.forName(str);
                case 10:
                    return DesugarTimeZone.getTimeZone(str);
                case 11:
                    return InetAddress.getByName(str);
                case 12:
                    if (str.startsWith("[")) {
                        int lastIndexOf = str.lastIndexOf(93);
                        if (lastIndexOf != -1) {
                            int indexOf = str.indexOf(58, lastIndexOf);
                            return new InetSocketAddress(str.substring(0, lastIndexOf + 1), indexOf > -1 ? Integer.parseInt(str.substring(indexOf + 1)) : 0);
                        }
                        throw new InvalidFormatException(deserializationContext.Z1, "Bracketed IPv6 address must contain closing bracket", str, InetSocketAddress.class);
                    }
                    int indexOf2 = str.indexOf(58);
                    if (indexOf2 >= 0) {
                        int i = indexOf2 + 1;
                        if (str.indexOf(58, i) < 0) {
                            return new InetSocketAddress(str.substring(0, indexOf2), Integer.parseInt(str.substring(i)));
                        }
                    }
                    return new InetSocketAddress(str, 0);
                default:
                    k.a();
                    throw null;
            }
        }
    }

    public static class StringBuilderDeserializer extends FromStringDeserializer<Object> {
        public StringBuilderDeserializer() {
            super(StringBuilder.class);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String r02 = jsonParser.r0();
            if (r02 != null) {
                return new StringBuilder(r02);
            }
            return FromStringDeserializer.super.d(jsonParser, deserializationContext);
        }

        public Object k(DeserializationContext deserializationContext) throws JsonMappingException {
            return new StringBuilder();
        }

        public LogicalType q() {
            return LogicalType.Textual;
        }

        public Object y0(String str, DeserializationContext deserializationContext) throws IOException {
            return new StringBuilder(str);
        }
    }

    public FromStringDeserializer(Class<?> cls) {
        super(cls);
    }

    public static FromStringDeserializer<?> B0(Class<?> cls) {
        int i;
        if (cls == File.class) {
            i = 1;
        } else if (cls == URL.class) {
            i = 2;
        } else if (cls == URI.class) {
            i = 3;
        } else if (cls == Class.class) {
            i = 4;
        } else if (cls == JavaType.class) {
            i = 5;
        } else if (cls == Currency.class) {
            i = 6;
        } else if (cls == Pattern.class) {
            i = 7;
        } else if (cls == Locale.class) {
            i = 8;
        } else if (cls == Charset.class) {
            i = 9;
        } else if (cls == TimeZone.class) {
            i = 10;
        } else if (cls == InetAddress.class) {
            i = 11;
        } else if (cls == InetSocketAddress.class) {
            i = 12;
        } else if (cls == StringBuilder.class) {
            return new StringBuilderDeserializer();
        } else {
            return null;
        }
        return new Std(cls, i);
    }

    public Object A0(DeserializationContext deserializationContext) throws IOException {
        return null;
    }

    public T d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String r02 = jsonParser.r0();
        if (r02 == null) {
            JsonToken i = jsonParser.i();
            if (i == JsonToken.START_OBJECT) {
                deserializationContext.V(this.d, jsonParser);
                throw null;
            } else if (i == JsonToken.START_ARRAY) {
                return I(jsonParser, deserializationContext);
            } else {
                if (i == JsonToken.VALUE_EMBEDDED_OBJECT) {
                    T G = jsonParser.G();
                    if (G == null) {
                        return null;
                    }
                    if (this.d.isAssignableFrom(G.getClass())) {
                        return G;
                    }
                    return z0(G, deserializationContext);
                }
                deserializationContext.V(this.d, jsonParser);
                throw null;
            }
        } else {
            if (!r02.isEmpty()) {
                String trim = r02.trim();
                if (!trim.isEmpty()) {
                    try {
                        return y0(trim, deserializationContext);
                    } catch (IllegalArgumentException | MalformedURLException e) {
                        String str = "not a valid textual representation";
                        String message = e.getMessage();
                        if (message != null) {
                            str = a.o0(str, ", problem: ", message);
                        }
                        JsonMappingException t02 = deserializationContext.t0(trim, this.d, str);
                        t02.initCause(e);
                        throw t02;
                    }
                }
            }
            CoercionAction w = deserializationContext.w(q(), this.d, CoercionInputShape.EmptyString);
            if (w == CoercionAction.Fail) {
                deserializationContext.m0(this, "Cannot coerce empty String (\"\") to %s (but could if enabling coercion using `CoercionConfig`)", H());
                throw null;
            } else if (w == CoercionAction.AsNull) {
                return null;
            } else {
                if (w == CoercionAction.AsEmpty) {
                    return k(deserializationContext);
                }
                return A0(deserializationContext);
            }
        }
    }

    public LogicalType q() {
        return LogicalType.OtherScalar;
    }

    public abstract T y0(String str, DeserializationContext deserializationContext) throws IOException;

    public T z0(Object obj, DeserializationContext deserializationContext) throws IOException {
        deserializationContext.m0(this, "Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this.d.getName());
        throw null;
    }
}
