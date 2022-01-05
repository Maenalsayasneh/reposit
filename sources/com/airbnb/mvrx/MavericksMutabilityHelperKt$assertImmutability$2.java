package com.airbnb.mvrx;

import i0.j.f.p.h;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;
import m0.r.d;

/* compiled from: MavericksMutabilityHelper.kt */
public final class MavericksMutabilityHelperKt$assertImmutability$2 extends Lambda implements p<Field, d<?>[], Boolean> {
    public static final MavericksMutabilityHelperKt$assertImmutability$2 c = new MavericksMutabilityHelperKt$assertImmutability$2();

    public MavericksMutabilityHelperKt$assertImmutability$2() {
        super(2);
    }

    public final boolean a(Field field, d<?>... dVarArr) {
        i.e(field, "$this$isSubtype");
        i.e(dVarArr, "classes");
        if (dVarArr.length <= 0) {
            return false;
        }
        d<?> dVar = dVarArr[0];
        Class<?> type = field.getType();
        if (!(type instanceof ParameterizedType)) {
            return h.l1(dVar).isAssignableFrom(type);
        }
        Class<?> l1 = h.l1(dVar);
        Type rawType = ((ParameterizedType) type).getRawType();
        Objects.requireNonNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
        return l1.isAssignableFrom((Class) rawType);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(a((Field) obj, (d[]) obj2));
    }
}
