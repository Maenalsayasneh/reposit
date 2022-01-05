package com.clubhouse.android.core.ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import m0.n.b.i;

/* compiled from: WrappedBottomSheetFragment.kt */
public final class WrappedBottomSheetArgs implements Parcelable {
    public static final Parcelable.Creator<WrappedBottomSheetArgs> CREATOR = new a();
    public final Class<? extends BaseFragment> c;
    public final Bundle d;

    /* compiled from: WrappedBottomSheetFragment.kt */
    public static final class a implements Parcelable.Creator<WrappedBottomSheetArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new WrappedBottomSheetArgs((Class) parcel.readSerializable(), parcel.readBundle());
        }

        public Object[] newArray(int i) {
            return new WrappedBottomSheetArgs[i];
        }
    }

    public WrappedBottomSheetArgs(Class<? extends BaseFragment> cls, Bundle bundle) {
        i.e(cls, "clazz");
        this.c = cls;
        this.d = bundle;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WrappedBottomSheetArgs)) {
            return false;
        }
        WrappedBottomSheetArgs wrappedBottomSheetArgs = (WrappedBottomSheetArgs) obj;
        return i.a(this.c, wrappedBottomSheetArgs.c) && i.a(this.d, wrappedBottomSheetArgs.d);
    }

    public int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        Bundle bundle = this.d;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("WrappedBottomSheetArgs(clazz=");
        P0.append(this.c);
        P0.append(", args=");
        P0.append(this.d);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeSerializable(this.c);
        parcel.writeBundle(this.d);
    }
}
