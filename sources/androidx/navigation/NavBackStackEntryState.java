package androidx.navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h0.t.f;
import java.util.UUID;

@SuppressLint({"BanParcelableUsage"})
public final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new a();
    public final UUID c;
    public final int d;
    public final Bundle q;
    public final Bundle x;

    public class a implements Parcelable.Creator<NavBackStackEntryState> {
        public Object createFromParcel(Parcel parcel) {
            return new NavBackStackEntryState(parcel);
        }

        public Object[] newArray(int i) {
            return new NavBackStackEntryState[i];
        }
    }

    public NavBackStackEntryState(f fVar) {
        this.c = fVar.Y1;
        this.d = fVar.d.q;
        this.q = fVar.q;
        Bundle bundle = new Bundle();
        this.x = bundle;
        fVar.y.b(bundle);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c.toString());
        parcel.writeInt(this.d);
        parcel.writeBundle(this.q);
        parcel.writeBundle(this.x);
    }

    public NavBackStackEntryState(Parcel parcel) {
        this.c = UUID.fromString(parcel.readString());
        this.d = parcel.readInt();
        this.q = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        this.x = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
    }
}
