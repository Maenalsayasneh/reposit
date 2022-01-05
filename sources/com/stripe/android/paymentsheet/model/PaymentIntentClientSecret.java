package com.stripe.android.paymentsheet.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentIntentClientSecret;", "Lcom/stripe/android/paymentsheet/model/ClientSecret;", "", "component1", "()Ljava/lang/String;", "value", "copy", "(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/model/PaymentIntentClientSecret;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "<init>", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ClientSecret.kt */
public final class PaymentIntentClientSecret extends ClientSecret {
    public static final Parcelable.Creator<PaymentIntentClientSecret> CREATOR = new Creator();
    private final String value;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<PaymentIntentClientSecret> {
        public final PaymentIntentClientSecret createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new PaymentIntentClientSecret(parcel.readString());
        }

        public final PaymentIntentClientSecret[] newArray(int i) {
            return new PaymentIntentClientSecret[i];
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentIntentClientSecret(String str) {
        super((f) null);
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.value = str;
    }

    public static /* synthetic */ PaymentIntentClientSecret copy$default(PaymentIntentClientSecret paymentIntentClientSecret, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentIntentClientSecret.getValue();
        }
        return paymentIntentClientSecret.copy(str);
    }

    public final String component1() {
        return getValue();
    }

    public final PaymentIntentClientSecret copy(String str) {
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        return new PaymentIntentClientSecret(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PaymentIntentClientSecret) && i.a(getValue(), ((PaymentIntentClientSecret) obj).getValue());
        }
        return true;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        String value2 = getValue();
        if (value2 != null) {
            return value2.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PaymentIntentClientSecret(value=");
        P0.append(getValue());
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.value);
    }
}
