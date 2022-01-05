package i0.h.a.b.c.g.j;

import android.os.Handler;
import i0.h.a.b.c.g.j.c;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class r implements c.a {
    public final /* synthetic */ f a;

    public r(f fVar) {
        this.a = fVar;
    }

    public final void a(boolean z) {
        Handler handler = this.a.q;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
