package h0.v.a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper */
public class t extends v {
    public t(RecyclerView.n nVar) {
        super(nVar, (t) null);
    }

    public int b(View view) {
        return this.a.getDecoratedRight(view) + ((RecyclerView.o) view.getLayoutParams()).rightMargin;
    }

    public int c(View view) {
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        return this.a.getDecoratedMeasuredWidth(view) + oVar.leftMargin + oVar.rightMargin;
    }

    public int d(View view) {
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        return this.a.getDecoratedMeasuredHeight(view) + oVar.topMargin + oVar.bottomMargin;
    }

    public int e(View view) {
        return this.a.getDecoratedLeft(view) - ((RecyclerView.o) view.getLayoutParams()).leftMargin;
    }

    public int f() {
        return this.a.getWidth();
    }

    public int g() {
        return this.a.getWidth() - this.a.getPaddingRight();
    }

    public int h() {
        return this.a.getPaddingRight();
    }

    public int i() {
        return this.a.getWidthMode();
    }

    public int j() {
        return this.a.getHeightMode();
    }

    public int k() {
        return this.a.getPaddingLeft();
    }

    public int l() {
        return (this.a.getWidth() - this.a.getPaddingLeft()) - this.a.getPaddingRight();
    }

    public int n(View view) {
        this.a.getTransformedBoundingBox(view, true, this.c);
        return this.c.right;
    }

    public int o(View view) {
        this.a.getTransformedBoundingBox(view, true, this.c);
        return this.c.left;
    }

    public void p(int i) {
        this.a.offsetChildrenHorizontal(i);
    }
}
