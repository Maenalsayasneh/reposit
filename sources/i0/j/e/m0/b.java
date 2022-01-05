package i0.j.e.m0;

import android.net.Uri;
import com.instabug.library.core.InitialScreenshotHelper;

/* compiled from: InvocationRequestListenerImp */
public class b implements InitialScreenshotHelper.InitialScreenshotCapturingListener {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    public void onScreenshotCapturedSuccessfully(Uri uri) {
        this.a.e(uri);
    }

    public void onScreenshotCapturingFailed(Throwable th) {
        this.a.e((Uri) null);
    }
}
