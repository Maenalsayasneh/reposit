package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001Bg\b\u0000\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b2\u00103J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0004J\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u0004J|\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0004J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010\u0004R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b*\u0010\u0004R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b+\u0010\u0004R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b,\u0010\u0004R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b-\u0010\u0004R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b.\u0010\u0004R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010(\u001a\u0004\b/\u0010\u0004R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b0\u0010\u0004R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b1\u0010\u0004¨\u00064"}, d2 = {"Lcom/stripe/android/model/WeChat;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "statementDescriptor", "appId", "nonce", "packageValue", "partnerId", "prepayId", "sign", "timestamp", "qrCodeUrl", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/WeChat;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getNonce", "getPackageValue", "getPartnerId", "getQrCodeUrl", "getSign", "getAppId", "getTimestamp", "getStatementDescriptor", "getPrepayId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: WeChat.kt */
public final class WeChat implements StripeModel {
    public static final Parcelable.Creator<WeChat> CREATOR = new Creator();
    private final String appId;
    private final String nonce;
    private final String packageValue;
    private final String partnerId;
    private final String prepayId;
    private final String qrCodeUrl;
    private final String sign;
    private final String statementDescriptor;
    private final String timestamp;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<WeChat> {
        public final WeChat createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new WeChat(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final WeChat[] newArray(int i) {
            return new WeChat[i];
        }
    }

    public WeChat(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.statementDescriptor = str;
        this.appId = str2;
        this.nonce = str3;
        this.packageValue = str4;
        this.partnerId = str5;
        this.prepayId = str6;
        this.sign = str7;
        this.timestamp = str8;
        this.qrCodeUrl = str9;
    }

    public static /* synthetic */ WeChat copy$default(WeChat weChat, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        WeChat weChat2 = weChat;
        int i2 = i;
        return weChat.copy((i2 & 1) != 0 ? weChat2.statementDescriptor : str, (i2 & 2) != 0 ? weChat2.appId : str2, (i2 & 4) != 0 ? weChat2.nonce : str3, (i2 & 8) != 0 ? weChat2.packageValue : str4, (i2 & 16) != 0 ? weChat2.partnerId : str5, (i2 & 32) != 0 ? weChat2.prepayId : str6, (i2 & 64) != 0 ? weChat2.sign : str7, (i2 & 128) != 0 ? weChat2.timestamp : str8, (i2 & 256) != 0 ? weChat2.qrCodeUrl : str9);
    }

    public final String component1() {
        return this.statementDescriptor;
    }

    public final String component2() {
        return this.appId;
    }

    public final String component3() {
        return this.nonce;
    }

    public final String component4() {
        return this.packageValue;
    }

    public final String component5() {
        return this.partnerId;
    }

    public final String component6() {
        return this.prepayId;
    }

    public final String component7() {
        return this.sign;
    }

    public final String component8() {
        return this.timestamp;
    }

    public final String component9() {
        return this.qrCodeUrl;
    }

    public final WeChat copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new WeChat(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeChat)) {
            return false;
        }
        WeChat weChat = (WeChat) obj;
        return i.a(this.statementDescriptor, weChat.statementDescriptor) && i.a(this.appId, weChat.appId) && i.a(this.nonce, weChat.nonce) && i.a(this.packageValue, weChat.packageValue) && i.a(this.partnerId, weChat.partnerId) && i.a(this.prepayId, weChat.prepayId) && i.a(this.sign, weChat.sign) && i.a(this.timestamp, weChat.timestamp) && i.a(this.qrCodeUrl, weChat.qrCodeUrl);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getPackageValue() {
        return this.packageValue;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final String getPrepayId() {
        return this.prepayId;
    }

    public final String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    public final String getSign() {
        return this.sign;
    }

    public final String getStatementDescriptor() {
        return this.statementDescriptor;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.statementDescriptor;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.appId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.nonce;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.packageValue;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.partnerId;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.prepayId;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.sign;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.timestamp;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.qrCodeUrl;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("WeChat(statementDescriptor=");
        P0.append(this.statementDescriptor);
        P0.append(", appId=");
        P0.append(this.appId);
        P0.append(", nonce=");
        P0.append(this.nonce);
        P0.append(", packageValue=");
        P0.append(this.packageValue);
        P0.append(", partnerId=");
        P0.append(this.partnerId);
        P0.append(", prepayId=");
        P0.append(this.prepayId);
        P0.append(", sign=");
        P0.append(this.sign);
        P0.append(", timestamp=");
        P0.append(this.timestamp);
        P0.append(", qrCodeUrl=");
        return a.y0(P0, this.qrCodeUrl, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.statementDescriptor);
        parcel.writeString(this.appId);
        parcel.writeString(this.nonce);
        parcel.writeString(this.packageValue);
        parcel.writeString(this.partnerId);
        parcel.writeString(this.prepayId);
        parcel.writeString(this.sign);
        parcel.writeString(this.timestamp);
        parcel.writeString(this.qrCodeUrl);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ WeChat(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, m0.n.b.f r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000a
        L_0x0009:
            r4 = r14
        L_0x000a:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0010
            r12 = r2
            goto L_0x0012
        L_0x0010:
            r12 = r22
        L_0x0012:
            r3 = r13
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.WeChat.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, m0.n.b.f):void");
    }
}
