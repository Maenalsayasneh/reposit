package i0.j.c.k;

import android.content.Context;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.library.network.BaseNetworkTask;

/* compiled from: MessageUploaderTask */
public class c extends BaseNetworkTask {
    public c(Context context) {
        super(context);
    }

    public void onHandleTask() throws Exception {
        b bVar = new b(getContext());
        bVar.a();
        bVar.d(ChatsCacheManager.getOfflineMessages());
    }

    public void onTaskCancelled() {
    }

    public void onTaskFinished() {
    }
}
