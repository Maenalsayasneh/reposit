package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeModel;
import i0.d.a.a.a;
import java.io.Serializable;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u00012\u00020\u0002B]\b\u0000\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0005J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\b\u0010\u0005J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u0005J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0005Jd\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010\u0005R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b'\u0010\u0005R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b(\u0010\u0005R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b)\u0010\u0005R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b*\u0010\u0005R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b+\u0010\u0005R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b,\u0010\u0005¨\u0006/"}, d2 = {"Lcom/stripe/android/StripeError;", "Lcom/stripe/android/model/StripeModel;", "Ljava/io/Serializable;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "type", "message", "code", "param", "declineCode", "charge", "docUrl", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/StripeError;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMessage", "getCode", "getDocUrl", "getType", "getParam", "getDeclineCode", "getCharge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeError.kt */
public final class StripeError implements StripeModel, Serializable {
    public static final Parcelable.Creator<StripeError> CREATOR = new Creator();
    private final String charge;
    private final String code;
    private final String declineCode;
    private final String docUrl;
    private final String message;
    private final String param;
    private final String type;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<StripeError> {
        public final StripeError createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new StripeError(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final StripeError[] newArray(int i) {
            return new StripeError[i];
        }
    }

    public StripeError() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (f) null);
    }

    public StripeError(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.type = str;
        this.message = str2;
        this.code = str3;
        this.param = str4;
        this.declineCode = str5;
        this.charge = str6;
        this.docUrl = str7;
    }

    public static /* synthetic */ StripeError copy$default(StripeError stripeError, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stripeError.type;
        }
        if ((i & 2) != 0) {
            str2 = stripeError.message;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = stripeError.code;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = stripeError.param;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = stripeError.declineCode;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = stripeError.charge;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = stripeError.docUrl;
        }
        return stripeError.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.code;
    }

    public final String component4() {
        return this.param;
    }

    public final String component5() {
        return this.declineCode;
    }

    public final String component6() {
        return this.charge;
    }

    public final String component7() {
        return this.docUrl;
    }

    public final StripeError copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        return new StripeError(str, str2, str3, str4, str5, str6, str7);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StripeError)) {
            return false;
        }
        StripeError stripeError = (StripeError) obj;
        return i.a(this.type, stripeError.type) && i.a(this.message, stripeError.message) && i.a(this.code, stripeError.code) && i.a(this.param, stripeError.param) && i.a(this.declineCode, stripeError.declineCode) && i.a(this.charge, stripeError.charge) && i.a(this.docUrl, stripeError.docUrl);
    }

    public final String getCharge() {
        return this.charge;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDeclineCode() {
        return this.declineCode;
    }

    public final String getDocUrl() {
        return this.docUrl;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getParam() {
        return this.param;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.code;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.param;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.declineCode;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.charge;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.docUrl;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("StripeError(type=");
        P0.append(this.type);
        P0.append(", message=");
        P0.append(this.message);
        P0.append(", code=");
        P0.append(this.code);
        P0.append(", param=");
        P0.append(this.param);
        P0.append(", declineCode=");
        P0.append(this.declineCode);
        P0.append(", charge=");
        P0.append(this.charge);
        P0.append(", docUrl=");
        return a.y0(P0, this.docUrl, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.type);
        parcel.writeString(this.message);
        parcel.writeString(this.code);
        parcel.writeString(this.param);
        parcel.writeString(this.declineCode);
        parcel.writeString(this.charge);
        parcel.writeString(this.docUrl);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StripeError(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, m0.n.b.f r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripeError.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, m0.n.b.f):void");
    }
}
