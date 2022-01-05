package i0.j.b.t.k;

import com.instabug.bug.view.reporting.c;

/* compiled from: BaseReportingPresenter */
public class j implements Runnable {
    public final /* synthetic */ l c;
    public final /* synthetic */ c d;

    public j(c cVar, l lVar) {
        this.d = cVar;
        this.c = lVar;
    }

    public void run() {
        c cVar = this.d;
        if (cVar.d != c.h.SEND_BUG || cVar.q == 0) {
            this.c.a();
            int i = c.d.a[this.d.d.ordinal()];
            if (i == 1) {
                this.d.s();
            } else if (i == 2) {
                this.d.b();
            } else if (i == 3) {
                this.d.n();
            }
        }
    }
}
