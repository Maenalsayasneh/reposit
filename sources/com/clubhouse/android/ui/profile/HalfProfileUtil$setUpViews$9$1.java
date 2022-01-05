package com.clubhouse.android.ui.profile;

import android.content.Context;
import com.clubhouse.android.core.R;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.instabug.library.model.NetworkLog;
import i0.d.a.a.a;
import i0.e.b.g3.u.q4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$setUpViews$9$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$setUpViews$9$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        String str;
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        this.c.Q0().e("Share-Type-Profile", q4Var.b);
        Context requireContext = this.c.requireContext();
        m0.n.b.i.d(requireContext, "requireContext()");
        UserProfile userProfile = q4Var.k;
        if (userProfile == null) {
            str = null;
        } else {
            str = userProfile.i2;
        }
        m0.n.b.i.e(requireContext, "<this>");
        if (str != null) {
            a.e(requireContext, R.string.share_prompt, a.K("android.intent.action.SEND", NetworkLog.PLAIN_TEXT, "android.intent.extra.TEXT", str));
        }
        return i.a;
    }
}
