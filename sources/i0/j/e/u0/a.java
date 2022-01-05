package i0.j.e.u0;

import com.instabug.library.model.session.SessionState;
import k0.b.y.d;

/* compiled from: SessionProfiler */
public class a implements d<SessionState> {
    public final /* synthetic */ b c;

    public a(b bVar) {
        this.c = bVar;
    }

    public void b(Object obj) throws Exception {
        SessionState sessionState = (SessionState) obj;
        if (sessionState == SessionState.START) {
            this.c.a();
        } else if (sessionState == SessionState.FINISH) {
            this.c.b();
        }
    }
}
