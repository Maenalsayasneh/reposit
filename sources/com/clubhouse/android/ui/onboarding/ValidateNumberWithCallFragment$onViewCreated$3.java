package com.clubhouse.android.ui.onboarding;

import android.widget.TextView;
import com.afollestad.assent.AssentResult;
import com.afollestad.assent.Permission;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.g3.r.u1;
import i0.e.b.g3.r.v1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: ValidateNumberWithCallFragment.kt */
public final class ValidateNumberWithCallFragment$onViewCreated$3 extends Lambda implements l<AssentResult, i> {
    public final /* synthetic */ ValidateNumberWithCallFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidateNumberWithCallFragment$onViewCreated$3(ValidateNumberWithCallFragment validateNumberWithCallFragment) {
        super(1);
        this.c = validateNumberWithCallFragment;
    }

    public Object invoke(Object obj) {
        AssentResult assentResult = (AssentResult) obj;
        m0.n.b.i.e(assentResult, "it");
        if (assentResult.b().contains(Permission.READ_CALL_LOG)) {
            ((AmplitudeAnalytics) v.l(this.c)).a("Onboarding-PhoneVerifyCall-ReadCallPermissionAccepted");
            ValidateNumberWithCallFragment validateNumberWithCallFragment = this.c;
            k<Object>[] kVarArr = ValidateNumberWithCallFragment.Z1;
            TextView textView = validateNumberWithCallFragment.N0().d;
            m0.n.b.i.d(textView, "binding.permissionTitle");
            i0.e.b.d3.k.p(textView);
            TextView textView2 = validateNumberWithCallFragment.N0().c;
            m0.n.b.i.d(textView2, "binding.permissionBody");
            i0.e.b.d3.k.p(textView2);
            TextView textView3 = validateNumberWithCallFragment.N0().b;
            m0.n.b.i.d(textView3, "binding.permissionBanner");
            i0.e.b.d3.k.p(textView3);
            validateNumberWithCallFragment.N0().f.setText(validateNumberWithCallFragment.getString(R.string.were_verifying_your_number, ((ValidateNumberArgs) validateNumberWithCallFragment.c2.getValue(validateNumberWithCallFragment, ValidateNumberWithCallFragment.Z1[2])).c));
            TextView textView4 = validateNumberWithCallFragment.N0().g;
            m0.n.b.i.d(textView4, "binding.waitingForCallTitle");
            i0.e.b.d3.k.K(textView4);
            TextView textView5 = validateNumberWithCallFragment.N0().f;
            m0.n.b.i.d(textView5, "binding.verifyingYourNumber");
            i0.e.b.d3.k.K(textView5);
            TextView textView6 = validateNumberWithCallFragment.N0().e;
            m0.n.b.i.d(textView6, "binding.processAutomatically");
            i0.e.b.d3.k.K(textView6);
            ((ValidateNumberWithCallViewModel) this.c.b2.getValue()).p(v1.a);
        } else {
            ((AmplitudeAnalytics) v.l(this.c)).a("Onboarding-PhoneVerifyCall-ReadCallPermissionDenied");
            ((ValidateNumberWithCallViewModel) this.c.b2.getValue()).p(u1.a);
        }
        return i.a;
    }
}
