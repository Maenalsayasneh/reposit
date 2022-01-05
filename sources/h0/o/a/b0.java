package h0.o.a;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: FragmentStore */
public class b0 {
    public final ArrayList<Fragment> a = new ArrayList<>();
    public final HashMap<String, a0> b = new HashMap<>();
    public x c;

    public void a(Fragment fragment) {
        if (!this.a.contains(fragment)) {
            synchronized (this.a) {
                this.a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public void b() {
        this.b.values().removeAll(Collections.singleton((Object) null));
    }

    public boolean c(String str) {
        return this.b.get(str) != null;
    }

    public Fragment d(String str) {
        a0 a0Var = this.b.get(str);
        if (a0Var != null) {
            return a0Var.c;
        }
        return null;
    }

    public Fragment e(String str) {
        Fragment findFragmentByWho;
        for (a0 next : this.b.values()) {
            if (next != null && (findFragmentByWho = next.c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public List<a0> f() {
        ArrayList arrayList = new ArrayList();
        for (a0 next : this.b.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public List<Fragment> g() {
        ArrayList arrayList = new ArrayList();
        for (a0 next : this.b.values()) {
            if (next != null) {
                arrayList.add(next.c);
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    public a0 h(String str) {
        return this.b.get(str);
    }

    public List<Fragment> i() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public void j(a0 a0Var) {
        Fragment fragment = a0Var.c;
        if (!c(fragment.mWho)) {
            this.b.put(fragment.mWho, a0Var);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                if (fragment.mRetainInstance) {
                    this.c.a(fragment);
                } else {
                    this.c.b(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + fragment);
            }
        }
    }

    public void k(a0 a0Var) {
        Fragment fragment = a0Var.c;
        if (fragment.mRetainInstance) {
            this.c.b(fragment);
        }
        if (this.b.put(fragment.mWho, (Object) null) != null && FragmentManager.R(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public void l(Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.mAdded = false;
    }
}
