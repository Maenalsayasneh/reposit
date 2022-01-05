package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import i0.f.a.b.b;
import i0.f.a.b.d;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class ObjectReader extends d implements Serializable {
    public final DeserializationConfig c;
    public final DefaultDeserializationContext d;
    public final Object q;
    public final ConcurrentHashMap<JavaType, i0.f.a.c.d<Object>> x;

    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig, JavaType javaType, Object obj, b bVar) {
        this.c = deserializationConfig;
        DefaultDeserializationContext defaultDeserializationContext = objectMapper.e2;
        this.d = defaultDeserializationContext;
        ConcurrentHashMap<JavaType, i0.f.a.c.d<Object>> concurrentHashMap = objectMapper.f2;
        this.x = concurrentHashMap;
        this.q = obj;
        PropertyName propertyName = deserializationConfig.a2;
        if (propertyName != null) {
            propertyName.e();
        } else {
            deserializationConfig.F(DeserializationFeature.UNWRAP_ROOT_VALUE);
        }
        if (javaType != null && deserializationConfig.F(DeserializationFeature.EAGER_DESERIALIZER_FETCH) && concurrentHashMap.get(javaType) == null) {
            try {
                DefaultDeserializationContext.Impl impl = (DefaultDeserializationContext.Impl) defaultDeserializationContext;
                Objects.requireNonNull(impl);
                i0.f.a.c.d<Object> F = new DefaultDeserializationContext.Impl(impl, deserializationConfig).F(javaType);
                if (F != null) {
                    concurrentHashMap.put(javaType, F);
                }
            } catch (JsonProcessingException unused) {
            }
        }
    }

    public void a(JsonGenerator jsonGenerator, Object obj) throws IOException {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }
}
