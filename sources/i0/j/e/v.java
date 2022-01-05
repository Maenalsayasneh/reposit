package i0.j.e;

import android.content.Context;
import com.instabug.library.internal.storage.cache.AssetsCacheManager;
import com.instabug.library.util.InstabugSDKLogger;
import java.lang.ref.WeakReference;

/* compiled from: InstabugDelegate */
public class v implements Runnable {
    public final /* synthetic */ i c;

    public v(i iVar) {
        this.c = iVar;
    }

    public void run() {
        Context context;
        InstabugSDKLogger.d("InstabugDelegate", "Dumping caches");
        WeakReference<Context> weakReference = this.c.y;
        if (weakReference != null && (context = (Context) weakReference.get()) != null) {
            AssetsCacheManager.cleanUpCache(context);
        }
    }
}
