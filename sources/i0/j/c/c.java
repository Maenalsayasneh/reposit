package i0.j.c;

import android.annotation.SuppressLint;
import android.content.Context;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.R;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.util.InstabugAppData;
import com.instabug.library.util.PlaceHolderUtils;
import com.instabug.library.util.threading.PoolProvider;
import java.util.ArrayList;

/* compiled from: ChatPluginWrapper */
public class c {
    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public static String a() {
        String str;
        Context applicationContext = Instabug.getApplicationContext();
        if (applicationContext == null) {
            str = "";
        } else {
            str = String.format(applicationContext.getString(R.string.instabug_str_notification_title), new Object[]{new InstabugAppData(applicationContext).getAppName()});
        }
        return PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.CHATS_TEAM_STRING_NAME, str);
    }

    public static void b() {
        PoolProvider.postIOTask(new i0.j.c.e.c());
    }

    public static ArrayList<PluginPromptOption> c(Context context) {
        ArrayList<PluginPromptOption> arrayList = new ArrayList<>();
        boolean z = true;
        if ((InstabugCore.getFeatureState(Feature.IN_APP_MESSAGING) == Feature.State.ENABLED) && InstabugCore.isFeatureEnabled(Feature.REPLIES)) {
            if (ChatsCacheManager.getValidChats().size() <= 0) {
                z = false;
            }
            if (z) {
                PluginPromptOption pluginPromptOption = new PluginPromptOption();
                pluginPromptOption.setOrder(-1);
                pluginPromptOption.setInvocationMode(4);
                pluginPromptOption.setInitialScreenshotRequired(false);
                pluginPromptOption.setNotificationCount(ChatsCacheManager.getUnreadCount());
                pluginPromptOption.setPromptOptionIdentifier(2);
                pluginPromptOption.setIcon(com.instabug.chat.R.drawable.ibg_core_ic_talk_to_us);
                pluginPromptOption.setOnInvocationListener(new a(context));
                arrayList.add(pluginPromptOption);
            }
        }
        return arrayList;
    }

    public static boolean d() {
        return InstabugCore.isFeatureEnabled(Feature.REPLIES);
    }
}
