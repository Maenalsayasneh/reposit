package com.instabug.chat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.InstabugBackgroundService;
import com.instabug.chat.e.d;
import com.instabug.chat.network.InstabugPushNotificationTokenService;
import com.instabug.chat.synchronization.SynchronizationManager;
import com.instabug.library.Feature;
import com.instabug.library.PresentationManager;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber;
import com.instabug.library.core.plugin.Plugin;
import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.util.threading.PoolProvider;
import i0.j.c.h.l;
import i0.j.c.l.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
public class ChatPlugin extends Plugin implements i0.j.c.m.b {
    private k0.b.w.a coreEventsDisposable;

    public class a implements Runnable {
        public final /* synthetic */ Context c;

        public a(Context context) {
            this.c = context;
        }

        public void run() {
            ChatPlugin.this.subscribeOnCoreEvents();
            i0.j.c.m.a.d().b(ChatPlugin.this);
            Context context = this.c;
            c.a = new c(context.getSharedPreferences("com.instabug.chat", 0));
            PoolProvider.postIOTask(new i0.j.c.e.a(context));
            PoolProvider.postIOTask(new i0.j.c.e.b());
            SynchronizationManager.init(context);
            ChatPlugin.this.sendPushNotificationToken();
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Context c;
        public final /* synthetic */ List d;

        public b(Context context, List list) {
            this.c = context;
            this.d = list;
        }

        public void run() {
            l.a().g(this.c, this.d);
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"NULL_DEREFERENCE"})
    public void sendPushNotificationToken() {
        WeakReference<Context> weakReference;
        Context context;
        if (!InstabugCore.isPushNotificationTokenSent() && InstabugCore.getPushNotificationToken() != null && !InstabugCore.getPushNotificationToken().isEmpty() && (weakReference = this.contextWeakReference) != null && (context = (Context) weakReference.get()) != null) {
            Intent intent = new Intent(context, InstabugPushNotificationTokenService.class);
            int i = InstabugPushNotificationTokenService.c;
            InstabugBackgroundService.enqueueInstabugWork(context, InstabugPushNotificationTokenService.class, 2585, intent);
        }
    }

    /* access modifiers changed from: private */
    public void subscribeOnCoreEvents() {
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference != null && weakReference.get() != null) {
            this.coreEventsDisposable = SDKCoreEventSubscriber.subscribe(new i0.j.c.b((Context) this.contextWeakReference.get()));
        }
    }

    private void unSubscribeFromCoreEvents() {
        k0.b.w.a aVar = this.coreEventsDisposable;
        if (aVar != null && !aVar.isDisposed()) {
            aVar.dispose();
        }
    }

    public long getLastActivityTime() {
        return c.a().b.getLong("ibc_last_chat_time", System.currentTimeMillis());
    }

    public ArrayList<PluginPromptOption> getPluginOptions(boolean z) {
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return i0.j.c.c.c((Context) this.contextWeakReference.get());
    }

    public ArrayList<PluginPromptOption> getPromptOptions() {
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return i0.j.c.c.c((Context) this.contextWeakReference.get());
    }

    public void init(Context context) {
        super.init(context);
    }

    public void initDefaultPromptOptionAvailabilityState() {
        Feature.State state = Feature.State.ENABLED;
        Replies.setState(state);
        InstabugCore.setDeprecatedChatState(state);
        InstabugCore.setChatsState(state);
        InvocationManager.getInstance().notifyInvocationOptionChanged();
    }

    @SuppressLint({"ERADICATE_INCONSISTENT_SUBCLASS_RETURN_ANNOTATION"})
    public List<d> onNewMessagesReceived(List<d> list) {
        Context context;
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference == null || (context = (Context) weakReference.get()) == null) {
            return null;
        }
        if (InstabugCore.isAppOnForeground()) {
            PresentationManager.getInstance().show(new b(context, list));
            return null;
        }
        l.a().g(context, list);
        return null;
    }

    public void sleep() {
    }

    public void start(Context context) {
        PoolProvider.postIOTaskWithCheck(new a(context));
    }

    public void stop() {
        unSubscribeFromCoreEvents();
        SynchronizationManager.getInstance().release();
        i0.j.c.c.b();
        synchronized (i0.j.c.l.b.class) {
            i0.j.c.l.b.a = null;
        }
        c.a = null;
        i0.j.c.m.a.d().b.remove(this);
    }

    public void wake() {
    }
}
