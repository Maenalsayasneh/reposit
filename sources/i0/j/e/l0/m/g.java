package i0.j.e.l0.m;

import com.instabug.library.internal.video.ScreenRecordingService;
import com.instabug.library.util.threading.PoolProvider;
import k0.b.y.d;

/* compiled from: ScreenRecordingService */
public class g implements d<ScreenRecordingService.Action> {
    public final /* synthetic */ ScreenRecordingService c;

    public g(ScreenRecordingService screenRecordingService) {
        this.c = screenRecordingService;
    }

    public void b(Object obj) throws Exception {
        PoolProvider.postComputationTask(new f(this, (ScreenRecordingService.Action) obj));
    }
}
