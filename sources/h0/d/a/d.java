package h0.d.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import g0.a.a.b;

/* compiled from: CustomTabsServiceConnection */
public abstract class d implements ServiceConnection {
    private Context mApplicationContext;

    /* compiled from: CustomTabsServiceConnection */
    public class a extends c {
        public a(d dVar, b bVar, ComponentName componentName, Context context) {
            super(bVar, componentName, context);
        }
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, c cVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b bVar;
        if (this.mApplicationContext != null) {
            int i = b.a.a;
            if (iBinder == null) {
                bVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                    bVar = new b.a.C0008a(iBinder);
                } else {
                    bVar = (b) queryLocalInterface;
                }
            }
            onCustomTabsServiceConnected(componentName, new a(this, bVar, componentName, this.mApplicationContext));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
