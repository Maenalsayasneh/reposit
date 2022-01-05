package com.clubhouse.android.ui.profile.settings;

import android.os.Parcel;
import android.os.Parcelable;
import m0.n.b.i;

/* compiled from: NotificationSettingsFragment.kt */
public final class NotificationSettingsArgs implements Parcelable {
    public static final Parcelable.Creator<NotificationSettingsArgs> CREATOR = new a();
    public final boolean c;
    public final boolean d;
    public final boolean q;
    public final boolean x;

    /* compiled from: NotificationSettingsFragment.kt */
    public static final class a implements Parcelable.Creator<NotificationSettingsArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new NotificationSettingsArgs(z2, z3, z4, z);
        }

        public Object[] newArray(int i) {
            return new NotificationSettingsArgs[i];
        }
    }

    public NotificationSettingsArgs(boolean z, boolean z2, boolean z3, boolean z4) {
        this.c = z;
        this.d = z2;
        this.q = z3;
        this.x = z4;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationSettingsArgs)) {
            return false;
        }
        NotificationSettingsArgs notificationSettingsArgs = (NotificationSettingsArgs) obj;
        return this.c == notificationSettingsArgs.c && this.d == notificationSettingsArgs.d && this.q == notificationSettingsArgs.q && this.x == notificationSettingsArgs.x;
    }

    public int hashCode() {
        boolean z = this.c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.d;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.q;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.x;
        if (!z5) {
            z2 = z5;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("NotificationSettingsArgs(enableRoom=");
        P0.append(this.c);
        P0.append(", enableBackchannel=");
        P0.append(this.d);
        P0.append(", enableTrending=");
        P0.append(this.q);
        P0.append(", enableOther=");
        return i0.d.a.a.a.C0(P0, this.x, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
    }

    public NotificationSettingsArgs() {
        this(false, false, false, false);
    }
}
