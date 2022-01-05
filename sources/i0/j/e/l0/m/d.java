package i0.j.e.l0.m;

import com.instabug.library.internal.video.ScreenRecordingEvent;
import i0.j.e.l0.m.l.i;

/* compiled from: ScreenRecordingService */
public class d implements i.d {
    public final /* synthetic */ ScreenRecordingEvent a;
    public final /* synthetic */ e b;

    public d(e eVar, ScreenRecordingEvent screenRecordingEvent) {
        this.b = eVar;
        this.a = screenRecordingEvent;
    }

    public void a(long j) {
    }

    public void b(Throwable th) {
        k kVar;
        if (this.a.getStatus() == 1 && (kVar = this.b.c.y) != null) {
            kVar.b();
        }
    }

    public void onStart() {
    }
}
