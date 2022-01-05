package com.instabug.bug.view.i.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.instabug.bug.R;
import com.instabug.library.core.ui.InstabugBaseFragment;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.b.t.j.a.a;
import i0.j.b.t.j.a.e;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: VisualUserStepPreviewFragment */
public class c extends InstabugBaseFragment<e> implements View.OnClickListener, a {
    public static final /* synthetic */ int c = 0;
    public ProgressBar Y1;
    public i0.j.b.t.e d;
    public String q;
    public String x;
    public ImageView y;

    public void Q(Bitmap bitmap) {
        this.y.setVisibility(0);
        this.y.setImageBitmap(bitmap);
    }

    public int getLayout() {
        return R.layout.ibg_bug_fragment_repro_step_preview;
    }

    public void h() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
        r6 = (i0.j.b.t.j.a.e) r4.presenter;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initViews(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            r5.setOnClickListener(r4)
            int r5 = com.instabug.bug.R.id.step_preview
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r4.y = r5
            int r5 = com.instabug.bug.R.id.step_preview_prgressbar
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ProgressBar r5 = (android.widget.ProgressBar) r5
            r4.Y1 = r5
            android.widget.ImageView r5 = r4.y
            r6 = 4
            r5.setVisibility(r6)
            android.os.Bundle r5 = r4.getArguments()
            if (r5 == 0) goto L_0x007f
            P r5 = r4.presenter
            if (r5 == 0) goto L_0x007f
            android.os.Bundle r5 = r4.getArguments()
            java.lang.String r6 = "uri"
            java.lang.String r5 = r5.getString(r6)
            if (r5 == 0) goto L_0x007f
            P r6 = r4.presenter
            i0.j.b.t.j.a.e r6 = (i0.j.b.t.j.a.e) r6
            java.lang.ref.WeakReference<V> r0 = r6.view
            if (r0 == 0) goto L_0x007f
            java.lang.Object r0 = r0.get()
            i0.j.b.t.j.a.a r0 = (i0.j.b.t.j.a.a) r0
            if (r0 == 0) goto L_0x007f
            r1 = 1
            r0.j(r1)
            i0.j.b.t.j.a.d r1 = new i0.j.b.t.j.a.d
            r1.<init>(r5)
            k0.b.z.e.c.h r5 = new k0.b.z.e.c.h
            r5.<init>(r1)
            k0.b.l r5 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r5)
            k0.b.q r1 = k0.b.d0.a.b()
            k0.b.l r5 = r5.v(r1)
            k0.b.q r1 = k0.b.v.a.a.a()
            k0.b.l r5 = r5.s(r1)
            i0.j.b.t.j.a.c r1 = new i0.j.b.t.j.a.c
            r1.<init>(r0)
            k0.b.y.d<java.lang.Object> r2 = k0.b.z.b.a.d
            k0.b.y.a r3 = k0.b.z.b.a.c
            k0.b.l r5 = r5.f(r2, r1, r3, r3)
            i0.j.b.t.j.a.b r1 = new i0.j.b.t.j.a.b
            r1.<init>(r0)
            k0.b.y.d<java.lang.Throwable> r0 = k0.b.z.b.a.e
            k0.b.w.a r5 = r5.t(r1, r0, r3, r2)
            r6.c = r5
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.view.i.b.c.initViews(android.view.View, android.os.Bundle):void");
    }

    public void j(boolean z) {
        this.Y1.setVisibility(z ? 0 : 4);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (getActivity() instanceof i0.j.b.t.e) {
            try {
                this.d = (i0.j.b.t.e) getActivity();
            } catch (Exception unused) {
                throw new RuntimeException("Must implement BugReportingActivityCallBack");
            }
        }
    }

    public void onClick(View view) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        this.presenter = new e(this);
        if (getArguments() != null) {
            this.q = getArguments().getString(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        }
        i0.j.b.t.e eVar = this.d;
        if (eVar != null) {
            this.x = eVar.l();
            String str = this.q;
            if (str != null) {
                this.d.f(str);
            }
            this.d.z();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = (i0.j.b.t.j.a.e) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r2 = this;
            i0.j.b.t.e r0 = r2.d
            if (r0 == 0) goto L_0x0022
            P r0 = r2.presenter
            if (r0 == 0) goto L_0x0019
            i0.j.b.t.j.a.e r0 = (i0.j.b.t.j.a.e) r0
            k0.b.w.a r1 = r0.c
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.isDisposed()
            if (r1 != 0) goto L_0x0019
            k0.b.w.a r0 = r0.c
            r0.dispose()
        L_0x0019:
            java.lang.String r0 = r2.x
            if (r0 == 0) goto L_0x0022
            i0.j.b.t.e r1 = r2.d
            r1.f(r0)
        L_0x0022:
            super.onDestroy()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.view.i.b.c.onDestroy():void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332 && getActivity() != null) {
            getActivity().onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
