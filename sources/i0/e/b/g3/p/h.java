package i0.e.b.g3.p;

import androidx.viewpager.widget.ViewPager;
import com.clubhouse.android.ui.hallway.HallwayFragment;
import i0.e.b.g3.p.b0.s;
import m0.r.k;

/* compiled from: HallwayFragment.kt */
public final class h extends ViewPager.m {
    public final /* synthetic */ HallwayFragment c;

    public h(HallwayFragment hallwayFragment) {
        this.c = hallwayFragment;
    }

    public void onPageSelected(int i) {
        HallwayFragment hallwayFragment = this.c;
        k<Object>[] kVarArr = HallwayFragment.Z1;
        hallwayFragment.P0().p(new a0(i == 0));
        if (i == 0) {
            this.c.P0().p(s.a);
        }
    }
}
