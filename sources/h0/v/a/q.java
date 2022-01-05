package h0.v.a;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSnapHelper */
public class q extends z {
    public v d;
    public v e;

    public int[] b(RecyclerView.n nVar, View view) {
        int[] iArr = new int[2];
        if (nVar.canScrollHorizontally()) {
            iArr[0] = g(view, j(nVar));
        } else {
            iArr[0] = 0;
        }
        if (nVar.canScrollVertically()) {
            iArr[1] = g(view, k(nVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public View d(RecyclerView.n nVar) {
        if (nVar.canScrollVertically()) {
            return i(nVar, k(nVar));
        }
        if (nVar.canScrollHorizontally()) {
            return i(nVar, j(nVar));
        }
        return null;
    }

    public int e(RecyclerView.n nVar, int i, int i2) {
        int itemCount;
        View d2;
        int position;
        int i3;
        PointF computeScrollVectorForPosition;
        int i4;
        int i5;
        if (!(nVar instanceof RecyclerView.x.b) || (itemCount = nVar.getItemCount()) == 0 || (d2 = d(nVar)) == null || (position = nVar.getPosition(d2)) == -1 || (computeScrollVectorForPosition = ((RecyclerView.x.b) nVar).computeScrollVectorForPosition(i3)) == null) {
            return -1;
        }
        int i6 = 0;
        if (nVar.canScrollHorizontally()) {
            i4 = h(nVar, j(nVar), i, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (nVar.canScrollVertically()) {
            i5 = h(nVar, k(nVar), 0, i2);
            if (computeScrollVectorForPosition.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (nVar.canScrollVertically()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = position + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= itemCount ? itemCount - 1 : i6;
    }

    public final int g(View view, v vVar) {
        return ((vVar.c(view) / 2) + vVar.e(view)) - ((vVar.l() / 2) + vVar.k());
    }

    public final int h(RecyclerView.n nVar, v vVar, int i, int i2) {
        int max;
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int childCount = nVar.getChildCount();
        float f = 1.0f;
        if (childCount != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = nVar.getChildAt(i5);
                int position = nVar.getPosition(childAt);
                if (position != -1) {
                    if (position < i4) {
                        view = childAt;
                        i4 = position;
                    }
                    if (position > i3) {
                        view2 = childAt;
                        i3 = position;
                    }
                }
            }
            if (!(view == null || view2 == null || (max = Math.max(vVar.b(view), vVar.b(view2)) - Math.min(vVar.e(view), vVar.e(view2))) == 0)) {
                f = (((float) max) * 1.0f) / ((float) ((i3 - i4) + 1));
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1])) / f);
    }

    public final View i(RecyclerView.n nVar, v vVar) {
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

    public final v j(RecyclerView.n nVar) {
        v vVar = this.e;
        if (vVar == null || vVar.a != nVar) {
            this.e = new t(nVar);
        }
        return this.e;
    }

    public final v k(RecyclerView.n nVar) {
        v vVar = this.d;
        if (vVar == null || vVar.a != nVar) {
            this.d = new u(nVar);
        }
        return this.d;
    }
}
