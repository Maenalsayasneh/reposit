package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.stripe.android.CustomerSession;
import com.stripe.android.R;
import com.stripe.android.Stripe;
import com.stripe.android.databinding.AddPaymentMethodActivityBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.AddPaymentMethodActivityStarter;
import h0.i.g.f.b;
import h0.i.i.q;
import h0.q.l0;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import m0.c;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 H2\u00020\u0001:\u0001HB\u0007¢\u0006\u0004\bG\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ!\u0010%\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b(\u0010)R\u001d\u0010 \u001a\u00020\u001f8B@\u0002X\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0016\u00101\u001a\u00020.8C@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u001d\u0010\u0003\u001a\u00020\u00028B@\u0002X\u0002¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u00104R\u001d\u00108\u001a\u00020&8B@\u0002X\u0002¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u00107R\u001d\u0010=\u001a\u0002098B@\u0002X\u0002¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b;\u0010<R\u001d\u0010B\u001a\u00020>8B@\u0002X\u0002¢\u0006\f\n\u0004\b?\u0010+\u001a\u0004\b@\u0010AR\u001d\u0010F\u001a\u00020\u00078B@\u0002X\u0002¢\u0006\f\n\u0004\bC\u0010+\u001a\u0004\bD\u0010E¨\u0006I"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivity;", "Lcom/stripe/android/view/StripeActivity;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "args", "Lm0/i;", "configureView", "(Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;)V", "Lcom/stripe/android/view/AddPaymentMethodView;", "createPaymentMethodView", "(Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;)Lcom/stripe/android/view/AddPaymentMethodView;", "Landroid/view/ViewGroup;", "contentRoot", "Landroid/view/View;", "createFooterView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "attachPaymentMethodToCustomer", "(Lcom/stripe/android/model/PaymentMethod;)V", "finishWithPaymentMethod", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "result", "finishWithResult", "(Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "()V", "onActionSave", "Lcom/stripe/android/view/AddPaymentMethodViewModel;", "viewModel", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "params", "createPaymentMethod$payments_core_release", "(Lcom/stripe/android/view/AddPaymentMethodViewModel;Lcom/stripe/android/model/PaymentMethodCreateParams;)V", "createPaymentMethod", "", "visible", "onProgressBarVisibilityChanged", "(Z)V", "viewModel$delegate", "Lm0/c;", "getViewModel", "()Lcom/stripe/android/view/AddPaymentMethodViewModel;", "", "getTitleStringRes", "()I", "titleStringRes", "args$delegate", "getArgs", "()Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "shouldAttachToCustomer$delegate", "getShouldAttachToCustomer", "()Z", "shouldAttachToCustomer", "Lcom/stripe/android/Stripe;", "stripe$delegate", "getStripe", "()Lcom/stripe/android/Stripe;", "stripe", "Lcom/stripe/android/model/PaymentMethod$Type;", "paymentMethodType$delegate", "getPaymentMethodType", "()Lcom/stripe/android/model/PaymentMethod$Type;", "paymentMethodType", "addPaymentMethodView$delegate", "getAddPaymentMethodView", "()Lcom/stripe/android/view/AddPaymentMethodView;", "addPaymentMethodView", "<init>", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AddPaymentMethodActivity.kt */
public final class AddPaymentMethodActivity extends StripeActivity {
    public static final Companion Companion = new Companion((f) null);
    public static final String PRODUCT_TOKEN = "AddPaymentMethodActivity";
    private final c addPaymentMethodView$delegate = h.H2(new AddPaymentMethodActivity$addPaymentMethodView$2(this));
    private final c args$delegate = h.H2(new AddPaymentMethodActivity$args$2(this));
    private final c paymentMethodType$delegate = h.H2(new AddPaymentMethodActivity$paymentMethodType$2(this));
    private final c shouldAttachToCustomer$delegate = h.H2(new AddPaymentMethodActivity$shouldAttachToCustomer$2(this));
    private final c stripe$delegate = h.H2(new AddPaymentMethodActivity$stripe$2(this));
    private final c viewModel$delegate = new l0(m.a(AddPaymentMethodViewModel.class), new AddPaymentMethodActivity$$special$$inlined$viewModels$2(this), new AddPaymentMethodActivity$viewModel$2(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivity$Companion;", "", "", "PRODUCT_TOKEN", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AddPaymentMethodActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            PaymentMethod.Type.values();
            int[] iArr = new int[21];
            $EnumSwitchMapping$0 = iArr;
            PaymentMethod.Type type = PaymentMethod.Type.Card;
            iArr[type.ordinal()] = 1;
            PaymentMethod.Type type2 = PaymentMethod.Type.Fpx;
            iArr[type2.ordinal()] = 2;
            PaymentMethod.Type type3 = PaymentMethod.Type.Netbanking;
            iArr[type3.ordinal()] = 3;
            PaymentMethod.Type.values();
            int[] iArr2 = new int[21];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[type.ordinal()] = 1;
            iArr2[type2.ordinal()] = 2;
            iArr2[type3.ordinal()] = 3;
        }
    }

