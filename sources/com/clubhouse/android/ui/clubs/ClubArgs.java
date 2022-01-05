package com.clubhouse.android.ui.clubs;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m0.n.b.i;

/* compiled from: ClubFragment.kt */
public final class ClubArgs implements Parcelable {
    public static final Parcelable.Creator<ClubArgs> CREATOR = new a();
    public final SourceLocation Y1;
    public final Map<String, Object> Z1;
    public final Integer c;
    public final String d;
    public final String q;
    public final boolean x;
    public final boolean y;

    /* compiled from: ClubFragment.kt */
    public static final class a implements Parcelable.Creator<ClubArgs> {
        public Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            i.e(parcel, "parcel");
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            SourceLocation valueOf2 = SourceLocation.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    i = i0.d.a.a.a.y(ClubArgs.class, parcel, linkedHashMap, parcel.readString(), i, 1);
                }
            }
            return new ClubArgs(valueOf, readString, readString2, z, z2, valueOf2, linkedHashMap);
        }

        public Object[] newArray(int i) {
            return new ClubArgs[i];
        }
    }

    public ClubArgs(Integer num, String str, String str2, boolean z, boolean z2, SourceLocation sourceLocation, Map<String, ? extends Object> map) {
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.c = num;
        this.d = str;
        this.q = str2;
        this.x = z;
        this.y = z2;
        this.Y1 = sourceLocation;
        this.Z1 = map;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClubArgs)) {
            return false;
        }
        ClubArgs clubArgs = (ClubArgs) obj;
        return i.a(this.c, clubArgs.c) && i.a(this.d, clubArgs.d) && i.a(this.q, clubArgs.q) && this.x == clubArgs.x && this.y == clubArgs.y && this.Y1 == clubArgs.Y1 && i.a(this.Z1, clubArgs.Z1);
    }

    public int hashCode() {
        Integer num = this.c;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.q;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.x;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z3 = this.y;
        if (!z3) {
            z2 = z3;
        }
        int hashCode4 = (this.Y1.hashCode() + ((i2 + (z2 ? 1 : 0)) * 31)) * 31;
        Map<String, Object> map = this.Z1;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubArgs(clubId=");
        P0.append(this.c);
        P0.append(", slug=");
        P0.append(this.d);
        P0.append(", inviteCode=");
        P0.append(this.q);
        P0.append(", justCreated=");
        P0.append(this.x);
        P0.append(", showMigrationUpsell=");
        P0.append(this.y);
        P0.append(", source=");
        P0.append(this.Y1);
        P0.append(", loggingContext=");
        return i0.d.a.a.a.B0(P0, this.Z1, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        Integer num = this.c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            i0.d.a.a.a.i(parcel, 1, num);
        }
        parcel.writeString(this.d);
        parcel.writeString(this.q);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeString(this.Y1.name());
        Map<String, Object> map = this.Z1;
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
    public /* synthetic */ ClubArgs(Integer num, String str, String str2, boolean z, boolean z2, SourceLocation sourceLocation, Map map, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, sourceLocation, (i & 64) != 0 ? null : map);
    }
}
