package k0.c.w.a;

import io.sentry.ITransaction;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import io.sentry.android.core.ActivityLifecycleIntegration;

/* compiled from: lambda */
public final /* synthetic */ class b implements ScopeCallback {
    public final /* synthetic */ ActivityLifecycleIntegration a;
    public final /* synthetic */ ITransaction b;

    public /* synthetic */ b(ActivityLifecycleIntegration activityLifecycleIntegration, ITransaction iTransaction) {
        this.a = activityLifecycleIntegration;
        this.b = iTransaction;
    }

    public final void run(Scope scope) {
        this.a.applyScope(scope, this.b);
    }
}
