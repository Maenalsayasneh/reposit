package com.stripe.android;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.PaymentSessionPrefs;
import com.stripe.android.model.Customer;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import h0.q.a;
import h0.q.b;
import h0.q.f0;
import h0.q.k0;
import h0.q.y;
import h0.x.c;
import i0.j.f.p.h;
import kotlin.Metadata;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 I2\u00020\u0001:\u0004IJKLB1\u0012\u0006\u0010F\u001a\u00020E\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u00106\u001a\u000205\u0012\b\b\u0002\u0010A\u001a\u00020@¢\u0006\u0004\bG\u0010HJ/\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001f\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0006¢\u0006\u0004\b+\u0010\u0014R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020'0,8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\"\u00101\u001a\b\u0012\u0004\u0012\u00020-0\u00178\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R*\u0010(\u001a\u00020'2\u0006\u0010;\u001a\u00020'8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b(\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010*R\u0016\u0010A\u001a\u00020@8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001f\u0010C\u001a\b\u0012\u0004\u0012\u00020'0\u00178\u0006@\u0006¢\u0006\f\n\u0004\bC\u00102\u001a\u0004\bD\u00104¨\u0006M"}, d2 = {"Lcom/stripe/android/PaymentSessionViewModel;", "Lh0/q/b;", "", "paymentMethodId", "Lkotlin/Function1;", "Lcom/stripe/android/model/PaymentMethod;", "Lm0/i;", "onComplete", "fetchCustomerPaymentMethod", "(Ljava/lang/String;Lm0/n/a/l;)V", "paymentMethod", "", "useGooglePay", "persistPaymentMethodResult", "(Lcom/stripe/android/model/PaymentMethod;Z)V", "", "cartTotal", "updateCartTotal", "(J)V", "clearPaymentMethod", "()V", "onCompleted", "isInitialFetch", "Landroidx/lifecycle/LiveData;", "Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult;", "fetchCustomer", "(Z)Landroidx/lifecycle/LiveData;", "customerId", "Lkotlin/Function0;", "onCustomerRetrieved$payments_core_release", "(Ljava/lang/String;ZLm0/n/a/a;)V", "onCustomerRetrieved", "userSelectedPaymentMethodId", "getSelectedPaymentMethodId", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result;", "result", "onPaymentMethodResult", "(Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result;)V", "Lcom/stripe/android/PaymentSessionData;", "paymentSessionData", "onPaymentFlowResult", "(Lcom/stripe/android/PaymentSessionData;)V", "onListenerAttached", "Lh0/q/y;", "Lcom/stripe/android/PaymentSessionViewModel$NetworkState;", "_networkState", "Lh0/q/y;", "_paymentSessionDataLiveData", "networkState", "Landroidx/lifecycle/LiveData;", "getNetworkState$payments_core_release", "()Landroidx/lifecycle/LiveData;", "Lcom/stripe/android/CustomerSession;", "customerSession", "Lcom/stripe/android/CustomerSession;", "Lh0/q/f0;", "savedStateHandle", "Lh0/q/f0;", "value", "Lcom/stripe/android/PaymentSessionData;", "getPaymentSessionData", "()Lcom/stripe/android/PaymentSessionData;", "setPaymentSessionData", "Lcom/stripe/android/PaymentSessionPrefs;", "paymentSessionPrefs", "Lcom/stripe/android/PaymentSessionPrefs;", "paymentSessionDataLiveData", "getPaymentSessionDataLiveData", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;Lh0/q/f0;Lcom/stripe/android/PaymentSessionData;Lcom/stripe/android/CustomerSession;Lcom/stripe/android/PaymentSessionPrefs;)V", "Companion", "Factory", "FetchCustomerResult", "NetworkState", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSessionViewModel.kt */
public final class PaymentSessionViewModel extends b {
    public static final Companion Companion = new Companion((f) null);
    public static final String KEY_PAYMENT_SESSION_DATA = "key_payment_session_data";
    private static final int MAX_PAYMENT_METHODS_LIMIT = 100;
    /* access modifiers changed from: private */
    public final y<NetworkState> _networkState;
    private final y<PaymentSessionData> _paymentSessionDataLiveData;
    private final CustomerSession customerSession;
    private final LiveData<NetworkState> networkState;
    private PaymentSessionData paymentSessionData;
    private final LiveData<PaymentSessionData> paymentSessionDataLiveData;
    private final PaymentSessionPrefs paymentSessionPrefs;
    private final f0 savedStateHandle;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/PaymentSessionViewModel$Companion;", "", "", "KEY_PAYMENT_SESSION_DATA", "Ljava/lang/String;", "", "MAX_PAYMENT_METHODS_LIMIT", "I", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSessionViewModel.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\n\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/PaymentSessionViewModel$Factory;", "Lh0/q/a;", "Lh0/q/k0;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Lh0/q/f0;", "handle", "create", "(Ljava/lang/String;Ljava/lang/Class;Lh0/q/f0;)Lh0/q/k0;", "Landroid/app/Application;", "application", "Landroid/app/Application;", "Lcom/stripe/android/CustomerSession;", "customerSession", "Lcom/stripe/android/CustomerSession;", "Lcom/stripe/android/PaymentSessionData;", "paymentSessionData", "Lcom/stripe/android/PaymentSessionData;", "Lh0/x/c;", "owner", "<init>", "(Landroid/app/Application;Lh0/x/c;Lcom/stripe/android/PaymentSessionData;Lcom/stripe/android/CustomerSession;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSessionViewModel.kt */
    public static final class Factory extends a {
        private final Application application;
        private final CustomerSession customerSession;
        private final PaymentSessionData paymentSessionData;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Factory(Application application2, c cVar, PaymentSessionData paymentSessionData2, CustomerSession customerSession2) {
            super(cVar, (Bundle) null);
            i.e(application2, "application");
            i.e(cVar, "owner");
            i.e(paymentSessionData2, "paymentSessionData");
            i.e(customerSession2, "customerSession");
            this.application = application2;
            this.paymentSessionData = paymentSessionData2;
            this.customerSession = customerSession2;
        }

