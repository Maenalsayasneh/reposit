package k0.c;

import io.sentry.Scope;
import io.sentry.SentryClient;
import io.sentry.SentryEvent;
import io.sentry.Session;

/* compiled from: lambda */
public final /* synthetic */ class i implements Scope.IWithSession {
    public final /* synthetic */ SentryClient a;
    public final /* synthetic */ SentryEvent b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(SentryClient sentryClient, SentryEvent sentryEvent, Object obj) {
        this.a = sentryClient;
        this.b = sentryEvent;
        this.c = obj;
    }

    public final void accept(Session session) {
        this.a.a(this.b, this.c, session);
    }
}
