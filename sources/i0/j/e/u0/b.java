package i0.j.e.u0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.core.eventbus.SessionStateEventBus;
import com.instabug.library.n.b.a.e;
import com.instabug.library.util.DeviceStateProvider;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.z;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import k0.b.l;
import k0.b.y.d;

/* compiled from: SessionProfiler */
public class b {
    public static b a;
    public e b = new e();
    public k0.b.w.a c;

    /* compiled from: SessionProfiler */
    public class a implements d<Long> {
        public a() {
        }

        public void b(Object obj) throws Exception {
            b bVar = b.this;
            long longValue = ((Long) obj).longValue();
            Objects.requireNonNull(bVar);
            Context applicationContext = Instabug.getApplicationContext();
            if (longValue % 2000 == 0) {
                if (applicationContext != null) {
                    int batteryLevel = DeviceStateProvider.getBatteryLevel(applicationContext);
                    String batteryState = DeviceStateProvider.getBatteryState(applicationContext);
                    bVar.b.c.add(new com.instabug.library.n.b.a.a((float) batteryLevel, !"Unplugged".equals(batteryState)));
                } else {
                    InstabugSDKLogger.w("SessionProfiler", "could attach battery state (Null app context)");
                }
                if (applicationContext != null) {
                    String screenOrientation = DeviceStateProvider.getScreenOrientation(applicationContext);
                    e eVar = bVar.b;
                    eVar.q.add(new com.instabug.library.n.b.a.d(screenOrientation));
                } else {
                    InstabugSDKLogger.w("SessionProfiler", "could attach screen orientation (Null app context)");
                }
                if (applicationContext != null) {
                    e eVar2 = bVar.b;
                    com.instabug.library.n.b.a.b bVar2 = new com.instabug.library.n.b.a.b();
                    ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
                    if (connectivityManager == null) {
                        bVar2.d = "no_connection";
                    } else if (Build.VERSION.SDK_INT >= 29) {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                        if (networkCapabilities == null) {
                            bVar2.d = "no_connection";
                        } else if (networkCapabilities.hasTransport(0)) {
                            bVar2.d = "Cellular";
                        } else if (networkCapabilities.hasTransport(1)) {
                            bVar2.d = "WiFi";
                        } else {
                            bVar2.d = "no_connection";
                        }
                    } else {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null) {
                            bVar2.d = "no_connection";
                        } else if (activeNetworkInfo.getType() == 1) {
                            bVar2.d = "WiFi";
                            bVar2.q = DeviceStateProvider.getWifiSSID(applicationContext);
                        } else if (activeNetworkInfo.getType() == 0) {
                            bVar2.q = DeviceStateProvider.getCarrier(applicationContext);
                            bVar2.d = activeNetworkInfo.getSubtypeName();
                        }
                    }
                    eVar2.d.add(bVar2);
                } else {
                    InstabugSDKLogger.w("SessionProfiler", "could attach network state (Null app context)");
                }
            }
            if (applicationContext != null) {
                e eVar3 = bVar.b;
                eVar3.x.add(new com.instabug.library.n.b.a.c(DeviceStateProvider.getUsedMemory(applicationContext), DeviceStateProvider.getTotalMemory(applicationContext)));
            } else {
                InstabugSDKLogger.w("SessionProfiler", "could attach used memory (Null app context)");
            }
            e eVar4 = bVar.b;
            eVar4.y.add(new com.instabug.library.n.b.a.c(DeviceStateProvider.getUsedStorage()));
            bVar.b.d();
        }
    }

    /* renamed from: i0.j.e.u0.b$b  reason: collision with other inner class name */
    /* compiled from: SessionProfiler */
    public class C0186b implements d<Throwable> {
        public void b(Object obj) throws Exception {
            Throwable th = (Throwable) obj;
            InstabugSDKLogger.e("SessionProfiler", th.getClass().getSimpleName(), th);
        }
    }

    /* compiled from: SessionProfiler */
    public class c implements k0.b.y.e<Long, Long> {
        public Object apply(Object obj) throws Exception {
            return Long.valueOf((((Long) obj).longValue() + 1) * 500);
        }
    }

    public b() {
        SessionStateEventBus.getInstance().subscribe(new a(this));
    }

    public static b c() {
        if (a == null) {
            a = new b();
        }
        return a;
    }

    public void a() {
        if (z.j().h(Feature.SESSION_PROFILER) == Feature.State.ENABLED) {
            b();
            this.c = l.n(500, TimeUnit.MILLISECONDS).p(new c()).t(new a(), new C0186b(), k0.b.z.b.a.c, k0.b.z.b.a.d);
        }
    }

    public void b() {
        k0.b.w.a aVar = this.c;
        if (aVar != null) {
            aVar.dispose();
        }
    }
}
