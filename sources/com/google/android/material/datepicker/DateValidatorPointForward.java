package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new a();
    public final long c;

    public static class a implements Parcelable.Creator<DateValidatorPointForward> {
        public Object createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), (a) null);
        }

        public Object[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    }

    public DateValidatorPointForward(long j) {
        this.c = j;
    }

    public boolean c0(long j) {
        return j >= this.c;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateValidatorPointForward)) {
            return false;
        }
        if (this.c == ((DateValidatorPointForward) obj).c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.c)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.c);
    }

    public DateValidatorPointForward(long j, a aVar) {
        this.c = j;
    }
}
