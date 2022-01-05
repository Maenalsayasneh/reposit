package com.instabug.bug;

import android.content.Context;
import com.instabug.library.Feature;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber;
import com.instabug.library.core.plugin.Plugin;
import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.internal.orchestrator.ActionsOrchestrator;
import com.instabug.library.util.threading.PoolProvider;
import i0.h.a.b.c.m.b;
import i0.j.b.g;
import i0.j.b.h;
import i0.j.b.i;
import i0.j.b.l.d;
import i0.j.b.s.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

public class BugPlugin extends Plugin {
    private k0.b.w.a coreEventsDisposable;

    public class a implements Runnable {
        public final /* synthetic */ Context c;

        public a(Context context) {
            this.c = context;
        }

        public void run() {
            Context context = this.c;
            i0.j.b.s.a.a = new i0.j.b.s.a();
            synchronized (c.class) {
                c.a = new c(context);
            }
            Objects.requireNonNull(i0.j.b.s.a.h());
            if (c.a().b.getBoolean("ib_first_run_after_updating_encryptor", true)) {
                ActionsOrchestrator.obtainOrchestrator().addWorkerThreadAction(new h()).orchestrate();
            }
            BugPlugin.this.subscribeOnCoreEvents();
        }
    }

    /* access modifiers changed from: private */
    public void subscribeOnCoreEvents() {
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference != null && weakReference.get() != null) {
            this.coreEventsDisposable = SDKCoreEventSubscriber.subscribe(new g((Context) this.contextWeakReference.get()));
        }
    }

    private void unSubscribeFromCoreEvents() {
        k0.b.w.a aVar = this.coreEventsDisposable;
        if (aVar != null && !aVar.isDisposed()) {
            aVar.dispose();
        }
    }

    public long getLastActivityTime() {
        Objects.requireNonNull(i0.j.b.s.a.h());
        return c.a().b.getLong("last_bug_time", 0);
    }

    public ArrayList<PluginPromptOption> getPluginOptions(boolean z) {
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        Context context = (Context) this.contextWeakReference.get();
        ArrayList<PluginPromptOption> arrayList = new ArrayList<>();
        if (!z && InstabugCore.isFeatureEnabled(Feature.BUG_REPORTING)) {
            arrayList.add(new i0.j.b.l.c().g(context));
            arrayList.add(new d().g(context));
            arrayList.add(new i0.j.b.l.a().g(context));
        } else if (z) {
            arrayList.add(new i0.j.b.l.c().g(context));
            arrayList.add(new d().g(context));
            arrayList.add(new i0.j.b.l.a().g(context));
        }
        return arrayList;
    }

    public ArrayList<PluginPromptOption> getPromptOptions() {
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference == null || weakReference.get() == null) {
            return new ArrayList<>();
        }
        Context context = (Context) this.contextWeakReference.get();
        ArrayList<PluginPromptOption> arrayList = new ArrayList<>();
        if (InstabugCore.isFeatureEnabled(Feature.BUG_REPORTING)) {
            if (i.c("bug")) {
                arrayList.add(new i0.j.b.l.c().g(context));
            }
            if (i.c("feedback")) {
                arrayList.add(new d().g(context));
            }
        }
        if ((InstabugCore.getFeatureState(Feature.IN_APP_MESSAGING) == Feature.State.ENABLED) && InstabugCore.isFeatureEnabled(Feature.CHATS)) {
            arrayList.add(new i0.j.b.l.a().g(context));
        }
        return arrayList;
    }

    public void init(Context context) {
        super.init(context);
    }

    public void initDefaultPromptOptionAvailabilityState() {
        b.r(0, 1, 2);
    }

    public void sleep() {
    }

    public void start(Context context) {
        PoolProvider.postIOTaskWithCheck(new a(context));
    }

    public void stop() {
        unSubscribeFromCoreEvents();
    }

    public void wake() {
    }
}
