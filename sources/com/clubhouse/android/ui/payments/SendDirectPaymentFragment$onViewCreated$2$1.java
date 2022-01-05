package com.clubhouse.android.ui.payments;

import android.os.Bundle;
import com.clubhouse.android.core.ui.WrappedBottomSheetArgs;
import com.clubhouse.android.ui.profile.ProfilePhotoArgs;
import com.clubhouse.android.ui.profile.ProfilePhotoFragment;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.s.b1;
import i0.e.b.g3.s.z0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: SendDirectPaymentFragment.kt */
public final class SendDirectPaymentFragment$onViewCreated$2$1 extends Lambda implements l<b1, i> {
    public final /* synthetic */ SendDirectPaymentFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendDirectPaymentFragment$onViewCreated$2$1(SendDirectPaymentFragment sendDirectPaymentFragment) {
        super(1);
        this.c = sendDirectPaymentFragment;
    }

    public Object invoke(Object obj) {
        b1 b1Var = (b1) obj;
        m0.n.b.i.e(b1Var, "state");
        String str = b1Var.a.w2;
        if (str != null) {
            SendDirectPaymentFragment sendDirectPaymentFragment = this.c;
            ProfilePhotoArgs profilePhotoArgs = new ProfilePhotoArgs(str, 0.68f);
            m0.n.b.i.e(profilePhotoArgs, "arg");
            Bundle bundle = new Bundle();
            bundle.putParcelable("mavericks:arg", profilePhotoArgs);
            WrappedBottomSheetArgs wrappedBottomSheetArgs = new WrappedBottomSheetArgs(ProfilePhotoFragment.class, bundle);
            m0.n.b.i.e(wrappedBottomSheetArgs, "mavericksArg");
            v.a1(sendDirectPaymentFragment, new z0(wrappedBottomSheetArgs), (q) null, 2);
        }
        return i.a;
    }
}
