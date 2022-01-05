package i0.j.e.a1;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import i0.j.e.f1.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: NavigableViewsTrackingDelegate */
public class g {
    public final Map<String, List<i0.j.e.d1.g<TabLayout, a>>> a = new HashMap();

    public final List<TabLayout> a(View view) {
        List<TabLayout> a2;
        ArrayList arrayList = new ArrayList();
        if (view instanceof TabLayout) {
            arrayList.add((TabLayout) view);
            return arrayList;
        } else if (!(view instanceof ViewGroup)) {
            return null;
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof TabLayout) {
                    arrayList.add((TabLayout) childAt);
                } else if ((childAt instanceof ViewGroup) && (a2 = a(childAt)) != null) {
                    arrayList.addAll(a2);
                }
            }
            return arrayList;
        }
    }

    public final void b(String str) {
        List<i0.j.e.d1.g> list = this.a.get(str);
        if (list != null && list.size() > 0) {
            for (i0.j.e.d1.g gVar : list) {
                Object obj = gVar.first;
                if (!(obj == null || gVar.second == null)) {
                    TabLayout tabLayout = (TabLayout) ((WeakReference) obj).get();
                    a aVar = (a) ((WeakReference) gVar.second).get();
                    if (!(tabLayout == null || aVar == null)) {
                        tabLayout.B2.remove(aVar);
                    }
                }
            }
        }
    }

    public final void c(List<TabLayout> list, String str) {
        boolean z;
        for (TabLayout next : list) {
            Iterator<List<i0.j.e.d1.g<TabLayout, a>>> it = this.a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Iterator it2 = it.next().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        TabLayout tabLayout = (TabLayout) ((WeakReference) ((i0.j.e.d1.g) it2.next()).first).get();
                        if (tabLayout != null && tabLayout.equals(next)) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            if (!z) {
                a aVar = new a(str.substring(str.lastIndexOf(".") + 1));
                if (!next.B2.contains(aVar)) {
                    next.B2.add(aVar);
                }
                List list2 = this.a.get(str);
                if (list2 == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new i0.j.e.d1.g(next, aVar));
                    this.a.put(str, arrayList);
                } else {
                    list2.add(new i0.j.e.d1.g(next, aVar));
                }
            }
        }
    }
}
