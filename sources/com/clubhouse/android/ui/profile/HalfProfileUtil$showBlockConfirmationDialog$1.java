package com.clubhouse.android.ui.profile;

import androidx.fragment.app.Fragment;
import com.clubhouse.android.user.model.User;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.a3.b.a;
import i0.e.b.g3.u.r1;
import i0.e.b.g3.u.s1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$showBlockConfirmationDialog$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ User d;
    public final /* synthetic */ a<?> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$showBlockConfirmationDialog$1(Fragment fragment, User user, a<?> aVar) {
        super(1);
        this.c = fragment;
        this.d = user;
        this.q = aVar;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.a.d = this.c.getString(R.string.block_confirmation_title, this.d.getName());
        aVar.b(R.string.block_confirmation_body);
        aVar.d(R.string.block, new s1(this.q, this.d));
        aVar.c(R.string.cancel, r1.c);
        return i.a;
    }
}
