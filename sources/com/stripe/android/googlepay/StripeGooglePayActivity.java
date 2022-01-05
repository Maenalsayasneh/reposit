package com.stripe.android.googlepay;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.stripe.android.googlepay.StripeGooglePayContract;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import h0.b.a.e;
import h0.b0.v;
import h0.q.l0;
import i0.h.a.b.c.g.j.n;
import i0.h.a.b.m.b0;
import i0.h.a.b.m.g;
import i0.h.a.b.n.b;
import i0.h.a.b.n.o;
import i0.h.a.b.n.p;
import i0.h.a.b.n.s;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.Metadata;
import m0.c;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b7\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u00020!8B@\u0002X\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010+\u001a\u00020'8B@\u0002X\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u001d\u00100\u001a\u00020,8B@\u0002X\u0002¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010/R\u0016\u00102\u001a\u0002018\u0002@\u0002X.¢\u0006\u0006\n\u0004\b2\u00103R\u001f\u00106\u001a\u0004\u0018\u00010,8B@\u0002X\u0002¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b5\u0010/¨\u00069"}, d2 = {"Lcom/stripe/android/googlepay/StripeGooglePayActivity;", "Lh0/b/a/e;", "Lorg/json/JSONObject;", "paymentDataRequest", "Lm0/i;", "isReadyToPay", "(Lorg/json/JSONObject;)V", "payWithGoogle", "Landroid/content/Intent;", "data", "onGooglePayResult", "(Landroid/content/Intent;)V", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "onPaymentMethodCreated", "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ShippingInformation;)V", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;", "result", "finishWithResult", "(Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "finish", "()V", "", "requestCode", "resultCode", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/stripe/android/googlepay/StripeGooglePayViewModel;", "viewModel$delegate", "Lm0/c;", "getViewModel", "()Lcom/stripe/android/googlepay/StripeGooglePayViewModel;", "viewModel", "Li0/h/a/b/n/c;", "paymentsClient$delegate", "getPaymentsClient", "()Li0/h/a/b/n/c;", "paymentsClient", "", "publishableKey$delegate", "getPublishableKey", "()Ljava/lang/String;", "publishableKey", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Args;", "args", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Args;", "stripeAccountId$delegate", "getStripeAccountId", "stripeAccountId", "<init>", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeGooglePayActivity.kt */
public final class StripeGooglePayActivity extends e {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final int LOAD_PAYMENT_DATA_REQUEST_CODE = 4444;
    /* access modifiers changed from: private */
    public StripeGooglePayContract.Args args;
    private final c paymentsClient$delegate = h.H2(new StripeGooglePayActivity$paymentsClient$2(this));
    private final c publishableKey$delegate = h.H2(new StripeGooglePayActivity$publishableKey$2(this));
    private final c stripeAccountId$delegate = h.H2(new StripeGooglePayActivity$stripeAccountId$2(this));
    private final c viewModel$delegate = new l0(m.a(StripeGooglePayViewModel.class), new StripeGooglePayActivity$$special$$inlined$viewModels$2(this), new StripeGooglePayActivity$viewModel$2(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/googlepay/StripeGooglePayActivity$Companion;", "", "", "LOAD_PAYMENT_DATA_REQUEST_CODE", "I", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeGooglePayActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public static final /* synthetic */ StripeGooglePayContract.Args access$getArgs$p(StripeGooglePayActivity stripeGooglePayActivity) {
        StripeGooglePayContract.Args args2 = stripeGooglePayActivity.args;
        if (args2 != null) {
            return args2;
        }
        i.m("args");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void finishWithResult(StripeGooglePayContract.Result result) {
        setResult(-1, new Intent().putExtras(result.toBundle()));
        finish();
    }

    private final i0.h.a.b.n.c getPaymentsClient() {
        return (i0.h.a.b.n.c) this.paymentsClient$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final String getPublishableKey() {
        return (String) this.publishableKey$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final String getStripeAccountId() {
        return (String) this.stripeAccountId$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final StripeGooglePayViewModel getViewModel() {
        return (StripeGooglePayViewModel) this.viewModel$delegate.getValue();
    }

    private final void isReadyToPay(JSONObject jSONObject) {
        g<Boolean> d = getPaymentsClient().d(getViewModel().createIsReadyToPayRequest());
        StripeGooglePayActivity$isReadyToPay$1 stripeGooglePayActivity$isReadyToPay$1 = new StripeGooglePayActivity$isReadyToPay$1(this, jSONObject);
        b0 b0Var = (b0) d;
        Objects.requireNonNull(b0Var);
        b0Var.c(i0.h.a.b.m.i.a, stripeGooglePayActivity$isReadyToPay$1);
    }

    /* JADX WARNING: type inference failed for: r9v7, types: [com.google.android.gms.common.internal.safeparcel.SafeParcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void onGooglePayResult(android.content.Intent r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x002b
            android.os.Parcelable$Creator<com.google.android.gms.wallet.PaymentData> r1 = com.google.android.gms.wallet.PaymentData.CREATOR
            java.lang.String r2 = "com.google.android.gms.wallet.PaymentData"
            byte[] r9 = r9.getByteArrayExtra(r2)
            if (r9 != 0) goto L_0x000e
            goto L_0x0029
        L_0x000e:
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r1, r0)
            android.os.Parcel r0 = android.os.Parcel.obtain()
            int r2 = r9.length
            r3 = 0
            r0.unmarshall(r9, r3, r2)
            r0.setDataPosition(r3)
            java.lang.Object r9 = r1.createFromParcel(r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r9 = (com.google.android.gms.common.internal.safeparcel.SafeParcelable) r9
            r0.recycle()
            r0 = r9
        L_0x0029:
            com.google.android.gms.wallet.PaymentData r0 = (com.google.android.gms.wallet.PaymentData) r0
        L_0x002b:
            if (r0 != 0) goto L_0x0048
            com.stripe.android.googlepay.StripeGooglePayViewModel r9 = r8.getViewModel()
            com.stripe.android.googlepay.StripeGooglePayContract$Result$Error r7 = new com.stripe.android.googlepay.StripeGooglePayContract$Result$Error
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Google Pay data was not available"
            r1.<init>(r0)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 14
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.updateGooglePayResult(r7)
            return
        L_0x0048:
            org.json.JSONObject r9 = new org.json.JSONObject
            java.lang.String r0 = r0.Z1
            r9.<init>((java.lang.String) r0)
            com.stripe.android.model.GooglePayResult$Companion r0 = com.stripe.android.model.GooglePayResult.Companion
            com.stripe.android.model.GooglePayResult r0 = r0.fromJson(r9)
            com.stripe.android.model.ShippingInformation r0 = r0.getShippingInformation()
            com.stripe.android.model.PaymentMethodCreateParams$Companion r1 = com.stripe.android.model.PaymentMethodCreateParams.Companion
            com.stripe.android.model.PaymentMethodCreateParams r9 = r1.createFromGooglePay(r9)
            com.stripe.android.googlepay.StripeGooglePayViewModel r1 = r8.getViewModel()
            androidx.lifecycle.LiveData r9 = r1.createPaymentMethod(r9)
            com.stripe.android.googlepay.StripeGooglePayActivity$onGooglePayResult$1 r1 = new com.stripe.android.googlepay.StripeGooglePayActivity$onGooglePayResult$1
            r1.<init>(r8, r0)
            r9.observe(r8, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepay.StripeGooglePayActivity.onGooglePayResult(android.content.Intent):void");
    }

    /* access modifiers changed from: private */
    public final void onPaymentMethodCreated(PaymentMethod paymentMethod, ShippingInformation shippingInformation) {
        getViewModel().setPaymentMethod(paymentMethod);
        getViewModel().updateGooglePayResult(new StripeGooglePayContract.Result.PaymentData(paymentMethod, shippingInformation));
    }

    /* access modifiers changed from: private */
    public final void payWithGoogle(JSONObject jSONObject) {
        i0.h.a.b.n.c paymentsClient = getPaymentsClient();
        String jSONObject2 = jSONObject.toString();
        PaymentDataRequest paymentDataRequest = new PaymentDataRequest();
        v.A(jSONObject2, "paymentDataRequestJson cannot be null!");
        paymentDataRequest.c2 = jSONObject2;
        Objects.requireNonNull(paymentsClient);
        n.a a = n.a();
        a.a = new i0.h.a.b.n.h(paymentDataRequest);
        a.c = new Feature[]{s.c};
        a.b = true;
        a.d = 23707;
        g c = paymentsClient.c(1, a.a());
        int i = b.c;
        o oVar = new o();
        int incrementAndGet = o.q.incrementAndGet();
        oVar.x = incrementAndGet;
        o.d.put(incrementAndGet, oVar);
        o.c.postDelayed(oVar, b.a);
        c.b(oVar);
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        int i2 = oVar.x;
        Bundle bundle = new Bundle();
        bundle.putInt("resolveCallId", i2);
        bundle.putInt("requestCode", LOAD_PAYMENT_DATA_REQUEST_CODE);
        bundle.putLong("initializationElapsedRealtime", b.b);
        p pVar = new p();
        pVar.setArguments(bundle);
        int i3 = oVar.x;
        StringBuilder sb = new StringBuilder(58);
        sb.append("com.google.android.gms.wallet.AutoResolveHelper");
        sb.append(i3);
        beginTransaction.add(pVar, sb.toString()).commit();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Status status;
        super.onActivityResult(i, i2, intent);
        if (i != LOAD_PAYMENT_DATA_REQUEST_CODE) {
            return;
        }
        if (i2 == -1) {
            onGooglePayResult(intent);
        } else if (i2 == 0) {
            getViewModel().updateGooglePayResult(StripeGooglePayContract.Result.Canceled.INSTANCE);
        } else if (i2 != 1) {
            getViewModel().updateGooglePayResult(new StripeGooglePayContract.Result.Error(new RuntimeException("Google Pay returned an expected result code."), (Status) null, (PaymentMethod) null, (ShippingInformation) null, 14, (f) null));
        } else {
            int i3 = b.c;
            if (intent == null) {
                status = null;
            } else {
                status = (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
            }
            getViewModel().updateGooglePayResult(new StripeGooglePayContract.Result.Error(new RuntimeException("Google Pay returned an error. See googlePayStatus property for more information."), status, (PaymentMethod) null, (ShippingInformation) null, 12, (f) null));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        overridePendingTransition(0, 0);
        setResult(-1, new Intent().putExtras(StripeGooglePayContract.Result.Canceled.INSTANCE.toBundle()));
        StripeGooglePayContract.Args.Companion companion = StripeGooglePayContract.Args.Companion;
        Intent intent = getIntent();
        i.d(intent, "intent");
        StripeGooglePayContract.Args create$payments_core_release = companion.create$payments_core_release(intent);
        if (create$payments_core_release == null) {
            finishWithResult(new StripeGooglePayContract.Result.Error(new RuntimeException("StripeGooglePayActivity was started without arguments."), (Status) null, (PaymentMethod) null, (ShippingInformation) null, 14, (f) null));
            return;
        }
        this.args = create$payments_core_release;
        if (create$payments_core_release != null) {
            Integer statusBarColor = create$payments_core_release.getStatusBarColor();
            if (statusBarColor != null) {
                int intValue = statusBarColor.intValue();
                Window window = getWindow();
                i.d(window, "window");
                window.setStatusBarColor(intValue);
            }
            getViewModel().getGooglePayResult$payments_core_release().observe(this, new StripeGooglePayActivity$onCreate$2(this));
            if (!getViewModel().getHasLaunched()) {
                getViewModel().setHasLaunched(true);
                isReadyToPay(getViewModel().createPaymentDataRequestForPaymentIntentArgs());
                return;
            }
            return;
        }
        i.m("args");
        throw null;
    }
}
