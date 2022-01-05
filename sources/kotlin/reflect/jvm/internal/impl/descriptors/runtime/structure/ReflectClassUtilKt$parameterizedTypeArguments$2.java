package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.s.h;

/* compiled from: reflectClassUtil.kt */
public final class ReflectClassUtilKt$parameterizedTypeArguments$2 extends Lambda implements l<ParameterizedType, h<? extends Type>> {
    public static final ReflectClassUtilKt$parameterizedTypeArguments$2 c = new ReflectClassUtilKt$parameterizedTypeArguments$2();

    public ReflectClassUtilKt$parameterizedTypeArguments$2() {
        super(1);
    }

    public Object invoke(Object obj) {
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        i.e(parameterizedType, "it");
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        i.d(actualTypeArguments, "it.actualTypeArguments");
        return i0.j.f.p.h.w(actualTypeArguments);
    }
}
