package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Method;
import kotlin.jvm.internal.FunctionReference;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.f;
import m0.r.t.a.r.c.v0.b.q;

/* compiled from: ReflectJavaClass.kt */
public final /* synthetic */ class ReflectJavaClass$methods$2 extends FunctionReference implements l<Method, q> {
    public static final ReflectJavaClass$methods$2 c = new ReflectJavaClass$methods$2();

    public ReflectJavaClass$methods$2() {
        super(1);
    }

    public final String getName() {
        return "<init>";
    }

    public final f getOwner() {
        return m.a(q.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Method;)V";
    }

    public Object invoke(Object obj) {
        Method method = (Method) obj;
        i.e(method, "p0");
        return new q(method);
    }
}
