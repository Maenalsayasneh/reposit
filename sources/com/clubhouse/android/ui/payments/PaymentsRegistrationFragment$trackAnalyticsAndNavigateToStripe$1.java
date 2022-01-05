package com.clubhouse.android.ui.payments;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.BundleCompat;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.GetPaymentRegistrationResponse;
import h0.b0.v;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f;
import i0.b.b.g0;
import i0.e.a.a;
import i0.e.b.g3.s.r0;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;
import m0.r.k;

/* compiled from: PaymentsRegistrationFragment.kt */
public final class PaymentsRegistrationFragment$trackAnalyticsAndNavigateToStripe$1 extends Lambda implements l<r0, i> {
    public final /* synthetic */ PaymentsRegistrationFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentsRegistrationFragment$trackAnalyticsAndNavigateToStripe$1(PaymentsRegistrationFragment paymentsRegistrationFragment) {
        super(1);
        this.c = paymentsRegistrationFragment;
    }

    public Object invoke(Object obj) {
        Map map;
        RegistrationStatus registrationStatus;
        r0 r0Var = (r0) obj;
        m0.n.b.i.e(r0Var, "state");
        a l = v.l(this.c);
        PaymentsRegistrationFragment paymentsRegistrationFragment = this.c;
        k<Object>[] kVarArr = PaymentsRegistrationFragment.Z1;
        Objects.requireNonNull(paymentsRegistrationFragment);
        b<GetPaymentRegistrationResponse> bVar = r0Var.e;
        if ((bVar instanceof g0) || (bVar instanceof c) || (bVar instanceof f) || (registrationStatus = r0Var.a) == RegistrationStatus.NeedsEmailVerification) {
            map = g.o();
        } else {
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("is_active", Boolean.valueOf(registrationStatus == RegistrationStatus.Active));
            pairArr[1] = new Pair("needs_action", Boolean.valueOf(r0Var.a == RegistrationStatus.NeedsAction));
            pairArr[2] = new Pair("is_registered", Boolean.valueOf(r0Var.b));
            pairArr[3] = new Pair("is_enabled", Boolean.valueOf(r0Var.c));
            map = g.N(pairArr);
        }
        ((AmplitudeAnalytics) l).b("DirectPayments-NavigateToStripe", map);
        PaymentsRegistrationFragment paymentsRegistrationFragment2 = this.c;
        String str = r0Var.d;
        Objects.requireNonNull(paymentsRegistrationFragment2);
        if (str != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                    Bundle bundle = new Bundle();
                    BundleCompat.putBinder(bundle, "android.support.customtabs.extra.SESSION", (IBinder) null);
                    intent.putExtras(bundle);
                }
                intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                intent.putExtras(new Bundle());
                intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                Context requireContext = paymentsRegistrationFragment2.requireContext();
                intent.setData(Uri.parse(str));
                h0.i.b.a.startActivity(requireContext, intent, (Bundle) null);
            } catch (ActivityNotFoundException unused) {
                m0.n.b.i.e(paymentsRegistrationFragment2, "<this>");
                Context requireContext2 = paymentsRegistrationFragment2.requireContext();
                m0.n.b.i.d(requireContext2, "requireContext()");
                m0.n.b.i.e(requireContext2, "<this>");
                requireContext2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
        }
        return i.a;
    }
}
