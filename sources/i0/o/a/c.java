package i0.o.a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.NetworkRequestHandler;
import com.squareup.picasso.Picasso;
import i0.o.a.v;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BitmapHunter */
public class c implements Runnable {
    public static final Object c = new Object();
    public static final ThreadLocal<StringBuilder> d = new a();
    public static final AtomicInteger q = new AtomicInteger();
    public static final v x = new b();
    public final Picasso Y1;
    public final i Z1;
    public final d a2;
    public final x b2;
    public final String c2;
    public final t d2;
    public final int e2;
    public int f2;
    public final v g2;
    public a h2;
    public List<a> i2;
    public Bitmap j2;
    public Future<?> k2;
    public Picasso.LoadedFrom l2;
    public Exception m2;
    public int n2;
    public int o2;
    public Picasso.Priority p2;
    public final int y = q.incrementAndGet();

    /* compiled from: BitmapHunter */
    public static class a extends ThreadLocal<StringBuilder> {
        public Object initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* compiled from: BitmapHunter */
    public static class b extends v {
        public boolean c(t tVar) {
            return true;
        }

        public v.a f(t tVar, int i) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + tVar);
        }
    }

    /* renamed from: i0.o.a.c$c  reason: collision with other inner class name */
    /* compiled from: BitmapHunter */
    public static class C0219c implements Runnable {
        public final /* synthetic */ z c;
        public final /* synthetic */ RuntimeException d;

        public C0219c(z zVar, RuntimeException runtimeException) {
            this.c = zVar;
            this.d = runtimeException;
        }

        public void run() {
            StringBuilder P0 = i0.d.a.a.a.P0("Transformation ");
            P0.append(this.c.b());
            P0.append(" crashed with exception.");
            throw new RuntimeException(P0.toString(), this.d);
        }
    }

    /* compiled from: BitmapHunter */
    public static class d implements Runnable {
        public final /* synthetic */ StringBuilder c;

        public d(StringBuilder sb) {
            this.c = sb;
        }

        public void run() {
            throw new NullPointerException(this.c.toString());
        }
    }

    /* compiled from: BitmapHunter */
    public static class e implements Runnable {
        public final /* synthetic */ z c;

        public e(z zVar) {
            this.c = zVar;
        }

        public void run() {
            StringBuilder P0 = i0.d.a.a.a.P0("Transformation ");
            P0.append(this.c.b());
            P0.append(" returned input Bitmap but recycled it.");
            throw new IllegalStateException(P0.toString());
        }
    }

    /* compiled from: BitmapHunter */
    public static class f implements Runnable {
        public final /* synthetic */ z c;

        public f(z zVar) {
            this.c = zVar;
        }

        public void run() {
            StringBuilder P0 = i0.d.a.a.a.P0("Transformation ");
            P0.append(this.c.b());
            P0.append(" mutated input Bitmap but failed to recycle the original.");
            throw new IllegalStateException(P0.toString());
        }
    }

    public c(Picasso picasso, i iVar, d dVar, x xVar, a aVar, v vVar) {
        this.Y1 = picasso;
        this.Z1 = iVar;
        this.a2 = dVar;
        this.b2 = xVar;
        this.h2 = aVar;
        this.c2 = aVar.i;
        t tVar = aVar.b;
        this.d2 = tVar;
        this.p2 = tVar.s;
        this.e2 = aVar.e;
        this.f2 = aVar.f;
        this.g2 = vVar;
        this.o2 = vVar.e();
    }

    public static Bitmap a(List<z> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            z zVar = list.get(i);
            try {
                Bitmap a3 = zVar.a(bitmap);
                if (a3 == null) {
                    StringBuilder P0 = i0.d.a.a.a.P0("Transformation ");
                    P0.append(zVar.b());
                    P0.append(" returned null after ");
                    P0.append(i);
                    P0.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (z b3 : list) {
                        P0.append(b3.b());
                        P0.append(10);
                    }
                    Picasso.a.post(new d(P0));
                    return null;
                } else if (a3 == bitmap && bitmap.isRecycled()) {
                    Picasso.a.post(new e(zVar));
                    return null;
                } else if (a3 == bitmap || bitmap.isRecycled()) {
                    i++;
                    bitmap = a3;
                } else {
                    Picasso.a.post(new f(zVar));
                    return null;
                }
            } catch (RuntimeException e3) {
                Picasso.a.post(new C0219c(zVar, e3));
                return null;
            }
        }
        return bitmap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: r0.t$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: r0.t$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: i0.o.a.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: r0.t$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap c(r0.y r9, i0.o.a.t r10) throws java.io.IOException {
        /*
            r0.i r9 = m0.r.t.a.r.m.a1.a.c0(r9)
            okio.ByteString r0 = i0.o.a.b0.b
            r0.t r9 = (r0.t) r9
            r1 = 0
            boolean r0 = r9.b(r1, r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001e
            r3 = 8
            okio.ByteString r0 = i0.o.a.b0.c
            boolean r0 = r9.b(r3, r0)
            if (r0 == 0) goto L_0x001e
            r0 = r1
            goto L_0x001f
        L_0x001e:
            r0 = r2
        L_0x001f:
            boolean r3 = r10.q
            android.graphics.BitmapFactory$Options r3 = i0.o.a.v.d(r10)
            if (r3 == 0) goto L_0x002d
            boolean r4 = r3.inJustDecodeBounds
            if (r4 == 0) goto L_0x002d
            r4 = r1
            goto L_0x002e
        L_0x002d:
            r4 = r2
        L_0x002e:
            if (r0 != 0) goto L_0x006f
            r0.t$a r0 = new r0.t$a
            r0.<init>(r9)
            r9 = 0
            if (r4 == 0) goto L_0x0060
            i0.o.a.p r4 = new i0.o.a.p
            r4.<init>(r0)
            r4.Y1 = r2
            r0 = 1024(0x400, float:1.435E-42)
            long r5 = r4.d
            long r7 = (long) r0
            long r5 = r5 + r7
            long r7 = r4.x
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x004e
            r4.b(r5)
        L_0x004e:
            long r5 = r4.d
            android.graphics.BitmapFactory.decodeStream(r4, r9, r3)
            int r0 = r10.g
            int r2 = r10.h
            i0.o.a.v.b(r0, r2, r3, r10)
            r4.a(r5)
            r4.Y1 = r1
            r0 = r4
        L_0x0060:
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r0, r9, r3)
            if (r9 == 0) goto L_0x0067
            return r9
        L_0x0067:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "Failed to decode stream."
            r9.<init>(r10)
            throw r9
        L_0x006f:
            r0.f r0 = r9.c
            r0.y r1 = r9.q
            r0.V(r1)
            r0.f r9 = r9.c
            byte[] r9 = r9.r()
            if (r4 == 0) goto L_0x0089
            int r0 = r9.length
            android.graphics.BitmapFactory.decodeByteArray(r9, r2, r0, r3)
            int r0 = r10.g
            int r1 = r10.h
            i0.o.a.v.b(r0, r1, r3, r10)
        L_0x0089:
            int r10 = r9.length
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeByteArray(r9, r2, r10, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.o.a.c.c(r0.y, i0.o.a.t):android.graphics.Bitmap");
    }

    public static c e(Picasso picasso, i iVar, d dVar, x xVar, a aVar) {
        t tVar = aVar.b;
        List<v> list = picasso.f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            v vVar = list.get(i);
            if (vVar.c(tVar)) {
                return new c(picasso, iVar, dVar, xVar, aVar, vVar);
            }
        }
        return new c(picasso, iVar, dVar, xVar, aVar, x);
    }

    public static boolean g(boolean z, int i, int i3, int i4, int i5) {
        return !z || (i4 != 0 && i > i4) || (i5 != 0 && i3 > i5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap h(i0.o.a.t r26, android.graphics.Bitmap r27, int r28) {
        /*
            r0 = r26
            r1 = r28
            int r2 = r27.getWidth()
            int r3 = r27.getHeight()
            boolean r4 = r0.l
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            boolean r5 = r26.c()
            if (r5 != 0) goto L_0x0020
            if (r1 == 0) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            r4 = r2
            r6 = r3
            goto L_0x023a
        L_0x0020:
            int r5 = r0.g
            int r7 = r0.h
            float r8 = r0.m
            r9 = 0
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x0120
            double r11 = (double) r8
            double r13 = java.lang.Math.toRadians(r11)
            double r13 = java.lang.Math.cos(r13)
            double r11 = java.lang.Math.toRadians(r11)
            double r11 = java.lang.Math.sin(r11)
            boolean r5 = r0.p
            if (r5 == 0) goto L_0x00be
            float r5 = r0.n
            float r7 = r0.o
            r10.setRotate(r8, r5, r7)
            float r5 = r0.n
            double r7 = (double) r5
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r15 = r15 - r13
            double r17 = r7 * r15
            float r5 = r0.o
            r19 = r7
            double r6 = (double) r5
            double r21 = r6 * r11
            r23 = r10
            double r9 = r21 + r17
            double r6 = r6 * r15
            double r15 = r19 * r11
            double r6 = r6 - r15
            int r5 = r0.g
            r15 = r4
            double r4 = (double) r5
            double r16 = r4 * r13
            r18 = r2
            r19 = r3
            double r2 = r16 + r9
            double r4 = r4 * r11
            double r4 = r4 + r6
            int r8 = r0.h
            double r0 = (double) r8
            double r11 = r11 * r0
            r16 = r6
            double r6 = r2 - r11
            double r0 = r0 * r13
            double r13 = r0 + r4
            double r11 = r9 - r11
            double r0 = r0 + r16
            r20 = r0
            double r0 = java.lang.Math.max(r9, r2)
            double r0 = java.lang.Math.max(r6, r0)
            double r0 = java.lang.Math.max(r11, r0)
            double r2 = java.lang.Math.min(r9, r2)
            double r2 = java.lang.Math.min(r6, r2)
            double r2 = java.lang.Math.min(r11, r2)
            r6 = r16
            double r8 = java.lang.Math.max(r6, r4)
            double r8 = java.lang.Math.max(r13, r8)
            r10 = r20
            double r8 = java.lang.Math.max(r10, r8)
            double r4 = java.lang.Math.min(r6, r4)
            double r4 = java.lang.Math.min(r13, r4)
            double r4 = java.lang.Math.min(r10, r4)
            double r0 = r0 - r2
            double r0 = java.lang.Math.floor(r0)
            int r0 = (int) r0
            double r8 = r8 - r4
            double r1 = java.lang.Math.floor(r8)
            r5 = r0
            goto L_0x011e
        L_0x00be:
            r18 = r2
            r19 = r3
            r15 = r4
            r0 = r10
            r0.setRotate(r8)
            r1 = r26
            int r2 = r1.g
            double r2 = (double) r2
            double r4 = r2 * r13
            double r2 = r2 * r11
            int r6 = r1.h
            double r6 = (double) r6
            double r11 = r11 * r6
            double r8 = r4 - r11
            double r6 = r6 * r13
            double r13 = r6 + r2
            double r10 = -r11
            r23 = r0
            r0 = 0
            r16 = r6
            double r6 = java.lang.Math.max(r0, r4)
            double r6 = java.lang.Math.max(r8, r6)
            double r6 = java.lang.Math.max(r10, r6)
            double r4 = java.lang.Math.min(r0, r4)
            double r4 = java.lang.Math.min(r8, r4)
            double r4 = java.lang.Math.min(r10, r4)
            double r8 = java.lang.Math.max(r0, r2)
            double r8 = java.lang.Math.max(r13, r8)
            r10 = r16
            double r8 = java.lang.Math.max(r10, r8)
            double r0 = java.lang.Math.min(r0, r2)
            double r0 = java.lang.Math.min(r13, r0)
            double r0 = java.lang.Math.min(r10, r0)
            double r6 = r6 - r4
            double r2 = java.lang.Math.floor(r6)
            int r2 = (int) r2
            double r8 = r8 - r0
            double r0 = java.lang.Math.floor(r8)
            r5 = r2
            r1 = r0
        L_0x011e:
            int r7 = (int) r1
            goto L_0x0127
        L_0x0120:
            r18 = r2
            r19 = r3
            r15 = r4
            r23 = r10
        L_0x0127:
            r0 = 5
            r1 = 2
            r2 = r28
            if (r2 == 0) goto L_0x0167
            r3 = 270(0x10e, float:3.78E-43)
            r4 = 90
            switch(r2) {
                case 3: goto L_0x013a;
                case 4: goto L_0x013a;
                case 5: goto L_0x0138;
                case 6: goto L_0x0138;
                case 7: goto L_0x0136;
                case 8: goto L_0x0136;
                default: goto L_0x0134;
            }
        L_0x0134:
            r6 = 0
            goto L_0x013c
        L_0x0136:
            r6 = r3
            goto L_0x013c
        L_0x0138:
            r6 = r4
            goto L_0x013c
        L_0x013a:
            r6 = 180(0xb4, float:2.52E-43)
        L_0x013c:
            r8 = 1
            if (r2 == r1) goto L_0x0149
            r9 = 7
            if (r2 == r9) goto L_0x0149
            r9 = 4
            if (r2 == r9) goto L_0x0149
            if (r2 == r0) goto L_0x0149
            r2 = r8
            goto L_0x014a
        L_0x0149:
            r2 = -1
        L_0x014a:
            if (r6 == 0) goto L_0x015c
            float r9 = (float) r6
            r10 = r23
            r10.preRotate(r9)
            if (r6 == r4) goto L_0x0156
            if (r6 != r3) goto L_0x015e
        L_0x0156:
            r25 = r7
            r7 = r5
            r5 = r25
            goto L_0x015e
        L_0x015c:
            r10 = r23
        L_0x015e:
            if (r2 == r8) goto L_0x0169
            float r2 = (float) r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r10.postScale(r2, r3)
            goto L_0x0169
        L_0x0167:
            r10 = r23
        L_0x0169:
            r2 = r26
            boolean r3 = r2.i
            if (r3 == 0) goto L_0x01f0
            if (r5 == 0) goto L_0x0179
            float r3 = (float) r5
            r4 = r18
            float r6 = (float) r4
            float r3 = r3 / r6
            r6 = r19
            goto L_0x0180
        L_0x0179:
            r4 = r18
            float r3 = (float) r7
            r6 = r19
            float r8 = (float) r6
            float r3 = r3 / r8
        L_0x0180:
            if (r7 == 0) goto L_0x0185
            float r8 = (float) r7
            float r9 = (float) r6
            goto L_0x0187
        L_0x0185:
            float r8 = (float) r5
            float r9 = (float) r4
        L_0x0187:
            float r8 = r8 / r9
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 <= 0) goto L_0x01b0
            float r0 = (float) r6
            float r8 = r8 / r3
            float r8 = r8 * r0
            double r8 = (double) r8
            double r8 = java.lang.Math.ceil(r8)
            int r0 = (int) r8
            int r2 = r2.j
            r8 = r2 & 48
            r9 = 48
            if (r8 != r9) goto L_0x019f
            r1 = 0
            goto L_0x01ab
        L_0x019f:
            r8 = 80
            r2 = r2 & r8
            if (r2 != r8) goto L_0x01a7
            int r1 = r6 - r0
            goto L_0x01ab
        L_0x01a7:
            int r2 = r6 - r0
            int r1 = r2 / 2
        L_0x01ab:
            float r2 = (float) r7
            float r8 = (float) r0
            float r8 = r2 / r8
            goto L_0x01da
        L_0x01b0:
            int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r9 >= 0) goto L_0x01d7
            float r9 = (float) r4
            float r3 = r3 / r8
            float r3 = r3 * r9
            double r11 = (double) r3
            double r11 = java.lang.Math.ceil(r11)
            int r3 = (int) r11
            int r2 = r2.j
            r9 = r2 & 3
            r11 = 3
            if (r9 != r11) goto L_0x01c6
            r2 = 0
            goto L_0x01cf
        L_0x01c6:
            r2 = r2 & r0
            if (r2 != r0) goto L_0x01cc
            int r2 = r4 - r3
            goto L_0x01cf
        L_0x01cc:
            int r2 = r4 - r3
            int r2 = r2 / r1
        L_0x01cf:
            float r0 = (float) r5
            float r1 = (float) r3
            float r0 = r0 / r1
            r1 = r6
            r9 = r15
            r24 = 0
            goto L_0x01e1
        L_0x01d7:
            r0 = r6
            r3 = r8
            r1 = 0
        L_0x01da:
            r24 = r1
            r9 = r15
            r2 = 0
            r1 = r0
            r0 = r3
            r3 = r4
        L_0x01e1:
            boolean r4 = g(r9, r4, r6, r5, r7)
            if (r4 == 0) goto L_0x01ea
            r10.preScale(r0, r8)
        L_0x01ea:
            r9 = r1
            r6 = r2
            r8 = r3
            r7 = r24
            goto L_0x023e
        L_0x01f0:
            r9 = r15
            r4 = r18
            r6 = r19
            boolean r0 = r2.k
            if (r0 == 0) goto L_0x0219
            if (r5 == 0) goto L_0x01fe
            float r0 = (float) r5
            float r1 = (float) r4
            goto L_0x0200
        L_0x01fe:
            float r0 = (float) r7
            float r1 = (float) r6
        L_0x0200:
            float r0 = r0 / r1
            if (r7 == 0) goto L_0x0206
            float r1 = (float) r7
            float r2 = (float) r6
            goto L_0x0208
        L_0x0206:
            float r1 = (float) r5
            float r2 = (float) r4
        L_0x0208:
            float r1 = r1 / r2
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x020e
            goto L_0x020f
        L_0x020e:
            r0 = r1
        L_0x020f:
            boolean r1 = g(r9, r4, r6, r5, r7)
            if (r1 == 0) goto L_0x023a
            r10.preScale(r0, r0)
            goto L_0x023a
        L_0x0219:
            if (r5 != 0) goto L_0x021d
            if (r7 == 0) goto L_0x023a
        L_0x021d:
            if (r5 != r4) goto L_0x0221
            if (r7 == r6) goto L_0x023a
        L_0x0221:
            if (r5 == 0) goto L_0x0226
            float r0 = (float) r5
            float r1 = (float) r4
            goto L_0x0228
        L_0x0226:
            float r0 = (float) r7
            float r1 = (float) r6
        L_0x0228:
            float r0 = r0 / r1
            if (r7 == 0) goto L_0x022e
            float r1 = (float) r7
            float r2 = (float) r6
            goto L_0x0230
        L_0x022e:
            float r1 = (float) r5
            float r2 = (float) r4
        L_0x0230:
            float r1 = r1 / r2
            boolean r2 = g(r9, r4, r6, r5, r7)
            if (r2 == 0) goto L_0x023a
            r10.preScale(r0, r1)
        L_0x023a:
            r8 = r4
            r9 = r6
            r6 = 0
            r7 = 0
        L_0x023e:
            r11 = 1
            r5 = r27
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            r1 = r27
            if (r0 == r1) goto L_0x024d
            r27.recycle()
            goto L_0x024e
        L_0x024d:
            r0 = r1
        L_0x024e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.o.a.c.h(i0.o.a.t, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static void i(t tVar) {
        String str;
        Uri uri = tVar.d;
        if (uri != null) {
            str = String.valueOf(uri.getPath());
        } else {
            str = Integer.toHexString(tVar.e);
        }
        StringBuilder sb = d.get();
        sb.ensureCapacity(str.length() + 8);
        sb.replace(8, sb.length(), str);
        Thread.currentThread().setName(sb.toString());
    }

    public boolean b() {
        Future<?> future;
        if (this.h2 != null) {
            return false;
        }
        List<a> list = this.i2;
        if ((list == null || list.isEmpty()) && (future = this.k2) != null && future.cancel(false)) {
            return true;
        }
        return false;
    }

    public void d(a aVar) {
        boolean z;
        boolean z2 = true;
        if (this.h2 == aVar) {
            this.h2 = null;
            z = true;
        } else {
            List<a> list = this.i2;
            z = list != null ? list.remove(aVar) : false;
        }
        if (z && aVar.b.s == this.p2) {
            Picasso.Priority priority = Picasso.Priority.LOW;
            List<a> list2 = this.i2;
            boolean z3 = list2 != null && !list2.isEmpty();
            a aVar2 = this.h2;
            if (aVar2 == null && !z3) {
                z2 = false;
            }
            if (z2) {
                if (aVar2 != null) {
                    priority = aVar2.b.s;
                }
                if (z3) {
                    int size = this.i2.size();
                    for (int i = 0; i < size; i++) {
                        Picasso.Priority priority2 = this.i2.get(i).b.s;
                        if (priority2.ordinal() > priority.ordinal()) {
                            priority = priority2;
                        }
                    }
                }
            }
            this.p2 = priority;
        }
        if (this.Y1.p) {
            b0.f("Hunter", "removed", aVar.b.b(), b0.d(this, "from "));
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public android.graphics.Bitmap f() throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r8.e2
            boolean r0 = com.squareup.picasso.MemoryPolicy.shouldReadFromMemoryCache(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0034
            i0.o.a.d r0 = r8.a2
            java.lang.String r2 = r8.c2
            android.graphics.Bitmap r0 = r0.get(r2)
            if (r0 == 0) goto L_0x0035
            i0.o.a.x r2 = r8.b2
            android.os.Handler r2 = r2.c
            r2.sendEmptyMessage(r1)
            com.squareup.picasso.Picasso$LoadedFrom r1 = com.squareup.picasso.Picasso.LoadedFrom.MEMORY
            r8.l2 = r1
            com.squareup.picasso.Picasso r1 = r8.Y1
            boolean r1 = r1.p
            if (r1 == 0) goto L_0x0033
            java.lang.String r1 = "Hunter"
            java.lang.String r2 = "decoded"
            i0.o.a.t r3 = r8.d2
            java.lang.String r3 = r3.b()
            java.lang.String r4 = "from cache"
            i0.o.a.b0.f(r1, r2, r3, r4)
        L_0x0033:
            return r0
        L_0x0034:
            r0 = 0
        L_0x0035:
            int r2 = r8.o2
            if (r2 != 0) goto L_0x003e
            com.squareup.picasso.NetworkPolicy r2 = com.squareup.picasso.NetworkPolicy.OFFLINE
            int r2 = r2.index
            goto L_0x0040
        L_0x003e:
            int r2 = r8.f2
        L_0x0040:
            r8.f2 = r2
            i0.o.a.v r3 = r8.g2
            i0.o.a.t r4 = r8.d2
            i0.o.a.v$a r2 = r3.f(r4, r2)
            if (r2 == 0) goto L_0x006a
            com.squareup.picasso.Picasso$LoadedFrom r0 = r2.a
            r8.l2 = r0
            int r0 = r2.d
            r8.n2 = r0
            android.graphics.Bitmap r0 = r2.b
            if (r0 != 0) goto L_0x006a
            r0.y r0 = r2.c
            i0.o.a.t r2 = r8.d2     // Catch:{ all -> 0x0065 }
            android.graphics.Bitmap r2 = c(r0, r2)     // Catch:{ all -> 0x0065 }
            r0.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            r0 = r2
            goto L_0x006a
        L_0x0065:
            r1 = move-exception
            r0.close()     // Catch:{ IOException -> 0x0069 }
        L_0x0069:
            throw r1
        L_0x006a:
            if (r0 == 0) goto L_0x0119
            com.squareup.picasso.Picasso r2 = r8.Y1
            boolean r2 = r2.p
            if (r2 == 0) goto L_0x0081
            java.lang.String r2 = "Hunter"
            java.lang.String r3 = "decoded"
            i0.o.a.t r4 = r8.d2
            java.lang.String r4 = r4.b()
            java.lang.String r5 = ""
            i0.o.a.b0.f(r2, r3, r4, r5)
        L_0x0081:
            i0.o.a.x r2 = r8.b2
            java.util.Objects.requireNonNull(r2)
            int r3 = i0.o.a.b0.b(r0)
            android.os.Handler r2 = r2.c
            r4 = 2
            android.os.Message r3 = r2.obtainMessage(r4, r3, r1)
            r2.sendMessage(r3)
            i0.o.a.t r2 = r8.d2
            boolean r3 = r2.c()
            r4 = 1
            if (r3 != 0) goto L_0x00a9
            java.util.List<i0.o.a.z> r2 = r2.f
            if (r2 == 0) goto L_0x00a3
            r2 = r4
            goto L_0x00a4
        L_0x00a3:
            r2 = r1
        L_0x00a4:
            if (r2 == 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r2 = r1
            goto L_0x00aa
        L_0x00a9:
            r2 = r4
        L_0x00aa:
            if (r2 != 0) goto L_0x00b0
            int r2 = r8.n2
            if (r2 == 0) goto L_0x0119
        L_0x00b0:
            java.lang.Object r2 = c
            monitor-enter(r2)
            i0.o.a.t r3 = r8.d2     // Catch:{ all -> 0x0116 }
            boolean r3 = r3.c()     // Catch:{ all -> 0x0116 }
            if (r3 != 0) goto L_0x00bf
            int r3 = r8.n2     // Catch:{ all -> 0x0116 }
            if (r3 == 0) goto L_0x00dc
        L_0x00bf:
            i0.o.a.t r3 = r8.d2     // Catch:{ all -> 0x0116 }
            int r5 = r8.n2     // Catch:{ all -> 0x0116 }
            android.graphics.Bitmap r0 = h(r3, r0, r5)     // Catch:{ all -> 0x0116 }
            com.squareup.picasso.Picasso r3 = r8.Y1     // Catch:{ all -> 0x0116 }
            boolean r3 = r3.p     // Catch:{ all -> 0x0116 }
            if (r3 == 0) goto L_0x00dc
            java.lang.String r3 = "Hunter"
            java.lang.String r5 = "transformed"
            i0.o.a.t r6 = r8.d2     // Catch:{ all -> 0x0116 }
            java.lang.String r6 = r6.b()     // Catch:{ all -> 0x0116 }
            java.lang.String r7 = ""
            i0.o.a.b0.f(r3, r5, r6, r7)     // Catch:{ all -> 0x0116 }
        L_0x00dc:
            i0.o.a.t r3 = r8.d2     // Catch:{ all -> 0x0116 }
            java.util.List<i0.o.a.z> r3 = r3.f     // Catch:{ all -> 0x0116 }
            if (r3 == 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r4 = r1
        L_0x00e4:
            if (r4 == 0) goto L_0x00ff
            android.graphics.Bitmap r0 = a(r3, r0)     // Catch:{ all -> 0x0116 }
            com.squareup.picasso.Picasso r3 = r8.Y1     // Catch:{ all -> 0x0116 }
            boolean r3 = r3.p     // Catch:{ all -> 0x0116 }
            if (r3 == 0) goto L_0x00ff
            java.lang.String r3 = "Hunter"
            java.lang.String r4 = "transformed"
            i0.o.a.t r5 = r8.d2     // Catch:{ all -> 0x0116 }
            java.lang.String r5 = r5.b()     // Catch:{ all -> 0x0116 }
            java.lang.String r6 = "from custom transformations"
            i0.o.a.b0.f(r3, r4, r5, r6)     // Catch:{ all -> 0x0116 }
        L_0x00ff:
            monitor-exit(r2)     // Catch:{ all -> 0x0116 }
            if (r0 == 0) goto L_0x0119
            i0.o.a.x r2 = r8.b2
            java.util.Objects.requireNonNull(r2)
            int r3 = i0.o.a.b0.b(r0)
            android.os.Handler r2 = r2.c
            r4 = 3
            android.os.Message r1 = r2.obtainMessage(r4, r3, r1)
            r2.sendMessage(r1)
            goto L_0x0119
        L_0x0116:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0116 }
            throw r0
        L_0x0119:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.o.a.c.f():android.graphics.Bitmap");
    }

    public void run() {
        try {
            i(this.d2);
            if (this.Y1.p) {
                b0.f("Hunter", "executing", b0.c(this), "");
            }
            Bitmap f3 = f();
            this.j2 = f3;
            if (f3 == null) {
                this.Z1.c(this);
            } else {
                this.Z1.b(this);
            }
        } catch (NetworkRequestHandler.ResponseException e3) {
            if (!NetworkPolicy.isOfflineOnly(e3.d) || e3.c != 504) {
                this.m2 = e3;
            }
            Handler handler = this.Z1.i;
            handler.sendMessage(handler.obtainMessage(6, this));
        } catch (IOException e4) {
            this.m2 = e4;
            Handler handler2 = this.Z1.i;
            handler2.sendMessageDelayed(handler2.obtainMessage(5, this), 500);
        } catch (OutOfMemoryError e5) {
            StringWriter stringWriter = new StringWriter();
            this.b2.a().a(new PrintWriter(stringWriter));
            this.m2 = new RuntimeException(stringWriter.toString(), e5);
            Handler handler3 = this.Z1.i;
            handler3.sendMessage(handler3.obtainMessage(6, this));
        } catch (Exception e6) {
            this.m2 = e6;
            Handler handler4 = this.Z1.i;
            handler4.sendMessage(handler4.obtainMessage(6, this));
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
    }
}
