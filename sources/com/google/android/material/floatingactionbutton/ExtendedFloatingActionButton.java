package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import h0.i.i.q;
import i0.h.a.c.a.g;
import i0.h.a.c.p.i;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public static final /* synthetic */ int c = 0;
    public boolean d;

    public static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().width);
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().width = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    public static class b extends Property<View, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().height);
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().height = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    public static class c extends Property<View, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            AtomicInteger atomicInteger = q.a;
            return Float.valueOf((float) ((View) obj).getPaddingStart());
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            int intValue = ((Float) obj2).intValue();
            int paddingTop = view.getPaddingTop();
            AtomicInteger atomicInteger = q.a;
            view.setPaddingRelative(intValue, paddingTop, view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    public static class d extends Property<View, Float> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            AtomicInteger atomicInteger = q.a;
            return Float.valueOf((float) ((View) obj).getPaddingEnd());
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            AtomicInteger atomicInteger = q.a;
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), ((Float) obj2).intValue(), view.getPaddingBottom());
        }
    }

    static {
        Class<Float> cls = Float.class;
        new a(cls, "width");
        new b(cls, "height");
        new c(cls, "paddingStart");
        new d(cls, "paddingEnd");
    }

    public static void a(ExtendedFloatingActionButton extendedFloatingActionButton, i iVar) {
        Objects.requireNonNull(extendedFloatingActionButton);
        throw null;
    }

    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public g getExtendMotionSpec() {
        throw null;
    }

    public g getHideMotionSpec() {
        throw null;
    }

    public g getShowMotionSpec() {
        throw null;
    }

    public g getShrinkMotionSpec() {
        throw null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.d = z;
    }

    public void setExtendMotionSpec(g gVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(g.b(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (z) {
            throw null;
        }
    }

    public void setHideMotionSpec(g gVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(g.b(getContext(), i));
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }

    public void setShowMotionSpec(g gVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(g.b(getContext(), i));
    }

    public void setShrinkMotionSpec(g gVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(g.b(getContext(), i));
    }

    public void setTextColor(int i) {
        super.setTextColor(i);
        getTextColors();
    }

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect a;
        public boolean b;
        public boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }

        public final boolean B(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((this.b || this.c) && fVar.f == view.getId()) {
                return true;
            }
            return false;
        }

        public final boolean C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!B(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            i0.h.a.c.q.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (this.c) {
                    int i = ExtendedFloatingActionButton.c;
                    Objects.requireNonNull(extendedFloatingActionButton);
                } else {
                    int i2 = ExtendedFloatingActionButton.c;
                    Objects.requireNonNull(extendedFloatingActionButton);
                }
                ExtendedFloatingActionButton.a(extendedFloatingActionButton, (i) null);
                return true;
            }
            if (this.c) {
                int i3 = ExtendedFloatingActionButton.c;
                Objects.requireNonNull(extendedFloatingActionButton);
            } else {
                int i4 = ExtendedFloatingActionButton.c;
                Objects.requireNonNull(extendedFloatingActionButton);
            }
            ExtendedFloatingActionButton.a(extendedFloatingActionButton, (i) null);
            return true;
        }

        public final boolean D(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!B(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                if (this.c) {
                    int i = ExtendedFloatingActionButton.c;
                } else {
                    int i2 = ExtendedFloatingActionButton.c;
                }
                ExtendedFloatingActionButton.a(extendedFloatingActionButton, (i) null);
                return true;
            }
            if (this.c) {
                int i3 = ExtendedFloatingActionButton.c;
            } else {
                int i4 = ExtendedFloatingActionButton.c;
            }
            ExtendedFloatingActionButton.a(extendedFloatingActionButton, (i) null);
            return true;
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        public void f(CoordinatorLayout.f fVar) {
            if (fVar.h == 0) {
                fVar.h = 80;
            }
        }

        public boolean g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                C(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) {
                    D(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> f = coordinatorLayout.f(extendedFloatingActionButton);
            int size = f.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = f.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) && D(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (C(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.s(extendedFloatingActionButton, i);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ExtendedFloatingActionButton_Behavior_Layout);
            this.b = obtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.c = obtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}
