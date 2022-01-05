package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B[\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b;\u0010<B\u0011\b\u0010\u0012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b;\u0010?J\u0010\u0010\u0003\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0004Jf\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020!HÖ\u0001¢\u0006\u0004\b(\u0010#J \u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020!HÖ\u0001¢\u0006\u0004\b-\u0010.R\u0019\u0010\u001b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010/\u001a\u0004\b0\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010/R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u00101\u001a\u0004\b2\u0010\fR\u0019\u0010\u0017\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u00103\u001a\u0004\b4\u0010\bR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u00105\u001a\u0004\b6\u0010\u0012R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u00107\u001a\u0004\b8\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010/R\u0013\u00109\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b9\u0010\u0004R\u0019\u0010\u0016\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u00103\u001a\u0004\b:\u0010\b¨\u0006@"}, d2 = {"Lcom/stripe/android/PaymentSessionData;", "Landroid/os/Parcelable;", "", "component1", "()Z", "component2", "", "component3", "()J", "component4", "Lcom/stripe/android/model/ShippingInformation;", "component5", "()Lcom/stripe/android/model/ShippingInformation;", "Lcom/stripe/android/model/ShippingMethod;", "component6", "()Lcom/stripe/android/model/ShippingMethod;", "Lcom/stripe/android/model/PaymentMethod;", "component7", "()Lcom/stripe/android/model/PaymentMethod;", "component8", "isShippingInfoRequired", "isShippingMethodRequired", "cartTotal", "shippingTotal", "shippingInformation", "shippingMethod", "paymentMethod", "useGooglePay", "copy", "(ZZJJLcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/model/ShippingMethod;Lcom/stripe/android/model/PaymentMethod;Z)Lcom/stripe/android/PaymentSessionData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getUseGooglePay", "Lcom/stripe/android/model/ShippingInformation;", "getShippingInformation", "J", "getShippingTotal", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "Lcom/stripe/android/model/ShippingMethod;", "getShippingMethod", "isPaymentReadyToCharge", "getCartTotal", "<init>", "(ZZJJLcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/model/ShippingMethod;Lcom/stripe/android/model/PaymentMethod;Z)V", "Lcom/stripe/android/PaymentSessionConfig;", "config", "(Lcom/stripe/android/PaymentSessionConfig;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSessionData.kt */
public final class PaymentSessionData implements Parcelable {
    public static final Parcelable.Creator<PaymentSessionData> CREATOR = new Creator();
    private final long cartTotal;
    private final boolean isShippingInfoRequired;
    private final boolean isShippingMethodRequired;
    private final PaymentMethod paymentMethod;
    private final ShippingInformation shippingInformation;
    private final ShippingMethod shippingMethod;
    private final long shippingTotal;
    private final boolean useGooglePay;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<PaymentSessionData> {
        public final PaymentSessionData createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            PaymentMethod paymentMethod = null;
            ShippingInformation createFromParcel = parcel.readInt() != 0 ? ShippingInformation.CREATOR.createFromParcel(parcel) : null;
            ShippingMethod createFromParcel2 = parcel.readInt() != 0 ? ShippingMethod.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                paymentMethod = PaymentMethod.CREATOR.createFromParcel(parcel);
            }
            return new PaymentSessionData(z, z2, readLong, readLong2, createFromParcel, createFromParcel2, paymentMethod, parcel.readInt() != 0);
        }

        public final PaymentSessionData[] newArray(int i) {
            return new PaymentSessionData[i];
        }
    }

    public PaymentSessionData(boolean z, boolean z2, long j, long j2, ShippingInformation shippingInformation2, ShippingMethod shippingMethod2, PaymentMethod paymentMethod2, boolean z3) {
        this.isShippingInfoRequired = z;
        this.isShippingMethodRequired = z2;
        this.cartTotal = j;
        this.shippingTotal = j2;
        this.shippingInformation = shippingInformation2;
        this.shippingMethod = shippingMethod2;
        this.paymentMethod = paymentMethod2;
        this.useGooglePay = z3;
    }

    private final boolean component1() {
        return this.isShippingInfoRequired;
    }

    private final boolean component2() {
        return this.isShippingMethodRequired;
    }

    public static /* synthetic */ PaymentSessionData copy$default(PaymentSessionData paymentSessionData, boolean z, boolean z2, long j, long j2, ShippingInformation shippingInformation2, ShippingMethod shippingMethod2, PaymentMethod paymentMethod2, boolean z3, int i, Object obj) {
        PaymentSessionData paymentSessionData2 = paymentSessionData;
        int i2 = i;
        return paymentSessionData.copy((i2 & 1) != 0 ? paymentSessionData2.isShippingInfoRequired : z, (i2 & 2) != 0 ? paymentSessionData2.isShippingMethodRequired : z2, (i2 & 4) != 0 ? paymentSessionData2.cartTotal : j, (i2 & 8) != 0 ? paymentSessionData2.shippingTotal : j2, (i2 & 16) != 0 ? paymentSessionData2.shippingInformation : shippingInformation2, (i2 & 32) != 0 ? paymentSessionData2.shippingMethod : shippingMethod2, (i2 & 64) != 0 ? paymentSessionData2.paymentMethod : paymentMethod2, (i2 & 128) != 0 ? paymentSessionData2.useGooglePay : z3);
    }

    public final long component3() {
        return this.cartTotal;
    }

    public final long component4() {
        return this.shippingTotal;
    }

    public final ShippingInformation component5() {
        return this.shippingInformation;
    }

    public final ShippingMethod component6() {
        return this.shippingMethod;
    }

    public final PaymentMethod component7() {
        return this.paymentMethod;
    }

    public final boolean component8() {
        return this.useGooglePay;
    }

    public final PaymentSessionData copy(boolean z, boolean z2, long j, long j2, ShippingInformation shippingInformation2, ShippingMethod shippingMethod2, PaymentMethod paymentMethod2, boolean z3) {
        return new PaymentSessionData(z, z2, j, j2, shippingInformation2, shippingMethod2, paymentMethod2, z3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentSessionData)) {
            return false;
        }
        PaymentSessionData paymentSessionData = (PaymentSessionData) obj;
        return this.isShippingInfoRequired == paymentSessionData.isShippingInfoRequired && this.isShippingMethodRequired == paymentSessionData.isShippingMethodRequired && this.cartTotal == paymentSessionData.cartTotal && this.shippingTotal == paymentSessionData.shippingTotal && i.a(this.shippingInformation, paymentSessionData.shippingInformation) && i.a(this.shippingMethod, paymentSessionData.shippingMethod) && i.a(this.paymentMethod, paymentSessionData.paymentMethod) && this.useGooglePay == paymentSessionData.useGooglePay;
    }

    public final long getCartTotal() {
        return this.cartTotal;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public final ShippingInformation getShippingInformation() {
        return this.shippingInformation;
    }

    public final ShippingMethod getShippingMethod() {
        return this.shippingMethod;
    }

    public final long getShippingTotal() {
        return this.shippingTotal;
    }

    public final boolean getUseGooglePay() {
        return this.useGooglePay;
    }

    public int hashCode() {
        boolean z = this.isShippingInfoRequired;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.isShippingMethodRequired;
        if (z3) {
            z3 = true;
        }
        int hashCode = (Long.hashCode(this.shippingTotal) + ((Long.hashCode(this.cartTotal) + ((i + (z3 ? 1 : 0)) * 31)) * 31)) * 31;
        ShippingInformation shippingInformation2 = this.shippingInformation;
        int i2 = 0;
        int hashCode2 = (hashCode + (shippingInformation2 != null ? shippingInformation2.hashCode() : 0)) * 31;
        ShippingMethod shippingMethod2 = this.shippingMethod;
        int hashCode3 = (hashCode2 + (shippingMethod2 != null ? shippingMethod2.hashCode() : 0)) * 31;
        PaymentMethod paymentMethod2 = this.paymentMethod;
        if (paymentMethod2 != null) {
            i2 = paymentMethod2.hashCode();
        }
        int i3 = (hashCode3 + i2) * 31;
        boolean z4 = this.useGooglePay;
        if (!z4) {
            z2 = z4;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public final boolean isPaymentReadyToCharge() {
        return (this.paymentMethod != null || this.useGooglePay) && (!this.isShippingInfoRequired || this.shippingInformation != null) && (!this.isShippingMethodRequired || this.shippingMethod != null);
    }

    public String toString() {
        StringBuilder P0 = a.P0("PaymentSessionData(isShippingInfoRequired=");
        P0.append(this.isShippingInfoRequired);
        P0.append(", isShippingMethodRequired=");
        P0.append(this.isShippingMethodRequired);
        P0.append(", cartTotal=");
        P0.append(this.cartTotal);
        P0.append(", shippingTotal=");
        P0.append(this.shippingTotal);
        P0.append(", shippingInformation=");
        P0.append(this.shippingInformation);
        P0.append(", shippingMethod=");
        P0.append(this.shippingMethod);
        P0.append(", paymentMethod=");
        P0.append(this.paymentMethod);
        P0.append(", useGooglePay=");
        return a.D0(P0, this.useGooglePay, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeInt(this.isShippingInfoRequired ? 1 : 0);
        parcel.writeInt(this.isShippingMethodRequired ? 1 : 0);
        parcel.writeLong(this.cartTotal);
        parcel.writeLong(this.shippingTotal);
        ShippingInformation shippingInformation2 = this.shippingInformation;
        if (shippingInformation2 != null) {
            parcel.writeInt(1);
            shippingInformation2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        ShippingMethod shippingMethod2 = this.shippingMethod;
        if (shippingMethod2 != null) {
            parcel.writeInt(1);
            shippingMethod2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        PaymentMethod paymentMethod2 = this.paymentMethod;
        if (paymentMethod2 != null) {
            parcel.writeInt(1);
            paymentMethod2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.useGooglePay ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PaymentSessionData(boolean r16, boolean r17, long r18, long r20, com.stripe.android.model.ShippingInformation r22, com.stripe.android.model.ShippingMethod r23, com.stripe.android.model.PaymentMethod r24, boolean r25, int r26, m0.n.b.f r27) {
        /*
            r15 = this;
            r0 = r26
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r7 = r2
            goto L_0x000c
        L_0x000a:
            r7 = r18
        L_0x000c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0012
            r9 = r2
            goto L_0x0014
        L_0x0012:
            r9 = r20
        L_0x0014:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x001b
            r11 = r2
            goto L_0x001d
        L_0x001b:
            r11 = r22
        L_0x001d:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0023
            r12 = r2
            goto L_0x0025
        L_0x0023:
            r12 = r23
        L_0x0025:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002b
            r13 = r2
            goto L_0x002d
        L_0x002b:
            r13 = r24
        L_0x002d:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            r14 = r0
            goto L_0x0036
        L_0x0034:
            r14 = r25
        L_0x0036:
            r4 = r15
            r5 = r16
            r6 = r17
            r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.PaymentSessionData.<init>(boolean, boolean, long, long, com.stripe.android.model.ShippingInformation, com.stripe.android.model.ShippingMethod, com.stripe.android.model.PaymentMethod, boolean, int, m0.n.b.f):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PaymentSessionData(PaymentSessionConfig paymentSessionConfig) {
        this(paymentSessionConfig.isShippingInfoRequired(), paymentSessionConfig.isShippingMethodRequired(), 0, 0, (ShippingInformation) null, (ShippingMethod) null, (PaymentMethod) null, false, 252, (f) null);
        i.e(paymentSessionConfig, "config");
    }
}
