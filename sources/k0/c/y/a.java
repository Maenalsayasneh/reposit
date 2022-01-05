package k0.c.y;

import io.sentry.ILogger;
import io.sentry.cache.IEnvelopeCache;
import io.sentry.transport.AsyncHttpTransport;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: lambda */
public final /* synthetic */ class a implements RejectedExecutionHandler {
    public final /* synthetic */ IEnvelopeCache a;
    public final /* synthetic */ ILogger b;

    public /* synthetic */ a(IEnvelopeCache iEnvelopeCache, ILogger iLogger) {
        this.a = iEnvelopeCache;
        this.b = iLogger;
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        AsyncHttpTransport.lambda$initExecutor$0(this.a, this.b, runnable, threadPoolExecutor);
    }
}
