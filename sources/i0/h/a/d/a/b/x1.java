package i0.h.a.d.a.b;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public final /* synthetic */ class x1 implements Runnable {
    public final y c;

    public x1(y yVar) {
        this.c = yVar;
    }

    public final void run() {
        y yVar = this.c;
        Iterator it = ((ArrayList) yVar.d()).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file.listFiles() != null) {
                y.b(file);
                long c2 = y.c(file, false);
                if (((long) yVar.c.a()) != c2) {
                    try {
                        new File(new File(file, String.valueOf(c2)), "stale.tmp").createNewFile();
                    } catch (IOException unused) {
                        y.a.b(6, "Could not write staleness marker.", new Object[0]);
                    }
                }
                for (File b : file.listFiles()) {
                    y.b(b);
                }
            }
        }
    }
}
