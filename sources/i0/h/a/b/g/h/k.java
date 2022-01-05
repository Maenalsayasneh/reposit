package i0.h.a.b.g.h;

import i0.h.a.b.g.h.z;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class k extends z<k, a> implements z0 {
    /* access modifiers changed from: private */
    public static final k zze;
    private static volatile g1<k> zzf;
    private int zzc;
    private String zzd = "";

    /* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
    public static final class a extends z.b<k, a> implements z0 {
        public a(j jVar) {
            super(k.zze);
        }
    }

    static {
        k kVar = new k();
        zze = kVar;
        z.h(k.class, kVar);
    }

    public final Object f(int i, Object obj, Object obj2) {
        switch (j.a[i - 1]) {
            case 1:
                return new k();
            case 2:
                return new a((j) null);
            case 3:
                return new h1(zze, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဈ\u0000", new Object[]{"zzc", "zzd"});
            case 4:
                return zze;
            case 5:
                g1<k> g1Var = zzf;
                if (g1Var == null) {
                    synchronized (k.class) {
                        g1Var = zzf;
                        if (g1Var == null) {
                            g1Var = new z.a<>(zze);
                            zzf = g1Var;
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
