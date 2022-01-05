package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import i0.f.a.c.d;
import i0.f.a.c.j.a;
import i0.f.a.c.l.c;
import i0.f.a.c.l.i;
import i0.f.a.c.t.b;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public abstract class PrimitiveArrayDeserializers<T> extends StdDeserializer<T> implements c {
    public static final /* synthetic */ int x = 0;
    public transient Object Y1;
    public final i Z1;
    public final Boolean y;

    @a
    public static final class BooleanDeser extends PrimitiveArrayDeserializers<boolean[]> {
        public BooleanDeser() {
            super(boolean[].class);
        }

        public Object B0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new boolean[]{a0(jsonParser, deserializationContext)};
        }

        public PrimitiveArrayDeserializers<?> C0(i iVar, Boolean bool) {
            return new BooleanDeser(this, iVar, bool);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            boolean z;
            if (!jsonParser.F0()) {
                return (boolean[]) A0(jsonParser, deserializationContext);
            }
            b H = deserializationContext.H();
            if (H.a == null) {
                H.a = new b.C0123b();
            }
            b.C0123b bVar = H.a;
            boolean[] zArr = (boolean[]) bVar.d();
            int i = 0;
            while (true) {
                try {
                    JsonToken M0 = jsonParser.M0();
                    if (M0 == JsonToken.END_ARRAY) {
                        return (boolean[]) bVar.c(zArr, i);
                    }
                    if (M0 == JsonToken.VALUE_TRUE) {
                        z = true;
                    } else {
                        if (M0 != JsonToken.VALUE_FALSE) {
                            if (M0 == JsonToken.VALUE_NULL) {
                                i iVar = this.Z1;
                                if (iVar != null) {
                                    iVar.b(deserializationContext);
                                } else {
                                    p0(deserializationContext);
                                }
                            } else {
                                z = a0(jsonParser, deserializationContext);
                            }
                        }
                        z = false;
                    }
                    if (i >= zArr.length) {
                        boolean[] zArr2 = (boolean[]) bVar.b(zArr, i);
                        i = 0;
                        zArr = zArr2;
                    }
                    int i2 = i + 1;
                    try {
                        zArr[i] = z;
                        i = i2;
                    } catch (Exception e) {
                        e = e;
                        i = i2;
                        throw JsonMappingException.i(e, zArr, bVar.d + i);
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw JsonMappingException.i(e, zArr, bVar.d + i);
                }
            }
        }

        public Object y0(Object obj, Object obj2) {
            boolean[] zArr = (boolean[]) obj;
            boolean[] zArr2 = (boolean[]) obj2;
            int length = zArr.length;
            int length2 = zArr2.length;
            boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
            System.arraycopy(zArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public Object z0() {
            return new boolean[0];
        }

        public BooleanDeser(BooleanDeser booleanDeser, i iVar, Boolean bool) {
            super(booleanDeser, iVar, bool);
        }
    }

    @a
    public static final class ByteDeser extends PrimitiveArrayDeserializers<byte[]> {
        public ByteDeser() {
            super(byte[].class);
        }

        public Object B0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonToken i = jsonParser.i();
            if (i == JsonToken.VALUE_NUMBER_INT) {
                return new byte[]{jsonParser.q()};
            } else if (i == JsonToken.VALUE_NULL) {
                i iVar = this.Z1;
                if (iVar != null) {
                    iVar.b(deserializationContext);
                    Object obj = this.Y1;
                    if (obj == null) {
                        obj = new byte[0];
                        this.Y1 = obj;
                    }
                    return (byte[]) obj;
                }
                p0(deserializationContext);
                return null;
            } else {
                deserializationContext.V(this.d.getComponentType(), jsonParser);
                throw null;
            }
        }

        public PrimitiveArrayDeserializers<?> C0(i iVar, Boolean bool) {
            return new ByteDeser(this, iVar, bool);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            byte b;
            JsonToken i = jsonParser.i();
            if (i == JsonToken.VALUE_STRING) {
                try {
                    return jsonParser.n(deserializationContext.I());
                } catch (JsonParseException e) {
                    String b2 = e.b();
                    if (b2.contains("base64")) {
                        deserializationContext.Z(byte[].class, jsonParser.Z(), b2, new Object[0]);
                        throw null;
                    }
                }
            }
            if (i == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object G = jsonParser.G();
                if (G == null) {
                    return null;
                }
                if (G instanceof byte[]) {
                    return (byte[]) G;
                }
            }
            if (!jsonParser.F0()) {
                return (byte[]) A0(jsonParser, deserializationContext);
            }
            b H = deserializationContext.H();
            if (H.b == null) {
                H.b = new b.c();
            }
            b.c cVar = H.b;
            byte[] bArr = (byte[]) cVar.d();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken M0 = jsonParser.M0();
                    if (M0 == JsonToken.END_ARRAY) {
                        return (byte[]) cVar.c(bArr, i2);
                    }
                    if (M0 == JsonToken.VALUE_NUMBER_INT) {
                        b = jsonParser.q();
                    } else if (M0 == JsonToken.VALUE_NULL) {
                        i iVar = this.Z1;
                        if (iVar != null) {
                            iVar.b(deserializationContext);
                        } else {
                            p0(deserializationContext);
                            b = 0;
                        }
                    } else {
                        b = b0(jsonParser, deserializationContext);
                    }
                    if (i2 >= bArr.length) {
                        byte[] bArr2 = (byte[]) cVar.b(bArr, i2);
                        i2 = 0;
                        bArr = bArr2;
                    }
                    int i3 = i2 + 1;
                    try {
                        bArr[i2] = b;
                        i2 = i3;
                    } catch (Exception e2) {
                        e = e2;
                        i2 = i3;
                        throw JsonMappingException.i(e, bArr, cVar.d + i2);
                    }
                } catch (Exception e3) {
                    e = e3;
                    throw JsonMappingException.i(e, bArr, cVar.d + i2);
                }
            }
        }

        public LogicalType q() {
            return LogicalType.Binary;
        }

        public Object y0(Object obj, Object obj2) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = (byte[]) obj2;
            int length = bArr.length;
            int length2 = bArr2.length;
            byte[] copyOf = Arrays.copyOf(bArr, length + length2);
            System.arraycopy(bArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public Object z0() {
            return new byte[0];
        }

        public ByteDeser(ByteDeser byteDeser, i iVar, Boolean bool) {
            super(byteDeser, iVar, bool);
        }
    }

    @a
    public static final class CharDeser extends PrimitiveArrayDeserializers<char[]> {
        public CharDeser() {
            super(char[].class);
        }

        public Object B0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            deserializationContext.V(this.d, jsonParser);
            throw null;
        }

        public PrimitiveArrayDeserializers<?> C0(i iVar, Boolean bool) {
            return this;
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            String str;
            if (jsonParser.y0(JsonToken.VALUE_STRING)) {
                char[] b0 = jsonParser.b0();
                int d0 = jsonParser.d0();
                int c0 = jsonParser.c0();
                char[] cArr = new char[c0];
                System.arraycopy(b0, d0, cArr, 0, c0);
                return cArr;
            } else if (jsonParser.F0()) {
                StringBuilder sb = new StringBuilder(64);
                while (true) {
                    JsonToken M0 = jsonParser.M0();
                    if (M0 == JsonToken.END_ARRAY) {
                        return sb.toString().toCharArray();
                    }
                    if (M0 == JsonToken.VALUE_STRING) {
                        str = jsonParser.Z();
                    } else if (M0 == JsonToken.VALUE_NULL) {
                        i iVar = this.Z1;
                        if (iVar != null) {
                            iVar.b(deserializationContext);
                        } else {
                            p0(deserializationContext);
                            str = "\u0000";
                        }
                    } else {
                        deserializationContext.V(Character.TYPE, jsonParser);
                        throw null;
                    }
                    if (str.length() == 1) {
                        sb.append(str.charAt(0));
                    } else {
                        deserializationContext.m0(this, "Cannot convert a JSON String of length %d into a char element of char array", Integer.valueOf(str.length()));
                        throw null;
                    }
                }
            } else {
                if (jsonParser.y0(JsonToken.VALUE_EMBEDDED_OBJECT)) {
                    Object G = jsonParser.G();
                    if (G == null) {
                        return null;
                    }
                    if (G instanceof char[]) {
                        return (char[]) G;
                    }
                    if (G instanceof String) {
                        return ((String) G).toCharArray();
                    }
                    if (G instanceof byte[]) {
                        return i0.f.a.b.a.b.g((byte[]) G, false).toCharArray();
                    }
                }
                deserializationContext.V(this.d, jsonParser);
                throw null;
            }
        }

        public Object y0(Object obj, Object obj2) {
            char[] cArr = (char[]) obj;
            char[] cArr2 = (char[]) obj2;
            int length = cArr.length;
            int length2 = cArr2.length;
            char[] copyOf = Arrays.copyOf(cArr, length + length2);
            System.arraycopy(cArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public Object z0() {
            return new char[0];
        }
    }

    @a
    public static final class DoubleDeser extends PrimitiveArrayDeserializers<double[]> {
        public DoubleDeser() {
            super(double[].class);
        }

        public Object B0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new double[]{d0(jsonParser, deserializationContext)};
        }

        public PrimitiveArrayDeserializers<?> C0(i iVar, Boolean bool) {
            return new DoubleDeser(this, iVar, bool);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            i iVar;
            if (!jsonParser.F0()) {
                return (double[]) A0(jsonParser, deserializationContext);
            }
            b H = deserializationContext.H();
            if (H.g == null) {
                H.g = new b.d();
            }
            b.d dVar = H.g;
            double[] dArr = (double[]) dVar.d();
            int i = 0;
            while (true) {
                try {
                    JsonToken M0 = jsonParser.M0();
                    if (M0 == JsonToken.END_ARRAY) {
                        return (double[]) dVar.c(dArr, i);
                    }
                    if (M0 != JsonToken.VALUE_NULL || (iVar = this.Z1) == null) {
                        double d0 = d0(jsonParser, deserializationContext);
                        if (i >= dArr.length) {
                            double[] dArr2 = (double[]) dVar.b(dArr, i);
                            i = 0;
                            dArr = dArr2;
                        }
                        int i2 = i + 1;
                        try {
                            dArr[i] = d0;
                            i = i2;
                        } catch (Exception e) {
                            e = e;
                            i = i2;
                            throw JsonMappingException.i(e, dArr, dVar.d + i);
                        }
                    } else {
                        iVar.b(deserializationContext);
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw JsonMappingException.i(e, dArr, dVar.d + i);
                }
            }
        }

        public Object y0(Object obj, Object obj2) {
            double[] dArr = (double[]) obj;
            double[] dArr2 = (double[]) obj2;
            int length = dArr.length;
            int length2 = dArr2.length;
            double[] copyOf = Arrays.copyOf(dArr, length + length2);
            System.arraycopy(dArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public Object z0() {
            return new double[0];
        }

        public DoubleDeser(DoubleDeser doubleDeser, i iVar, Boolean bool) {
            super(doubleDeser, iVar, bool);
        }
    }

    @a
    public static final class FloatDeser extends PrimitiveArrayDeserializers<float[]> {
        public FloatDeser() {
            super(float[].class);
        }

        public Object B0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new float[]{e0(jsonParser, deserializationContext)};
        }

        public PrimitiveArrayDeserializers<?> C0(i iVar, Boolean bool) {
            return new FloatDeser(this, iVar, bool);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            i iVar;
            if (!jsonParser.F0()) {
                return (float[]) A0(jsonParser, deserializationContext);
            }
            b H = deserializationContext.H();
            if (H.f == null) {
                H.f = new b.e();
            }
            b.e eVar = H.f;
            float[] fArr = (float[]) eVar.d();
            int i = 0;
            while (true) {
                try {
                    JsonToken M0 = jsonParser.M0();
                    if (M0 == JsonToken.END_ARRAY) {
                        return (float[]) eVar.c(fArr, i);
                    }
                    if (M0 != JsonToken.VALUE_NULL || (iVar = this.Z1) == null) {
                        float e0 = e0(jsonParser, deserializationContext);
                        if (i >= fArr.length) {
                            float[] fArr2 = (float[]) eVar.b(fArr, i);
                            i = 0;
                            fArr = fArr2;
                        }
                        int i2 = i + 1;
                        try {
                            fArr[i] = e0;
                            i = i2;
                        } catch (Exception e) {
                            e = e;
                            i = i2;
                            throw JsonMappingException.i(e, fArr, eVar.d + i);
                        }
                    } else {
                        iVar.b(deserializationContext);
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw JsonMappingException.i(e, fArr, eVar.d + i);
                }
            }
        }

        public Object y0(Object obj, Object obj2) {
            float[] fArr = (float[]) obj;
            float[] fArr2 = (float[]) obj2;
            int length = fArr.length;
            int length2 = fArr2.length;
            float[] copyOf = Arrays.copyOf(fArr, length + length2);
            System.arraycopy(fArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public Object z0() {
            return new float[0];
        }

        public FloatDeser(FloatDeser floatDeser, i iVar, Boolean bool) {
            super(floatDeser, iVar, bool);
        }
    }

    @a
    public static final class IntDeser extends PrimitiveArrayDeserializers<int[]> {
        public static final IntDeser a2 = new IntDeser();

        public IntDeser() {
            super(int[].class);
        }

        public Object B0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new int[]{f0(jsonParser, deserializationContext)};
        }

        public PrimitiveArrayDeserializers<?> C0(i iVar, Boolean bool) {
            return new IntDeser(this, iVar, bool);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            int i;
            if (!jsonParser.F0()) {
                return (int[]) A0(jsonParser, deserializationContext);
            }
            b H = deserializationContext.H();
            if (H.d == null) {
                H.d = new b.f();
            }
            b.f fVar = H.d;
            int[] iArr = (int[]) fVar.d();
            int i2 = 0;
            while (true) {
                try {
                    JsonToken M0 = jsonParser.M0();
                    if (M0 == JsonToken.END_ARRAY) {
                        return (int[]) fVar.c(iArr, i2);
                    }
                    if (M0 == JsonToken.VALUE_NUMBER_INT) {
                        i = jsonParser.I();
                    } else if (M0 == JsonToken.VALUE_NULL) {
                        i iVar = this.Z1;
                        if (iVar != null) {
                            iVar.b(deserializationContext);
                        } else {
                            p0(deserializationContext);
                            i = 0;
                        }
                    } else {
                        i = f0(jsonParser, deserializationContext);
                    }
                    if (i2 >= iArr.length) {
                        int[] iArr2 = (int[]) fVar.b(iArr, i2);
                        i2 = 0;
                        iArr = iArr2;
                    }
                    int i3 = i2 + 1;
                    try {
                        iArr[i2] = i;
                        i2 = i3;
                    } catch (Exception e) {
                        e = e;
                        i2 = i3;
                        throw JsonMappingException.i(e, iArr, fVar.d + i2);
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw JsonMappingException.i(e, iArr, fVar.d + i2);
                }
            }
        }

        public Object y0(Object obj, Object obj2) {
            int[] iArr = (int[]) obj;
            int[] iArr2 = (int[]) obj2;
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] copyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(iArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public Object z0() {
            return new int[0];
        }

        public IntDeser(IntDeser intDeser, i iVar, Boolean bool) {
            super(intDeser, iVar, bool);
        }
    }

    @a
    public static final class LongDeser extends PrimitiveArrayDeserializers<long[]> {
        public static final LongDeser a2 = new LongDeser();

        public LongDeser() {
            super(long[].class);
        }

        public Object B0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new long[]{j0(jsonParser, deserializationContext)};
        }

        public PrimitiveArrayDeserializers<?> C0(i iVar, Boolean bool) {
            return new LongDeser(this, iVar, bool);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            long j;
            if (!jsonParser.F0()) {
                return (long[]) A0(jsonParser, deserializationContext);
            }
            b H = deserializationContext.H();
            if (H.e == null) {
                H.e = new b.g();
            }
            b.g gVar = H.e;
            long[] jArr = (long[]) gVar.d();
            int i = 0;
            while (true) {
                try {
                    JsonToken M0 = jsonParser.M0();
                    if (M0 == JsonToken.END_ARRAY) {
                        return (long[]) gVar.c(jArr, i);
                    }
                    if (M0 == JsonToken.VALUE_NUMBER_INT) {
                        j = jsonParser.J();
                    } else if (M0 == JsonToken.VALUE_NULL) {
                        i iVar = this.Z1;
                        if (iVar != null) {
                            iVar.b(deserializationContext);
                        } else {
                            p0(deserializationContext);
                            j = 0;
                        }
                    } else {
                        j = j0(jsonParser, deserializationContext);
                    }
                    if (i >= jArr.length) {
                        long[] jArr2 = (long[]) gVar.b(jArr, i);
                        i = 0;
                        jArr = jArr2;
                    }
                    int i2 = i + 1;
                    try {
                        jArr[i] = j;
                        i = i2;
                    } catch (Exception e) {
                        e = e;
                        i = i2;
                        throw JsonMappingException.i(e, jArr, gVar.d + i);
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw JsonMappingException.i(e, jArr, gVar.d + i);
                }
            }
        }

        public Object y0(Object obj, Object obj2) {
            long[] jArr = (long[]) obj;
            long[] jArr2 = (long[]) obj2;
            int length = jArr.length;
            int length2 = jArr2.length;
            long[] copyOf = Arrays.copyOf(jArr, length + length2);
            System.arraycopy(jArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public Object z0() {
            return new long[0];
        }

        public LongDeser(LongDeser longDeser, i iVar, Boolean bool) {
            super(longDeser, iVar, bool);
        }
    }

    @a
    public static final class ShortDeser extends PrimitiveArrayDeserializers<short[]> {
        public ShortDeser() {
            super(short[].class);
        }

        public Object B0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new short[]{l0(jsonParser, deserializationContext)};
        }

        public PrimitiveArrayDeserializers<?> C0(i iVar, Boolean bool) {
            return new ShortDeser(this, iVar, bool);
        }

        public Object d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            short s;
            if (!jsonParser.F0()) {
                return (short[]) A0(jsonParser, deserializationContext);
            }
            b H = deserializationContext.H();
            if (H.c == null) {
                H.c = new b.h();
            }
            b.h hVar = H.c;
            short[] sArr = (short[]) hVar.d();
            int i = 0;
            while (true) {
                try {
                    JsonToken M0 = jsonParser.M0();
                    if (M0 == JsonToken.END_ARRAY) {
                        return (short[]) hVar.c(sArr, i);
                    }
                    if (M0 == JsonToken.VALUE_NULL) {
                        i iVar = this.Z1;
                        if (iVar != null) {
                            iVar.b(deserializationContext);
                        } else {
                            p0(deserializationContext);
                            s = 0;
                        }
                    } else {
                        s = l0(jsonParser, deserializationContext);
                    }
                    if (i >= sArr.length) {
                        short[] sArr2 = (short[]) hVar.b(sArr, i);
                        i = 0;
                        sArr = sArr2;
                    }
                    int i2 = i + 1;
                    try {
                        sArr[i] = s;
                        i = i2;
                    } catch (Exception e) {
                        e = e;
                        i = i2;
                        throw JsonMappingException.i(e, sArr, hVar.d + i);
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw JsonMappingException.i(e, sArr, hVar.d + i);
                }
            }
        }

        public Object y0(Object obj, Object obj2) {
            short[] sArr = (short[]) obj;
            short[] sArr2 = (short[]) obj2;
            int length = sArr.length;
            int length2 = sArr2.length;
            short[] copyOf = Arrays.copyOf(sArr, length + length2);
            System.arraycopy(sArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        public Object z0() {
            return new short[0];
        }

        public ShortDeser(ShortDeser shortDeser, i iVar, Boolean bool) {
            super(shortDeser, iVar, bool);
        }
    }

    public PrimitiveArrayDeserializers(Class<T> cls) {
        super((Class<?>) cls);
        this.y = null;
        this.Z1 = null;
    }

    public T A0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.y0(JsonToken.VALUE_STRING)) {
            return M(jsonParser, deserializationContext);
        }
        Boolean bool = this.y;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.d0(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return B0(jsonParser, deserializationContext);
        }
        deserializationContext.V(this.d, jsonParser);
        throw null;
    }

    public abstract T B0(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract PrimitiveArrayDeserializers<?> C0(i iVar, Boolean bool);

    public d<?> a(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        Class<?> cls = this.d;
        JsonFormat.Feature feature = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY;
        JsonFormat.Value t02 = t0(deserializationContext, beanProperty, cls);
        i iVar = null;
        Boolean b = t02 != null ? t02.b(feature) : null;
        Nulls nulls = beanProperty != null ? beanProperty.f().c2 : null;
        if (nulls == Nulls.SKIP) {
            iVar = NullsConstantProvider.c;
        } else if (nulls == Nulls.FAIL) {
            if (beanProperty == null) {
                iVar = NullsFailProvider.a(deserializationContext.q(this.d.getComponentType()));
            } else {
                iVar = new NullsFailProvider(beanProperty.b(), beanProperty.getType().l());
            }
        }
        if (!Objects.equals(b, this.y) || iVar != this.Z1) {
            return C0(iVar, b);
        }
        return this;
    }

    public T e(JsonParser jsonParser, DeserializationContext deserializationContext, T t) throws IOException {
        T d = d(jsonParser, deserializationContext);
        if (t == null || Array.getLength(t) == 0) {
            return d;
        }
        return y0(t, d);
    }

    public Object f(JsonParser jsonParser, DeserializationContext deserializationContext, i0.f.a.c.p.b bVar) throws IOException {
        return bVar.c(jsonParser, deserializationContext);
    }

    public AccessPattern i() {
        return AccessPattern.CONSTANT;
    }

    public Object k(DeserializationContext deserializationContext) throws JsonMappingException {
        Object obj = this.Y1;
        if (obj != null) {
            return obj;
        }
        Object z0 = z0();
        this.Y1 = z0;
        return z0;
    }

    public LogicalType q() {
        return LogicalType.Array;
    }

    public Boolean v(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    public abstract T y0(T t, T t2);

    public abstract T z0();

    public PrimitiveArrayDeserializers(PrimitiveArrayDeserializers<?> primitiveArrayDeserializers, i iVar, Boolean bool) {
        super(primitiveArrayDeserializers.d);
        this.y = bool;
        this.Z1 = iVar;
    }
}
