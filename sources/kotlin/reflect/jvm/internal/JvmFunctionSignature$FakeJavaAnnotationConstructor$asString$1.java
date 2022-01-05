package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: RuntimeTypeMapper.kt */
public final class JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1 extends Lambda implements l<Method, CharSequence> {
    public static final JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1 c = new JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1();

    public JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        Method method = (Method) obj;
        i.d(method, "it");
        Class<?> returnType = method.getReturnType();
        i.d(returnType, "it.returnType");
        return ReflectClassUtilKt.c(returnType);
    }
}
