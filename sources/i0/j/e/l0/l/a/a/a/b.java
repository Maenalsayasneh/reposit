package i0.j.e.l0.l.a.a.a;

import com.instabug.library.internal.utils.stability.handler.penalty.PenaltyHandler;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: LogPenaltyHandler */
public class b implements PenaltyHandler {
    public final String a;

    public b(String str) {
        this.a = str;
    }

    public int getPenaltyType() {
        return 1;
    }

    public void handle(Exception exc) {
        InstabugSDKLogger.e(this.a, exc.getClass().getSimpleName(), exc);
    }
}
