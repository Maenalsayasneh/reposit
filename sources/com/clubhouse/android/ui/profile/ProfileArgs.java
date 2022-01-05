package com.clubhouse.android.ui.profile;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m0.n.b.i;

/* compiled from: ProfileFragment.kt */
public final class ProfileArgs implements Parcelable {
    public static final Parcelable.Creator<ProfileArgs> CREATOR = new a();
    public final SourceLocation Y1;
    public final Map<String, Object> Z1;
    public final Integer c;
    public final String d;
    public final BasicUser q;
    public final boolean x;
    public final Uri y;

    /* compiled from: ProfileFragment.kt */
    public static final class a implements Parcelable.Creator<ProfileArgs> {
        public Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Parcel parcel2 = parcel;
            i.e(parcel2, "parcel");
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            BasicUser basicUser = (BasicUser) parcel2.readParcelable(ProfileArgs.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            Uri uri = (Uri) parcel2.readParcelable(ProfileArgs.class.getClassLoader());
            SourceLocation valueOf2 = SourceLocation.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i = 0;
                while (i != readInt) {
                    i = i0.d.a.a.a.y(ProfileArgs.class, parcel, linkedHashMap, parcel.readString(), i, 1);
                }
            }
            return new ProfileArgs(valueOf, readString, basicUser, z, uri, valueOf2, linkedHashMap);
        }

        public Object[] newArray(int i) {
            return new ProfileArgs[i];
        }
    }

    public ProfileArgs(Integer num, String str, BasicUser basicUser, boolean z, Uri uri, SourceLocation sourceLocation, Map<String, ? extends Object> map) {
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.c = num;
        this.d = str;
        this.q = basicUser;
        this.x = z;
        this.y = uri;
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
        if (!(obj instanceof ProfileArgs)) {
            return false;
        }
        ProfileArgs profileArgs = (ProfileArgs) obj;
        return i.a(this.c, profileArgs.c) && i.a(this.d, profileArgs.d) && i.a(this.q, profileArgs.q) && this.x == profileArgs.x && i.a(this.y, profileArgs.y) && this.Y1 == profileArgs.Y1 && i.a(this.Z1, profileArgs.Z1);
    }

    public int hashCode() {
        Integer num = this.c;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BasicUser basicUser = this.q;
        int hashCode3 = (hashCode2 + (basicUser == null ? 0 : basicUser.hashCode())) * 31;
        boolean z = this.x;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        Uri uri = this.y;
        int hashCode4 = (this.Y1.hashCode() + ((i2 + (uri == null ? 0 : uri.hashCode())) * 31)) * 31;
        Map<String, Object> map = this.Z1;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ProfileArgs(userId=");
        P0.append(this.c);
        P0.append(", username=");
        P0.append(this.d);
        P0.append(", user=");
        P0.append(this.q);
        P0.append(", isSelf=");
        P0.append(this.x);
        P0.append(", presavedScreenUri=");
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
        parcel.writeParcelable(this.q, i);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeParcelable(this.y, i);
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
    public /* synthetic */ ProfileArgs(Integer num, String str, BasicUser basicUser, boolean z, Uri uri, SourceLocation sourceLocation, Map map, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : basicUser, (i & 8) != 0 ? false : z, (Uri) null, sourceLocation, (i & 64) != 0 ? null : map);
        int i2 = i & 16;
    }
}
