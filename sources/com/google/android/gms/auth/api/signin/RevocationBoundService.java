package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import i0.h.a.b.a.a.d.b.r;

/* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
public final class RevocationBoundService extends Service {
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) || "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            if (Log.isLoggable("RevocationService", 2)) {
                String valueOf = String.valueOf(intent.getAction());
                Log.v("RevocationService", valueOf.length() != 0 ? "RevocationBoundService handling ".concat(valueOf) : new String("RevocationBoundService handling "));
            }
            return new r(this);
        }
        String valueOf2 = String.valueOf(intent.getAction());
        Log.w("RevocationService", valueOf2.length() != 0 ? "Unknown action sent to RevocationBoundService: ".concat(valueOf2) : new String("Unknown action sent to RevocationBoundService: "));
        return null;
    }
}
