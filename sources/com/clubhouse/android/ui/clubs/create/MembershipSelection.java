package com.clubhouse.android.ui.clubs.create;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.ui.selection.Selection;
import com.clubhouse.app.R;
import m0.n.b.i;

/* compiled from: SelectionItems.kt */
public class MembershipSelection extends Selection {
    public static final Parcelable.Creator<MembershipSelection> CREATOR = new a();
    public static final MembershipSelection d = new MembershipSelection(R.string.open_to_all);
    public static final MembershipSelection q = new MembershipSelection(R.string.by_approval);
    public final int x;

    /* compiled from: SelectionItems.kt */
    public static final class a implements Parcelable.Creator<MembershipSelection> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new MembershipSelection(parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new MembershipSelection[i];
        }
    }

    public MembershipSelection(int i) {
        super(i);
        this.x = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeInt(this.x);
    }
}
