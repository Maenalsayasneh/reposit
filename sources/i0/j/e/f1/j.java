package i0.j.e.f1;

import android.content.Context;
import com.instabug.library.Instabug;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.visualusersteps.VisualUserStepsHelper;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: VisualUserSteps */
public class j implements Callable<Boolean> {
    public final /* synthetic */ String[] c;
    public final /* synthetic */ m d;

    public j(m mVar, String[] strArr) {
        this.d = mVar;
        this.c = strArr;
    }

    public Object call() throws Exception {
        Context applicationContext = Instabug.getApplicationContext();
        if (applicationContext != null) {
            File visualUserStepsDirectory = VisualUserStepsHelper.getVisualUserStepsDirectory(applicationContext);
            if (visualUserStepsDirectory.exists()) {
                String[] list = visualUserStepsDirectory.list();
                if (list != null) {
                    for (String a : list) {
                        m.a(this.d, a);
                    }
                }
                if (visualUserStepsDirectory.delete()) {
                    this.c[0] = "VisualUserStep screenshot directory {" + visualUserStepsDirectory + "} deleted";
                    InstabugSDKLogger.v("VisualUserSteps", this.c[0]);
                    return Boolean.TRUE;
                }
                this.c[0] = "Couldn't delete directory " + visualUserStepsDirectory + ". Something went wrong";
            } else {
                this.c[0] = "Couldn't execute deleteFile(). Directory does not exist";
            }
        } else {
            this.c[0] = "Couldn't execute deleteFile(). Context is null";
        }
        return Boolean.FALSE;
    }
}
