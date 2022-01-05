package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import i0.h.a.c.b0.d;
import java.util.Arrays;

public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();
    public int Y1;
    public int Z1;
    public final d c;
    public final d d;
    public final int q;
    public int x;
    public int y;

    public static class a implements Parcelable.Creator<TimeModel> {
        public Object createFromParcel(Parcel parcel) {
            return new TimeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel() {
        this(0, 0, 10, 0);
    }

    public static String a(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    public int c() {
        if (this.q == 1) {
            return this.x % 24;
        }
        int i = this.x;
        if (i % 12 == 0) {
            return 12;
        }
        return this.Z1 == 1 ? i - 12 : i;
    }

    public void d(int i) {
        if (this.q == 1) {
            this.x = i;
            return;
        }
        int i2 = 12;
        int i3 = i % 12;
        if (this.Z1 != 1) {
            i2 = 0;
        }
        this.x = i3 + i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        if (this.x == timeModel.x && this.y == timeModel.y && this.q == timeModel.q && this.Y1 == timeModel.Y1) {
            return true;
        }
        return false;
    }

    public void g(int i) {
        if (i != this.Z1) {
            this.Z1 = i;
            int i2 = this.x;
            if (i2 < 12 && i == 1) {
                this.x = i2 + 12;
            } else if (i2 >= 12 && i == 0) {
                this.x = i2 - 12;
            }
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.q), Integer.valueOf(this.x), Integer.valueOf(this.y), Integer.valueOf(this.Y1)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.Y1);
        parcel.writeInt(this.q);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.Y1 = i3;
        this.q = i4;
        int i5 = 12;
        this.Z1 = i >= 12 ? 1 : 0;
        this.c = new d(59);
        this.d = new d(i4 == 1 ? 24 : i5);
    }
}
