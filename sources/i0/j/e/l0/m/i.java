package i0.j.e.l0.m;

import com.instabug.library.internal.video.ScreenRecordingService;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;

/* compiled from: ScreenRecordingSession */
public class i implements Runnable {
    public final /* synthetic */ k c;

    public i(k kVar) {
        this.c = kVar;
    }

    public void run() {
        File file = new File(this.c.e);
        if (!file.exists()) {
            InstabugSDKLogger.d("ScreenRecordingSession", "Screen recording file doesn't exist - couldn't be deleted");
            return;
        }
        if (!file.delete()) {
            InstabugSDKLogger.d("ScreenRecordingSession", "Screen recording file couldn't be deleted");
        }
        ScreenRecordingService.this.stopSelf();
    }
}
