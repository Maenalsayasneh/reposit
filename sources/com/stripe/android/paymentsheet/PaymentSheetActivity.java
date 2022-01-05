package com.stripe.android.paymentsheet;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.stripe.android.AppInfo;
import com.stripe.android.FraudDetectionDataRepository;
import com.stripe.android.Logger;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.PaymentController;
import com.stripe.android.PaymentRelayContract;
import com.stripe.android.R;
import com.stripe.android.StripePaymentController;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.databinding.ActivityPaymentSheetBinding;
import com.stripe.android.googlepay.StripeGooglePayContract;
import com.stripe.android.networking.AlipayRepository;
import com.stripe.android.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.AnalyticsRequestFactory;
import com.stripe.android.networking.ApiRequestExecutor;
import com.stripe.android.networking.FraudDetectionDataParamsUtils;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.Stripe3ds2CompletionContract;
import com.stripe.android.paymentsheet.PaymentSheetContract;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.PaymentSheetViewState;
import com.stripe.android.paymentsheet.ui.AnimationConstants;
import com.stripe.android.paymentsheet.ui.BaseSheetActivity;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import h0.a.f.b;
import h0.o.a.a;
import h0.q.l0;
import h0.q.m0;
import i0.j.f.p.h;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import m0.c;
import m0.i;
import m0.l.e;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 {2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001{B\u0007¢\u0006\u0004\bz\u0010\tJ\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\tJ\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010'\u001a\u00020#8V@\u0016X\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R$\u0010*\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020\u00050(8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001f\u00103\u001a\u0004\u0018\u00010/8B@\u0002X\u0002¢\u0006\f\n\u0004\b0\u0010\u001f\u001a\u0004\b1\u00102R\u0016\u00107\u001a\u0002048C@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R#\u0010=\u001a\u0002088@@\u0001X\u0002¢\u0006\u0012\n\u0004\b9\u0010\u001f\u0012\u0004\b<\u0010\t\u001a\u0004\b:\u0010;R\u001d\u0010B\u001a\u00020>8V@\u0016X\u0002¢\u0006\f\n\u0004\b?\u0010\u001f\u001a\u0004\b@\u0010AR$\u0010C\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020\u00050(8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010+R\u001d\u0010H\u001a\u00020D8V@\u0016X\u0002¢\u0006\f\n\u0004\bE\u0010\u001f\u001a\u0004\bF\u0010GR\u001d\u0010M\u001a\u00020I8V@\u0016X\u0002¢\u0006\f\n\u0004\bJ\u0010\u001f\u001a\u0004\bK\u0010LR\u001d\u0010R\u001a\u00020N8V@\u0016X\u0002¢\u0006\f\n\u0004\bO\u0010\u001f\u001a\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X.¢\u0006\u0006\n\u0004\bT\u0010UR(\u0010W\u001a\u00020V8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\bW\u0010X\u0012\u0004\b]\u0010\t\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R1\u0010d\u001a\u0010\u0012\f\u0012\n _*\u0004\u0018\u00010N0N0^8@@\u0001X\u0002¢\u0006\u0012\n\u0004\b`\u0010\u001f\u0012\u0004\bc\u0010\t\u001a\u0004\ba\u0010bR\u001d\u0010i\u001a\u00020e8V@\u0016X\u0002¢\u0006\f\n\u0004\bf\u0010\u001f\u001a\u0004\bg\u0010hR\u001d\u0010l\u001a\u00020N8V@\u0016X\u0002¢\u0006\f\n\u0004\bj\u0010\u001f\u001a\u0004\bk\u0010QR\u001d\u0010q\u001a\u00020m8V@\u0016X\u0002¢\u0006\f\n\u0004\bn\u0010\u001f\u001a\u0004\bo\u0010pR\u001d\u0010t\u001a\u00020N8V@\u0016X\u0002¢\u0006\f\n\u0004\br\u0010\u001f\u001a\u0004\bs\u0010QR\u001d\u0010y\u001a\u00020u8V@\u0016X\u0002¢\u0006\f\n\u0004\bv\u0010\u001f\u001a\u0004\bw\u0010x¨\u0006|"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetActivity;", "Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "userMessage", "Lm0/i;", "updateErrorMessage", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;)V", "fetchConfig", "()V", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget;", "transitionTarget", "Landroid/os/Bundle;", "fragmentArgs", "onTransitionTarget", "(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$TransitionTarget;Landroid/os/Bundle;)V", "setupBuyButton", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Amount;", "amount", "", "getLabelText", "(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Amount;)Ljava/lang/String;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "result", "setActivityResult", "(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V", "Lcom/stripe/android/PaymentConfiguration;", "paymentConfig$delegate", "Lm0/c;", "getPaymentConfig", "()Lcom/stripe/android/PaymentConfiguration;", "paymentConfig", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter$delegate", "getEventReporter", "()Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "googlePayButtonStateObserver", "Lm0/n/a/l;", "Lcom/stripe/android/paymentsheet/CurrencyFormatter;", "currencyFormatter", "Lcom/stripe/android/paymentsheet/CurrencyFormatter;", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "starterArgs$delegate", "getStarterArgs", "()Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "starterArgs", "", "getFragmentContainerId", "()I", "fragmentContainerId", "Lcom/stripe/android/databinding/ActivityPaymentSheetBinding;", "viewBinding$delegate", "getViewBinding$payments_core_release", "()Lcom/stripe/android/databinding/ActivityPaymentSheetBinding;", "getViewBinding$payments_core_release$annotations", "viewBinding", "Lcom/stripe/android/paymentsheet/BottomSheetController;", "bottomSheetController$delegate", "getBottomSheetController", "()Lcom/stripe/android/paymentsheet/BottomSheetController;", "bottomSheetController", "buyButtonStateObserver", "Lcom/google/android/material/appbar/AppBarLayout;", "appbar$delegate", "getAppbar", "()Lcom/google/android/material/appbar/AppBarLayout;", "appbar", "Landroid/widget/ScrollView;", "scrollView$delegate", "getScrollView", "()Landroid/widget/ScrollView;", "scrollView", "Landroid/view/ViewGroup;", "rootView$delegate", "getRootView", "()Landroid/view/ViewGroup;", "rootView", "Lcom/stripe/android/PaymentController;", "paymentController", "Lcom/stripe/android/PaymentController;", "Lh0/q/m0$b;", "viewModelFactory", "Lh0/q/m0$b;", "getViewModelFactory$payments_core_release", "()Lh0/q/m0$b;", "setViewModelFactory$payments_core_release", "(Lh0/q/m0$b;)V", "getViewModelFactory$payments_core_release$annotations", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "kotlin.jvm.PlatformType", "bottomSheetBehavior$delegate", "getBottomSheetBehavior$payments_core_release", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "getBottomSheetBehavior$payments_core_release$annotations", "bottomSheetBehavior", "Lcom/google/android/material/appbar/MaterialToolbar;", "toolbar$delegate", "getToolbar", "()Lcom/google/android/material/appbar/MaterialToolbar;", "toolbar", "fragmentContainerParent$delegate", "getFragmentContainerParent", "fragmentContainerParent", "Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "viewModel", "bottomSheet$delegate", "getBottomSheet", "bottomSheet", "Landroid/widget/TextView;", "messageView$delegate", "getMessageView", "()Landroid/widget/TextView;", "messageView", "<init>", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSheetActivity.kt */
public final class PaymentSheetActivity extends BaseSheetActivity<PaymentSheetResult> {
    public static final Companion Companion = new Companion((f) null);
    public static final String EXTRA_FRAGMENT_CONFIG = "com.stripe.android.paymentsheet.extra_fragment_config";
    public static final String EXTRA_STARTER_ARGS = "com.stripe.android.paymentsheet.extra_starter_args";
    private final c appbar$delegate = h.H2(new PaymentSheetActivity$appbar$2(this));
    private final c bottomSheet$delegate = h.H2(new PaymentSheetActivity$bottomSheet$2(this));
    private final c bottomSheetBehavior$delegate = h.H2(new PaymentSheetActivity$bottomSheetBehavior$2(this));
    private final c bottomSheetController$delegate = h.H2(new PaymentSheetActivity$bottomSheetController$2(this));
    private final l<PaymentSheetViewState, i> buyButtonStateObserver = new PaymentSheetActivity$buyButtonStateObserver$1(this);
    private final CurrencyFormatter currencyFormatter = new CurrencyFormatter();
    private final c eventReporter$delegate = h.H2(new PaymentSheetActivity$eventReporter$2(this));
    private final c fragmentContainerParent$delegate = h.H2(new PaymentSheetActivity$fragmentContainerParent$2(this));
    private final l<PaymentSheetViewState, i> googlePayButtonStateObserver = new PaymentSheetActivity$googlePayButtonStateObserver$1(this);
    private final c messageView$delegate = h.H2(new PaymentSheetActivity$messageView$2(this));
    private final c paymentConfig$delegate = h.H2(new PaymentSheetActivity$paymentConfig$2(this));
    /* access modifiers changed from: private */
    public PaymentController paymentController;
    private final c rootView$delegate = h.H2(new PaymentSheetActivity$rootView$2(this));
    private final c scrollView$delegate = h.H2(new PaymentSheetActivity$scrollView$2(this));
    private final c starterArgs$delegate = h.H2(new PaymentSheetActivity$starterArgs$2(this));
    private final c toolbar$delegate = h.H2(new PaymentSheetActivity$toolbar$2(this));
    private final c viewBinding$delegate = h.H2(new PaymentSheetActivity$viewBinding$2(this));
    private final c viewModel$delegate = new l0(m.a(PaymentSheetViewModel.class), new PaymentSheetActivity$$special$$inlined$viewModels$2(this), new PaymentSheetActivity$viewModel$2(this));
    private m0.b viewModelFactory = new PaymentSheetViewModel.Factory(new PaymentSheetActivity$viewModelFactory$1(this), new PaymentSheetActivity$viewModelFactory$2(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetActivity$Companion;", "", "", "EXTRA_FRAGMENT_CONFIG", "Ljava/lang/String;", "EXTRA_STARTER_ARGS", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public static final /* synthetic */ PaymentController access$getPaymentController$p(PaymentSheetActivity paymentSheetActivity) {
        PaymentController paymentController2 = paymentSheetActivity.paymentController;
        if (paymentController2 != null) {
            return paymentController2;
        }
        m0.n.b.i.m("paymentController");
        throw null;
    }

    private final void fetchConfig() {
        getViewModel().fetchFragmentConfig().observe(this, new PaymentSheetActivity$fetchConfig$1(this));
    }

    public static /* synthetic */ void getBottomSheetBehavior$payments_core_release$annotations() {
    }

    /* access modifiers changed from: private */
    public final int getFragmentContainerId() {
        FragmentContainerView fragmentContainerView = getViewBinding$payments_core_release().fragmentContainer;
        m0.n.b.i.d(fragmentContainerView, "viewBinding.fragmentContainer");
        return fragmentContainerView.getId();
    }

    /* access modifiers changed from: private */
    public final String getLabelText(PaymentSheetViewModel.Amount amount) {
        String string = getResources().getString(R.string.stripe_paymentsheet_pay_button_amount, new Object[]{CurrencyFormatter.format$default(this.currencyFormatter, amount.getValue(), amount.getCurrencyCode(), (Locale) null, 4, (Object) null)});
        m0.n.b.i.d(string, "resources.getString(\n   …t.currencyCode)\n        )");
        return string;
    }

    /* access modifiers changed from: private */
    public final PaymentConfiguration getPaymentConfig() {
        return (PaymentConfiguration) this.paymentConfig$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final PaymentSheetContract.Args getStarterArgs() {
        return (PaymentSheetContract.Args) this.starterArgs$delegate.getValue();
    }

    public static /* synthetic */ void getViewBinding$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getViewModelFactory$payments_core_release$annotations() {
    }

    /* access modifiers changed from: private */
    public final void onTransitionTarget(PaymentSheetViewModel.TransitionTarget transitionTarget, Bundle bundle) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        m0.n.b.i.d(supportFragmentManager, "supportFragmentManager");
        a aVar = new a(supportFragmentManager);
        m0.n.b.i.d(aVar, "beginTransaction()");
        if (transitionTarget instanceof PaymentSheetViewModel.TransitionTarget.AddPaymentMethodFull) {
            AnimationConstants animationConstants = AnimationConstants.INSTANCE;
            aVar.r(animationConstants.getFADE_IN(), animationConstants.getFADE_OUT(), animationConstants.getFADE_IN(), animationConstants.getFADE_OUT());
            aVar.g((String) null);
            aVar.p(getFragmentContainerId(), PaymentSheetAddCardFragment.class, bundle);
        } else if (transitionTarget instanceof PaymentSheetViewModel.TransitionTarget.SelectSavedPaymentMethod) {
            AnimationConstants animationConstants2 = AnimationConstants.INSTANCE;
            aVar.r(animationConstants2.getFADE_IN(), animationConstants2.getFADE_OUT(), animationConstants2.getFADE_IN(), animationConstants2.getFADE_OUT());
            aVar.p(getFragmentContainerId(), PaymentSheetListFragment.class, bundle);
        } else if (transitionTarget instanceof PaymentSheetViewModel.TransitionTarget.AddPaymentMethodSheet) {
            AnimationConstants animationConstants3 = AnimationConstants.INSTANCE;
            aVar.r(animationConstants3.getFADE_IN(), animationConstants3.getFADE_OUT(), animationConstants3.getFADE_IN(), animationConstants3.getFADE_OUT());
            aVar.p(getFragmentContainerId(), PaymentSheetAddCardFragment.class, bundle);
        }
        aVar.h();
        getFragmentContainerParent().addOnLayoutChangeListener(new PaymentSheetActivity$onTransitionTarget$$inlined$doOnNextLayout$1(this));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.stripe.android.paymentsheet.PaymentSheetActivity$sam$androidx_lifecycle_Observer$0] */
    /* JADX WARNING: type inference failed for: r2v2, types: [com.stripe.android.paymentsheet.PaymentSheetActivity$sam$androidx_lifecycle_Observer$0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setupBuyButton() {
        /*
            r3 = this;
            com.stripe.android.paymentsheet.PaymentSheetViewModel r0 = r3.getViewModel()
            boolean r0 = r0.isProcessingPaymentIntent$payments_core_release()
            if (r0 == 0) goto L_0x001b
            com.stripe.android.paymentsheet.PaymentSheetViewModel r0 = r3.getViewModel()
            androidx.lifecycle.LiveData r0 = r0.getAmount$payments_core_release()
            com.stripe.android.paymentsheet.PaymentSheetActivity$setupBuyButton$1 r1 = new com.stripe.android.paymentsheet.PaymentSheetActivity$setupBuyButton$1
            r1.<init>(r3)
            r0.observe(r3, r1)
            goto L_0x002e
        L_0x001b:
            com.stripe.android.databinding.ActivityPaymentSheetBinding r0 = r3.getViewBinding$payments_core_release()
            com.stripe.android.paymentsheet.ui.PrimaryButton r0 = r0.buyButton
            android.content.res.Resources r1 = r3.getResources()
            int r2 = com.stripe.android.R.string.stripe_paymentsheet_setup_button_label
            java.lang.String r1 = r1.getString(r2)
            r0.setLabel(r1)
        L_0x002e:
            com.stripe.android.paymentsheet.PaymentSheetViewModel r0 = r3.getViewModel()
            com.stripe.android.paymentsheet.PaymentSheetViewModel$CheckoutIdentifier r1 = com.stripe.android.paymentsheet.PaymentSheetViewModel.CheckoutIdentifier.SheetBottomBuy
            h0.q.w r0 = r0.getButtonStateObservable$payments_core_release(r1)
            m0.n.a.l<com.stripe.android.paymentsheet.model.PaymentSheetViewState, m0.i> r1 = r3.buyButtonStateObserver
            if (r1 == 0) goto L_0x0042
            com.stripe.android.paymentsheet.PaymentSheetActivity$sam$androidx_lifecycle_Observer$0 r2 = new com.stripe.android.paymentsheet.PaymentSheetActivity$sam$androidx_lifecycle_Observer$0
            r2.<init>(r1)
            r1 = r2
        L_0x0042:
            h0.q.z r1 = (h0.q.z) r1
            r0.observe(r3, r1)
            com.stripe.android.paymentsheet.PaymentSheetViewModel r0 = r3.getViewModel()
            com.stripe.android.paymentsheet.PaymentSheetViewModel$CheckoutIdentifier r1 = com.stripe.android.paymentsheet.PaymentSheetViewModel.CheckoutIdentifier.SheetBottomGooglePay
            h0.q.w r0 = r0.getButtonStateObservable$payments_core_release(r1)
            m0.n.a.l<com.stripe.android.paymentsheet.model.PaymentSheetViewState, m0.i> r1 = r3.googlePayButtonStateObserver
            if (r1 == 0) goto L_0x005b
            com.stripe.android.paymentsheet.PaymentSheetActivity$sam$androidx_lifecycle_Observer$0 r2 = new com.stripe.android.paymentsheet.PaymentSheetActivity$sam$androidx_lifecycle_Observer$0
            r2.<init>(r1)
            r1 = r2
        L_0x005b:
            h0.q.z r1 = (h0.q.z) r1
            r0.observe(r3, r1)
            com.stripe.android.paymentsheet.PaymentSheetViewModel r0 = r3.getViewModel()
            androidx.lifecycle.LiveData r0 = r0.getSelection$payments_core_release()
            com.stripe.android.paymentsheet.PaymentSheetActivity$setupBuyButton$2 r1 = new com.stripe.android.paymentsheet.PaymentSheetActivity$setupBuyButton$2
            r1.<init>(r3)
            r0.observe(r3, r1)
            com.stripe.android.databinding.ActivityPaymentSheetBinding r0 = r3.getViewBinding$payments_core_release()
            com.stripe.android.paymentsheet.ui.GooglePayButton r0 = r0.googlePayButton
            com.stripe.android.paymentsheet.PaymentSheetActivity$setupBuyButton$3 r1 = new com.stripe.android.paymentsheet.PaymentSheetActivity$setupBuyButton$3
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            com.stripe.android.paymentsheet.PaymentSheetViewModel r0 = r3.getViewModel()
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r0 = r0.getConfig$payments_core_release()
            if (r0 == 0) goto L_0x009c
            android.content.res.ColorStateList r0 = r0.getPrimaryButtonColor()
            if (r0 == 0) goto L_0x009c
            com.stripe.android.databinding.ActivityPaymentSheetBinding r1 = r3.getViewBinding$payments_core_release()
            com.stripe.android.paymentsheet.ui.PrimaryButton r1 = r1.buyButton
            java.lang.String r2 = "viewBinding.buyButton"
            m0.n.b.i.d(r1, r2)
            r1.setBackgroundTintList(r0)
        L_0x009c:
            com.stripe.android.databinding.ActivityPaymentSheetBinding r0 = r3.getViewBinding$payments_core_release()
            com.stripe.android.paymentsheet.ui.PrimaryButton r0 = r0.buyButton
            com.stripe.android.paymentsheet.PaymentSheetActivity$setupBuyButton$5 r1 = new com.stripe.android.paymentsheet.PaymentSheetActivity$setupBuyButton$5
            r1.<init>(r3)
            r0.setOnClickListener(r1)
            com.stripe.android.paymentsheet.PaymentSheetViewModel r0 = r3.getViewModel()
            androidx.lifecycle.LiveData r0 = r0.getCtaEnabled()
            com.stripe.android.paymentsheet.PaymentSheetActivity$setupBuyButton$6 r1 = new com.stripe.android.paymentsheet.PaymentSheetActivity$setupBuyButton$6
            r1.<init>(r3)
            r0.observe(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentSheetActivity.setupBuyButton():void");
    }

    /* access modifiers changed from: private */
    public final void updateErrorMessage(BaseSheetViewModel.UserErrorMessage userErrorMessage) {
        TextView messageView = getMessageView();
        int i = 0;
        if (!(userErrorMessage != null)) {
            i = 8;
        }
        messageView.setVisibility(i);
        getMessageView().setText(userErrorMessage != null ? userErrorMessage.getMessage() : null);
    }

    public AppBarLayout getAppbar() {
        return (AppBarLayout) this.appbar$delegate.getValue();
    }

    public ViewGroup getBottomSheet() {
        return (ViewGroup) this.bottomSheet$delegate.getValue();
    }

    public final BottomSheetBehavior<ViewGroup> getBottomSheetBehavior$payments_core_release() {
        return (BottomSheetBehavior) this.bottomSheetBehavior$delegate.getValue();
    }

    public BottomSheetController getBottomSheetController() {
        return (BottomSheetController) this.bottomSheetController$delegate.getValue();
    }

    public EventReporter getEventReporter() {
        return (EventReporter) this.eventReporter$delegate.getValue();
    }

    public ViewGroup getFragmentContainerParent() {
        return (ViewGroup) this.fragmentContainerParent$delegate.getValue();
    }

    public TextView getMessageView() {
        return (TextView) this.messageView$delegate.getValue();
    }

    public ViewGroup getRootView() {
        return (ViewGroup) this.rootView$delegate.getValue();
    }

    public ScrollView getScrollView() {
        return (ScrollView) this.scrollView$delegate.getValue();
    }

    public MaterialToolbar getToolbar() {
        return (MaterialToolbar) this.toolbar$delegate.getValue();
    }

    public final ActivityPaymentSheetBinding getViewBinding$payments_core_release() {
        return (ActivityPaymentSheetBinding) this.viewBinding$delegate.getValue();
    }

    public PaymentSheetViewModel getViewModel() {
        return (PaymentSheetViewModel) this.viewModel$delegate.getValue();
    }

    public final m0.b getViewModelFactory$payments_core_release() {
        return this.viewModelFactory;
    }

    public void onBackPressed() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        m0.n.b.i.d(supportFragmentManager, "supportFragmentManager");
        if (supportFragmentManager.L() > 0) {
            updateErrorMessage((BaseSheetViewModel.UserErrorMessage) null);
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentSheetContract.Args starterArgs = getStarterArgs();
        if (starterArgs == null) {
            setActivityResult((PaymentSheetResult) new PaymentSheetResult.Failed(new IllegalArgumentException("PaymentSheet started without arguments.")));
            finish();
            return;
        }
        b registerForActivityResult = registerForActivityResult(new PaymentRelayContract(), new PaymentSheetActivity$onCreate$paymentRelayLauncher$1(this));
        b bVar = registerForActivityResult;
        m0.n.b.i.d(registerForActivityResult, "registerForActivityResul…tFlowResult(it)\n        }");
        DefaultReturnUrl.Companion companion = DefaultReturnUrl.Companion;
        Application application = getApplication();
        m0.n.b.i.d(application, "application");
        b registerForActivityResult2 = registerForActivityResult(new PaymentBrowserAuthContract(companion.create(application), (l) null, 2, (f) null), new PaymentSheetActivity$onCreate$paymentBrowserAuthLauncher$1(this));
        b bVar2 = registerForActivityResult2;
        m0.n.b.i.d(registerForActivityResult2, "registerForActivityResul…tFlowResult(it)\n        }");
        b registerForActivityResult3 = registerForActivityResult(new Stripe3ds2CompletionContract(), new PaymentSheetActivity$onCreate$stripe3ds2ChallengeLauncher$1(this));
        m0.n.b.i.d(registerForActivityResult3, "registerForActivityResul…tFlowResult(it)\n        }");
        Application application2 = getApplication();
        Application application3 = application2;
        m0.n.b.i.d(application2, "application");
        String publishableKey = getPaymentConfig().getPublishableKey();
        StripeApiRepository stripeApiRepository = r19;
        Application application4 = getApplication();
        m0.n.b.i.d(application4, "application");
        StripeApiRepository stripeApiRepository2 = new StripeApiRepository(application4, getPaymentConfig().getPublishableKey(), (AppInfo) null, (Logger) null, (e) null, (ApiRequestExecutor) null, (AnalyticsRequestExecutor) null, (FraudDetectionDataRepository) null, (AnalyticsRequestFactory) null, (FraudDetectionDataParamsUtils) null, (Set) null, (String) null, (String) null, 8188, (f) null);
        this.paymentController = new StripePaymentController(application3, publishableKey, stripeApiRepository, true, (MessageVersionRegistry) null, (PaymentAuthConfig) null, (StripeThreeDs2Service) null, (AnalyticsRequestExecutor) null, (AnalyticsRequestFactory) null, (StripePaymentController.ChallengeProgressActivityStarter) null, (AlipayRepository) null, bVar, bVar2, registerForActivityResult3, (e) null, (e) null, 51184, (f) null);
        b registerForActivityResult4 = registerForActivityResult(new StripeGooglePayContract(), new PaymentSheetActivity$onCreate$googlePayLauncher$1(this));
        m0.n.b.i.d(registerForActivityResult4, "registerForActivityResul…lePayResult(it)\n        }");
        getViewModel().getLaunchGooglePay$payments_core_release().observe(this, new PaymentSheetActivity$onCreate$1(registerForActivityResult4));
        getViewModel().updatePaymentMethods();
        getViewModel().fetchStripeIntent();
        Integer statusBarColor = starterArgs.getStatusBarColor();
        if (statusBarColor != null) {
            int intValue = statusBarColor.intValue();
            Window window = getWindow();
            m0.n.b.i.d(window, "window");
            window.setStatusBarColor(intValue);
        }
        ActivityPaymentSheetBinding viewBinding$payments_core_release = getViewBinding$payments_core_release();
        m0.n.b.i.d(viewBinding$payments_core_release, "viewBinding");
        setContentView((View) viewBinding$payments_core_release.getRoot());
        getRootView().addOnLayoutChangeListener(new PaymentSheetActivity$onCreate$$inlined$doOnNextLayout$1(this));
        setupBuyButton();
        getViewModel().getTransition$payments_core_release().observe(this, new PaymentSheetActivity$onCreate$4(this, starterArgs));
        if (bundle == null) {
            fetchConfig();
        }
        getViewModel().getStartConfirm$payments_core_release().observe(this, new PaymentSheetActivity$onCreate$5(this));
        getViewModel().getPaymentSheetResult$payments_core_release().observe(this, new PaymentSheetActivity$onCreate$6(this));
    }

    public final void setViewModelFactory$payments_core_release(m0.b bVar) {
        m0.n.b.i.e(bVar, "<set-?>");
        this.viewModelFactory = bVar;
    }

    public void setActivityResult(PaymentSheetResult paymentSheetResult) {
        m0.n.b.i.e(paymentSheetResult, "result");
        setResult(-1, new Intent().putExtras(new PaymentSheetContract.Result(paymentSheetResult).toBundle()));
    }
}
