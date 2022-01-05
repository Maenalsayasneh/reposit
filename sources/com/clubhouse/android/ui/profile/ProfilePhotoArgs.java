package com.clubhouse.android.ui.profile;

import android.os.Parcel;
import android.os.Parcelable;
import m0.n.b.i;

/* compiled from: ProfilePhotoFragment.kt */
public final class ProfilePhotoArgs implements Parcelable {
    public static final Parcelable.Creator<ProfilePhotoArgs> CREATOR = new a();
    public final String c;
    public final float d;

    /* compiled from: ProfilePhotoFragment.kt */
    public static final class a implements Parcelable.Creator<ProfilePhotoArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new ProfilePhotoArgs(parcel.readString(), parcel.readFloat());
        }

        public Object[] newArray(int i) {
            return new ProfilePhotoArgs[i];
        }
    }

    public ProfilePhotoArgs(String str, float f) {
        i.e(str, "photoUrl");
        this.c = str;
        this.d = f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfilePhotoArgs)) {
            return false;
        }
        ProfilePhotoArgs profilePhotoArgs = (ProfilePhotoArgs) obj;
        return i.a(this.c, profilePhotoArgs.c) && i.a(Float.valueOf(this.d), Float.valueOf(profilePhotoArgs.d));
    }

    public int hashCode() {
        return Float.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ProfilePhotoArgs(photoUrl=");
        P0.append(this.c);
        P0.append(", squareness=");
        P0.append(this.d);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        parcel.writeFloat(this.d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfilePhotoArgs(String str, float f, int i) {
        this(str, (i & 2) != 0 ? 0.68f : f);
    }
}
