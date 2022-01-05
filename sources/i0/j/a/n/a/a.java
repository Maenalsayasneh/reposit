package i0.j.a.n.a;

import android.util.Log;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.a.e.b;
import i0.j.a.e.c;

/* compiled from: Logger */
public class a {
    public final b a;

    public a(b bVar) {
        this.a = bVar;
    }

    public void a(String str) {
        if (c(4)) {
            Log.d("Instabug - APM", str);
        }
    }

    public void b(String str, Throwable th) {
        StringBuilder S0 = i0.d.a.a.a.S0(str, ". ");
        S0.append(th.toString());
        d(S0.toString());
        InstabugSDKLogger.p("Instabug - APM", str + ". " + th.toString());
    }

    public boolean c(int i) {
        int c = ((c) this.a).c();
        return c != 0 && i <= c;
    }

    public void d(String str) {
        if (c(1)) {
            Log.e("Instabug - APM", str);
        }
    }

    public void e(String str) {
        if (c(4)) {
            Log.d("Instabug - APM", str);
        }
        InstabugSDKLogger.p("Instabug - APM", str);
    }

    public void f(String str) {
        if (c(1)) {
            Log.e("Instabug - APM", str);
        }
        InstabugSDKLogger.p("Instabug - APM", str);
    }

    public void g(String str) {
        if (c(2)) {
            Log.w("Instabug - APM", str);
        }
        InstabugSDKLogger.p("Instabug - APM", str);
    }

    public void h(String str) {
        if (c(2)) {
            Log.w("Instabug - APM", str);
        }
    }
}
