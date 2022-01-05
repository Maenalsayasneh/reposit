package com.clubhouse.android.ui.events;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m0.n.b.i;

/* compiled from: HalfEventFragment.kt */
public final class HalfEventArgs implements Parcelable {
    public static final Parcelable.Creator<HalfEventArgs> CREATOR = new a();
    public final SourceLocation Y1;
    public final Map<String, Object> Z1;
    public final String c;
    public final Integer d;
    public final String q;
    public final String x;
    public final EventInClub y;

    /* compiled from: HalfEventFragment.kt */
    public static final class a implements Parcelable.Creator<HalfEventArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            String readString = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            EventInClub eventInClub = (EventInClub) parcel.readParcelable(HalfEventArgs.class.getClassLoader());
            SourceLocation valueOf2 = parcel.readInt() == 0 ? null : SourceLocation.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    i = i0.d.a.a.a.y(HalfEventArgs.class, parcel, linkedHashMap, parcel.readString(), i, 1);
                }
            }
            return new HalfEventArgs(readString, valueOf, readString2, readString3, eventInClub, valueOf2, linkedHashMap);
        }

        public Object[] newArray(int i) {
            return new HalfEventArgs[i];
        }
    }

    public HalfEventArgs() {
        this((String) null, (Integer) null, (String) null, (String) null, (EventInClub) null, (SourceLocation) null, (Map) null, 127);
    }

    public HalfEventArgs(String str, Integer num, String str2, String str3, EventInClub eventInClub, SourceLocation sourceLocation, Map<String, ? extends Object> map) {
        this.c = str;
        this.d = num;
        this.q = str2;
        this.x = str3;
        this.y = eventInClub;
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
        if (!(obj instanceof HalfEventArgs)) {
            return false;
        }
        HalfEventArgs halfEventArgs = (HalfEventArgs) obj;
        return i.a(this.c, halfEventArgs.c) && i.a(this.d, halfEventArgs.d) && i.a(this.q, halfEventArgs.q) && i.a(this.x, halfEventArgs.x) && i.a(this.y, halfEventArgs.y) && this.Y1 == halfEventArgs.Y1 && i.a(this.Z1, halfEventArgs.Z1);
    }

    public int hashCode() {
        String str = this.c;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.q;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.x;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EventInClub eventInClub = this.y;
        int hashCode5 = (hashCode4 + (eventInClub == null ? 0 : eventInClub.hashCode())) * 31;
        SourceLocation sourceLocation = this.Y1;
        int hashCode6 = (hashCode5 + (sourceLocation == null ? 0 : sourceLocation.hashCode())) * 31;
        Map<String, Object> map = this.Z1;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("HalfEventArgs(eventHashId=");
        P0.append(this.c);
        P0.append(", eventId=");
        P0.append(this.d);
        P0.append(", clubSlug=");
        P0.append(this.q);
        P0.append(", inviteCode=");
        P0.append(this.x);
        P0.append(", event=");
        P0.append(this.y);
        P0.append(", source=");
        P0.append(this.Y1);
        P0.append(", loggingContext=");
        return i0.d.a.a.a.B0(P0, this.Z1, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            i0.d.a.a.a.i(parcel, 1, num);
        }
        parcel.writeString(this.q);
        parcel.writeString(this.x);
        parcel.writeParcelable(this.y, i);
        SourceLocation sourceLocation = this.Y1;
        if (sourceLocation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sourceLocation.name());
        }
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

    public HalfEventArgs(String str, Integer num, String str2, String str3, EventInClub eventInClub, SourceLocation sourceLocation, Map<String, Object> map, int i) {
        str = (i & 1) != 0 ? null : str;
        num = (i & 2) != 0 ? null : num;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        eventInClub = (i & 16) != 0 ? null : eventInClub;
        sourceLocation = (i & 32) != 0 ? null : sourceLocation;
        map = (i & 64) != 0 ? null : map;
        this.c = str;
        this.d = num;
        this.q = str2;
        this.x = str3;
        this.y = eventInClub;
        this.Y1 = sourceLocation;
        this.Z1 = map;
    }
}
