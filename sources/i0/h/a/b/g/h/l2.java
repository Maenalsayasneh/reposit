package i0.h.a.b.g.h;

import i0.h.a.b.g.h.z;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class l2 extends z<l2, a> implements z0 {
    /* access modifiers changed from: private */
    public static final l2 zzh;
    private static volatile g1<l2> zzi;
    private int zzc;
    private String zzd = "";
    private m2 zze;
    private String zzf = "";
    private String zzg = "";

    /* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
    public static final class a extends z.b<l2, a> implements z0 {
        public a(j2 j2Var) {
            super(l2.zzh);
        }
    }

    static {
        l2 l2Var = new l2();
        zzh = l2Var;
        z.h(l2.class, l2Var);
    }

    public static l2 i() {
        return zzh;
    }

    public final Object f(int i, Object obj, Object obj2) {
        switch (j2.a[i - 1]) {
            case 1:
                return new l2();
            case 2:
                return new a((j2) null);
            case 3:
                return new h1(zzh, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\t", new Object[]{"zzc", "zzd", "zzf", "zzg", "zze"});
            case 4:
                return zzh;
            case 5:
                g1<l2> g1Var = zzi;
                if (g1Var == null) {
                    synchronized (l2.class) {
                        g1Var = zzi;
                        if (g1Var == null) {
                            g1Var = new z.a<>(zzh);
                            zzi = g1Var;
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
