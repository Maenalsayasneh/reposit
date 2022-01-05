package i0.h.a.d.a.b;

import java.io.File;

public final /* synthetic */ class w1 implements Runnable {
    public final y1 c;
    public final v1 d;

    public w1(y1 y1Var, v1 v1Var) {
        this.c = y1Var;
        this.d = v1Var;
    }

    public final void run() {
        y1 y1Var = this.c;
        v1 v1Var = this.d;
        y yVar = y1Var.a;
        String str = v1Var.b;
        int i = v1Var.c;
        long j = v1Var.d;
        File a = yVar.a(str);
        if (a.exists()) {
            for (File file : a.listFiles()) {
                if (!file.getName().equals(String.valueOf(i)) && !file.getName().equals("stale.tmp")) {
                    y.g(file);
                } else if (file.getName().equals(String.valueOf(i))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j))) {
                            y.g(file2);
                        }
                    }
                }
            }
        }
    }
}
