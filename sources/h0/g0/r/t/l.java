package h0.g0.r.t;

import android.content.Context;
import android.os.PowerManager;
import h0.g0.i;
import i0.d.a.a.a;
import java.util.WeakHashMap;

/* compiled from: WakeLocks */
public class l {
    public static final String a = i.e("WakeLocks");
    public static final WeakHashMap<PowerManager.WakeLock, String> b = new WeakHashMap<>();

    public static PowerManager.WakeLock a(Context context, String str) {
        String n02 = a.n0("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, n02);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, n02);
        }
        return newWakeLock;
    }
}
