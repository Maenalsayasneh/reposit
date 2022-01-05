package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001:\u00010B-\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\rJ\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0007J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0007J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b \u0010!R\u0013\u0010%\u001a\u00020\"8F@\u0006¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0019\u0010\u0010\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010\nR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b)\u0010\rR\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b+\u0010\u0004R\u0019\u0010\u000f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010\u0007¨\u00061"}, d2 = {"Lcom/stripe/android/model/AccountRange;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/BinRange;", "component1", "()Lcom/stripe/android/model/BinRange;", "", "component2", "()I", "Lcom/stripe/android/model/AccountRange$BrandInfo;", "component3", "()Lcom/stripe/android/model/AccountRange$BrandInfo;", "", "component4", "()Ljava/lang/String;", "binRange", "panLength", "brandInfo", "country", "copy", "(Lcom/stripe/android/model/BinRange;ILcom/stripe/android/model/AccountRange$BrandInfo;Ljava/lang/String;)Lcom/stripe/android/model/AccountRange;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/CardBrand;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "brand", "Lcom/stripe/android/model/AccountRange$BrandInfo;", "getBrandInfo", "Ljava/lang/String;", "getCountry", "Lcom/stripe/android/model/BinRange;", "getBinRange", "I", "getPanLength", "<init>", "(Lcom/stripe/android/model/BinRange;ILcom/stripe/android/model/AccountRange$BrandInfo;Ljava/lang/String;)V", "BrandInfo", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AccountRange.kt */
public final class AccountRange implements StripeModel {
    public static final Parcelable.Creator<AccountRange> CREATOR = new Creator();
    private final BinRange binRange;
    private final BrandInfo brandInfo;
    private final String country;
    private final int panLength;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/model/AccountRange$BrandInfo;", "", "", "brandName", "Ljava/lang/String;", "getBrandName", "()Ljava/lang/String;", "Lcom/stripe/android/model/CardBrand;", "brand", "Lcom/stripe/android/model/CardBrand;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/model/CardBrand;)V", "Visa", "Mastercard", "AmericanExpress", "JCB", "DinersClub", "Discover", "UnionPay", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AccountRange.kt */
    public enum BrandInfo {
        Visa("VISA", CardBrand.Visa),
        Mastercard("MASTERCARD", CardBrand.MasterCard),
        AmericanExpress("AMERICAN_EXPRESS", CardBrand.AmericanExpress),
        JCB("JCB", CardBrand.JCB),
        DinersClub("DINERS_CLUB", CardBrand.DinersClub),
        Discover("DISCOVER", CardBrand.Discover),
        UnionPay("UNIONPAY", CardBrand.UnionPay);
        
        private final CardBrand brand;
        private final String brandName;

        private BrandInfo(String str, CardBrand cardBrand) {
            this.brandName = str;
            this.brand = cardBrand;
        }

        public final CardBrand getBrand() {
            return this.brand;
        }

        public final String getBrandName() {
            return this.brandName;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<AccountRange> {
        public final AccountRange createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new AccountRange(BinRange.CREATOR.createFromParcel(parcel), parcel.readInt(), (BrandInfo) Enum.valueOf(BrandInfo.class, parcel.readString()), parcel.readString());
        }

        public final AccountRange[] newArray(int i) {
            return new AccountRange[i];
        }
    }

    public AccountRange(BinRange binRange2, int i, BrandInfo brandInfo2, String str) {
        i.e(binRange2, "binRange");
        i.e(brandInfo2, "brandInfo");
        this.binRange = binRange2;
        this.panLength = i;
        this.brandInfo = brandInfo2;
        this.country = str;
    }

    public static /* synthetic */ AccountRange copy$default(AccountRange accountRange, BinRange binRange2, int i, BrandInfo brandInfo2, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            binRange2 = accountRange.binRange;
        }
        if ((i2 & 2) != 0) {
            i = accountRange.panLength;
        }
        if ((i2 & 4) != 0) {
            brandInfo2 = accountRange.brandInfo;
        }
        if ((i2 & 8) != 0) {
            str = accountRange.country;
        }
        return accountRange.copy(binRange2, i, brandInfo2, str);
    }

    public final BinRange component1() {
        return this.binRange;
    }

    public final int component2() {
        return this.panLength;
    }

    public final BrandInfo component3() {
        return this.brandInfo;
    }

    public final String component4() {
        return this.country;
    }

    public final AccountRange copy(BinRange binRange2, int i, BrandInfo brandInfo2, String str) {
        i.e(binRange2, "binRange");
        i.e(brandInfo2, "brandInfo");
        return new AccountRange(binRange2, i, brandInfo2, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountRange)) {
            return false;
        }
        AccountRange accountRange = (AccountRange) obj;
        return i.a(this.binRange, accountRange.binRange) && this.panLength == accountRange.panLength && i.a(this.brandInfo, accountRange.brandInfo) && i.a(this.country, accountRange.country);
    }

    public final BinRange getBinRange() {
        return this.binRange;
    }

    public final CardBrand getBrand() {
        return this.brandInfo.getBrand();
    }

    public final BrandInfo getBrandInfo() {
        return this.brandInfo;
    }

    public final String getCountry() {
        return this.country;
    }

    public final int getPanLength() {
        return this.panLength;
    }

    public int hashCode() {
        BinRange binRange2 = this.binRange;
        int i = 0;
        int M = a.M(this.panLength, (binRange2 != null ? binRange2.hashCode() : 0) * 31, 31);
        BrandInfo brandInfo2 = this.brandInfo;
        int hashCode = (M + (brandInfo2 != null ? brandInfo2.hashCode() : 0)) * 31;
        String str = this.country;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("AccountRange(binRange=");
        P0.append(this.binRange);
        P0.append(", panLength=");
        P0.append(this.panLength);
        P0.append(", brandInfo=");
        P0.append(this.brandInfo);
        P0.append(", country=");
        return a.y0(P0, this.country, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        this.binRange.writeToParcel(parcel, 0);
        parcel.writeInt(this.panLength);
        parcel.writeString(this.brandInfo.name());
        parcel.writeString(this.country);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountRange(BinRange binRange2, int i, BrandInfo brandInfo2, String str, int i2, f fVar) {
        this(binRange2, i, brandInfo2, (i2 & 8) != 0 ? null : str);
    }
}
