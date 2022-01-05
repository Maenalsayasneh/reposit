package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.R;
import h0.i.i.d0;
import h0.i.i.q;
import h0.o.a.a0;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.Iterator;

public final class FragmentContainerView extends FrameLayout {
    public ArrayList<View> c;
    public ArrayList<View> d;
    public View.OnApplyWindowInsetsListener q;
    public boolean x = true;

    public FragmentContainerView(Context context) {
        super(context);
    }

    public final void a(View view) {
        ArrayList<View> arrayList = this.d;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.c == null) {
                this.c = new ArrayList<>();
            }
            this.c.add(view);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        d0 d0Var;
        d0 k = d0.k(windowInsets, (View) null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.q;
        if (onApplyWindowInsetsListener != null) {
            d0Var = d0.j(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            d0Var = q.k(this, k);
        }
        if (!d0Var.g()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                q.c(getChildAt(i), d0Var);
            }
        }
        return windowInsets;
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.x && this.c != null) {
            for (int i = 0; i < this.c.size(); i++) {
                super.drawChild(canvas, this.c.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.x || (arrayList = this.c) == null || arrayList.size() <= 0 || !this.c.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.d;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.c;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.x = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    public void removeDetachedView(View view, boolean z) {
        if (z) {
            a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        a(getChildAt(i));
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.x = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.q = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.d == null) {
                this.d = new ArrayList<>();
            }
            this.d.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FragmentContainerView);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
            }
        }
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        View view;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FragmentContainerView);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(R.styleable.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment I = fragmentManager.I(id);
        if (classAttribute != null && I == null) {
            if (id <= 0) {
                throw new IllegalStateException(a.o0("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? a.n0(" with tag ", string) : ""));
            }
            Fragment instantiate = fragmentManager.N().instantiate(context.getClassLoader(), classAttribute);
            instantiate.onInflate(context, attributeSet, (Bundle) null);
            h0.o.a.a aVar = new h0.o.a.a(fragmentManager);
            aVar.r = true;
            instantiate.mContainer = this;
            aVar.m(getId(), instantiate, string, 1);
            aVar.j();
        }
        Iterator it = ((ArrayList) fragmentManager.c.f()).iterator();
        while (it.hasNext()) {
            a0 a0Var = (a0) it.next();
            Fragment fragment = a0Var.c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                a0Var.b();
            }
        }
    }
}
