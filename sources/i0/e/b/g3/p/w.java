package i0.e.b.g3.p;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.clubhouse.android.ui.hallway.buddyList.BuddyListFragment;
import com.clubhouse.android.ui.hallway.feed.FeedFragment;
import h0.o.a.z;
import m0.n.b.i;

/* compiled from: HallwayFragment.kt */
public final class w extends z {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(FragmentManager fragmentManager) {
        super(fragmentManager, 1);
        i.e(fragmentManager, "fragmentManager");
    }

    public Fragment a(int i) {
        if (i == 0) {
            return new BuddyListFragment();
        }
        return new FeedFragment();
    }

    public int getCount() {
        return 2;
    }

    public float getPageWidth(int i) {
        if (i == 0) {
            return super.getPageWidth(i) * 0.85f;
        }
        return super.getPageWidth(i);
    }
}
