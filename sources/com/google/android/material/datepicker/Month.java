package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import i0.h.a.c.l.s;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();
    public final long Y1;
    public String Z1;
    public final Calendar c;
    public final int d;
    public final int q;
    public final int x;
    public final int y;

    public static class a implements Parcelable.Creator<Month> {
        public Object createFromParcel(Parcel parcel) {
            return Month.g(parcel.readInt(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b = s.b(calendar);
        this.c = b;
        this.d = b.get(2);
        this.q = b.get(1);
        this.x = b.getMaximum(7);
        this.y = b.getActualMaximum(5);
        this.Y1 = b.getTimeInMillis();
    }

    public static Month g(int i, int i2) {
        Calendar e = s.e();
        e.set(1, i);
        e.set(2, i2);
        return new Month(e);
    }

    public static Month j(long j) {
        Calendar e = s.e();
        e.setTimeInMillis(j);
        return new Month(e);
    }

    /* renamed from: a */
    public int compareTo(Month month) {
        return this.c.compareTo(month.c);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.d == month.d && this.q == month.q) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.q)});
    }

    public int o() {
        int firstDayOfWeek = this.c.get(7) - this.c.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.x : firstDayOfWeek;
    }

    public String r(Context context) {
        if (this.Z1 == null) {
            long timeInMillis = this.c.getTimeInMillis();
            this.Z1 = DateUtils.formatDateTime(context, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36);
        }
        return this.Z1;
    }

    public Month s(int i) {
        Calendar b = s.b(this.c);
        b.add(2, i);
        return new Month(b);
    }

    public int t(Month month) {
        if (this.c instanceof GregorianCalendar) {
            return (month.d - this.d) + ((month.q - this.q) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.q);
        parcel.writeInt(this.d);
    }
}
