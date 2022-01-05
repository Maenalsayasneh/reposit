package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

public class MediaSessionCompat {

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();
        public final MediaDescriptionCompat c;
        public final long d;

        public static class a implements Parcelable.Creator<QueueItem> {
            public Object createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public Object[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(Parcel parcel) {
            this.c = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.d = parcel.readLong();
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("MediaSession.QueueItem {Description=");
            P0.append(this.c);
            P0.append(", Id=");
            P0.append(this.d);
            P0.append(" }");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.c.writeToParcel(parcel, i);
            parcel.writeLong(this.d);
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
        public ResultReceiver c;

        public static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            public Object createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public Object[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.c = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.c.writeToParcel(parcel, i);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();
        public final Object c;
        public g0.a.b.b.b.a d = null;

        public static class a implements Parcelable.Creator<Token> {
            public Object createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            public Object[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj) {
            this.c = obj;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.c;
            if (obj2 != null) {
                Object obj3 = token.c;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.c == null) {
                return true;
            } else {
                return false;
            }
        }

        public int hashCode() {
            Object obj = this.c;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.c, i);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
