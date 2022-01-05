package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u001f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b$\u0010%J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\f\u0010\nJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\nJ \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\nR\u0019\u0010\u000f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b\"\u0010\nR\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b#\u0010\n¨\u0006'"}, d2 = {"Lcom/stripe/android/model/DateOfBirth;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "", "component1", "()I", "component2", "component3", "day", "month", "year", "copy", "(III)Lcom/stripe/android/model/DateOfBirth;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getDay", "getYear", "getMonth", "<init>", "(III)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DateOfBirth.kt */
public final class DateOfBirth implements StripeParamsModel, Parcelable {
    public static final Parcelable.Creator<DateOfBirth> CREATOR = new Creator();
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String PARAM_DAY = "day";
    @Deprecated
    private static final String PARAM_MONTH = "month";
    @Deprecated
    private static final String PARAM_YEAR = "year";
    private final int day;
    private final int month;
    private final int year;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/DateOfBirth$Companion;", "", "", "PARAM_DAY", "Ljava/lang/String;", "PARAM_MONTH", "PARAM_YEAR", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DateOfBirth.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<DateOfBirth> {
        public final DateOfBirth createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new DateOfBirth(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        public final DateOfBirth[] newArray(int i) {
            return new DateOfBirth[i];
        }
    }

    public DateOfBirth(int i, int i2, int i3) {
        this.day = i;
        this.month = i2;
        this.year = i3;
    }

    public static /* synthetic */ DateOfBirth copy$default(DateOfBirth dateOfBirth, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = dateOfBirth.day;
        }
        if ((i4 & 2) != 0) {
            i2 = dateOfBirth.month;
        }
        if ((i4 & 4) != 0) {
            i3 = dateOfBirth.year;
        }
        return dateOfBirth.copy(i, i2, i3);
    }

    public final int component1() {
        return this.day;
    }

    public final int component2() {
        return this.month;
    }

    public final int component3() {
        return this.year;
    }

    public final DateOfBirth copy(int i, int i2, int i3) {
        return new DateOfBirth(i, i2, i3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateOfBirth)) {
            return false;
        }
        DateOfBirth dateOfBirth = (DateOfBirth) obj;
        return this.day == dateOfBirth.day && this.month == dateOfBirth.month && this.year == dateOfBirth.year;
    }

    public final int getDay() {
        return this.day;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return Integer.hashCode(this.year) + a.M(this.month, Integer.hashCode(this.day) * 31, 31);
    }

    public Map<String, Object> toParamMap() {
        return g.N(new Pair(PARAM_DAY, Integer.valueOf(this.day)), new Pair(PARAM_MONTH, Integer.valueOf(this.month)), new Pair(PARAM_YEAR, Integer.valueOf(this.year)));
    }

    public String toString() {
        StringBuilder P0 = a.P0("DateOfBirth(day=");
        P0.append(this.day);
        P0.append(", month=");
        P0.append(this.month);
        P0.append(", year=");
        return a.u0(P0, this.year, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeInt(this.day);
        parcel.writeInt(this.month);
        parcel.writeInt(this.year);
    }
}
