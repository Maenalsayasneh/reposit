package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.content.res.ColorStateList;
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
import com.stripe.android.databinding.StripeActivityPaymentOptionsBinding;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.ui.AnimationConstants;
import com.stripe.android.paymentsheet.ui.BaseSheetActivity;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import h0.o.a.a;
import h0.o.a.v;
import h0.q.l0;
import h0.q.m0;
import i0.j.f.p.h;
import kotlin.Metadata;
import m0.c;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001eB\u0007¢\u0006\u0004\bd\u0010\u001eJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u001f\u001a\u00020\u00188@@\u0001X\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00038B@\u0002X\u0002¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\"R\u001d\u0010'\u001a\u00020#8V@\u0016X\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010&R\u001d\u0010,\u001a\u00020(8V@\u0016X\u0002¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010+R\u001d\u00101\u001a\u00020-8V@\u0016X\u0002¢\u0006\f\n\u0004\b.\u0010\u001a\u001a\u0004\b/\u00100R(\u00103\u001a\u0002028\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b3\u00104\u0012\u0004\b9\u0010\u001e\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8C@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001d\u0010B\u001a\u00020>8V@\u0016X\u0002¢\u0006\f\n\u0004\b?\u0010\u001a\u001a\u0004\b@\u0010AR\u001d\u0010E\u001a\u00020-8V@\u0016X\u0002¢\u0006\f\n\u0004\bC\u0010\u001a\u001a\u0004\bD\u00100R\u001d\u0010J\u001a\u00020F8V@\u0016X\u0002¢\u0006\f\n\u0004\bG\u0010\u001a\u001a\u0004\bH\u0010IR\u001d\u0010O\u001a\u00020K8V@\u0016X\u0002¢\u0006\f\n\u0004\bL\u0010\u001a\u001a\u0004\bM\u0010NR\u001d\u0010R\u001a\u00020-8V@\u0016X\u0002¢\u0006\f\n\u0004\bP\u0010\u001a\u001a\u0004\bQ\u00100R\u001d\u0010W\u001a\u00020S8V@\u0016X\u0002¢\u0006\f\n\u0004\bT\u0010\u001a\u001a\u0004\bU\u0010VR\u001d\u0010\\\u001a\u00020X8V@\u0016X\u0002¢\u0006\f\n\u0004\bY\u0010\u001a\u001a\u0004\bZ\u0010[R1\u0010c\u001a\u0010\u0012\f\u0012\n ^*\u0004\u0018\u00010-0-0]8@@\u0001X\u0002¢\u0006\u0012\n\u0004\b_\u0010\u001a\u0012\u0004\bb\u0010\u001e\u001a\u0004\b`\u0010a¨\u0006f"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsActivity;", "Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "starterArgs", "Lm0/i;", "fetchConfig", "(Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;)V", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton;", "addButton", "setupAddButton", "(Lcom/stripe/android/paymentsheet/ui/PrimaryButton;)V", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget;", "transitionTarget", "Landroid/os/Bundle;", "fragmentArgs", "onTransitionTarget", "(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel$TransitionTarget;Landroid/os/Bundle;)V", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "result", "setActivityResult", "(Lcom/stripe/android/paymentsheet/PaymentOptionResult;)V", "Lcom/stripe/android/databinding/StripeActivityPaymentOptionsBinding;", "viewBinding$delegate", "Lm0/c;", "getViewBinding$payments_core_release", "()Lcom/stripe/android/databinding/StripeActivityPaymentOptionsBinding;", "getViewBinding$payments_core_release$annotations", "()V", "viewBinding", "starterArgs$delegate", "getStarterArgs", "()Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "Lcom/google/android/material/appbar/MaterialToolbar;", "toolbar$delegate", "getToolbar", "()Lcom/google/android/material/appbar/MaterialToolbar;", "toolbar", "Landroid/widget/TextView;", "messageView$delegate", "getMessageView", "()Landroid/widget/TextView;", "messageView", "Landroid/view/ViewGroup;", "bottomSheet$delegate", "getBottomSheet", "()Landroid/view/ViewGroup;", "bottomSheet", "Lh0/q/m0$b;", "viewModelFactory", "Lh0/q/m0$b;", "getViewModelFactory$payments_core_release", "()Lh0/q/m0$b;", "setViewModelFactory$payments_core_release", "(Lh0/q/m0$b;)V", "getViewModelFactory$payments_core_release$annotations", "", "getFragmentContainerId", "()I", "fragmentContainerId", "Lcom/google/android/material/appbar/AppBarLayout;", "appbar$delegate", "getAppbar", "()Lcom/google/android/material/appbar/AppBarLayout;", "appbar", "fragmentContainerParent$delegate", "getFragmentContainerParent", "fragmentContainerParent", "Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "viewModel", "Lcom/stripe/android/paymentsheet/BottomSheetController;", "bottomSheetController$delegate", "getBottomSheetController", "()Lcom/stripe/android/paymentsheet/BottomSheetController;", "bottomSheetController", "rootView$delegate", "getRootView", "rootView", "Landroid/widget/ScrollView;", "scrollView$delegate", "getScrollView", "()Landroid/widget/ScrollView;", "scrollView", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter$delegate", "getEventReporter", "()Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "kotlin.jvm.PlatformType", "bottomSheetBehavior$delegate", "getBottomSheetBehavior$payments_core_release", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "getBottomSheetBehavior$payments_core_release$annotations", "bottomSheetBehavior", "<init>", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentOptionsActivity.kt */
public final class PaymentOptionsActivity extends BaseSheetActivity<PaymentOptionResult> {
    public static final Companion Companion = new Companion((f) null);
    public static final String EXTRA_FRAGMENT_CONFIG = "com.stripe.android.paymentsheet.extra_fragment_config";
    public static final String EXTRA_STARTER_ARGS = "com.stripe.android.paymentsheet.extra_starter_args";
    private final c appbar$delegate = h.H2(new PaymentOptionsActivity$appbar$2(this));
    private final c bottomSheet$delegate = h.H2(new PaymentOptionsActivity$bottomSheet$2(this));
    private final c bottomSheetBehavior$delegate = h.H2(new PaymentOptionsActivity$bottomSheetBehavior$2(this));
    private final c bottomSheetController$delegate = h.H2(new PaymentOptionsActivity$bottomSheetController$2(this));
    private final c eventReporter$delegate = h.H2(new PaymentOptionsActivity$eventReporter$2(this));
    private final c fragmentContainerParent$delegate = h.H2(new PaymentOptionsActivity$fragmentContainerParent$2(this));
    private final c messageView$delegate = h.H2(new PaymentOptionsActivity$messageView$2(this));
    private final c rootView$delegate = h.H2(new PaymentOptionsActivity$rootView$2(this));
    private final c scrollView$delegate = h.H2(new PaymentOptionsActivity$scrollView$2(this));
    private final c starterArgs$delegate = h.H2(new PaymentOptionsActivity$starterArgs$2(this));
    private final c toolbar$delegate = h.H2(new PaymentOptionsActivity$toolbar$2(this));
    private final c viewBinding$delegate = h.H2(new PaymentOptionsActivity$viewBinding$2(this));
    private final c viewModel$delegate = new l0(m.a(PaymentOptionsViewModel.class), new PaymentOptionsActivity$$special$$inlined$viewModels$2(this), new PaymentOptionsActivity$viewModel$2(this));
    private m0.b viewModelFactory = new PaymentOptionsViewModel.Factory(new PaymentOptionsActivity$viewModelFactory$1(this), new PaymentOptionsActivity$viewModelFactory$2(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsActivity$Companion;", "", "", "EXTRA_FRAGMENT_CONFIG", "Ljava/lang/String;", "EXTRA_STARTER_ARGS", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentOptionsActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    private final void fetchConfig(PaymentOptionContract.Args args) {
        getViewModel().fetchFragmentConfig().observe(this, new PaymentOptionsActivity$fetchConfig$1(this, args));
    }

    public static /* synthetic */ void getBottomSheetBehavior$payments_core_release$annotations() {
    }

    private final int getFragmentContainerId() {
        FragmentContainerView fragmentContainerView = getViewBinding$payments_core_release().fragmentContainer;
        i.d(fragmentContainerView, "viewBinding.fragmentContainer");
        return fragmentContainerView.getId();
    }

    /* access modifiers changed from: private */
    public final PaymentOptionContract.Args getStarterArgs() {
        return (PaymentOptionContract.Args) this.starterArgs$delegate.getValue();
    }

    public static /* synthetic */ void getViewBinding$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getViewModelFactory$payments_core_release$annotations() {
    }

    /* access modifiers changed from: private */
    public final void onTransitionTarget(PaymentOptionsViewModel.TransitionTarget transitionTarget, Bundle bundle) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        i.d(supportFragmentManager, "supportFragmentManager");
        a aVar = new a(supportFragmentManager);
        i.d(aVar, "beginTransaction()");
        if (transitionTarget instanceof PaymentOptionsViewModel.TransitionTarget.AddPaymentMethodFull) {
            AnimationConstants animationConstants = AnimationConstants.INSTANCE;
            aVar.r(animationConstants.getFADE_IN(), animationConstants.getFADE_OUT(), animationConstants.getFADE_IN(), animationConstants.getFADE_OUT());
            aVar.g((String) null);
            aVar.p(getFragmentContainerId(), PaymentOptionsAddCardFragment.class, bundle);
        } else if (transitionTarget instanceof PaymentOptionsViewModel.TransitionTarget.SelectSavedPaymentMethod) {
            aVar.p(getFragmentContainerId(), PaymentOptionsListFragment.class, bundle);
        } else if (transitionTarget instanceof PaymentOptionsViewModel.TransitionTarget.AddPaymentMethodSheet) {
            aVar.p(getFragmentContainerId(), PaymentOptionsAddCardFragment.class, bundle);
        }
        aVar.h();
        getSupportFragmentManager().F();
        getRootView().addOnLayoutChangeListener(new PaymentOptionsActivity$onTransitionTarget$$inlined$doOnNextLayout$1(this));
    }

