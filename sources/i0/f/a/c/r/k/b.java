package i0.f.a.c.r.k;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import i0.f.a.c.g;
import i0.f.a.c.i;
import java.util.Arrays;

/* compiled from: PropertySerializerMap */
public abstract class b {
    public final boolean a;

    /* compiled from: PropertySerializerMap */
    public static final class a extends b {
        public final Class<?> b;
        public final Class<?> c;
        public final g<Object> d;
        public final g<Object> e;

        public a(b bVar, Class<?> cls, g<Object> gVar, Class<?> cls2, g<Object> gVar2) {
            super(bVar);
            this.b = cls;
            this.d = gVar;
            this.c = cls2;
            this.e = gVar2;
        }

        public b b(Class<?> cls, g<Object> gVar) {
            return new c(this, new f[]{new f(this.b, this.d), new f(this.c, this.e), new f(cls, gVar)});
        }

        public g<Object> c(Class<?> cls) {
            if (cls == this.b) {
                return this.d;
            }
            if (cls == this.c) {
                return this.e;
            }
            return null;
        }
    }

    /* renamed from: i0.f.a.c.r.k.b$b  reason: collision with other inner class name */
    /* compiled from: PropertySerializerMap */
    public static final class C0122b extends b {
        public static final C0122b b = new C0122b(false);

        public C0122b(boolean z) {
            super(z);
        }

        public b b(Class<?> cls, g<Object> gVar) {
            return new e(this, cls, gVar);
        }

        public g<Object> c(Class<?> cls) {
            return null;
        }
    }

    /* compiled from: PropertySerializerMap */
    public static final class c extends b {
        public final f[] b;

        public c(b bVar, f[] fVarArr) {
            super(bVar);
            this.b = fVarArr;
        }

        public b b(Class<?> cls, g<Object> gVar) {
            f[] fVarArr = this.b;
            int length = fVarArr.length;
            if (length == 8) {
                return this.a ? new e(this, cls, gVar) : this;
            }
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, length + 1);
            fVarArr2[length] = new f(cls, gVar);
            return new c(this, fVarArr2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
            r1 = r0[6];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
            if (r1.a != r4) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
            return r1.b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            r1 = r0[5];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
            if (r1.a != r4) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
            return r1.b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
            r1 = r0[4];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0048, code lost:
            if (r1.a != r4) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
            return r1.b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
            r0 = r0[3];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
            if (r0.a != r4) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0056, code lost:
            return r0.b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public i0.f.a.c.g<java.lang.Object> c(java.lang.Class<?> r4) {
            /*
                r3 = this;
                i0.f.a.c.r.k.b$f[] r0 = r3.b
                r1 = 0
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L_0x000c
                i0.f.a.c.g<java.lang.Object> r4 = r1.b
                return r4
            L_0x000c:
                r1 = 1
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L_0x0016
                i0.f.a.c.g<java.lang.Object> r4 = r1.b
                return r4
            L_0x0016:
                r1 = 2
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L_0x0020
                i0.f.a.c.g<java.lang.Object> r4 = r1.b
                return r4
            L_0x0020:
                int r1 = r0.length
                switch(r1) {
                    case 4: goto L_0x004d;
                    case 5: goto L_0x0043;
                    case 6: goto L_0x0039;
                    case 7: goto L_0x002f;
                    case 8: goto L_0x0025;
                    default: goto L_0x0024;
                }
            L_0x0024:
                goto L_0x0057
            L_0x0025:
                r1 = 7
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L_0x002f
                i0.f.a.c.g<java.lang.Object> r4 = r1.b
                return r4
            L_0x002f:
                r1 = 6
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L_0x0039
                i0.f.a.c.g<java.lang.Object> r4 = r1.b
                return r4
            L_0x0039:
                r1 = 5
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L_0x0043
                i0.f.a.c.g<java.lang.Object> r4 = r1.b
                return r4
            L_0x0043:
                r1 = 4
                r1 = r0[r1]
                java.lang.Class<?> r2 = r1.a
                if (r2 != r4) goto L_0x004d
                i0.f.a.c.g<java.lang.Object> r4 = r1.b
                return r4
            L_0x004d:
                r1 = 3
                r0 = r0[r1]
                java.lang.Class<?> r1 = r0.a
                if (r1 != r4) goto L_0x0057
                i0.f.a.c.g<java.lang.Object> r4 = r0.b
                return r4
            L_0x0057:
                r4 = 0
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.f.a.c.r.k.b.c.c(java.lang.Class):i0.f.a.c.g");
        }
    }

    /* compiled from: PropertySerializerMap */
    public static final class d {
        public final g<Object> a;
        public final b b;

        public d(g<Object> gVar, b bVar) {
            this.a = gVar;
            this.b = bVar;
        }
    }

    /* compiled from: PropertySerializerMap */
    public static final class e extends b {
        public final Class<?> b;
        public final g<Object> c;

        public e(b bVar, Class<?> cls, g<Object> gVar) {
            super(bVar);
            this.b = cls;
            this.c = gVar;
        }

        public b b(Class<?> cls, g<Object> gVar) {
            return new a(this, this.b, this.c, cls, gVar);
        }

        public g<Object> c(Class<?> cls) {
            if (cls == this.b) {
                return this.c;
            }
            return null;
        }
    }

    /* compiled from: PropertySerializerMap */
    public static final class f {
        public final Class<?> a;
        public final g<Object> b;

        public f(Class<?> cls, g<Object> gVar) {
            this.a = cls;
            this.b = gVar;
        }
    }

    public b(boolean z) {
        this.a = z;
    }

    public final d a(JavaType javaType, i iVar, BeanProperty beanProperty) throws JsonMappingException {
        g<Object> A = iVar.A(javaType, beanProperty);
        return new d(A, b(javaType.c, A));
    }

    public abstract b b(Class<?> cls, g<Object> gVar);

    public abstract g<Object> c(Class<?> cls);

    public b(b bVar) {
        this.a = bVar.a;
    }
}
