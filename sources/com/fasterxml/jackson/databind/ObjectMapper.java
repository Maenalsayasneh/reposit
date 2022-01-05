package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.CoercionConfigs;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import i0.f.a.b.d;
import i0.f.a.b.e;
import i0.f.a.b.i.g;
import i0.f.a.c.n.k;
import i0.f.a.c.p.a;
import i0.f.a.c.r.i;
import i0.f.a.c.t.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

public class ObjectMapper extends d implements Serializable {
    public static final AnnotationIntrospector c;
    public static final BaseSettings d;
    public final ConfigOverrides Y1;
    public final CoercionConfigs Z1;
    public SerializationConfig a2;
    public DefaultSerializerProvider b2;
    public i c2;
    public DeserializationConfig d2;
    public DefaultDeserializationContext e2;
    public final ConcurrentHashMap<JavaType, i0.f.a.c.d<Object>> f2;
    public final JsonFactory q;
    public TypeFactory x;
    public a y;

    static {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector = new JacksonAnnotationIntrospector();
        c = jacksonAnnotationIntrospector;
        d = new BaseSettings((k) null, jacksonAnnotationIntrospector, (PropertyNamingStrategy) null, TypeFactory.d, (i0.f.a.c.p.d) null, StdDateFormat.Z1, Locale.getDefault(), (TimeZone) null, i0.f.a.b.a.b, LaissezFaireSubTypeValidator.c, new DefaultAccessorNamingStrategy.Provider());
    }

    public ObjectMapper() {
        this((JsonFactory) null, (DefaultSerializerProvider) null, (DefaultDeserializationContext) null);
    }

