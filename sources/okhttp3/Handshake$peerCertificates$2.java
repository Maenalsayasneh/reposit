package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: Handshake.kt */
public final class Handshake$peerCertificates$2 extends Lambda implements a<List<? extends Certificate>> {
    public final /* synthetic */ a c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Handshake$peerCertificates$2(a aVar) {
        super(0);
        this.c = aVar;
    }

    public Object invoke() {
        try {
            return (List) this.c.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return EmptyList.c;
        }
    }
}
