package com.stripe.android;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import com.stripe.android.PaymentSessionViewModel;
import com.stripe.android.view.ActivityStarter;
import com.stripe.android.view.PaymentFlowActivity;
import com.stripe.android.view.PaymentFlowActivityStarter;
import com.stripe.android.view.PaymentMethodsActivity;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import h0.q.k0;
import h0.q.n0;
import h0.q.o0;
import h0.q.p;
import h0.q.z;
import h0.x.c;
import i0.d.a.a.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¯\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u00012\u0018\u0000 O2\u00020\u0001:\u0002OPBs\b\u0001\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010@\u001a\u00020?\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010B\u001a\u00020A\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010D\u001a\u00020C\u0012\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020705\u0012\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;05\u0012\b\b\u0002\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HB\u0019\b\u0016\u0012\u0006\u0010J\u001a\u00020I\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\bG\u0010KB\u0019\b\u0016\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\bG\u0010NJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\fJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\fR$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0015R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010+\u001a\u00020*8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00108\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u000207058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010<\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u00109¨\u0006Q"}, d2 = {"Lcom/stripe/android/PaymentSession;", "", "Landroid/content/Intent;", "data", "Lm0/i;", "onPaymentMethodResult", "(Landroid/content/Intent;)V", "", "isInitialFetch", "fetchCustomer", "(Z)V", "onCompleted", "()V", "", "requestCode", "resultCode", "handlePaymentData", "(IILandroid/content/Intent;)Z", "Lcom/stripe/android/PaymentSession$PaymentSessionListener;", "listener", "init", "(Lcom/stripe/android/PaymentSession$PaymentSessionListener;)V", "", "selectedPaymentMethodId", "presentPaymentMethodSelection", "(Ljava/lang/String;)V", "", "cartTotal", "setCartTotal", "(J)V", "presentShippingFlow", "clearPaymentMethod", "Lcom/stripe/android/PaymentSession$PaymentSessionListener;", "getListener$payments_core_release", "()Lcom/stripe/android/PaymentSession$PaymentSessionListener;", "setListener$payments_core_release", "Lcom/stripe/android/PaymentSessionConfig;", "config", "Lcom/stripe/android/PaymentSessionConfig;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/stripe/android/PaymentSessionViewModel;", "viewModel", "Lcom/stripe/android/PaymentSessionViewModel;", "getViewModel$payments_core_release", "()Lcom/stripe/android/PaymentSessionViewModel;", "Lh0/q/p;", "lifecycleOwner", "Lh0/q/p;", "com/stripe/android/PaymentSession$lifecycleObserver$1", "lifecycleObserver", "Lcom/stripe/android/PaymentSession$lifecycleObserver$1;", "Lcom/stripe/android/view/ActivityStarter;", "Lcom/stripe/android/view/PaymentMethodsActivity;", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "paymentMethodsActivityStarter", "Lcom/stripe/android/view/ActivityStarter;", "Lcom/stripe/android/view/PaymentFlowActivity;", "Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "paymentFlowActivityStarter", "Landroid/app/Application;", "application", "Lh0/q/o0;", "viewModelStoreOwner", "Lh0/x/c;", "savedStateRegistryOwner", "Lcom/stripe/android/CustomerSession;", "customerSession", "Lcom/stripe/android/PaymentSessionData;", "paymentSessionData", "<init>", "(Landroid/content/Context;Landroid/app/Application;Lh0/q/o0;Lh0/q/p;Lh0/x/c;Lcom/stripe/android/PaymentSessionConfig;Lcom/stripe/android/CustomerSession;Lcom/stripe/android/view/ActivityStarter;Lcom/stripe/android/view/ActivityStarter;Lcom/stripe/android/PaymentSessionData;)V", "Landroidx/activity/ComponentActivity;", "activity", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/PaymentSessionConfig;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/PaymentSessionConfig;)V", "Companion", "PaymentSessionListener", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSession.kt */
public final class PaymentSession {
    public static final Companion Companion = new Companion((f) null);
    public static final String EXTRA_PAYMENT_SESSION_DATA = "extra_payment_session_data";
    public static final String PRODUCT_TOKEN = "PaymentSession";
    /* access modifiers changed from: private */
    public static final Set<Integer> VALID_REQUEST_CODES = g.h0(Integer.valueOf(PaymentMethodsActivityStarter.REQUEST_CODE), Integer.valueOf(PaymentFlowActivityStarter.REQUEST_CODE));
    private final PaymentSessionConfig config;
    private final Context context;
    private final PaymentSession$lifecycleObserver$1 lifecycleObserver;
    private final p lifecycleOwner;
    private /* synthetic */ PaymentSessionListener listener;
    private final ActivityStarter<PaymentFlowActivity, PaymentFlowActivityStarter.Args> paymentFlowActivityStarter;
    private final ActivityStarter<PaymentMethodsActivity, PaymentMethodsActivityStarter.Args> paymentMethodsActivityStarter;
    private final PaymentSessionViewModel viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/PaymentSession$Companion;", "", "", "requestCode", "", "isValidRequestCode", "(I)Z", "", "EXTRA_PAYMENT_SESSION_DATA", "Ljava/lang/String;", "PRODUCT_TOKEN", "", "VALID_REQUEST_CODES", "Ljava/util/Set;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSession.kt */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final boolean isValidRequestCode(int i) {
            return PaymentSession.VALID_REQUEST_CODES.contains(Integer.valueOf(i));
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/PaymentSession$PaymentSessionListener;", "", "", "isCommunicating", "Lm0/i;", "onCommunicatingStateChanged", "(Z)V", "", "errorCode", "", "errorMessage", "onError", "(ILjava/lang/String;)V", "Lcom/stripe/android/PaymentSessionData;", "data", "onPaymentSessionDataChanged", "(Lcom/stripe/android/PaymentSessionData;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSession.kt */
    public interface PaymentSessionListener {
        void onCommunicatingStateChanged(boolean z);

        void onError(int i, String str);

        void onPaymentSessionDataChanged(PaymentSessionData paymentSessionData);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            PaymentSessionViewModel.NetworkState.values();
            int[] iArr = new int[2];
            $EnumSwitchMapping$0 = iArr;
            iArr[PaymentSessionViewModel.NetworkState.Active.ordinal()] = 1;
            iArr[PaymentSessionViewModel.NetworkState.Inactive.ordinal()] = 2;
        }
    }

    public PaymentSession(Context context2, Application application, o0 o0Var, p pVar, c cVar, PaymentSessionConfig paymentSessionConfig, CustomerSession customerSession, ActivityStarter<PaymentMethodsActivity, PaymentMethodsActivityStarter.Args> activityStarter, ActivityStarter<PaymentFlowActivity, PaymentFlowActivityStarter.Args> activityStarter2, PaymentSessionData paymentSessionData) {
        i.e(context2, "context");
        i.e(application, "application");
        i.e(o0Var, "viewModelStoreOwner");
        i.e(pVar, "lifecycleOwner");
        i.e(cVar, "savedStateRegistryOwner");
        i.e(paymentSessionConfig, "config");
        i.e(customerSession, "customerSession");
        i.e(activityStarter, "paymentMethodsActivityStarter");
        i.e(activityStarter2, "paymentFlowActivityStarter");
        i.e(paymentSessionData, "paymentSessionData");
        this.context = context2;
        this.lifecycleOwner = pVar;
        this.config = paymentSessionConfig;
        this.paymentMethodsActivityStarter = activityStarter;
        this.paymentFlowActivityStarter = activityStarter2;
        PaymentSessionViewModel.Factory factory = new PaymentSessionViewModel.Factory(application, cVar, paymentSessionData, customerSession);
        n0 viewModelStore = o0Var.getViewModelStore();
        Class cls = PaymentSessionViewModel.class;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String n02 = a.n0("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            k0 k0Var = viewModelStore.a.get(n02);
            if (cls.isInstance(k0Var)) {
                factory.onRequery(k0Var);
            } else {
                k0Var = factory.create(n02, cls);
                k0 put = viewModelStore.a.put(n02, k0Var);
                if (put != null) {
                    put.onCleared();
                }
            }
            i.d(k0Var, "ViewModelProvider(\n     …ionViewModel::class.java]");
            PaymentSessionViewModel paymentSessionViewModel = (PaymentSessionViewModel) k0Var;
            this.viewModel = paymentSessionViewModel;
            PaymentSession$lifecycleObserver$1 paymentSession$lifecycleObserver$1 = new PaymentSession$lifecycleObserver$1(this);
            this.lifecycleObserver = paymentSession$lifecycleObserver$1;
            pVar.getLifecycle().a(paymentSession$lifecycleObserver$1);
            paymentSessionViewModel.getNetworkState$payments_core_release().observe(pVar, new z<PaymentSessionViewModel.NetworkState>(this) {
                public final /* synthetic */ PaymentSession this$0;

                {
                    this.this$0 = r1;
                }

                public final void onChanged(PaymentSessionViewModel.NetworkState networkState) {
                    PaymentSessionListener listener$payments_core_release;
                    if (networkState != null && (listener$payments_core_release = this.this$0.getListener$payments_core_release()) != null) {
                        int ordinal = networkState.ordinal();
                        boolean z = true;
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                z = false;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        listener$payments_core_release.onCommunicatingStateChanged(z);
                    }
                }
            });
            paymentSessionViewModel.getPaymentSessionDataLiveData().observe(pVar, new z<PaymentSessionData>(this) {
                public final /* synthetic */ PaymentSession this$0;

                {
                    this.this$0 = r1;
                }

                public final void onChanged(PaymentSessionData paymentSessionData) {
                    PaymentSessionListener listener$payments_core_release = this.this$0.getListener$payments_core_release();
                    if (listener$payments_core_release != null) {
                        i.d(paymentSessionData, "it");
                        listener$payments_core_release.onPaymentSessionDataChanged(paymentSessionData);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    private final void fetchCustomer(boolean z) {
        this.viewModel.fetchCustomer(z).observe(this.lifecycleOwner, new PaymentSession$fetchCustomer$1(this));
    }

    public static /* synthetic */ void fetchCustomer$default(PaymentSession paymentSession, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        paymentSession.fetchCustomer(z);
    }

    private final void onPaymentMethodResult(Intent intent) {
        this.viewModel.onPaymentMethodResult(PaymentMethodsActivityStarter.Result.Companion.fromIntent(intent));
    }

    public static /* synthetic */ void presentPaymentMethodSelection$default(PaymentSession paymentSession, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        paymentSession.presentPaymentMethodSelection(str);
    }

    public final void clearPaymentMethod() {
        this.viewModel.clearPaymentMethod();
    }

    public final PaymentSessionListener getListener$payments_core_release() {
        return this.listener;
    }

    public final PaymentSessionViewModel getViewModel$payments_core_release() {
        return this.viewModel;
    }

    public final boolean handlePaymentData(int i, int i2, Intent intent) {
        if (intent == null || !Companion.isValidRequestCode(i)) {
            return false;
        }
        if (i2 == -1) {
            if (i == 6000) {
                onPaymentMethodResult(intent);
            } else if (i != 6002) {
                return false;
            } else {
                PaymentSessionData paymentSessionData = (PaymentSessionData) intent.getParcelableExtra(EXTRA_PAYMENT_SESSION_DATA);
                if (paymentSessionData != null) {
                    PaymentSessionViewModel paymentSessionViewModel = this.viewModel;
                    i.d(paymentSessionData, "it");
                    paymentSessionViewModel.onPaymentFlowResult(paymentSessionData);
                }
            }
            return true;
        } else if (i2 != 0) {
            return false;
        } else {
            if (i == 6000) {
                onPaymentMethodResult(intent);
            } else {
                fetchCustomer$default(this, false, 1, (Object) null);
            }
            return false;
        }
    }

    public final void init(PaymentSessionListener paymentSessionListener) {
        i.e(paymentSessionListener, "listener");
        this.listener = paymentSessionListener;
        this.viewModel.onListenerAttached();
        if (this.config.getShouldPrefetchCustomer$payments_core_release()) {
            fetchCustomer(true);
        }
    }

    public final void onCompleted() {
        this.viewModel.onCompleted();
    }

    public final void presentPaymentMethodSelection(String str) {
        this.paymentMethodsActivityStarter.startForResult(new PaymentMethodsActivityStarter.Args.Builder().setInitialPaymentMethodId(this.viewModel.getSelectedPaymentMethodId(str)).setPaymentMethodsFooter(this.config.getPaymentMethodsFooterLayoutId()).setAddPaymentMethodFooter(this.config.getAddPaymentMethodFooterLayoutId()).setIsPaymentSessionActive(true).setPaymentConfiguration(PaymentConfiguration.Companion.getInstance(this.context)).setPaymentMethodTypes(this.config.getPaymentMethodTypes()).setShouldShowGooglePay(this.config.getShouldShowGooglePay()).setWindowFlags(this.config.getWindowFlags$payments_core_release()).setBillingAddressFields(this.config.getBillingAddressFields()).setUseGooglePay$payments_core_release(this.viewModel.getPaymentSessionData().getUseGooglePay()).setCanDeletePaymentMethods(this.config.getCanDeletePaymentMethods()).build());
    }

    public final void presentShippingFlow() {
        this.paymentFlowActivityStarter.startForResult(new PaymentFlowActivityStarter.Args(this.config, this.viewModel.getPaymentSessionData(), true, this.config.getWindowFlags$payments_core_release()));
    }

    public final void setCartTotal(long j) {
        this.viewModel.updateCartTotal(j);
    }

    public final void setListener$payments_core_release(PaymentSessionListener paymentSessionListener) {
        this.listener = paymentSessionListener;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PaymentSession(android.content.Context r13, android.app.Application r14, h0.q.o0 r15, h0.q.p r16, h0.x.c r17, com.stripe.android.PaymentSessionConfig r18, com.stripe.android.CustomerSession r19, com.stripe.android.view.ActivityStarter r20, com.stripe.android.view.ActivityStarter r21, com.stripe.android.PaymentSessionData r22, int r23, m0.n.b.f r24) {
        /*
            r12 = this;
            r0 = r23
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x000f
            com.stripe.android.PaymentSessionData r0 = new com.stripe.android.PaymentSessionData
            r7 = r18
            r0.<init>(r7)
            r11 = r0
            goto L_0x0013
        L_0x000f:
            r7 = r18
            r11 = r22
        L_0x0013:
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.PaymentSession.<init>(android.content.Context, android.app.Application, h0.q.o0, h0.q.p, h0.x.c, com.stripe.android.PaymentSessionConfig, com.stripe.android.CustomerSession, com.stripe.android.view.ActivityStarter, com.stripe.android.view.ActivityStarter, com.stripe.android.PaymentSessionData, int, m0.n.b.f):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PaymentSession(androidx.activity.ComponentActivity r14, com.stripe.android.PaymentSessionConfig r15) {
        /*
            r13 = this;
            java.lang.String r0 = "activity"
            m0.n.b.i.e(r14, r0)
            java.lang.String r0 = "config"
            m0.n.b.i.e(r15, r0)
            android.content.Context r1 = r14.getApplicationContext()
            java.lang.String r0 = "activity.applicationContext"
            m0.n.b.i.d(r1, r0)
            android.app.Application r2 = r14.getApplication()
            java.lang.String r0 = "activity.application"
            m0.n.b.i.d(r2, r0)
            com.stripe.android.CustomerSession$Companion r0 = com.stripe.android.CustomerSession.Companion
            com.stripe.android.CustomerSession r7 = r0.getInstance()
            com.stripe.android.view.PaymentMethodsActivityStarter r8 = new com.stripe.android.view.PaymentMethodsActivityStarter
            r8.<init>((android.app.Activity) r14)
            com.stripe.android.view.PaymentFlowActivityStarter r9 = new com.stripe.android.view.PaymentFlowActivityStarter
            r9.<init>((android.app.Activity) r14, (com.stripe.android.PaymentSessionConfig) r15)
            r10 = 0
            r11 = 512(0x200, float:7.175E-43)
            r12 = 0
            r0 = r13
            r3 = r14
            r4 = r14
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.PaymentSession.<init>(androidx.activity.ComponentActivity, com.stripe.android.PaymentSessionConfig):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PaymentSession(androidx.fragment.app.Fragment r14, com.stripe.android.PaymentSessionConfig r15) {
        /*
            r13 = this;
            java.lang.String r0 = "fragment"
            m0.n.b.i.e(r14, r0)
            java.lang.String r0 = "config"
            m0.n.b.i.e(r15, r0)
            h0.o.a.k r0 = r14.requireActivity()
            java.lang.String r1 = "fragment.requireActivity()"
            m0.n.b.i.d(r0, r1)
            android.content.Context r2 = r0.getApplicationContext()
            java.lang.String r0 = "fragment.requireActivity().applicationContext"
            m0.n.b.i.d(r2, r0)
            h0.o.a.k r0 = r14.requireActivity()
            m0.n.b.i.d(r0, r1)
            android.app.Application r3 = r0.getApplication()
            java.lang.String r0 = "fragment.requireActivity().application"
            m0.n.b.i.d(r3, r0)
            com.stripe.android.CustomerSession$Companion r0 = com.stripe.android.CustomerSession.Companion
            com.stripe.android.CustomerSession r7 = r0.getInstance()
            com.stripe.android.view.PaymentMethodsActivityStarter r8 = new com.stripe.android.view.PaymentMethodsActivityStarter
            r8.<init>((androidx.fragment.app.Fragment) r14)
            com.stripe.android.view.PaymentFlowActivityStarter r9 = new com.stripe.android.view.PaymentFlowActivityStarter
            r9.<init>((androidx.fragment.app.Fragment) r14, (com.stripe.android.PaymentSessionConfig) r15)
            r10 = 0
            r11 = 512(0x200, float:7.175E-43)
            r12 = 0
            r0 = r13
            r1 = r2
            r2 = r3
            r3 = r14
            r4 = r14
            r5 = r14
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.PaymentSession.<init>(androidx.fragment.app.Fragment, com.stripe.android.PaymentSessionConfig):void");
    }
}
