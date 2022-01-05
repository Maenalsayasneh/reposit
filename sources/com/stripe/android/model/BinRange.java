package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.cards.CardNumber;
import java.math.BigDecimal;
import kotlin.Metadata;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import m0.t.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010\nR\u0019\u0010\f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b!\u0010\n¨\u0006$"}, d2 = {"Lcom/stripe/android/model/BinRange;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "cardNumber", "", "matches$payments_core_release", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;)Z", "matches", "", "component1", "()Ljava/lang/String;", "component2", "low", "high", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/BinRange;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHigh", "getLow", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BinRange.kt */
public final class BinRange implements StripeModel {
    public static final Parcelable.Creator<BinRange> CREATOR = new Creator();
    private final String high;
    private final String low;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<BinRange> {
        public final BinRange createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new BinRange(parcel.readString(), parcel.readString());
        }

        public final BinRange[] newArray(int i) {
            return new BinRange[i];
        }
    }

    public BinRange(String str, String str2) {
        i.e(str, "low");
        i.e(str2, "high");
        this.low = str;
        this.high = str2;
    }

    public static /* synthetic */ BinRange copy$default(BinRange binRange, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = binRange.low;
        }
        if ((i & 2) != 0) {
            str2 = binRange.high;
        }
        return binRange.copy(str, str2);
    }

    public final String component1() {
        return this.low;
    }

    public final String component2() {
        return this.high;
    }

    public final BinRange copy(String str, String str2) {
        i.e(str, "low");
        i.e(str2, "high");
        return new BinRange(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BinRange)) {
            return false;
        }
        BinRange binRange = (BinRange) obj;
        return i.a(this.low, binRange.low) && i.a(this.high, binRange.high);
    }

    public final String getHigh() {
        return this.high;
    }

    public final String getLow() {
        return this.low;
    }

    public int hashCode() {
        String str = this.low;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.high;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final boolean matches$payments_core_release(CardNumber.Unvalidated unvalidated) {
        i.e(unvalidated, "cardNumber");
        String normalized = unvalidated.getNormalized();
        i.e(normalized, "$this$toBigDecimalOrNull");
        BigDecimal bigDecimal = null;
        try {
            if (d.a.a(normalized)) {
                bigDecimal = new BigDecimal(normalized);
            }
        } catch (NumberFormatException unused) {
        }
        if (bigDecimal == null) {
            return false;
        }
        boolean z = normalized.length() >= this.low.length() ? new BigDecimal(a.S3(normalized, this.low.length())).compareTo(new BigDecimal(this.low)) >= 0 : bigDecimal.compareTo(new BigDecimal(a.S3(this.low, normalized.length()))) >= 0;
        boolean z2 = normalized.length() >= this.high.length() ? new BigDecimal(a.S3(normalized, this.high.length())).compareTo(new BigDecimal(this.high)) <= 0 : bigDecimal.compareTo(new BigDecimal(a.S3(this.high, normalized.length()))) <= 0;
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("BinRange(low=");
        P0.append(this.low);
        P0.append(", high=");
        return i0.d.a.a.a.y0(P0, this.high, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.low);
        parcel.writeString(this.high);
    }
}
