package k0.c;

import io.sentry.Attachment;
import io.sentry.SentryEnvelopeItem;
import java.util.concurrent.Callable;

/* compiled from: lambda */
public final /* synthetic */ class l implements Callable {
    public final /* synthetic */ Attachment c;
    public final /* synthetic */ long d;

    public /* synthetic */ l(Attachment attachment, long j) {
        this.c = attachment;
        this.d = j;
    }

    public final Object call() {
        return SentryEnvelopeItem.lambda$fromAttachment$9(this.c, this.d);
    }
}
