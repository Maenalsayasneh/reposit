package kotlin.reflect.jvm.internal.impl.builtins;

import i0.j.f.p.h;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import m0.c;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;
import m0.r.t.a.r.c.u;

/* compiled from: ReflectionTypes.kt */
public final class ReflectionTypes {
    public static final b a = new b((f) null);
    public static final /* synthetic */ k<Object>[] b;
    public final NotFoundClasses c;
    public final c d;
    public final a e = new a(1);

    /* compiled from: ReflectionTypes.kt */
    public static final class a {
        public a(int i) {
        }
    }

    /* compiled from: ReflectionTypes.kt */
    public static final class b {
        public b(f fVar) {
        }
    }

    static {
        Class<ReflectionTypes> cls = ReflectionTypes.class;
        k<Object>[] kVarArr = new k[9];
        kVarArr[1] = m.c(new PropertyReference1Impl(m.a(cls), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        kVarArr[2] = m.c(new PropertyReference1Impl(m.a(cls), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        kVarArr[3] = m.c(new PropertyReference1Impl(m.a(cls), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        kVarArr[4] = m.c(new PropertyReference1Impl(m.a(cls), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        kVarArr[5] = m.c(new PropertyReference1Impl(m.a(cls), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        kVarArr[6] = m.c(new PropertyReference1Impl(m.a(cls), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        kVarArr[7] = m.c(new PropertyReference1Impl(m.a(cls), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        kVarArr[8] = m.c(new PropertyReference1Impl(m.a(cls), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"));
        b = kVarArr;
    }

    public ReflectionTypes(u uVar, NotFoundClasses notFoundClasses) {
        i.e(uVar, "module");
        i.e(notFoundClasses, "notFoundClasses");
        this.c = notFoundClasses;
        this.d = h.G2(LazyThreadSafetyMode.PUBLICATION, new ReflectionTypes$kotlinReflectScope$2(uVar));
    }
}
