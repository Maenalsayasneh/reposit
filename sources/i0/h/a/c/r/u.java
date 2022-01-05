package i0.h.a.c.r;

/* compiled from: LinearProgressIndicatorSpec */
public final class u extends c {
    public int g;
    public int h;
    public boolean i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            int r6 = com.google.android.material.R.attr.linearProgressIndicatorStyle
            int r7 = com.google.android.material.progressindicator.LinearProgressIndicator.g2
            r10.<init>(r11, r12, r6, r7)
            int[] r8 = com.google.android.material.R.styleable.LinearProgressIndicator
            r9 = 0
            int[] r5 = new int[r9]
            i0.h.a.c.q.j.a(r11, r12, r6, r7)
            r0 = r11
            r1 = r12
            r2 = r8
            r3 = r6
            r4 = r7
            i0.h.a.c.q.j.b(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r12, r8, r6, r7)
            int r12 = com.google.android.material.R.styleable.LinearProgressIndicator_indeterminateAnimationType
            r0 = 1
            int r12 = r11.getInt(r12, r0)
            r10.g = r12
            int r12 = com.google.android.material.R.styleable.LinearProgressIndicator_indicatorDirectionLinear
            int r12 = r11.getInt(r12, r9)
            r10.h = r12
            r11.recycle()
            r10.a()
            int r11 = r10.h
            if (r11 != r0) goto L_0x0037
            r9 = r0
        L_0x0037:
            r10.i = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.c.r.u.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void a() {
        if (this.g != 0) {
            return;
        }
        if (this.b > 0) {
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        } else if (this.c.length < 3) {
            throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
        }
    }
}
