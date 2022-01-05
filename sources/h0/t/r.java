package h0.t;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* compiled from: NavType */
public abstract class r<T> {
    public static final r<Integer> a = new c(false);
    public static final r<Integer> b = new d(false);
    public static final r<int[]> c = new e(true);
    public static final r<Long> d = new f(false);
    public static final r<long[]> e = new g(true);
    public static final r<Float> f = new h(false);
    public static final r<float[]> g = new i(true);
    public static final r<Boolean> h = new j(false);
    public static final r<boolean[]> i = new k(true);
    public static final r<String> j = new a(true);
    public static final r<String[]> k = new b(true);
    public final boolean l;

    /* compiled from: NavType */
    public class a extends r<String> {
        public a(boolean z) {
            super(z);
        }

        public Object a(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        public String b() {
            return "string";
        }

        public Object c(String str) {
            return str;
        }

        public void d(Bundle bundle, String str, Object obj) {
            bundle.putString(str, (String) obj);
        }
    }

    /* compiled from: NavType */
    public class b extends r<String[]> {
        public b(boolean z) {
            super(z);
        }

        public Object a(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        public String b() {
            return "string[]";
        }

        public Object c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void d(Bundle bundle, String str, Object obj) {
            bundle.putStringArray(str, (String[]) obj);
        }
    }

    /* compiled from: NavType */
    public class c extends r<Integer> {
        public c(boolean z) {
            super(z);
        }

