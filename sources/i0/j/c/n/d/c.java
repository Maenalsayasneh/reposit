package i0.j.c.n.d;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.instabug.library.core.ui.BasePresenter;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.InstabugSDKLogger;
import java.lang.ref.WeakReference;

/* compiled from: AnnotationPresenter */
public class c extends BasePresenter<b> implements a {

    /* compiled from: AnnotationPresenter */
    public class a implements BitmapUtils.OnSaveBitmapCallback {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public void onError(Throwable th) {
            this.a.finish();
            InstabugSDKLogger.e(this, th.getMessage(), th);
        }

        public void onSuccess(Uri uri) {
            this.a.finish();
        }
    }

    public c(b bVar) {
        super(bVar);
    }

    public void O(Bitmap bitmap, Uri uri) {
        b bVar;
        WeakReference<V> weakReference = this.view;
        if (weakReference != null && (bVar = (b) weakReference.get()) != null && bVar.getViewContext() != null && ((Fragment) bVar.getViewContext()).getContext() != null && bitmap != null) {
            bVar.k();
            BitmapUtils.saveBitmap(bitmap, uri, ((Fragment) bVar.getViewContext()).getContext(), new a(bVar));
        }
    }
}