    /* access modifiers changed from: private */
    public final void attachPaymentMethodToCustomer(PaymentMethod paymentMethod) {
        Object obj;
        try {
            obj = CustomerSession.Companion.getInstance();
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        Throwable a = Result.a(obj);
        if (a == null) {
            getViewModel().attachPaymentMethod$payments_core_release((CustomerSession) obj, paymentMethod).observe(this, new AddPaymentMethodActivity$attachPaymentMethodToCustomer$$inlined$fold$lambda$1(this, paymentMethod));
            return;
        }
        finishWithResult(new AddPaymentMethodActivityStarter.Result.Failure(a));
    }

    private final void configureView(AddPaymentMethodActivityStarter.Args args) {
        Integer windowFlags$payments_core_release = args.getWindowFlags$payments_core_release();
        if (windowFlags$payments_core_release != null) {
            getWindow().addFlags(windowFlags$payments_core_release.intValue());
        }
        getViewStub$payments_core_release().setLayoutResource(R.layout.add_payment_method_activity);
        View inflate = getViewStub$payments_core_release().inflate();
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        AddPaymentMethodActivityBinding bind = AddPaymentMethodActivityBinding.bind((ViewGroup) inflate);
        i.d(bind, "AddPaymentMethodActivityBinding.bind(scrollView)");
        bind.root.addView(getAddPaymentMethodView());
        LinearLayout linearLayout = bind.root;
        i.d(linearLayout, "viewBinding.root");
        View createFooterView = createFooterView(linearLayout);
        if (createFooterView != null) {
            getAddPaymentMethodView().setAccessibilityTraversalBefore(createFooterView.getId());
            createFooterView.setAccessibilityTraversalAfter(getAddPaymentMethodView().getId());
            bind.root.addView(createFooterView);
        }
        setTitle(getTitleStringRes());
    }

    private final View createFooterView(ViewGroup viewGroup) {
        if (getArgs().getAddPaymentMethodFooterLayoutId$payments_core_release() <= 0) {
            return null;
        }
        View inflate = getLayoutInflater().inflate(getArgs().getAddPaymentMethodFooterLayoutId$payments_core_release(), viewGroup, false);
        i.d(inflate, "footerView");
        inflate.setId(R.id.stripe_add_payment_method_footer);
        if (!(inflate instanceof TextView)) {
            return inflate;
        }
        TextView textView = (TextView) inflate;
        b.c(textView, 15);
        q.i(inflate);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return inflate;
    }

    /* access modifiers changed from: private */
    public final AddPaymentMethodView createPaymentMethodView(AddPaymentMethodActivityStarter.Args args) {
        int ordinal = getPaymentMethodType().ordinal();
        if (ordinal == 0) {
            return new AddPaymentMethodCardView(this, (AttributeSet) null, 0, args.getBillingAddressFields$payments_core_release(), 6, (f) null);
        } else if (ordinal == 2) {
            return AddPaymentMethodFpxView.Companion.create$payments_core_release(this);
        } else {
            if (ordinal == 18) {
                return AddPaymentMethodNetbankingView.Companion.create$payments_core_release(this);
            }
            StringBuilder P0 = a.P0("Unsupported Payment Method type: ");
            P0.append(getPaymentMethodType().code);
            throw new IllegalArgumentException(P0.toString());
        }
    }

    /* access modifiers changed from: private */
    public final void finishWithPaymentMethod(PaymentMethod paymentMethod) {
        finishWithResult(new AddPaymentMethodActivityStarter.Result.Success(paymentMethod));
    }

    private final void finishWithResult(AddPaymentMethodActivityStarter.Result result) {
        setProgressBarVisible(false);
        setResult(-1, new Intent().putExtras(result.toBundle()));
        finish();
    }

    private final AddPaymentMethodView getAddPaymentMethodView() {
        return (AddPaymentMethodView) this.addPaymentMethodView$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final AddPaymentMethodActivityStarter.Args getArgs() {
        return (AddPaymentMethodActivityStarter.Args) this.args$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final PaymentMethod.Type getPaymentMethodType() {
        return (PaymentMethod.Type) this.paymentMethodType$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final boolean getShouldAttachToCustomer() {
        return ((Boolean) this.shouldAttachToCustomer$delegate.getValue()).booleanValue();
    }

    /* access modifiers changed from: private */
    public final Stripe getStripe() {
        return (Stripe) this.stripe$delegate.getValue();
    }

    private final int getTitleStringRes() {
        int ordinal = getPaymentMethodType().ordinal();
        if (ordinal == 0) {
            return R.string.title_add_a_card;
        }
        if (ordinal == 2) {
            return R.string.title_bank_account;
        }
        if (ordinal == 18) {
            return R.string.title_bank_account;
        }
        StringBuilder P0 = a.P0("Unsupported Payment Method type: ");
        P0.append(getPaymentMethodType().code);
        throw new IllegalArgumentException(P0.toString());
    }

    private final AddPaymentMethodViewModel getViewModel() {
        return (AddPaymentMethodViewModel) this.viewModel$delegate.getValue();
    }

    public final void createPaymentMethod$payments_core_release(AddPaymentMethodViewModel addPaymentMethodViewModel, PaymentMethodCreateParams paymentMethodCreateParams) {
        i.e(addPaymentMethodViewModel, "viewModel");
        if (paymentMethodCreateParams != null) {
            setProgressBarVisible(true);
            addPaymentMethodViewModel.createPaymentMethod$payments_core_release(paymentMethodCreateParams).observe(this, new AddPaymentMethodActivity$createPaymentMethod$1(this));
        }
    }

    public void onActionSave() {
        createPaymentMethod$payments_core_release(getViewModel(), getAddPaymentMethodView().getCreateParams());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        configureView(getArgs());
        setResult(-1, new Intent().putExtras(AddPaymentMethodActivityStarter.Result.Canceled.INSTANCE.toBundle()));
    }

    public void onProgressBarVisibilityChanged(boolean z) {
        getAddPaymentMethodView().setCommunicatingProgress(z);
    }

    public void onResume() {
        super.onResume();
        getAddPaymentMethodView().requestFocus();
    }
}