        public <T extends k0> T create(String str, Class<T> cls, f0 f0Var) {
            i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
            i.e(cls, "modelClass");
            i.e(f0Var, "handle");
            return new PaymentSessionViewModel(this.application, f0Var, this.paymentSessionData, this.customerSession, (PaymentSessionPrefs) null, 16, (f) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult;", "", "<init>", "()V", "Error", "Success", "Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult$Success;", "Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult$Error;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSessionViewModel.kt */
    public static abstract class FetchCustomerResult {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0004J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001a\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult$Error;", "Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult;", "", "component1", "()I", "", "component2", "()Ljava/lang/String;", "Lcom/stripe/android/StripeError;", "component3", "()Lcom/stripe/android/StripeError;", "errorCode", "errorMessage", "stripeError", "copy", "(ILjava/lang/String;Lcom/stripe/android/StripeError;)Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult$Error;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/StripeError;", "getStripeError", "Ljava/lang/String;", "getErrorMessage", "I", "getErrorCode", "<init>", "(ILjava/lang/String;Lcom/stripe/android/StripeError;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentSessionViewModel.kt */
        public static final class Error extends FetchCustomerResult {
            private final int errorCode;
            private final String errorMessage;
            private final StripeError stripeError;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Error(int i, String str, StripeError stripeError2) {
                super((f) null);
                i.e(str, "errorMessage");
                this.errorCode = i;
                this.errorMessage = str;
                this.stripeError = stripeError2;
            }

            public static /* synthetic */ Error copy$default(Error error, int i, String str, StripeError stripeError2, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = error.errorCode;
                }
                if ((i2 & 2) != 0) {
                    str = error.errorMessage;
                }
                if ((i2 & 4) != 0) {
                    stripeError2 = error.stripeError;
                }
                return error.copy(i, str, stripeError2);
            }

            public final int component1() {
                return this.errorCode;
            }

            public final String component2() {
                return this.errorMessage;
            }

            public final StripeError component3() {
                return this.stripeError;
            }

            public final Error copy(int i, String str, StripeError stripeError2) {
                i.e(str, "errorMessage");
                return new Error(i, str, stripeError2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return this.errorCode == error.errorCode && i.a(this.errorMessage, error.errorMessage) && i.a(this.stripeError, error.stripeError);
            }

            public final int getErrorCode() {
                return this.errorCode;
            }

            public final String getErrorMessage() {
                return this.errorMessage;
            }

            public final StripeError getStripeError() {
                return this.stripeError;
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.errorCode) * 31;
                String str = this.errorMessage;
                int i = 0;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
                StripeError stripeError2 = this.stripeError;
                if (stripeError2 != null) {
                    i = stripeError2.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("Error(errorCode=");
                P0.append(this.errorCode);
                P0.append(", errorMessage=");
                P0.append(this.errorMessage);
                P0.append(", stripeError=");
                P0.append(this.stripeError);
                P0.append(")");
                return P0.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult$Success;", "Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentSessionViewModel.kt */
        public static final class Success extends FetchCustomerResult {
            public static final Success INSTANCE = new Success();

            private Success() {
                super((f) null);
            }
        }

        private FetchCustomerResult() {
        }

        public /* synthetic */ FetchCustomerResult(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/PaymentSessionViewModel$NetworkState;", "", "<init>", "(Ljava/lang/String;I)V", "Active", "Inactive", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSessionViewModel.kt */
    public enum NetworkState {
        Active,
        Inactive
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentSessionViewModel(Application application, f0 f0Var, PaymentSessionData paymentSessionData2, CustomerSession customerSession2, PaymentSessionPrefs paymentSessionPrefs2, int i, f fVar) {
        this(application, f0Var, paymentSessionData2, customerSession2, (i & 16) != 0 ? new PaymentSessionPrefs.Default(application) : paymentSessionPrefs2);
    }

    public static /* synthetic */ LiveData fetchCustomer$default(PaymentSessionViewModel paymentSessionViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return paymentSessionViewModel.fetchCustomer(z);
    }

    private final void fetchCustomerPaymentMethod(String str, l<? super PaymentMethod, m0.i> lVar) {
        if (str != null) {
            CustomerSession.getPaymentMethods$default(this.customerSession, PaymentMethod.Type.Card, 100, (String) null, (String) null, new PaymentSessionViewModel$fetchCustomerPaymentMethod$1(lVar, str), 12, (Object) null);
        } else {
            lVar.invoke(null);
        }
    }

    public static /* synthetic */ String getSelectedPaymentMethodId$default(PaymentSessionViewModel paymentSessionViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return paymentSessionViewModel.getSelectedPaymentMethodId(str);
    }

    public static /* synthetic */ void onCustomerRetrieved$payments_core_release$default(PaymentSessionViewModel paymentSessionViewModel, String str, boolean z, m0.n.a.a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        paymentSessionViewModel.onCustomerRetrieved$payments_core_release(str, z, aVar);
    }

    private final void persistPaymentMethodResult(PaymentMethod paymentMethod, boolean z) {
        String id;
        PaymentMethod paymentMethod2 = paymentMethod;
        Customer cachedCustomer = this.customerSession.getCachedCustomer();
        if (!(cachedCustomer == null || (id = cachedCustomer.getId()) == null)) {
            this.paymentSessionPrefs.savePaymentMethodId(id, paymentMethod2 != null ? paymentMethod2.id : null);
        }
        setPaymentSessionData(PaymentSessionData.copy$default(this.paymentSessionData, false, false, 0, 0, (ShippingInformation) null, (ShippingMethod) null, paymentMethod, z, 63, (Object) null));
    }

    public final void clearPaymentMethod() {
        setPaymentSessionData(PaymentSessionData.copy$default(this.paymentSessionData, false, false, 0, 0, (ShippingInformation) null, (ShippingMethod) null, (PaymentMethod) null, false, 191, (Object) null));
    }

    public final /* synthetic */ LiveData<FetchCustomerResult> fetchCustomer(boolean z) {
        this._networkState.setValue(NetworkState.Active);
        y yVar = new y();
        this.customerSession.retrieveCurrentCustomer$payments_core_release(h.N3(PaymentSession.PRODUCT_TOKEN), new PaymentSessionViewModel$fetchCustomer$1(this, z, yVar));
        return yVar;
    }

    public final LiveData<NetworkState> getNetworkState$payments_core_release() {
        return this.networkState;
    }

    public final PaymentSessionData getPaymentSessionData() {
        return this.paymentSessionData;
    }

    public final LiveData<PaymentSessionData> getPaymentSessionDataLiveData() {
        return this.paymentSessionDataLiveData;
    }

    public final /* synthetic */ String getSelectedPaymentMethodId(String str) {
        String id;
        if (!this.paymentSessionData.getUseGooglePay()) {
            if (str != null) {
                return str;
            }
            if (this.paymentSessionData.getPaymentMethod() != null) {
                PaymentMethod paymentMethod = this.paymentSessionData.getPaymentMethod();
                if (paymentMethod != null) {
                    return paymentMethod.id;
                }
            } else {
                Customer cachedCustomer = this.customerSession.getCachedCustomer();
                if (!(cachedCustomer == null || (id = cachedCustomer.getId()) == null)) {
                    return this.paymentSessionPrefs.getPaymentMethodId(id);
                }
            }
        }
        return null;
    }

    public final /* synthetic */ void onCompleted() {
    }

    public final /* synthetic */ void onCustomerRetrieved$payments_core_release(String str, boolean z, m0.n.a.a<m0.i> aVar) {
        i.e(aVar, "onComplete");
        if (z) {
            fetchCustomerPaymentMethod(this.paymentSessionPrefs.getPaymentMethodId(str), new PaymentSessionViewModel$onCustomerRetrieved$1(this, aVar));
        } else {
            aVar.invoke();
        }
    }

    public final /* synthetic */ void onListenerAttached() {
        this._paymentSessionDataLiveData.setValue(this.paymentSessionData);
    }

    public final /* synthetic */ void onPaymentFlowResult(PaymentSessionData paymentSessionData2) {
        i.e(paymentSessionData2, "paymentSessionData");
        setPaymentSessionData(paymentSessionData2);
    }

    public final /* synthetic */ void onPaymentMethodResult(PaymentMethodsActivityStarter.Result result) {
        persistPaymentMethodResult(result != null ? result.paymentMethod : null, result != null ? result.getUseGooglePay() : false);
    }

    public final void setPaymentSessionData(PaymentSessionData paymentSessionData2) {
        i.e(paymentSessionData2, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        if (!i.a(paymentSessionData2, this.paymentSessionData)) {
            this.paymentSessionData = paymentSessionData2;
            this.savedStateHandle.b(KEY_PAYMENT_SESSION_DATA, paymentSessionData2);
            this._paymentSessionDataLiveData.setValue(paymentSessionData2);
        }
    }

    public final /* synthetic */ void updateCartTotal(long j) {
        setPaymentSessionData(PaymentSessionData.copy$default(this.paymentSessionData, false, false, j, 0, (ShippingInformation) null, (ShippingMethod) null, (PaymentMethod) null, false, 251, (Object) null));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentSessionViewModel(Application application, f0 f0Var, PaymentSessionData paymentSessionData2, CustomerSession customerSession2, PaymentSessionPrefs paymentSessionPrefs2) {
        super(application);
        i.e(application, "application");
        i.e(f0Var, "savedStateHandle");
        i.e(paymentSessionData2, "paymentSessionData");
        i.e(customerSession2, "customerSession");
        i.e(paymentSessionPrefs2, "paymentSessionPrefs");
        this.savedStateHandle = f0Var;
        this.customerSession = customerSession2;
        this.paymentSessionPrefs = paymentSessionPrefs2;
        this.paymentSessionData = paymentSessionData2;
        y<PaymentSessionData> yVar = new y<>();
        this._paymentSessionDataLiveData = yVar;
        this.paymentSessionDataLiveData = yVar;
        PaymentSessionData paymentSessionData3 = (PaymentSessionData) f0Var.b.get(KEY_PAYMENT_SESSION_DATA);
        if (paymentSessionData3 != null) {
            i.d(paymentSessionData3, "it");
            setPaymentSessionData(paymentSessionData3);
        }
        y<NetworkState> yVar2 = new y<>();
        this._networkState = yVar2;
        this.networkState = yVar2;
    }
}
