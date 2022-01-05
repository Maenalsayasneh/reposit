package com.clubhouse.android.ui.selection;

import android.os.Parcel;
import android.os.Parcelable;
import m0.n.b.i;

/* compiled from: SelectionFragment.kt */
public class Selection implements Parcelable {
    public static final Parcelable.Creator<Selection> CREATOR = new a();
    public final int c;

    /* compiled from: SelectionFragment.kt */
    public static final class a implements Parcelable.Creator<Selection> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new Selection(parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new Selection[i];
        }
    }

    public Selection(int i) {
        this.c = i;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeInt(this.c);
    }
}
