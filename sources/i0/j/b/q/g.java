package i0.j.b.q;

import android.content.Context;
import com.instabug.library.network.BaseNetworkTask;

/* compiled from: BugsUploaderTask */
public class g extends BaseNetworkTask {
    public g(Context context) {
        super(context);
    }

    public void onHandleTask() throws Exception {
        new a(getContext()).a();
    }

    public void onTaskCancelled() {
    }

    public void onTaskFinished() {
    }
}
