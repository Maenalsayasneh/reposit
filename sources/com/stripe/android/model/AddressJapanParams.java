package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.ObjectBuilder;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u000232B[\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b0\u00101J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\tJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\tJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\tJd\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\tJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010\tR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b*\u0010\tR\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b+\u0010\tR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010(\u001a\u0004\b,\u0010\tR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b-\u0010\tR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b.\u0010\tR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b/\u0010\t¨\u00064"}, d2 = {"Lcom/stripe/android/model/AddressJapanParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "city", "country", "line1", "line2", "postalCode", "state", "town", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/AddressJapanParams;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLine1", "getCity", "getState", "getTown", "getLine2", "getCountry", "getPostalCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "Builder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AddressJapanParams.kt */
public final class AddressJapanParams implements StripeParamsModel, Parcelable {
    public static final Parcelable.Creator<AddressJapanParams> CREATOR = new Creator();
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String PARAM_CITY = "city";
    @Deprecated
    private static final String PARAM_COUNTRY = "country";
    @Deprecated
    private static final String PARAM_LINE_1 = "line1";
    @Deprecated
    private static final String PARAM_LINE_2 = "line2";
    @Deprecated
    private static final String PARAM_POSTAL_CODE = "postal_code";
    @Deprecated
    private static final String PARAM_STATE = "state";
    @Deprecated
    private static final String PARAM_TOWN = "town";
    private final String city;
    private final String country;
    private final String line1;
    private final String line2;
    private final String postalCode;
    private final String state;
    private final String town;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0006J\u0017\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0006J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/AddressJapanParams$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/AddressJapanParams;", "", "city", "setCity", "(Ljava/lang/String;)Lcom/stripe/android/model/AddressJapanParams$Builder;", "country", "setCountry", "line1", "setLine1", "line2", "setLine2", "postalCode", "setPostalCode", "state", "setState", "town", "setTown", "build", "()Lcom/stripe/android/model/AddressJapanParams;", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AddressJapanParams.kt */
    public static final class Builder implements ObjectBuilder<AddressJapanParams> {
        private String city;
        private String country;
        private String line1;
        private String line2;
        private String postalCode;
        private String state;
        private String town;

        public final Builder setCity(String str) {
            this.city = str;
            return this;
        }

        public final Builder setCountry(String str) {
            String str2;
            if (str != null) {
                Locale locale = Locale.ROOT;
                i.d(locale, "Locale.ROOT");
                str2 = str.toUpperCase(locale);
                i.d(str2, "(this as java.lang.String).toUpperCase(locale)");
            } else {
                str2 = null;
            }
            this.country = str2;
            return this;
        }

        public final Builder setLine1(String str) {
            this.line1 = str;
            return this;
        }

        public final Builder setLine2(String str) {
            this.line2 = str;
            return this;
        }

        public final Builder setPostalCode(String str) {
            this.postalCode = str;
            return this;
        }

        public final Builder setState(String str) {
            this.state = str;
            return this;
        }

        public final Builder setTown(String str) {
            this.town = str;
            return this;
        }

        public AddressJapanParams build() {
            return new AddressJapanParams(this.city, this.country, this.line1, this.line2, this.postalCode, this.state, this.town);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/AddressJapanParams$Companion;", "", "", "PARAM_CITY", "Ljava/lang/String;", "PARAM_COUNTRY", "PARAM_LINE_1", "PARAM_LINE_2", "PARAM_POSTAL_CODE", "PARAM_STATE", "PARAM_TOWN", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AddressJapanParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<AddressJapanParams> {
        public final AddressJapanParams createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new AddressJapanParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final AddressJapanParams[] newArray(int i) {
            return new AddressJapanParams[i];
        }
    }

    public AddressJapanParams() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (f) null);
    }

    public AddressJapanParams(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.city = str;
        this.country = str2;
        this.line1 = str3;
        this.line2 = str4;
        this.postalCode = str5;
        this.state = str6;
        this.town = str7;
    }

    public static /* synthetic */ AddressJapanParams copy$default(AddressJapanParams addressJapanParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressJapanParams.city;
        }
        if ((i & 2) != 0) {
            str2 = addressJapanParams.country;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = addressJapanParams.line1;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = addressJapanParams.line2;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = addressJapanParams.postalCode;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = addressJapanParams.state;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = addressJapanParams.town;
        }
        return addressJapanParams.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.city;
    }

    public final String component2() {
        return this.country;
    }

    public final String component3() {
        return this.line1;
    }

    public final String component4() {
        return this.line2;
    }

    public final String component5() {
        return this.postalCode;
    }

    public final String component6() {
        return this.state;
    }

    public final String component7() {
        return this.town;
    }

    public final AddressJapanParams copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new AddressJapanParams(str, str2, str3, str4, str5, str6, str7);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressJapanParams)) {
            return false;
        }
        AddressJapanParams addressJapanParams = (AddressJapanParams) obj;
        return i.a(this.city, addressJapanParams.city) && i.a(this.country, addressJapanParams.country) && i.a(this.line1, addressJapanParams.line1) && i.a(this.line2, addressJapanParams.line2) && i.a(this.postalCode, addressJapanParams.postalCode) && i.a(this.state, addressJapanParams.state) && i.a(this.town, addressJapanParams.town);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getLine1() {
        return this.line1;
    }

    public final String getLine2() {
        return this.line2;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTown() {
        return this.town;
    }

    public int hashCode() {
        String str = this.city;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.country;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.line1;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.line2;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.postalCode;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.state;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.town;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode6 + i;
    }

    public Map<String, Object> toParamMap() {
        List<Pair> K = g.K(new Pair(PARAM_CITY, this.city), new Pair("country", this.country), new Pair(PARAM_LINE_1, this.line1), new Pair(PARAM_LINE_2, this.line2), new Pair(PARAM_POSTAL_CODE, this.postalCode), new Pair("state", this.state), new Pair(PARAM_TOWN, this.town));
        Map<String, Object> o = g.o();
        for (Pair pair : K) {
            String str = (String) pair.c;
            String str2 = (String) pair.d;
            Map S2 = str2 != null ? h.S2(new Pair(str, str2)) : null;
            if (S2 == null) {
                S2 = g.o();
            }
            o = g.b0(o, S2);
        }
        return o;
    }

    public String toString() {
        StringBuilder P0 = a.P0("AddressJapanParams(city=");
        P0.append(this.city);
        P0.append(", country=");
        P0.append(this.country);
        P0.append(", line1=");
        P0.append(this.line1);
        P0.append(", line2=");
        P0.append(this.line2);
        P0.append(", postalCode=");
        P0.append(this.postalCode);
        P0.append(", state=");
        P0.append(this.state);
        P0.append(", town=");
        return a.y0(P0, this.town, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.city);
        parcel.writeString(this.country);
        parcel.writeString(this.line1);
        parcel.writeString(this.line2);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.state);
        parcel.writeString(this.town);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AddressJapanParams(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, m0.n.b.f r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.AddressJapanParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, m0.n.b.f):void");
    }
}
