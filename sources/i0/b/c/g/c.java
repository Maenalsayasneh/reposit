package i0.b.c.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import com.airbnb.paris.typed_array_wrappers.MapTypedArrayWrapper;
import com.airbnb.paris.typed_array_wrappers.MultiTypedArrayWrapper;
import com.instabug.library.internal.storage.cache.UserAttributesCacheManager;
import i0.b.c.h.b;
import java.util.HashMap;
import java.util.Map;
import m0.j.g;
import m0.n.b.i;

/* compiled from: ProgrammaticStyle.kt */
public final class c implements e {
    public final boolean a = true;
    public final Map<Integer, Object> b;
    public String c;

    /* compiled from: ProgrammaticStyle.kt */
    public static final class a {
        public final Map<Integer, Object> a;
        public String b;

        public a() {
            this((Map) null, (String) null, 3);
        }

        public a(Map map, String str, int i) {
            String str2 = null;
            HashMap hashMap = (i & 1) != 0 ? new HashMap() : null;
            str2 = (i & 2) != 0 ? "a programmatic style" : str2;
            i.e(hashMap, "attrResToValueResMap");
            i.e(str2, "name");
            this.a = hashMap;
            this.b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.a, aVar.a) && i.a(this.b, aVar.b);
        }

        public int hashCode() {
            Map<Integer, Object> map = this.a;
            int i = 0;
            int hashCode = (map != null ? map.hashCode() : 0) * 31;
            String str = this.b;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Builder(attrResToValueResMap=");
            P0.append(this.a);
            P0.append(", name=");
            return i0.d.a.a.a.y0(P0, this.b, ")");
        }
    }

    public c(a aVar) {
        i.e(aVar, "builder");
        Map<Integer, Object> map = aVar.a;
        String str = aVar.b;
        i.e(map, "attributeMap");
        this.b = map;
        this.c = str;
    }

    @SuppressLint({"Recycle"})
    public i0.b.c.h.c a(Context context, int[] iArr) {
        i.e(context, "context");
        i.e(iArr, UserAttributesCacheManager.USER_ATTRIBUTES_CACHE_KEY);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        i.d(obtainStyledAttributes, "context.obtainStyledAttributes(attrs)");
        b bVar = new b(context, obtainStyledAttributes);
        MapTypedArrayWrapper mapTypedArrayWrapper = new MapTypedArrayWrapper(context, iArr, this.b);
        if (bVar.g() <= 0) {
            return mapTypedArrayWrapper;
        }
        return new MultiTypedArrayWrapper(g.K(bVar, mapTypedArrayWrapper), iArr);
    }

    public boolean b() {
        return this.a;
    }

    public String c(Context context) {
        i.e(context, "context");
        String str = this.c;
        if (str == null) {
            return "a programmatic style";
        }
        i.c(str);
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i.a(this.b, cVar.b) && i.a(this.c, cVar.c);
    }

    public int hashCode() {
        Map<Integer, Object> map = this.b;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ProgrammaticStyle(attributeMap=");
        P0.append(this.b);
        P0.append(", name=");
        return i0.d.a.a.a.y0(P0, this.c, ")");
    }
}
