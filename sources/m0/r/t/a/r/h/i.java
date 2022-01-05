package m0.r.t.a.r.h;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;

/* compiled from: LazyStringArrayList */
public class i extends AbstractList<String> implements RandomAccess, j {
    public static final j c = new r(new i());
    public final List<Object> d;

    public i() {
        this.d = new ArrayList();
    }

    public static String b(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof c) {
            return ((c) obj).z();
        }
        return Internal.toStringUtf8((byte[]) obj);
    }

    public void add(int i, Object obj) {
        this.d.add(i, (String) obj);
        this.modCount++;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public void clear() {
        this.d.clear();
        this.modCount++;
    }

    public Object get(int i) {
        String str;
        Object obj = this.d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            str = cVar.z();
            if (cVar.s()) {
                this.d.set(i, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = Internal.toStringUtf8(bArr);
            if (Internal.isValidUtf8(bArr)) {
                this.d.set(i, str);
            }
        }
        return str;
    }

    public List<?> h() {
        return Collections.unmodifiableList(this.d);
    }

    public c m(int i) {
        c cVar;
        Object obj = this.d.get(i);
        if (obj instanceof c) {
            cVar = (c) obj;
        } else if (obj instanceof String) {
            cVar = c.e((String) obj);
        } else {
            byte[] bArr = (byte[]) obj;
            c cVar2 = c.c;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            cVar = new k(bArr2);
        }
        if (cVar != obj) {
            this.d.set(i, cVar);
        }
        return cVar;
    }

    public j p() {
        return new r(this);
    }

    public void q(c cVar) {
        this.d.add(cVar);
        this.modCount++;
    }

    public Object remove(int i) {
        Object remove = this.d.remove(i);
        this.modCount++;
        return b(remove);
    }

    public Object set(int i, Object obj) {
        return b(this.d.set(i, (String) obj));
    }

    public int size() {
        return this.d.size();
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof j) {
            collection = ((j) collection).h();
        }
        boolean addAll = this.d.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public i(j jVar) {
        this.d = new ArrayList(jVar.size());
        addAll(size(), jVar);
    }
}
