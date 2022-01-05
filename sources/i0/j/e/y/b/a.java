package i0.j.e.y.b;

import android.content.Context;
import com.instabug.library.core.plugin.Plugin;
import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PluginsManager */
public class a {
    public static List<Plugin> a;
    public static final Object b = new Object();

    public static boolean a() {
        return SettingsManager.getInstance().isPromptOptionsScreenShown() || SettingsManager.getInstance().isRequestPermissionScreenShown() || SettingsManager.getInstance().isOnboardingShowing();
    }

    public static boolean b(String str) {
        if (a != null) {
            return true;
        }
        InstabugSDKLogger.e(a.class, "PluginsManager." + str + " was called before PluginsManager.init() was called");
        return false;
    }

    public static void c(Context context) {
        synchronized (b) {
            if (b("startPlugins()")) {
                for (Plugin startIfPossible : a) {
                    startIfPossible.startIfPossible(context);
                }
            }
        }
    }

    public static ArrayList<PluginPromptOption> d() {
        synchronized (b) {
            ArrayList<PluginPromptOption> arrayList = new ArrayList<>();
            if (!b("getPluginsPromptOptions()")) {
                return arrayList;
            }
            for (Plugin next : a) {
                InstabugSDKLogger.v(a.class, "plugin: " + next.toString());
                ArrayList<PluginPromptOption> promptOptions = next.getPromptOptions();
                if (promptOptions != null) {
                    arrayList.addAll(promptOptions);
                }
            }
            Collections.sort(arrayList, new PluginPromptOption.a());
            return arrayList;
        }
    }

    public static void e() {
        synchronized (b) {
            if (b("stopPlugins()")) {
                for (Plugin stopIfPossible : a) {
                    stopIfPossible.stopIfPossible();
                }
            }
        }
    }
}
