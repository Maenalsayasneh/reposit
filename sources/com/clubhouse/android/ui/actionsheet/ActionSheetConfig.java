package com.clubhouse.android.ui.actionsheet;

import android.os.Parcel;
import android.os.Parcelable;
import m0.n.b.i;

/* compiled from: ActionSheetFragment.kt */
public final class ActionSheetConfig implements Parcelable {
    public static final Parcelable.Creator<ActionSheetConfig> CREATOR = new a();
    public final String c;
    public final String d;
    public final boolean q;

    /* compiled from: ActionSheetFragment.kt */
    public static final class a implements Parcelable.Creator<ActionSheetConfig> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new ActionSheetConfig(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public Object[] newArray(int i) {
            return new ActionSheetConfig[i];
        }
    }

    public ActionSheetConfig(String str, String str2, boolean z) {
        this.c = str;
        this.d = str2;
        this.q = z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionSheetConfig)) {
            return false;
        }
        ActionSheetConfig actionSheetConfig = (ActionSheetConfig) obj;
        return i.a(this.c, actionSheetConfig.c) && i.a(this.d, actionSheetConfig.d) && this.q == actionSheetConfig.q;
    }

    public int hashCode() {
        String str = this.c;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.q;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ActionSheetConfig(title=");
        P0.append(this.c);
        P0.append(", description=");
        P0.append(this.d);
        P0.append(", selectable=");
        return i0.d.a.a.a.C0(P0, this.q, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.q ? 1 : 0);
    }

    public ActionSheetConfig() {
        this((String) null, (String) null, false);
    }
}
