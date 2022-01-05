package i0.h.a.b.g.h;

import com.google.android.gms.internal.recaptcha.zzct;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class i0 extends n<String> implements h0, RandomAccess {
    public static final i0 d;
    public final List<Object> q;

    static {
        i0 i0Var = new i0(10);
        d = i0Var;
        i0Var.c = false;
    }

    public i0(int i) {
        this.q = new ArrayList(i);
    }

    public static String c(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzct) {
            zzct zzct = (zzct) obj;
            Objects.requireNonNull(zzct);
            return zzct.c() == 0 ? "" : zzct.v(b0.a);
        }
        Charset charset = b0.a;
        return new String((byte[]) obj, b0.a);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        b();
        this.q.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        b();
        this.q.clear();
        this.modCount++;
    }

    public final List<?> d() {
        return Collections.unmodifiableList(this.q);
    }

    public final Object get(int i) {
        Object obj = this.q.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzct) {
            zzct zzct = (zzct) obj;
            Objects.requireNonNull(zzct);
            String v = zzct.c() == 0 ? "" : zzct.v(b0.a);
            if (zzct.y()) {
                this.q.set(i, v);
            }
            return v;
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = b0.a;
        String str = new String(bArr, b0.a);
        boolean z = false;
        if (e2.a.a(0, bArr, 0, bArr.length) == 0) {
            z = true;
        }
        if (z) {
            this.q.set(i, str);
        }
        return str;
    }

    public final /* synthetic */ c0 i(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.q);
            return new i0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final h0 l() {
        return this.c ? new y1(this) : this;
    }

    public final /* synthetic */ Object remove(int i) {
        b();
        Object remove = this.q.remove(i);
        this.modCount++;
        return c(remove);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        b();
        return c(this.q.set(i, (String) obj));
    }

    public final int size() {
        return this.q.size();
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        b();
        if (collection instanceof h0) {
            collection = ((h0) collection).d();
        }
        boolean addAll = this.q.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public i0(ArrayList<Object> arrayList) {
        this.q = arrayList;
    }
}
