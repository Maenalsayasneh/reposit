package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u0005¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/PaymentMethodsList;", "Lcom/stripe/android/model/StripeModel;", "", "Lcom/stripe/android/model/PaymentMethod;", "component1", "()Ljava/util/List;", "paymentMethods", "copy", "(Ljava/util/List;)Lcom/stripe/android/model/PaymentMethodsList;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getPaymentMethods", "<init>", "(Ljava/util/List;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentMethodsList.kt */
public final class PaymentMethodsList implements StripeModel {
    public static final Parcelable.Creator<PaymentMethodsList> CREATOR = new Creator();
    private final List<PaymentMethod> paymentMethods;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<PaymentMethodsList> {
        public final PaymentMethodsList createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(PaymentMethod.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new PaymentMethodsList(arrayList);
        }

        public final PaymentMethodsList[] newArray(int i) {
            return new PaymentMethodsList[i];
        }
    }

    public PaymentMethodsList(List<PaymentMethod> list) {
        i.e(list, "paymentMethods");
        this.paymentMethods = list;
    }

    public static /* synthetic */ PaymentMethodsList copy$default(PaymentMethodsList paymentMethodsList, List<PaymentMethod> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = paymentMethodsList.paymentMethods;
        }
        return paymentMethodsList.copy(list);
    }

    public final List<PaymentMethod> component1() {
        return this.paymentMethods;
    }

    public final PaymentMethodsList copy(List<PaymentMethod> list) {
        i.e(list, "paymentMethods");
        return new PaymentMethodsList(list);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PaymentMethodsList) && i.a(this.paymentMethods, ((PaymentMethodsList) obj).paymentMethods);
        }
        return true;
    }

    public final List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    public int hashCode() {
        List<PaymentMethod> list = this.paymentMethods;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PaymentMethodsList(paymentMethods=");
        P0.append(this.paymentMethods);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        List<PaymentMethod> list = this.paymentMethods;
        parcel.writeInt(list.size());
        for (PaymentMethod writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
    }
}
