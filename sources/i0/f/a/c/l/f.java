package i0.f.a.c.l;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.CollectionType;
import i0.f.a.c.b;
import i0.f.a.c.d;

/* compiled from: DeserializerFactory */
public abstract class f {
    public abstract d<?> a(DeserializationContext deserializationContext, CollectionType collectionType, b bVar) throws JsonMappingException;

    public abstract i0.f.a.c.p.b b(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException;

    public abstract JavaType c(DeserializationConfig deserializationConfig, JavaType javaType) throws JsonMappingException;
}
