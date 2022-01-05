package k0.c;

import io.sentry.ITransaction;
import io.sentry.Scope;

/* compiled from: lambda */
public final /* synthetic */ class d implements Scope.IWithTransaction {
    public final /* synthetic */ ITransaction a;
    public final /* synthetic */ Scope b;

    public /* synthetic */ d(ITransaction iTransaction, Scope scope) {
        this.a = iTransaction;
        this.b = scope;
    }

    public final void accept(ITransaction iTransaction) {
        ITransaction iTransaction2 = this.a;
        Scope scope = this.b;
        if (iTransaction == iTransaction2) {
            scope.clearTransaction();
        }
    }
}
