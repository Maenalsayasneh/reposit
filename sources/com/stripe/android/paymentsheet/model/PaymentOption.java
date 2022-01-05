package com.stripe.android.paymentsheet.model;

import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0004J\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentOption;", "", "", "component1", "()I", "", "component2", "()Ljava/lang/String;", "drawableResourceId", "label", "copy", "(ILjava/lang/String;)Lcom/stripe/android/paymentsheet/model/PaymentOption;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getDrawableResourceId", "Ljava/lang/String;", "getLabel", "<init>", "(ILjava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentOption.kt */
public final class PaymentOption {
    private final int drawableResourceId;
    private final String label;

    public PaymentOption(int i, String str) {
        i.e(str, "label");
        this.drawableResourceId = i;
        this.label = str;
    }

    public static /* synthetic */ PaymentOption copy$default(PaymentOption paymentOption, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = paymentOption.drawableResourceId;
        }
        if ((i2 & 2) != 0) {
            str = paymentOption.label;
        }
        return paymentOption.copy(i, str);
    }

    public final int component1() {
        return this.drawableResourceId;
    }

    public final String component2() {
        return this.label;
    }

    public final PaymentOption copy(int i, String str) {
        i.e(str, "label");
        return new PaymentOption(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentOption)) {
            return false;
        }
        PaymentOption paymentOption = (PaymentOption) obj;
        return this.drawableResourceId == paymentOption.drawableResourceId && i.a(this.label, paymentOption.label);
    }

    public final int getDrawableResourceId() {
        return this.drawableResourceId;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.drawableResourceId) * 31;
        String str = this.label;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("PaymentOption(drawableResourceId=");
        P0.append(this.drawableResourceId);
        P0.append(", label=");
        return a.y0(P0, this.label, ")");
    }
}
