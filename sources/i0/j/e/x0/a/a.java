package i0.j.e.x0.a;

import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.invocation.invocationdialog.InstabugDialogItem;
import java.util.ArrayList;

/* compiled from: PromptOptionsLauncher */
public class a {
    public static a a;

    public static synchronized a b() {
        a aVar;
        synchronized (a.class) {
            aVar = a;
            if (aVar == null) {
                aVar = new a();
                a = aVar;
            }
        }
        return aVar;
    }

    public InstabugDialogItem a(PluginPromptOption pluginPromptOption, InstabugDialogItem instabugDialogItem) {
        InstabugDialogItem instabugDialogItem2;
        if (pluginPromptOption.getOrder() == -1) {
            instabugDialogItem2 = new com.instabug.library.invocation.invocationdialog.a();
            instabugDialogItem2.setOrder(-1);
        } else {
            instabugDialogItem2 = new InstabugDialogItem();
            instabugDialogItem2.setOrder(pluginPromptOption.getOrder());
        }
        instabugDialogItem2.setResDrawable(pluginPromptOption.getIcon());
        instabugDialogItem2.setTitle(pluginPromptOption.getTitle());
        instabugDialogItem2.setDescription(pluginPromptOption.getDescription());
        instabugDialogItem2.setBadge(pluginPromptOption.getNotificationCount());
        instabugDialogItem2.setInitialScreenshotRequired(pluginPromptOption.isInitialScreenshotRequired());
        instabugDialogItem2.setParent(instabugDialogItem);
        ArrayList<PluginPromptOption> subOptions = pluginPromptOption.getSubOptions();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            if (i < (subOptions != null ? subOptions.size() : 0)) {
                if (subOptions.get(i) != null) {
                    arrayList.add(a(subOptions.get(i), instabugDialogItem2));
                }
                i++;
            } else {
                instabugDialogItem2.setSubItems(arrayList);
                instabugDialogItem2.setIdentifier(pluginPromptOption.getPromptOptionIdentifier());
                return instabugDialogItem2;
            }
        }
    }
}
