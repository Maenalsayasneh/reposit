package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0004J\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0004J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/AlipayAuthResult;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()I", "outcome", "copy", "(I)Lcom/stripe/android/model/AlipayAuthResult;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getOutcome", "<init>", "(I)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AlipayAuthResult.kt */
public final class AlipayAuthResult implements StripeModel {
    public static final Parcelable.Creator<AlipayAuthResult> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    public static final String RESULT_CODE_CANCELLED = "6001";
    public static final String RESULT_CODE_FAILED = "4000";
    public static final String RESULT_CODE_SUCCESS = "9000";
    private final int outcome;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/AlipayAuthResult$Companion;", "", "", "RESULT_CODE_CANCELLED", "Ljava/lang/String;", "RESULT_CODE_FAILED", "RESULT_CODE_SUCCESS", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AlipayAuthResult.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<AlipayAuthResult> {
        public final AlipayAuthResult createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new AlipayAuthResult(parcel.readInt());
        }

        public final AlipayAuthResult[] newArray(int i) {
            return new AlipayAuthResult[i];
        }
    }

    public AlipayAuthResult(int i) {
        this.outcome = i;
    }

    public static /* synthetic */ AlipayAuthResult copy$default(AlipayAuthResult alipayAuthResult, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = alipayAuthResult.outcome;
        }
        return alipayAuthResult.copy(i);
    }

    public final int component1() {
        return this.outcome;
    }

    public final AlipayAuthResult copy(int i) {
        return new AlipayAuthResult(i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AlipayAuthResult) && this.outcome == ((AlipayAuthResult) obj).outcome;
        }
        return true;
    }

    public final int getOutcome() {
        return this.outcome;
    }

    public int hashCode() {
        return Integer.hashCode(this.outcome);
    }

    public String toString() {
        return a.u0(a.P0("AlipayAuthResult(outcome="), this.outcome, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeInt(this.outcome);
    }
}
