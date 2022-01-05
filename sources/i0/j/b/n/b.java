package i0.j.b.n;

import android.net.Uri;
import com.instabug.library.internal.video.InternalScreenRecordHelper;
import com.instabug.library.internal.video.ScreenRecordingEvent;
import k0.b.y.d;

/* compiled from: ExternalScreenRecordHelper */
public class b implements d<ScreenRecordingEvent> {
    public final /* synthetic */ c c;

    public b(c cVar) {
        this.c = cVar;
    }

    public void b(Object obj) throws Exception {
        ScreenRecordingEvent screenRecordingEvent = (ScreenRecordingEvent) obj;
        if (screenRecordingEvent.getStatus() == 2) {
            c.a(this.c, screenRecordingEvent.getVideoUri());
            this.c.clear();
        } else if (screenRecordingEvent.getStatus() == 0) {
            InternalScreenRecordHelper.getInstance().release();
            c.a(this.c, screenRecordingEvent.getVideoUri());
            this.c.clear();
        } else if (screenRecordingEvent.getStatus() == 4) {
            InternalScreenRecordHelper.getInstance().release();
            c.a(this.c, (Uri) null);
            this.c.clear();
        } else if (screenRecordingEvent.getStatus() == 3) {
            InternalScreenRecordHelper.getInstance().release();
            this.c.clear();
        }
    }
}
