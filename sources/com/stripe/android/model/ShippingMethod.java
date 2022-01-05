package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import java.util.Currency;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b,\u0010-B7\b\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0001\u0010.\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b,\u0010/J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u0004JD\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010\u0004R\u0019\u0010\u000f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b'\u0010\bR\u0019\u0010\u0010\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010\u000bR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b*\u0010\u0004R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b+\u0010\u0004¨\u00060"}, d2 = {"Lcom/stripe/android/model/ShippingMethod;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "component2", "", "component3", "()J", "Ljava/util/Currency;", "component4", "()Ljava/util/Currency;", "component5", "label", "identifier", "amount", "currency", "detail", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/Currency;Ljava/lang/String;)Lcom/stripe/android/model/ShippingMethod;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIdentifier", "J", "getAmount", "Ljava/util/Currency;", "getCurrency", "getDetail", "getLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/util/Currency;Ljava/lang/String;)V", "currencyCode", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ShippingMethod.kt */
public final class ShippingMethod implements StripeModel {
    public static final Parcelable.Creator<ShippingMethod> CREATOR = new Creator();
    private final long amount;
    private final Currency currency;
    private final String detail;
    private final String identifier;
    private final String label;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<ShippingMethod> {
        public final ShippingMethod createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new ShippingMethod(parcel.readString(), parcel.readString(), parcel.readLong(), (Currency) parcel.readSerializable(), parcel.readString());
        }

        public final ShippingMethod[] newArray(int i) {
            return new ShippingMethod[i];
        }
    }

    public ShippingMethod(String str, String str2, long j, String str3) {
        this(str, str2, j, str3, (String) null, 16, (f) null);
    }

    public ShippingMethod(String str, String str2, long j, Currency currency2) {
        this(str, str2, j, currency2, (String) null, 16, (f) null);
    }

    public ShippingMethod(String str, String str2, long j, Currency currency2, String str3) {
        i.e(str, "label");
        i.e(str2, "identifier");
        i.e(currency2, "currency");
        this.label = str;
        this.identifier = str2;
        this.amount = j;
        this.currency = currency2;
        this.detail = str3;
    }

    public static /* synthetic */ ShippingMethod copy$default(ShippingMethod shippingMethod, String str, String str2, long j, Currency currency2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shippingMethod.label;
        }
        if ((i & 2) != 0) {
            str2 = shippingMethod.identifier;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            j = shippingMethod.amount;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            currency2 = shippingMethod.currency;
        }
        Currency currency3 = currency2;
        if ((i & 16) != 0) {
            str3 = shippingMethod.detail;
        }
        return shippingMethod.copy(str, str4, j2, currency3, str3);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.identifier;
    }

    public final long component3() {
        return this.amount;
    }

    public final Currency component4() {
        return this.currency;
    }

    public final String component5() {
        return this.detail;
    }

    public final ShippingMethod copy(String str, String str2, long j, Currency currency2, String str3) {
        i.e(str, "label");
        i.e(str2, "identifier");
        i.e(currency2, "currency");
        return new ShippingMethod(str, str2, j, currency2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingMethod)) {
            return false;
        }
        ShippingMethod shippingMethod = (ShippingMethod) obj;
        return i.a(this.label, shippingMethod.label) && i.a(this.identifier, shippingMethod.identifier) && this.amount == shippingMethod.amount && i.a(this.currency, shippingMethod.currency) && i.a(this.detail, shippingMethod.detail);
    }

    public final long getAmount() {
        return this.amount;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        String str = this.label;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.identifier;
        int hashCode2 = (Long.hashCode(this.amount) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        Currency currency2 = this.currency;
        int hashCode3 = (hashCode2 + (currency2 != null ? currency2.hashCode() : 0)) * 31;
        String str3 = this.detail;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ShippingMethod(label=");
        P0.append(this.label);
        P0.append(", identifier=");
        P0.append(this.identifier);
        P0.append(", amount=");
        P0.append(this.amount);
        P0.append(", currency=");
        P0.append(this.currency);
        P0.append(", detail=");
        return a.y0(P0, this.detail, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.label);
        parcel.writeString(this.identifier);
        parcel.writeLong(this.amount);
        parcel.writeSerializable(this.currency);
        parcel.writeString(this.detail);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShippingMethod(String str, String str2, long j, Currency currency2, String str3, int i, f fVar) {
        this(str, str2, j, currency2, (i & 16) != 0 ? null : str3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShippingMethod(String str, String str2, long j, String str3, String str4, int i, f fVar) {
        this(str, str2, j, str3, (i & 16) != 0 ? null : str4);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShippingMethod(java.lang.String r9, java.lang.String r10, long r11, java.lang.String r13, java.lang.String r14) {
        /*
            r8 = this;
            java.lang.String r0 = "label"
            m0.n.b.i.e(r9, r0)
            java.lang.String r0 = "identifier"
            m0.n.b.i.e(r10, r0)
            java.lang.String r0 = "currencyCode"
            m0.n.b.i.e(r13, r0)
            java.util.Currency r6 = java.util.Currency.getInstance(r13)
            java.lang.String r13 = "Currency.getInstance(currencyCode)"
            m0.n.b.i.d(r6, r13)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r7 = r14
            r1.<init>((java.lang.String) r2, (java.lang.String) r3, (long) r4, (java.util.Currency) r6, (java.lang.String) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.ShippingMethod.<init>(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String):void");
    }
}
