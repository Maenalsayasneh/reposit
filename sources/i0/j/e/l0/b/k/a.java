package i0.j.e.l0.b.k;

import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.l0.b.j.b;
import java.io.File;

/* compiled from: FileDisposable */
public class a implements b {
    public final f a;

    public a(f fVar) {
        this.a = fVar;
    }

    public void dispose() {
        try {
            File file = this.a.a;
            if (!file.delete()) {
                InstabugSDKLogger.w(this, "couldn't delete disposable file (" + file.getName() + ")");
            }
        } catch (Exception e) {
            InstabugSDKLogger.e(this, "couldn't delete disposable file", e);
        }
    }
}
