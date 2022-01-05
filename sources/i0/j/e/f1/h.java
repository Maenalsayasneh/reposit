package i0.j.e.f1;

import android.net.Uri;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.p.a;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.f1.g;
import java.util.Objects;

/* compiled from: TouchedViewsProcessor */
public class h implements BitmapUtils.OnSaveBitmapCallback {
    public final /* synthetic */ g.b a;
    public final /* synthetic */ c b;
    public final /* synthetic */ g c;

    public h(g gVar, g.b bVar, c cVar) {
        this.c = gVar;
        this.a = bVar;
        this.b = cVar;
    }

    public void onError(Throwable th) {
        if (th.getMessage() != null) {
            InstabugSDKLogger.e("TouchedViewsProcessor", th.getMessage());
        }
        d dVar = this.c.g;
        dVar.a = "a button";
        dVar.b = null;
        ((a.C0108a) this.a).a(this.b, dVar);
    }

    public void onSuccess(Uri uri) {
        d dVar = this.c.g;
        dVar.a = "the button ";
        uri.toString();
        Objects.requireNonNull(dVar);
        this.c.g.b = uri.getLastPathSegment();
        if (uri.getPath() != null) {
            InstabugCore.encrypt(uri.getPath());
        }
        ((a.C0108a) this.a).a(this.b, this.c.g);
    }
}
