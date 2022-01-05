package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import i0.f.a.b.b;
import i0.f.a.b.e;
import i0.f.a.b.f;
import i0.f.a.b.m.d;
import i0.f.a.c.g;
import i0.f.a.c.r.i;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.util.Objects;

public class ObjectWriter implements Serializable {
    public static final e c = new MinimalPrettyPrinter();
    public final GeneratorSettings Y1;
    public final Prefetch Z1;
    public final SerializationConfig d;
    public final DefaultSerializerProvider q;
    public final i x;
    public final JsonFactory y;

    public static final class GeneratorSettings implements Serializable {
        public static final GeneratorSettings c = new GeneratorSettings((e) null, (b) null, (f) null);
        public final e d;
        public final b q;
        public final f x;

        public GeneratorSettings(e eVar, b bVar, f fVar) {
            this.d = eVar;
            this.q = bVar;
            this.x = fVar;
        }
    }

    public static final class Prefetch implements Serializable {
        public static final Prefetch c = new Prefetch((JavaType) null, (g<Object>) null, (i0.f.a.c.p.e) null);

        public Prefetch(JavaType javaType, g<Object> gVar, i0.f.a.c.p.e eVar) {
        }
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig) {
        this.d = serializationConfig;
        this.q = objectMapper.b2;
        this.x = objectMapper.c2;
        this.y = objectMapper.q;
        this.Y1 = GeneratorSettings.c;
        this.Z1 = Prefetch.c;
    }

    public final void a(JsonGenerator jsonGenerator, Object obj) throws IOException {
        if (!this.d.E(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            try {
                Prefetch prefetch = this.Z1;
                DefaultSerializerProvider defaultSerializerProvider = this.q;
                SerializationConfig serializationConfig = this.d;
                i iVar = this.x;
                DefaultSerializerProvider.Impl impl = (DefaultSerializerProvider.Impl) defaultSerializerProvider;
                Objects.requireNonNull(impl);
                DefaultSerializerProvider.Impl impl2 = new DefaultSerializerProvider.Impl(impl, serializationConfig, iVar);
                Objects.requireNonNull(prefetch);
                impl2.h0(jsonGenerator, obj);
                jsonGenerator.close();
            } catch (Exception e) {
                i0.f.a.c.t.f.h(jsonGenerator, e);
                throw null;
            }
        } else {
            Closeable closeable = (Closeable) obj;
            try {
                Prefetch prefetch2 = this.Z1;
                DefaultSerializerProvider defaultSerializerProvider2 = this.q;
                SerializationConfig serializationConfig2 = this.d;
                i iVar2 = this.x;
                DefaultSerializerProvider.Impl impl3 = (DefaultSerializerProvider.Impl) defaultSerializerProvider2;
                Objects.requireNonNull(impl3);
                DefaultSerializerProvider.Impl impl4 = new DefaultSerializerProvider.Impl(impl3, serializationConfig2, iVar2);
                Objects.requireNonNull(prefetch2);
                impl4.h0(jsonGenerator, obj);
                try {
                    closeable.close();
                    jsonGenerator.close();
                } catch (Exception e2) {
                    e = e2;
                    closeable = null;
                    i0.f.a.c.t.f.g(jsonGenerator, closeable, e);
                    throw null;
                }
            } catch (Exception e3) {
                e = e3;
                i0.f.a.c.t.f.g(jsonGenerator, closeable, e);
                throw null;
            }
        }
    }

    public JsonGenerator b(Writer writer) throws IOException {
        JsonFactory jsonFactory = this.y;
        JsonGenerator b = jsonFactory.b(writer, jsonFactory.a(writer, false));
        this.d.A(b);
        GeneratorSettings generatorSettings = this.Y1;
        e eVar = generatorSettings.d;
        if (eVar != null) {
            if (eVar == c) {
                b.C((e) null);
            } else {
                if (eVar instanceof d) {
                    eVar = (e) ((d) eVar).e();
                }
                b.C(eVar);
            }
        }
        b bVar = generatorSettings.q;
        if (bVar == null) {
            f fVar = generatorSettings.x;
            if (fVar != null) {
                b.E(fVar);
            }
            return b;
        }
        Objects.requireNonNull(b);
        throw new UnsupportedOperationException(String.format("Generator of type %s does not support schema of type '%s'", new Object[]{b.getClass().getName(), bVar.a()}));
    }

    public ObjectWriter(ObjectWriter objectWriter, SerializationConfig serializationConfig, GeneratorSettings generatorSettings, Prefetch prefetch) {
        this.d = serializationConfig;
        this.q = objectWriter.q;
        this.x = objectWriter.x;
        this.y = objectWriter.y;
        this.Y1 = generatorSettings;
        this.Z1 = prefetch;
    }
}
