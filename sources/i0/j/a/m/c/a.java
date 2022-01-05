package i0.j.a.m.c;

import com.instabug.library.internal.utils.stability.handler.penalty.PenaltyHandler;

/* compiled from: APMLogPenaltyHandler */
public class a implements PenaltyHandler {
    public final i0.j.a.n.a.a a;

    public a(i0.j.a.n.a.a aVar) {
        this.a = aVar;
    }

    public int getPenaltyType() {
        return 1;
    }

    public void handle(Exception exc) {
        this.a.b(exc.getMessage() == null ? "An Exception has occurred" : exc.getMessage(), exc);
    }
}
