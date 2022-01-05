package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: RuntimeTypeMapper.kt */
public final class RuntimeTypeMapperKt$signature$1 extends Lambda implements l<Class<?>, CharSequence> {
    public static final RuntimeTypeMapperKt$signature$1 c = new RuntimeTypeMapperKt$signature$1();

    public RuntimeTypeMapperKt$signature$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        Class cls = (Class) obj;
        i.d(cls, "it");
        return ReflectClassUtilKt.c(cls);
    }
}
