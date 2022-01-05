package m0.r.t.a.r.c.v0.a;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.b.i;

/* compiled from: PackagePartScopeCache.kt */
public final class a {
    public final DeserializedDescriptorResolver a;
    public final f b;
    public final ConcurrentHashMap<m0.r.t.a.r.g.a, MemberScope> c = new ConcurrentHashMap<>();

    public a(DeserializedDescriptorResolver deserializedDescriptorResolver, f fVar) {
        i.e(deserializedDescriptorResolver, "resolver");
        i.e(fVar, "kotlinClassFinder");
        this.a = deserializedDescriptorResolver;
        this.b = fVar;
    }
}
