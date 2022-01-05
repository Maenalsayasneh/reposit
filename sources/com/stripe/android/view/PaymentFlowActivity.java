package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentSession;
import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.PaymentSessionData;
import com.stripe.android.R;
import com.stripe.android.databinding.PaymentFlowActivityBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import com.stripe.android.view.PaymentFlowActivityStarter;
import h0.q.l0;
import i0.j.f.p.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import m0.c;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 V2\u00020\u0001:\u0001VB\u0007¢\u0006\u0004\bU\u0010\nJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\nJ)\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010 H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\nJ)\u0010'\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010\nR\u001d\u0010.\u001a\u00020)8B@\u0002X\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u00103\u001a\u00020/8B@\u0002X\u0002¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u00102R\u001d\u00108\u001a\u0002048B@\u0002X\u0002¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u00010\u00148B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u001d\u0010@\u001a\u00020<8B@\u0002X\u0002¢\u0006\f\n\u0004\b=\u0010+\u001a\u0004\b>\u0010?R\u001d\u0010E\u001a\u00020A8B@\u0002X\u0002¢\u0006\f\n\u0004\bB\u0010+\u001a\u0004\bC\u0010DR\u001d\u0010J\u001a\u00020F8B@\u0002X\u0002¢\u0006\f\n\u0004\bG\u0010+\u001a\u0004\bH\u0010IR\u001d\u0010O\u001a\u00020K8B@\u0002X\u0002¢\u0006\f\n\u0004\bL\u0010+\u001a\u0004\bM\u0010NR\u001d\u0010T\u001a\u00020P8B@\u0002X\u0002¢\u0006\f\n\u0004\bQ\u0010+\u001a\u0004\bR\u0010S¨\u0006W"}, d2 = {"Lcom/stripe/android/view/PaymentFlowActivity;", "Lcom/stripe/android/view/StripeActivity;", "", "Lcom/stripe/android/model/ShippingMethod;", "shippingMethods", "Lm0/i;", "onShippingInfoValidated", "(Ljava/util/List;)V", "onShippingMethodsReady", "onShippingInfoSubmitted", "()V", "", "hasNextPage", "()Z", "hasPreviousPage", "onShippingMethodSave", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "shippingInfoValidator", "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "shippingMethodsFactory", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "validateShippingInformation", "(Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;Lcom/stripe/android/model/ShippingInformation;)V", "", "error", "onShippingInfoError", "(Ljava/lang/Throwable;)V", "Lcom/stripe/android/PaymentSessionData;", "paymentSessionData", "finishWithData", "(Lcom/stripe/android/PaymentSessionData;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onActionSave", "onShippingInfoSaved$payments_core_release", "(Lcom/stripe/android/model/ShippingInformation;Ljava/util/List;)V", "onShippingInfoSaved", "onBackPressed", "Lcom/stripe/android/databinding/PaymentFlowActivityBinding;", "viewBinding$delegate", "Lm0/c;", "getViewBinding", "()Lcom/stripe/android/databinding/PaymentFlowActivityBinding;", "viewBinding", "Lcom/stripe/android/view/KeyboardController;", "keyboardController$delegate", "getKeyboardController", "()Lcom/stripe/android/view/KeyboardController;", "keyboardController", "Lcom/stripe/android/view/PaymentFlowViewModel;", "viewModel$delegate", "getViewModel", "()Lcom/stripe/android/view/PaymentFlowViewModel;", "viewModel", "getShippingInfo", "()Lcom/stripe/android/model/ShippingInformation;", "shippingInfo", "Lcom/stripe/android/view/PaymentFlowViewPager;", "viewPager$delegate", "getViewPager", "()Lcom/stripe/android/view/PaymentFlowViewPager;", "viewPager", "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "args$delegate", "getArgs", "()Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "args", "Lcom/stripe/android/PaymentSessionConfig;", "paymentSessionConfig$delegate", "getPaymentSessionConfig", "()Lcom/stripe/android/PaymentSessionConfig;", "paymentSessionConfig", "Lcom/stripe/android/CustomerSession;", "customerSession$delegate", "getCustomerSession", "()Lcom/stripe/android/CustomerSession;", "customerSession", "Lcom/stripe/android/view/PaymentFlowPagerAdapter;", "paymentFlowPagerAdapter$delegate", "getPaymentFlowPagerAdapter", "()Lcom/stripe/android/view/PaymentFlowPagerAdapter;", "paymentFlowPagerAdapter", "<init>", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentFlowActivity.kt */
public final class PaymentFlowActivity extends StripeActivity {
    public static final Companion Companion = new Companion((f) null);
    public static final String PRODUCT_TOKEN = "PaymentFlowActivity";
    private final c args$delegate = h.H2(new PaymentFlowActivity$args$2(this));
    private final c customerSession$delegate = h.H2(PaymentFlowActivity$customerSession$2.INSTANCE);
    private final c keyboardController$delegate = h.H2(new PaymentFlowActivity$keyboardController$2(this));
    private final c paymentFlowPagerAdapter$delegate = h.H2(new PaymentFlowActivity$paymentFlowPagerAdapter$2(this));
    private final c paymentSessionConfig$delegate = h.H2(new PaymentFlowActivity$paymentSessionConfig$2(this));
    private final c viewBinding$delegate = h.H2(new PaymentFlowActivity$viewBinding$2(this));
    private final c viewModel$delegate = new l0(m.a(PaymentFlowViewModel.class), new PaymentFlowActivity$$special$$inlined$viewModels$2(this), new PaymentFlowActivity$viewModel$2(this));
    private final c viewPager$delegate = h.H2(new PaymentFlowActivity$viewPager$2(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/PaymentFlowActivity$Companion;", "", "", "PRODUCT_TOKEN", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentFlowActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    private final void finishWithData(PaymentSessionData paymentSessionData) {
        setResult(-1, new Intent().putExtra(PaymentSession.EXTRA_PAYMENT_SESSION_DATA, paymentSessionData));
        finish();
    }

    /* access modifiers changed from: private */
    public final PaymentFlowActivityStarter.Args getArgs() {
        return (PaymentFlowActivityStarter.Args) this.args$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final CustomerSession getCustomerSession() {
        return (CustomerSession) this.customerSession$delegate.getValue();
    }

    private final KeyboardController getKeyboardController() {
        return (KeyboardController) this.keyboardController$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final PaymentFlowPagerAdapter getPaymentFlowPagerAdapter() {
        return (PaymentFlowPagerAdapter) this.paymentFlowPagerAdapter$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final PaymentSessionConfig getPaymentSessionConfig() {
        return (PaymentSessionConfig) this.paymentSessionConfig$delegate.getValue();
    }

    private final ShippingInformation getShippingInfo() {
        return ((ShippingInfoWidget) getViewPager().findViewById(R.id.shipping_info_widget)).getShippingInformation();
    }

    /* access modifiers changed from: private */
    public final PaymentFlowActivityBinding getViewBinding() {
        return (PaymentFlowActivityBinding) this.viewBinding$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final PaymentFlowViewModel getViewModel() {
        return (PaymentFlowViewModel) this.viewModel$delegate.getValue();
    }

    private final PaymentFlowViewPager getViewPager() {
        return (PaymentFlowViewPager) this.viewPager$delegate.getValue();
    }

    private final boolean hasNextPage() {
        return getViewPager().getCurrentItem() + 1 < getPaymentFlowPagerAdapter().getCount();
    }

    private final boolean hasPreviousPage() {
        return getViewPager().getCurrentItem() != 0;
    }

    /* access modifiers changed from: private */
    public final void onShippingInfoError(Throwable th) {
        String message = th.getMessage();
        boolean z = false;
        setProgressBarVisible(false);
        if (message == null || message.length() == 0) {
            z = true;
        }
        if (!z) {
            showError(message);
        } else {
            String string = getString(R.string.invalid_shipping_information);
            i.d(string, "getString(R.string.invalid_shipping_information)");
            showError(string);
        }
        getViewModel().setPaymentSessionData$payments_core_release(PaymentSessionData.copy$default(getViewModel().getPaymentSessionData$payments_core_release(), false, false, 0, 0, (ShippingInformation) null, (ShippingMethod) null, (PaymentMethod) null, false, 239, (Object) null));
    }

    public static void onShippingInfoSaved$payments_core_release$default(PaymentFlowActivity paymentFlowActivity, ShippingInformation shippingInformation, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = EmptyList.c;
        }
        paymentFlowActivity.onShippingInfoSaved$payments_core_release(shippingInformation, list);
    }

    private final void onShippingInfoSubmitted() {
        getKeyboardController().hide$payments_core_release();
        ShippingInformation shippingInfo = getShippingInfo();
        if (shippingInfo != null) {
            getViewModel().setPaymentSessionData$payments_core_release(PaymentSessionData.copy$default(getViewModel().getPaymentSessionData$payments_core_release(), false, false, 0, 0, shippingInfo, (ShippingMethod) null, (PaymentMethod) null, false, 239, (Object) null));
            setProgressBarVisible(true);
            validateShippingInformation(getPaymentSessionConfig().getShippingInformationValidator$payments_core_release(), getPaymentSessionConfig().getShippingMethodsFactory$payments_core_release(), shippingInfo);
        }
    }

    /* access modifiers changed from: private */
    public final void onShippingInfoValidated(List<ShippingMethod> list) {
        ShippingInformation shippingInformation = getViewModel().getPaymentSessionData$payments_core_release().getShippingInformation();
        if (shippingInformation != null) {
            getViewModel().saveCustomerShippingInformation$payments_core_release(shippingInformation).observe(this, new PaymentFlowActivity$onShippingInfoValidated$$inlined$let$lambda$1(this, list));
        }
    }

    private final void onShippingMethodSave() {
        finishWithData(PaymentSessionData.copy$default(getViewModel().getPaymentSessionData$payments_core_release(), false, false, 0, 0, (ShippingInformation) null, ((SelectShippingMethodWidget) getViewPager().findViewById(R.id.select_shipping_method_widget)).getSelectedShippingMethod(), (PaymentMethod) null, false, 223, (Object) null));
    }

    private final void onShippingMethodsReady(List<ShippingMethod> list) {
        setProgressBarVisible(false);
        getPaymentFlowPagerAdapter().setShippingMethods$payments_core_release(list);
        getPaymentFlowPagerAdapter().setShippingInfoSubmitted$payments_core_release(true);
        if (hasNextPage()) {
            PaymentFlowViewModel viewModel = getViewModel();
            viewModel.setCurrentPage$payments_core_release(viewModel.getCurrentPage$payments_core_release() + 1);
            getViewPager().setCurrentItem(getViewModel().getCurrentPage$payments_core_release());
            return;
        }
        finishWithData(getViewModel().getPaymentSessionData$payments_core_release());
    }

    private final void validateShippingInformation(PaymentSessionConfig.ShippingInformationValidator shippingInformationValidator, PaymentSessionConfig.ShippingMethodsFactory shippingMethodsFactory, ShippingInformation shippingInformation) {
        getViewModel().validateShippingInformation$payments_core_release(shippingInformationValidator, shippingMethodsFactory, shippingInformation).observe(this, new PaymentFlowActivity$validateShippingInformation$1(this));
    }

    public void onActionSave() {
        if (PaymentFlowPage.ShippingInfo == getPaymentFlowPagerAdapter().getPageAt$payments_core_release(getViewPager().getCurrentItem())) {
            onShippingInfoSubmitted();
        } else {
            onShippingMethodSave();
        }
    }

    public void onBackPressed() {
        if (hasPreviousPage()) {
            PaymentFlowViewModel viewModel = getViewModel();
            viewModel.setCurrentPage$payments_core_release(viewModel.getCurrentPage$payments_core_release() - 1);
            getViewPager().setCurrentItem(getViewModel().getCurrentPage$payments_core_release());
            return;
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentFlowActivityStarter.Args.Companion companion = PaymentFlowActivityStarter.Args.Companion;
        Intent intent = getIntent();
        i.d(intent, "intent");
        Integer windowFlags$payments_core_release = companion.create(intent).getWindowFlags$payments_core_release();
        if (windowFlags$payments_core_release != null) {
            getWindow().addFlags(windowFlags$payments_core_release.intValue());
        }
        ShippingInformation submittedShippingInfo$payments_core_release = getViewModel().getSubmittedShippingInfo$payments_core_release();
        if (submittedShippingInfo$payments_core_release == null) {
            submittedShippingInfo$payments_core_release = getPaymentSessionConfig().getPrepopulatedShippingInfo();
        }
        getPaymentFlowPagerAdapter().setShippingMethods$payments_core_release(getViewModel().getShippingMethods$payments_core_release());
        getPaymentFlowPagerAdapter().setShippingInfoSubmitted$payments_core_release(getViewModel().isShippingInfoSubmitted$payments_core_release());
        getPaymentFlowPagerAdapter().setShippingInformation$payments_core_release(submittedShippingInfo$payments_core_release);
        getPaymentFlowPagerAdapter().setSelectedShippingMethod$payments_core_release(getViewModel().getSelectedShippingMethod$payments_core_release());
        getViewPager().setAdapter(getPaymentFlowPagerAdapter());
        getViewPager().addOnPageChangeListener(new PaymentFlowActivity$onCreate$2(this));
        getViewPager().setCurrentItem(getViewModel().getCurrentPage$payments_core_release());
        setTitle(getPaymentFlowPagerAdapter().getPageTitle(getViewPager().getCurrentItem()));
    }

    public final /* synthetic */ void onShippingInfoSaved$payments_core_release(ShippingInformation shippingInformation, List<ShippingMethod> list) {
        List<ShippingMethod> list2 = list;
        i.e(list2, "shippingMethods");
        onShippingMethodsReady(list2);
        getViewModel().setPaymentSessionData$payments_core_release(PaymentSessionData.copy$default(getViewModel().getPaymentSessionData$payments_core_release(), false, false, 0, 0, shippingInformation, (ShippingMethod) null, (PaymentMethod) null, false, 239, (Object) null));
    }
}
