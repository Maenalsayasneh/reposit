package i0.j.e.l0.m;

import com.instabug.library.internal.video.ScreenRecordingEvent;
import com.instabug.library.internal.video.ScreenRecordingService;
import com.instabug.library.settings.SettingsManager;
import k0.b.y.d;

/* compiled from: ScreenRecordingService */
public class e implements d<ScreenRecordingEvent> {
    public final /* synthetic */ ScreenRecordingService c;

    public e(ScreenRecordingService screenRecordingService) {
        this.c = screenRecordingService;
    }

    public void b(Object obj) throws Exception {
        ScreenRecordingEvent screenRecordingEvent = (ScreenRecordingEvent) obj;
        if (screenRecordingEvent.getStatus() == 3) {
            ScreenRecordingService screenRecordingService = this.c;
            int i = ScreenRecordingService.c;
            screenRecordingService.b();
        } else if (SettingsManager.getInstance().isScreenCurrentlyRecorded()) {
            SettingsManager.getInstance().setScreenCurrentlyRecorded(false);
            k kVar = this.c.y;
            if (kVar != null) {
                kVar.a(new d(this, screenRecordingEvent));
            }
        }
    }
}
