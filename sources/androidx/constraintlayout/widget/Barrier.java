package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import h0.g.a.h.g;
import h0.g.c.a;
import h0.g.c.c;

public class Barrier extends a {
    public int b2;
    public int c2;
    public h0.g.a.h.a d2;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.d2.P0;
    }

    public int getMargin() {
        return this.d2.Q0;
    }

    public int getType() {
        return this.b2;
    }

    public void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        this.d2 = new h0.g.a.h.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.d2.P0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierMargin) {
                    this.d2.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.x = this.d2;
        s();
    }

    public void m(c.a aVar, g gVar, ConstraintLayout.a aVar2, SparseArray<ConstraintWidget> sparseArray) {
        super.m(aVar, gVar, aVar2, sparseArray);
        if (gVar instanceof h0.g.a.h.a) {
            h0.g.a.h.a aVar3 = (h0.g.a.h.a) gVar;
            t(aVar3, aVar.e.f26g0, ((h0.g.a.h.c) gVar.W).R0);
            c.b bVar = aVar.e;
            aVar3.P0 = bVar.f34o0;
            aVar3.Q0 = bVar.f27h0;
        }
    }

    public void n(ConstraintWidget constraintWidget, boolean z) {
        t(constraintWidget, this.b2, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.d2.P0 = z;
    }

    public void setDpMargin(int i) {
        this.d2.Q0 = (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.d2.Q0 = i;
    }

    public void setType(int i) {
        this.b2 = i;
    }

    public final void t(ConstraintWidget constraintWidget, int i, boolean z) {
        this.c2 = i;
        if (z) {
            int i2 = this.b2;
            if (i2 == 5) {
                this.c2 = 1;
            } else if (i2 == 6) {
                this.c2 = 0;
            }
        } else {
            int i3 = this.b2;
            if (i3 == 5) {
                this.c2 = 0;
            } else if (i3 == 6) {
                this.c2 = 1;
            }
        }
        if (constraintWidget instanceof h0.g.a.h.a) {
            ((h0.g.a.h.a) constraintWidget).O0 = this.c2;
        }
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
