package i0.h.a.b.g.i;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.zza;
import i0.h.a.b.j.c;

public final class i implements c {
    public final Status c;
    public final zza d;

    public i(Status status, zza zza) {
        this.c = status;
        this.d = zza;
    }

    public final Status getStatus() {
        return this.c;
    }

    public final String r0() {
        zza zza = this.d;
        if (zza == null) {
            return null;
        }
        return zza.c;
    }
}
