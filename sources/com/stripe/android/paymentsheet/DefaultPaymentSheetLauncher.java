package com.stripe.android.paymentsheet;

import android.app.Activity;
import android.view.Window;
import androidx.core.app.ActivityOptionsCompat;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetContract;
import com.stripe.android.paymentsheet.analytics.SessionId;
import com.stripe.android.paymentsheet.model.PaymentIntentClientSecret;
import com.stripe.android.paymentsheet.model.SetupIntentClientSecret;
import h0.a.f.b;
import kotlin.Metadata;
import m0.n.a.a;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B%\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012¢\u0006\u0004\b\u0019\u0010\u001aB\u0019\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u0019\u0010\u001fB\u0019\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u0019\u0010\"B!\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u0019\u0010%J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher;", "Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "args", "Lm0/i;", "present", "(Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;)V", "", "paymentIntentClientSecret", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "configuration", "presentWithPaymentIntent", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V", "setupIntentClientSecret", "presentWithSetupIntent", "Lcom/stripe/android/paymentsheet/analytics/SessionId;", "sessionId", "Lcom/stripe/android/paymentsheet/analytics/SessionId;", "Lkotlin/Function0;", "", "statusBarColor", "Lm0/n/a/a;", "Lh0/a/f/b;", "activityResultLauncher", "Lh0/a/f/b;", "<init>", "(Lh0/a/f/b;Lm0/n/a/a;)V", "Landroidx/activity/ComponentActivity;", "activity", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "callback", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "(Landroidx/fragment/app/Fragment;Landroidx/activity/result/ActivityResultRegistry;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DefaultPaymentSheetLauncher.kt */
public final class DefaultPaymentSheetLauncher implements PaymentSheetLauncher {
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((f) null);
    private final b<PaymentSheetContract.Args> activityResultLauncher;
    private final SessionId sessionId;
    private final a<Integer> statusBarColor;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/DefaultPaymentSheetLauncher$Companion;", "", "Landroid/app/Activity;", "activity", "", "getStatusBarColor", "(Landroid/app/Activity;)Ljava/lang/Integer;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DefaultPaymentSheetLauncher.kt */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final Integer getStatusBarColor(Activity activity) {
            Window window;
            if (activity == null || (window = activity.getWindow()) == null) {
                return null;
            }
            return Integer.valueOf(window.getStatusBarColor());
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public DefaultPaymentSheetLauncher(b<PaymentSheetContract.Args> bVar, a<Integer> aVar) {
        i.e(bVar, "activityResultLauncher");
        i.e(aVar, "statusBarColor");
        this.activityResultLauncher = bVar;
        this.statusBarColor = aVar;
        this.sessionId = new SessionId();
    }

    private final void present(PaymentSheetContract.Args args) {
        this.activityResultLauncher.a(args, (ActivityOptionsCompat) null);
    }

    public void presentWithPaymentIntent(String str, PaymentSheet.Configuration configuration) {
        i.e(str, "paymentIntentClientSecret");
        present(new PaymentSheetContract.Args(new PaymentIntentClientSecret(str), this.sessionId, this.statusBarColor.invoke(), configuration));
    }

    public void presentWithSetupIntent(String str, PaymentSheet.Configuration configuration) {
        i.e(str, "setupIntentClientSecret");
        present(new PaymentSheetContract.Args(new SetupIntentClientSecret(str), this.sessionId, this.statusBarColor.invoke(), configuration));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DefaultPaymentSheetLauncher(final androidx.activity.ComponentActivity r3, final com.stripe.android.paymentsheet.PaymentSheetResultCallback r4) {
        /*
            r2 = this;
            java.lang.String r0 = "activity"
            m0.n.b.i.e(r3, r0)
            java.lang.String r0 = "callback"
            m0.n.b.i.e(r4, r0)
            com.stripe.android.paymentsheet.PaymentSheetContract r0 = new com.stripe.android.paymentsheet.PaymentSheetContract
            r0.<init>()
            com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher$1 r1 = new com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher$1
            r1.<init>(r4)
            h0.a.f.b r4 = r3.registerForActivityResult(r0, r1)
            java.lang.String r0 = "activity.registerForActi…SheetResult(it)\n        }"
            m0.n.b.i.d(r4, r0)
            com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher$2 r0 = new com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher$2
            r0.<init>(r3)
            r2.<init>((h0.a.f.b<com.stripe.android.paymentsheet.PaymentSheetContract.Args>) r4, (m0.n.a.a<java.lang.Integer>) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher.<init>(androidx.activity.ComponentActivity, com.stripe.android.paymentsheet.PaymentSheetResultCallback):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DefaultPaymentSheetLauncher(final androidx.fragment.app.Fragment r3, final com.stripe.android.paymentsheet.PaymentSheetResultCallback r4) {
        /*
            r2 = this;
            java.lang.String r0 = "fragment"
            m0.n.b.i.e(r3, r0)
            java.lang.String r0 = "callback"
            m0.n.b.i.e(r4, r0)
            com.stripe.android.paymentsheet.PaymentSheetContract r0 = new com.stripe.android.paymentsheet.PaymentSheetContract
            r0.<init>()
            com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher$3 r1 = new com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher$3
            r1.<init>(r4)
            h0.a.f.b r4 = r3.registerForActivityResult(r0, r1)
            java.lang.String r0 = "fragment.registerForActi…SheetResult(it)\n        }"
            m0.n.b.i.d(r4, r0)
            com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher$4 r0 = new com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher$4
            r0.<init>(r3)
            r2.<init>((h0.a.f.b<com.stripe.android.paymentsheet.PaymentSheetContract.Args>) r4, (m0.n.a.a<java.lang.Integer>) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher.<init>(androidx.fragment.app.Fragment, com.stripe.android.paymentsheet.PaymentSheetResultCallback):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DefaultPaymentSheetLauncher(final androidx.fragment.app.Fragment r3, androidx.activity.result.ActivityResultRegistry r4, final com.stripe.android.paymentsheet.PaymentSheetResultCallback r5) {
        /*
            r2 = this;
            java.lang.String r0 = "fragment"
            m0.n.b.i.e(r3, r0)
            java.lang.String r0 = "registry"
            m0.n.b.i.e(r4, r0)
            java.lang.String r0 = "callback"
            m0.n.b.i.e(r5, r0)
            com.stripe.android.paymentsheet.PaymentSheetContract r0 = new com.stripe.android.paymentsheet.PaymentSheetContract
            r0.<init>()
            com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher$5 r1 = new com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher$5
            r1.<init>(r5)
            h0.a.f.b r4 = r3.registerForActivityResult(r0, r4, r1)
            java.lang.String r5 = "fragment.registerForActi…SheetResult(it)\n        }"
            m0.n.b.i.d(r4, r5)
            com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher$6 r5 = new com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher$6
            r5.<init>(r3)
            r2.<init>((h0.a.f.b<com.stripe.android.paymentsheet.PaymentSheetContract.Args>) r4, (m0.n.a.a<java.lang.Integer>) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.DefaultPaymentSheetLauncher.<init>(androidx.fragment.app.Fragment, androidx.activity.result.ActivityResultRegistry, com.stripe.android.paymentsheet.PaymentSheetResultCallback):void");
    }
}
