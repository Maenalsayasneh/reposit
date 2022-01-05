package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.repositories.PaymentMethodsRepository;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.l.c;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\rJ7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer;", "", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "clientSecret", "Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;", "stripeIntentRepository", "Lcom/stripe/android/paymentsheet/repositories/PaymentMethodsRepository;", "paymentMethodsRepository", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "paymentSheetConfiguration", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult;", "init", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lcom/stripe/android/paymentsheet/repositories/StripeIntentRepository;Lcom/stripe/android/paymentsheet/repositories/PaymentMethodsRepository;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lm0/l/c;)Ljava/lang/Object;", "InitResult", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FlowControllerInitializer.kt */
public interface FlowControllerInitializer {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    /* compiled from: FlowControllerInitializer.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object init$default(FlowControllerInitializer flowControllerInitializer, ClientSecret clientSecret, StripeIntentRepository stripeIntentRepository, PaymentMethodsRepository paymentMethodsRepository, PaymentSheet.Configuration configuration, c cVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    configuration = null;
                }
                return flowControllerInitializer.init(clientSecret, stripeIntentRepository, paymentMethodsRepository, configuration, cVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult;", "", "<init>", "()V", "Failure", "Success", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult$Success;", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult$Failure;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: FlowControllerInitializer.kt */
    public static abstract class InitResult {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult$Failure;", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult;", "", "throwable", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "<init>", "(Ljava/lang/Throwable;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: FlowControllerInitializer.kt */
        public static final class Failure extends InitResult {
            private final Throwable throwable;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Failure(Throwable th) {
                super((f) null);
                i.e(th, "throwable");
                this.throwable = th;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult$Success;", "Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult;", "Lcom/stripe/android/paymentsheet/flowcontroller/InitData;", "component1", "()Lcom/stripe/android/paymentsheet/flowcontroller/InitData;", "initData", "copy", "(Lcom/stripe/android/paymentsheet/flowcontroller/InitData;)Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerInitializer$InitResult$Success;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/paymentsheet/flowcontroller/InitData;", "getInitData", "<init>", "(Lcom/stripe/android/paymentsheet/flowcontroller/InitData;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: FlowControllerInitializer.kt */
        public static final class Success extends InitResult {
            private final InitData initData;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Success(InitData initData2) {
                super((f) null);
                i.e(initData2, "initData");
                this.initData = initData2;
            }

            public static /* synthetic */ Success copy$default(Success success, InitData initData2, int i, Object obj) {
                if ((i & 1) != 0) {
                    initData2 = success.initData;
                }
                return success.copy(initData2);
            }

            public final InitData component1() {
                return this.initData;
            }

            public final Success copy(InitData initData2) {
                i.e(initData2, "initData");
                return new Success(initData2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof Success) && i.a(this.initData, ((Success) obj).initData);
                }
                return true;
            }

            public final InitData getInitData() {
                return this.initData;
            }

            public int hashCode() {
                InitData initData2 = this.initData;
                if (initData2 != null) {
                    return initData2.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder P0 = a.P0("Success(initData=");
                P0.append(this.initData);
                P0.append(")");
                return P0.toString();
            }
        }

        private InitResult() {
        }

        public /* synthetic */ InitResult(f fVar) {
            this();
        }
    }

    Object init(ClientSecret clientSecret, StripeIntentRepository stripeIntentRepository, PaymentMethodsRepository paymentMethodsRepository, PaymentSheet.Configuration configuration, c<? super InitResult> cVar);
}
