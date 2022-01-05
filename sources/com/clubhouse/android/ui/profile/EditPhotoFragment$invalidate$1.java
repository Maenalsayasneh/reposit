package com.clubhouse.android.ui.profile;

import android.net.Uri;
import android.widget.Button;
import android.widget.ProgressBar;
import com.clubhouse.android.shared.ui.AvatarView;
import h0.b0.v;
import i0.b.b.f;
import i0.e.b.g3.u.f4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.o.c;
import m0.r.k;

/* compiled from: EditPhotoFragment.kt */
public final class EditPhotoFragment$invalidate$1 extends Lambda implements l<f4, i> {
    public final /* synthetic */ EditPhotoFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditPhotoFragment$invalidate$1(EditPhotoFragment editPhotoFragment) {
        super(1);
        this.c = editPhotoFragment;
    }

    public Object invoke(Object obj) {
        i iVar;
        f4 f4Var = (f4) obj;
        m0.n.b.i.e(f4Var, "state");
        EditPhotoFragment editPhotoFragment = this.c;
        k<Object>[] kVarArr = EditPhotoFragment.e2;
        ProgressBar progressBar = editPhotoFragment.R0().c;
        m0.n.b.i.d(progressBar, "binding.loading");
        boolean z = false;
        progressBar.setVisibility(f4Var.a instanceof f ? 0 : 8);
        this.c.R0().b.setEnabled(f4Var.b != null);
        Button button = this.c.R0().b;
        m0.n.b.i.d(button, "binding.done");
        if (f4Var.b != null) {
            z = true;
        }
        i0.e.b.d3.k.k(button, Boolean.valueOf(z));
        Uri uri = f4Var.b;
        if (uri == null) {
            iVar = null;
        } else {
            AvatarView avatarView = this.c.R0().a;
            m0.n.b.i.d(avatarView, "binding.addPhotoButton");
            v.P0(avatarView, uri);
            iVar = i.a;
        }
        if (iVar == null) {
            EditPhotoFragment editPhotoFragment2 = this.c;
            c cVar = editPhotoFragment2.h2;
            k<Object>[] kVarArr2 = EditPhotoFragment.e2;
            if (((EditPhotoArgs) cVar.getValue(editPhotoFragment2, kVarArr2[2])).c != null) {
                AvatarView avatarView2 = editPhotoFragment2.R0().a;
                m0.n.b.i.d(avatarView2, "binding.addPhotoButton");
                v.Q0(avatarView2, ((EditPhotoArgs) editPhotoFragment2.h2.getValue(editPhotoFragment2, kVarArr2[2])).c);
            }
        }
        return i.a;
    }
}
