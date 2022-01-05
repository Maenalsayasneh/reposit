package i0.h.a.d.a.b;

import com.google.android.play.core.common.LocalTestingException;
import java.util.Objects;

public final /* synthetic */ class k1 implements Runnable {
    public final n1 c;
    public final int d;
    public final String q;

    public k1(n1 n1Var, int i, String str) {
        this.c = n1Var;
        this.d = i;
        this.q = str;
    }

    public final void run() {
        n1 n1Var = this.c;
        int i = this.d;
        String str = this.q;
        Objects.requireNonNull(n1Var);
        try {
            n1Var.c(i, str, 4);
        } catch (LocalTestingException e) {
            n1.a.b(5, "notifyModuleCompleted failed", new Object[]{e});
        }
    }
}
