package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: RuntimeTypeMapper.kt */
public final class JvmFunctionSignature$JavaConstructor$asString$1 extends Lambda implements l<Class<?>, CharSequence> {
    public static final JvmFunctionSignature$JavaConstructor$asString$1 c = new JvmFunctionSignature$JavaConstructor$asString$1();

    public JvmFunctionSignature$JavaConstructor$asString$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        Class cls = (Class) obj;
        i.d(cls, "it");
        return ReflectClassUtilKt.c(cls);
    }
}
