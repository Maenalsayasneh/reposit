package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.stripe.android.R;
import com.stripe.android.databinding.PaymentMethodsActivityBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.AddPaymentMethodActivityStarter;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import h0.b.a.a;
import h0.b.a.e;
import h0.i.g.f.b;
import h0.i.i.q;
import h0.q.l0;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import m0.c;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 K2\u00020\u0001:\u0001KB\u0007¢\u0006\u0004\bJ\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J#\u0010\r\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010\u0004J\u000f\u0010!\u001a\u00020\u0002H\u0014¢\u0006\u0004\b!\u0010\u0004R\u001d\u0010'\u001a\u00020\"8B@\u0002X\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010,\u001a\u00020(8B@\u0002X\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u001d\u00101\u001a\u00020-8B@\u0002X\u0002¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u00100R\u001d\u00104\u001a\u00020\u00188B@\u0002X\u0002¢\u0006\f\n\u0004\b2\u0010$\u001a\u0004\b3\u0010\u001aR\u001d\u00109\u001a\u0002058@@\u0000X\u0002¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u00108R\u001d\u0010>\u001a\u00020:8B@\u0002X\u0002¢\u0006\f\n\u0004\b;\u0010$\u001a\u0004\b<\u0010=R,\u0010D\u001a\b\u0012\u0004\u0012\u00020@0?8B@\u0002X\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bA\u0010$\u001a\u0004\bB\u0010CR\u001d\u0010I\u001a\u00020E8B@\u0002X\u0002¢\u0006\f\n\u0004\bF\u0010$\u001a\u0004\bG\u0010H\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006L"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivity;", "Lh0/b/a/e;", "Lm0/i;", "setupRecyclerView", "()V", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "onAddedPaymentMethod", "(Lcom/stripe/android/model/PaymentMethod;)V", "fetchCustomerPaymentMethods", "finishWithGooglePay", "", "resultCode", "finishWithResult", "(Lcom/stripe/android/model/PaymentMethod;I)V", "Landroid/view/ViewGroup;", "contentRoot", "Landroid/view/View;", "createFooterView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "onSupportNavigateUp", "()Z", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "result", "onAddPaymentMethodResult$payments_core_release", "(Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;)V", "onAddPaymentMethodResult", "onBackPressed", "onDestroy", "Lcom/stripe/android/view/PaymentMethodsViewModel;", "viewModel$delegate", "Lm0/c;", "getViewModel", "()Lcom/stripe/android/view/PaymentMethodsViewModel;", "viewModel", "Lcom/stripe/android/view/PaymentMethodsAdapter;", "adapter$delegate", "getAdapter", "()Lcom/stripe/android/view/PaymentMethodsAdapter;", "adapter", "Lcom/stripe/android/view/CardDisplayTextFactory;", "cardDisplayTextFactory$delegate", "getCardDisplayTextFactory", "()Lcom/stripe/android/view/CardDisplayTextFactory;", "cardDisplayTextFactory", "startedFromPaymentSession$delegate", "getStartedFromPaymentSession", "startedFromPaymentSession", "Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;", "viewBinding$delegate", "getViewBinding$payments_core_release", "()Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;", "viewBinding", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "args$delegate", "getArgs", "()Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "args", "Lkotlin/Result;", "Lcom/stripe/android/CustomerSession;", "customerSession$delegate", "getCustomerSession-d1pmJ48", "()Ljava/lang/Object;", "customerSession", "Lcom/stripe/android/view/AlertDisplayer;", "alertDisplayer$delegate", "getAlertDisplayer", "()Lcom/stripe/android/view/AlertDisplayer;", "alertDisplayer", "<init>", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentMethodsActivity.kt */
public final class PaymentMethodsActivity extends e {
    public static final Companion Companion = new Companion((f) null);
    public static final String PRODUCT_TOKEN = "PaymentMethodsActivity";
    private final c adapter$delegate = h.H2(new PaymentMethodsActivity$adapter$2(this));
    private final c alertDisplayer$delegate = h.H2(new PaymentMethodsActivity$alertDisplayer$2(this));
    private final c args$delegate = h.H2(new PaymentMethodsActivity$args$2(this));
    private final c cardDisplayTextFactory$delegate = h.H2(new PaymentMethodsActivity$cardDisplayTextFactory$2(this));
    private final c customerSession$delegate = h.H2(new PaymentMethodsActivity$customerSession$2(this));
    private final c startedFromPaymentSession$delegate = h.H2(new PaymentMethodsActivity$startedFromPaymentSession$2(this));
    private final c viewBinding$delegate = h.H2(new PaymentMethodsActivity$viewBinding$2(this));
    private final c viewModel$delegate = new l0(m.a(PaymentMethodsViewModel.class), new PaymentMethodsActivity$$special$$inlined$viewModels$2(this), new PaymentMethodsActivity$viewModel$2(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivity$Companion;", "", "", "PRODUCT_TOKEN", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodsActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    private final View createFooterView(ViewGroup viewGroup) {
        if (getArgs().getPaymentMethodsFooterLayoutId() <= 0) {
            return null;
        }
        View inflate = getLayoutInflater().inflate(getArgs().getPaymentMethodsFooterLayoutId(), viewGroup, false);
        i.d(inflate, "footerView");
        inflate.setId(R.id.stripe_payment_methods_footer);
        if (!(inflate instanceof TextView)) {
            return inflate;
        }
        TextView textView = (TextView) inflate;
        b.c(textView, 15);
        q.i(inflate);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return inflate;
    }

    private final void fetchCustomerPaymentMethods() {
        getViewModel().getPaymentMethods$payments_core_release().observe(this, new PaymentMethodsActivity$fetchCustomerPaymentMethods$1(this));
    }

    /* access modifiers changed from: private */
    public final void finishWithGooglePay() {
        setResult(-1, new Intent().putExtras(new PaymentMethodsActivityStarter.Result((PaymentMethod) null, true, 1, (f) null).toBundle()));
        finish();
    }

    private final void finishWithResult(PaymentMethod paymentMethod, int i) {
        Intent intent = new Intent();
        intent.putExtras(new PaymentMethodsActivityStarter.Result(paymentMethod, getArgs().getUseGooglePay$payments_core_release() && paymentMethod == null).toBundle());
        setResult(i, intent);
        finish();
    }

    public static /* synthetic */ void finishWithResult$default(PaymentMethodsActivity paymentMethodsActivity, PaymentMethod paymentMethod, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        paymentMethodsActivity.finishWithResult(paymentMethod, i);
    }

    /* access modifiers changed from: private */
    public final PaymentMethodsAdapter getAdapter() {
        return (PaymentMethodsAdapter) this.adapter$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final AlertDisplayer getAlertDisplayer() {
        return (AlertDisplayer) this.alertDisplayer$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final PaymentMethodsActivityStarter.Args getArgs() {
        return (PaymentMethodsActivityStarter.Args) this.args$delegate.getValue();
    }

    private final CardDisplayTextFactory getCardDisplayTextFactory() {
        return (CardDisplayTextFactory) this.cardDisplayTextFactory$delegate.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: getCustomerSession-d1pmJ48  reason: not valid java name */
    public final Object m50getCustomerSessiond1pmJ48() {
        return ((Result) this.customerSession$delegate.getValue()).c;
    }

    /* access modifiers changed from: private */
    public final boolean getStartedFromPaymentSession() {
        return ((Boolean) this.startedFromPaymentSession$delegate.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public final PaymentMethodsViewModel getViewModel() {
        return (PaymentMethodsViewModel) this.viewModel$delegate.getValue();
    }

    private final void onAddedPaymentMethod(PaymentMethod paymentMethod) {
        PaymentMethod.Type type = paymentMethod.type;
        if (type == null || !type.isReusable) {
            finishWithResult$default(this, paymentMethod, 0, 2, (Object) null);
            return;
        }
        fetchCustomerPaymentMethods();
        getViewModel().onPaymentMethodAdded$payments_core_release(paymentMethod);
    }

    private final void setupRecyclerView() {
        DeletePaymentMethodDialogFactory deletePaymentMethodDialogFactory = new DeletePaymentMethodDialogFactory(this, getAdapter(), getCardDisplayTextFactory(), m50getCustomerSessiond1pmJ48(), getViewModel().getProductUsage$payments_core_release(), new PaymentMethodsActivity$setupRecyclerView$deletePaymentMethodDialogFactory$1(this));
        getAdapter().setListener$payments_core_release(new PaymentMethodsActivity$setupRecyclerView$1(this, deletePaymentMethodDialogFactory));
        PaymentMethodsRecyclerView paymentMethodsRecyclerView = getViewBinding$payments_core_release().recycler;
        i.d(paymentMethodsRecyclerView, "viewBinding.recycler");
        paymentMethodsRecyclerView.setAdapter(getAdapter());
        getViewBinding$payments_core_release().recycler.setPaymentMethodSelectedCallback$payments_core_release(new PaymentMethodsActivity$setupRecyclerView$2(this));
        if (getArgs().getCanDeletePaymentMethods$payments_core_release()) {
            getViewBinding$payments_core_release().recycler.attachItemTouchHelper$payments_core_release(new PaymentMethodSwipeCallback(this, getAdapter(), new SwipeToDeleteCallbackListener(deletePaymentMethodDialogFactory)));
        }
    }

    public final PaymentMethodsActivityBinding getViewBinding$payments_core_release() {
        return (PaymentMethodsActivityBinding) this.viewBinding$delegate.getValue();
    }

    public final void onAddPaymentMethodResult$payments_core_release(AddPaymentMethodActivityStarter.Result result) {
        i.e(result, "result");
        if (result instanceof AddPaymentMethodActivityStarter.Result.Success) {
            onAddedPaymentMethod(((AddPaymentMethodActivityStarter.Result.Success) result).getPaymentMethod());
        } else {
            boolean z = result instanceof AddPaymentMethodActivityStarter.Result.Failure;
        }
    }

    public void onBackPressed() {
        finishWithResult(getAdapter().getSelectedPaymentMethod$payments_core_release(), 0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (m50getCustomerSessiond1pmJ48() instanceof Result.Failure) {
            finishWithResult((PaymentMethod) null, 0);
            return;
        }
        setContentView((View) getViewBinding$payments_core_release().getRoot());
        Integer windowFlags$payments_core_release = getArgs().getWindowFlags$payments_core_release();
        if (windowFlags$payments_core_release != null) {
            getWindow().addFlags(windowFlags$payments_core_release.intValue());
        }
        getViewModel().getSnackbarData$payments_core_release().observe(this, new PaymentMethodsActivity$onCreate$2(this));
        getViewModel().getProgressData$payments_core_release().observe(this, new PaymentMethodsActivity$onCreate$3(this));
        setupRecyclerView();
        h0.a.f.b registerForActivityResult = registerForActivityResult(new AddPaymentMethodContract(), new PaymentMethodsActivity$sam$androidx_activity_result_ActivityResultCallback$0(new PaymentMethodsActivity$onCreate$addPaymentMethodLauncher$1(this)));
        i.d(registerForActivityResult, "registerForActivityResul…entMethodResult\n        )");
        getAdapter().getAddPaymentMethodArgs().observe(this, new PaymentMethodsActivity$onCreate$4(registerForActivityResult));
        setSupportActionBar(getViewBinding$payments_core_release().toolbar);
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
            supportActionBar.r(true);
        }
        FrameLayout frameLayout = getViewBinding$payments_core_release().footerContainer;
        i.d(frameLayout, "viewBinding.footerContainer");
        View createFooterView = createFooterView(frameLayout);
        if (createFooterView != null) {
            PaymentMethodsRecyclerView paymentMethodsRecyclerView = getViewBinding$payments_core_release().recycler;
            i.d(paymentMethodsRecyclerView, "viewBinding.recycler");
            paymentMethodsRecyclerView.setAccessibilityTraversalBefore(createFooterView.getId());
            PaymentMethodsRecyclerView paymentMethodsRecyclerView2 = getViewBinding$payments_core_release().recycler;
            i.d(paymentMethodsRecyclerView2, "viewBinding.recycler");
            createFooterView.setAccessibilityTraversalAfter(paymentMethodsRecyclerView2.getId());
            getViewBinding$payments_core_release().footerContainer.addView(createFooterView);
            FrameLayout frameLayout2 = getViewBinding$payments_core_release().footerContainer;
            i.d(frameLayout2, "viewBinding.footerContainer");
            frameLayout2.setVisibility(0);
        }
        fetchCustomerPaymentMethods();
        getViewBinding$payments_core_release().recycler.requestFocusFromTouch();
    }

    public void onDestroy() {
        PaymentMethodsViewModel viewModel = getViewModel();
        PaymentMethod selectedPaymentMethod$payments_core_release = getAdapter().getSelectedPaymentMethod$payments_core_release();
        viewModel.setSelectedPaymentMethodId$payments_core_release(selectedPaymentMethod$payments_core_release != null ? selectedPaymentMethod$payments_core_release.id : null);
        super.onDestroy();
    }

    public boolean onSupportNavigateUp() {
        finishWithResult(getAdapter().getSelectedPaymentMethod$payments_core_release(), 0);
        return true;
    }
}
