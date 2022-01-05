package i0.j.e.l0.l.a.a.a;

import com.instabug.library.internal.utils.stability.handler.penalty.PenaltyHandler;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: DeathPenaltyHandler */
public class a implements PenaltyHandler {
    public int getPenaltyType() {
        return 2;
    }

    public void handle(Exception exc) {
        InstabugSDKLogger.e("DeathPenaltyHandler", exc.getClass().getSimpleName(), exc);
        throw new RuntimeException(exc);
    }
}
