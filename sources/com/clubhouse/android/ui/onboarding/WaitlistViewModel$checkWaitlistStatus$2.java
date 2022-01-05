package com.clubhouse.android.ui.onboarding;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse;
import com.clubhouse.android.ui.onboarding.InvitedByFragment;
import com.clubhouse.android.user.model.UserSelf;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.a;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f;
import i0.b.b.f0;
import i0.e.b.g3.r.p1;
import i0.e.b.g3.r.r2;
import i0.e.b.g3.r.s2;
import i0.e.b.g3.r.u2;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: WaitlistViewModel.kt */
public final class WaitlistViewModel$checkWaitlistStatus$2 extends Lambda implements p<u2, b<? extends CompletePhoneNumberAuthResponse>, u2> {
    public final /* synthetic */ WaitlistViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaitlistViewModel$checkWaitlistStatus$2(WaitlistViewModel waitlistViewModel) {
        super(2);
        this.c = waitlistViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        String str4;
        u2 u2Var = (u2) obj;
        b bVar = (b) obj2;
        i.e(u2Var, "$this$execute");
        i.e(bVar, "it");
        boolean z = false;
        if (bVar instanceof f0) {
            CompletePhoneNumberAuthResponse completePhoneNumberAuthResponse = (CompletePhoneNumberAuthResponse) ((f0) bVar).b;
            ((AmplitudeAnalytics) this.c.n).a("Onboarding-RemovedFromWaitlist");
            if (v.w0(completePhoneNumberAuthResponse)) {
                WaitlistViewModel waitlistViewModel = this.c;
                BasicUser basicUser = completePhoneNumberAuthResponse.j;
                if (basicUser == null) {
                    str = null;
                } else {
                    str = basicUser.d;
                }
                if (basicUser == null) {
                    str2 = null;
                } else {
                    str2 = basicUser.x;
                }
                ClubWithAdmin clubWithAdmin = completePhoneNumberAuthResponse.k;
                if (clubWithAdmin == null) {
                    str3 = null;
                } else {
                    str3 = clubWithAdmin.y;
                }
                if (clubWithAdmin == null) {
                    str4 = null;
                } else {
                    str4 = clubWithAdmin.d2;
                }
                InvitedByFragment.BundleInfo bundleInfo = new InvitedByFragment.BundleInfo(str, str2, str3, str4);
                i.e(bundleInfo, "mavericksArg");
                waitlistViewModel.o(new p1(new s2(bundleInfo)));
            } else {
                UserSelf value = this.c.o.d.getValue();
                if (value != null && value.b()) {
                    z = true;
                }
                if (z) {
                    WaitlistViewModel waitlistViewModel2 = this.c;
                    CollectNameArgs collectNameArgs = new CollectNameArgs((BasicUser) null, 1);
                    i.e(collectNameArgs, "mavericksArg");
                    waitlistViewModel2.o(new p1(new r2(collectNameArgs)));
                } else {
                    this.c.o(new p1(new a(R.id.action_waitlistFragment_to_addPhotoFragment)));
                }
            }
            return u2.copy$default(u2Var, (String) null, true, 1, (Object) null);
        } else if (bVar instanceof c) {
            return u2.copy$default(u2Var, (String) null, false, 1, (Object) null);
        } else {
            return u2.copy$default(u2Var, (String) null, bVar instanceof f, 1, (Object) null);
        }
    }
}
