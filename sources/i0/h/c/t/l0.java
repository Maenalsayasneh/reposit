package i0.h.c.t;

import android.content.SharedPreferences;
import java.util.Iterator;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final /* synthetic */ class l0 implements Runnable {
    public final m0 c;

    public l0(m0 m0Var) {
        this.c = m0Var;
    }

    public void run() {
        m0 m0Var = this.c;
        synchronized (m0Var.d) {
            SharedPreferences.Editor edit = m0Var.a.edit();
            String str = m0Var.b;
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = m0Var.d.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(m0Var.c);
            }
            edit.putString(str, sb.toString()).commit();
        }
    }
}
