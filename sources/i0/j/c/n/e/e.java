package i0.j.c.n.e;

import com.instabug.chat.ui.f.d;

/* compiled from: ChatFragment */
public class e implements Runnable {
    public final /* synthetic */ d c;

    public e(d dVar) {
        this.c = dVar;
    }

    public void run() {
        d dVar = this.c;
        int i = d.c;
        P p = dVar.presenter;
        if (p != null) {
            ((b) p).o();
        }
    }
}
