package i0.h.a.b.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.zza;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class d implements Parcelable.Creator<zza> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zza(parcel.readStrongBinder());
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zza[i];
    }
}
