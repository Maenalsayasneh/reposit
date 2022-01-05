package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import h0.f.h;

public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new a();
    public final h<String, Bundle> q;

    public static class a implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, (a) null);
        }

        public Object[] newArray(int i) {
            return new ExtendableSavedState[i];
        }

        public Object createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, (ClassLoader) null, (a) null);
        }
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.q = new h<>();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ExtendableSavedState{");
        P0.append(Integer.toHexString(System.identityHashCode(this)));
        P0.append(" states=");
        P0.append(this.q);
        P0.append("}");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, i);
        int i2 = this.q.Z1;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = this.q.i(i3);
            bundleArr[i3] = this.q.l(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader, a aVar) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.q = new h<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.q.put(strArr[i], bundleArr[i]);
        }
    }
}