    public void a(JsonGenerator jsonGenerator, Object obj) throws IOException, JsonGenerationException, JsonMappingException {
        b("g", jsonGenerator);
        SerializationConfig serializationConfig = this.a2;
        if (serializationConfig.E(SerializationFeature.INDENT_OUTPUT) && jsonGenerator.q == null) {
            e eVar = serializationConfig.h2;
            if (eVar instanceof i0.f.a.b.m.d) {
                eVar = (e) ((i0.f.a.b.m.d) eVar).e();
            }
            jsonGenerator.C(eVar);
        }
        if (!serializationConfig.E(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            DefaultSerializerProvider defaultSerializerProvider = this.b2;
            i iVar = this.c2;
            DefaultSerializerProvider.Impl impl = (DefaultSerializerProvider.Impl) defaultSerializerProvider;
            Objects.requireNonNull(impl);
            new DefaultSerializerProvider.Impl(impl, serializationConfig, iVar).h0(jsonGenerator, obj);
            if (serializationConfig.E(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
                return;
            }
            return;
        }
        Closeable closeable = (Closeable) obj;
        try {
            DefaultSerializerProvider defaultSerializerProvider2 = this.b2;
            i iVar2 = this.c2;
            DefaultSerializerProvider.Impl impl2 = (DefaultSerializerProvider.Impl) defaultSerializerProvider2;
            Objects.requireNonNull(impl2);
            new DefaultSerializerProvider.Impl(impl2, serializationConfig, iVar2).h0(jsonGenerator, obj);
            if (serializationConfig.E(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                jsonGenerator.flush();
            }
            closeable.close();
        } catch (Exception e) {
            f.g((JsonGenerator) null, closeable, e);
            throw null;
        }
    }

    public final void b(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", new Object[]{str}));
        }
    }

    public i0.f.a.c.d<Object> c(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        i0.f.a.c.d<Object> dVar = this.f2.get(javaType);
        if (dVar != null) {
            return dVar;
        }
        i0.f.a.c.d<Object> F = deserializationContext.F(javaType);
        if (F != null) {
            this.f2.put(javaType, F);
            return F;
        }
        throw new InvalidDefinitionException(deserializationContext.Z1, "Cannot find a deserializer for type " + javaType, javaType);
    }

    public final void d(JsonGenerator jsonGenerator, Object obj) throws IOException {
        SerializationConfig serializationConfig = this.a2;
        if (!serializationConfig.E(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            try {
                DefaultSerializerProvider defaultSerializerProvider = this.b2;
                i iVar = this.c2;
                DefaultSerializerProvider.Impl impl = (DefaultSerializerProvider.Impl) defaultSerializerProvider;
                Objects.requireNonNull(impl);
                new DefaultSerializerProvider.Impl(impl, serializationConfig, iVar).h0(jsonGenerator, obj);
                jsonGenerator.close();
            } catch (Exception e) {
                f.h(jsonGenerator, e);
                throw null;
            }
        } else {
            Closeable closeable = (Closeable) obj;
            try {
                DefaultSerializerProvider defaultSerializerProvider2 = this.b2;
                i iVar2 = this.c2;
                DefaultSerializerProvider.Impl impl2 = (DefaultSerializerProvider.Impl) defaultSerializerProvider2;
                Objects.requireNonNull(impl2);
                new DefaultSerializerProvider.Impl(impl2, serializationConfig, iVar2).h0(jsonGenerator, obj);
                try {
                    closeable.close();
                    jsonGenerator.close();
                } catch (Exception e3) {
                    e = e3;
                    closeable = null;
                    f.g(jsonGenerator, closeable, e);
                    throw null;
                }
            } catch (Exception e4) {
                e = e4;
                f.g(jsonGenerator, closeable, e);
                throw null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009f, code lost:
        if (r7 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a5, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a6, code lost:
        r8.addSuppressed(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T e(byte[] r7, java.lang.Class<T> r8) throws java.io.IOException, com.fasterxml.jackson.core.JsonParseException, com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r6 = this;
            java.lang.String r0 = "src"
            r6.b(r0, r7)
            com.fasterxml.jackson.core.JsonFactory r0 = r6.q
            com.fasterxml.jackson.core.JsonParser r7 = r0.e(r7)
            com.fasterxml.jackson.databind.type.TypeFactory r0 = r6.x
            com.fasterxml.jackson.databind.type.TypeBindings r1 = com.fasterxml.jackson.databind.type.TypeFactory.q
            r2 = 0
            com.fasterxml.jackson.databind.JavaType r8 = r0.b(r2, r8, r1)
            com.fasterxml.jackson.databind.DeserializationConfig r0 = r6.d2     // Catch:{ all -> 0x009c }
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext r1 = r6.e2     // Catch:{ all -> 0x009c }
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl r1 = (com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl) r1     // Catch:{ all -> 0x009c }
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x009c }
            com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl r3 = new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl     // Catch:{ all -> 0x009c }
            r3.<init>(r1, r0, r7)     // Catch:{ all -> 0x009c }
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r6.d2     // Catch:{ all -> 0x009c }
            int r4 = r1.m2     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x002d
            int r5 = r1.l2     // Catch:{ all -> 0x009c }
            r7.P0(r5, r4)     // Catch:{ all -> 0x009c }
        L_0x002d:
            int r4 = r1.o2     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x0036
            int r1 = r1.n2     // Catch:{ all -> 0x009c }
            r7.O0(r1, r4)     // Catch:{ all -> 0x009c }
        L_0x0036:
            com.fasterxml.jackson.core.JsonToken r1 = r7.i()     // Catch:{ all -> 0x009c }
            if (r1 != 0) goto L_0x004b
            com.fasterxml.jackson.core.JsonToken r1 = r7.M0()     // Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x0043
            goto L_0x004b
        L_0x0043:
            com.fasterxml.jackson.databind.exc.MismatchedInputException r0 = new com.fasterxml.jackson.databind.exc.MismatchedInputException     // Catch:{ all -> 0x009c }
            java.lang.String r1 = "No content to map due to end-of-input"
            r0.<init>((com.fasterxml.jackson.core.JsonParser) r7, (java.lang.String) r1, (com.fasterxml.jackson.databind.JavaType) r8)     // Catch:{ all -> 0x009c }
            throw r0     // Catch:{ all -> 0x009c }
        L_0x004b:
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL     // Catch:{ all -> 0x009c }
            if (r1 != r4) goto L_0x0058
            i0.f.a.c.d r1 = r6.c(r3, r8)     // Catch:{ all -> 0x009c }
            java.lang.Object r2 = r1.b(r3)     // Catch:{ all -> 0x009c }
            goto L_0x006c
        L_0x0058:
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.END_ARRAY     // Catch:{ all -> 0x009c }
            if (r1 == r4) goto L_0x006c
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.END_OBJECT     // Catch:{ all -> 0x009c }
            if (r1 != r4) goto L_0x0061
            goto L_0x006c
        L_0x0061:
            i0.f.a.c.d r1 = r6.c(r3, r8)     // Catch:{ all -> 0x009c }
            java.lang.Object r2 = r3.w0(r7, r8, r1, r2)     // Catch:{ all -> 0x009c }
            r3.v0()     // Catch:{ all -> 0x009c }
        L_0x006c:
            com.fasterxml.jackson.databind.DeserializationFeature r1 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x009c }
            boolean r0 = r0.F(r1)     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0098
            com.fasterxml.jackson.core.JsonToken r0 = r7.M0()     // Catch:{ all -> 0x009c }
            if (r0 != 0) goto L_0x007b
            goto L_0x0098
        L_0x007b:
            java.lang.Class r8 = i0.f.a.c.t.f.G(r8)     // Catch:{ all -> 0x009c }
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x009c }
            r2 = 0
            r1[r2] = r0     // Catch:{ all -> 0x009c }
            java.lang.String r0 = i0.f.a.c.t.f.E(r8)     // Catch:{ all -> 0x009c }
            r2 = 1
            r1[r2] = r0     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "Trailing token (of type %s) found after value (bound as %s): not allowed as per `DeserializationFeature.FAIL_ON_TRAILING_TOKENS`"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x009c }
            com.fasterxml.jackson.databind.exc.MismatchedInputException r1 = new com.fasterxml.jackson.databind.exc.MismatchedInputException     // Catch:{ all -> 0x009c }
            r1.<init>((com.fasterxml.jackson.core.JsonParser) r7, (java.lang.String) r0, (java.lang.Class<?>) r8)     // Catch:{ all -> 0x009c }
            throw r1     // Catch:{ all -> 0x009c }
        L_0x0098:
            r7.close()
            return r2
        L_0x009c:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x009e }
        L_0x009e:
            r0 = move-exception
            if (r7 == 0) goto L_0x00a9
            r7.close()     // Catch:{ all -> 0x00a5 }
            goto L_0x00a9
        L_0x00a5:
            r7 = move-exception
            r8.addSuppressed(r7)
        L_0x00a9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ObjectMapper.e(byte[], java.lang.Class):java.lang.Object");
    }

    public String f(Object obj) throws JsonProcessingException {
        g gVar = new g(this.q.d());
        try {
            b("w", gVar);
            JsonFactory jsonFactory = this.q;
            JsonGenerator b = jsonFactory.b(gVar, jsonFactory.a(gVar, false));
            this.a2.A(b);
            d(b, obj);
            String h = gVar.c.h();
            gVar.c.p();
            return h;
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e3) {
            throw JsonMappingException.e(e3);
        }
    }

    public ObjectMapper(JsonFactory jsonFactory, DefaultSerializerProvider defaultSerializerProvider, DefaultDeserializationContext defaultDeserializationContext) {
        BaseSettings baseSettings;
        JsonFactory jsonFactory2 = jsonFactory;
        this.f2 = new ConcurrentHashMap<>(64, 0.6f, 2);
        if (jsonFactory2 == null) {
            this.q = new MappingJsonFactory(this);
        } else {
            this.q = jsonFactory2;
            if (jsonFactory.f() == null) {
                jsonFactory2.c2 = this;
            }
        }
        this.y = new StdSubtypeResolver();
        RootNameLookup rootNameLookup = new RootNameLookup();
        this.x = TypeFactory.d;
        SimpleMixInResolver simpleMixInResolver = new SimpleMixInResolver((k.a) null);
        BaseSettings baseSettings2 = d;
        BasicClassIntrospector basicClassIntrospector = new BasicClassIntrospector();
        if (baseSettings2.q == basicClassIntrospector) {
            baseSettings = baseSettings2;
        } else {
            baseSettings = new BaseSettings(basicClassIntrospector, baseSettings2.x, baseSettings2.y, baseSettings2.d, baseSettings2.Z1, baseSettings2.b2, baseSettings2.c2, baseSettings2.d2, baseSettings2.e2, baseSettings2.a2, baseSettings2.Y1);
        }
        ConfigOverrides configOverrides = new ConfigOverrides();
        this.Y1 = configOverrides;
        CoercionConfigs coercionConfigs = new CoercionConfigs();
        this.Z1 = coercionConfigs;
        BaseSettings baseSettings3 = baseSettings;
        SimpleMixInResolver simpleMixInResolver2 = simpleMixInResolver;
        RootNameLookup rootNameLookup2 = rootNameLookup;
        ConfigOverrides configOverrides2 = configOverrides;
        this.a2 = new SerializationConfig(baseSettings3, this.y, simpleMixInResolver2, rootNameLookup2, configOverrides2);
        this.d2 = new DeserializationConfig(baseSettings3, this.y, simpleMixInResolver2, rootNameLookup2, configOverrides2, coercionConfigs);
        Objects.requireNonNull(this.q);
        SerializationConfig serializationConfig = this.a2;
        MapperFeature mapperFeature = MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
        if (serializationConfig.q(mapperFeature)) {
            this.a2 = (SerializationConfig) this.a2.z(mapperFeature);
            this.d2 = (DeserializationConfig) this.d2.z(mapperFeature);
        }
        this.b2 = new DefaultSerializerProvider.Impl();
        this.e2 = new DefaultDeserializationContext.Impl(BeanDeserializerFactory.Z1);
        this.c2 = BeanSerializerFactory.x;
    }
}
