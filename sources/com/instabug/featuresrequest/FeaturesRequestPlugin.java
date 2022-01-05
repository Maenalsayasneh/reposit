package com.instabug.featuresrequest;

import android.content.Context;
import android.content.Intent;
import com.instabug.featuresrequest.network.service.FeaturesRequestVoteService;
import com.instabug.library.Feature;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber;
import com.instabug.library.core.plugin.Plugin;
import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import io.reactivex.disposables.CompositeDisposable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import k0.b.y.d;
import org.json.JSONException;

public class FeaturesRequestPlugin extends Plugin {
    private static final String TAG = "FeaturesRequestPlugin";
    private CompositeDisposable disposables = new CompositeDisposable();

    public class a implements Runnable {
        public final /* synthetic */ Context c;

        public a(Context context) {
            this.c = context;
        }

        public void run() {
            Context context = this.c;
            CompositeDisposable compositeDisposable = i0.j.d.a.a;
            i0.j.d.e.c.a = new i0.j.d.e.c(context);
            FeaturesRequestPlugin.this.subscribeOnSDKEvents();
        }
    }

    public class b implements d<SDKCoreEvent> {
        public b() {
        }

        public void b(Object obj) throws Exception {
            SDKCoreEvent sDKCoreEvent = (SDKCoreEvent) obj;
            if (SDKCoreEvent.Network.TYPE_NETWORK.equals(sDKCoreEvent.getType()) && sDKCoreEvent.getValue().equals(SDKCoreEvent.Network.VALUE_ACTIVATED)) {
                FeaturesRequestPlugin.this.submitPendingVotes();
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ Context c;

        public c(Context context) {
            this.c = context;
        }

        public void run() {
            try {
                if (!((ArrayList) i0.j.d.c.a.b()).isEmpty() && NetworkManager.isOnline(this.c)) {
                    FeaturesRequestVoteService.a(this.c, new Intent(this.c, FeaturesRequestVoteService.class));
                }
            } catch (JSONException e) {
                StringBuilder P0 = i0.d.a.a.a.P0("Error occurred during Feature Requests retrieval from DB: ");
                P0.append(e.getMessage());
                InstabugSDKLogger.e(FeaturesRequestPlugin.TAG, P0.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    public void submitPendingVotes() {
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference != null) {
            Context context = (Context) weakReference.get();
            if (context != null) {
                PoolProvider.postIOTask(new c(context));
            } else {
                InstabugSDKLogger.e(TAG, "Context is null.");
            }
        } else {
            InstabugSDKLogger.e(TAG, "Context WeakReference is null.");
        }
    }

    /* access modifiers changed from: private */
    public void subscribeOnSDKEvents() {
        this.disposables.add(SDKCoreEventSubscriber.subscribe(new b()));
    }

    public long getLastActivityTime() {
        CompositeDisposable compositeDisposable = i0.j.d.a.a;
        Objects.requireNonNull(i0.j.d.e.a.d());
        if (i0.j.d.e.c.a() == null) {
            return 0;
        }
        return i0.j.d.e.c.a().b.getLong("last_activity", 0);
    }

    public ArrayList<PluginPromptOption> getPluginOptions(boolean z) {
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return i0.j.d.a.a((Context) this.contextWeakReference.get());
    }

    public ArrayList<PluginPromptOption> getPromptOptions() {
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return i0.j.d.a.a((Context) this.contextWeakReference.get());
    }

    public void init(Context context) {
        super.init(context);
    }

    public void initDefaultPromptOptionAvailabilityState() {
        CompositeDisposable compositeDisposable = i0.j.d.a.a;
        FeatureRequests.setState(Feature.State.ENABLED);
    }

    public void sleep() {
    }

    public void start(Context context) {
        PoolProvider.postIOTaskWithCheck(new a(context));
    }

    public void stop() {
        i0.j.d.a.a.clear();
    }

    public void wake() {
    }
}
