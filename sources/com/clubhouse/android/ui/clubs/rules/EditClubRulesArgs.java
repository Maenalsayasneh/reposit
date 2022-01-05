package com.clubhouse.android.ui.clubs.rules;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.club.ClubRule;
import java.util.ArrayList;
import java.util.List;
import m0.n.b.i;

/* compiled from: EditClubRulesFragment.kt */
public final class EditClubRulesArgs implements Parcelable {
    public static final Parcelable.Creator<EditClubRulesArgs> CREATOR = new a();
    public final String c;
    public final List<ClubRule> d;

    /* compiled from: EditClubRulesFragment.kt */
    public static final class a implements Parcelable.Creator<EditClubRulesArgs> {
        public Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            i.e(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(parcel.readParcelable(EditClubRulesArgs.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new EditClubRulesArgs(readString, arrayList);
        }

        public Object[] newArray(int i) {
            return new EditClubRulesArgs[i];
        }
    }

    public EditClubRulesArgs(String str, List<ClubRule> list) {
        i.e(str, "clubName");
        this.c = str;
        this.d = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditClubRulesArgs)) {
            return false;
        }
        EditClubRulesArgs editClubRulesArgs = (EditClubRulesArgs) obj;
        return i.a(this.c, editClubRulesArgs.c) && i.a(this.d, editClubRulesArgs.d);
    }

    public int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        List<ClubRule> list = this.d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EditClubRulesArgs(clubName=");
        P0.append(this.c);
        P0.append(", clubRules=");
        return i0.d.a.a.a.A0(P0, this.d, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        List<ClubRule> list = this.d;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (ClubRule writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }
}
