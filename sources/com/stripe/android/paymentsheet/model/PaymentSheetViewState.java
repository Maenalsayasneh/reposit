package com.stripe.android.paymentsheet.model;

import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import m0.i;
import m0.n.a.a;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\u0015\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "errorMessage", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "getErrorMessage", "()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "<init>", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;)V", "FinishProcessing", "Reset", "StartProcessing", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$StartProcessing;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$FinishProcessing;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSheetViewState.kt */
public abstract class PaymentSheetViewState {
    private final BaseSheetViewModel.UserErrorMessage errorMessage;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0005¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$FinishProcessing;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "Lkotlin/Function0;", "Lm0/i;", "component1", "()Lm0/n/a/a;", "onComplete", "copy", "(Lm0/n/a/a;)Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$FinishProcessing;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lm0/n/a/a;", "getOnComplete", "<init>", "(Lm0/n/a/a;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetViewState.kt */
    public static final class FinishProcessing extends PaymentSheetViewState {
        private final a<i> onComplete;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FinishProcessing(a<i> aVar) {
            super((BaseSheetViewModel.UserErrorMessage) null, 1, (f) null);
            m0.n.b.i.e(aVar, "onComplete");
            this.onComplete = aVar;
        }

        public static /* synthetic */ FinishProcessing copy$default(FinishProcessing finishProcessing, a<i> aVar, int i, Object obj) {
            if ((i & 1) != 0) {
                aVar = finishProcessing.onComplete;
            }
            return finishProcessing.copy(aVar);
        }

        public final a<i> component1() {
            return this.onComplete;
        }

        public final FinishProcessing copy(a<i> aVar) {
            m0.n.b.i.e(aVar, "onComplete");
            return new FinishProcessing(aVar);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof FinishProcessing) && m0.n.b.i.a(this.onComplete, ((FinishProcessing) obj).onComplete);
            }
            return true;
        }

        public final a<i> getOnComplete() {
            return this.onComplete;
        }

        public int hashCode() {
            a<i> aVar = this.onComplete;
            if (aVar != null) {
                return aVar.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("FinishProcessing(onComplete=");
            P0.append(this.onComplete);
            P0.append(")");
            return P0.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "component1", "()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "message", "copy", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;)Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;", "<init>", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$UserErrorMessage;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetViewState.kt */
    public static final class Reset extends PaymentSheetViewState {
        private final BaseSheetViewModel.UserErrorMessage message;

        public Reset() {
            this((BaseSheetViewModel.UserErrorMessage) null, 1, (f) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Reset(BaseSheetViewModel.UserErrorMessage userErrorMessage, int i, f fVar) {
            this((i & 1) != 0 ? null : userErrorMessage);
        }

        private final BaseSheetViewModel.UserErrorMessage component1() {
            return this.message;
        }

        public static /* synthetic */ Reset copy$default(Reset reset, BaseSheetViewModel.UserErrorMessage userErrorMessage, int i, Object obj) {
            if ((i & 1) != 0) {
                userErrorMessage = reset.message;
            }
            return reset.copy(userErrorMessage);
        }

        public final Reset copy(BaseSheetViewModel.UserErrorMessage userErrorMessage) {
            return new Reset(userErrorMessage);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Reset) && m0.n.b.i.a(this.message, ((Reset) obj).message);
            }
            return true;
        }

        public int hashCode() {
            BaseSheetViewModel.UserErrorMessage userErrorMessage = this.message;
            if (userErrorMessage != null) {
                return userErrorMessage.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Reset(message=");
            P0.append(this.message);
            P0.append(")");
            return P0.toString();
        }

        public Reset(BaseSheetViewModel.UserErrorMessage userErrorMessage) {
            super(userErrorMessage, (f) null);
            this.message = userErrorMessage;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$StartProcessing;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetViewState.kt */
    public static final class StartProcessing extends PaymentSheetViewState {
        public static final StartProcessing INSTANCE = new StartProcessing();

        private StartProcessing() {
            super((BaseSheetViewModel.UserErrorMessage) null, (f) null);
        }
    }

    private PaymentSheetViewState(BaseSheetViewModel.UserErrorMessage userErrorMessage) {
        this.errorMessage = userErrorMessage;
    }

    public final BaseSheetViewModel.UserErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentSheetViewState(BaseSheetViewModel.UserErrorMessage userErrorMessage, int i, f fVar) {
        this((i & 1) != 0 ? null : userErrorMessage);
    }

    public /* synthetic */ PaymentSheetViewState(BaseSheetViewModel.UserErrorMessage userErrorMessage, f fVar) {
        this(userErrorMessage);
    }
}
