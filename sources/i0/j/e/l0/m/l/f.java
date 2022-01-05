package i0.j.e.l0.m.l;

import android.media.MediaFormat;
import i0.j.e.l0.m.l.c;
import i0.j.e.l0.m.l.h;

/* compiled from: MicRecorder */
public class f implements Runnable {
    public final /* synthetic */ c c;
    public final /* synthetic */ MediaFormat d;
    public final /* synthetic */ h.a q;

    public f(h.a aVar, c cVar, MediaFormat mediaFormat) {
        this.q = aVar;
        this.c = cVar;
        this.d = mediaFormat;
    }

    public void run() {
        c.b bVar = this.q.a;
        if (bVar != null) {
            bVar.c(this.c, this.d);
        }
    }
}
