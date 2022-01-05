package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import h0.q.f0;
import h0.q.k0;
import h0.q.n;
import h0.q.n0;
import h0.q.o0;
import h0.q.p;
import h0.q.r;
import h0.x.a;
import h0.x.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public final class SavedStateHandleController implements n {
    public final String c;
    public boolean d = false;
    public final f0 q;

    public static final class a implements a.C0075a {
        public void a(c cVar) {
            if (cVar instanceof o0) {
                n0 viewModelStore = ((o0) cVar).getViewModelStore();
                h0.x.a savedStateRegistry = cVar.getSavedStateRegistry();
                Objects.requireNonNull(viewModelStore);
                Iterator it = new HashSet(viewModelStore.a.keySet()).iterator();
                while (it.hasNext()) {
                    SavedStateHandleController.b(viewModelStore.a.get((String) it.next()), savedStateRegistry, cVar.getLifecycle());
                }
                if (!new HashSet(viewModelStore.a.keySet()).isEmpty()) {
                    savedStateRegistry.c(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    public SavedStateHandleController(String str, f0 f0Var) {
        this.c = str;
        this.q = f0Var;
    }

    public static void b(k0 k0Var, h0.x.a aVar, Lifecycle lifecycle) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) k0Var.getTag(h0.q.a.TAG_SAVED_STATE_HANDLE_CONTROLLER);
        if (savedStateHandleController != null && !savedStateHandleController.d) {
            savedStateHandleController.c(aVar, lifecycle);
            e(aVar, lifecycle);
        }
    }

    public static SavedStateHandleController d(h0.x.a aVar, Lifecycle lifecycle, String str, Bundle bundle) {
        f0 f0Var;
        Bundle a2 = aVar.a(str);
        Class[] clsArr = f0.a;
        if (a2 == null && bundle == null) {
            f0Var = new f0();
        } else {
            HashMap hashMap = new HashMap();
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    hashMap.put(str2, bundle.get(str2));
                }
            }
            if (a2 == null) {
                f0Var = new f0(hashMap);
            } else {
                ArrayList parcelableArrayList = a2.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = a2.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    throw new IllegalStateException("Invalid bundle passed as restored state");
                }
                for (int i = 0; i < parcelableArrayList.size(); i++) {
                    hashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
                }
                f0Var = new f0(hashMap);
            }
        }
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, f0Var);
        savedStateHandleController.c(aVar, lifecycle);
        e(aVar, lifecycle);
        return savedStateHandleController;
    }

    public static void e(final h0.x.a aVar, final Lifecycle lifecycle) {
        Lifecycle.State state = ((r) lifecycle).c;
        if (state == Lifecycle.State.INITIALIZED || state.isAtLeast(Lifecycle.State.STARTED)) {
            aVar.c(a.class);
        } else {
            lifecycle.a(new n() {
                public void a(p pVar, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_START) {
                        r rVar = (r) Lifecycle.this;
                        rVar.d("removeObserver");
                        rVar.b.k(this);
                        aVar.c(a.class);
                    }
                }
            });
        }
    }

    public void a(p pVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.d = false;
            r rVar = (r) pVar.getLifecycle();
            rVar.d("removeObserver");
            rVar.b.k(this);
        }
    }

    public void c(h0.x.a aVar, Lifecycle lifecycle) {
        if (!this.d) {
            this.d = true;
            lifecycle.a(this);
            aVar.b(this.c, this.q.e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }
}
