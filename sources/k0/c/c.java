package k0.c;

import io.sentry.HostnameCache;
import java.net.InetAddress;
import java.util.concurrent.Callable;

/* compiled from: lambda */
public final /* synthetic */ class c implements Callable {
    public static final /* synthetic */ c c = new c();

    public final Object call() {
        int i = HostnameCache.a;
        return InetAddress.getLocalHost();
    }
}
