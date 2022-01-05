package com.clubhouse.android.ui.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import m0.n.b.i;

/* compiled from: ValidateNumberFragment.kt */
public final class ValidateNumberArgs implements Parcelable {
    public static final Parcelable.Creator<ValidateNumberArgs> CREATOR = new a();
    public final String c;
    public final Integer d;

    /* compiled from: ValidateNumberFragment.kt */
    public static final class a implements Parcelable.Creator<ValidateNumberArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new ValidateNumberArgs(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        public Object[] newArray(int i) {
            return new ValidateNumberArgs[i];
        }
    }

    public ValidateNumberArgs(String str, Integer num) {
        i.e(str, "phoneNumber");
        this.c = str;
        this.d = num;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateNumberArgs)) {
            return false;
        }
        ValidateNumberArgs validateNumberArgs = (ValidateNumberArgs) obj;
        return i.a(this.c, validateNumberArgs.c) && i.a(this.d, validateNumberArgs.d);
    }

    public int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        Integer num = this.d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ValidateNumberArgs(phoneNumber=");
        P0.append(this.c);
        P0.append(", numDigitsForValidation=");
        return i0.d.a.a.a.v0(P0, this.d, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        i.e(parcel, "out");
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
    }
}
