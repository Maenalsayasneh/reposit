package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;
import okhttp3.Handshake;
import q0.h;
import q0.h0.n.c;

/* compiled from: RealConnection.kt */
public final class RealConnection$connectTls$1 extends Lambda implements a<List<? extends Certificate>> {
    public final /* synthetic */ h c;
    public final /* synthetic */ Handshake d;
    public final /* synthetic */ q0.a q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$1(h hVar, Handshake handshake, q0.a aVar) {
        super(0);
        this.c = hVar;
        this.d = handshake;
        this.q = aVar;
    }

    public Object invoke() {
        c cVar = this.c.d;
        i.c(cVar);
        return cVar.a(this.d.c(), this.q.a.g);
    }
}
