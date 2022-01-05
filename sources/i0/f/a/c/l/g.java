package i0.f.a.c.l;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import i0.f.a.c.b;
import i0.f.a.c.d;
import i0.f.a.c.e;
import i0.f.a.c.h;

/* compiled from: Deserializers */
public interface g {
    d<?> a(ReferenceType referenceType, DeserializationConfig deserializationConfig, b bVar, i0.f.a.c.p.b bVar2, d<?> dVar) throws JsonMappingException;

    d<?> b(MapLikeType mapLikeType, DeserializationConfig deserializationConfig, b bVar, h hVar, i0.f.a.c.p.b bVar2, d<?> dVar) throws JsonMappingException;

    d<?> c(JavaType javaType, DeserializationConfig deserializationConfig, b bVar) throws JsonMappingException;

    d<?> d(Class<? extends e> cls, DeserializationConfig deserializationConfig, b bVar) throws JsonMappingException;

    d<?> e(Class<?> cls, DeserializationConfig deserializationConfig, b bVar) throws JsonMappingException;

    d<?> f(CollectionLikeType collectionLikeType, DeserializationConfig deserializationConfig, b bVar, i0.f.a.c.p.b bVar2, d<?> dVar) throws JsonMappingException;

    d<?> g(CollectionType collectionType, DeserializationConfig deserializationConfig, b bVar, i0.f.a.c.p.b bVar2, d<?> dVar) throws JsonMappingException;

    d<?> h(ArrayType arrayType, DeserializationConfig deserializationConfig, b bVar, i0.f.a.c.p.b bVar2, d<?> dVar) throws JsonMappingException;

    d<?> i(MapType mapType, DeserializationConfig deserializationConfig, b bVar, h hVar, i0.f.a.c.p.b bVar2, d<?> dVar) throws JsonMappingException;
}
