package i0.j.e.f1;

import com.instabug.library.util.InstabugSDKLogger;
import k0.b.y.d;

/* compiled from: VisualUserSteps */
public class i implements d<Boolean> {
    public final /* synthetic */ String[] c;

    public i(String[] strArr) {
        this.c = strArr;
    }

    public void b(Object obj) throws Exception {
        if (!((Boolean) obj).booleanValue()) {
            InstabugSDKLogger.e("VisualUserSteps", this.c[0]);
        } else {
            InstabugSDKLogger.d("VisualUserSteps", this.c[0]);
        }
    }
}
