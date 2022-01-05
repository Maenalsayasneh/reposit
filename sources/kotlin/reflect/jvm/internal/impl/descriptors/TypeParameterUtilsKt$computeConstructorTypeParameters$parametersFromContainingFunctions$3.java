package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.l;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.m0;
import m0.s.h;

/* compiled from: typeParameterUtils.kt */
public final class TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3 extends Lambda implements l<i, h<? extends m0>> {
    public static final TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3 c = new TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3();

    public TypeParameterUtilsKt$computeConstructorTypeParameters$parametersFromContainingFunctions$3() {
        super(1);
    }

    public Object invoke(Object obj) {
        i iVar = (i) obj;
        m0.n.b.i.e(iVar, "it");
        List<m0> typeParameters = ((a) iVar).getTypeParameters();
        m0.n.b.i.d(typeParameters, "it as CallableDescriptor).typeParameters");
        return g.e(typeParameters);
    }
}
