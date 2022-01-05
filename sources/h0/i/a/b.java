package h0.i.a;

import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: ActivityRecreator */
public class b implements Runnable {
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public b(Object obj, Object obj2) {
        this.c = obj;
        this.d = obj2;
    }

    public void run() {
        try {
            Method method = a.d;
            if (method != null) {
                method.invoke(this.c, new Object[]{this.d, Boolean.FALSE, "AppCompat recreation"});
                return;
            }
            a.e.invoke(this.c, new Object[]{this.d, Boolean.FALSE});
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
