package h0.q;

import android.annotation.SuppressLint;
import android.app.Application;

/* compiled from: AndroidViewModel */
public class b extends k0 {
    @SuppressLint({"StaticFieldLeak"})
    private Application mApplication;

    public b(Application application) {
        this.mApplication = application;
    }

    public <T extends Application> T getApplication() {
        return this.mApplication;
    }
}
