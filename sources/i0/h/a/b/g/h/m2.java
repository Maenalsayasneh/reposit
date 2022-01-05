package i0.h.a.b.g.h;

import i0.h.a.b.g.h.z;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class m2 extends z<m2, a> implements z0 {
    /* access modifiers changed from: private */
    public static final m2 zzi;
    private static volatile g1<m2> zzj;
    private String zzc = "";
    private int zzd;
    private String zze = "";
    private long zzf;
    private k zzg;
    private int zzh;

    /* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
    public static final class a extends z.b<m2, a> implements z0 {
        public a(j2 j2Var) {
            super(m2.zzi);
        }
    }

    static {
        m2 m2Var = new m2();
        zzi = m2Var;
        z.h(m2.class, m2Var);
    }

    public final Object f(int i, Object obj, Object obj2) {
        switch (j2.a[i - 1]) {
            case 1:
                return new m2();
            case 2:
                return new a((j2) null);
            case 3:
                return new h1(zzi, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0002\u0005\t\u0007\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                g1<m2> g1Var = zzj;
                if (g1Var == null) {
                    synchronized (m2.class) {
                        g1Var = zzj;
                        if (g1Var == null) {
                            g1Var = new z.a<>(zzi);
                            zzj = g1Var;
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
