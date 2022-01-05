package n0.a.i2;

import i0.d.a.a.a;

/* compiled from: Tasks.kt */
public final class j extends h {
    public final Runnable q;

    public j(Runnable runnable, long j, i iVar) {
        super(j, iVar);
        this.q = runnable;
    }

    public void run() {
        try {
            this.q.run();
        } finally {
            this.d.n();
        }
    }

    public String toString() {
        StringBuilder P0 = a.P0("Task[");
        P0.append(m0.r.t.a.r.m.a1.a.I1(this.q));
        P0.append('@');
        P0.append(m0.r.t.a.r.m.a1.a.M1(this.q));
        P0.append(", ");
        P0.append(this.c);
        P0.append(", ");
        P0.append(this.d);
        P0.append(']');
        return P0.toString();
    }
}
