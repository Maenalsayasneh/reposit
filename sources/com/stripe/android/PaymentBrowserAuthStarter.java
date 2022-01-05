package com.stripe.android;

import android.os.Bundle;
import androidx.core.app.ActivityOptionsCompat;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization;
import com.stripe.android.view.AuthActivityStarter;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import h0.a.f.b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/PaymentBrowserAuthStarter;", "Lcom/stripe/android/view/AuthActivityStarter;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "Legacy", "Modern", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentBrowserAuthStarter.kt */
public interface PaymentBrowserAuthStarter extends AuthActivityStarter<PaymentBrowserAuthContract.Args> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/PaymentBrowserAuthStarter$Legacy;", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "args", "Lm0/i;", "start", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V", "", "hasCompatibleBrowser", "Z", "Lcom/stripe/android/view/AuthActivityStarter$Host;", "host", "Lcom/stripe/android/view/AuthActivityStarter$Host;", "Lcom/stripe/android/payments/DefaultReturnUrl;", "defaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "<init>", "(Lcom/stripe/android/view/AuthActivityStarter$Host;ZLcom/stripe/android/payments/DefaultReturnUrl;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentBrowserAuthStarter.kt */
    public static final class Legacy implements PaymentBrowserAuthStarter {
        private final DefaultReturnUrl defaultReturnUrl;
        private final boolean hasCompatibleBrowser;
        private final AuthActivityStarter.Host host;

        public Legacy(AuthActivityStarter.Host host2, boolean z, DefaultReturnUrl defaultReturnUrl2) {
            i.e(host2, "host");
            i.e(defaultReturnUrl2, "defaultReturnUrl");
            this.host = host2;
            this.hasCompatibleBrowser = z;
            this.defaultReturnUrl = defaultReturnUrl2;
        }

        public void start(PaymentBrowserAuthContract.Args args) {
            Class cls;
            PaymentBrowserAuthContract.Args args2 = args;
            i.e(args2, "args");
            Bundle bundle = PaymentBrowserAuthContract.Args.copy$default(args, (String) null, 0, (String) null, (String) null, (String) null, false, (StripeToolbarCustomization) null, (String) null, false, false, this.host.getStatusBarColor(), 1023, (Object) null).toBundle();
            boolean z = this.hasCompatibleBrowser && args2.hasDefaultReturnUrl$payments_core_release(this.defaultReturnUrl);
            AuthActivityStarter.Host host2 = this.host;
            if (z) {
                cls = StripeBrowserLauncherActivity.class;
            } else if (!z) {
                cls = PaymentAuthWebViewActivity.class;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            host2.startActivityForResult$payments_core_release(cls, bundle, args.getRequestCode());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/PaymentBrowserAuthStarter$Modern;", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "args", "Lm0/i;", "start", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V", "Lh0/a/f/b;", "launcher", "Lh0/a/f/b;", "<init>", "(Lh0/a/f/b;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentBrowserAuthStarter.kt */
    public static final class Modern implements PaymentBrowserAuthStarter {
        private final b<PaymentBrowserAuthContract.Args> launcher;

        public Modern(b<PaymentBrowserAuthContract.Args> bVar) {
            i.e(bVar, "launcher");
            this.launcher = bVar;
        }

        public void start(PaymentBrowserAuthContract.Args args) {
            i.e(args, "args");
            this.launcher.a(args, (ActivityOptionsCompat) null);
        }
    }
}
