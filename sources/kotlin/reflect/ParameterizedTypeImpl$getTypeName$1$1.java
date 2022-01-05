package kotlin.reflect;

import java.lang.reflect.Type;
import kotlin.jvm.internal.FunctionReferenceImpl;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.r;

/* compiled from: TypesJVM.kt */
public final /* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends FunctionReferenceImpl implements l<Type, String> {
    public static final ParameterizedTypeImpl$getTypeName$1$1 c = new ParameterizedTypeImpl$getTypeName$1$1();

    public ParameterizedTypeImpl$getTypeName$1$1() {
        super(1, r.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    public Object invoke(Object obj) {
        Type type = (Type) obj;
        i.e(type, "p1");
        return r.a(type);
    }
}
