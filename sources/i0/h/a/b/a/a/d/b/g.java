package i0.h.a.b.a.a.d.b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import i0.h.a.b.c.g.c;
import i0.h.a.b.c.i.c;
import i0.h.a.b.c.i.d;
import i0.h.a.b.g.a.a;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
public final class g extends d<q> {
    public final GoogleSignInOptions A;

    public g(Context context, Looper looper, c cVar, GoogleSignInOptions googleSignInOptions, c.a aVar, c.b bVar) {
        super(context, looper, 91, cVar, aVar, bVar);
        GoogleSignInOptions.a aVar2;
        if (googleSignInOptions != null) {
            aVar2 = new GoogleSignInOptions.a(googleSignInOptions);
        } else {
            aVar2 = new GoogleSignInOptions.a();
        }
        byte[] bArr = new byte[16];
        a.a.nextBytes(bArr);
        aVar2.i = Base64.encodeToString(bArr, 11);
        if (!cVar.c.isEmpty()) {
            for (Scope add : cVar.c) {
                aVar2.a.add(add);
                aVar2.a.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.A = aVar2.a();
    }

    public final int j() {
        return 12451000;
    }

    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof q) {
            return (q) queryLocalInterface;
        }
        return new p(iBinder);
    }

    public final String v() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final String w() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
