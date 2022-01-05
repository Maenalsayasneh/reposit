package com.clubhouse.android.ui.clubs;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m0.n.b.i;

/* compiled from: HalfClubRulesFragment.kt */
public final class HalfClubRulesArgs implements Parcelable {
    public static final Parcelable.Creator<HalfClubRulesArgs> CREATOR = new a();
    public final Club c;
    public final Boolean d;
    public final String q;
    public final SourceLocation x;
    public final Map<String, Object> y;

    /* compiled from: HalfClubRulesFragment.kt */
    public static final class a implements Parcelable.Creator<HalfClubRulesArgs> {
        public Object createFromParcel(Parcel parcel) {
            Boolean bool;
            LinkedHashMap linkedHashMap;
            i.e(parcel, "parcel");
            Club club = (Club) parcel.readParcelable(HalfClubRulesArgs.class.getClassLoader());
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString = parcel.readString();
            SourceLocation valueOf = SourceLocation.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    i = i0.d.a.a.a.y(HalfClubRulesArgs.class, parcel, linkedHashMap2, parcel.readString(), i, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new HalfClubRulesArgs(club, bool, readString, valueOf, linkedHashMap);
        }

        public Object[] newArray(int i) {
            return new HalfClubRulesArgs[i];
        }
    }

    public HalfClubRulesArgs(Club club, Boolean bool, String str, SourceLocation sourceLocation, Map<String, ? extends Object> map) {
        i.e(club, "club");
        i.e(sourceLocation, "sourceLocation");
        this.c = club;
        this.d = bool;
        this.q = str;
        this.x = sourceLocation;
        this.y = map;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HalfClubRulesArgs)) {
            return false;
        }
        HalfClubRulesArgs halfClubRulesArgs = (HalfClubRulesArgs) obj;
        return i.a(this.c, halfClubRulesArgs.c) && i.a(this.d, halfClubRulesArgs.d) && i.a(this.q, halfClubRulesArgs.q) && this.x == halfClubRulesArgs.x && i.a(this.y, halfClubRulesArgs.y);
    }

    public int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        Boolean bool = this.d;
        int i = 0;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.q;
        int hashCode3 = (this.x.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Map<String, Object> map = this.y;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("HalfClubRulesArgs(club=");
        P0.append(this.c);
        P0.append(", showCTA=");
        P0.append(this.d);
        P0.append(", reason=");
        P0.append(this.q);
        P0.append(", sourceLocation=");
        P0.append(this.x);
        P0.append(", loggingContext=");
        return i0.d.a.a.a.B0(P0, this.y, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeParcelable(this.c, i);
        Boolean bool = this.d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.q);
        parcel.writeString(this.x.name());
        Map<String, Object> map = this.y;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator l1 = i0.d.a.a.a.l1(parcel, 1, map);
        while (l1.hasNext()) {
            Map.Entry entry = (Map.Entry) l1.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeValue(entry.getValue());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HalfClubRulesArgs(Club club, Boolean bool, String str, SourceLocation sourceLocation, Map map, int i) {
        this(club, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? "" : str, sourceLocation, (i & 16) != 0 ? null : map);
    }
}
