package h0.i.f;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import com.instabug.library.networkv2.connection.InstabugBaseConnectionManagerImpl;
import h0.f.f;
import h0.f.h;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: FontRequestWorker */
public class j {
    public static final f<String, Typeface> a = new f<>(16);
    public static final ExecutorService b;
    public static final Object c = new Object();
    public static final h<String, ArrayList<h0.i.h.a<a>>> d = new h<>();

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) InstabugBaseConnectionManagerImpl.DEFAULT_READ_TIME_OUT, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h0.i.f.j.a a(java.lang.String r7, android.content.Context r8, h0.i.f.e r9, int r10) {
        /*
            h0.f.f<java.lang.String, android.graphics.Typeface> r0 = a
            java.lang.Object r0 = r0.a(r7)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0010
            h0.i.f.j$a r7 = new h0.i.f.j$a
            r7.<init>((android.graphics.Typeface) r0)
            return r7
        L_0x0010:
            r0 = 0
            h0.i.f.k r9 = h0.i.f.d.a(r8, r9, r0)     // Catch:{ NameNotFoundException -> 0x0061 }
            int r1 = r9.a
            r2 = -3
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x001e
            goto L_0x0035
        L_0x001e:
            r1 = -2
            goto L_0x003e
        L_0x0020:
            h0.i.f.l[] r1 = r9.b
            if (r1 == 0) goto L_0x003d
            int r4 = r1.length
            if (r4 != 0) goto L_0x0028
            goto L_0x003d
        L_0x0028:
            int r3 = r1.length
            r4 = 0
            r5 = r4
        L_0x002b:
            if (r5 >= r3) goto L_0x003c
            r6 = r1[r5]
            int r6 = r6.e
            if (r6 == 0) goto L_0x0039
            if (r6 >= 0) goto L_0x0037
        L_0x0035:
            r1 = r2
            goto L_0x003e
        L_0x0037:
            r1 = r6
            goto L_0x003e
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x002b
        L_0x003c:
            r3 = r4
        L_0x003d:
            r1 = r3
        L_0x003e:
            if (r1 == 0) goto L_0x0046
            h0.i.f.j$a r7 = new h0.i.f.j$a
            r7.<init>((int) r1)
            return r7
        L_0x0046:
            h0.i.f.l[] r9 = r9.b
            h0.i.c.l r1 = h0.i.c.e.a
            android.graphics.Typeface r8 = r1.b(r8, r0, r9, r10)
            if (r8 == 0) goto L_0x005b
            h0.f.f<java.lang.String, android.graphics.Typeface> r9 = a
            r9.b(r7, r8)
            h0.i.f.j$a r7 = new h0.i.f.j$a
            r7.<init>((android.graphics.Typeface) r8)
            return r7
        L_0x005b:
            h0.i.f.j$a r7 = new h0.i.f.j$a
            r7.<init>((int) r2)
            return r7
        L_0x0061:
            h0.i.f.j$a r7 = new h0.i.f.j$a
            r8 = -1
            r7.<init>((int) r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.f.j.a(java.lang.String, android.content.Context, h0.i.f.e, int):h0.i.f.j$a");
    }

    /* compiled from: FontRequestWorker */
    public static final class a {
        public final Typeface a;
        public final int b;

        public a(int i) {
            this.a = null;
            this.b = i;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.a = typeface;
            this.b = 0;
        }
    }
}
