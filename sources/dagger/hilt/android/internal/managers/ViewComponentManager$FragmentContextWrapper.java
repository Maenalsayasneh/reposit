package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import h0.q.n;
import h0.q.p;
import java.util.Objects;

public final class ViewComponentManager$FragmentContextWrapper extends ContextWrapper {
    public Fragment a;
    public LayoutInflater b;
    public LayoutInflater c;
    public final n d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewComponentManager$FragmentContextWrapper(Context context, Fragment fragment) {
        super(context);
        Objects.requireNonNull(context);
        AnonymousClass1 r2 = new n() {
            public void a(p pVar, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ViewComponentManager$FragmentContextWrapper viewComponentManager$FragmentContextWrapper = ViewComponentManager$FragmentContextWrapper.this;
                    viewComponentManager$FragmentContextWrapper.a = null;
                    viewComponentManager$FragmentContextWrapper.b = null;
                    viewComponentManager$FragmentContextWrapper.c = null;
                }
            }
        };
        this.d = r2;
        this.b = null;
        Objects.requireNonNull(fragment);
        this.a = fragment;
        fragment.getLifecycle().a(r2);
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            if (this.b == null) {
                this.b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.c = this.b.cloneInContext(this);
        }
        return this.c;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ViewComponentManager$FragmentContextWrapper(android.view.LayoutInflater r2, androidx.fragment.app.Fragment r3) {
        /*
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            android.content.Context r0 = r2.getContext()
            java.util.Objects.requireNonNull(r0)
            r1.<init>(r0)
            dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1 r0 = new dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
            r0.<init>()
            r1.d = r0
            r1.b = r2
            java.util.Objects.requireNonNull(r3)
            r1.a = r3
            androidx.lifecycle.Lifecycle r2 = r3.getLifecycle()
            r2.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper.<init>(android.view.LayoutInflater, androidx.fragment.app.Fragment):void");
    }
}
