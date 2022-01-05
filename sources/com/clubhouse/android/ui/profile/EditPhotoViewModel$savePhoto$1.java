package com.clubhouse.android.ui.profile;

import android.net.Uri;
import com.airbnb.mvrx.MavericksViewModel;
import i0.e.b.g3.u.f4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.r.m;
import n0.a.m0;

/* compiled from: EditPhotoViewModel.kt */
public final class EditPhotoViewModel$savePhoto$1 extends Lambda implements l<f4, i> {
    public final /* synthetic */ EditPhotoViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditPhotoViewModel$savePhoto$1(EditPhotoViewModel editPhotoViewModel) {
        super(1);
        this.c = editPhotoViewModel;
    }

    public Object invoke(Object obj) {
        f4 f4Var = (f4) obj;
        m0.n.b.i.e(f4Var, "state");
        Uri uri = f4Var.b;
        if (uri != null) {
            EditPhotoViewModel editPhotoViewModel = this.c;
            MavericksViewModel.f(editPhotoViewModel, new EditPhotoViewModel$savePhoto$1$1$1(editPhotoViewModel, uri, (c<? super EditPhotoViewModel$savePhoto$1$1$1>) null), m0.c, (m) null, new EditPhotoViewModel$savePhoto$1$1$2(editPhotoViewModel), 2, (Object) null);
        }
        return i.a;
    }
}
