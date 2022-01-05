package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
    public final int c;
    public final float d;

    public static class a implements Parcelable.Creator<RatingCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        public Object[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f) {
        this.c = i;
        this.d = f;
    }

    public int describeContents() {
        return this.c;
    }

    public String toString() {
        String str;
        StringBuilder P0 = i0.d.a.a.a.P0("Rating:style=");
        P0.append(this.c);
        P0.append(" rating=");
        float f = this.d;
        if (f < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f);
        }
        P0.append(str);
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeFloat(this.d);
    }
}
