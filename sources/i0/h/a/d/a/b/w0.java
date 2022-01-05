package i0.h.a.d.a.b;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

public final /* synthetic */ class w0 implements e1 {
    public final f1 a;
    public final String b;
    public final int c;
    public final long d;

    public w0(f1 f1Var, String str, int i, long j) {
        this.a = f1Var;
        this.b = str;
        this.c = i;
        this.d = j;
    }

    public final Object a() {
        f1 f1Var = this.a;
        String str = this.b;
        int i = this.c;
        long j = this.d;
        Objects.requireNonNull(f1Var);
        c1 c1Var = (c1) ((Map) f1Var.a(new x0(f1Var, Arrays.asList(new String[]{str})))).get(str);
        if (c1Var == null || p1.d(c1Var.c.c)) {
            f1.a.b(6, String.format("Could not find pack %s while trying to complete it", new Object[]{str}), new Object[0]);
        }
        y yVar = f1Var.b;
        if (yVar.e(str, i, j).exists()) {
            y.g(yVar.e(str, i, j));
        }
        c1Var.c.c = 4;
        return null;
    }
}
