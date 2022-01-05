package i0.j.e.m0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.net.Uri;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.R;
import com.instabug.library.core.InitialScreenshotHelper;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.invocation.invocationdialog.InstabugDialogActivity;
import com.instabug.library.invocation.invocationdialog.InstabugDialogItem;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.PlaceHolderUtils;
import java.util.ArrayList;

/* compiled from: InvocationRequestListenerImp */
public class c implements a {

    /* compiled from: InvocationRequestListenerImp */
    public class a implements InitialScreenshotHelper.InitialScreenshotCapturingListener {
        public final /* synthetic */ PluginPromptOption a;

        public a(PluginPromptOption pluginPromptOption) {
            this.a = pluginPromptOption;
        }

        public void onScreenshotCapturedSuccessfully(Uri uri) {
            c.this.a(uri, this.a);
        }

        public void onScreenshotCapturingFailed(Throwable th) {
            c.this.a((Uri) null, this.a);
        }
    }

    public void a(Uri uri, PluginPromptOption pluginPromptOption) {
        Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            InstabugDialogItem a2 = i0.j.e.x0.a.a.b().a(pluginPromptOption, (InstabugDialogItem) null);
            if (a2.getSubItems() == null || a2.getSubItems().isEmpty()) {
                pluginPromptOption.invoke(uri, new String[0]);
                return;
            }
            i0.j.e.x0.a.a.b();
            currentActivity.startActivity(InstabugDialogActivity.getIntent(currentActivity, pluginPromptOption.getTitle(), uri, a2.getSubItems(), false));
        }
    }

    public void b(PluginPromptOption pluginPromptOption) {
        InitialScreenshotHelper.captureScreenshot(new a(pluginPromptOption));
    }

    @SuppressLint({"SwitchIntDef"})
    public void c(Uri uri) {
        char c;
        if (!InstabugCore.isForegroundBusy()) {
            ArrayList<PluginPromptOption> d = i0.j.e.y.b.a.d();
            if (d.size() > 1) {
                c = 0;
            } else {
                c = 65535;
                if (!d.isEmpty()) {
                    int promptOptionIdentifier = d.get(0).getPromptOptionIdentifier();
                    if (promptOptionIdentifier == 0) {
                        c = 1;
                    } else if (promptOptionIdentifier == 1) {
                        c = 2;
                    } else if (promptOptionIdentifier == 2) {
                        c = 4;
                    } else if (promptOptionIdentifier == 3) {
                        c = 3;
                    } else if (promptOptionIdentifier == 5) {
                        c = 5;
                    }
                }
            }
            if (c == 5) {
                d(5);
            } else if (c == 4) {
                d(2);
            } else if (uri != null || !SettingsManager.isInitialScreenShotAllowed()) {
                if (c == 0) {
                    f();
                    e(uri);
                } else if (c == 1 || c == 2 || c == 3) {
                    f();
                    a(uri, i0.j.e.y.b.a.d().get(0));
                }
            } else if (c == 0) {
                f();
                InitialScreenshotHelper.captureScreenshot(new b(this));
            } else if (c == 1 || c == 2 || c == 3) {
                f();
                b(i0.j.e.y.b.a.d().get(0));
            }
        }
    }

    public final void d(@PluginPromptOption.PromptOptionIdentifier int i) {
        PluginPromptOption m = i0.j.c.l.a.m(i, false);
        if (m != null) {
            a((Uri) null, m);
        }
    }

    public void e(Uri uri) {
        Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
        if (currentActivity != null) {
            i0.j.e.x0.a.a b = i0.j.e.x0.a.a.b();
            String placeHolder = PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.INVOCATION_HEADER, LocaleUtils.getLocaleStringResource(Instabug.getLocale(currentActivity), R.string.instabug_str_invocation_dialog_title, currentActivity));
            ArrayList<PluginPromptOption> availablePromptOptions = InvocationManager.getInstance().getAvailablePromptOptions();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                if (i < (availablePromptOptions != null ? availablePromptOptions.size() : 0)) {
                    arrayList.add(b.a(availablePromptOptions.get(i), (InstabugDialogItem) null));
                    i++;
                } else {
                    currentActivity.startActivity(InstabugDialogActivity.getIntent(currentActivity, placeHolder, uri, arrayList, false));
                    return;
                }
            }
        }
    }

    public final void f() {
        if (SettingsManager.getInstance().getOnInvokeCallback() != null) {
            SettingsManager.getInstance().getOnInvokeCallback().onInvoke();
        }
    }
}
