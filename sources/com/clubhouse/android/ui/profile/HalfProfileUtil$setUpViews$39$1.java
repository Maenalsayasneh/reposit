package com.clubhouse.android.ui.profile;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.app.R;
import h0.q.p;
import h0.q.q;
import i0.e.b.g3.u.q4;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.r.t.a.r.m.a1.a;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$setUpViews$39$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$setUpViews$39$1(HalfProfileFragment halfProfileFragment) {
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
                String str = userProfile.q;
                if (str == null || StringsKt__IndentKt.o(str)) {
                    p viewLifecycleOwner = halfProfileFragment.getViewLifecycleOwner();
                    m0.n.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
                    a.E2(q.a(viewLifecycleOwner), (e) null, (CoroutineStart) null, new HalfProfileUtil$setUpViews$39$1$1$1(halfProfileFragment, (c<? super HalfProfileUtil$setUpViews$39$1$1$1>) null), 3, (Object) null);
                }
            }
            String str2 = userProfile.q;
            if (!(str2 == null || StringsKt__IndentKt.o(str2))) {
                String string = halfProfileFragment.requireContext().getString(R.string.twitter, new Object[]{userProfile.q});
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
