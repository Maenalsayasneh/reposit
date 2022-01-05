package com.stripe.android.googlepay;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.LiveData;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.stripe.android.AppInfo;
import com.stripe.android.FraudDetectionDataRepository;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.Logger;
import com.stripe.android.googlepay.StripeGooglePayContract;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.AnalyticsRequestFactory;
import com.stripe.android.networking.ApiRequestExecutor;
import com.stripe.android.networking.FraudDetectionDataParamsUtils;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.networking.StripeRepository;
import g0.a.b.b.a;
import h0.b0.v;
import h0.q.b;
import h0.q.k0;
import h0.q.m0;
import h0.q.y;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import m0.l.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001>BC\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010'\u001a\u00020\u0014\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b<\u0010=J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R*\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00050\u00050\u000f8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0018\u0010#\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0016R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0016R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00102\u001a\b\u0012\u0004\u0012\u00020\u0005018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R$\u00104\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, d2 = {"Lcom/stripe/android/googlepay/StripeGooglePayViewModel;", "Lh0/q/b;", "Lcom/google/android/gms/wallet/IsReadyToPayRequest;", "createIsReadyToPayRequest", "()Lcom/google/android/gms/wallet/IsReadyToPayRequest;", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;", "result", "Lm0/i;", "updateGooglePayResult", "(Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;)V", "Lorg/json/JSONObject;", "createPaymentDataRequestForPaymentIntentArgs", "()Lorg/json/JSONObject;", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "params", "Landroidx/lifecycle/LiveData;", "Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "createPaymentMethod", "(Lcom/stripe/android/model/PaymentMethodCreateParams;)Landroidx/lifecycle/LiveData;", "", "publishableKey", "Ljava/lang/String;", "kotlin.jvm.PlatformType", "googlePayResult", "Landroidx/lifecycle/LiveData;", "getGooglePayResult$payments_core_release", "()Landroidx/lifecycle/LiveData;", "", "hasLaunched", "Z", "getHasLaunched", "()Z", "setHasLaunched", "(Z)V", "stripeAccountId", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Args;", "args", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Args;", "appName", "Lcom/stripe/android/GooglePayJsonFactory;", "googlePayJsonFactory", "Lcom/stripe/android/GooglePayJsonFactory;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "Lh0/q/y;", "_googleResult", "Lh0/q/y;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "setPaymentMethod", "(Lcom/stripe/android/model/PaymentMethod;)V", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/googlepay/StripeGooglePayContract$Args;Lcom/stripe/android/networking/StripeRepository;Ljava/lang/String;Lm0/l/e;)V", "Factory", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeGooglePayViewModel.kt */
public final class StripeGooglePayViewModel extends b {
    private final y<StripeGooglePayContract.Result> _googleResult;
    private final String appName;
    private final StripeGooglePayContract.Args args;
    private final GooglePayJsonFactory googlePayJsonFactory;
    private final LiveData<StripeGooglePayContract.Result> googlePayResult;
    private boolean hasLaunched;
    private PaymentMethod paymentMethod;
    /* access modifiers changed from: private */
    public final String publishableKey;
    /* access modifiers changed from: private */
    public final String stripeAccountId;
    /* access modifiers changed from: private */
    public final StripeRepository stripeRepository;
    /* access modifiers changed from: private */
    public final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/googlepay/StripeGooglePayViewModel$Factory;", "Lh0/q/m0$b;", "Lh0/q/k0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Lh0/q/k0;", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Args;", "args", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Args;", "", "publishableKey", "Ljava/lang/String;", "stripeAccountId", "Landroid/app/Application;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/googlepay/StripeGooglePayContract$Args;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeGooglePayViewModel.kt */
    public static final class Factory implements m0.b {
        private final Application application;
        private final StripeGooglePayContract.Args args;
        private final String publishableKey;
        private final String stripeAccountId;

        public Factory(Application application2, String str, String str2, StripeGooglePayContract.Args args2) {
            i.e(application2, "application");
            i.e(str, "publishableKey");
            i.e(args2, "args");
            this.application = application2;
            this.publishableKey = str;
            this.stripeAccountId = str2;
            this.args = args2;
        }

