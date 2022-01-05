package i0.h.c.p;

import android.content.SharedPreferences;
import com.google.firebase.iid.FirebaseInstanceId;
import i0.h.a.b.c.m.b;
import i0.h.a.b.m.g;
import i0.h.c.p.t;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public final /* synthetic */ class f implements i0.h.a.b.m.f {
    public final FirebaseInstanceId a;
    public final String b;
    public final String c;
    public final String d;

    public f(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3) {
        this.a = firebaseInstanceId;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public g a(Object obj) {
        FirebaseInstanceId firebaseInstanceId = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = (String) obj;
        t tVar = FirebaseInstanceId.b;
        String h = firebaseInstanceId.h();
        String a2 = firebaseInstanceId.g.a();
        synchronized (tVar) {
            String a3 = t.a.a(str4, a2, System.currentTimeMillis());
            if (a3 != null) {
                SharedPreferences.Editor edit = tVar.a.edit();
                edit.putString(tVar.b(h, str, str2), a3);
                edit.commit();
            }
        }
        return b.H(new l(str3, str4));
    }
}
