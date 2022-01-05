package h0.g.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;

/* compiled from: VirtualLayout */
public abstract class i extends a {
    public boolean b2;
    public boolean c2;

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void i(ConstraintLayout constraintLayout) {
        h(constraintLayout);
    }

    public void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_android_visibility) {
                    this.b2 = true;
                } else if (index == R.styleable.ConstraintLayout_Layout_android_elevation) {
                    this.c2 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.b2 || this.c2) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.d; i++) {
                    View f = constraintLayout.f(this.c[i]);
                    if (f != null) {
                        if (this.b2) {
                            f.setVisibility(visibility);
                        }
                        if (this.c2 && elevation > 0.0f) {
                            f.setTranslationZ(f.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            h((ConstraintLayout) parent);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            h((ConstraintLayout) parent);
        }
    }

    public void t(h0.g.a.h.i iVar, int i, int i2) {
    }
}
