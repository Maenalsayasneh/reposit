package i0.f.a.c.p;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import i0.f.a.c.n.b;
import java.util.Collection;

/* compiled from: SubtypeResolver */
public abstract class a {
    public abstract Collection<NamedType> a(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType);

    public abstract Collection<NamedType> b(MapperConfig<?> mapperConfig, b bVar);

    public abstract Collection<NamedType> c(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType);
}
