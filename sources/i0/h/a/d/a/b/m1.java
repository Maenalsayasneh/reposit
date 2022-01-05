package i0.h.a.d.a.b;

import android.content.Intent;

public final /* synthetic */ class m1 implements Runnable {
    public final n1 c;
    public final Intent d;

    public m1(n1 n1Var, Intent intent) {
        this.c = n1Var;
        this.d = intent;
    }

    public final void run() {
        n1 n1Var = this.c;
        n1Var.c.a(n1Var.d, this.d);
    }
}
