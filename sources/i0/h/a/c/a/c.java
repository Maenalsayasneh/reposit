package i0.h.a.c.a;

import android.util.Property;
import android.view.ViewGroup;
import com.google.android.material.R;

/* compiled from: ChildrenAlphaProperty */
public class c extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> a = new c("childrenAlpha");

    public c(String str) {
        super(Float.class, str);
    }

    public Object get(Object obj) {
        Float f = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    public void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Float) obj2).floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
