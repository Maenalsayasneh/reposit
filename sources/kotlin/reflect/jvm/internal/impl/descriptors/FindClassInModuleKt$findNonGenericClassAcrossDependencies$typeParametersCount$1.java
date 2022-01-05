package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.FunctionReference;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.f;
import m0.r.t.a.r.g.a;

/* compiled from: findClassInModule.kt */
public final /* synthetic */ class FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1 extends FunctionReference implements l<a, a> {
    public static final FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1 c = new FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1();

    public FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1() {
        super(1);
    }

    public final String getName() {
        return "getOuterClassId";
    }

    public final f getOwner() {
        return m.a(a.class);
    }

    public final String getSignature() {
        return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
    }

    public Object invoke(Object obj) {
        a aVar = (a) obj;
        i.e(aVar, "p0");
        return aVar.g();
    }
}
