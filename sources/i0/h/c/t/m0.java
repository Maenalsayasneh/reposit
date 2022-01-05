package i0.h.c.t;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final class m0 {
    public final SharedPreferences a;
    public final String b;
    public final String c;
    public final ArrayDeque<String> d = new ArrayDeque<>();
    public final Executor e;

    public m0(SharedPreferences sharedPreferences, String str, Executor executor) {
        this.a = sharedPreferences;
        this.b = "topic_operation_queue";
        this.c = InstabugDbContract.COMMA_SEP;
        this.e = executor;
    }

    public static m0 a(SharedPreferences sharedPreferences, String str, Executor executor) {
        m0 m0Var = new m0(sharedPreferences, "topic_operation_queue", executor);
        synchronized (m0Var.d) {
            m0Var.d.clear();
            String string = m0Var.a.getString(m0Var.b, "");
            if (!TextUtils.isEmpty(string)) {
                if (string.contains(m0Var.c)) {
                    if (r0 == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str2 : string.split(m0Var.c, -1)) {
                        if (!TextUtils.isEmpty(str2)) {
                            m0Var.d.add(str2);
                        }
                    }
                }
            }
        }
        return m0Var;
    }
}
