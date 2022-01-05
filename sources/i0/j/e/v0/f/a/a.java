package i0.j.e.v0.f.a;

import android.content.Context;
import com.instabug.library.network.BaseNetworkTask;
import i0.j.e.z;

/* compiled from: FeaturesFetcherTask */
public class a extends BaseNetworkTask {
    public a(Context context) {
        super(context);
    }

    public void onHandleTask() throws Exception {
        z.j().c(getContext());
    }

    public void onTaskCancelled() {
    }

    public void onTaskFinished() {
    }
}
