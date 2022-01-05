package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.PaymentIntent;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0004\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0005J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0005J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001e\u0010\r\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010\nR\u001c\u0010\u000b\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\u0007R\u0016\u0010\f\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\"¨\u0006%"}, d2 = {"Lcom/stripe/android/PaymentIntentResult;", "Lcom/stripe/android/StripeIntentResult;", "Lcom/stripe/android/model/PaymentIntent;", "", "component2", "()I", "component1", "()Lcom/stripe/android/model/PaymentIntent;", "", "component3", "()Ljava/lang/String;", "intent", "outcomeFromFlow", "failureMessage", "copy", "(Lcom/stripe/android/model/PaymentIntent;ILjava/lang/String;)Lcom/stripe/android/PaymentIntentResult;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFailureMessage", "Lcom/stripe/android/model/PaymentIntent;", "getIntent", "I", "<init>", "(Lcom/stripe/android/model/PaymentIntent;ILjava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentIntentResult.kt */
public final class PaymentIntentResult extends StripeIntentResult<PaymentIntent> {
    public static final Parcelable.Creator<PaymentIntentResult> CREATOR = new Creator();
    private final String failureMessage;
    private final PaymentIntent intent;
    private final int outcomeFromFlow;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<PaymentIntentResult> {
        public final PaymentIntentResult createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new PaymentIntentResult(PaymentIntent.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
        }

        public final PaymentIntentResult[] newArray(int i) {
            return new PaymentIntentResult[i];
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentIntentResult(PaymentIntent paymentIntent, int i, String str, int i2, f fVar) {
        this(paymentIntent, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
    }

    private final int component2() {
        return this.outcomeFromFlow;
    }

    public static /* synthetic */ PaymentIntentResult copy$default(PaymentIntentResult paymentIntentResult, PaymentIntent paymentIntent, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            paymentIntent = paymentIntentResult.getIntent();
        }
        if ((i2 & 2) != 0) {
            i = paymentIntentResult.outcomeFromFlow;
        }
        if ((i2 & 4) != 0) {
            str = paymentIntentResult.getFailureMessage();
        }
        return paymentIntentResult.copy(paymentIntent, i, str);
    }

    public final PaymentIntent component1() {
        return getIntent();
    }

    public final String component3() {
        return getFailureMessage();
    }

    public final PaymentIntentResult copy(PaymentIntent paymentIntent, int i, String str) {
        i.e(paymentIntent, "intent");
        return new PaymentIntentResult(paymentIntent, i, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentIntentResult)) {
            return false;
        }
        PaymentIntentResult paymentIntentResult = (PaymentIntentResult) obj;
        return i.a(getIntent(), paymentIntentResult.getIntent()) && this.outcomeFromFlow == paymentIntentResult.outcomeFromFlow && i.a(getFailureMessage(), paymentIntentResult.getFailureMessage());
    }

    public String getFailureMessage() {
        return this.failureMessage;
    }

    public int hashCode() {
        PaymentIntent intent2 = getIntent();
        int i = 0;
        int M = a.M(this.outcomeFromFlow, (intent2 != null ? intent2.hashCode() : 0) * 31, 31);
        String failureMessage2 = getFailureMessage();
        if (failureMessage2 != null) {
            i = failureMessage2.hashCode();
        }
        return M + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PaymentIntentResult(intent=");
        P0.append(getIntent());
        P0.append(", outcomeFromFlow=");
        P0.append(this.outcomeFromFlow);
        P0.append(", failureMessage=");
        P0.append(getFailureMessage());
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        this.intent.writeToParcel(parcel, 0);
        parcel.writeInt(this.outcomeFromFlow);
        parcel.writeString(this.failureMessage);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentIntentResult(PaymentIntent paymentIntent, int i, String str) {
        super(i);
        i.e(paymentIntent, "intent");
        this.intent = paymentIntent;
        this.outcomeFromFlow = i;
        this.failureMessage = str;
    }

    public PaymentIntent getIntent() {
        return this.intent;
    }
}
