package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import kotlin.jvm.internal.FunctionReference;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.f;
import m0.r.t.a.r.c.v0.b.n;

/* compiled from: ReflectJavaClass.kt */
public final /* synthetic */ class ReflectJavaClass$fields$2 extends FunctionReference implements l<Field, n> {
    public static final ReflectJavaClass$fields$2 c = new ReflectJavaClass$fields$2();

    public ReflectJavaClass$fields$2() {
        super(1);
    }

    public final String getName() {
        return "<init>";
    }

    public final f getOwner() {
        return m.a(n.class);
    }

    public final String getSignature() {
        return "<init>(Ljava/lang/reflect/Field;)V";
    }

    public Object invoke(Object obj) {
        Field field = (Field) obj;
        i.e(field, "p0");
        return new n(field);
    }
}
