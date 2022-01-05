package com.clubhouse.android.ui.payments;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.payment.RecentPayment;
import m0.n.b.i;

/* compiled from: AcknowledgePaymentFragment.kt */
public final class AcknowledgePaymentArgs implements Parcelable {
    public static final Parcelable.Creator<AcknowledgePaymentArgs> CREATOR = new a();
    public final RecentPayment c;

    /* compiled from: AcknowledgePaymentFragment.kt */
    public static final class a implements Parcelable.Creator<AcknowledgePaymentArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new AcknowledgePaymentArgs((RecentPayment) parcel.readParcelable(AcknowledgePaymentArgs.class.getClassLoader()));
        }

        public Object[] newArray(int i) {
            return new AcknowledgePaymentArgs[i];
        }
    }

    public AcknowledgePaymentArgs(RecentPayment recentPayment) {
        i.e(recentPayment, "recentPayment");
        this.c = recentPayment;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AcknowledgePaymentArgs) && i.a(this.c, ((AcknowledgePaymentArgs) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("AcknowledgePaymentArgs(recentPayment=");
        P0.append(this.c);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeParcelable(this.c, i);
    }
}
