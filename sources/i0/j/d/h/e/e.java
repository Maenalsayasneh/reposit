package i0.j.d.h.e;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import h0.o.a.z;
import i0.j.d.b.c;

/* compiled from: FeaturesMainViewPagerAdapter */
public class e extends z {
    public c f;

    public e(FragmentManager fragmentManager, c cVar) {
        super(fragmentManager);
        this.f = cVar;
    }

    public Fragment a(int i) {
        if (i != 1) {
            return ((com.instabug.featuresrequest.ui.d.c) this.f).I0(i);
        }
        return ((com.instabug.featuresrequest.ui.d.c) this.f).I0(i);
    }

    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int i) {
        return i != 0 ? i != 1 ? "" : "My features" : "Features";
    }
}
