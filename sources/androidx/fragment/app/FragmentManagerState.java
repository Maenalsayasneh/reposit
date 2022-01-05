package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();
    public ArrayList<String> Y1 = new ArrayList<>();
    public ArrayList<Bundle> Z1 = new ArrayList<>();
    public ArrayList<FragmentManager.LaunchedFragmentInfo> a2;
    public ArrayList<FragmentState> c;
    public ArrayList<String> d;
    public BackStackState[] q;
    public int x;
    public String y = null;

    public class a implements Parcelable.Creator<FragmentManagerState> {
        public Object createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        public Object[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.c);
        parcel.writeStringList(this.d);
        parcel.writeTypedArray(this.q, i);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeStringList(this.Y1);
        parcel.writeTypedList(this.Z1);
        parcel.writeTypedList(this.a2);
    }

    public FragmentManagerState(Parcel parcel) {
        this.c = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.d = parcel.createStringArrayList();
        this.q = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.x = parcel.readInt();
        this.y = parcel.readString();
        this.Y1 = parcel.createStringArrayList();
        this.Z1 = parcel.createTypedArrayList(Bundle.CREATOR);
        this.a2 = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
