package i0.h.a.b.g.a;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import i0.h.a.b.a.a.a;
import i0.h.a.b.c.g.c;
import i0.h.a.b.c.i.c;
import i0.h.a.b.c.i.d;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
public final class e extends d<g> {
    public final a.C0129a A;

    public e(Context context, Looper looper, c cVar, a.C0129a aVar, c.a aVar2, c.b bVar) {
        super(context, looper, 68, cVar, aVar2, bVar);
        a.C0129a.C0130a aVar3 = new a.C0129a.C0130a(aVar == null ? a.C0129a.c : aVar);
        byte[] bArr = new byte[16];
        a.a.nextBytes(bArr);
        aVar3.c = Base64.encodeToString(bArr, 11);
        this.A = new a.C0129a(aVar3);
    }

    public final int j() {
        return 12800000;
    }

    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof g) {
            return (g) queryLocalInterface;
        }
        return new f(iBinder);
    }

    public final Bundle s() {
        a.C0129a aVar = this.A;
        Objects.requireNonNull(aVar);
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", aVar.d);
        bundle.putBoolean("force_save_dialog", aVar.q);
        bundle.putString("log_session_id", aVar.x);
        return bundle;
    }

    public final String v() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final String w() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
