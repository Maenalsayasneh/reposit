package k0.c;

import io.sentry.DirectoryProcessor;
import io.sentry.ILogger;
import io.sentry.SendCachedEnvelopeFireAndForgetIntegration;
import io.sentry.SentryLevel;
import java.io.File;

/* compiled from: lambda */
public final /* synthetic */ class f implements SendCachedEnvelopeFireAndForgetIntegration.SendFireAndForget {
    public final /* synthetic */ ILogger a;
    public final /* synthetic */ String b;
    public final /* synthetic */ DirectoryProcessor c;
    public final /* synthetic */ File d;

    public /* synthetic */ f(ILogger iLogger, String str, DirectoryProcessor directoryProcessor, File file) {
        this.a = iLogger;
        this.b = str;
        this.c = directoryProcessor;
        this.d = file;
    }

    public final void send() {
        ILogger iLogger = this.a;
        String str = this.b;
        DirectoryProcessor directoryProcessor = this.c;
        File file = this.d;
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        iLogger.log(sentryLevel, "Started processing cached files from %s", str);
        directoryProcessor.processDirectory(file);
        iLogger.log(sentryLevel, "Finished processing cached files from %s", str);
    }
}
