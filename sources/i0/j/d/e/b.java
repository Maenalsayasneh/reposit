package i0.j.d.e;

/* compiled from: PerSessionSettings */
public class b {
    public static b a;
    public boolean b = true;
    public boolean c = true;

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            bVar = a;
            if (bVar == null) {
                bVar = new b();
                a = bVar;
            }
        }
        return bVar;
    }
}
