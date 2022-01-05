package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/IssuingCardPin;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "pin", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/IssuingCardPin;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPin", "<init>", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: IssuingCardPin.kt */
public final class IssuingCardPin implements StripeModel {
    public static final Parcelable.Creator<IssuingCardPin> CREATOR = new Creator();
    private final String pin;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<IssuingCardPin> {
        public final IssuingCardPin createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new IssuingCardPin(parcel.readString());
        }

        public final IssuingCardPin[] newArray(int i) {
            return new IssuingCardPin[i];
        }
    }

    public IssuingCardPin(String str) {
        i.e(str, "pin");
        this.pin = str;
    }

    public static /* synthetic */ IssuingCardPin copy$default(IssuingCardPin issuingCardPin, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = issuingCardPin.pin;
        }
        return issuingCardPin.copy(str);
    }

    public final String component1() {
        return this.pin;
    }

    public final IssuingCardPin copy(String str) {
        i.e(str, "pin");
        return new IssuingCardPin(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof IssuingCardPin) && i.a(this.pin, ((IssuingCardPin) obj).pin);
        }
        return true;
    }

    public final String getPin() {
        return this.pin;
    }

    public int hashCode() {
        String str = this.pin;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return a.y0(a.P0("IssuingCardPin(pin="), this.pin, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.pin);
    }
}
