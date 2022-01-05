package com.stripe.android.paymentsheet;

import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "Landroid/os/Parcelable;", "<init>", "()V", "Canceled", "Completed", "Failed", "Lcom/stripe/android/paymentsheet/PaymentSheetResult$Completed;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult$Canceled;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult$Failed;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSheetResult.kt */
public abstract class PaymentSheetResult implements Parcelable {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetResult$Canceled;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetResult.kt */
    public static final class Canceled extends PaymentSheetResult {
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
        public static final Canceled INSTANCE = new Canceled();

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Canceled> {
            public final Canceled createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                if (parcel.readInt() != 0) {
                    return Canceled.INSTANCE;
                }
                return null;
            }

            public final Canceled[] newArray(int i) {
                return new Canceled[i];
            }
        }

        private Canceled() {
            super((f) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeInt(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetResult$Completed;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetResult.kt */
    public static final class Completed extends PaymentSheetResult {
        public static final Parcelable.Creator<Completed> CREATOR = new Creator();
        public static final Completed INSTANCE = new Completed();

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Completed> {
            public final Completed createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                if (parcel.readInt() != 0) {
                    return Completed.INSTANCE;
                }
                return null;
            }

            public final Completed[] newArray(int i) {
                return new Completed[i];
            }
        }

        private Completed() {
            super((f) null);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeInt(1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetResult$Failed;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", "", "component1", "()Ljava/lang/Throwable;", "error", "copy", "(Ljava/lang/Throwable;)Lcom/stripe/android/paymentsheet/PaymentSheetResult$Failed;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Throwable;", "getError", "<init>", "(Ljava/lang/Throwable;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetResult.kt */
    public static final class Failed extends PaymentSheetResult {
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
            super((f) null);
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

    private PaymentSheetResult() {
    }

    public /* synthetic */ PaymentSheetResult(f fVar) {
        this();
    }
}
