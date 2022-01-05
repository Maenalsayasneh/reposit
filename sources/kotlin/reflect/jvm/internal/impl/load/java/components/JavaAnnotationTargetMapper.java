package kotlin.reflect.jvm.internal.impl.load.java.components;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.e.a.w.b;
import m0.r.t.a.r.e.a.w.m;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.g.d;

/* compiled from: JavaAnnotationMapper.kt */
public final class JavaAnnotationTargetMapper {
    public static final JavaAnnotationTargetMapper a = new JavaAnnotationTargetMapper();
    public static final Map<String, EnumSet<KotlinTarget>> b = g.N(new Pair("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), new Pair("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), new Pair("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), new Pair("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), new Pair("FIELD", EnumSet.of(KotlinTarget.FIELD)), new Pair("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), new Pair("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), new Pair("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), new Pair("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), new Pair("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));
    public static final Map<String, KotlinRetention> c = g.N(new Pair("RUNTIME", KotlinRetention.RUNTIME), new Pair("CLASS", KotlinRetention.BINARY), new Pair("SOURCE", KotlinRetention.SOURCE));

    public final m0.r.t.a.r.j.p.g<?> a(List<? extends b> list) {
        i.e(list, "arguments");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (next instanceof m) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d d = ((m) it.next()).d();
            Iterable iterable = b.get(d == null ? null : d.b());
            if (iterable == null) {
                iterable = EmptySet.c;
            }
            g.b(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(h.K(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            a l = a.l(g.a.B);
            i.d(l, "topLevel(StandardNames.FqNames.annotationTarget)");
            d g = d.g(((KotlinTarget) it2.next()).name());
            i.d(g, "identifier(kotlinTarget.name)");
            arrayList3.add(new m0.r.t.a.r.j.p.i(l, g));
        }
        return new m0.r.t.a.r.j.p.b(arrayList3, JavaAnnotationTargetMapper$mapJavaTargetArguments$1.c);
    }
}
