package i0.h.a.c.r;

import i0.d.a.a.a;

/* compiled from: CircularProgressIndicatorSpec */
public final class h extends c {
    public int g;
    public int h;
    public int i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            int r6 = com.google.android.material.R.attr.circularProgressIndicatorStyle
            int r7 = com.google.android.material.progressindicator.CircularProgressIndicator.g2
            r12.<init>(r13, r14, r6, r7)
            android.content.res.Resources r0 = r13.getResources()
            int r1 = com.google.android.material.R.dimen.mtrl_progress_circular_size_medium
            int r8 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r0 = r13.getResources()
            int r1 = com.google.android.material.R.dimen.mtrl_progress_circular_inset_medium
            int r9 = r0.getDimensionPixelSize(r1)
            int[] r10 = com.google.android.material.R.styleable.CircularProgressIndicator
            r11 = 0
            int[] r5 = new int[r11]
            i0.h.a.c.q.j.a(r13, r14, r6, r7)
            r0 = r13
            r1 = r14
            r2 = r10
            r3 = r6
            r4 = r7
            i0.h.a.c.q.j.b(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r14 = r13.obtainStyledAttributes(r14, r10, r6, r7)
            int r0 = com.google.android.material.R.styleable.CircularProgressIndicator_indicatorSize
            int r0 = i0.h.a.b.c.m.b.O(r13, r14, r0, r8)
            r12.g = r0
            int r0 = com.google.android.material.R.styleable.CircularProgressIndicator_indicatorInset
            int r13 = i0.h.a.b.c.m.b.O(r13, r14, r0, r9)
            r12.h = r13
            int r13 = com.google.android.material.R.styleable.CircularProgressIndicator_indicatorDirectionCircular
            int r13 = r14.getInt(r13, r11)
            r12.i = r13
            r14.recycle()
            r12.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.c.r.h.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void a() {
        if (this.g < this.a * 2) {
            StringBuilder P0 = a.P0("The indicatorSize (");
            P0.append(this.g);
            P0.append(" px) cannot be less than twice of the trackThickness (");
            throw new IllegalArgumentException(a.u0(P0, this.a, " px)."));
        }
    }
}
