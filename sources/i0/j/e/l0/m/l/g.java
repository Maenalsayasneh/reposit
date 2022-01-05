package i0.j.e.l0.m.l;

import android.media.MediaCodec;
import i0.j.e.l0.m.l.c;
import i0.j.e.l0.m.l.h;

/* compiled from: MicRecorder */
public class g implements Runnable {
    public final /* synthetic */ c c;
    public final /* synthetic */ int d;
    public final /* synthetic */ MediaCodec.BufferInfo q;
    public final /* synthetic */ h.a x;

    public g(h.a aVar, c cVar, int i, MediaCodec.BufferInfo bufferInfo) {
        this.x = aVar;
        this.c = cVar;
        this.d = i;
        this.q = bufferInfo;
    }

    public void run() {
        c.b bVar = this.x.a;
        if (bVar != null) {
            bVar.b(this.c, this.d, this.q);
        }
    }
}
