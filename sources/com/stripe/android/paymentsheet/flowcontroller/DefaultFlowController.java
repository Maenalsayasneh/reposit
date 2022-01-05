package com.stripe.android.paymentsheet.flowcontroller;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.PaymentController;
import com.stripe.android.PaymentRelayContract;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.googlepay.StripeGooglePayContract;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.PaymentFlowResultProcessor;
import com.stripe.android.payments.Stripe3ds2CompletionContract;
import com.stripe.android.paymentsheet.PaymentOptionCallback;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionResult;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetResult;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.analytics.SessionId;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.ConfirmStripeIntentParamsFactory;
import com.stripe.android.paymentsheet.model.PaymentIntentClientSecret;
import com.stripe.android.paymentsheet.model.PaymentOption;
import com.stripe.android.paymentsheet.model.PaymentOptionFactory;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.model.SetupIntentClientSecret;
import com.stripe.android.view.AuthActivityStarter;
import h0.a.f.b;
import h0.q.k0;
import h0.q.m0;
import h0.q.o0;
import i0.j.f.p.h;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import m0.c;
import m0.i;
import m0.l.e;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.a.q;
import m0.n.b.f;
import n0.a.d0;
import n0.a.f0;
import n0.a.h2.o;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0004\u0001\u0001BÈ\u0001\b\u0000\u0012\u0006\u0010j\u001a\u00020i\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\u0006\u0010d\u001a\u00020c\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\u000f\u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u000100Q\u0012\f\u0010S\u001a\b\u0012\u0004\u0012\u00020R0Q\u0012\u0006\u0010r\u001a\u00020q\u0012\u0006\u0010w\u001a\u00020v\u0012\b\u0010\u0001\u001a\u00030\u0001\u00124\u0010\u0001\u001a/\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020l\u0012\u0018\u0012\u0016\u0012\u0006\b\u0001\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130X0\u0001\u0012\u0006\u0010V\u001a\u00020U\u0012\u0006\u0010B\u001a\u00020A\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\u0006\u0010g\u001a\u00020f\u0012\u0006\u0010}\u001a\u00020|¢\u0006\u0006\b\u0001\u0010\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u0011\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010#J\u0017\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b'\u0010(J#\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u0019\u00102\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010.H\u0000¢\u0006\u0004\b0\u00101J\u0017\u00107\u001a\u00020\b2\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b5\u00106R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001d\u0010@\u001a\u00020;8B@\u0002X\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010E\u001a\b\u0012\u0004\u0012\u0002030D8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001c\u0010H\u001a\b\u0012\u0004\u0012\u00020G0D8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010FR.\u0010K\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0I8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001c\u0010S\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020U8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010WR1\u0010\\\u001a\u0016\u0012\u0006\b\u0001\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130X8B@\u0002X\u0002¢\u0006\f\n\u0004\bY\u0010=\u001a\u0004\bZ\u0010[R\u001c\u0010]\u001a\b\u0012\u0004\u0012\u00020J0D8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b]\u0010FR\u001d\u0010b\u001a\u00020^8B@\u0002X\u0002¢\u0006\f\n\u0004\b_\u0010=\u001a\u0004\b`\u0010aR\u0016\u0010d\u001a\u00020c8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010g\u001a\u00020f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010j\u001a\u00020i8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001d\u0010p\u001a\u00020l8B@\u0002X\u0002¢\u0006\f\n\u0004\bm\u0010=\u001a\u0004\bn\u0010oR\u0016\u0010r\u001a\u00020q8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u001c\u0010u\u001a\b\u0012\u0004\u0012\u00020t0D8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bu\u0010FR\u0016\u0010w\u001a\u00020v8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bw\u0010xR.\u0010y\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0I8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\by\u0010L\u001a\u0004\bz\u0010N\"\u0004\b{\u0010PR\u0016\u0010}\u001a\u00020|8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b}\u0010~R \u0010\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u000100Q8\u0002@\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010TR\u001f\u0010\u0001\u001a\t\u0012\u0005\u0012\u00030\u00010D8\u0002@\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0001\u0010F\u0002\u0004\n\u0002\b\u0019¨\u0006\u0001"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController;", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "clientSecret", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;", "callback", "Lm0/i;", "configureInternal", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;)V", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "Lcom/stripe/android/paymentsheet/flowcontroller/InitData;", "initData", "confirmPaymentSelection", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/flowcontroller/InitData;)V", "onInitSuccess", "(Lcom/stripe/android/paymentsheet/flowcontroller/InitData;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;)V", "Lcom/stripe/android/StripeIntentResult;", "Lcom/stripe/android/model/StripeIntent;", "stripeIntentResult", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "createPaymentSheetResult", "(Lcom/stripe/android/StripeIntentResult;)Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "", "paymentIntentClientSecret", "configureWithPaymentIntent", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;)V", "setupIntentClientSecret", "configureWithSetupIntent", "Lcom/stripe/android/paymentsheet/model/PaymentOption;", "getPaymentOption", "()Lcom/stripe/android/paymentsheet/model/PaymentOption;", "presentPaymentOptions", "()V", "confirm", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;", "googlePayResult", "onGooglePayResult$payments_core_release", "(Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;)V", "onGooglePayResult", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult;", "result", "dispatchResult", "(Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult;Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "paymentOptionResult", "onPaymentOptionResult$payments_core_release", "(Lcom/stripe/android/paymentsheet/PaymentOptionResult;)V", "onPaymentOptionResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "paymentFlowResult", "onPaymentFlowResult$payments_core_release", "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V", "onPaymentFlowResult", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;", "viewModel", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerViewModel;", "Lcom/stripe/android/PaymentController;", "paymentController$delegate", "Lm0/c;", "getPaymentController", "()Lcom/stripe/android/PaymentController;", "paymentController", "Lcom/stripe/android/paymentsheet/analytics/SessionId;", "sessionId", "Lcom/stripe/android/paymentsheet/analytics/SessionId;", "Lh0/a/f/b;", "stripe3ds2ChallengeLauncher", "Lh0/a/f/b;", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Args;", "googlePayActivityLauncher", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "paymentOptionLauncher", "Lm0/n/a/l;", "getPaymentOptionLauncher$payments_core_release", "()Lm0/n/a/l;", "setPaymentOptionLauncher$payments_core_release", "(Lm0/n/a/l;)V", "Lkotlin/Function0;", "Lcom/stripe/android/view/AuthActivityStarter$Host;", "authHostSupplier", "Lm0/n/a/a;", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "Lcom/stripe/android/payments/PaymentFlowResultProcessor;", "paymentFlowResultProcessor$delegate", "getPaymentFlowResultProcessor", "()Lcom/stripe/android/payments/PaymentFlowResultProcessor;", "paymentFlowResultProcessor", "paymentOptionActivityLauncher", "Lcom/stripe/android/PaymentConfiguration;", "paymentConfiguration$delegate", "getPaymentConfiguration", "()Lcom/stripe/android/PaymentConfiguration;", "paymentConfiguration", "Ln0/a/f0;", "lifecycleScope", "Ln0/a/f0;", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "paymentOptionCallback", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "Lcom/stripe/android/networking/StripeApiRepository;", "stripeApiRepository$delegate", "getStripeApiRepository", "()Lcom/stripe/android/networking/StripeApiRepository;", "stripeApiRepository", "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "paymentOptionFactory", "Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "paymentRelayLauncher", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer;", "flowControllerInitializer", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer;", "googlePayLauncher", "getGooglePayLauncher$payments_core_release", "setGooglePayLauncher$payments_core_release", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "paymentResultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "", "statusBarColor", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "paymentBrowserAuthLauncher", "Lh0/q/o0;", "viewModelStoreOwner", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory;", "activityLauncherFactory", "Lcom/stripe/android/paymentsheet/flowcontroller/PaymentControllerFactory;", "paymentControllerFactory", "Lkotlin/Function3;", "paymentFlowResultProcessorFactory", "Lcom/stripe/android/payments/DefaultReturnUrl;", "defaultReturnUrl", "<init>", "(Landroid/content/Context;Lh0/q/o0;Ln0/a/f0;Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory;Lm0/n/a/a;Lm0/n/a/a;Lcom/stripe/android/paymentsheet/model/PaymentOptionFactory;Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer;Lcom/stripe/android/paymentsheet/flowcontroller/PaymentControllerFactory;Lm0/n/a/q;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/paymentsheet/analytics/SessionId;Lcom/stripe/android/payments/DefaultReturnUrl;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "Args", "GooglePayException", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DefaultFlowController.kt */
public final class DefaultFlowController implements PaymentSheet.FlowController {
    /* access modifiers changed from: private */
    public final Context appContext;
    /* access modifiers changed from: private */
    public final a<AuthActivityStarter.Host> authHostSupplier;
    private final EventReporter eventReporter;
    /* access modifiers changed from: private */
    public final FlowControllerInitializer flowControllerInitializer;
    /* access modifiers changed from: private */
    public final b<StripeGooglePayContract.Args> googlePayActivityLauncher;
    private l<? super StripeGooglePayContract.Args, i> googlePayLauncher = new DefaultFlowController$googlePayLauncher$1(this);
    private final f0 lifecycleScope;
    /* access modifiers changed from: private */
    public final b<PaymentBrowserAuthContract.Args> paymentBrowserAuthLauncher;
    private final c paymentConfiguration$delegate;
    private final c paymentController$delegate;
    private final c paymentFlowResultProcessor$delegate;
    /* access modifiers changed from: private */
    public final b<PaymentOptionContract.Args> paymentOptionActivityLauncher;
    private final PaymentOptionCallback paymentOptionCallback;
    private final PaymentOptionFactory paymentOptionFactory;
    private l<? super PaymentOptionContract.Args, i> paymentOptionLauncher = new DefaultFlowController$paymentOptionLauncher$1(this);
    /* access modifiers changed from: private */
    public final b<PaymentRelayStarter.Args> paymentRelayLauncher;
    /* access modifiers changed from: private */
    public final PaymentSheetResultCallback paymentResultCallback;
    private final SessionId sessionId;
    private final a<Integer> statusBarColor;
    /* access modifiers changed from: private */
    public final b<PaymentFlowResult.Unvalidated> stripe3ds2ChallengeLauncher;
    private final c stripeApiRepository$delegate;
    /* access modifiers changed from: private */
    public final FlowControllerViewModel viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b \u0010!J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004¨\u0006\""}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$Args;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "component2", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "clientSecret", "config", "copy", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$Args;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "getConfig", "Ljava/lang/String;", "getClientSecret", "<init>", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DefaultFlowController.kt */
    public static final class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String clientSecret;
        private final PaymentSheet.Configuration config;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Args> {
            public final Args createFromParcel(Parcel parcel) {
                m0.n.b.i.e(parcel, "in");
                return new Args(parcel.readString(), parcel.readInt() != 0 ? PaymentSheet.Configuration.CREATOR.createFromParcel(parcel) : null);
            }

            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args(String str, PaymentSheet.Configuration configuration) {
            m0.n.b.i.e(str, "clientSecret");
            this.clientSecret = str;
            this.config = configuration;
        }

        public static /* synthetic */ Args copy$default(Args args, String str, PaymentSheet.Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.clientSecret;
            }
            if ((i & 2) != 0) {
                configuration = args.config;
            }
            return args.copy(str, configuration);
        }

        public final String component1() {
            return this.clientSecret;
        }

        public final PaymentSheet.Configuration component2() {
            return this.config;
        }

        public final Args copy(String str, PaymentSheet.Configuration configuration) {
            m0.n.b.i.e(str, "clientSecret");
            return new Args(str, configuration);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Args)) {
                return false;
            }
            Args args = (Args) obj;
            return m0.n.b.i.a(this.clientSecret, args.clientSecret) && m0.n.b.i.a(this.config, args.config);
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final PaymentSheet.Configuration getConfig() {
            return this.config;
        }

        public int hashCode() {
            String str = this.clientSecret;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            PaymentSheet.Configuration configuration = this.config;
            if (configuration != null) {
                i = configuration.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Args(clientSecret=");
            P0.append(this.clientSecret);
            P0.append(", config=");
            P0.append(this.config);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            m0.n.b.i.e(parcel, "parcel");
            parcel.writeString(this.clientSecret);
            PaymentSheet.Configuration configuration = this.config;
            if (configuration != null) {
                parcel.writeInt(1);
                configuration.writeToParcel(parcel, 0);
                return;
            }
            parcel.writeInt(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/DefaultFlowController$GooglePayException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "throwable", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "Lcom/google/android/gms/common/api/Status;", "googleStatus", "Lcom/google/android/gms/common/api/Status;", "getGoogleStatus", "()Lcom/google/android/gms/common/api/Status;", "<init>", "(Ljava/lang/Throwable;Lcom/google/android/gms/common/api/Status;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DefaultFlowController.kt */
    public static final class GooglePayException extends Exception {
        private final Status googleStatus;
        private final Throwable throwable;

        public GooglePayException(Throwable th, Status status) {
            m0.n.b.i.e(th, "throwable");
            this.throwable = th;
            this.googleStatus = status;
        }

        public final Status getGoogleStatus() {
            return this.googleStatus;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            PaymentSheet.GooglePayConfiguration.Environment.values();
            int[] iArr = new int[2];
            $EnumSwitchMapping$0 = iArr;
            iArr[PaymentSheet.GooglePayConfiguration.Environment.Production.ordinal()] = 1;
        }
    }

    public DefaultFlowController(Context context, o0 o0Var, f0 f0Var, ActivityLauncherFactory activityLauncherFactory, a<Integer> aVar, a<AuthActivityStarter.Host> aVar2, PaymentOptionFactory paymentOptionFactory2, FlowControllerInitializer flowControllerInitializer2, PaymentControllerFactory paymentControllerFactory, q<? super ClientSecret, ? super String, ? super StripeApiRepository, ? extends PaymentFlowResultProcessor<? extends StripeIntent, ? extends StripeIntentResult<? extends StripeIntent>>> qVar, EventReporter eventReporter2, SessionId sessionId2, DefaultReturnUrl defaultReturnUrl, PaymentOptionCallback paymentOptionCallback2, PaymentSheetResultCallback paymentSheetResultCallback) {
        Context context2 = context;
        o0 o0Var2 = o0Var;
        f0 f0Var2 = f0Var;
        ActivityLauncherFactory activityLauncherFactory2 = activityLauncherFactory;
        a<Integer> aVar3 = aVar;
        a<AuthActivityStarter.Host> aVar4 = aVar2;
        PaymentOptionFactory paymentOptionFactory3 = paymentOptionFactory2;
        FlowControllerInitializer flowControllerInitializer3 = flowControllerInitializer2;
        PaymentControllerFactory paymentControllerFactory2 = paymentControllerFactory;
        q<? super ClientSecret, ? super String, ? super StripeApiRepository, ? extends PaymentFlowResultProcessor<? extends StripeIntent, ? extends StripeIntentResult<? extends StripeIntent>>> qVar2 = qVar;
        EventReporter eventReporter3 = eventReporter2;
        SessionId sessionId3 = sessionId2;
        DefaultReturnUrl defaultReturnUrl2 = defaultReturnUrl;
        PaymentOptionCallback paymentOptionCallback3 = paymentOptionCallback2;
        PaymentSheetResultCallback paymentSheetResultCallback2 = paymentSheetResultCallback;
        m0.n.b.i.e(context2, "appContext");
        m0.n.b.i.e(o0Var2, "viewModelStoreOwner");
        m0.n.b.i.e(f0Var2, "lifecycleScope");
        m0.n.b.i.e(activityLauncherFactory2, "activityLauncherFactory");
        m0.n.b.i.e(aVar3, "statusBarColor");
        m0.n.b.i.e(aVar4, "authHostSupplier");
        m0.n.b.i.e(paymentOptionFactory3, "paymentOptionFactory");
        m0.n.b.i.e(flowControllerInitializer3, "flowControllerInitializer");
        m0.n.b.i.e(paymentControllerFactory2, "paymentControllerFactory");
        m0.n.b.i.e(qVar2, "paymentFlowResultProcessorFactory");
        m0.n.b.i.e(eventReporter3, "eventReporter");
        m0.n.b.i.e(sessionId3, "sessionId");
        m0.n.b.i.e(defaultReturnUrl2, "defaultReturnUrl");
        m0.n.b.i.e(paymentOptionCallback3, "paymentOptionCallback");
        m0.n.b.i.e(paymentSheetResultCallback2, "paymentResultCallback");
        this.appContext = context2;
        this.lifecycleScope = f0Var2;
        this.statusBarColor = aVar3;
        this.authHostSupplier = aVar4;
        this.paymentOptionFactory = paymentOptionFactory3;
        this.flowControllerInitializer = flowControllerInitializer3;
        this.eventReporter = eventReporter3;
        this.sessionId = sessionId3;
        this.paymentOptionCallback = paymentOptionCallback3;
        this.paymentResultCallback = paymentSheetResultCallback2;
        this.paymentOptionActivityLauncher = activityLauncherFactory2.create(new PaymentOptionContract(), new DefaultFlowController$paymentOptionActivityLauncher$1(this));
        this.googlePayActivityLauncher = activityLauncherFactory2.create(new StripeGooglePayContract(), new DefaultFlowController$googlePayActivityLauncher$1(this));
        this.paymentRelayLauncher = activityLauncherFactory2.create(new PaymentRelayContract(), new DefaultFlowController$paymentRelayLauncher$1(this));
        this.paymentBrowserAuthLauncher = activityLauncherFactory2.create(new PaymentBrowserAuthContract(defaultReturnUrl2, (l) null, 2, (f) null), new DefaultFlowController$paymentBrowserAuthLauncher$1(this));
        this.stripe3ds2ChallengeLauncher = activityLauncherFactory2.create(new Stripe3ds2CompletionContract(), new DefaultFlowController$stripe3ds2ChallengeLauncher$1(this));
        k0 a = new m0(o0Var2).a(FlowControllerViewModel.class);
        m0.n.b.i.d(a, "ViewModelProvider(viewMo…lerViewModel::class.java]");
        this.viewModel = (FlowControllerViewModel) a;
        this.paymentConfiguration$delegate = h.H2(new DefaultFlowController$paymentConfiguration$2(this));
        this.stripeApiRepository$delegate = h.H2(new DefaultFlowController$stripeApiRepository$2(this));
        this.paymentFlowResultProcessor$delegate = h.H2(new DefaultFlowController$paymentFlowResultProcessor$2(this, qVar2));
        this.paymentController$delegate = h.H2(new DefaultFlowController$paymentController$2(this, paymentControllerFactory2));
    }

    private final void configureInternal(ClientSecret clientSecret, PaymentSheet.Configuration configuration, PaymentSheet.FlowController.ConfigCallback configCallback) {
        m0.r.t.a.r.m.a1.a.E2(this.lifecycleScope, (e) null, (CoroutineStart) null, new DefaultFlowController$configureInternal$1(this, clientSecret, configuration, configCallback, (m0.l.c) null), 3, (Object) null);
    }

    private final void confirmPaymentSelection(PaymentSelection paymentSelection, InitData initData) {
        ConfirmStripeIntentParams confirmStripeIntentParams;
        ConfirmStripeIntentParamsFactory<ConfirmStripeIntentParams> createFactory = ConfirmStripeIntentParamsFactory.Companion.createFactory(initData.getClientSecret());
        if (paymentSelection instanceof PaymentSelection.Saved) {
            confirmStripeIntentParams = createFactory.create((PaymentSelection.Saved) paymentSelection);
        } else {
            confirmStripeIntentParams = paymentSelection instanceof PaymentSelection.New.Card ? createFactory.create((PaymentSelection.New) paymentSelection) : null;
        }
        if (confirmStripeIntentParams != null) {
            m0.r.t.a.r.m.a1.a.E2(this.lifecycleScope, (e) null, (CoroutineStart) null, new DefaultFlowController$confirmPaymentSelection$$inlined$let$lambda$1(confirmStripeIntentParams, (m0.l.c) null, this), 3, (Object) null);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.stripe.android.StripeIntentResult<? extends com.stripe.android.model.StripeIntent>, com.stripe.android.StripeIntentResult] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.stripe.android.paymentsheet.PaymentSheetResult createPaymentSheetResult(com.stripe.android.StripeIntentResult<? extends com.stripe.android.model.StripeIntent> r5) {
        /*
            r4 = this;
            com.stripe.android.model.StripeIntent r0 = r5.getIntent()
            com.stripe.android.model.StripeIntent$Status r1 = r0.getStatus()
            com.stripe.android.model.StripeIntent$Status r2 = com.stripe.android.model.StripeIntent.Status.Succeeded
            if (r1 == r2) goto L_0x005e
            com.stripe.android.model.StripeIntent$Status r1 = r0.getStatus()
            com.stripe.android.model.StripeIntent$Status r2 = com.stripe.android.model.StripeIntent.Status.RequiresCapture
            if (r1 != r2) goto L_0x0015
            goto L_0x005e
        L_0x0015:
            int r5 = r5.getOutcome()
            r1 = 3
            if (r5 != r1) goto L_0x001f
            com.stripe.android.paymentsheet.PaymentSheetResult$Canceled r5 = com.stripe.android.paymentsheet.PaymentSheetResult.Canceled.INSTANCE
            goto L_0x0060
        L_0x001f:
            java.lang.String r5 = r0.getLastErrorMessage()
            if (r5 == 0) goto L_0x0051
            com.stripe.android.paymentsheet.PaymentSheetResult$Failed r5 = new com.stripe.android.paymentsheet.PaymentSheetResult$Failed
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Failed to confirm "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r3 = ": "
            r2.append(r3)
            java.lang.String r0 = r0.getLastErrorMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            r5.<init>(r1)
            goto L_0x0060
        L_0x0051:
            com.stripe.android.paymentsheet.PaymentSheetResult$Failed r5 = new com.stripe.android.paymentsheet.PaymentSheetResult$Failed
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Failed to complete payment."
            r0.<init>(r1)
            r5.<init>(r0)
            goto L_0x0060
        L_0x005e:
            com.stripe.android.paymentsheet.PaymentSheetResult$Completed r5 = com.stripe.android.paymentsheet.PaymentSheetResult.Completed.INSTANCE
        L_0x0060:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController.createPaymentSheetResult(com.stripe.android.StripeIntentResult):com.stripe.android.paymentsheet.PaymentSheetResult");
    }

    /* access modifiers changed from: private */
    public final PaymentConfiguration getPaymentConfiguration() {
        return (PaymentConfiguration) this.paymentConfiguration$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final PaymentController getPaymentController() {
        return (PaymentController) this.paymentController$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final PaymentFlowResultProcessor<? extends StripeIntent, StripeIntentResult<StripeIntent>> getPaymentFlowResultProcessor() {
        return (PaymentFlowResultProcessor) this.paymentFlowResultProcessor$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final StripeApiRepository getStripeApiRepository() {
        return (StripeApiRepository) this.stripeApiRepository$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void onInitSuccess(InitData initData, PaymentSheet.FlowController.ConfigCallback configCallback) {
        PaymentSelection paymentSelection;
        T t;
        this.eventReporter.onInit(initData.getConfig());
        SavedSelection savedSelection = initData.getSavedSelection();
        if (m0.n.b.i.a(savedSelection, SavedSelection.GooglePay.INSTANCE)) {
            paymentSelection = PaymentSelection.GooglePay.INSTANCE;
        } else {
            if (savedSelection instanceof SavedSelection.PaymentMethod) {
                Iterator<T> it = initData.getPaymentMethods().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (m0.n.b.i.a(((PaymentMethod) t).id, ((SavedSelection.PaymentMethod) savedSelection).getId())) {
                        break;
                    }
                }
                PaymentMethod paymentMethod = (PaymentMethod) t;
                if (paymentMethod != null) {
                    paymentSelection = new PaymentSelection.Saved(paymentMethod);
                }
            }
            paymentSelection = null;
        }
        this.viewModel.setPaymentSelection(paymentSelection);
        this.viewModel.setInitData(initData);
        configCallback.onConfigured(true, (Throwable) null);
    }

    public void configureWithPaymentIntent(String str, PaymentSheet.Configuration configuration, PaymentSheet.FlowController.ConfigCallback configCallback) {
        m0.n.b.i.e(str, "paymentIntentClientSecret");
        m0.n.b.i.e(configCallback, "callback");
        configureInternal(new PaymentIntentClientSecret(str), configuration, configCallback);
    }

    public void configureWithSetupIntent(String str, PaymentSheet.Configuration configuration, PaymentSheet.FlowController.ConfigCallback configCallback) {
        m0.n.b.i.e(str, "setupIntentClientSecret");
        m0.n.b.i.e(configCallback, "callback");
        configureInternal(new SetupIntentClientSecret(str), configuration, configCallback);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        r5 = r1.getGooglePay();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void confirm() {
        /*
            r12 = this;
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel r0 = r12.viewModel     // Catch:{ all -> 0x0007 }
            com.stripe.android.paymentsheet.flowcontroller.InitData r0 = r0.getInitData()     // Catch:{ all -> 0x0007 }
            goto L_0x000c
        L_0x0007:
            r0 = move-exception
            java.lang.Object r0 = i0.j.f.p.h.l0(r0)
        L_0x000c:
            java.lang.Throwable r1 = kotlin.Result.a(r0)
            if (r1 != 0) goto L_0x0099
            com.stripe.android.paymentsheet.flowcontroller.InitData r0 = (com.stripe.android.paymentsheet.flowcontroller.InitData) r0
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r1 = r0.getConfig()
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel r2 = r12.viewModel
            com.stripe.android.paymentsheet.model.PaymentSelection r2 = r2.getPaymentSelection()
            com.stripe.android.paymentsheet.model.PaymentSelection$GooglePay r3 = com.stripe.android.paymentsheet.model.PaymentSelection.GooglePay.INSTANCE
            boolean r3 = m0.n.b.i.a(r2, r3)
            if (r3 == 0) goto L_0x0095
            com.stripe.android.model.StripeIntent r2 = r0.getStripeIntent()
            boolean r2 = r2 instanceof com.stripe.android.model.PaymentIntent
            if (r2 == 0) goto L_0x0089
            m0.n.a.l<? super com.stripe.android.googlepay.StripeGooglePayContract$Args, m0.i> r2 = r12.googlePayLauncher
            com.stripe.android.googlepay.StripeGooglePayContract$Args r3 = new com.stripe.android.googlepay.StripeGooglePayContract$Args
            com.stripe.android.model.StripeIntent r0 = r0.getStripeIntent()
            com.stripe.android.model.PaymentIntent r0 = (com.stripe.android.model.PaymentIntent) r0
            com.stripe.android.googlepay.StripeGooglePayContract$GooglePayConfig r11 = new com.stripe.android.googlepay.StripeGooglePayContract$GooglePayConfig
            r4 = 0
            if (r1 == 0) goto L_0x0048
            com.stripe.android.paymentsheet.PaymentSheet$GooglePayConfiguration r5 = r1.getGooglePay()
            if (r5 == 0) goto L_0x0048
            com.stripe.android.paymentsheet.PaymentSheet$GooglePayConfiguration$Environment r5 = r5.getEnvironment()
            goto L_0x0049
        L_0x0048:
            r5 = r4
        L_0x0049:
            if (r5 != 0) goto L_0x004c
            goto L_0x0052
        L_0x004c:
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x0055
        L_0x0052:
            com.stripe.android.googlepay.StripeGooglePayEnvironment r5 = com.stripe.android.googlepay.StripeGooglePayEnvironment.Test
            goto L_0x0057
        L_0x0055:
            com.stripe.android.googlepay.StripeGooglePayEnvironment r5 = com.stripe.android.googlepay.StripeGooglePayEnvironment.Production
        L_0x0057:
            if (r1 == 0) goto L_0x0064
            com.stripe.android.paymentsheet.PaymentSheet$GooglePayConfiguration r6 = r1.getGooglePay()
            if (r6 == 0) goto L_0x0064
            java.lang.String r6 = r6.getCountryCode()
            goto L_0x0065
        L_0x0064:
            r6 = r4
        L_0x0065:
            if (r6 == 0) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            java.lang.String r6 = ""
        L_0x006a:
            r7 = 0
            if (r1 == 0) goto L_0x0073
            java.lang.String r1 = r1.getMerchantDisplayName()
            r8 = r1
            goto L_0x0074
        L_0x0073:
            r8 = r4
        L_0x0074:
            r9 = 4
            r10 = 0
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            m0.n.a.a<java.lang.Integer> r1 = r12.statusBarColor
            java.lang.Object r1 = r1.invoke()
            java.lang.Integer r1 = (java.lang.Integer) r1
            r3.<init>(r0, r11, r1)
            r2.invoke(r3)
            goto L_0x0098
        L_0x0089:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Google Pay is currently supported only for PaymentIntents"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0095:
            r12.confirmPaymentSelection(r2, r0)
        L_0x0098:
            return
        L_0x0099:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "FlowController must be successfully initialized using configureWithPaymentIntent() or configureWithSetupIntent() before calling confirm()"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController.confirm():void");
    }

    public final Object dispatchResult(FlowControllerInitializer.InitResult initResult, PaymentSheet.FlowController.ConfigCallback configCallback, m0.l.c<? super i> cVar) {
        d0 d0Var = n0.a.m0.a;
        Object k4 = m0.r.t.a.r.m.a1.a.k4(o.c, new DefaultFlowController$dispatchResult$2(this, initResult, configCallback, (m0.l.c) null), cVar);
        if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k4;
        }
        return i.a;
    }

    public final l<StripeGooglePayContract.Args, i> getGooglePayLauncher$payments_core_release() {
        return this.googlePayLauncher;
    }

    public PaymentOption getPaymentOption() {
        PaymentSelection paymentSelection = this.viewModel.getPaymentSelection();
        if (paymentSelection != null) {
            return this.paymentOptionFactory.create(paymentSelection);
        }
        return null;
    }

    public final l<PaymentOptionContract.Args, i> getPaymentOptionLauncher$payments_core_release() {
        return this.paymentOptionLauncher;
    }

    public final void onGooglePayResult$payments_core_release(StripeGooglePayContract.Result result) {
        Object obj;
        m0.n.b.i.e(result, "googlePayResult");
        if (result instanceof StripeGooglePayContract.Result.PaymentData) {
            try {
                obj = this.viewModel.getInitData();
            } catch (Throwable th) {
                obj = h.l0(th);
            }
            Throwable a = Result.a(obj);
            if (a == null) {
                PaymentSelection.Saved saved = new PaymentSelection.Saved(((StripeGooglePayContract.Result.PaymentData) result).getPaymentMethod());
                this.viewModel.setPaymentSelection(saved);
                confirmPaymentSelection(saved, (InitData) obj);
                return;
            }
            this.eventReporter.onPaymentFailure(PaymentSelection.GooglePay.INSTANCE);
            this.paymentResultCallback.onPaymentSheetResult(new PaymentSheetResult.Failed(a));
        } else if (result instanceof StripeGooglePayContract.Result.Error) {
            this.eventReporter.onPaymentFailure(PaymentSelection.GooglePay.INSTANCE);
            StripeGooglePayContract.Result.Error error = (StripeGooglePayContract.Result.Error) result;
            this.paymentResultCallback.onPaymentSheetResult(new PaymentSheetResult.Failed(new GooglePayException(error.getException(), error.getGooglePayStatus())));
        } else if (result instanceof StripeGooglePayContract.Result.Canceled) {
            this.paymentResultCallback.onPaymentSheetResult(PaymentSheetResult.Canceled.INSTANCE);
        } else {
            this.eventReporter.onPaymentFailure(PaymentSelection.GooglePay.INSTANCE);
        }
    }

    public final void onPaymentFlowResult$payments_core_release(PaymentFlowResult.Unvalidated unvalidated) {
        m0.n.b.i.e(unvalidated, "paymentFlowResult");
        m0.r.t.a.r.m.a1.a.E2(this.lifecycleScope, (e) null, (CoroutineStart) null, new DefaultFlowController$onPaymentFlowResult$1(this, unvalidated, (m0.l.c) null), 3, (Object) null);
    }

    public final /* synthetic */ void onPaymentOptionResult$payments_core_release(PaymentOptionResult paymentOptionResult) {
        if (paymentOptionResult instanceof PaymentOptionResult.Succeeded) {
            PaymentSelection paymentSelection = ((PaymentOptionResult.Succeeded) paymentOptionResult).getPaymentSelection();
            this.viewModel.setPaymentSelection(paymentSelection);
            this.paymentOptionCallback.onPaymentOption(this.paymentOptionFactory.create(paymentSelection));
            return;
        }
        PaymentOption paymentOption = null;
        if (!(paymentOptionResult instanceof PaymentOptionResult.Failed) && !(paymentOptionResult instanceof PaymentOptionResult.Canceled)) {
            this.viewModel.setPaymentSelection((PaymentSelection) null);
            this.paymentOptionCallback.onPaymentOption((PaymentOption) null);
            return;
        }
        PaymentOptionCallback paymentOptionCallback2 = this.paymentOptionCallback;
        PaymentSelection paymentSelection2 = this.viewModel.getPaymentSelection();
        if (paymentSelection2 != null) {
            paymentOption = this.paymentOptionFactory.create(paymentSelection2);
        }
        paymentOptionCallback2.onPaymentOption(paymentOption);
    }

    public void presentPaymentOptions() {
        Object obj;
        try {
            obj = this.viewModel.getInitData();
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        if (Result.a(obj) == null) {
            InitData initData = (InitData) obj;
            l<? super PaymentOptionContract.Args, i> lVar = this.paymentOptionLauncher;
            StripeIntent stripeIntent = initData.getStripeIntent();
            List<PaymentMethod> paymentMethods = initData.getPaymentMethods();
            SessionId sessionId2 = this.sessionId;
            PaymentSheet.Configuration config = initData.getConfig();
            boolean isGooglePayReady = initData.isGooglePayReady();
            PaymentSelection paymentSelection = this.viewModel.getPaymentSelection();
            if (!(paymentSelection instanceof PaymentSelection.New.Card)) {
                paymentSelection = null;
            }
            lVar.invoke(new PaymentOptionContract.Args(stripeIntent, paymentMethods, sessionId2, config, isGooglePayReady, (PaymentSelection.New.Card) paymentSelection, this.statusBarColor.invoke()));
            return;
        }
        throw new IllegalStateException("FlowController must be successfully initialized using configureWithPaymentIntent() or configureWithSetupIntent() before calling presentPaymentOptions()".toString());
    }

    public final void setGooglePayLauncher$payments_core_release(l<? super StripeGooglePayContract.Args, i> lVar) {
        m0.n.b.i.e(lVar, "<set-?>");
        this.googlePayLauncher = lVar;
    }

    public final void setPaymentOptionLauncher$payments_core_release(l<? super PaymentOptionContract.Args, i> lVar) {
        m0.n.b.i.e(lVar, "<set-?>");
        this.paymentOptionLauncher = lVar;
    }
}
