package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import h0.g.a.h.d;
import h0.g.a.h.g;
import h0.g.c.c;
import h0.g.c.i;

public class Flow extends i {
    public d d2;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        this.d2 = new d();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_android_orientation) {
                    this.d2.r1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_padding) {
                    d dVar = this.d2;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    dVar.O0 = dimensionPixelSize;
                    dVar.P0 = dimensionPixelSize;
                    dVar.Q0 = dimensionPixelSize;
                    dVar.R0 = dimensionPixelSize;
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingStart) {
                    d dVar2 = this.d2;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    dVar2.Q0 = dimensionPixelSize2;
                    dVar2.S0 = dimensionPixelSize2;
                    dVar2.T0 = dimensionPixelSize2;
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingEnd) {
                    this.d2.R0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingLeft) {
                    this.d2.S0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingTop) {
                    this.d2.O0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingRight) {
                    this.d2.T0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_android_paddingBottom) {
                    this.d2.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_wrapMode) {
                    this.d2.p1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.d2.Z0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.d2.a1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.d2.b1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.d2.d1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.d2.c1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.d2.e1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.d2.f1 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.d2.h1 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.d2.j1 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.d2.i1 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.d2.k1 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalBias) {
                    this.d2.g1 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.d2.n1 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.d2.o1 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.d2.l1 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_verticalGap) {
                    this.d2.m1 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R.styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.d2.q1 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.x = this.d2;
        s();
    }

    public void m(c.a aVar, g gVar, ConstraintLayout.a aVar2, SparseArray<ConstraintWidget> sparseArray) {
        super.m(aVar, gVar, aVar2, sparseArray);
        if (gVar instanceof d) {
            d dVar = (d) gVar;
            int i = aVar2.U;
            if (i != -1) {
                dVar.r1 = i;
            }
        }
    }

    public void n(ConstraintWidget constraintWidget, boolean z) {
        d dVar = this.d2;
        int i = dVar.Q0;
        if (i <= 0 && dVar.R0 <= 0) {
            return;
        }
        if (z) {
            dVar.S0 = dVar.R0;
            dVar.T0 = i;
            return;
        }
        dVar.S0 = i;
        dVar.T0 = dVar.R0;
    }

    @SuppressLint({"WrongCall"})
    public void onMeasure(int i, int i2) {
        t(this.d2, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.d2.h1 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.d2.b1 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.d2.i1 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.d2.c1 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.d2.n1 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.d2.f1 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.d2.l1 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.d2.Z0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.d2.q1 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.d2.r1 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        d dVar = this.d2;
        dVar.O0 = i;
        dVar.P0 = i;
        dVar.Q0 = i;
        dVar.R0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.d2.P0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.d2.S0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.d2.T0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.d2.O0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.d2.o1 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.d2.g1 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.d2.m1 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.d2.a1 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.d2.p1 = i;
        requestLayout();
    }

    public void t(h0.g.a.h.i iVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (iVar != null) {
            iVar.Z(mode, size, mode2, size2);
            setMeasuredDimension(iVar.V0, iVar.W0);
            return;
        }
        setMeasuredDimension(0, 0);
    }
}
