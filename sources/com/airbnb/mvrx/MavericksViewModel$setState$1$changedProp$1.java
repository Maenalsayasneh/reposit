package com.airbnb.mvrx;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: MavericksViewModel.kt */
public final class MavericksViewModel$setState$1$changedProp$1 extends Lambda implements l<Field, i> {
    public static final MavericksViewModel$setState$1$changedProp$1 c = new MavericksViewModel$setState$1$changedProp$1();

    public MavericksViewModel$setState$1$changedProp$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        Field field = (Field) obj;
        m0.n.b.i.d(field, "it");
        field.setAccessible(true);
        return i.a;
    }
}
