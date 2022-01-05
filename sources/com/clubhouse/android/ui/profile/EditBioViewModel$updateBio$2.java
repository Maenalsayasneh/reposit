package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.b.b.b;
import i0.e.b.g3.u.c4;
import i0.e.b.g3.u.z3;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: EditBioViewModel.kt */
public final class EditBioViewModel$updateBio$2 extends Lambda implements p<c4, b<? extends EmptySuccessResponse>, c4> {
    public final /* synthetic */ EditBioViewModel c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditBioViewModel$updateBio$2(EditBioViewModel editBioViewModel, String str) {
        super(2);
        this.c = editBioViewModel;
        this.d = str;
    }

    public Object invoke(Object obj, Object obj2) {
        i.e((c4) obj, "$this$execute");
        i.e((b) obj2, "it");
        this.c.o(new z3(this.d));
        String str = this.d;
        i.e(str, "bio");
        return new c4(str);
    }
}
