package i0.f.a.c.r;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import i0.f.a.c.b;
import i0.f.a.c.g;
import i0.f.a.c.p.e;

/* compiled from: Serializers */
public interface j {
    g<?> a(SerializationConfig serializationConfig, ReferenceType referenceType, b bVar, e eVar, g<Object> gVar);

    g<?> b(SerializationConfig serializationConfig, JavaType javaType, b bVar);

    g<?> c(SerializationConfig serializationConfig, MapType mapType, b bVar, g<Object> gVar, e eVar, g<Object> gVar2);

    g<?> d(SerializationConfig serializationConfig, CollectionLikeType collectionLikeType, b bVar, e eVar, g<Object> gVar);

    g<?> e(SerializationConfig serializationConfig, ArrayType arrayType, b bVar, e eVar, g<Object> gVar);

    g<?> f(SerializationConfig serializationConfig, MapLikeType mapLikeType, b bVar, g<Object> gVar, e eVar, g<Object> gVar2);

    g<?> g(SerializationConfig serializationConfig, CollectionType collectionType, b bVar, e eVar, g<Object> gVar);
}
