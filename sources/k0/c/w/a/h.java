package k0.c.w.a;

import io.sentry.android.core.DefaultAndroidEventProcessor;
import java.util.concurrent.Callable;

/* compiled from: lambda */
public final /* synthetic */ class h implements Callable {
    public final /* synthetic */ DefaultAndroidEventProcessor c;

    public /* synthetic */ h(DefaultAndroidEventProcessor defaultAndroidEventProcessor) {
        this.c = defaultAndroidEventProcessor;
    }

    public final Object call() {
        return this.c.a();
    }
}
