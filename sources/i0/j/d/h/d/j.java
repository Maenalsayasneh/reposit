package i0.j.d.h.d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: InstaToastManager */
public class j {
    public static j a;
    public final Object b = new Object();
    public final Handler c = new Handler(Looper.getMainLooper(), new a());
    public c d;
    public c e;

    /* compiled from: InstaToastManager */
    public class a implements Handler.Callback {
        public a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            j jVar = j.this;
            c cVar = (c) message.obj;
            synchronized (jVar.b) {
                if (jVar.d == cVar || jVar.e == cVar) {
                    jVar.c(cVar, 2);
                }
            }
            return true;
        }
    }

    /* compiled from: InstaToastManager */
    public interface b {
        void a();

        void e(int i);
    }

    /* compiled from: InstaToastManager */
    public static class c {
        public final WeakReference<b> a;
        public int b;

        public c(int i, b bVar) {
            this.a = new WeakReference<>(bVar);
            this.b = i;
        }
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (a == null) {
                a = new j();
            }
            jVar = a;
        }
        return jVar;
    }

    public void b(b bVar) {
        synchronized (this.b) {
            if (this.d != null && h(bVar)) {
                this.c.removeCallbacksAndMessages(this.d);
            }
        }
    }

    public final boolean c(c cVar, int i) {
        b bVar = (b) cVar.a.get();
        if (bVar == null) {
            return false;
        }
        bVar.e(i);
        return true;
    }

    public final void d() {
        c cVar = this.e;
        if (cVar != null) {
            this.d = cVar;
            this.e = null;
            b bVar = (b) cVar.a.get();
            if (bVar != null) {
                bVar.a();
            } else {
                this.d = null;
            }
        }
    }

    public final void e(c cVar) {
        int i = cVar.b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.c.removeCallbacksAndMessages(cVar);
            Handler handler = this.c;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(i0.j.d.h.d.j.b r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            i0.j.d.h.d.j$c r1 = r2.d     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0009:
            boolean r3 = r2.h(r3)     // Catch:{ all -> 0x0016 }
            if (r3 == 0) goto L_0x0014
            i0.j.d.h.d.j$c r3 = r2.d     // Catch:{ all -> 0x0016 }
            r2.e(r3)     // Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0016:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.d.h.d.j.f(i0.j.d.h.d.j$b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(i0.j.d.h.d.j.b r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            i0.j.d.h.d.j$c r1 = r2.d     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0009:
            boolean r3 = r2.h(r3)     // Catch:{ all -> 0x0016 }
            if (r3 == 0) goto L_0x0014
            i0.j.d.h.d.j$c r3 = r2.d     // Catch:{ all -> 0x0016 }
            r2.e(r3)     // Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0016:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.d.h.d.j.g(i0.j.d.h.d.j$b):void");
    }

    public final boolean h(b bVar) {
        c cVar = this.d;
        if (cVar != null) {
            if (bVar != null && cVar.a.get() == bVar) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(b bVar) {
        c cVar = this.e;
        if (cVar != null) {
            if (bVar != null && cVar.a.get() == bVar) {
                return true;
            }
        }
        return false;
    }
}
