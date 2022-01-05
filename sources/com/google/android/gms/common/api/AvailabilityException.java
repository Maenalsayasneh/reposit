package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import h0.f.a;
import h0.f.g;
import i0.h.a.b.c.g.j.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public class AvailabilityException extends Exception {
    public final a<b<?>, ConnectionResult> c;

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((g.c) this.c.keySet()).iterator();
        boolean z = true;
        while (true) {
            g.a aVar = (g.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            b bVar = (b) aVar.next();
            ConnectionResult connectionResult = this.c.get(bVar);
            Objects.requireNonNull(connectionResult, "null reference");
            if (connectionResult.I0()) {
                z = false;
            }
            String str = bVar.b.c;
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(valueOf.length() + String.valueOf(str).length() + 2);
            sb.append(str);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
