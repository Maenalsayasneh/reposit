package com.clubhouse.android.ui.clubs.create;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.ui.selection.Selection;
import com.clubhouse.app.R;
import m0.n.b.i;

/* compiled from: SelectionItems.kt */
public class WhoCanStartSelection extends Selection {
    public static final Parcelable.Creator<WhoCanStartSelection> CREATOR = new a();
    public static final WhoCanStartSelection d = new WhoCanStartSelection(R.string.any_member);
    public static final WhoCanStartSelection q = new WhoCanStartSelection(R.string.leaders_only);
    public final int x;

    /* compiled from: SelectionItems.kt */
    public static final class a implements Parcelable.Creator<WhoCanStartSelection> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new WhoCanStartSelection(parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new WhoCanStartSelection[i];
        }
    }

    public WhoCanStartSelection(int i) {
        super(i);
        this.x = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeInt(this.x);
    }
}
