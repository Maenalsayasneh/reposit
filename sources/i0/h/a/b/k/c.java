package i0.h.a.b.k;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import i0.h.a.b.c.g.a;
import i0.h.a.b.c.g.c;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class c extends a.C0131a<i0.h.a.b.k.b.a, a> {
    public final a.f a(Context context, Looper looper, i0.h.a.b.c.i.c cVar, Object obj, c.a aVar, c.b bVar) {
        a aVar2 = (a) obj;
        a aVar3 = cVar.h;
        Integer num = cVar.i;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", cVar.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (aVar3 != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        }
        return new i0.h.a.b.k.b.a(context, looper, true, cVar, bundle, aVar, bVar);
    }
}
