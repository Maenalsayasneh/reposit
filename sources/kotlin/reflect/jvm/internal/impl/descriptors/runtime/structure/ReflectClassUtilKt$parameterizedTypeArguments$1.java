package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: reflectClassUtil.kt */
public final class ReflectClassUtilKt$parameterizedTypeArguments$1 extends Lambda implements l<ParameterizedType, ParameterizedType> {
    public static final ReflectClassUtilKt$parameterizedTypeArguments$1 c = new ReflectClassUtilKt$parameterizedTypeArguments$1();

    public ReflectClassUtilKt$parameterizedTypeArguments$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        i.e(parameterizedType, "it");
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof ParameterizedType) {
            return (ParameterizedType) ownerType;
        }
        return null;
    }
}
