package i0.f.a.c.r;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import i0.f.a.c.g;
import i0.f.a.c.p.e;

/* compiled from: SerializerFactory */
public abstract class i {
    public abstract g<Object> a(i0.f.a.c.i iVar, JavaType javaType, g<Object> gVar) throws JsonMappingException;

    public abstract e b(SerializationConfig serializationConfig, JavaType javaType) throws JsonMappingException;
}
