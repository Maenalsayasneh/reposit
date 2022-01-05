package i0.j.e.o0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* compiled from: ExperimentsManagerImpl */
public class b implements a {
    public static final Object a = new Object();

    /* compiled from: ExperimentsManagerImpl */
    public class a implements Runnable {
        public final /* synthetic */ List c;

        public a(List list) {
            this.c = list;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                java.lang.Object r0 = i0.j.e.o0.b.a
                java.lang.Object r0 = i0.j.e.o0.b.a
                monitor-enter(r0)
                i0.j.e.o0.b r1 = i0.j.e.o0.b.this     // Catch:{ all -> 0x0069 }
                java.util.List r2 = r7.c     // Catch:{ all -> 0x0069 }
                java.util.List r1 = i0.j.e.o0.b.d(r1, r2)     // Catch:{ all -> 0x0069 }
                i0.j.e.o0.b r2 = i0.j.e.o0.b.this     // Catch:{ all -> 0x0069 }
                java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x0069 }
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0069 }
                r2.<init>()     // Catch:{ all -> 0x0069 }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0069 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0069 }
                r3 = 0
            L_0x001e:
                boolean r4 = r1.hasNext()     // Catch:{ all -> 0x0069 }
                if (r4 == 0) goto L_0x0040
                java.lang.Object r4 = r1.next()     // Catch:{ all -> 0x0069 }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0069 }
                java.lang.String r5 = r4.trim()     // Catch:{ all -> 0x0069 }
                int r5 = r5.length()     // Catch:{ all -> 0x0069 }
                r6 = 70
                if (r5 <= r6) goto L_0x0038
                r3 = 1
                goto L_0x001e
            L_0x0038:
                java.lang.String r4 = r4.trim()     // Catch:{ all -> 0x0069 }
                r2.add(r4)     // Catch:{ all -> 0x0069 }
                goto L_0x001e
            L_0x0040:
                if (r3 == 0) goto L_0x0049
                java.lang.String r1 = "Instabug"
                java.lang.String r3 = "Some experiments weren't added. Max allowed experiments characters limit is reached. Please note that you can add experiments with characters count up to 70 characters."
                com.instabug.library.util.InstabugSDKLogger.e(r1, r3)     // Catch:{ all -> 0x0069 }
            L_0x0049:
                boolean r1 = r2.isEmpty()     // Catch:{ all -> 0x0069 }
                if (r1 == 0) goto L_0x0051
                monitor-exit(r0)     // Catch:{ all -> 0x0069 }
                return
            L_0x0051:
                i0.j.e.o0.c.a r1 = i0.j.e.o0.d.a.c()     // Catch:{ all -> 0x0069 }
                r1.c(r2)     // Catch:{ all -> 0x0069 }
                r2 = 600(0x258, float:8.41E-43)
                int r1 = r1.e(r2)     // Catch:{ all -> 0x0069 }
                if (r1 <= 0) goto L_0x0067
                java.lang.String r1 = "Instabug"
                java.lang.String r2 = "Some old experiments were removed. Max allowed experiments reached. Please note that you can add up to 600 experiments."
                com.instabug.library.util.InstabugSDKLogger.w(r1, r2)     // Catch:{ all -> 0x0069 }
            L_0x0067:
                monitor-exit(r0)     // Catch:{ all -> 0x0069 }
                return
            L_0x0069:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0069 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.j.e.o0.b.a.run():void");
        }
    }

    /* renamed from: i0.j.e.o0.b$b  reason: collision with other inner class name */
    /* compiled from: ExperimentsManagerImpl */
    public class C0183b implements Runnable {
        public final /* synthetic */ List c;

        public C0183b(List list) {
            this.c = list;
        }

        public void run() {
            Object obj = b.a;
            synchronized (b.a) {
                i0.j.e.o0.d.a.c().i(b.d(b.this, this.c));
            }
        }
    }

    /* compiled from: ExperimentsManagerImpl */
    public class c implements Runnable {
        public void run() {
            Object obj = b.a;
            synchronized (b.a) {
                i0.j.e.o0.d.a.c().a();
            }
        }
    }

    public static List d(b bVar, List list) {
        Objects.requireNonNull(bVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!arrayList.contains(str.toLowerCase(Locale.getDefault()))) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public void a() {
        i0.j.e.o0.d.a.e().execute(new c());
    }

    public List<String> b() {
        return i0.j.e.o0.d.a.c().b();
    }

    public void c(List<String> list) {
        if (list != null && !list.isEmpty()) {
            i0.j.e.o0.d.a.e().execute(new a(list));
        }
    }

    public void i(List<String> list) {
        if (list != null && !list.isEmpty()) {
            i0.j.e.o0.d.a.e().execute(new C0183b(list));
        }
    }
}
