package h0.q;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import h0.x.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: SavedStateHandle */
public final class f0 {
    public static final Class[] a = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final Map<String, Object> b;
    public final Map<String, a.b> c;
    public final Map<String, b<?>> d;
    public final a.b e;

    /* compiled from: SavedStateHandle */
    public class a implements a.b {
        public a() {
        }

        public Bundle a() {
            for (Map.Entry entry : new HashMap(f0.this.c).entrySet()) {
                f0.this.b((String) entry.getKey(), ((a.b) entry.getValue()).a());
            }
            Set<String> keySet = f0.this.b.keySet();
            ArrayList arrayList = new ArrayList(keySet.size());
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (String next : keySet) {
                arrayList.add(next);
                arrayList2.add(f0.this.b.get(next));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    /* compiled from: SavedStateHandle */
    public static class b<T> extends y<T> {
        public void setValue(T t) {
            super.setValue(t);
        }
    }

    public f0(Map<String, Object> map) {
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new a();
        this.b = new HashMap(map);
    }

    public <T> T a(String str) {
        return this.b.get(str);
    }

    public <T> void b(String str, T t) {
        if (t != null) {
            Class[] clsArr = a;
            int length = clsArr.length;
            int i = 0;
            while (i < length) {
                if (!clsArr[i].isInstance(t)) {
                    i++;
                }
            }
            StringBuilder P0 = i0.d.a.a.a.P0("Can't put value with type ");
            P0.append(t.getClass());
            P0.append(" into saved state");
            throw new IllegalArgumentException(P0.toString());
        }
        y yVar = this.d.get(str);
        if (yVar != null) {
            yVar.setValue(t);
        } else {
            this.b.put(str, t);
        }
    }

    public f0() {
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new a();
        this.b = new HashMap();
    }
}
