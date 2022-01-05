package i0.f.a.c.p;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import i0.f.a.c.p.d;
import java.util.Collection;

/* compiled from: TypeResolverBuilder */
public interface d<T extends d<T>> {
    T a(boolean z);

    b b(DeserializationConfig deserializationConfig, JavaType javaType, Collection<NamedType> collection);

    T c(JsonTypeInfo.Id id, c cVar);

    T d(String str);

    T e(Class<?> cls);

    e f(SerializationConfig serializationConfig, JavaType javaType, Collection<NamedType> collection);

    T g(JsonTypeInfo.As as);

    Class<?> h();
}
