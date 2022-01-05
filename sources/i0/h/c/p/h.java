package i0.h.c.p;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import i0.h.a.b.m.e;
import i0.h.c.p.t;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public final /* synthetic */ class h implements e {
    public final FirebaseInstanceId a;
    public final t.a b;

    public h(FirebaseInstanceId firebaseInstanceId, t.a aVar) {
        this.a = firebaseInstanceId;
        this.b = aVar;
    }

    public void onSuccess(Object obj) {
        FirebaseInstanceId firebaseInstanceId = this.a;
        t.a aVar = this.b;
        Objects.requireNonNull(firebaseInstanceId);
        String token = ((k) obj).getToken();
        if (aVar == null || !token.equals(aVar.c)) {
            for (FirebaseInstanceIdInternal.a a2 : firebaseInstanceId.l) {
                a2.a(token);
            }
        }
    }
}
