package i0.j.d.e;

/* compiled from: FeaturesRequestSettings */
public class a {
    public static a a;

    public static void a(int i) {
        if (c.a() != null) {
            c a2 = c.a();
            a2.c.putInt("last_sort_by_action", i);
            a2.c.apply();
        }
    }

    public static a d() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    public static boolean e() {
        if (c.a() == null || c.a().b.getInt("last_sort_by_action", 0) == 0) {
            return true;
        }
        return false;
    }

    public void b(long j) {
        if (c.a() != null) {
            c a2 = c.a();
            a2.c.putLong("last_activity", j);
            a2.c.apply();
        }
    }

    public boolean c() {
        return b.a().b;
    }
}
