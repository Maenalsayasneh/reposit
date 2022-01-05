package i0.h.c.t;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final class q0 {
    public static WeakReference<q0> a;
    public final SharedPreferences b;
    public m0 c;
    public final Executor d;

    public q0(SharedPreferences sharedPreferences, Executor executor) {
        this.d = executor;
        this.b = sharedPreferences;
    }

    public synchronized p0 a() {
        String peek;
        p0 p0Var;
        m0 m0Var = this.c;
        synchronized (m0Var.d) {
            peek = m0Var.d.peek();
        }
        Pattern pattern = p0.a;
        p0Var = null;
        if (!TextUtils.isEmpty(peek)) {
            String[] split = peek.split("!", -1);
            if (split.length == 2) {
                p0Var = new p0(split[0], split[1]);
            }
        }
        return p0Var;
    }
}
