package i0.e.c.e.j;

import i0.b.c.c;
import i0.d.a.a.a;

/* compiled from: CreateChatUserViewModel_ */
public class b implements Runnable {
    public final /* synthetic */ a c;
    public final /* synthetic */ int d;
    public final /* synthetic */ c q;

    public b(c cVar, a aVar, int i) {
        this.q = cVar;
        this.c = aVar;
        this.d = i;
    }

    public void run() {
        try {
            c.a(new d(this.c), this.q.m, c.i);
        } catch (AssertionError e) {
            StringBuilder P0 = a.P0("CreateChatUserViewModel_ model at position ");
            P0.append(this.d);
            P0.append(" has an invalid style:\n\n");
            P0.append(e.getMessage());
            throw new IllegalStateException(P0.toString());
        }
    }
}
