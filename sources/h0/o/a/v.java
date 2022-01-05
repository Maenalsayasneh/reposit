package h0.o.a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentLifecycleCallbacksDispatcher */
public class v {
    public final CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();
    public final FragmentManager b;

    /* compiled from: FragmentLifecycleCallbacksDispatcher */
    public static final class a {
        public final FragmentManager.k a;
        public final boolean b;

        public a(FragmentManager.k kVar, boolean z) {
            this.a = kVar;
            this.b = z;
        }
    }

    public v(FragmentManager fragmentManager) {
        this.b = fragmentManager;
    }

    public void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.b.t;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.a(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.onFragmentActivityCreated(this.b, fragment, bundle);
            }
        }
    }

    public void b(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Context context = fragmentManager.r.d;
        Fragment fragment2 = fragmentManager.t;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.b(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.onFragmentAttached(this.b, fragment, context);
            }
        }
    }

    public void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.b.t;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.c(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.onFragmentCreated(this.b, fragment, bundle);
            }
        }
    }

    public void d(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.t;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.d(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.onFragmentDestroyed(this.b, fragment);
            }
        }
    }

    public void e(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.t;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.e(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.onFragmentDetached(this.b, fragment);
            }
        }
    }

    public void f(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.t;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.f(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.onFragmentPaused(this.b, fragment);
            }
        }
    }

    public void g(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.b;
        Context context = fragmentManager.r.d;
        Fragment fragment2 = fragmentManager.t;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.g(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.onFragmentPreAttached(this.b, fragment, context);
            }
        }
    }

    public void h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.b.t;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.h(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.onFragmentPreCreated(this.b, fragment, bundle);
            }
        }
    }

    public void i(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.t;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.i(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.onFragmentResumed(this.b, fragment);
            }
        }
    }

    public void j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.b.t;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.j(fragment, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.onFragmentSaveInstanceState(this.b, fragment, bundle);
            }
        }
    }

    public void k(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.t;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.k(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.onFragmentStarted(this.b, fragment);
            }
        }
    }

    public void l(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.t;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.l(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.onFragmentStopped(this.b, fragment);
            }
        }
    }

    public void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.b.t;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.onFragmentViewCreated(this.b, fragment, view, bundle);
            }
        }
    }

    public void n(Fragment fragment, boolean z) {
        Fragment fragment2 = this.b.t;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().o.n(fragment, true);
        }
        Iterator<a> it = this.a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z || next.b) {
                next.a.onFragmentViewDestroyed(this.b, fragment);
            }
        }
    }
}
