package r0;

import i0.d.a.a.a;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import m0.n.b.i;

/* compiled from: JvmOkio.kt */
public final class x extends b {
    public final Socket l;

    public x(Socket socket) {
        i.e(socket, "socket");
        this.l = socket;
    }

    public IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public void k() {
        try {
            this.l.close();
        } catch (Exception e) {
            Logger logger = p.a;
            Level level = Level.WARNING;
            StringBuilder P0 = a.P0("Failed to close timed out socket ");
            P0.append(this.l);
            logger.log(level, P0.toString(), e);
        } catch (AssertionError e2) {
            if (m0.r.t.a.r.m.a1.a.s2(e2)) {
                Logger logger2 = p.a;
                Level level2 = Level.WARNING;
                StringBuilder P02 = a.P0("Failed to close timed out socket ");
                P02.append(this.l);
                logger2.log(level2, P02.toString(), e2);
                return;
            }
            throw e2;
        }
    }
}
