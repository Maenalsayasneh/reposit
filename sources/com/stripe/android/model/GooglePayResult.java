package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.parsers.TokenJsonParser;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\b\u0018\u0000 42\u00020\u0001:\u00014BQ\b\u0000\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b2\u00103J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJX\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010\u0004R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010\nR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010*\u001a\u0004\b,\u0010\nR\u001b\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010*\u001a\u0004\b-\u0010\nR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u0010\u0007R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b1\u0010\u000f¨\u00065"}, d2 = {"Lcom/stripe/android/model/GooglePayResult;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/Token;", "component1", "()Lcom/stripe/android/model/Token;", "Lcom/stripe/android/model/Address;", "component2", "()Lcom/stripe/android/model/Address;", "", "component3", "()Ljava/lang/String;", "component4", "component5", "Lcom/stripe/android/model/ShippingInformation;", "component6", "()Lcom/stripe/android/model/ShippingInformation;", "token", "address", "name", "email", "phoneNumber", "shippingInformation", "copy", "(Lcom/stripe/android/model/Token;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ShippingInformation;)Lcom/stripe/android/model/GooglePayResult;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/Token;", "getToken", "Ljava/lang/String;", "getEmail", "getName", "getPhoneNumber", "Lcom/stripe/android/model/Address;", "getAddress", "Lcom/stripe/android/model/ShippingInformation;", "getShippingInformation", "<init>", "(Lcom/stripe/android/model/Token;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ShippingInformation;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: GooglePayResult.kt */
public final class GooglePayResult implements Parcelable {
    public static final Parcelable.Creator<GooglePayResult> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    private final Address address;
    private final String email;
    private final String name;
    private final String phoneNumber;
    private final ShippingInformation shippingInformation;
    private final Token token;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/GooglePayResult$Companion;", "", "Lorg/json/JSONObject;", "paymentDataJson", "Lcom/stripe/android/model/ShippingInformation;", "createShippingInformation", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/ShippingInformation;", "Lcom/stripe/android/model/GooglePayResult;", "fromJson", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/GooglePayResult;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: GooglePayResult.kt */
    public static final class Companion {
        private Companion() {
        }

        private final ShippingInformation createShippingInformation(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("shippingAddress");
            if (optJSONObject == null) {
                return null;
            }
            String optString = StripeJsonUtils.optString(optJSONObject, "address1");
            String optString2 = StripeJsonUtils.optString(optJSONObject, "address2");
            String optString3 = StripeJsonUtils.optString(optJSONObject, "postalCode");
            return new ShippingInformation(new Address(StripeJsonUtils.optString(optJSONObject, "locality"), StripeJsonUtils.optString(optJSONObject, "countryCode"), optString, optString2, optString3, StripeJsonUtils.optString(optJSONObject, "administrativeArea")), StripeJsonUtils.optString(optJSONObject, "name"), StripeJsonUtils.optString(optJSONObject, "phoneNumber"));
        }

        public final GooglePayResult fromJson(JSONObject jSONObject) throws JSONException {
            Address address;
            i.e(jSONObject, "paymentDataJson");
            JSONObject jSONObject2 = jSONObject.getJSONObject("paymentMethodData");
            Token parse = new TokenJsonParser().parse(new JSONObject(jSONObject2.getJSONObject("tokenizationData").getString("token")));
            JSONObject optJSONObject = jSONObject2.getJSONObject("info").optJSONObject("billingAddress");
            if (optJSONObject != null) {
                address = new Address(StripeJsonUtils.optString(optJSONObject, "locality"), StripeJsonUtils.optString(optJSONObject, "countryCode"), StripeJsonUtils.optString(optJSONObject, "address1"), StripeJsonUtils.optString(optJSONObject, "address2"), StripeJsonUtils.optString(optJSONObject, "postalCode"), StripeJsonUtils.optString(optJSONObject, "administrativeArea"));
            } else {
                address = null;
            }
            return new GooglePayResult(parse, address, StripeJsonUtils.optString(optJSONObject, "name"), StripeJsonUtils.optString(jSONObject, "email"), StripeJsonUtils.optString(optJSONObject, "phoneNumber"), createShippingInformation(jSONObject));
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<GooglePayResult> {
        public final GooglePayResult createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new GooglePayResult(parcel.readInt() != 0 ? Token.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? ShippingInformation.CREATOR.createFromParcel(parcel) : null);
        }

        public final GooglePayResult[] newArray(int i) {
            return new GooglePayResult[i];
        }
    }

    public GooglePayResult() {
        this((Token) null, (Address) null, (String) null, (String) null, (String) null, (ShippingInformation) null, 63, (f) null);
    }

    public GooglePayResult(Token token2, Address address2, String str, String str2, String str3, ShippingInformation shippingInformation2) {
        this.token = token2;
        this.address = address2;
        this.name = str;
        this.email = str2;
        this.phoneNumber = str3;
        this.shippingInformation = shippingInformation2;
    }

    public static /* synthetic */ GooglePayResult copy$default(GooglePayResult googlePayResult, Token token2, Address address2, String str, String str2, String str3, ShippingInformation shippingInformation2, int i, Object obj) {
        if ((i & 1) != 0) {
            token2 = googlePayResult.token;
        }
        if ((i & 2) != 0) {
            address2 = googlePayResult.address;
        }
        Address address3 = address2;
        if ((i & 4) != 0) {
            str = googlePayResult.name;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = googlePayResult.email;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = googlePayResult.phoneNumber;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            shippingInformation2 = googlePayResult.shippingInformation;
        }
        return googlePayResult.copy(token2, address3, str4, str5, str6, shippingInformation2);
    }

    public static final GooglePayResult fromJson(JSONObject jSONObject) throws JSONException {
        return Companion.fromJson(jSONObject);
    }

    public final Token component1() {
        return this.token;
    }

    public final Address component2() {
        return this.address;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.email;
    }

    public final String component5() {
        return this.phoneNumber;
    }

    public final ShippingInformation component6() {
        return this.shippingInformation;
    }

    public final GooglePayResult copy(Token token2, Address address2, String str, String str2, String str3, ShippingInformation shippingInformation2) {
        return new GooglePayResult(token2, address2, str, str2, str3, shippingInformation2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GooglePayResult)) {
            return false;
        }
        GooglePayResult googlePayResult = (GooglePayResult) obj;
        return i.a(this.token, googlePayResult.token) && i.a(this.address, googlePayResult.address) && i.a(this.name, googlePayResult.name) && i.a(this.email, googlePayResult.email) && i.a(this.phoneNumber, googlePayResult.phoneNumber) && i.a(this.shippingInformation, googlePayResult.shippingInformation);
    }

    public final Address getAddress() {
        return this.address;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final ShippingInformation getShippingInformation() {
        return this.shippingInformation;
    }

    public final Token getToken() {
        return this.token;
    }

    public int hashCode() {
        Token token2 = this.token;
        int i = 0;
        int hashCode = (token2 != null ? token2.hashCode() : 0) * 31;
        Address address2 = this.address;
        int hashCode2 = (hashCode + (address2 != null ? address2.hashCode() : 0)) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.email;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.phoneNumber;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ShippingInformation shippingInformation2 = this.shippingInformation;
        if (shippingInformation2 != null) {
            i = shippingInformation2.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("GooglePayResult(token=");
        P0.append(this.token);
        P0.append(", address=");
        P0.append(this.address);
        P0.append(", name=");
        P0.append(this.name);
        P0.append(", email=");
        P0.append(this.email);
        P0.append(", phoneNumber=");
        P0.append(this.phoneNumber);
        P0.append(", shippingInformation=");
        P0.append(this.shippingInformation);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        Token token2 = this.token;
        if (token2 != null) {
            parcel.writeInt(1);
            token2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Address address2 = this.address;
        if (address2 != null) {
            parcel.writeInt(1);
            address2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.email);
        parcel.writeString(this.phoneNumber);
        ShippingInformation shippingInformation2 = this.shippingInformation;
        if (shippingInformation2 != null) {
            parcel.writeInt(1);
            shippingInformation2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GooglePayResult(com.stripe.android.model.Token r6, com.stripe.android.model.Address r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, com.stripe.android.model.ShippingInformation r11, int r12, m0.n.b.f r13) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.GooglePayResult.<init>(com.stripe.android.model.Token, com.stripe.android.model.Address, java.lang.String, java.lang.String, java.lang.String, com.stripe.android.model.ShippingInformation, int, m0.n.b.f):void");
    }
}
