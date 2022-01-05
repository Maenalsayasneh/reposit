package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.c.g;
import i0.f.a.c.i;
import i0.f.a.c.j.a;
import i0.f.a.c.p.e;
import java.io.IOException;
import java.util.HashMap;

public class StdArraySerializers {
    public static final HashMap<String, g<?>> a;

    @a
    public static class BooleanArraySerializer extends ArraySerializerBase<boolean[]> {
        static {
            TypeFactory.d.q(Boolean.class);
        }

        public BooleanArraySerializer() {
            super(boolean[].class);
        }

        public boolean d(i iVar, Object obj) {
            return ((boolean[]) obj).length == 0;
        }

        public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            boolean[] zArr = (boolean[]) obj;
            int length = zArr.length;
            if (length != 1 || !w(iVar)) {
                jsonGenerator.L0(zArr, length);
                z(zArr, jsonGenerator);
                jsonGenerator.T();
                return;
            }
            z(zArr, jsonGenerator);
        }

        public ContainerSerializer<?> v(e eVar) {
            return this;
        }

        public g<?> x(BeanProperty beanProperty, Boolean bool) {
            return new BooleanArraySerializer(this, beanProperty, bool);
        }

        public /* bridge */ /* synthetic */ void y(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            z((boolean[]) obj, jsonGenerator);
        }

        public void z(boolean[] zArr, JsonGenerator jsonGenerator) throws IOException {
            for (boolean O : zArr) {
                jsonGenerator.O(O);
            }
        }

