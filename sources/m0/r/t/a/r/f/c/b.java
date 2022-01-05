package m0.r.t.a.r.f.c;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;

/* compiled from: Flags */
public class b {
    public static final C0265b A;
    public static final C0265b B;
    public static final C0265b C;
    public static final C0265b D;
    public static final C0265b E;
    public static final C0265b F;
    public static final C0265b G;
    public static final C0265b H;
    public static final C0265b I;
    public static final C0265b J;
    public static final C0265b K;
    public static final C0265b L;
    public static final C0265b M = d.c();
    public static final C0265b a = d.c();
    public static final C0265b b;
    public static final d<ProtoBuf$Visibility> c;
    public static final d<ProtoBuf$Modality> d;
    public static final d<ProtoBuf$Class.Kind> e;
    public static final C0265b f;
    public static final C0265b g;
    public static final C0265b h;
    public static final C0265b i;
    public static final C0265b j;
    public static final C0265b k;
    public static final C0265b l;
    public static final C0265b m;
    public static final d<ProtoBuf$MemberKind> n;
    public static final C0265b o;
    public static final C0265b p;
    public static final C0265b q;
    public static final C0265b r;
    public static final C0265b s;
    public static final C0265b t;
    public static final C0265b u;
    public static final C0265b v;
    public static final C0265b w;
    public static final C0265b x;
    public static final C0265b y;
    public static final C0265b z;

    /* renamed from: m0.r.t.a.r.f.c.b$b  reason: collision with other inner class name */
    /* compiled from: Flags */
    public static class C0265b extends d<Boolean> {
        public C0265b(int i) {
            super(i, 1, (a) null);
        }

        /* renamed from: f */
        public Boolean d(int i) {
            Boolean valueOf = Boolean.valueOf((i & (1 << this.a)) != 0);
            if (valueOf != null) {
                return valueOf;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"}));
        }

        /* renamed from: g */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.a;
            }
            return 0;
        }
    }

    /* compiled from: Flags */
    public static class c<E extends Internal.a> extends d<E> {
        public final E[] c;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(int r5, E[] r6) {
            /*
                r4 = this;
                r0 = 1
                if (r6 == 0) goto L_0x0033
                int r1 = r6.length
                int r1 = r1 - r0
                if (r1 != 0) goto L_0x0008
                goto L_0x0012
            L_0x0008:
                r2 = 31
            L_0x000a:
                if (r2 < 0) goto L_0x001c
                int r3 = r0 << r2
                r3 = r3 & r1
                if (r3 == 0) goto L_0x0019
                int r0 = r0 + r2
            L_0x0012:
                r1 = 0
                r4.<init>(r5, r0, r1)
                r4.c = r6
                return
            L_0x0019:
                int r2 = r2 + -1
                goto L_0x000a
            L_0x001c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "Empty enum: "
                java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
                java.lang.Class r6 = r6.getClass()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r5.<init>(r6)
                throw r5
            L_0x0033:
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = 0
                java.lang.String r1 = "enumEntries"
                r5[r6] = r1
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField"
                r5[r0] = r6
                r6 = 2
                java.lang.String r0 = "bitWidth"
                r5[r6] = r0
                java.lang.String r6 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r5 = java.lang.String.format(r6, r5)
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.f.c.b.c.<init>(int, kotlin.reflect.jvm.internal.impl.protobuf.Internal$a[]):void");
        }

        public Object d(int i) {
            int i2 = this.a;
            int i3 = (i & (((1 << this.b) - 1) << i2)) >> i2;
            for (E e : this.c) {
                if (e.getNumber() == i3) {
                    return e;
                }
            }
            return null;
        }

        public int e(Object obj) {
            return ((Internal.a) obj).getNumber() << this.a;
        }
    }

    /* compiled from: Flags */
    public static abstract class d<E> {
        public final int a;
        public final int b;

        public d(int i, int i2, a aVar) {
            this.a = i;
            this.b = i2;
        }

        public static <E extends Internal.a> d<E> a(d<?> dVar, E[] eArr) {
            return new c(dVar.a + dVar.b, eArr);
        }

        public static C0265b b(d<?> dVar) {
            return new C0265b(dVar.a + dVar.b);
        }

        public static C0265b c() {
            return new C0265b(0);
        }

        public abstract E d(int i);

        public abstract int e(E e);
    }

    static {
        C0265b c2 = d.c();
        b = c2;
        d<ProtoBuf$Visibility> a2 = d.a(c2, ProtoBuf$Visibility.values());
        c = a2;
        d<ProtoBuf$Modality> a3 = d.a(a2, ProtoBuf$Modality.values());
        d = a3;
        d<ProtoBuf$Class.Kind> a4 = d.a(a3, ProtoBuf$Class.Kind.values());
        e = a4;
        C0265b b2 = d.b(a4);
        f = b2;
        C0265b b3 = d.b(b2);
        g = b3;
        C0265b b4 = d.b(b3);
        h = b4;
        C0265b b5 = d.b(b4);
        i = b5;
        C0265b b6 = d.b(b5);
        j = b6;
        k = d.b(b6);
        C0265b b7 = d.b(a2);
        l = b7;
        m = d.b(b7);
        d<ProtoBuf$MemberKind> a5 = d.a(a3, ProtoBuf$MemberKind.values());
        n = a5;
        C0265b b8 = d.b(a5);
        o = b8;
        C0265b b9 = d.b(b8);
        p = b9;
        C0265b b10 = d.b(b9);
        q = b10;
        C0265b b11 = d.b(b10);
        r = b11;
        C0265b b12 = d.b(b11);
        s = b12;
        C0265b b13 = d.b(b12);
        t = b13;
        C0265b b14 = d.b(b13);
        u = b14;
        v = d.b(b14);
        C0265b b15 = d.b(a5);
        w = b15;
        C0265b b16 = d.b(b15);
        x = b16;
        C0265b b17 = d.b(b16);
        y = b17;
        C0265b b18 = d.b(b17);
        z = b18;
        C0265b b19 = d.b(b18);
        A = b19;
        C0265b b20 = d.b(b19);
        B = b20;
        C0265b b21 = d.b(b20);
        C = b21;
        C0265b b22 = d.b(b21);
        D = b22;
        E = d.b(b22);
        C0265b b23 = d.b(c2);
        F = b23;
        C0265b b24 = d.b(b23);
        G = b24;
        H = d.b(b24);
        C0265b b25 = d.b(a3);
        I = b25;
        C0265b b26 = d.b(b25);
        J = b26;
        K = d.b(b26);
        C0265b c3 = d.c();
        L = c3;
        d.b(c3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L_0x002b
            if (r5 == r3) goto L_0x0026
            r4 = 5
            if (r5 == r4) goto L_0x002b
            r4 = 6
            if (r5 == r4) goto L_0x0021
            r4 = 8
            if (r5 == r4) goto L_0x002b
            r4 = 9
            if (r5 == r4) goto L_0x0021
            r4 = 11
            if (r5 == r4) goto L_0x002b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L_0x002f
        L_0x0021:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L_0x002f
        L_0x0026:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L_0x002f
        L_0x002b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L_0x002f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L_0x004a;
                case 4: goto L_0x0045;
                case 5: goto L_0x0045;
                case 6: goto L_0x0045;
                case 7: goto L_0x0040;
                case 8: goto L_0x0040;
                case 9: goto L_0x0040;
                case 10: goto L_0x003b;
                case 11: goto L_0x003b;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x003b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0040:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0045:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x004a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L_0x004e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.f.c.b.a(int):void");
    }
}