    private final void setupAddButton(PrimaryButton primaryButton) {
        ColorStateList primaryButtonColor;
        getViewBinding$payments_core_release().addButton.updateState(PrimaryButton.State.Ready.INSTANCE);
        PaymentSheet.Configuration config$payments_core_release = getViewModel().getConfig$payments_core_release();
        if (!(config$payments_core_release == null || (primaryButtonColor = config$payments_core_release.getPrimaryButtonColor()) == null)) {
            PrimaryButton primaryButton2 = getViewBinding$payments_core_release().addButton;
            i.d(primaryButton2, "viewBinding.addButton");
            primaryButton2.setBackgroundTintList(primaryButtonColor);
        }
        primaryButton.setOnClickListener(new PaymentOptionsActivity$setupAddButton$2(this));
        getViewModel().getCtaEnabled().observe(this, new PaymentOptionsActivity$setupAddButton$3(primaryButton));
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

    public final StripeActivityPaymentOptionsBinding getViewBinding$payments_core_release() {
        return (StripeActivityPaymentOptionsBinding) this.viewBinding$delegate.getValue();
    }

    public PaymentOptionsViewModel getViewModel() {
        return (PaymentOptionsViewModel) this.viewModel$delegate.getValue();
    }

    public final m0.b getViewModelFactory$payments_core_release() {
        return this.viewModelFactory;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentOptionContract.Args starterArgs = getStarterArgs();
        if (starterArgs == null) {
            finish();
            return;
        }
        Integer statusBarColor = starterArgs.getStatusBarColor();
        if (statusBarColor != null) {
            int intValue = statusBarColor.intValue();
            Window window = getWindow();
            i.d(window, "window");
            window.setStatusBarColor(intValue);
        }
        StripeActivityPaymentOptionsBinding viewBinding$payments_core_release = getViewBinding$payments_core_release();
        i.d(viewBinding$payments_core_release, "viewBinding");
        setContentView((View) viewBinding$payments_core_release.getRoot());
        getViewModel().getPaymentOptionResult$payments_core_release().observe(this, new PaymentOptionsActivity$onCreate$2(this));
        PrimaryButton primaryButton = getViewBinding$payments_core_release().addButton;
        i.d(primaryButton, "viewBinding.addButton");
        setupAddButton(primaryButton);
        getViewModel().getTransition$payments_core_release().observe(this, new PaymentOptionsActivity$onCreate$3(this, starterArgs));
        if (bundle == null) {
            fetchConfig(starterArgs);
        }
        getSupportFragmentManager().o.a.add(new v.a(new PaymentOptionsActivity$onCreate$4(this), false));
    }

    public final void setViewModelFactory$payments_core_release(m0.b bVar) {
        i.e(bVar, "<set-?>");
        this.viewModelFactory = bVar;
    }

    public void setActivityResult(PaymentOptionResult paymentOptionResult) {
        i.e(paymentOptionResult, "result");
        setResult(paymentOptionResult.getResultCode(), new Intent().putExtras(paymentOptionResult.toBundle()));
    }
}
