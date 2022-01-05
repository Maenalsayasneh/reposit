package i0.h.a.d.a.b;

import com.google.android.play.core.assetpacks.bv;

public final /* synthetic */ class z0 implements e1 {
    public final f1 a;
    public final int b;

    public z0(f1 f1Var, int i) {
        this.a = f1Var;
        this.b = i;
    }

    public final Object a() {
        f1 f1Var = this.a;
        int i = this.b;
        c1 b2 = f1Var.b(i);
        if (p1.d(b2.c.c)) {
            y yVar = f1Var.b;
            b1 b1Var = b2.c;
            String str = b1Var.a;
            int i2 = b2.b;
            long j = b1Var.b;
            if (yVar.e(str, i2, j).exists()) {
                y.g(yVar.e(str, i2, j));
            }
            b1 b1Var2 = b2.c;
            int i3 = b1Var2.c;
            if (i3 != 5 && i3 != 6) {
                return null;
            }
            y yVar2 = f1Var.b;
            String str2 = b1Var2.a;
            int i4 = b2.b;
            long j2 = b1Var2.b;
            if (!yVar2.i(str2, i4, j2).exists()) {
                return null;
            }
            y.g(yVar2.i(str2, i4, j2));
            return null;
        }
        throw new bv(String.format("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i)}), i);
    }
}
