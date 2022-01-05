package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.e.a.u.c;

/* compiled from: JvmBuiltInsCustomizer.kt */
public final class JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1 extends Lambda implements a<d> {
    public final /* synthetic */ LazyJavaClassDescriptor c;
    public final /* synthetic */ d d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$getAdditionalFunctions$fakeJavaClassDescriptor$1(LazyJavaClassDescriptor lazyJavaClassDescriptor, d dVar) {
        super(0);
        this.c = lazyJavaClassDescriptor;
        this.d = dVar;
    }

    public Object invoke() {
        LazyJavaClassDescriptor lazyJavaClassDescriptor = this.c;
        m0.r.t.a.r.e.a.s.d dVar = m0.r.t.a.r.e.a.s.d.a;
        i.d(dVar, "EMPTY");
        d dVar2 = this.d;
        Objects.requireNonNull(lazyJavaClassDescriptor);
        i.e(dVar, "javaResolverCache");
        c cVar = lazyJavaClassDescriptor.d2;
        m0.r.t.a.r.e.a.u.a aVar = cVar.a;
        Objects.requireNonNull(aVar);
        i.e(dVar, "javaResolverCache");
        LazyJavaClassDescriptor lazyJavaClassDescriptor2 = lazyJavaClassDescriptor;
        m0.r.t.a.r.e.a.u.a aVar2 = r2;
        m0.r.t.a.r.e.a.u.a aVar3 = aVar;
        d dVar3 = dVar2;
        m0.r.t.a.r.e.a.u.a aVar4 = new m0.r.t.a.r.e.a.u.a(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, dVar, aVar.h, aVar.i, aVar.j, aVar3.k, aVar3.l, aVar3.m, aVar3.n, aVar3.o, aVar3.p, aVar3.q, aVar3.r, aVar3.s, aVar3.t, aVar3.u, aVar3.v);
        c cVar2 = cVar;
        i.e(cVar2, "<this>");
        m0.r.t.a.r.e.a.u.a aVar5 = aVar2;
        i.e(aVar5, "components");
        c cVar3 = new c(aVar5, cVar2.b, cVar2.c);
        m0.r.t.a.r.c.i b = lazyJavaClassDescriptor2.b();
        i.d(b, "containingDeclaration");
        return new LazyJavaClassDescriptor(cVar3, b, lazyJavaClassDescriptor2.b2, dVar3);
    }
}
