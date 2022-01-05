package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import i0.h.a.c.l.s;
import java.util.Arrays;
import java.util.Objects;

public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();
    public final int Y1;
    public final Month c;
    public final Month d;
    public final DateValidator q;
    public Month x;
    public final int y;

    public interface DateValidator extends Parcelable {
        boolean c0(long j);
    }

    public static class a implements Parcelable.Creator<CalendarConstraints> {
        public Object createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (a) null);
        }

        public Object[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    public static final class b {
        public static final long a = s.a(Month.g(1900, 0).Y1);
        public static final long b = s.a(Month.g(2100, 11).Y1);
        public long c = a;
        public long d = b;
        public Long e;
        public DateValidator f = new DateValidatorPointForward(Long.MIN_VALUE);

        public b(CalendarConstraints calendarConstraints) {
            this.c = calendarConstraints.c.Y1;
            this.d = calendarConstraints.d.Y1;
            this.e = Long.valueOf(calendarConstraints.x.Y1);
            this.f = calendarConstraints.q;
        }
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, a aVar) {
        this.c = month;
        this.d = month2;
        this.x = month3;
        this.q = dateValidator;
        if (month3 != null && month.c.compareTo(month3.c) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (month3 == null || month3.c.compareTo(month2.c) <= 0) {
            this.Y1 = month.t(month2) + 1;
            this.y = (month2.q - month.q) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (!this.c.equals(calendarConstraints.c) || !this.d.equals(calendarConstraints.d) || !Objects.equals(this.x, calendarConstraints.x) || !this.q.equals(calendarConstraints.q)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, this.x, this.q});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.x, 0);
        parcel.writeParcelable(this.q, 0);
    }
}
