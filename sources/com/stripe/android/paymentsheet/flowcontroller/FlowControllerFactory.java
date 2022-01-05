package com.stripe.android.paymentsheet.flowcontroller;

import android.content.Context;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.paymentsheet.PaymentOptionCallback;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import com.stripe.android.paymentsheet.analytics.DefaultEventReporter;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.SessionId;
import com.stripe.android.paymentsheet.model.PaymentOptionFactory;
import com.stripe.android.view.AuthActivityStarter;
import h0.q.o0;
import kotlin.Metadata;
import m0.l.c;
import m0.l.e;
import m0.n.a.a;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.f0;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b \u0010!B!\b\u0016\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b \u0010$B!\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b \u0010'J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u001e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006("}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerFactory;", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "create", "()Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "Lkotlin/Function0;", "", "statusBarColor", "Lm0/n/a/a;", "Lcom/stripe/android/view/AuthActivityStarter$Host;", "authHostSupplier", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "paymentOptionCallback", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "paymentOptionFactory", "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "Lh0/q/o0;", "viewModelStoreOwner", "Lh0/q/o0;", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "paymentResultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "Ln0/a/f0;", "lifecycleScope", "Ln0/a/f0;", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory;", "activityLauncherFactory", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory;", "<init>", "(Lh0/q/o0;Ln0/a/f0;Landroid/content/Context;Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory;Lm0/n/a/a;Lm0/n/a/a;Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "Landroidx/activity/ComponentActivity;", "activity", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FlowControllerFactory.kt */
public final class FlowControllerFactory {
    private final ActivityLauncherFactory activityLauncherFactory;
    /* access modifiers changed from: private */
    public final Context appContext;
    private final a<AuthActivityStarter.Host> authHostSupplier;
    private final f0 lifecycleScope;
    private final PaymentOptionCallback paymentOptionCallback;
    private final PaymentOptionFactory paymentOptionFactory;
    private final PaymentSheetResultCallback paymentResultCallback;
    private final a<Integer> statusBarColor;
    private final o0 viewModelStoreOwner;

    public FlowControllerFactory(o0 o0Var, f0 f0Var, Context context, ActivityLauncherFactory activityLauncherFactory2, a<Integer> aVar, a<AuthActivityStarter.Host> aVar2, PaymentOptionFactory paymentOptionFactory2, PaymentOptionCallback paymentOptionCallback2, PaymentSheetResultCallback paymentSheetResultCallback) {
        i.e(o0Var, "viewModelStoreOwner");
        i.e(f0Var, "lifecycleScope");
        i.e(context, "appContext");
        i.e(activityLauncherFactory2, "activityLauncherFactory");
        i.e(aVar, "statusBarColor");
        i.e(aVar2, "authHostSupplier");
        i.e(paymentOptionFactory2, "paymentOptionFactory");
        i.e(paymentOptionCallback2, "paymentOptionCallback");
        i.e(paymentSheetResultCallback, "paymentResultCallback");
        this.viewModelStoreOwner = o0Var;
        this.lifecycleScope = f0Var;
        this.appContext = context;
        this.activityLauncherFactory = activityLauncherFactory2;
        this.statusBarColor = aVar;
        this.authHostSupplier = aVar2;
        this.paymentOptionFactory = paymentOptionFactory2;
        this.paymentOptionCallback = paymentOptionCallback2;
        this.paymentResultCallback = paymentSheetResultCallback;
    }

