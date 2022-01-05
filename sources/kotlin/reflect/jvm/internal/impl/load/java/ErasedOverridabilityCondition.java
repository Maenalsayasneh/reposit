package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.sequences.SequencesKt___SequencesKt;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.m.v;
import m0.s.f;
import m0.s.h;

/* compiled from: ErasedOverridabilityCondition.kt */
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    /* compiled from: ErasedOverridabilityCondition.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            OverridingUtil.OverrideCompatibilityInfo.Result.values();
            int[] iArr = new int[3];
            iArr[OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            a = iArr;
        }
    }

    public ExternalOverridabilityCondition.Contract a() {
        return ExternalOverridabilityCondition.Contract.SUCCESS_ONLY;
    }

    public ExternalOverridabilityCondition.Result b(m0.r.t.a.r.c.a aVar, m0.r.t.a.r.c.a aVar2, d dVar) {
        boolean z;
        boolean z2;
        i.e(aVar, "superDescriptor");
        i.e(aVar2, "subDescriptor");
        if (aVar2 instanceof JavaMethodDescriptor) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) aVar2;
            List<m0> typeParameters = javaMethodDescriptor.getTypeParameters();
            i.d(typeParameters, "subDescriptor.typeParameters");
            if (!(!typeParameters.isEmpty())) {
                OverridingUtil.OverrideCompatibilityInfo i = OverridingUtil.i(aVar, aVar2);
                v vVar = null;
                if ((i == null ? null : i.c()) != null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                List<o0> h = javaMethodDescriptor.h();
                i.d(h, "subDescriptor.valueParameters");
                h<R> g = SequencesKt___SequencesKt.g(g.e(h), ErasedOverridabilityCondition$isOverridable$signatureTypes$1.c);
                v vVar2 = javaMethodDescriptor.Z1;
                i.c(vVar2);
                h<R> i2 = SequencesKt___SequencesKt.i(g, vVar2);
                f0 f0Var = javaMethodDescriptor.a2;
                if (f0Var != null) {
                    vVar = f0Var.getType();
                }
                List L = g.L(vVar);
                i.e(i2, "$this$plus");
                i.e(L, "elements");
                f.a aVar3 = new f.a((f) m0.r.t.a.r.m.a1.a.x1(m0.r.t.a.r.m.a1.a.n3(i2, g.e(L))));
                while (true) {
                    if (!aVar3.a()) {
                        z = false;
                        break;
                    }
                    v vVar3 = (v) aVar3.next();
                    if (!(!vVar3.H0().isEmpty()) || (vVar3.L0() instanceof RawTypeImpl)) {
                        z2 = false;
                        continue;
                    } else {
                        z2 = true;
                        continue;
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                m0.r.t.a.r.c.a aVar4 = (m0.r.t.a.r.c.a) aVar.c(RawSubstitution.b.c());
                if (aVar4 == null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                if (aVar4 instanceof g0) {
                    g0 g0Var = (g0) aVar4;
                    List<m0> typeParameters2 = g0Var.getTypeParameters();
                    i.d(typeParameters2, "erasedSuper.typeParameters");
                    if (!typeParameters2.isEmpty()) {
                        aVar4 = (g0) g0Var.s().j(EmptyList.c).build();
                        i.c(aVar4);
                    }
                }
                OverridingUtil.OverrideCompatibilityInfo.Result c = OverridingUtil.b.n(aVar4, aVar2, false).c();
                i.d(c, "DEFAULT.isOverridableByWithoutExternalConditions(erasedSuper, subDescriptor, false).result");
                if (a.a[c.ordinal()] == 1) {
                    return ExternalOverridabilityCondition.Result.OVERRIDABLE;
                }
                return ExternalOverridabilityCondition.Result.UNKNOWN;
            }
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