        public <T extends k0> T create(Class<T> cls) {
            i.e(cls, "modelClass");
            return new StripeGooglePayViewModel(this.application, this.publishableKey, this.stripeAccountId, this.args, new StripeApiRepository(this.application, this.publishableKey, (AppInfo) null, (Logger) null, (e) null, (ApiRequestExecutor) null, (AnalyticsRequestExecutor) null, (FraudDetectionDataRepository) null, (AnalyticsRequestFactory) null, (FraudDetectionDataParamsUtils) null, (Set) null, (String) null, (String) null, 8188, (f) null), this.application.getApplicationInfo().loadLabel(this.application.getPackageManager()).toString(), n0.a.m0.c);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Factory(Application application2, String str, String str2, StripeGooglePayContract.Args args2, int i, f fVar) {
            this(application2, str, (i & 4) != 0 ? null : str2, args2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StripeGooglePayViewModel(Application application, String str, String str2, StripeGooglePayContract.Args args2, StripeRepository stripeRepository2, String str3, e eVar, int i, f fVar) {
        this(application, str, (i & 4) != 0 ? null : str2, args2, stripeRepository2, str3, eVar);
    }

    public final IsReadyToPayRequest createIsReadyToPayRequest() {
        String jSONObject = GooglePayJsonFactory.createIsReadyToPayRequest$default(this.googlePayJsonFactory, (GooglePayJsonFactory.BillingAddressParameters) null, (Boolean) null, 3, (Object) null).toString();
        IsReadyToPayRequest isReadyToPayRequest = new IsReadyToPayRequest();
        v.A(jSONObject, "isReadyToPayRequestJson cannot be null!");
        isReadyToPayRequest.Y1 = jSONObject;
        i.d(isReadyToPayRequest, "IsReadyToPayRequest.from…st().toString()\n        )");
        return isReadyToPayRequest;
    }

    public final JSONObject createPaymentDataRequestForPaymentIntentArgs() {
        PaymentIntent paymentIntent = this.args.getPaymentIntent();
        GooglePayJsonFactory googlePayJsonFactory2 = this.googlePayJsonFactory;
        String currency = paymentIntent.getCurrency();
        if (currency == null) {
            currency = "";
        }
        String str = currency;
        GooglePayJsonFactory.TransactionInfo.TotalPriceStatus totalPriceStatus = GooglePayJsonFactory.TransactionInfo.TotalPriceStatus.Final;
        String countryCode$payments_core_release = this.args.getConfig().getCountryCode$payments_core_release();
        String id = paymentIntent.getId();
        Long amount = paymentIntent.getAmount();
        GooglePayJsonFactory.TransactionInfo transactionInfo = new GooglePayJsonFactory.TransactionInfo(str, totalPriceStatus, countryCode$payments_core_release, id, amount != null ? Integer.valueOf((int) amount.longValue()) : null, (String) null, GooglePayJsonFactory.TransactionInfo.CheckoutOption.CompleteImmediatePurchase, 32, (f) null);
        String merchantName$payments_core_release = this.args.getConfig().getMerchantName$payments_core_release();
        if (merchantName$payments_core_release == null) {
            merchantName$payments_core_release = this.appName;
        }
        return GooglePayJsonFactory.createPaymentDataRequest$default(googlePayJsonFactory2, transactionInfo, new GooglePayJsonFactory.BillingAddressParameters(true, GooglePayJsonFactory.BillingAddressParameters.Format.Min, false), (GooglePayJsonFactory.ShippingAddressParameters) null, this.args.getConfig().isEmailRequired$payments_core_release(), new GooglePayJsonFactory.MerchantInfo(merchantName$payments_core_release), 4, (Object) null);
    }

    public final LiveData<Result<PaymentMethod>> createPaymentMethod(PaymentMethodCreateParams paymentMethodCreateParams) {
        i.e(paymentMethodCreateParams, "params");
        return a.a0((e) null, 0, new StripeGooglePayViewModel$createPaymentMethod$1(this, paymentMethodCreateParams, (c) null), 3);
    }

    public final LiveData<StripeGooglePayContract.Result> getGooglePayResult$payments_core_release() {
        return this.googlePayResult;
    }

    public final boolean getHasLaunched() {
        return this.hasLaunched;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public final void setHasLaunched(boolean z) {
        this.hasLaunched = z;
    }

    public final void setPaymentMethod(PaymentMethod paymentMethod2) {
        this.paymentMethod = paymentMethod2;
    }

    public final void updateGooglePayResult(StripeGooglePayContract.Result result) {
        i.e(result, "result");
        this._googleResult.setValue(result);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeGooglePayViewModel(Application application, String str, String str2, StripeGooglePayContract.Args args2, StripeRepository stripeRepository2, String str3, e eVar) {
        super(application);
        i.e(application, "application");
        i.e(str, "publishableKey");
        i.e(args2, "args");
        i.e(stripeRepository2, "stripeRepository");
        i.e(str3, "appName");
        i.e(eVar, "workContext");
        this.publishableKey = str;
        this.stripeAccountId = str2;
        this.args = args2;
        this.stripeRepository = stripeRepository2;
        this.appName = str3;
        this.workContext = eVar;
        this.googlePayJsonFactory = new GooglePayJsonFactory((Context) application, false, 2, (f) null);
        y<StripeGooglePayContract.Result> yVar = new y<>();
        this._googleResult = yVar;
        LiveData<StripeGooglePayContract.Result> A = a.A(yVar);
        i.d(A, "Transformations.distinctUntilChanged(this)");
        this.googlePayResult = A;
    }
}
