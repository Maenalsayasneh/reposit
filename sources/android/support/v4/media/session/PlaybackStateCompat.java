package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public final int Y1;
    public final CharSequence Z1;
    public final long a2;
    public List<CustomAction> b2;
    public final int c;
    public final long c2;
    public final long d;
    public final Bundle d2;
    public final long q;
    public final float x;
    public final long y;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        public final String c;
        public final CharSequence d;
        public final int q;
        public final Bundle x;

        public static class a implements Parcelable.Creator<CustomAction> {
            public Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            public Object[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(Parcel parcel) {
            this.c = parcel.readString();
            this.d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.q = parcel.readInt();
            this.x = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Action:mName='");
            P0.append(this.d);
            P0.append(", mIcon=");
            P0.append(this.q);
            P0.append(", mExtras=");
            P0.append(this.x);
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.c);
            TextUtils.writeToParcel(this.d, parcel, i);
            parcel.writeInt(this.q);
            parcel.writeBundle(this.x);
        }
    }

    public static class a implements Parcelable.Creator<PlaybackStateCompat> {
        public Object createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        public Object[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.c = parcel.readInt();
        this.d = parcel.readLong();
        this.x = parcel.readFloat();
        this.a2 = parcel.readLong();
        this.q = parcel.readLong();
        this.y = parcel.readLong();
        this.Z1 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.b2 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.c2 = parcel.readLong();
        this.d2 = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.Y1 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.c + ", position=" + this.d + ", buffered position=" + this.q + ", speed=" + this.x + ", updated=" + this.a2 + ", actions=" + this.y + ", error code=" + this.Y1 + ", error message=" + this.Z1 + ", custom actions=" + this.b2 + ", active item id=" + this.c2 + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeFloat(this.x);
        parcel.writeLong(this.a2);
        parcel.writeLong(this.q);
        parcel.writeLong(this.y);
        TextUtils.writeToParcel(this.Z1, parcel, i);
        parcel.writeTypedList(this.b2);
        parcel.writeLong(this.c2);
        parcel.writeBundle(this.d2);
        parcel.writeInt(this.Y1);
    }
}
