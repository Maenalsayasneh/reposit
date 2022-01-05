package i0.f.a.c.t;

import java.lang.reflect.Array;

/* compiled from: ArrayBuilders */
public final class b {
    public C0123b a = null;
    public c b = null;
    public h c = null;
    public f d = null;
    public g e = null;
    public e f = null;
    public d g = null;

    /* compiled from: ArrayBuilders */
    public static class a {
        public final /* synthetic */ Class a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Object c;

        public a(Class cls, int i, Object obj) {
            this.a = cls;
            this.b = i;
            this.c = obj;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!f.u(obj, this.a) || Array.getLength(obj) != this.b) {
                return false;
            }
            for (int i = 0; i < this.b; i++) {
                Object obj2 = Array.get(this.c, i);
                Object obj3 = Array.get(obj, i);
                if (obj2 != obj3 && obj2 != null && !obj2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: i0.f.a.c.t.b$b  reason: collision with other inner class name */
    /* compiled from: ArrayBuilders */
    public static final class C0123b extends o<boolean[]> {
        public Object a(int i) {
            return new boolean[i];
        }
    }

    /* compiled from: ArrayBuilders */
    public static final class c extends o<byte[]> {
        public Object a(int i) {
            return new byte[i];
        }
    }

    /* compiled from: ArrayBuilders */
    public static final class d extends o<double[]> {
        public Object a(int i) {
            return new double[i];
        }
    }

    /* compiled from: ArrayBuilders */
    public static final class e extends o<float[]> {
        public Object a(int i) {
            return new float[i];
        }
    }

    /* compiled from: ArrayBuilders */
    public static final class f extends o<int[]> {
        public Object a(int i) {
            return new int[i];
        }
    }

    /* compiled from: ArrayBuilders */
    public static final class g extends o<long[]> {
        public Object a(int i) {
            return new long[i];
        }
    }

    /* compiled from: ArrayBuilders */
    public static final class h extends o<short[]> {
        public Object a(int i) {
            return new short[i];
        }
    }

    public static Object a(Object obj) {
        return new a(obj.getClass(), Array.getLength(obj), obj);
    }
}
