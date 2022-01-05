package i0.b.c.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import com.airbnb.paris.typed_array_wrappers.MultiTypedArrayWrapper;
import com.instabug.library.internal.storage.cache.UserAttributesCacheManager;
import i0.b.c.h.c;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import m0.j.g;
import m0.n.b.i;

/* compiled from: MultiStyle.kt */
public final class b implements e {
    public final boolean a = true;
    public final String b;
    public final List<e> c;

    public b(String str, List<? extends e> list) {
        i.e(str, "name");
        i.e(list, "styles");
        this.b = str;
        this.c = list;
    }

    public static final e d(String str, List<? extends e> list) {
        i.e(str, "name");
        i.e(list, "styles");
        int size = list.size();
        if (size == 0) {
            return a.a;
        }
        if (size != 1) {
            return new b(str, list);
        }
        return (e) g.u(list);
    }

    @SuppressLint({"Recycle"})
    public c a(Context context, int[] iArr) {
        i.e(context, "context");
        i.e(iArr, UserAttributesCacheManager.USER_ATTRIBUTES_CACHE_KEY);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        i.d(obtainStyledAttributes, "context.obtainStyledAttributes(attrs)");
        i0.b.c.h.b bVar = new i0.b.c.h.b(context, obtainStyledAttributes);
        List<e> list = this.c;
        ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (e a2 : list) {
            arrayList.add(a2.a(context, iArr));
        }
        return new MultiTypedArrayWrapper(g.Z(h.L2(bVar), arrayList), iArr);
    }

    public boolean b() {
        return this.a;
    }

    public String c(Context context) {
        i.e(context, "context");
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return i.a(this.b, bVar.b) && i.a(this.c, bVar.c);
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<e> list = this.c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("MultiStyle(name=");
        P0.append(this.b);
        P0.append(", styles=");
        P0.append(this.c);
        P0.append(")");
        return P0.toString();
    }
}
