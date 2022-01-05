package i0.j.e.f1.p;

import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: Functions */
public final class e implements k0.b.y.e<Collection<View>, Collection<View>> {
    public Object apply(Object obj) throws Exception {
        boolean z;
        Collection<View> collection = (Collection) obj;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (View view : collection) {
            Iterator it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((View) it.next()).getParent() == view) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                linkedHashSet.add(view);
            }
        }
        return linkedHashSet;
    }
}
