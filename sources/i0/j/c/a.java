package i0.j.c;

import android.content.Context;
import android.net.Uri;
import com.instabug.chat.ChatsDelegate;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.invocation.invocationdialog.InstabugDialogActivity;
import com.instabug.library.invocation.invocationdialog.InstabugDialogItem;
import java.util.ArrayList;

/* compiled from: ChatPluginWrapper */
public final class a implements PluginPromptOption.OnInvocationListener {
    public final /* synthetic */ Context a;

    public a(Context context) {
        this.a = context;
    }

    public void onInvoke(Uri uri, String... strArr) {
        this.a.startActivity(InstabugDialogActivity.getIntent(this.a, (String) null, (Uri) null, (ArrayList<InstabugDialogItem>) null, true));
        if (c.d() && ChatsCacheManager.getValidChats().size() > 0) {
            ChatsDelegate.showChats();
        }
    }
}
