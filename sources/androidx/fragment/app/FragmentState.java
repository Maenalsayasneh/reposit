package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();
    public final String Y1;
    public final boolean Z1;
    public final boolean a2;
    public final boolean b2;
    public final String c;
    public final Bundle c2;
    public final String d;
    public final boolean d2;
    public final int e2;
    public Bundle f2;
    public final boolean q;
    public final int x;
    public final int y;

    public class a implements Parcelable.Creator<FragmentState> {
        public Object createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        public Object[] newArray(int i) {
            return new FragmentState[i];
        }
    }

    public FragmentState(Fragment fragment) {
        this.c = fragment.getClass().getName();
        this.d = fragment.mWho;
        this.q = fragment.mFromLayout;
        this.x = fragment.mFragmentId;
        this.y = fragment.mContainerId;
        this.Y1 = fragment.mTag;
        this.Z1 = fragment.mRetainInstance;
        this.a2 = fragment.mRemoving;
        this.b2 = fragment.mDetached;
        this.c2 = fragment.mArguments;
        this.d2 = fragment.mHidden;
        this.e2 = fragment.mMaxState.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.c);
        sb.append(" (");
        sb.append(this.d);
        sb.append(")}:");
        if (this.q) {
            sb.append(" fromLayout");
        }
        if (this.y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.y));
        }
        String str = this.Y1;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.Y1);
        }
        if (this.Z1) {
            sb.append(" retainInstance");
        }
        if (this.a2) {
            sb.append(" removing");
        }
        if (this.b2) {
            sb.append(" detached");
        }
        if (this.d2) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeString(this.Y1);
        parcel.writeInt(this.Z1 ? 1 : 0);
        parcel.writeInt(this.a2 ? 1 : 0);
        parcel.writeInt(this.b2 ? 1 : 0);
        parcel.writeBundle(this.c2);
        parcel.writeInt(this.d2 ? 1 : 0);
        parcel.writeBundle(this.f2);
        parcel.writeInt(this.e2);
    }

    public FragmentState(Parcel parcel) {
        this.c = parcel.readString();
        this.d = parcel.readString();
        boolean z = true;
        this.q = parcel.readInt() != 0;
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.Y1 = parcel.readString();
        this.Z1 = parcel.readInt() != 0;
        this.a2 = parcel.readInt() != 0;
        this.b2 = parcel.readInt() != 0;
        this.c2 = parcel.readBundle();
        this.d2 = parcel.readInt() == 0 ? false : z;
        this.f2 = parcel.readBundle();
        this.e2 = parcel.readInt();
    }
}
