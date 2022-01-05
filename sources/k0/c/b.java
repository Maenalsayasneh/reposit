package k0.c;

import io.sentry.HostnameCache;
import java.util.concurrent.Callable;

/* compiled from: lambda */
public final /* synthetic */ class b implements Callable {
    public final /* synthetic */ HostnameCache c;

    public /* synthetic */ b(HostnameCache hostnameCache) {
        this.c = hostnameCache;
    }

    public final Object call() {
        this.c.a();
        return null;
    }
}
