package com.clubhouse.android.ui.profile;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.ActivityOptionsCompat;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.app.R;
import h0.a.f.b;
import i0.e.b.g3.u.q4;
import i0.e.b.g3.u.w4;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__IndentKt;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$setUpViews$40$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$setUpViews$40$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        UserProfile userProfile = q4Var.k;
        if (userProfile != null) {
            HalfProfileFragment halfProfileFragment = this.c;
            if (q4Var.o) {
                String str = userProfile.x;
                if (str == null || StringsKt__IndentKt.o(str)) {
                    halfProfileFragment.U0().p(w4.a);
                    b<Intent> bVar = halfProfileFragment.l2;
                    if (bVar != null) {
                        bVar.a(halfProfileFragment.U0().o.a(), (ActivityOptionsCompat) null);
                    } else {
                        m0.n.b.i.m("getInstagramOAuthToken");
                        throw null;
                    }
                }
            }
            String str2 = userProfile.x;
            if (!(str2 == null || StringsKt__IndentKt.o(str2))) {
                String string = halfProfileFragment.requireContext().getString(R.string.instagram, new Object[]{userProfile.x});
                m0.n.b.i.e(halfProfileFragment, "<this>");
                Context requireContext = halfProfileFragment.requireContext();
                m0.n.b.i.d(requireContext, "requireContext()");
                m0.n.b.i.e(requireContext, "<this>");
                if (string != null) {
                    requireContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
                }
            }
        }
        return i.a;
    }
}
