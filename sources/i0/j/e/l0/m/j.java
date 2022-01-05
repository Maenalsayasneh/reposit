package i0.j.e.l0.m;

import com.instabug.library.internal.storage.AttachmentManager;
import com.instabug.library.internal.video.InstabugVideoUtils;
import com.instabug.library.internal.video.InternalAutoScreenRecorderHelper;
import com.instabug.library.internal.video.ScreenRecordingService;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import java.io.IOException;

/* compiled from: ScreenRecordingSession */
public class j implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ k d;

    public j(k kVar, int i) {
        this.d = kVar;
        this.c = i;
    }

    public void run() {
        File file = new File(this.d.e);
        try {
            File startTrim = InstabugVideoUtils.startTrim(file, AttachmentManager.getAutoScreenRecordingFile(this.d.a), this.c);
            InstabugSDKLogger.d("ScreenRecordingSession", "Recorded video file size after trim: " + (startTrim.length() / 1024) + " KB");
            InternalAutoScreenRecorderHelper.getInstance().setAutoScreenRecordingFile(startTrim);
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
            InternalAutoScreenRecorderHelper.getInstance().setAutoScreenRecordingFile(file);
        }
        ScreenRecordingService.this.stopSelf();
    }
}
