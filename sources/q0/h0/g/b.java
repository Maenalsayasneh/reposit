package q0.h0.g;

import i0.d.a.a.a;
import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import m0.n.b.i;
import q0.m;

/* compiled from: ConnectionSpecSelector.kt */
public final class b {
    public int a;
    public boolean b;
    public boolean c;
    public final List<m> d;

    public b(List<m> list) {
        i.e(list, "connectionSpecs");
        this.d = list;
    }

    public final m a(SSLSocket sSLSocket) throws IOException {
        boolean z;
        m mVar;
        i.e(sSLSocket, "sslSocket");
        int i = this.a;
        int size = this.d.size();
        while (true) {
            z = true;
            if (i >= size) {
                mVar = null;
                break;
            }
            mVar = this.d.get(i);
            if (mVar.c(sSLSocket)) {
                this.a = i + 1;
                break;
            }
            i++;
        }
        if (mVar != null) {
            int i2 = this.a;
            int size2 = this.d.size();
            while (true) {
                if (i2 >= size2) {
                    z = false;
                    break;
                } else if (this.d.get(i2).c(sSLSocket)) {
                    break;
                } else {
                    i2++;
                }
            }
            this.b = z;
            mVar.a(sSLSocket, this.c);
            return mVar;
        }
        StringBuilder P0 = a.P0("Unable to find acceptable protocols. isFallback=");
        P0.append(this.c);
        P0.append(',');
        P0.append(" modes=");
        P0.append(this.d);
        P0.append(',');
        P0.append(" supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        i.c(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        i.d(arrays, "java.util.Arrays.toString(this)");
        P0.append(arrays);
        throw new UnknownServiceException(P0.toString());
    }
}
