package i0.e.c.c.k0;

import i0.b.c.c;
import i0.d.a.a.a;

/* compiled from: ChatMessageViewModel_ */
public class f implements Runnable {
    public final /* synthetic */ d c;
    public final /* synthetic */ int d;
    public final /* synthetic */ g q;

    public f(g gVar, d dVar, int i) {
        this.q = gVar;
        this.c = dVar;
        this.d = i;
    }

    public void run() {
        try {
            c.a(new h(this.c), this.q.z, g.i);
        } catch (AssertionError e) {
            StringBuilder P0 = a.P0("ChatMessageViewModel_ model at position ");
            P0.append(this.d);
            P0.append(" has an invalid style:\n\n");
            P0.append(e.getMessage());
            throw new IllegalStateException(P0.toString());
        }
    }
}
