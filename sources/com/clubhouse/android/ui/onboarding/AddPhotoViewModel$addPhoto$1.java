package com.clubhouse.android.ui.onboarding;

import android.net.Uri;
import i0.b.b.b;
import i0.e.b.g3.r.i0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: AddPhotoViewModel.kt */
public final class AddPhotoViewModel$addPhoto$1 extends Lambda implements l<i0, i0> {
    public final /* synthetic */ Uri c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPhotoViewModel$addPhoto$1(Uri uri) {
        super(1);
        this.c = uri;
    }

    public Object invoke(Object obj) {
        i0 i0Var = (i0) obj;
        i.e(i0Var, "$this$setState");
        return i0.copy$default(i0Var, (h0.t.l) null, (b) null, this.c, false, 11, (Object) null);
    }
}
