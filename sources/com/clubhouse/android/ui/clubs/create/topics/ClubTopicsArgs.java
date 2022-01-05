package com.clubhouse.android.ui.clubs.create.topics;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.local.club.Club;
import java.util.ArrayList;
import java.util.List;
import m0.n.b.i;

/* compiled from: ClubTopicsFragment.kt */
public final class ClubTopicsArgs implements Parcelable {
    public static final Parcelable.Creator<ClubTopicsArgs> CREATOR = new a();
    public final Club c;
    public final List<Topic> d;

    /* compiled from: ClubTopicsFragment.kt */
    public static final class a implements Parcelable.Creator<ClubTopicsArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            Club club = (Club) parcel.readParcelable(ClubTopicsArgs.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(ClubTopicsArgs.class.getClassLoader()));
            }
            return new ClubTopicsArgs(club, arrayList);
        }

        public Object[] newArray(int i) {
            return new ClubTopicsArgs[i];
        }
    }

    public ClubTopicsArgs(Club club, List<Topic> list) {
        i.e(list, "selectedTopics");
        this.c = club;
        this.d = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClubTopicsArgs)) {
            return false;
        }
        ClubTopicsArgs clubTopicsArgs = (ClubTopicsArgs) obj;
        return i.a(this.c, clubTopicsArgs.c) && i.a(this.d, clubTopicsArgs.d);
    }

    public int hashCode() {
        Club club = this.c;
        return this.d.hashCode() + ((club == null ? 0 : club.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubTopicsArgs(club=");
        P0.append(this.c);
        P0.append(", selectedTopics=");
        return i0.d.a.a.a.A0(P0, this.d, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeParcelable(this.c, i);
        List<Topic> list = this.d;
        parcel.writeInt(list.size());
        for (Topic writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
    }
}
