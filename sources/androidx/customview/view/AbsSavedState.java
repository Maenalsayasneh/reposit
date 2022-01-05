package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new a();
    public static final AbsSavedState c = new AbsSavedState() {
    };
    public final Parcelable d;

    public AbsSavedState() {
        this.d = null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, i);
    }

    public class a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable((ClassLoader) null) == null) {
                return AbsSavedState.c;
            }
            throw new IllegalStateException("superState must be null");
        }

        public Object[] newArray(int i) {
            return new AbsSavedState[i];
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.c;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.d = parcelable == c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.d = readParcelable == null ? c : readParcelable;
    }
}
