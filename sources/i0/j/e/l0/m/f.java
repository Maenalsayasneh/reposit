package i0.j.e.l0.m;

import com.instabug.library.internal.video.ScreenRecordingService;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.threading.PoolProvider;
import i0.j.e.l0.m.l.i;
import java.util.Objects;

/* compiled from: ScreenRecordingService */
public class f implements Runnable {
    public final /* synthetic */ ScreenRecordingService.Action c;
    public final /* synthetic */ g d;

    /* compiled from: ScreenRecordingService */
    public class a implements i.d {
        public a() {
        }

        public void a(long j) {
        }

        public void b(Throwable th) {
            f fVar = f.this;
            ScreenRecordingService screenRecordingService = fVar.d.c;
            if (screenRecordingService.y == null) {
                screenRecordingService.stopSelf();
                return;
            }
            int i = ScreenRecordingService.c.a[fVar.c.ordinal()];
            if (i == 1) {
                k kVar = f.this.d.c.y;
                Objects.requireNonNull(kVar);
                PoolProvider.postIOTask(new i(kVar));
            } else if (i == 2) {
                f.this.d.c.y.b();
            } else if (i == 3) {
                k kVar2 = f.this.d.c.y;
                int autoScreenRecordingMaxDuration = SettingsManager.getInstance().autoScreenRecordingMaxDuration();
                synchronized (kVar2) {
                    PoolProvider.postBitmapTask(new j(kVar2, autoScreenRecordingMaxDuration));
                }
            }
        }

        public void onStart() {
        }
    }

    public f(g gVar, ScreenRecordingService.Action action) {
        this.d = gVar;
        this.c = action;
    }

    public void run() {
        if (SettingsManager.getInstance().isScreenCurrentlyRecorded()) {
            SettingsManager.getInstance().setScreenCurrentlyRecorded(false);
            k kVar = this.d.c.y;
            if (kVar != null) {
                kVar.a(new a());
            }
        }
    }
}
