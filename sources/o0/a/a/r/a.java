package o0.a.a.r;

import android.util.Log;

/* compiled from: Logger */
public final class a {
    public static a a;
    public final b b;
    public final int c;

    /* renamed from: o0.a.a.r.a$a  reason: collision with other inner class name */
    /* compiled from: Logger */
    public static final class C0283a implements b {
        public static final C0283a a = new C0283a();

        public boolean a(String str, int i) {
            return Log.isLoggable(str, i);
        }

        public void b(int i, String str, String str2) {
            Log.println(i, str, str2);
        }
    }

    /* compiled from: Logger */
    public interface b {
        boolean a(String str, int i);

        void b(int i, String str, String str2);
    }

    public a(b bVar) {
        this.b = bVar;
        int i = 7;
        while (i >= 2 && this.b.a("AppAuth", i)) {
            i--;
        }
        this.c = i + 1;
    }

    public static void a(String str, Object... objArr) {
        c().d(3, (Throwable) null, str, objArr);
    }

    public static void b(String str, Object... objArr) {
        c().d(6, (Throwable) null, str, objArr);
    }

    public static synchronized a c() {
        a aVar;
        synchronized (a.class) {
            if (a == null) {
                a = new a(C0283a.a);
            }
            aVar = a;
        }
        return aVar;
    }

    public static void e(String str, Object... objArr) {
        c().d(5, (Throwable) null, str, objArr);
    }

    public void d(int i, Throwable th, String str, Object... objArr) {
        if (this.c <= i) {
            if (objArr != null && objArr.length >= 1) {
                str = String.format(str, objArr);
            }
            this.b.b(i, "AppAuth", str);
        }
    }
}
