package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.r0.e;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.p.b;
import m0.r.t.a.r.j.p.s;

/* compiled from: JvmBuiltInsCustomizer.kt */
public final class JvmBuiltInsCustomizer$notConsideredDeprecation$2 extends Lambda implements a<f> {
    public final /* synthetic */ JvmBuiltInsCustomizer c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsCustomizer$notConsideredDeprecation$2(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        super(0);
        this.c = jvmBuiltInsCustomizer;
    }

    public Object invoke() {
        m0.r.t.a.r.b.f m = this.c.b.m();
        d dVar = e.a;
        i.e(m, "<this>");
        i.e("This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        i.e("", "replaceWith");
        i.e("WARNING", "level");
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(m, g.a.w, m0.j.g.N(new Pair(e.d, new s("")), new Pair(e.e, new b(EmptyList.c, new AnnotationUtilKt$createDeprecatedAnnotation$replaceWithAnnotation$1(m)))));
        m0.r.t.a.r.g.b bVar = g.a.u;
        d dVar2 = e.c;
        m0.r.t.a.r.g.a l = m0.r.t.a.r.g.a.l(g.a.v);
        i.d(l, "topLevel(StandardNames.FqNames.deprecationLevel)");
        d g = d.g("WARNING");
        i.d(g, "identifier(level)");
        return f.i.a(h.L2(new BuiltInAnnotationDescriptor(m, bVar, m0.j.g.N(new Pair(e.a, new s("This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version")), new Pair(e.b, new m0.r.t.a.r.j.p.a(builtInAnnotationDescriptor)), new Pair(dVar2, new m0.r.t.a.r.j.p.i(l, g))))));
    }
}