        public Object a(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        public String b() {
            return "integer";
        }

        public Object c(String str) {
            if (str.startsWith("0x")) {
                return Integer.valueOf(Integer.parseInt(str.substring(2), 16));
            }
            return Integer.valueOf(Integer.parseInt(str));
        }

        public void d(Bundle bundle, String str, Object obj) {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* compiled from: NavType */
    public class d extends r<Integer> {
        public d(boolean z) {
            super(z);
        }

        public Object a(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        public String b() {
            return "reference";
        }

        public Object c(String str) {
            throw new UnsupportedOperationException("References don't support parsing string values.");
        }

        public void d(Bundle bundle, String str, Object obj) {
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* compiled from: NavType */
    public class e extends r<int[]> {
        public e(boolean z) {
            super(z);
        }

        public Object a(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        public String b() {
            return "integer[]";
        }

        public Object c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void d(Bundle bundle, String str, Object obj) {
            bundle.putIntArray(str, (int[]) obj);
        }
    }

    /* compiled from: NavType */
    public class f extends r<Long> {
        public f(boolean z) {
            super(z);
        }

        public Object a(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        public String b() {
            return "long";
        }

        public Object c(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.startsWith("0x")) {
                return Long.valueOf(Long.parseLong(str.substring(2), 16));
            }
            return Long.valueOf(Long.parseLong(str));
        }

        public void d(Bundle bundle, String str, Object obj) {
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* compiled from: NavType */
    public class g extends r<long[]> {
        public g(boolean z) {
            super(z);
        }

        public Object a(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        public String b() {
            return "long[]";
        }

        public Object c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void d(Bundle bundle, String str, Object obj) {
            bundle.putLongArray(str, (long[]) obj);
        }
    }

    /* compiled from: NavType */
    public class h extends r<Float> {
        public h(boolean z) {
            super(z);
        }

        public Object a(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        public String b() {
            return "float";
        }

        public Object c(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        public void d(Bundle bundle, String str, Object obj) {
            bundle.putFloat(str, ((Float) obj).floatValue());
        }
    }

    /* compiled from: NavType */
    public class i extends r<float[]> {
        public i(boolean z) {
            super(z);
        }

        public Object a(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        public String b() {
            return "float[]";
        }

        public Object c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void d(Bundle bundle, String str, Object obj) {
            bundle.putFloatArray(str, (float[]) obj);
        }
    }

    /* compiled from: NavType */
    public class j extends r<Boolean> {
        public j(boolean z) {
            super(z);
        }

        public Object a(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        public String b() {
            return "boolean";
        }

        public Object c(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        public void d(Bundle bundle, String str, Object obj) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* compiled from: NavType */
    public class k extends r<boolean[]> {
        public k(boolean z) {
            super(z);
        }

        public Object a(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        public String b() {
            return "boolean[]";
        }

        public Object c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void d(Bundle bundle, String str, Object obj) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        }
    }

    /* compiled from: NavType */
    public static final class l<D extends Enum> extends p<D> {
        public final Class<D> n;

        public l(Class<D> cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.n = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        public String b() {
            return this.n.getName();
        }

        /* renamed from: f */
        public D e(String str) {
            for (D d : (Enum[]) this.n.getEnumConstants()) {
                if (d.name().equals(str)) {
                    return d;
                }
            }
            throw new IllegalArgumentException(i0.d.a.a.a.Y(this.n, i0.d.a.a.a.T0("Enum value ", str, " not found for type "), "."));
        }
    }

    /* compiled from: NavType */
    public static final class m<D extends Parcelable> extends r<D[]> {
        public final Class<D[]> m;

        public m(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    this.m = Class.forName("[L" + cls.getName() + ";");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
        }

        public Object a(Bundle bundle, String str) {
            return (Parcelable[]) bundle.get(str);
        }

        public String b() {
            return this.m.getName();
        }

        public Object c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public void d(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            this.m.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || m.class != obj.getClass()) {
                return false;
            }
            return this.m.equals(((m) obj).m);
        }

        public int hashCode() {
            return this.m.hashCode();
        }
    }

    /* compiled from: NavType */
    public static final class n<D> extends r<D> {
        public final Class<D> m;

        public n(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
        }

        public D a(Bundle bundle, String str) {
            return bundle.get(str);
        }

        public String b() {
            return this.m.getName();
        }

        public D c(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public void d(Bundle bundle, String str, D d) {
            this.m.cast(d);
            if (d == null || (d instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d);
            } else if (d instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n.class != obj.getClass()) {
                return false;
            }
            return this.m.equals(((n) obj).m);
        }

        public int hashCode() {
            return this.m.hashCode();
        }
    }

    /* compiled from: NavType */
    public static final class o<D extends Serializable> extends r<D[]> {
        public final Class<D[]> m;

        public o(Class<D> cls) {
            super(true);
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    this.m = Class.forName("[L" + cls.getName() + ";");
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
        }

        public Object a(Bundle bundle, String str) {
            return (Serializable[]) bundle.get(str);
        }

        public String b() {
            return this.m.getName();
        }

        public Object c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
        public void d(Bundle bundle, String str, Object obj) {
            ? r4 = (Serializable[]) obj;
            this.m.cast(r4);
            bundle.putSerializable(str, r4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || o.class != obj.getClass()) {
                return false;
            }
            return this.m.equals(((o) obj).m);
        }

        public int hashCode() {
            return this.m.hashCode();
        }
    }

    public r(boolean z) {
        this.l = z;
    }

    public abstract T a(Bundle bundle, String str);

    public abstract String b();

    public abstract T c(String str);

    public abstract void d(Bundle bundle, String str, T t);

    public String toString() {
        return b();
    }

    /* compiled from: NavType */
    public static class p<D extends Serializable> extends r<D> {
        public final Class<D> m;

        public p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            } else if (!cls.isEnum()) {
                this.m = cls;
            } else {
                throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
            }
        }

        public Object a(Bundle bundle, String str) {
            return (Serializable) bundle.get(str);
        }

        public String b() {
            return this.m.getName();
        }

        public void d(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            this.m.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        /* renamed from: e */
        public D c(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            return this.m.equals(((p) obj).m);
        }

        public int hashCode() {
            return this.m.hashCode();
        }

        public p(boolean z, Class<D> cls) {
            super(z);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }
    }
}
