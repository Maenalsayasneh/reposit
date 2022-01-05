package kotlin.reflect;

import kotlin.jvm.internal.FunctionReferenceImpl;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: TypesJVM.kt */
public final /* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends FunctionReferenceImpl implements l<Class<? extends Object>, Class<?>> {
    public static final TypesJVMKt$typeToString$unwrap$1 c = new TypesJVMKt$typeToString$unwrap$1();

    public TypesJVMKt$typeToString$unwrap$1() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    public Object invoke(Object obj) {
        Class cls = (Class) obj;
        i.e(cls, "p1");
        return cls.getComponentType();
    }
}
