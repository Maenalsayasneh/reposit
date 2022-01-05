package i0.j.e.f1.p;

import android.view.View;
import java.util.Collection;
import java.util.LinkedHashSet;
import k0.b.y.e;

/* compiled from: Functions */
public final class f implements e<Collection<View>, Collection<View>> {
    public Object apply(Object obj) throws Exception {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (View view : (Collection) obj) {
            if (!view.getClass().getName().startsWith("com.instabug")) {
                linkedHashSet.add(view);
            }
        }
        return linkedHashSet;
    }
}
