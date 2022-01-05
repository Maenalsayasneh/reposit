package h0.v.a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper */
public class u extends v {
    public u(RecyclerView.n nVar) {
        super(nVar, (t) null);
    }

    public int b(View view) {
        return this.a.getDecoratedBottom(view) + ((RecyclerView.o) view.getLayoutParams()).bottomMargin;
    }

    public int c(View view) {
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        return this.a.getDecoratedMeasuredHeight(view) + oVar.topMargin + oVar.bottomMargin;
    }

    public int d(View view) {
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        return this.a.getDecoratedMeasuredWidth(view) + oVar.leftMargin + oVar.rightMargin;
    }

    public int e(View view) {
        return this.a.getDecoratedTop(view) - ((RecyclerView.o) view.getLayoutParams()).topMargin;
    }

    public int f() {
        return this.a.getHeight();
    }

    public int g() {
        return this.a.getHeight() - this.a.getPaddingBottom();
    }

    public int h() {
        return this.a.getPaddingBottom();
    }

    public int i() {
        return this.a.getHeightMode();
    }

    public int j() {
        return this.a.getWidthMode();
    }

    public int k() {
        return this.a.getPaddingTop();
    }

    public int l() {
        return (this.a.getHeight() - this.a.getPaddingTop()) - this.a.getPaddingBottom();
    }

    public int n(View view) {
        this.a.getTransformedBoundingBox(view, true, this.c);
        return this.c.bottom;
    }

    public int o(View view) {
        this.a.getTransformedBoundingBox(view, true, this.c);
        return this.c.top;
    }

    public void p(int i) {
        this.a.offsetChildrenVertical(i);
    }
}
