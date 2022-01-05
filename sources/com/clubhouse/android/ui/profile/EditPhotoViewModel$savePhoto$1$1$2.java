package com.clubhouse.android.ui.profile;

import android.net.Uri;
import com.clubhouse.android.data.models.remote.response.UpdatePhotoResponse;
import com.clubhouse.android.shared.auth.AccessCredential;
import com.clubhouse.android.shared.auth.UserManager;
import com.clubhouse.android.user.model.UserSelf;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.u.a4;
import i0.e.b.g3.u.f4;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;
import n0.a.g2.q;

/* compiled from: EditPhotoViewModel.kt */
public final class EditPhotoViewModel$savePhoto$1$1$2 extends Lambda implements p<f4, b<? extends UpdatePhotoResponse>, f4> {
    public final /* synthetic */ EditPhotoViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditPhotoViewModel$savePhoto$1$1$2(EditPhotoViewModel editPhotoViewModel) {
        super(2);
        this.c = editPhotoViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        f4 f4Var = (f4) obj;
        b bVar = (b) obj2;
        i.e(f4Var, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            String str = ((UpdatePhotoResponse) ((f0) bVar).b).b;
            UserManager userManager = this.c.p;
            UserSelf userSelf = (UserSelf) ((q) userManager.d).getValue();
            if (userSelf != null) {
                UserSelf a = UserSelf.a(userSelf, 0, (String) null, (String) null, str, (AccessCredential) null, 23);
                userManager.a.b(a);
                ((q) userManager.d).setValue(a);
            }
            this.c.o(new a4(str));
        } else if (bVar instanceof c) {
            EditPhotoViewModel editPhotoViewModel = this.c;
            d dVar = new d(((c) bVar).b.getMessage());
            int i = EditPhotoViewModel.m;
            editPhotoViewModel.o(dVar);
        }
        return f4.copy$default(f4Var, bVar, (Uri) null, (String) null, 6, (Object) null);
    }
}
