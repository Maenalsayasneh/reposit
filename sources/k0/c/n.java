package k0.c;

import io.sentry.ISerializer;
import io.sentry.SentryEnvelopeItem;
import io.sentry.UserFeedback;
import java.util.concurrent.Callable;

/* compiled from: lambda */
public final /* synthetic */ class n implements Callable {
    public final /* synthetic */ ISerializer c;
    public final /* synthetic */ UserFeedback d;

    public /* synthetic */ n(ISerializer iSerializer, UserFeedback userFeedback) {
        this.c = iSerializer;
        this.d = userFeedback;
    }

    public final Object call() {
        return SentryEnvelopeItem.lambda$fromUserFeedback$6(this.c, this.d);
    }
}
