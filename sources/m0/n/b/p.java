package m0.n.b;

import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: SpreadBuilder */
public class p {
    public final ArrayList<Object> a;

    public p(int i) {
        this.a = new ArrayList<>(i);
    }

    public void a(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    this.a.add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.a.add(it.next());
                }
            } else {
                StringBuilder P0 = a.P0("Don't know how to spread ");
                P0.append(obj.getClass());
                throw new UnsupportedOperationException(P0.toString());
            }
        }
    }

    public int b() {
        return this.a.size();
    }
}
