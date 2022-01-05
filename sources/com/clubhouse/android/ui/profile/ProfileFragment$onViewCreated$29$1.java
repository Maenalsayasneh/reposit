package com.clubhouse.android.ui.profile;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.app.R;
import h0.q.p;
import h0.q.q;
import i0.e.b.g3.u.c5;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.r.t.a.r.m.a1.a;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$onViewCreated$29$1 extends Lambda implements l<c5, i> {
    public final /* synthetic */ ProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$onViewCreated$29$1(ProfileFragment profileFragment) {
        super(1);
        this.c = profileFragment;
    }

    public Object invoke(Object obj) {
        c5 c5Var = (c5) obj;
        m0.n.b.i.e(c5Var, "state");
        UserProfile userProfile = c5Var.l;
        if (userProfile != null) {
            ProfileFragment profileFragment = this.c;
            if (c5Var.p) {
                String str = userProfile.q;
                if (str == null || StringsKt__IndentKt.o(str)) {
                    p viewLifecycleOwner = profileFragment.getViewLifecycleOwner();
                    m0.n.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
                    a.E2(q.a(viewLifecycleOwner), (e) null, (CoroutineStart) null, new ProfileFragment$onViewCreated$29$1$1$1(profileFragment, (c<? super ProfileFragment$onViewCreated$29$1$1$1>) null), 3, (Object) null);
                }
            }
            String str2 = userProfile.q;
            if (!(str2 == null || StringsKt__IndentKt.o(str2))) {
                String string = profileFragment.requireContext().getString(R.string.twitter, new Object[]{userProfile.q});
                m0.n.b.i.e(profileFragment, "<this>");
                Context requireContext = profileFragment.requireContext();
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
