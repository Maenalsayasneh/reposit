package i0.j.f.p;

import android.os.Handler;
import android.os.Looper;
import com.instabug.library.Feature;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.f.o.c;

/* compiled from: SurveysUtils */
public class i {

    /* compiled from: SurveysUtils */
    public static class a implements Runnable {
        public void run() {
            try {
                int i = c.b;
                if (i0.j.f.o.a.a().d != null) {
                    i0.j.f.o.a.a().d.a();
                }
            } catch (Exception e) {
                InstabugSDKLogger.e(i.class, "AfterShowingSurveyRunnable has been failed to run.", e);
            }
        }
    }

    /* compiled from: SurveysUtils */
    public static class b implements Runnable {
        public void run() {
            try {
                int i = c.b;
                if (i0.j.f.o.a.a().e != null) {
                    i0.j.f.o.a.a().e.a();
                }
            } catch (Exception e) {
                InstabugSDKLogger.e(i.class, "AfterShowingSurveyRunnable has been failed to run.", e);
            }
        }
    }

    public static void a() {
        try {
            new Handler(Looper.getMainLooper()).post(new b());
        } catch (Exception e) {
            InstabugSDKLogger.e(i.class, "AfterShowingSurveyRunnable has been failed to run.", e);
        }
    }

    public static void b() {
        try {
            new Handler(Looper.getMainLooper()).post(new a());
        } catch (Exception e) {
            InstabugSDKLogger.e(i.class, "AfterShowingSurveyRunnable has been failed to run.", e);
        }
    }

    public static boolean c() {
        return InstabugCore.getFeatureState(Feature.SURVEYS) == Feature.State.ENABLED;
    }
}
