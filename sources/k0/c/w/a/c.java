package k0.c.w.a;

import io.sentry.ITransaction;
import io.sentry.Scope;
import io.sentry.android.core.ActivityLifecycleIntegration;

/* compiled from: lambda */
public final /* synthetic */ class c implements Scope.IWithTransaction {
    public final /* synthetic */ ActivityLifecycleIntegration a;
    public final /* synthetic */ Scope b;
    public final /* synthetic */ ITransaction c;

    public /* synthetic */ c(ActivityLifecycleIntegration activityLifecycleIntegration, Scope scope, ITransaction iTransaction) {
        this.a = activityLifecycleIntegration;
        this.b = scope;
        this.c = iTransaction;
    }

    public final void accept(ITransaction iTransaction) {
        this.a.a(this.b, this.c, iTransaction);
    }
}
