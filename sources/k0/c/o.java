package k0.c;

import io.sentry.SentryEnvelopeItem;
import java.util.concurrent.Callable;

/* compiled from: lambda */
public final /* synthetic */ class o implements Callable {
    public final /* synthetic */ SentryEnvelopeItem.CachedItem c;

    public /* synthetic */ o(SentryEnvelopeItem.CachedItem cachedItem) {
        this.c = cachedItem;
    }

    public final Object call() {
        SentryEnvelopeItem.CachedItem cachedItem = this.c;
        int i = SentryEnvelopeItem.a;
        return cachedItem.getBytes();
    }
}
