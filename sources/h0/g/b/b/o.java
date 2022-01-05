package h0.g.b.b;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import h0.g.c.a;

/* compiled from: MotionHelper */
public class o extends a implements MotionLayout.i {
    public boolean b2;
    public boolean c2;
    public float d2;
    public View[] e2;

    public void a(MotionLayout motionLayout, int i, int i2, float f) {
    }

    public void b(MotionLayout motionLayout, int i, int i2) {
    }

    public void c(MotionLayout motionLayout, int i, boolean z, float f) {
    }

    public void d(MotionLayout motionLayout, int i) {
    }

    public float getProgress() {
        return this.d2;
    }

    public void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.MotionHelper_onShow) {
                    this.b2 = obtainStyledAttributes.getBoolean(index, this.b2);
                } else if (index == R.styleable.MotionHelper_onHide) {
                    this.c2 = obtainStyledAttributes.getBoolean(index, this.c2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.d2 = f;
        int i = 0;
        if (this.d > 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            View[] viewArr = this.Z1;
            if (viewArr == null || viewArr.length != this.d) {
                this.Z1 = new View[this.d];
            }
            for (int i2 = 0; i2 < this.d; i2++) {
                this.Z1[i2] = constraintLayout.f(this.c[i2]);
            }
            this.e2 = this.Z1;
            while (i < this.d) {
                View view = this.e2[i];
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            boolean z = viewGroup.getChildAt(i) instanceof o;
            i++;
        }
    }
}
