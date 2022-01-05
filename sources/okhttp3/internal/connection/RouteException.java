package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eR$\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00038\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/connection/RouteException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Ljava/io/IOException;", "<set-?>", "c", "Ljava/io/IOException;", "getLastConnectException", "()Ljava/io/IOException;", "lastConnectException", "d", "getFirstConnectException", "firstConnectException", "<init>", "(Ljava/io/IOException;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* compiled from: RouteException.kt */
public final class RouteException extends RuntimeException {
    public IOException c;
    public final IOException d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RouteException(IOException iOException) {
        super(iOException);
        i.e(iOException, "firstConnectException");
        this.d = iOException;
        this.c = iOException;
    }
}
