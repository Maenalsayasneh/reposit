package i0.j.e.l0.m;

import android.app.ActivityManager;
import com.instabug.library.Instabug;
import com.instabug.library.internal.video.ScreenRecordingService;
import com.instabug.library.model.session.SessionState;
import java.util.Iterator;
import k0.b.y.d;

/* compiled from: ScreenRecordingService */
public class b implements d<SessionState> {
    public final /* synthetic */ ScreenRecordingService c;

    public b(ScreenRecordingService screenRecordingService) {
        this.c = screenRecordingService;
    }

    public void b(Object obj) throws Exception {
        boolean z;
        SessionState sessionState = (SessionState) obj;
        if (Instabug.getApplicationContext() != null && sessionState == SessionState.FINISH) {
            Class<ScreenRecordingService> cls = ScreenRecordingService.class;
            ActivityManager activityManager = (ActivityManager) this.c.getApplicationContext().getSystemService("activity");
            if (activityManager != null) {
                Iterator<ActivityManager.RunningServiceInfo> it = activityManager.getRunningServices(Integer.MAX_VALUE).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningServiceInfo next = it.next();
                    if (cls.getName().equals(next.service.getClassName()) && next.foreground) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                ScreenRecordingService screenRecordingService = this.c;
                int i = ScreenRecordingService.c;
                screenRecordingService.b();
            }
        }
    }
}
