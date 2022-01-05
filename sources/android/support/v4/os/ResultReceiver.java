package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import g0.a.b.c.a;

@SuppressLint({"BanParcelableUsage"})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();
    public g0.a.b.c.a c;

    public class a implements Parcelable.Creator<ResultReceiver> {
        public Object createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        public Object[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    public class b extends a.C0011a {
        public b() {
        }
    }

    public ResultReceiver(Parcel parcel) {
        g0.a.b.c.a aVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i = a.C0011a.a;
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof g0.a.b.c.a)) {
                aVar = new a.C0011a.C0012a(readStrongBinder);
            } else {
                aVar = (g0.a.b.c.a) queryLocalInterface;
            }
        }
        this.c = aVar;
    }

    public void a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.c == null) {
                this.c = new b();
            }
            parcel.writeStrongBinder(this.c.asBinder());
        }
    }
}
