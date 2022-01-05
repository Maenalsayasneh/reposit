package h0.o.a;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import h0.f0.a.a;
import h0.o.a.c0;
import java.util.Objects;

@Deprecated
/* compiled from: FragmentPagerAdapter */
public abstract class z extends a {
    public final FragmentManager a;
    public final int b;
    public c0 c = null;
    public Fragment d = null;
    public boolean e;

    @Deprecated
    public z(FragmentManager fragmentManager) {
        this.a = fragmentManager;
        this.b = 0;
    }

    public static String b(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    public abstract Fragment a(int i);

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.c == null) {
            this.c = new a(this.a);
        }
        this.c.l(fragment);
        if (fragment.equals(this.d)) {
            this.d = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void finishUpdate(ViewGroup viewGroup) {
        c0 c0Var = this.c;
        if (c0Var != null) {
            if (!this.e) {
                try {
                    this.e = true;
                    c0Var.j();
                    this.e = false;
                } catch (Throwable th) {
                    this.e = false;
                    throw th;
                }
            }
            this.c = null;
        }
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.c == null) {
            this.c = new a(this.a);
        }
        long j = (long) i;
        Fragment J = this.a.J(b(viewGroup.getId(), j));
        if (J != null) {
            c0 c0Var = this.c;
            Objects.requireNonNull(c0Var);
            c0Var.e(new c0.a(7, J));
        } else {
            J = a(i);
            this.c.m(viewGroup.getId(), J, b(viewGroup.getId(), j), 1);
        }
        if (J != this.d) {
            J.setMenuVisibility(false);
            if (this.b == 1) {
                this.c.s(J, Lifecycle.State.STARTED);
            } else {
                J.setUserVisibleHint(false);
            }
        }
        return J;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.d;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.b == 1) {
                    if (this.c == null) {
                        this.c = new a(this.a);
                    }
                    this.c.s(this.d, Lifecycle.State.STARTED);
                } else {
                    this.d.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.b == 1) {
                if (this.c == null) {
                    this.c = new a(this.a);
                }
                this.c.s(fragment, Lifecycle.State.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.d = fragment;
        }
    }

    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public z(FragmentManager fragmentManager, int i) {
        this.a = fragmentManager;
        this.b = i;
    }
}
