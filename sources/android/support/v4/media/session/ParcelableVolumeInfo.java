package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();
    public int c;
    public int d;
    public int q;
    public int x;
    public int y;

    public static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.c = parcel.readInt();
        this.q = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.d = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.q);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.d);
    }
}
