package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Constructor;
import kotlin.jvm.internal.FunctionReference;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.f;
import m0.r.t.a.r.c.v0.b.k;

/* compiled from: ReflectJavaClass.kt */
public final /* synthetic */ class ReflectJavaClass$constructors$2 extends FunctionReference implements l<Constructor<?>, k> {
    public static final ReflectJavaClass$constructors$2 c = new ReflectJavaClass$constructors$2();

    public ReflectJavaClass$constructors$2() {
        super(1);
    }

    public final String getName() {
        return "<init>";
    }

    public final f getOwner() {
        return m.a(k.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Constructor;)V";
    }

    public Object invoke(Object obj) {
        Constructor constructor = (Constructor) obj;
        i.e(constructor, "p0");
        return new k(constructor);
    }
}
