package k0.c;

import io.sentry.ISerializer;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryEnvelopeItem;
import java.util.concurrent.Callable;

/* compiled from: lambda */
public final /* synthetic */ class k implements Callable {
    public final /* synthetic */ ISerializer c;
    public final /* synthetic */ SentryBaseEvent d;

    public /* synthetic */ k(ISerializer iSerializer, SentryBaseEvent sentryBaseEvent) {
        this.c = iSerializer;
        this.d = sentryBaseEvent;
    }

    public final Object call() {
        return SentryEnvelopeItem.lambda$fromEvent$3(this.c, this.d);
    }
}
