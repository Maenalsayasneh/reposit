package com.clubhouse.android.ui.onboarding;

import i0.e.b.g3.r.o2;
import java.util.UUID;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: ValidateNumberWithCallViewModel.kt */
public final class ValidateNumberWithCallViewModel$initiateFlashCall$1 extends Lambda implements l<o2, o2> {
    public static final ValidateNumberWithCallViewModel$initiateFlashCall$1 c = new ValidateNumberWithCallViewModel$initiateFlashCall$1();

    public ValidateNumberWithCallViewModel$initiateFlashCall$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        o2 o2Var = (o2) obj;
        i.e(o2Var, "$this$setState");
        String uuid = UUID.randomUUID().toString();
        i.d(uuid, "randomUUID().toString()");
        return o2.copy$default(o2Var, (String) null, uuid, 1, (Object) null);
    }
}