    public final PaymentSheet.FlowController create() {
        SessionId sessionId = new SessionId();
        FlowControllerFactory$create$paymentControllerFactory$1 flowControllerFactory$create$paymentControllerFactory$1 = new FlowControllerFactory$create$paymentControllerFactory$1(this);
        FlowControllerFactory$create$isGooglePayReadySupplier$1 flowControllerFactory$create$isGooglePayReadySupplier$1 = new FlowControllerFactory$create$isGooglePayReadySupplier$1(this, (c) null);
        FlowControllerFactory$create$prefsRepositoryFactory$1 flowControllerFactory$create$prefsRepositoryFactory$1 = new FlowControllerFactory$create$prefsRepositoryFactory$1(this);
        Context context = this.appContext;
        o0 o0Var = this.viewModelStoreOwner;
        f0 f0Var = this.lifecycleScope;
        ActivityLauncherFactory activityLauncherFactory2 = this.activityLauncherFactory;
        a<Integer> aVar = this.statusBarColor;
        a<AuthActivityStarter.Host> aVar2 = this.authHostSupplier;
        PaymentOptionFactory paymentOptionFactory2 = this.paymentOptionFactory;
        DefaultFlowControllerInitializer defaultFlowControllerInitializer = new DefaultFlowControllerInitializer(flowControllerFactory$create$prefsRepositoryFactory$1, flowControllerFactory$create$isGooglePayReadySupplier$1, m0.c);
        FlowControllerFactory$create$1 flowControllerFactory$create$1 = new FlowControllerFactory$create$1(this);
        DefaultFlowControllerInitializer defaultFlowControllerInitializer2 = defaultFlowControllerInitializer;
        PaymentOptionFactory paymentOptionFactory3 = paymentOptionFactory2;
        DefaultEventReporter defaultEventReporter = new DefaultEventReporter(EventReporter.Mode.Custom, sessionId, this.appContext, (e) null, 8, (f) null);
        DefaultReturnUrl create = DefaultReturnUrl.Companion.create(this.appContext);
        PaymentOptionCallback paymentOptionCallback2 = this.paymentOptionCallback;
        return new DefaultFlowController(context, o0Var, f0Var, activityLauncherFactory2, aVar, aVar2, paymentOptionFactory3, defaultFlowControllerInitializer2, flowControllerFactory$create$paymentControllerFactory$1, flowControllerFactory$create$1, defaultEventReporter, sessionId, create, paymentOptionCallback2, this.paymentResultCallback);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FlowControllerFactory(final androidx.activity.ComponentActivity r12, com.stripe.android.paymentsheet.PaymentOptionCallback r13, com.stripe.android.paymentsheet.PaymentSheetResultCallback r14) {
        /*
            r11 = this;
            java.lang.String r0 = "activity"
            m0.n.b.i.e(r12, r0)
            java.lang.String r0 = "paymentOptionCallback"
            m0.n.b.i.e(r13, r0)
            java.lang.String r0 = "paymentResultCallback"
            m0.n.b.i.e(r14, r0)
            androidx.lifecycle.LifecycleCoroutineScope r3 = h0.q.q.a(r12)
            android.content.Context r4 = r12.getApplicationContext()
            java.lang.String r0 = "activity.applicationContext"
            m0.n.b.i.d(r4, r0)
            com.stripe.android.paymentsheet.flowcontroller.ActivityLauncherFactory$ActivityHost r5 = new com.stripe.android.paymentsheet.flowcontroller.ActivityLauncherFactory$ActivityHost
            r5.<init>(r12)
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$1 r6 = new com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$1
            r6.<init>(r12)
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$2 r7 = new com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$2
            r7.<init>(r12)
            com.stripe.android.paymentsheet.model.PaymentOptionFactory r8 = new com.stripe.android.paymentsheet.model.PaymentOptionFactory
            android.content.res.Resources r0 = r12.getResources()
            java.lang.String r1 = "activity.resources"
            m0.n.b.i.d(r0, r1)
            r8.<init>(r0)
            r1 = r11
            r2 = r12
            r9 = r13
            r10 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory.<init>(androidx.activity.ComponentActivity, com.stripe.android.paymentsheet.PaymentOptionCallback, com.stripe.android.paymentsheet.PaymentSheetResultCallback):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FlowControllerFactory(final androidx.fragment.app.Fragment r12, com.stripe.android.paymentsheet.PaymentOptionCallback r13, com.stripe.android.paymentsheet.PaymentSheetResultCallback r14) {
        /*
            r11 = this;
            java.lang.String r0 = "fragment"
            m0.n.b.i.e(r12, r0)
            java.lang.String r0 = "paymentOptionCallback"
            m0.n.b.i.e(r13, r0)
            java.lang.String r0 = "paymentResultCallback"
            m0.n.b.i.e(r14, r0)
            androidx.lifecycle.LifecycleCoroutineScope r3 = h0.q.q.a(r12)
            android.content.Context r4 = r12.requireContext()
            java.lang.String r0 = "fragment.requireContext()"
            m0.n.b.i.d(r4, r0)
            com.stripe.android.paymentsheet.flowcontroller.ActivityLauncherFactory$FragmentHost r5 = new com.stripe.android.paymentsheet.flowcontroller.ActivityLauncherFactory$FragmentHost
            r5.<init>(r12)
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$3 r6 = new com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$3
            r6.<init>(r12)
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$4 r7 = new com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory$4
            r7.<init>(r12)
            com.stripe.android.paymentsheet.model.PaymentOptionFactory r8 = new com.stripe.android.paymentsheet.model.PaymentOptionFactory
            android.content.res.Resources r0 = r12.getResources()
            java.lang.String r1 = "fragment.resources"
            m0.n.b.i.d(r0, r1)
            r8.<init>(r0)
            r1 = r11
            r2 = r12
            r9 = r13
            r10 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory.<init>(androidx.fragment.app.Fragment, com.stripe.android.paymentsheet.PaymentOptionCallback, com.stripe.android.paymentsheet.PaymentSheetResultCallback):void");
    }
}
