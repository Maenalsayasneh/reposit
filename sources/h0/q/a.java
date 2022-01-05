package h0.q;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleController;
import h0.q.m0;
import h0.x.c;

/* compiled from: AbstractSavedStateViewModelFactory */
public abstract class a extends m0.c {
    public static final String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";
    private final Bundle mDefaultArgs;
    private final Lifecycle mLifecycle;
    private final h0.x.a mSavedStateRegistry;

    public a(c cVar, Bundle bundle) {
        this.mSavedStateRegistry = cVar.getSavedStateRegistry();
        this.mLifecycle = cVar.getLifecycle();
        this.mDefaultArgs = bundle;
    }

    public final <T extends k0> T create(String str, Class<T> cls) {
        SavedStateHandleController d = SavedStateHandleController.d(this.mSavedStateRegistry, this.mLifecycle, str, this.mDefaultArgs);
        T create = create(str, cls, d.q);
        create.setTagIfAbsent(TAG_SAVED_STATE_HANDLE_CONTROLLER, d);
        return create;
    }

    public abstract <T extends k0> T create(String str, Class<T> cls, f0 f0Var);

    public void onRequery(k0 k0Var) {
        SavedStateHandleController.b(k0Var, this.mSavedStateRegistry, this.mLifecycle);
    }

    public final <T extends k0> T create(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return create(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
