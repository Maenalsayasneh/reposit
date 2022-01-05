package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.model.parsers.AddressJsonParser;
import i0.d.a.a.a;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u0000 32\u00020\u00012\u00020\u0002:\u000243BQ\b\u0000\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b1\u00102J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\tJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\tJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJX\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\tJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b'\u0010\tR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b(\u0010\tR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b)\u0010\tR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b*\u0010\tR\u0018\u0010.\u001a\u0004\u0018\u00010+8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b/\u0010\tR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b0\u0010\t¨\u00065"}, d2 = {"Lcom/stripe/android/model/Address;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/StripeParamsModel;", "", "", "", "toParamMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "city", "country", "line1", "line2", "postalCode", "state", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Address;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getState", "getPostalCode", "getCountry", "getLine2", "Lcom/stripe/android/model/CountryCode;", "getCountryCode$payments_core_release", "()Lcom/stripe/android/model/CountryCode;", "countryCode", "getLine1", "getCity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "Builder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Address.kt */
public final class Address implements StripeModel, StripeParamsModel {
    public static final Parcelable.Creator<Address> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    private static final String PARAM_CITY = "city";
    private static final String PARAM_COUNTRY = "country";
    private static final String PARAM_LINE_1 = "line1";
    private static final String PARAM_LINE_2 = "line2";
    private static final String PARAM_POSTAL_CODE = "postal_code";
    private static final String PARAM_STATE = "state";
    private final String city;
    private final String country;
    private final String line1;
    private final String line2;
    private final String postalCode;
    private final String state;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\r\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0006J\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0006J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0006J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0018R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/Address$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/Address;", "", "city", "setCity", "(Ljava/lang/String;)Lcom/stripe/android/model/Address$Builder;", "country", "setCountry", "Lcom/stripe/android/model/CountryCode;", "countryCode", "setCountryCode$payments_core_release", "(Lcom/stripe/android/model/CountryCode;)Lcom/stripe/android/model/Address$Builder;", "setCountryCode", "line1", "setLine1", "line2", "setLine2", "postalCode", "setPostalCode", "state", "setState", "build", "()Lcom/stripe/android/model/Address;", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Address.kt */
    public static final class Builder implements ObjectBuilder<Address> {
        private String city;
        private String country;
        private String line1;
        private String line2;
        private String postalCode;
        private String state;

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

        public final Builder setCountryCode$payments_core_release(CountryCode countryCode) {
            this.country = countryCode != null ? countryCode.getValue() : null;
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

        public Address build() {
            return new Address(this.city, this.country, this.line1, this.line2, this.postalCode, this.state);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00078\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/Address$Companion;", "", "Lorg/json/JSONObject;", "jsonObject", "Lcom/stripe/android/model/Address;", "fromJson", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Address;", "", "PARAM_CITY", "Ljava/lang/String;", "PARAM_COUNTRY", "PARAM_LINE_1", "PARAM_LINE_2", "PARAM_POSTAL_CODE", "PARAM_STATE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Address.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Address fromJson(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new AddressJsonParser().parse(jSONObject);
            }
            return null;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<Address> {
        public final Address createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new Address(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Address[] newArray(int i) {
            return new Address[i];
        }
    }

    public Address() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (f) null);
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6) {
        this.city = str;
        this.country = str2;
        this.line1 = str3;
        this.line2 = str4;
        this.postalCode = str5;
        this.state = str6;
    }

    public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = address.city;
        }
        if ((i & 2) != 0) {
            str2 = address.country;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = address.line1;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = address.line2;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = address.postalCode;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = address.state;
        }
        return address.copy(str, str7, str8, str9, str10, str6);
    }

    public static final Address fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
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

    public final Address copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new Address(str, str2, str3, str4, str5, str6);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return i.a(this.city, address.city) && i.a(this.country, address.country) && i.a(this.line1, address.line1) && i.a(this.line2, address.line2) && i.a(this.postalCode, address.postalCode) && i.a(this.state, address.state);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final CountryCode getCountryCode$payments_core_release() {
        String str = this.country;
        if (str == null) {
            return null;
        }
        if (StringsKt__IndentKt.o(str)) {
            str = null;
        }
        if (str != null) {
            return CountryCode.Companion.create(str);
        }
        return null;
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
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public Map<String, Object> toParamMap() {
        Pair[] pairArr = new Pair[6];
        String str = this.city;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        pairArr[0] = new Pair(PARAM_CITY, str);
        String str3 = this.country;
        if (str3 == null) {
            str3 = str2;
        }
        pairArr[1] = new Pair("country", str3);
        String str4 = this.line1;
        if (str4 == null) {
            str4 = str2;
        }
        pairArr[2] = new Pair(PARAM_LINE_1, str4);
        String str5 = this.line2;
        if (str5 == null) {
            str5 = str2;
        }
        pairArr[3] = new Pair(PARAM_LINE_2, str5);
        String str6 = this.postalCode;
        if (str6 == null) {
            str6 = str2;
        }
        pairArr[4] = new Pair(PARAM_POSTAL_CODE, str6);
        String str7 = this.state;
        if (str7 != null) {
            str2 = str7;
        }
        pairArr[5] = new Pair("state", str2);
        Map N = g.N(pairArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : N.entrySet()) {
            if (((String) entry.getValue()).length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        StringBuilder P0 = a.P0("Address(city=");
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
        return a.y0(P0, this.state, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.city);
        parcel.writeString(this.country);
        parcel.writeString(this.line1);
        parcel.writeString(this.line2);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.state);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Address(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, m0.n.b.f r13) {
        /*
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r13 = r0
            goto L_0x0008
        L_0x0007:
            r13 = r6
        L_0x0008:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r7
        L_0x000f:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r8
        L_0x0016:
            r6 = r12 & 8
            if (r6 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r9
        L_0x001d:
            r6 = r12 & 16
            if (r6 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            r6 = r12 & 32
            if (r6 == 0) goto L_0x002a
            r12 = r0
            goto L_0x002b
        L_0x002a:
            r12 = r11
        L_0x002b:
            r6 = r5
            r7 = r13
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.Address.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, m0.n.b.f):void");
    }
}
