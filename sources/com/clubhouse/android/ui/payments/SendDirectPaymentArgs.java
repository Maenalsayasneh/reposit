package com.clubhouse.android.ui.payments;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.user.UserProfile;
import m0.n.b.i;

/* compiled from: SendDirectPaymentFragment.kt */
public final class SendDirectPaymentArgs implements Parcelable {
    public static final Parcelable.Creator<SendDirectPaymentArgs> CREATOR = new a();
    public final UserProfile c;
    public final String d;

    /* compiled from: SendDirectPaymentFragment.kt */
    public static final class a implements Parcelable.Creator<SendDirectPaymentArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new SendDirectPaymentArgs((UserProfile) parcel.readParcelable(SendDirectPaymentArgs.class.getClassLoader()), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new SendDirectPaymentArgs[i];
        }
    }

    public SendDirectPaymentArgs(UserProfile userProfile, String str) {
        i.e(userProfile, "recipient");
        this.c = userProfile;
        this.d = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendDirectPaymentArgs)) {
            return false;
        }
        SendDirectPaymentArgs sendDirectPaymentArgs = (SendDirectPaymentArgs) obj;
        return i.a(this.c, sendDirectPaymentArgs.c) && i.a(this.d, sendDirectPaymentArgs.d);
    }

    public int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SendDirectPaymentArgs(recipient=");
        P0.append(this.c);
        P0.append(", channel=");
        return i0.d.a.a.a.w0(P0, this.d, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
    }
}
