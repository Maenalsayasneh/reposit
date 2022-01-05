package i0.j.e.m0.d;

import com.instabug.library.model.session.SessionState;
import k0.b.y.d;

/* compiled from: ScreenshotGestureInvoker */
public class h implements d<SessionState> {
    public final /* synthetic */ i c;

    public h(i iVar) {
        this.c = iVar;
    }

    public void b(Object obj) throws Exception {
        if (((SessionState) obj).equals(SessionState.START)) {
            this.c.y = true;
        }
    }
}
