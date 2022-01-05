package h0.t;

import h0.q.k0;
import h0.q.m0;
import h0.q.n0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: NavControllerViewModel */
public class g extends k0 {
    public static final m0.b a = new a();
    public final HashMap<UUID, n0> b = new HashMap<>();

    /* compiled from: NavControllerViewModel */
    public class a implements m0.b {
        public <T extends k0> T create(Class<T> cls) {
            return new g();
        }
    }

    public void onCleared() {
        for (n0 a2 : this.b.values()) {
            a2.a();
        }
        this.b.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator<UUID> it = this.b.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
