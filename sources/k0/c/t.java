package k0.c;

import io.sentry.ISerializer;
import io.sentry.SentryEnvelopeItem;
import io.sentry.Session;
import java.util.concurrent.Callable;

/* compiled from: lambda */
public final /* synthetic */ class t implements Callable {
    public final /* synthetic */ ISerializer c;
    public final /* synthetic */ Session d;

    public /* synthetic */ t(ISerializer iSerializer, Session session) {
        this.c = iSerializer;
        this.d = session;
    }

    public final Object call() {
        return SentryEnvelopeItem.lambda$fromSession$0(this.c, this.d);
    }
}
