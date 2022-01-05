package h0.l.a;

import android.view.Choreographer;
import h0.f.h;
import java.util.ArrayList;

/* compiled from: AnimationHandler */
public class a {
    public static final ThreadLocal<a> a = new ThreadLocal<>();
    public final h<b, Long> b = new h<>();
    public final ArrayList<b> c = new ArrayList<>();
    public final C0053a d = new C0053a();
    public c e;
    public long f = 0;
    public boolean g = false;

    /* renamed from: h0.l.a.a$a  reason: collision with other inner class name */
    /* compiled from: AnimationHandler */
    public class C0053a {
        public C0053a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0046 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a() {
            /*
                r10 = this;
                h0.l.a.a r0 = h0.l.a.a.this
                long r1 = android.os.SystemClock.uptimeMillis()
                r0.f = r1
                h0.l.a.a r0 = h0.l.a.a.this
                long r1 = r0.f
                long r3 = android.os.SystemClock.uptimeMillis()
                r5 = 0
                r6 = r5
            L_0x0012:
                java.util.ArrayList<h0.l.a.a$b> r7 = r0.c
                int r7 = r7.size()
                if (r6 >= r7) goto L_0x0049
                java.util.ArrayList<h0.l.a.a$b> r7 = r0.c
                java.lang.Object r7 = r7.get(r6)
                h0.l.a.a$b r7 = (h0.l.a.a.b) r7
                if (r7 != 0) goto L_0x0025
                goto L_0x0046
            L_0x0025:
                h0.f.h<h0.l.a.a$b, java.lang.Long> r8 = r0.b
                r9 = 0
                java.lang.Object r8 = r8.getOrDefault(r7, r9)
                java.lang.Long r8 = (java.lang.Long) r8
                if (r8 != 0) goto L_0x0031
                goto L_0x003e
            L_0x0031:
                long r8 = r8.longValue()
                int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r8 >= 0) goto L_0x0040
                h0.f.h<h0.l.a.a$b, java.lang.Long> r8 = r0.b
                r8.remove(r7)
            L_0x003e:
                r8 = 1
                goto L_0x0041
            L_0x0040:
                r8 = r5
            L_0x0041:
                if (r8 == 0) goto L_0x0046
                r7.a(r1)
            L_0x0046:
                int r6 = r6 + 1
                goto L_0x0012
            L_0x0049:
                boolean r1 = r0.g
                if (r1 == 0) goto L_0x0067
                java.util.ArrayList<h0.l.a.a$b> r1 = r0.c
                int r1 = r1.size()
            L_0x0053:
                int r1 = r1 + -1
                if (r1 < 0) goto L_0x0065
                java.util.ArrayList<h0.l.a.a$b> r2 = r0.c
                java.lang.Object r2 = r2.get(r1)
                if (r2 != 0) goto L_0x0053
                java.util.ArrayList<h0.l.a.a$b> r2 = r0.c
                r2.remove(r1)
                goto L_0x0053
            L_0x0065:
                r0.g = r5
            L_0x0067:
                h0.l.a.a r0 = h0.l.a.a.this
                java.util.ArrayList<h0.l.a.a$b> r0 = r0.c
                int r0 = r0.size()
                if (r0 <= 0) goto L_0x008b
                h0.l.a.a r0 = h0.l.a.a.this
                h0.l.a.a$c r1 = r0.e
                if (r1 != 0) goto L_0x0080
                h0.l.a.a$d r1 = new h0.l.a.a$d
                h0.l.a.a$a r2 = r0.d
                r1.<init>(r2)
                r0.e = r1
            L_0x0080:
                h0.l.a.a$c r0 = r0.e
                h0.l.a.a$d r0 = (h0.l.a.a.d) r0
                android.view.Choreographer r1 = r0.b
                android.view.Choreographer$FrameCallback r0 = r0.c
                r1.postFrameCallback(r0)
            L_0x008b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.l.a.a.C0053a.a():void");
        }
    }

    /* compiled from: AnimationHandler */
    public interface b {
        boolean a(long j);
    }

    /* compiled from: AnimationHandler */
    public static abstract class c {
        public final C0053a a;

        public c(C0053a aVar) {
            this.a = aVar;
        }
    }

    /* compiled from: AnimationHandler */
    public static class d extends c {
        public final Choreographer b = Choreographer.getInstance();
        public final Choreographer.FrameCallback c = new C0054a();

        /* renamed from: h0.l.a.a$d$a  reason: collision with other inner class name */
        /* compiled from: AnimationHandler */
        public class C0054a implements Choreographer.FrameCallback {
            public C0054a() {
            }

            public void doFrame(long j) {
                d.this.a.a();
            }
        }

        public d(C0053a aVar) {
            super(aVar);
        }
    }

    public static a a() {
        ThreadLocal<a> threadLocal = a;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }
}
