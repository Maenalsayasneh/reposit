package i0.j.e.b1.a;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.instabug.library.ui.onboarding.d;
import h0.o.a.z;
import java.util.List;

/* compiled from: GenericPagerAdapter */
public class a extends z {
    public List<d> f;

    public a(FragmentManager fragmentManager, List<d> list) {
        super(fragmentManager);
        this.f = list;
    }

    public Fragment a(int i) {
        return this.f.get(i);
    }

    public int getCount() {
        return this.f.size();
    }
}
