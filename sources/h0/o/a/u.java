package h0.o.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.SpecialEffectsController;

/* compiled from: FragmentLayoutInflaterFactory */
public class u implements LayoutInflater.Factory2 {
    public final FragmentManager c;

    /* compiled from: FragmentLayoutInflaterFactory */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ a0 c;

        public a(a0 a0Var) {
            this.c = a0Var;
        }

        public void onViewAttachedToWindow(View view) {
            a0 a0Var = this.c;
            Fragment fragment = a0Var.c;
            a0Var.k();
            SpecialEffectsController.f((ViewGroup) fragment.mView.getParent(), u.this.c).e();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public u(FragmentManager fragmentManager) {
        this.c = fragmentManager;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        a0 a0Var;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.c);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Fragment);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(R.styleable.Fragment_android_name);
        }
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.Fragment_android_id, -1);
        String string = obtainStyledAttributes.getString(R.styleable.Fragment_android_tag);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !s.isFragmentClass(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.c.I(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.c.J(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.c.I(id);
        }
        if (fragment == null) {
            fragment = this.c.N().instantiate(context.getClassLoader(), attributeValue);
            fragment.mFromLayout = true;
            fragment.mFragmentId = resourceId != 0 ? resourceId : id;
            fragment.mContainerId = id;
            fragment.mTag = string;
            fragment.mInLayout = true;
            FragmentManager fragmentManager = this.c;
            fragment.mFragmentManager = fragmentManager;
            t<?> tVar = fragmentManager.r;
            fragment.mHost = tVar;
            fragment.onInflate(tVar.d, attributeSet, fragment.mSavedFragmentState);
            a0Var = this.c.a(fragment);
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            FragmentManager fragmentManager2 = this.c;
            fragment.mFragmentManager = fragmentManager2;
            t<?> tVar2 = fragmentManager2.r;
            fragment.mHost = tVar2;
            fragment.onInflate(tVar2.d, attributeSet, fragment.mSavedFragmentState);
            a0Var = this.c.h(fragment);
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        fragment.mContainer = (ViewGroup) view;
        a0Var.k();
        a0Var.j();
        View view2 = fragment.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            fragment.mView.addOnAttachStateChangeListener(new a(a0Var));
            return fragment.mView;
        }
        throw new IllegalStateException(i0.d.a.a.a.o0("Fragment ", attributeValue, " did not create a view."));
    }
}
