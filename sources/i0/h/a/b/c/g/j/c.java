package i0.h.a.b.c.g.j;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final c c = new c();
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean q = new AtomicBoolean();
    public final ArrayList<a> x = new ArrayList<>();
    public boolean y = false;

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public interface a {
        void a(boolean z);
    }

    public static void a(@RecentlyNonNull Application application) {
        c cVar = c;
        synchronized (cVar) {
            if (!cVar.y) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.y = true;
            }
        }
    }

    public final void b(boolean z) {
        synchronized (c) {
            ArrayList<a> arrayList = this.x;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                a aVar = arrayList.get(i);
                i++;
                aVar.a(z);
            }
        }
    }

    public final void onActivityCreated(@RecentlyNonNull Activity activity, Bundle bundle) {
        boolean compareAndSet = this.d.compareAndSet(true, false);
        this.q.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    public final void onActivityDestroyed(@RecentlyNonNull Activity activity) {
    }

    public final void onActivityPaused(@RecentlyNonNull Activity activity) {
    }

    public final void onActivityResumed(@RecentlyNonNull Activity activity) {
        boolean compareAndSet = this.d.compareAndSet(true, false);
        this.q.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    public final void onActivitySaveInstanceState(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle) {
    }

    public final void onActivityStarted(@RecentlyNonNull Activity activity) {
    }

    public final void onActivityStopped(@RecentlyNonNull Activity activity) {
    }

    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.d.compareAndSet(false, true)) {
            this.q.set(true);
            b(true);
        }
    }
}
