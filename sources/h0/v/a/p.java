package h0.v.a;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSmoothScroller */
public class p extends RecyclerView.x {
    public final LinearInterpolator i = new LinearInterpolator();
    public final DecelerateInterpolator j = new DecelerateInterpolator();
    public PointF k;
    public final DisplayMetrics l;
    public boolean m = false;
    public float n;
    public int o = 0;
    public int p = 0;

    public p(Context context) {
        this.l = context.getResources().getDisplayMetrics();
    }

    public void c(View view, RecyclerView.y yVar, RecyclerView.x.a aVar) {
        int i2;
        int i3;
        int i4;
        PointF pointF = this.k;
        int i5 = 0;
        int i6 = (pointF == null || pointF.x == 0.0f) ? 0 : i4 > 0 ? 1 : -1;
        RecyclerView.n nVar = this.c;
        if (nVar == null || !nVar.canScrollHorizontally()) {
            i2 = 0;
        } else {
            RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
            i2 = e(nVar.getDecoratedLeft(view) - oVar.leftMargin, nVar.getDecoratedRight(view) + oVar.rightMargin, nVar.getPaddingLeft(), nVar.getWidth() - nVar.getPaddingRight(), i6);
        }
        PointF pointF2 = this.k;
        int i7 = (pointF2 == null || pointF2.y == 0.0f) ? 0 : i3 > 0 ? 1 : -1;
        RecyclerView.n nVar2 = this.c;
        if (nVar2 != null && nVar2.canScrollVertically()) {
            RecyclerView.o oVar2 = (RecyclerView.o) view.getLayoutParams();
            i5 = e(nVar2.getDecoratedTop(view) - oVar2.topMargin, nVar2.getDecoratedBottom(view) + oVar2.bottomMargin, nVar2.getPaddingTop(), nVar2.getHeight() - nVar2.getPaddingBottom(), i7);
        }
        int g = g((int) Math.sqrt((double) ((i5 * i5) + (i2 * i2))));
        if (g > 0) {
            aVar.b(-i2, -i5, g, this.j);
        }
    }

    public int e(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public float f(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int g(int i2) {
        return (int) Math.ceil(((double) h(i2)) / 0.3356d);
    }

    public int h(int i2) {
        float abs = (float) Math.abs(i2);
        if (!this.m) {
            this.n = f(this.l);
            this.m = true;
        }
        return (int) Math.ceil((double) (abs * this.n));
    }
}
