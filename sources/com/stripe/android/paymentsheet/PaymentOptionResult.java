package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import i0.d.a.a.a;
import kotlin.Metadata;
import kotlin.Pair;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \f2\u00020\u0001:\u0004\r\f\u000e\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\u0006\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "Landroid/os/Parcelable;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "", "resultCode", "I", "getResultCode", "()I", "<init>", "(I)V", "Companion", "Canceled", "Failed", "Succeeded", "Lcom/stripe/android/paymentsheet/PaymentOptionResult$Succeeded;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult$Failed;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult$Canceled;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentOptionResult.kt */
public abstract class PaymentOptionResult implements Parcelable {
    public static final Companion Companion = new Companion((f) null);
    private static final String EXTRA_RESULT = "extra_activity_result";
    private final int resultCode;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionResult$Canceled;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "", "component1", "()Ljava/lang/Throwable;", "mostRecentError", "copy", "(Ljava/lang/Throwable;)Lcom/stripe/android/paymentsheet/PaymentOptionResult$Canceled;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Throwable;", "getMostRecentError", "<init>", "(Ljava/lang/Throwable;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentOptionResult.kt */
    public static final class Canceled extends PaymentOptionResult {
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
        private final Throwable mostRecentError;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Canceled> {
            public final Canceled createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Canceled((Throwable) parcel.readSerializable());
            }

            public final Canceled[] newArray(int i) {
                return new Canceled[i];
            }
        }

        public Canceled(Throwable th) {
            super(0, (f) null);
            this.mostRecentError = th;
        }

        public static /* synthetic */ Canceled copy$default(Canceled canceled, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = canceled.mostRecentError;
            }
            return canceled.copy(th);
        }

        public final Throwable component1() {
            return this.mostRecentError;
        }

        public final Canceled copy(Throwable th) {
            return new Canceled(th);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Canceled) && i.a(this.mostRecentError, ((Canceled) obj).mostRecentError);
            }
            return true;
        }

        public final Throwable getMostRecentError() {
            return this.mostRecentError;
        }

        public int hashCode() {
            Throwable th = this.mostRecentError;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Canceled(mostRecentError=");
            P0.append(this.mostRecentError);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeSerializable(this.mostRecentError);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionResult$Companion;", "", "Landroid/content/Intent;", "intent", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "fromIntent$payments_core_release", "(Landroid/content/Intent;)Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "fromIntent", "", "EXTRA_RESULT", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentOptionResult.kt */
    public static final class Companion {
        private Companion() {
        }

        public final /* synthetic */ PaymentOptionResult fromIntent$payments_core_release(Intent intent) {
            if (intent != null) {
                return (PaymentOptionResult) intent.getParcelableExtra("extra_activity_result");
            }
            return null;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionResult$Failed;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "", "component1", "()Ljava/lang/Throwable;", "error", "copy", "(Ljava/lang/Throwable;)Lcom/stripe/android/paymentsheet/PaymentOptionResult$Failed;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Throwable;", "getError", "<init>", "(Ljava/lang/Throwable;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentOptionResult.kt */
    public static final class Failed extends PaymentOptionResult {
        public static final Parcelable.Creator<Failed> CREATOR = new Creator();
        private final Throwable error;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Failed> {
            public final Failed createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Failed((Throwable) parcel.readSerializable());
            }

            public final Failed[] newArray(int i) {
                return new Failed[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Failed(Throwable th) {
            super(0, (f) null);
            i.e(th, "error");
            this.error = th;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failed.error;
            }
            return failed.copy(th);
        }

        public final Throwable component1() {
            return this.error;
        }

        public final Failed copy(Throwable th) {
            i.e(th, "error");
            return new Failed(th);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Failed) && i.a(this.error, ((Failed) obj).error);
            }
            return true;
        }

        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            Throwable th = this.error;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Failed(error=");
            P0.append(this.error);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeSerializable(this.error);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionResult$Succeeded;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "component1", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "copy", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/paymentsheet/PaymentOptionResult$Succeeded;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getPaymentSelection", "<init>", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentOptionResult.kt */
    public static final class Succeeded extends PaymentOptionResult {
        public static final Parcelable.Creator<Succeeded> CREATOR = new Creator();
        private final PaymentSelection paymentSelection;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Succeeded> {
            public final Succeeded createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Succeeded((PaymentSelection) parcel.readParcelable(Succeeded.class.getClassLoader()));
            }

            public final Succeeded[] newArray(int i) {
                return new Succeeded[i];
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Succeeded(PaymentSelection paymentSelection2) {
            super(-1, (f) null);
            i.e(paymentSelection2, "paymentSelection");
            this.paymentSelection = paymentSelection2;
        }

        public static /* synthetic */ Succeeded copy$default(Succeeded succeeded, PaymentSelection paymentSelection2, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentSelection2 = succeeded.paymentSelection;
            }
            return succeeded.copy(paymentSelection2);
        }

        public final PaymentSelection component1() {
            return this.paymentSelection;
        }

        public final Succeeded copy(PaymentSelection paymentSelection2) {
            i.e(paymentSelection2, "paymentSelection");
            return new Succeeded(paymentSelection2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Succeeded) && i.a(this.paymentSelection, ((Succeeded) obj).paymentSelection);
            }
            return true;
        }

        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public int hashCode() {
            PaymentSelection paymentSelection2 = this.paymentSelection;
            if (paymentSelection2 != null) {
                return paymentSelection2.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Succeeded(paymentSelection=");
            P0.append(this.paymentSelection);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeParcelable(this.paymentSelection, i);
        }
    }

    private PaymentOptionResult(int i) {
        this.resultCode = i;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public final Bundle toBundle() {
        return g0.a.b.b.a.g(new Pair("extra_activity_result", this));
    }

    public /* synthetic */ PaymentOptionResult(int i, f fVar) {
        this(i);
    }
}
