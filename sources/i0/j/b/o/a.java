package i0.j.b.o;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.instabug.bug.BugPlugin;
import com.instabug.library.InstabugState;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.InstabugStateEventBus;
import com.instabug.library.invocation.invocationdialog.InstabugDialogActivity;
import com.instabug.library.model.Attachment;
import com.instabug.library.screenshot.ExtraScreenshotHelper;
import com.instabug.library.util.InstabugSDKLogger;
import i0.h.a.b.c.m.b;
import i0.j.b.f;
import java.lang.ref.WeakReference;
import k0.b.y.d;

/* compiled from: ScreenshotHelper */
public class a implements ExtraScreenshotHelper.OnCaptureListener {
    public static a a;
    public WeakReference<Context> b;
    public ExtraScreenshotHelper c = new ExtraScreenshotHelper();

    /* renamed from: i0.j.b.o.a$a  reason: collision with other inner class name */
    /* compiled from: ScreenshotHelper */
    public class C0159a implements d<InstabugState> {
        public C0159a() {
        }

        public void b(Object obj) throws Exception {
            if (((InstabugState) obj) == InstabugState.DISABLED) {
                a aVar = a.this;
                synchronized (aVar) {
                    f.g().f();
                    f.g().b = null;
                    aVar.c.cancel();
                    BugPlugin bugPlugin = (BugPlugin) InstabugCore.getXPlugin(BugPlugin.class);
                    if (bugPlugin != null) {
                        bugPlugin.setState(0);
                    }
                }
            }
        }
    }

    public a() {
        InstabugStateEventBus.getInstance().subscribe(new C0159a());
    }

    public synchronized void onExtraScreenshotCaptured(Uri uri) {
        Context context;
        InstabugSDKLogger.d("ScreenshotHelper", "Uri: " + uri);
        this.c.release();
        com.instabug.bug.model.a aVar = f.g().b;
        if (aVar != null) {
            aVar.a(uri, Attachment.Type.EXTRA_IMAGE, false);
            WeakReference<Context> weakReference = this.b;
            if (!(weakReference == null || (context = (Context) weakReference.get()) == null)) {
                InstabugSDKLogger.d("ScreenshotHelper", "starting feedback activity");
                Intent A = b.A(context);
                A.putExtra(InstabugDialogActivity.KEY_SCREENSHOT_URI, uri);
                context.startActivity(A);
            }
        } else {
            InstabugSDKLogger.w("ScreenshotHelper", "Bug has been released ScreenshotHelper#onExtraScreenshotCaptured");
        }
    }

    public synchronized void onExtraScreenshotError(Throwable th) {
        Context context;
        WeakReference<Context> weakReference = this.b;
        if (!(weakReference == null || (context = (Context) weakReference.get()) == null)) {
            Intent A = b.A(context);
            A.putExtra(InstabugDialogActivity.KEY_SCREENSHOT_URI, (Parcelable) null);
            context.startActivity(A);
        }
    }
}
