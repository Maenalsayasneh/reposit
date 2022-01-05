package i0.b.a;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import m0.n.b.i;

/* compiled from: EpoxyVisibilityItem.kt */
public final class x {
    public final Rect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public Integer n;
    public Integer o;
    public Integer p;

    public x() {
        this((Integer) null);
    }

    public final boolean a(w wVar, boolean z) {
        i.e(wVar, "epoxyHolder");
        int i2 = this.e;
        Integer num = this.n;
        if (num != null && i2 == num.intValue()) {
            int i3 = this.f;
            Integer num2 = this.o;
            if (num2 != null && i3 == num2.intValue()) {
                int i4 = this.m;
                Integer num3 = this.p;
                if (num3 != null && i4 == num3.intValue()) {
                    return false;
                }
            }
        }
        if (z) {
            if (this.m == 8) {
                wVar.a();
                wVar.a.z(0.0f, 0.0f, 0, 0, wVar.c());
            } else {
                int i5 = this.e;
                int i6 = this.f;
                wVar.a();
                wVar.a.z((100.0f / ((float) this.c)) * ((float) i5), (100.0f / ((float) this.d)) * ((float) i6), i5, i6, wVar.c());
            }
        }
        this.n = Integer.valueOf(this.e);
        this.o = Integer.valueOf(this.f);
        this.p = Integer.valueOf(this.m);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r9 == false) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(i0.b.a.w r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "epoxyHolder"
            m0.n.b.i.e(r8, r0)
            boolean r0 = r7.l
            r1 = 1
            r2 = 2
            r3 = 0
            if (r9 != 0) goto L_0x0032
            int r9 = r7.g
            int r4 = r7.h
            int r9 = r9 * r4
            int r9 = r9 / r2
            int r4 = r7.c
            int r5 = r7.d
            int r4 = r4 * r5
            int r5 = r7.e
            int r6 = r7.f
            int r5 = r5 * r6
            int r6 = r7.m
            if (r6 != 0) goto L_0x002e
            if (r4 < r9) goto L_0x0025
            if (r5 < r9) goto L_0x0029
            goto L_0x0027
        L_0x0025:
            if (r4 != r5) goto L_0x0029
        L_0x0027:
            r9 = r1
            goto L_0x002a
        L_0x0029:
            r9 = r3
        L_0x002a:
            if (r9 == 0) goto L_0x002e
            r9 = r1
            goto L_0x002f
        L_0x002e:
            r9 = r3
        L_0x002f:
            if (r9 == 0) goto L_0x0032
            goto L_0x0033
        L_0x0032:
            r1 = r3
        L_0x0033:
            r7.l = r1
            if (r1 == r0) goto L_0x0041
            if (r1 == 0) goto L_0x003d
            r8.d(r2)
            goto L_0x0041
        L_0x003d:
            r9 = 3
            r8.d(r9)
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.b.a.x.b(i0.b.a.w, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if ((r4.m == 0 && r4.e == r4.c && r4.f == r4.d) != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(i0.b.a.w r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "epoxyHolder"
            m0.n.b.i.e(r5, r0)
            boolean r0 = r4.j
            r1 = 1
            r2 = 0
            if (r6 != 0) goto L_0x0021
            int r6 = r4.m
            if (r6 != 0) goto L_0x001d
            int r6 = r4.e
            int r3 = r4.c
            if (r6 != r3) goto L_0x001d
            int r6 = r4.f
            int r3 = r4.d
            if (r6 != r3) goto L_0x001d
            r6 = r1
            goto L_0x001e
        L_0x001d:
            r6 = r2
        L_0x001e:
            if (r6 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r1 = r2
        L_0x0022:
            r4.j = r1
            if (r1 == r0) goto L_0x002c
            if (r1 == 0) goto L_0x002c
            r6 = 4
            r5.d(r6)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.b.a.x.c(i0.b.a.w, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r3 >= ((float) r8)) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r7 != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r5.f > 0) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(i0.b.a.w r6, boolean r7, int r8) {
        /*
            r5 = this;
            java.lang.String r0 = "epoxyHolder"
            m0.n.b.i.e(r6, r0)
            boolean r0 = r5.i
            r1 = 1
            r2 = 0
            if (r7 != 0) goto L_0x003a
            if (r8 != 0) goto L_0x001a
            int r7 = r5.m
            if (r7 != 0) goto L_0x0036
            int r7 = r5.e
            if (r7 <= 0) goto L_0x0036
            int r7 = r5.f
            if (r7 <= 0) goto L_0x0036
            goto L_0x0034
        L_0x001a:
            int r7 = r5.c
            int r3 = r5.d
            int r7 = r7 * r3
            int r3 = r5.e
            int r4 = r5.f
            int r3 = r3 * r4
            float r3 = (float) r3
            float r7 = (float) r7
            float r3 = r3 / r7
            r7 = 100
            float r7 = (float) r7
            float r3 = r3 * r7
            int r7 = r5.m
            if (r7 != 0) goto L_0x0036
            float r7 = (float) r8
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x0036
        L_0x0034:
            r7 = r1
            goto L_0x0037
        L_0x0036:
            r7 = r2
        L_0x0037:
            if (r7 == 0) goto L_0x003a
            goto L_0x003b
        L_0x003a:
            r1 = r2
        L_0x003b:
            r5.i = r1
            if (r1 == r0) goto L_0x004a
            if (r1 == 0) goto L_0x0046
            r7 = 5
            r6.d(r7)
            goto L_0x004a
        L_0x0046:
            r7 = 6
            r6.d(r7)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.b.a.x.d(i0.b.a.w, boolean, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(i0.b.a.w r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = "epoxyHolder"
            m0.n.b.i.e(r4, r0)
            boolean r0 = r3.k
            r1 = 1
            r2 = 0
            if (r5 != 0) goto L_0x001e
            int r5 = r3.m
            if (r5 != 0) goto L_0x0019
            int r5 = r3.e
            if (r5 <= 0) goto L_0x0019
            int r5 = r3.f
            if (r5 <= 0) goto L_0x0019
            r5 = r1
            goto L_0x001a
        L_0x0019:
            r5 = r2
        L_0x001a:
            if (r5 == 0) goto L_0x001e
            r5 = r1
            goto L_0x001f
        L_0x001e:
            r5 = r2
        L_0x001f:
            r3.k = r5
            if (r5 == r0) goto L_0x002c
            if (r5 == 0) goto L_0x0029
            r4.d(r2)
            goto L_0x002c
        L_0x0029:
            r4.d(r1)
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.b.a.x.e(i0.b.a.w, boolean):void");
    }

    public final void f(int i2) {
        this.b += i2;
    }

    public final boolean g(View view, ViewGroup viewGroup, boolean z) {
        i.e(view, "view");
        i.e(viewGroup, "parent");
        this.a.setEmpty();
        boolean z2 = view.getLocalVisibleRect(this.a) && !z;
        this.c = view.getHeight();
        this.d = view.getWidth();
        this.g = viewGroup.getHeight();
        this.h = viewGroup.getWidth();
        this.e = z2 ? this.a.height() : 0;
        this.f = z2 ? this.a.width() : 0;
        this.m = view.getVisibility();
        if (this.c <= 0 || this.d <= 0) {
            return false;
        }
        return true;
    }

    public x(Integer num) {
        this.a = new Rect();
        this.b = -1;
        this.m = 8;
        if (num != null) {
            int intValue = num.intValue();
            this.j = false;
            this.k = false;
            this.l = false;
            this.b = intValue;
            this.n = null;
            this.o = null;
            this.p = null;
        }
    }
}
