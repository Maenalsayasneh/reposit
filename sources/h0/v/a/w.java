package h0.v.a;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerSnapHelper */
public class w extends z {
    public v d;
    public v e;

    /* compiled from: PagerSnapHelper */
    public class a extends p {
        public a(Context context) {
            super(context);
        }

        public void c(View view, RecyclerView.y yVar, RecyclerView.x.a aVar) {
            w wVar = w.this;
            int[] b = wVar.b(wVar.a.getLayoutManager(), view);
            int i = b[0];
            int i2 = b[1];
            int g = g(Math.max(Math.abs(i), Math.abs(i2)));
            if (g > 0) {
                aVar.b(i, i2, g, this.j);
            }
        }

        public float f(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        public int h(int i) {
            return Math.min(100, super.h(i));
        }
    }

    public int[] b(RecyclerView.n nVar, View view) {
        int[] iArr = new int[2];
        if (nVar.canScrollHorizontally()) {
            iArr[0] = g(view, i(nVar));
        } else {
            iArr[0] = 0;
        }
        if (nVar.canScrollVertically()) {
            iArr[1] = g(view, j(nVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public RecyclerView.x c(RecyclerView.n nVar) {
        if (!(nVar instanceof RecyclerView.x.b)) {
            return null;
        }
        return new a(this.a.getContext());
    }

    public View d(RecyclerView.n nVar) {
        if (nVar.canScrollVertically()) {
            return h(nVar, j(nVar));
        }
        if (nVar.canScrollHorizontally()) {
            return h(nVar, i(nVar));
        }
        return null;
    }

    public int e(RecyclerView.n nVar, int i, int i2) {
        v vVar;
        PointF computeScrollVectorForPosition;
        int itemCount = nVar.getItemCount();
        if (itemCount == 0) {
            return -1;
        }
        View view = null;
        if (nVar.canScrollVertically()) {
            vVar = j(nVar);
        } else {
            vVar = nVar.canScrollHorizontally() ? i(nVar) : null;
        }
        if (vVar == null) {
            return -1;
        }
        int childCount = nVar.getChildCount();
        boolean z = false;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = nVar.getChildAt(i5);
            if (childAt != null) {
                int g = g(childAt, vVar);
                if (g <= 0 && g > i4) {
                    view2 = childAt;
                    i4 = g;
                }
                if (g >= 0 && g < i3) {
                    view = childAt;
                    i3 = g;
                }
            }
        }
        int i6 = 1;
        boolean z2 = !nVar.canScrollHorizontally() ? i2 > 0 : i > 0;
        if (z2 && view != null) {
            return nVar.getPosition(view);
        }
        if (!z2 && view2 != null) {
            return nVar.getPosition(view2);
        }
        if (z2) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = nVar.getPosition(view);
        int itemCount2 = nVar.getItemCount();
        if ((nVar instanceof RecyclerView.x.b) && (computeScrollVectorForPosition = ((RecyclerView.x.b) nVar).computeScrollVectorForPosition(itemCount2 - 1)) != null && (computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f)) {
            z = true;
        }
        if (z == z2) {
            i6 = -1;
        }
        int i7 = position + i6;
        if (i7 < 0 || i7 >= itemCount) {
            return -1;
        }
        return i7;
    }

    public final int g(View view, v vVar) {
        return ((vVar.c(view) / 2) + vVar.e(view)) - ((vVar.l() / 2) + vVar.k());
    }

    public final View h(RecyclerView.n nVar, v vVar) {
        int childCount = nVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int l = (vVar.l() / 2) + vVar.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = nVar.getChildAt(i2);
            int abs = Math.abs(((vVar.c(childAt) / 2) + vVar.e(childAt)) - l);
            if (abs < i) {
                view = childAt;
                i = abs;
            }
        }
        return view;
    }

    public final v i(RecyclerView.n nVar) {
        v vVar = this.e;
        if (vVar == null || vVar.a != nVar) {
            this.e = new t(nVar);
        }
        return this.e;
    }

    public final v j(RecyclerView.n nVar) {
        v vVar = this.d;
        if (vVar == null || vVar.a != nVar) {
            this.d = new u(nVar);
        }
        return this.d;
    }
}
