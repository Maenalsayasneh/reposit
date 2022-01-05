package h0.g.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import h0.g.c.c;
import java.util.Objects;

/* compiled from: Constraints */
public class d extends ViewGroup {
    public c c;

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public c getConstraintSet() {
        if (this.c == null) {
            this.c = new c();
        }
        c cVar = this.c;
        Objects.requireNonNull(cVar);
        int childCount = getChildCount();
        cVar.i.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = getChildAt(i);
            a aVar = (a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!cVar.h || id != -1) {
                if (!cVar.i.containsKey(Integer.valueOf(id))) {
                    cVar.i.put(Integer.valueOf(id), new c.a());
                }
                c.a aVar2 = cVar.i.get(Integer.valueOf(id));
                if (aVar2 != null) {
                    if (childAt instanceof a) {
                        a aVar3 = (a) childAt;
                        aVar2.d(id, aVar);
                        if (aVar3 instanceof Barrier) {
                            c.b bVar = aVar2.e;
                            bVar.f28i0 = 1;
                            Barrier barrier = (Barrier) aVar3;
                            bVar.f26g0 = barrier.getType();
                            aVar2.e.f29j0 = barrier.getReferencedIds();
                            aVar2.e.f27h0 = barrier.getMargin();
                        }
                    }
                    aVar2.d(id, aVar);
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.c;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    /* compiled from: Constraints */
    public static class a extends ConstraintLayout.a {
        public float A0;
        public float B0;
        public float C0;

        /* renamed from: q0  reason: collision with root package name */
        public float f36q0;

        /* renamed from: r0  reason: collision with root package name */
        public boolean f37r0;

        /* renamed from: s0  reason: collision with root package name */
        public float f38s0;

        /* renamed from: t0  reason: collision with root package name */
        public float f39t0;

        /* renamed from: u0  reason: collision with root package name */
        public float f40u0;

        /* renamed from: v0  reason: collision with root package name */
        public float f41v0;
        public float w0;
        public float x0;
        public float y0;
        public float z0;

        public a(int i, int i2) {
            super(i, i2);
            this.f36q0 = 1.0f;
            this.f37r0 = false;
            this.f38s0 = 0.0f;
            this.f39t0 = 0.0f;
            this.f40u0 = 0.0f;
            this.f41v0 = 0.0f;
            this.w0 = 1.0f;
            this.x0 = 1.0f;
            this.y0 = 0.0f;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f36q0 = 1.0f;
            this.f37r0 = false;
            this.f38s0 = 0.0f;
            this.f39t0 = 0.0f;
            this.f40u0 = 0.0f;
            this.f41v0 = 0.0f;
            this.w0 = 1.0f;
            this.x0 = 1.0f;
            this.y0 = 0.0f;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintSet_android_alpha) {
                    this.f36q0 = obtainStyledAttributes.getFloat(index, this.f36q0);
                } else if (index == R.styleable.ConstraintSet_android_elevation) {
                    this.f38s0 = obtainStyledAttributes.getFloat(index, this.f38s0);
                    this.f37r0 = true;
                } else if (index == R.styleable.ConstraintSet_android_rotationX) {
                    this.f40u0 = obtainStyledAttributes.getFloat(index, this.f40u0);
                } else if (index == R.styleable.ConstraintSet_android_rotationY) {
                    this.f41v0 = obtainStyledAttributes.getFloat(index, this.f41v0);
                } else if (index == R.styleable.ConstraintSet_android_rotation) {
                    this.f39t0 = obtainStyledAttributes.getFloat(index, this.f39t0);
                } else if (index == R.styleable.ConstraintSet_android_scaleX) {
                    this.w0 = obtainStyledAttributes.getFloat(index, this.w0);
                } else if (index == R.styleable.ConstraintSet_android_scaleY) {
                    this.x0 = obtainStyledAttributes.getFloat(index, this.x0);
                } else if (index == R.styleable.ConstraintSet_android_transformPivotX) {
                    this.y0 = obtainStyledAttributes.getFloat(index, this.y0);
                } else if (index == R.styleable.ConstraintSet_android_transformPivotY) {
                    this.z0 = obtainStyledAttributes.getFloat(index, this.z0);
                } else if (index == R.styleable.ConstraintSet_android_translationX) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == R.styleable.ConstraintSet_android_translationY) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == R.styleable.ConstraintSet_android_translationZ) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
