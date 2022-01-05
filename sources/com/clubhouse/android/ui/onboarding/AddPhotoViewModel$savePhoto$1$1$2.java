package com.clubhouse.android.ui.onboarding;

import android.net.Uri;
import com.clubhouse.android.data.models.remote.response.UpdatePhotoResponse;
import h0.t.l;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.g3.r.i0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: AddPhotoViewModel.kt */
public final class AddPhotoViewModel$savePhoto$1$1$2 extends Lambda implements p<i0, b<? extends UpdatePhotoResponse>, i0> {
    public static final AddPhotoViewModel$savePhoto$1$1$2 c = new AddPhotoViewModel$savePhoto$1$1$2();

    public AddPhotoViewModel$savePhoto$1$1$2() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        i0 i0Var = (i0) obj;
        b bVar = (b) obj2;
        i.e(i0Var, "$this$execute");
        i.e(bVar, "it");
        return i0.copy$default(i0Var, (l) null, bVar, (Uri) null, bVar instanceof f0, 5, (Object) null);
    }
}
