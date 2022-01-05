package i0.j.c.i;

import android.net.Uri;
import com.instabug.library.internal.video.InternalScreenRecordHelper;
import com.instabug.library.internal.video.ScreenRecordingEvent;
import k0.b.y.d;

/* compiled from: ExternalScreenRecordHelper */
public class a implements d<ScreenRecordingEvent> {
    public final /* synthetic */ c c;

    public a(c cVar) {
        this.c = cVar;
    }

    public void b(Object obj) throws Exception {
        ScreenRecordingEvent screenRecordingEvent = (ScreenRecordingEvent) obj;
        if (screenRecordingEvent.getStatus() == 2) {
            c.a(this.c, screenRecordingEvent.getVideoUri());
            this.c.clear();
        } else if (screenRecordingEvent.getStatus() == 0) {
            c.a(this.c, screenRecordingEvent.getVideoUri());
            InternalScreenRecordHelper.getInstance().release();
            this.c.clear();
        } else if (screenRecordingEvent.getStatus() == 4) {
            c.a(this.c, (Uri) null);
            InternalScreenRecordHelper.getInstance().release();
            this.c.clear();
        }
    }
}
