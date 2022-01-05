package i0.j.e.p0;

import android.app.Activity;
import android.graphics.Bitmap;
import com.instabug.library.instacapture.screenshot.ScreenshotTaker;
import com.instabug.library.l.c.c;
import com.instabug.library.screenshot.ScreenshotProvider;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.d1.h.b;
import i0.j.e.k0.a.a;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k0.b.l;

/* compiled from: InstaCapture */
public final class d {
    public static d a;
    public a b;
    public a c = a();
    public final Map<i0.j.e.p0.e.a, l<Bitmap>> d = new HashMap();
    public final Map<i0.j.e.p0.e.a, k0.b.w.a> e = new HashMap();

    public d(Activity activity) {
        new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(10));
        a aVar = new a();
        this.b = aVar;
        aVar.a = new WeakReference<>(activity);
    }

    public static d b(Activity activity) {
        d dVar;
        synchronized (d.class) {
            d dVar2 = a;
            if (dVar2 == null) {
                a = new d(activity);
            } else {
                a aVar = dVar2.b;
                Objects.requireNonNull(aVar);
                aVar.a = new WeakReference<>(activity);
            }
            dVar = a;
        }
        return dVar;
    }

    public static void c(d dVar, i0.j.e.p0.e.a aVar) {
        if (dVar.e.size() > 0) {
            k0.b.w.a aVar2 = dVar.e.get(aVar);
            if (aVar2 != null) {
                aVar2.dispose();
            }
            dVar.e.remove(aVar);
            dVar.d.remove(aVar);
        }
    }

    public final a a() {
        if (this.b.a() != null) {
            return new a();
        }
        InstabugSDKLogger.e(d.class, "Is your activity running?");
        return null;
    }

    public void d(i0.j.e.p0.e.a aVar, int... iArr) {
        l<Bitmap> lVar;
        if (this.c == null) {
            a a2 = a();
            this.c = a2;
            if (a2 == null) {
                ((ScreenshotProvider.a) aVar).a.onScreenshotCapturingFailed(new Throwable("screenshot provider is null"));
                return;
            }
        }
        Map<i0.j.e.p0.e.a, l<Bitmap>> map = this.d;
        Activity a3 = this.b.a();
        if (a3 == null) {
            lVar = l.h(new com.instabug.library.l.c.a("Is your activity running?"));
        } else if (this.c == null) {
            lVar = l.h(new c("screenshot provider is null"));
        } else {
            l<Bitmap> screenshotBitmap = ScreenshotTaker.getScreenshotBitmap(a3, iArr);
            if (screenshotBitmap != null) {
                lVar = screenshotBitmap.s(k0.b.v.a.a.a());
            } else {
                lVar = l.h(new com.instabug.library.l.c.b("Observable of bitmap is null due to IllegalArgumentException or OutOfMemoryError"));
            }
        }
        map.put(aVar, lVar);
        if (this.d.size() == 1) {
            e();
        }
    }

    public final void e() {
        if (this.d.size() > 0) {
            i0.j.e.p0.e.a aVar = (i0.j.e.p0.e.a) this.d.keySet().toArray()[0];
            this.e.put(aVar, this.d.get(aVar) != null ? this.d.get(aVar).v(RxJavaPlugins.onSingleScheduler(k0.b.d0.a.a)).t(new b(this, aVar), new c(this, aVar), k0.b.z.b.a.c, k0.b.z.b.a.d) : null);
        }
    }
}
