package i0.h.a.c.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import h0.f.h;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MotionSpec */
public class g {
    public final h<String, h> a = new h<>();
    public final h<String, PropertyValuesHolder[]> b = new h<>();

    public static g a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static g b(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception e) {
            StringBuilder P0 = a.P0("Can't load animation resource ID #0x");
            P0.append(Integer.toHexString(i));
            Log.w("MotionSpec", P0.toString(), e);
            return null;
        }
    }

    public static g c(List<Animator> list) {
        g gVar = new g();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Animator animator = list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gVar.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = a.b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = a.c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = a.d;
                }
                h hVar = new h(startDelay, duration, interpolator);
                hVar.d = objectAnimator.getRepeatCount();
                hVar.e = objectAnimator.getRepeatMode();
                gVar.a.put(propertyName, hVar);
                i++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return gVar;
    }

    public h d(String str) {
        if (this.a.getOrDefault(str, null) != null) {
            return this.a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.a.equals(((g) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder N0 = a.N0(10);
        N0.append(g.class.getName());
        N0.append('{');
        N0.append(Integer.toHexString(System.identityHashCode(this)));
        N0.append(" timings: ");
        N0.append(this.a);
        N0.append("}\n");
        return N0.toString();
    }
}
