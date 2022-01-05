package i0.j.b.l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.net.Uri;
import com.instabug.bug.BugPlugin;
import com.instabug.bug.k.b.c$b;
import com.instabug.bug.model.ReportCategory;
import com.instabug.bug.model.a;
import com.instabug.bug.screenshot.viewhierarchy.utilities.ViewHierarchyInspectorEventBus;
import com.instabug.library.R;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.instacapture.screenshot.FieldHelper;
import com.instabug.library.instacapture.screenshot.RootViewInfo;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.memory.MemoryUtils;
import i0.j.b.f;
import i0.j.b.o.b.c;
import i0.j.b.o.b.e;
import i0.j.b.o.b.g;
import i0.j.b.o.b.h;
import i0.j.b.o.b.i;
import i0.j.b.o.b.j;
import i0.j.b.s.a;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k0.b.l;
import k0.b.y.d;
import org.json.JSONException;

/* compiled from: BaseReportingPromptItem */
public abstract class b {
    @SuppressLint({"NULL_DEREFERENCE"})
    public static void d() {
        if (InstabugCore.getOnSdkInvokedCallback() != null) {
            InstabugCore.getOnSdkInvokedCallback().onSdkInvoked();
        }
    }

    public static void e(Uri uri) {
        BugPlugin bugPlugin = (BugPlugin) InstabugCore.getXPlugin(BugPlugin.class);
        if (!(bugPlugin == null || bugPlugin.getAppContext() == null)) {
            f.g().c(bugPlugin.getAppContext());
        }
        if (uri != null && a.h().a().isShouldTakesInitialScreenshot() && f.g().b != null) {
            f.g().b.e2 = uri.getPath();
        }
    }

    public static void f() {
        Activity targetActivity = InstabugInternalTrackingDelegate.getInstance().getTargetActivity();
        if (targetActivity != null && f.g().b != null && f.g().b.a2 && !MemoryUtils.isLowMemory(targetActivity)) {
            synchronized (h.class) {
                if (f.g().b != null) {
                    f.g().b.b2 = a.c.IN_PROGRESS;
                }
                h.a aVar = new h.a((i0.j.b.o.b.a) null);
                ViewHierarchyInspectorEventBus.getInstance().post(c$b.STARTED);
                InstabugSDKLogger.d("ActivityViewInspector", "inspect activity view start, time in MS: " + System.currentTimeMillis());
                i iVar = new i();
                iVar.n = targetActivity.getWindow().getDecorView();
                try {
                    iVar.c = i0.h.a.b.c.m.b.e(targetActivity, h.a(targetActivity));
                } catch (JSONException e) {
                    InstabugSDKLogger.e("ActivityViewInspector", "inspect activity frame got error" + e.getMessage() + ", time in MS: " + System.currentTimeMillis(), e);
                }
                List<RootViewInfo> rootViews = FieldHelper.getRootViews(targetActivity, new int[]{R.id.instabug_decor_view, R.id.instabug_in_app_notification, R.id.instabug_intro_dialog});
                InstabugSDKLogger.d("ActivityViewInspector", "root views size: " + rootViews.size());
                if (rootViews.size() > 0) {
                    iVar.h = true;
                }
                ArrayList arrayList = new ArrayList(rootViews.size());
                for (int i = 0; i < rootViews.size(); i++) {
                    i iVar2 = new i();
                    iVar2.a = String.valueOf(i);
                    iVar2.n = rootViews.get(i).getView();
                    iVar2.i = true;
                    iVar2.o = h.a(targetActivity);
                    arrayList.add(RxJavaPlugins.onAssembly(new k0.b.z.e.c.h(new j(iVar2))));
                }
                k0.b.w.a aVar2 = h.a;
                if (aVar2 != null && !aVar2.isDisposed()) {
                    h.a.dispose();
                }
                l d = l.q(arrayList).d(new g(iVar, targetActivity)).d(new i0.j.b.o.b.f(targetActivity));
                e eVar = new e(aVar);
                d<Object> dVar = k0.b.z.b.a.d;
                k0.b.y.a aVar3 = k0.b.z.b.a.c;
                l<Object> f = d.f(eVar, dVar, aVar3, aVar3).f(dVar, dVar, new i0.j.b.o.b.d(aVar, iVar), aVar3);
                c cVar = new c(aVar);
                Objects.requireNonNull(f);
                l onAssembly = RxJavaPlugins.onAssembly(new k0.b.z.e.c.d(f, cVar, aVar3));
                i0.j.b.o.b.b bVar = new i0.j.b.o.b.b(aVar, targetActivity);
                Objects.requireNonNull(onAssembly);
                l s = RxJavaPlugins.onAssembly(new k0.b.z.e.c.d(onAssembly, dVar, bVar)).v(k0.b.v.a.a.a()).s(k0.b.d0.a.b());
                i0.j.b.o.b.a aVar4 = new i0.j.b.o.b.a(iVar);
                s.c(aVar4);
                h.a = aVar4;
            }
        }
    }

    public PluginPromptOption a(ReportCategory reportCategory, PluginPromptOption pluginPromptOption, String str, int i) {
        PluginPromptOption pluginPromptOption2 = new PluginPromptOption();
        pluginPromptOption2.setOrder(i);
        pluginPromptOption2.setTitle(reportCategory.getLabel());
        pluginPromptOption2.setDescription(reportCategory.getDescription());
        pluginPromptOption2.setInitialScreenshotRequired(true);
        pluginPromptOption2.setParent(pluginPromptOption);
        pluginPromptOption2.setSubOptions(c(reportCategory.getSubs(), pluginPromptOption2, str));
        return pluginPromptOption2;
    }

    public ArrayList<PluginPromptOption> b(String str) {
        return c(ReportCategory.getSubReportCategories(str), (PluginPromptOption) null, str);
    }

    @SuppressLint({"ERADICATE_NULLABLE_DEREFERENCE"})
    public ArrayList<PluginPromptOption> c(List<ReportCategory> list, PluginPromptOption pluginPromptOption, String str) {
        ArrayList<PluginPromptOption> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            if (i >= (list != null ? list.size() : 0)) {
                return arrayList;
            }
            arrayList.add(a(list.get(i), pluginPromptOption, str, i));
            i++;
        }
    }
}
