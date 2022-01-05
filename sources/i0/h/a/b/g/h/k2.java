package i0.h.a.b.g.h;

import i0.h.a.b.g.h.z;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class k2 extends z<k2, a> implements z0 {
    /* access modifiers changed from: private */
    public static final k2 zzg;
    private static volatile g1<k2> zzh;
    private int zzc;
    private String zzd = "";
    private m2 zze;
    private String zzf = "";

    /* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
    public static final class a extends z.b<k2, a> implements z0 {
        public a(j2 j2Var) {
            super(k2.zzg);
        }
    }

    static {
        k2 k2Var = new k2();
        zzg = k2Var;
        z.h(k2.class, k2Var);
    }

    public static k2 i() {
        return zzg;
    }

    public final Object f(int i, Object obj, Object obj2) {
        switch (j2.a[i - 1]) {
            case 1:
                return new k2();
            case 2:
                return new a((j2) null);
            case 3:
                return new h1(zzg, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\t\u0005Ȉ", new Object[]{"zzc", "zzd", "zze", "zzf"});
            case 4:
                return zzg;
            case 5:
                g1<k2> g1Var = zzh;
                if (g1Var == null) {
                    synchronized (k2.class) {
                        g1Var = zzh;
                        if (g1Var == null) {
                            g1Var = new z.a<>(zzg);
                            zzh = g1Var;
                        }
                    }
                }
                return g1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
