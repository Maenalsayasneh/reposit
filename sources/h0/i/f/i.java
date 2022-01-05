package h0.i.f;

import h0.i.f.j;
import h0.i.h.a;

/* compiled from: FontRequestWorker */
public class i implements a<j.a> {
    public final /* synthetic */ String a;

    public i(String str) {
        this.a = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0 >= r2.size()) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        ((h0.i.h.a) r2.get(r0)).b(r5);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        r0 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(h0.i.f.j.a r5) {
        /*
            r4 = this;
            java.lang.Object r0 = h0.i.f.j.c
            monitor-enter(r0)
            h0.f.h<java.lang.String, java.util.ArrayList<h0.i.h.a<h0.i.f.j$a>>> r1 = h0.i.f.j.d     // Catch:{ all -> 0x002b }
            java.lang.String r2 = r4.a     // Catch:{ all -> 0x002b }
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002b }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0011:
            java.lang.String r3 = r4.a     // Catch:{ all -> 0x002b }
            r1.remove(r3)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            r0 = 0
        L_0x0018:
            int r1 = r2.size()
            if (r0 >= r1) goto L_0x002a
            java.lang.Object r1 = r2.get(r0)
            h0.i.h.a r1 = (h0.i.h.a) r1
            r1.b(r5)
            int r0 = r0 + 1
            goto L_0x0018
        L_0x002a:
            return
        L_0x002b:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.f.i.b(h0.i.f.j$a):void");
    }
}
