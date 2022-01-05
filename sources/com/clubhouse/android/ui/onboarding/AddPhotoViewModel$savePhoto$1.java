package com.clubhouse.android.ui.onboarding;

import android.net.Uri;
import com.airbnb.mvrx.MavericksViewModel;
import i0.e.b.g3.r.i0;
import i0.e.b.g3.r.j0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.r.m;
import n0.a.m0;

/* compiled from: AddPhotoViewModel.kt */
public final class AddPhotoViewModel$savePhoto$1 extends Lambda implements l<i0, i> {
    public final /* synthetic */ j0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPhotoViewModel$savePhoto$1(j0 j0Var) {
        super(1);
        this.c = j0Var;
    }

    public Object invoke(Object obj) {
        i0 i0Var = (i0) obj;
        m0.n.b.i.e(i0Var, "state");
        Uri uri = i0Var.c;
        if (uri != null) {
            j0 j0Var = this.c;
            MavericksViewModel.f(j0Var, new AddPhotoViewModel$savePhoto$1$1$1(j0Var, uri, (c<? super AddPhotoViewModel$savePhoto$1$1$1>) null), m0.c, (m) null, AddPhotoViewModel$savePhoto$1$1$2.c, 2, (Object) null);
        }
        return i.a;
    }
}
