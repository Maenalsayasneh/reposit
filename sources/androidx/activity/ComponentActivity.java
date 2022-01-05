package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.runtime.R;
import h0.a.f.d.a;
import h0.q.e0;
import h0.q.g0;
import h0.q.l;
import h0.q.m0;
import h0.q.n;
import h0.q.n0;
import h0.q.o0;
import h0.q.p;
import h0.q.r;
import h0.x.a;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements p, o0, l, h0.x.c, h0.a.d, h0.a.f.c {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    /* access modifiers changed from: private */
    public final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    public final h0.a.e.a mContextAwareHelper;
    private m0.b mDefaultFactory;
    private final r mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    public final h0.x.b mSavedStateRegistryController;
    private n0 mViewModelStore;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    public class b extends ActivityResultRegistry {

        public class a implements Runnable {
            public final /* synthetic */ int c;
            public final /* synthetic */ a.C0014a d;

            public a(int i, a.C0014a aVar) {
                this.c = i;
                this.d = aVar;
            }

            public void run() {
                h0.a.f.a<O> aVar;
                b bVar = b.this;
                int i = this.c;
                T t = this.d.a;
                String str = bVar.b.get(Integer.valueOf(i));
                if (str != null) {
                    bVar.e.remove(str);
                    ActivityResultRegistry.c cVar = bVar.f.get(str);
                    if (cVar == null || (aVar = cVar.a) == null) {
                        bVar.h.remove(str);
                        bVar.g.put(str, t);
                        return;
                    }
                    aVar.onActivityResult(t);
                }
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        public class C0000b implements Runnable {
            public final /* synthetic */ int c;
            public final /* synthetic */ IntentSender.SendIntentException d;

            public C0000b(int i, IntentSender.SendIntentException sendIntentException) {
                this.c = i;
                this.d = sendIntentException;
            }

            public void run() {
                b.this.a(this.c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.d));
            }
        }

        public b() {
        }

        public <I, O> void b(int i2, h0.a.f.d.a<I, O> aVar, I i3, ActivityOptionsCompat activityOptionsCompat) {
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0014a<O> synchronousResult = aVar.getSynchronousResult(componentActivity, i3);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new a(i2, synchronousResult));
                return;
            }
            Intent createIntent = aVar.createIntent(componentActivity, i3);
            Bundle bundle = null;
            if (createIntent.getExtras() != null && createIntent.getExtras().getClassLoader() == null) {
                createIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (createIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = createIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                createIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else if (activityOptionsCompat != null) {
                bundle = activityOptionsCompat.toBundle();
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(createIntent.getAction())) {
                String[] stringArrayExtra = createIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                ActivityCompat.requestPermissions(componentActivity, stringArrayExtra, i2);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(createIntent.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) createIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    ActivityCompat.startIntentSenderForResult(componentActivity, intentSenderRequest.c, i2, intentSenderRequest.d, intentSenderRequest.q, intentSenderRequest.x, 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new C0000b(i2, e));
                }
            } else {
                ActivityCompat.startActivityForResult(componentActivity, createIntent, i2, bundle2);
            }
        }
    }

    public class c implements a.b {
        public c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public Bundle a() {
            Bundle bundle = new Bundle();
            ActivityResultRegistry access$100 = ComponentActivity.this.mActivityResultRegistry;
            Objects.requireNonNull(access$100);
            bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(access$100.c.values()));
            bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(access$100.c.keySet()));
            bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(access$100.e));
            bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) access$100.h.clone());
            bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", access$100.a);
            return bundle;
        }
    }

    public class d implements h0.a.e.b {
        public d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void a(Context context) {
            Bundle a2 = ComponentActivity.this.getSavedStateRegistry().a(ComponentActivity.ACTIVITY_RESULT_TAG);
            if (a2 != null) {
                ActivityResultRegistry access$100 = ComponentActivity.this.mActivityResultRegistry;
                Objects.requireNonNull(access$100);
                ArrayList<Integer> integerArrayList = a2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                ArrayList<String> stringArrayList = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                if (stringArrayList != null && integerArrayList != null) {
                    access$100.e = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    access$100.a = (Random) a2.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                    access$100.h.putAll(a2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                    for (int i = 0; i < stringArrayList.size(); i++) {
                        String str = stringArrayList.get(i);
                        if (access$100.c.containsKey(str)) {
                            Integer remove = access$100.c.remove(str);
                            if (!access$100.h.containsKey(str)) {
                                access$100.b.remove(remove);
                            }
                        }
                        int intValue = integerArrayList.get(i).intValue();
                        String str2 = stringArrayList.get(i);
                        access$100.b.put(Integer.valueOf(intValue), str2);
                        access$100.c.put(str2, Integer.valueOf(intValue));
                    }
                }
            }
        }
    }

    public static final class e {
        public Object a;
        public n0 b;
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new h0.a.e.a();
        this.mLifecycleRegistry = new r(this);
        this.mSavedStateRegistryController = new h0.x.b(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        if (getLifecycle() != null) {
            getLifecycle().a(new n() {
                public void a(p pVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            getLifecycle().a(new n() {
                public void a(p pVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.b = null;
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().a();
                        }
                    }
                }
            });
            getLifecycle().a(new n() {
                public void a(p pVar, Lifecycle.Event event) {
                    ComponentActivity.this.ensureViewModelStore();
                    r rVar = (r) ComponentActivity.this.getLifecycle();
                    rVar.d("removeObserver");
                    rVar.b.k(this);
                }
            });
            getSavedStateRegistry().b(ACTIVITY_RESULT_TAG, new c());
            addOnContextAvailableListener(new d());
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void initViewTreeOwners() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(androidx.lifecycle.viewmodel.R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(androidx.savedstate.R.id.view_tree_saved_state_registry_owner, this);
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public final void addOnContextAvailableListener(h0.a.e.b bVar) {
        h0.a.e.a aVar = this.mContextAwareHelper;
        if (aVar.b != null) {
            bVar.a(aVar.b);
        }
        aVar.a.add(bVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.mViewModelStore = eVar.b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new n0();
            }
        }
    }

    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    public m0.b getDefaultViewModelProviderFactory() {
        if (getApplication() != null) {
            if (this.mDefaultFactory == null) {
                this.mDefaultFactory = new g0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        e eVar = (e) getLastNonConfigurationInstance();
        if (eVar != null) {
            return eVar.a;
        }
        return null;
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    public final h0.x.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b;
    }

    public n0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.mActivityResultRegistry.a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onBackPressed() {
        this.mOnBackPressedDispatcher.b();
    }

    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.a(bundle);
        h0.a.e.a aVar = this.mContextAwareHelper;
        aVar.b = this;
        for (h0.a.e.b a2 : aVar.a) {
            a2.a(this);
        }
        super.onCreate(bundle);
        e0.c(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        n0 n0Var = this.mViewModelStore;
        if (n0Var == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            n0Var = eVar.b;
        }
        if (n0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.a = onRetainCustomNonConfigurationInstance;
        eVar2.b = n0Var;
        return eVar2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof r) {
            ((r) lifecycle).i(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.b(bundle);
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.b;
    }

    public final <I, O> h0.a.f.b<I> registerForActivityResult(h0.a.f.d.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, h0.a.f.a<O> aVar2) {
        StringBuilder P0 = i0.d.a.a.a.P0("activity_rq#");
        P0.append(this.mNextLocalRequestCode.getAndIncrement());
        return activityResultRegistry.d(P0.toString(), this, aVar, aVar2);
    }

    public final void removeOnContextAvailableListener(h0.a.e.b bVar) {
        this.mContextAwareHelper.a.remove(bVar);
    }

    public void reportFullyDrawn() {
        try {
            if (g0.a.b.b.a.Z()) {
                Trace.beginSection("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
        } finally {
            Trace.endSection();
        }
    }

    public void setContentView(int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    public final <I, O> h0.a.f.b<I> registerForActivityResult(h0.a.f.d.a<I, O> aVar, h0.a.f.a<O> aVar2) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, aVar2);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }
}
