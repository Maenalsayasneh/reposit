package k0.c;

import io.sentry.SentryEnvelopeItem;
import java.util.concurrent.Callable;

/* compiled from: lambda */
public final /* synthetic */ class s implements Callable {
    public final /* synthetic */ SentryEnvelopeItem.CachedItem c;

    public /* synthetic */ s(SentryEnvelopeItem.CachedItem cachedItem) {
        this.c = cachedItem;
    }

    public final Object call() {
        SentryEnvelopeItem.CachedItem cachedItem = this.c;
        int i = SentryEnvelopeItem.a;
        return Integer.valueOf(cachedItem.getBytes().length);
    }
}
