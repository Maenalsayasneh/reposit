package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();
    public final int c;
    public final MediaDescriptionCompat d;

    public static class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        public Object createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        public Object[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.c = parcel.readInt();
        this.d = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.c + ", mDescription=" + this.d + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        this.d.writeToParcel(parcel, i);
    }
}
