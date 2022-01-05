package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import h0.f.a;
import i0.h.a.b.c.g.j.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class zzc extends Fragment implements h {
    public Map<String, LifecycleCallback> c = Collections.synchronizedMap(new a());

    static {
        new WeakHashMap();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.c.values()) {
            a.a();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback b : this.c.values()) {
            b.b();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        for (Map.Entry next : this.c.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) next.getValue();
            if (bundle != null) {
                bundle.getBundle((String) next.getKey());
            }
            lifecycleCallback.c();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        for (LifecycleCallback requireNonNull : this.c.values()) {
            Objects.requireNonNull(requireNonNull);
        }
    }

    public final void onResume() {
        super.onResume();
        for (LifecycleCallback requireNonNull : this.c.values()) {
            Objects.requireNonNull(requireNonNull);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.c.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).d();
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        for (LifecycleCallback requireNonNull : this.c.values()) {
            Objects.requireNonNull(requireNonNull);
        }
    }

    public final void onStop() {
        super.onStop();
        for (LifecycleCallback requireNonNull : this.c.values()) {
            Objects.requireNonNull(requireNonNull);
        }
    }
}
