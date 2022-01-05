package h0.i.b.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* compiled from: ResourcesCompat */
public final class h {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    public static final WeakHashMap<?, SparseArray<?>> b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    /* compiled from: ResourcesCompat */
    public static abstract class a {

        /* renamed from: h0.i.b.d.h$a$a  reason: collision with other inner class name */
        /* compiled from: ResourcesCompat */
        public class C0041a implements Runnable {
            public final /* synthetic */ Typeface c;

            public C0041a(Typeface typeface) {
                this.c = typeface;
            }

            public void run() {
                a.this.e(this.c);
            }
        }

        /* compiled from: ResourcesCompat */
        public class b implements Runnable {
            public final /* synthetic */ int c;

            public b(int i) {
                this.c = i;
            }

            public void run() {
                a.this.d(this.c);
            }
        }

        public static Handler c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void a(int i, Handler handler) {
            c(handler).post(new b(i));
        }

        public final void b(Typeface typeface, Handler handler) {
            c(handler).post(new C0041a(typeface));
        }

        public abstract void d(int i);

        public abstract void e(Typeface typeface);
    }

    public static Typeface a(Context context, int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, (a) null, (Handler) null, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface b(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, h0.i.b.d.h.a r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r9 = r17
            r0 = r18
            r5 = r19
            r10 = r20
            r11 = r21
            android.content.res.Resources r3 = r16.getResources()
            r1 = 1
            r3.getValue(r9, r0, r1)
            java.lang.String r12 = "ResourcesCompat"
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x00df
            java.lang.String r13 = r1.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r13.startsWith(r0)
            r14 = -3
            r15 = 0
            if (r0 != 0) goto L_0x002d
            if (r10 == 0) goto L_0x00bb
            r10.a(r14, r11)
            goto L_0x00bb
        L_0x002d:
            h0.f.f<java.lang.String, android.graphics.Typeface> r0 = h0.i.c.e.b
            java.lang.String r1 = h0.i.c.e.c(r3, r9, r5)
            java.lang.Object r0 = r0.a(r1)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0043
            if (r10 == 0) goto L_0x0040
            r10.b(r0, r11)
        L_0x0040:
            r15 = r0
            goto L_0x00bb
        L_0x0043:
            if (r23 == 0) goto L_0x0047
            goto L_0x00bb
        L_0x0047:
            java.lang.String r0 = r13.toLowerCase()     // Catch:{ XmlPullParserException -> 0x00a1, IOException -> 0x008b }
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch:{ XmlPullParserException -> 0x00a1, IOException -> 0x008b }
            if (r0 == 0) goto L_0x0079
            android.content.res.XmlResourceParser r0 = r3.getXml(r9)     // Catch:{ XmlPullParserException -> 0x00a1, IOException -> 0x008b }
            h0.i.b.d.c r2 = g0.a.b.b.a.o0(r0, r3)     // Catch:{ XmlPullParserException -> 0x00a1, IOException -> 0x008b }
            if (r2 != 0) goto L_0x0068
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r12, r0)     // Catch:{ XmlPullParserException -> 0x00a1, IOException -> 0x008b }
            if (r10 == 0) goto L_0x00bb
            r10.a(r14, r11)     // Catch:{ XmlPullParserException -> 0x00a1, IOException -> 0x008b }
            goto L_0x00bb
        L_0x0068:
            r1 = r16
            r4 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r15 = h0.i.c.e.a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x00a1, IOException -> 0x008b }
            goto L_0x00bb
        L_0x0079:
            r0 = r16
            android.graphics.Typeface r0 = h0.i.c.e.b(r0, r3, r9, r13, r5)     // Catch:{ XmlPullParserException -> 0x00a1, IOException -> 0x008b }
            if (r10 == 0) goto L_0x0040
            if (r0 == 0) goto L_0x0087
            r10.b(r0, r11)     // Catch:{ XmlPullParserException -> 0x00a1, IOException -> 0x008b }
            goto L_0x0040
        L_0x0087:
            r10.a(r14, r11)     // Catch:{ XmlPullParserException -> 0x00a1, IOException -> 0x008b }
            goto L_0x0040
        L_0x008b:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r12, r1, r0)
            goto L_0x00b6
        L_0x00a1:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r12, r1, r0)
        L_0x00b6:
            if (r10 == 0) goto L_0x00bb
            r10.a(r14, r11)
        L_0x00bb:
            if (r15 != 0) goto L_0x00de
            if (r10 != 0) goto L_0x00de
            if (r23 == 0) goto L_0x00c2
            goto L_0x00de
        L_0x00c2:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.String r1 = "Font resource ID #0x"
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r17)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00de:
            return r15
        L_0x00df:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.String r2 = "Resource \""
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            java.lang.String r3 = r3.getResourceName(r9)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r17)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.b.d.h.b(android.content.Context, int, android.util.TypedValue, int, h0.i.b.d.h$a, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
