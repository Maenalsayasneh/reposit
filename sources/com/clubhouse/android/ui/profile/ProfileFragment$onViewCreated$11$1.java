package com.clubhouse.android.ui.profile;

import android.content.Context;
import com.clubhouse.android.core.R;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.instabug.library.model.NetworkLog;
import i0.e.a.b.a;
import i0.e.b.g3.u.c5;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$onViewCreated$11$1 extends Lambda implements l<c5, i> {
    public final /* synthetic */ ProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$onViewCreated$11$1(ProfileFragment profileFragment) {
        super(1);
        this.c = profileFragment;
    }

    public Object invoke(Object obj) {
        c5 c5Var = (c5) obj;
        m0.n.b.i.e(c5Var, "state");
        UserProfile userProfile = c5Var.l;
        if (userProfile != null) {
            ProfileFragment profileFragment = this.c;
            a aVar = profileFragment.d2;
            if (aVar != null) {
                aVar.e("Share-Type-Profile", c5Var.b);
                Context requireContext = profileFragment.requireContext();
                m0.n.b.i.d(requireContext, "requireContext()");
                String str = userProfile.i2;
                m0.n.b.i.e(requireContext, "<this>");
                if (str != null) {
                    i0.d.a.a.a.e(requireContext, R.string.share_prompt, i0.d.a.a.a.K("android.intent.action.SEND", NetworkLog.PLAIN_TEXT, "android.intent.extra.TEXT", str));
                }
            } else {
                m0.n.b.i.m("actionTrailRecorder");
                throw null;
            }
        }
        return i.a;
    }
}
