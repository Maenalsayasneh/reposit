package i0.j.b.n;

import android.app.Activity;
import android.net.Uri;
import com.instabug.library.internal.video.InternalScreenRecordHelper;
import com.instabug.library.internal.video.ScreenRecordingContract;
import com.instabug.library.model.Attachment;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import i0.h.a.b.c.m.b;
import i0.j.b.f;
import java.util.Objects;
import k0.b.w.a;

/* compiled from: ExternalScreenRecordHelper */
public class c implements ScreenRecordingContract {
    public static c a;
    public a b;

    public static void a(c cVar, Uri uri) {
        Objects.requireNonNull(cVar);
        if (!(uri == null || f.g().b == null)) {
            f.g().b.a(uri, Attachment.Type.EXTRA_VIDEO, false);
        }
        Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.startActivity(b.A(currentActivity.getApplicationContext()));
        }
    }

    public static c b() {
        if (a == null) {
            a = new c();
        }
        return a;
    }

    public void clear() {
        a aVar = this.b;
        if (aVar != null && !aVar.isDisposed()) {
            this.b.dispose();
        }
        InternalScreenRecordHelper.getInstance().clear();
    }

    public void delete() {
        InternalScreenRecordHelper.getInstance().delete();
    }

    public Uri getAutoScreenRecordingFileUri() {
        return InternalScreenRecordHelper.getInstance().getAutoScreenRecordingFileUri();
    }

    public boolean isEnabled() {
        return InternalScreenRecordHelper.getInstance().isEnabled();
    }
}
