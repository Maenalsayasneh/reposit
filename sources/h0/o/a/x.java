package h0.o.a;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import h0.q.k0;
import h0.q.m0;
import h0.q.n0;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel */
public final class x extends k0 {
    public static final m0.b a = new a();
    public final HashMap<String, Fragment> b = new HashMap<>();
    public final HashMap<String, x> c = new HashMap<>();
    public final HashMap<String, n0> d = new HashMap<>();
    public final boolean e;
    public boolean f = false;
    public boolean g = false;

    /* compiled from: FragmentManagerViewModel */
    public class a implements m0.b {
        public <T extends k0> T create(Class<T> cls) {
            return new x(true);
        }
    }

    public x(boolean z) {
        this.e = z;
    }

    public void a(Fragment fragment) {
        if (this.g) {
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.b.containsKey(fragment.mWho)) {
            this.b.put(fragment.mWho, fragment);
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public void b(Fragment fragment) {
        if (!this.g) {
            if ((this.b.remove(fragment.mWho) != null) && FragmentManager.R(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
            }
        } else if (FragmentManager.R(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    public boolean c(Fragment fragment) {
        if (this.b.containsKey(fragment.mWho) && this.e) {
            return this.f;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.b.equals(xVar.b) || !this.c.equals(xVar.c) || !this.d.equals(xVar.d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode();
        return this.d.hashCode() + ((hashCode + (this.b.hashCode() * 31)) * 31);
    }

    public void onCleared() {
        if (FragmentManager.R(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
