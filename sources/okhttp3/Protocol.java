package okhttp3;

import java.io.IOException;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: Protocol.kt */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final a Companion = null;
    /* access modifiers changed from: private */
    public final String protocol;

    /* compiled from: Protocol.kt */
    public static final class a {
        public a(f fVar) {
        }

        public final Protocol a(String str) throws IOException {
            i.e(str, "protocol");
            Protocol protocol = Protocol.HTTP_1_0;
            if (!i.a(str, protocol.protocol)) {
                protocol = Protocol.HTTP_1_1;
                if (!i.a(str, protocol.protocol)) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!i.a(str, protocol.protocol)) {
                        protocol = Protocol.HTTP_2;
                        if (!i.a(str, protocol.protocol)) {
                            protocol = Protocol.SPDY_3;
                            if (!i.a(str, protocol.protocol)) {
                                protocol = Protocol.QUIC;
                                if (!i.a(str, protocol.protocol)) {
                                    throw new IOException(i0.d.a.a.a.n0("Unexpected protocol: ", str));
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new a((f) null);
    }

    private Protocol(String str) {
        this.protocol = str;
    }

    public static final Protocol get(String str) throws IOException {
        return Companion.a(str);
    }

    public String toString() {
        return this.protocol;
    }
}
