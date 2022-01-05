package com.stripe.android.stripe3ds2.transaction;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Keep;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0013J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/Stripe3ds2ActivityStarterHost;", "", "Landroid/content/Intent;", "intent", "Lm0/i;", "startActivity$3ds2sdk_release", "(Landroid/content/Intent;)V", "startActivity", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/Fragment;", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "getActivity$3ds2sdk_release", "()Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;Landroidx/fragment/app/Fragment;)V", "(Landroidx/fragment/app/Fragment;)V", "(Landroid/app/Activity;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
@Keep
/* compiled from: Stripe3ds2ActivityStarterHost.kt */
public final class Stripe3ds2ActivityStarterHost {
    private final Activity activity;
    private final Fragment fragment;

    private Stripe3ds2ActivityStarterHost(Activity activity2, Fragment fragment2) {
        this.activity = activity2;
        this.fragment = fragment2;
    }

    public final Activity getActivity$3ds2sdk_release() {
        return this.activity;
    }

    public final void startActivity$3ds2sdk_release(Intent intent) {
        i.e(intent, "intent");
        Fragment fragment2 = this.fragment;
        if (fragment2 == null) {
            this.activity.startActivity(intent);
        } else if (fragment2.isAdded()) {
            this.fragment.startActivity(intent);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Stripe3ds2ActivityStarterHost(androidx.fragment.app.Fragment r3) {
        /*
            r2 = this;
            java.lang.String r0 = "fragment"
            m0.n.b.i.e(r3, r0)
            h0.o.a.k r0 = r3.requireActivity()
            java.lang.String r1 = "fragment.requireActivity()"
            m0.n.b.i.d(r0, r1)
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.Stripe3ds2ActivityStarterHost.<init>(androidx.fragment.app.Fragment):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Stripe3ds2ActivityStarterHost(Activity activity2) {
        this(activity2, (Fragment) null);
        i.e(activity2, "activity");
    }
}
