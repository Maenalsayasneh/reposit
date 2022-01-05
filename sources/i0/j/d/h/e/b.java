package i0.j.d.h.e;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.instabug.featuresrequest.ui.d.c;

/* compiled from: FeaturesMainFragment */
public class b implements TabLayout.c<TabLayout.g> {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    public void a(TabLayout.g gVar) {
    }

    public void b(TabLayout.g gVar) {
        ViewPager viewPager = this.a.y;
        if (viewPager != null) {
            viewPager.setCurrentItem(gVar.d);
        }
    }

    public void c(TabLayout.g gVar) {
    }
}
