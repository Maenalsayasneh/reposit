package i0.j.e.f1.p;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* compiled from: ActivityLayoutInspector */
public class a {
    public final Collection<View> a(ViewGroup viewGroup, Collection<View> collection) {
        collection.add(viewGroup);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            collection.add(childAt);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, collection);
            }
        }
        return collection;
    }
}
