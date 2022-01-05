package i0.h.c.t;

import android.content.Intent;
import i0.h.a.b.m.c;
import i0.h.a.b.m.g;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final /* synthetic */ class f implements c {
    public final g c;
    public final Intent d;

    public f(g gVar, Intent intent) {
        this.c = gVar;
        this.d = intent;
    }

    public void onComplete(g gVar) {
        this.c.d(this.d);
    }
}
