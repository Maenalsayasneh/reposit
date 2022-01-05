package i0.h.a.d.a.b;

import i0.h.a.d.a.j.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final /* synthetic */ class o2 implements c {
    public final y a;

    public o2(y yVar) {
        this.a = yVar;
    }

    public final void onSuccess(Object obj) {
        y yVar = this.a;
        List list = (List) obj;
        int a2 = yVar.c.a();
        Iterator it = ((ArrayList) yVar.d()).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!list.contains(file.getName()) && y.c(file, true) != ((long) a2)) {
                y.g(file);
            }
        }
    }
}