        public BooleanArraySerializer(BooleanArraySerializer booleanArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(booleanArraySerializer, beanProperty, bool);
        }
    }

    @a
    public static class CharArraySerializer extends StdSerializer<char[]> {
        public CharArraySerializer() {
            super(char[].class);
        }

        public boolean d(i iVar, Object obj) {
            return ((char[]) obj).length == 0;
        }

        public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            char[] cArr = (char[]) obj;
            if (iVar.Y(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                jsonGenerator.L0(cArr, cArr.length);
                int length = cArr.length;
                for (int i = 0; i < length; i++) {
                    jsonGenerator.R0(cArr, i, 1);
                }
                jsonGenerator.T();
                return;
            }
            jsonGenerator.R0(cArr, 0, cArr.length);
        }

        public void g(Object obj, JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException {
            WritableTypeId writableTypeId;
            char[] cArr = (char[]) obj;
            if (iVar.Y(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                writableTypeId = eVar.e(jsonGenerator, eVar.d(cArr, JsonToken.START_ARRAY));
                int length = cArr.length;
                for (int i = 0; i < length; i++) {
                    jsonGenerator.R0(cArr, i, 1);
                }
            } else {
                writableTypeId = eVar.e(jsonGenerator, eVar.d(cArr, JsonToken.VALUE_STRING));
                jsonGenerator.R0(cArr, 0, cArr.length);
            }
            eVar.f(jsonGenerator, writableTypeId);
        }
    }

    @a
    public static class DoubleArraySerializer extends ArraySerializerBase<double[]> {
        static {
            TypeFactory.d.q(Double.TYPE);
        }

        public DoubleArraySerializer() {
            super(double[].class);
        }

        public boolean d(i iVar, Object obj) {
            return ((double[]) obj).length == 0;
        }

        public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            double[] dArr = (double[]) obj;
            if (dArr.length != 1 || !w(iVar)) {
                jsonGenerator.F(dArr, 0, dArr.length);
                return;
            }
            for (double d0 : dArr) {
                jsonGenerator.d0(d0);
            }
        }

        public ContainerSerializer<?> v(e eVar) {
            return this;
        }

        public g<?> x(BeanProperty beanProperty, Boolean bool) {
            return new DoubleArraySerializer(this, beanProperty, bool);
        }

        public void y(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            for (double d0 : (double[]) obj) {
                jsonGenerator.d0(d0);
            }
        }

        public DoubleArraySerializer(DoubleArraySerializer doubleArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(doubleArraySerializer, beanProperty, bool);
        }
    }

    @a
    public static class FloatArraySerializer extends TypedPrimitiveArraySerializer<float[]> {
        static {
            TypeFactory.d.q(Float.TYPE);
        }

        public FloatArraySerializer() {
            super(float[].class);
        }

        public boolean d(i iVar, Object obj) {
            return ((float[]) obj).length == 0;
        }

        public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            float[] fArr = (float[]) obj;
            int length = fArr.length;
            if (length != 1 || !w(iVar)) {
                jsonGenerator.L0(fArr, length);
                z(fArr, jsonGenerator);
                jsonGenerator.T();
                return;
            }
            z(fArr, jsonGenerator);
        }

        public g<?> x(BeanProperty beanProperty, Boolean bool) {
            return new FloatArraySerializer(this, beanProperty, bool);
        }

        public /* bridge */ /* synthetic */ void y(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            z((float[]) obj, jsonGenerator);
        }

        public void z(float[] fArr, JsonGenerator jsonGenerator) throws IOException {
            for (float f0 : fArr) {
                jsonGenerator.f0(f0);
            }
        }

        public FloatArraySerializer(FloatArraySerializer floatArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(floatArraySerializer, beanProperty, bool);
        }
    }

    @a
    public static class IntArraySerializer extends ArraySerializerBase<int[]> {
        static {
            TypeFactory.d.q(Integer.TYPE);
        }

        public IntArraySerializer() {
            super(int[].class);
        }

        public boolean d(i iVar, Object obj) {
            return ((int[]) obj).length == 0;
        }

        public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            int[] iArr = (int[]) obj;
            if (iArr.length != 1 || !w(iVar)) {
                jsonGenerator.G(iArr, 0, iArr.length);
                return;
            }
            for (int g02 : iArr) {
                jsonGenerator.g0(g02);
            }
        }

        public ContainerSerializer<?> v(e eVar) {
            return this;
        }

        public g<?> x(BeanProperty beanProperty, Boolean bool) {
            return new IntArraySerializer(this, beanProperty, bool);
        }

        public void y(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            for (int g02 : (int[]) obj) {
                jsonGenerator.g0(g02);
            }
        }

        public IntArraySerializer(IntArraySerializer intArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(intArraySerializer, beanProperty, bool);
        }
    }

    @a
    public static class LongArraySerializer extends TypedPrimitiveArraySerializer<long[]> {
        static {
            TypeFactory.d.q(Long.TYPE);
        }

        public LongArraySerializer() {
            super(long[].class);
        }

        public boolean d(i iVar, Object obj) {
            return ((long[]) obj).length == 0;
        }

        public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            long[] jArr = (long[]) obj;
            if (jArr.length != 1 || !w(iVar)) {
                jsonGenerator.H(jArr, 0, jArr.length);
                return;
            }
            for (long i02 : jArr) {
                jsonGenerator.i0(i02);
            }
        }

        public g<?> x(BeanProperty beanProperty, Boolean bool) {
            return new LongArraySerializer(this, beanProperty, bool);
        }

        public void y(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            for (long i02 : (long[]) obj) {
                jsonGenerator.i0(i02);
            }
        }

        public LongArraySerializer(LongArraySerializer longArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(longArraySerializer, beanProperty, bool);
        }
    }

    @a
    public static class ShortArraySerializer extends TypedPrimitiveArraySerializer<short[]> {
        static {
            TypeFactory.d.q(Short.TYPE);
        }

        public ShortArraySerializer() {
            super(short[].class);
        }

        public boolean d(i iVar, Object obj) {
            return ((short[]) obj).length == 0;
        }

        public void f(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            short[] sArr = (short[]) obj;
            int length = sArr.length;
            if (length != 1 || !w(iVar)) {
                jsonGenerator.L0(sArr, length);
                z(sArr, jsonGenerator);
                jsonGenerator.T();
                return;
            }
            z(sArr, jsonGenerator);
        }

        public g<?> x(BeanProperty beanProperty, Boolean bool) {
            return new ShortArraySerializer(this, beanProperty, bool);
        }

        public /* bridge */ /* synthetic */ void y(Object obj, JsonGenerator jsonGenerator, i iVar) throws IOException {
            z((short[]) obj, jsonGenerator);
        }

        public void z(short[] sArr, JsonGenerator jsonGenerator) throws IOException {
            for (short g02 : sArr) {
                jsonGenerator.g0(g02);
            }
        }

        public ShortArraySerializer(ShortArraySerializer shortArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(shortArraySerializer, beanProperty, bool);
        }
    }

    public static abstract class TypedPrimitiveArraySerializer<T> extends ArraySerializerBase<T> {
        public TypedPrimitiveArraySerializer(Class<T> cls) {
            super(cls);
        }

        public final ContainerSerializer<?> v(e eVar) {
            return this;
        }

        public TypedPrimitiveArraySerializer(TypedPrimitiveArraySerializer<T> typedPrimitiveArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(typedPrimitiveArraySerializer, beanProperty, bool);
        }
    }

    static {
        HashMap<String, g<?>> hashMap = new HashMap<>();
        a = hashMap;
        hashMap.put(boolean[].class.getName(), new BooleanArraySerializer());
        hashMap.put(byte[].class.getName(), new ByteArraySerializer());
        hashMap.put(char[].class.getName(), new CharArraySerializer());
        hashMap.put(short[].class.getName(), new ShortArraySerializer());
        hashMap.put(int[].class.getName(), new IntArraySerializer());
        hashMap.put(long[].class.getName(), new LongArraySerializer());
        hashMap.put(float[].class.getName(), new FloatArraySerializer());
        hashMap.put(double[].class.getName(), new DoubleArraySerializer());
    }
}
