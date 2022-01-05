package i0.h.c.t;

import android.content.Intent;
import i0.h.a.b.m.h;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final /* synthetic */ class d implements Runnable {
    public final g c;
    public final Intent d;
    public final h q;

    public d(g gVar, Intent intent, h hVar) {
        this.c = gVar;
        this.d = intent;
        this.q = hVar;
    }

    public void run() {
        g gVar = this.c;
        Intent intent = this.d;
        h hVar = this.q;
        Objects.requireNonNull(gVar);
        try {
            gVar.b(intent);
        } finally {
            hVar.a.q(null);
        }
    }
}
