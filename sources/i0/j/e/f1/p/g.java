package i0.j.e.f1.p;

import android.graphics.Rect;
import android.view.View;
import com.instabug.library.util.ListUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import k0.b.y.e;

/* compiled from: Functions */
public final class g implements e<Collection<View>, Collection<View>> {
    public Object apply(Object obj) throws Exception {
        boolean z;
        boolean z2;
        List list = ListUtils.toList((Collection) obj);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < list.size(); i++) {
            View view = (View) list.get(i);
            Iterator it = list.subList(i, list.size()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                View view2 = (View) it.next();
                if (view == view2) {
                    z2 = false;
                    continue;
                } else {
                    Rect rect = new Rect();
                    view.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    view2.getGlobalVisibleRect(rect2);
                    z2 = rect.intersect(rect2);
                    continue;
                }
                if (z2) {
                    z = true;
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
