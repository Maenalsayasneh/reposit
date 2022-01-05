package h0.b.a;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import h0.b.e.a;
import h0.f.c;
import h0.i.i.g;
import java.lang.ref.WeakReference;

/* compiled from: AppCompatDialog */
public class m extends Dialog implements f {
    public g c;
    public final g.a d;

    /* compiled from: AppCompatDialog */
    public class a implements g.a {
        public a() {
        }

        public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
            return m.this.b(keyEvent);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            if (r6 != 0) goto L_0x0014
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            int r3 = androidx.appcompat.R.attr.dialogTheme
            r2.resolveAttribute(r3, r1, r0)
            int r1 = r1.resourceId
            goto L_0x0015
        L_0x0014:
            r1 = r6
        L_0x0015:
            r4.<init>(r5, r1)
            h0.b.a.m$a r1 = new h0.b.a.m$a
            r1.<init>()
            r4.d = r1
            h0.b.a.g r1 = r4.a()
            if (r6 != 0) goto L_0x0035
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            int r2 = androidx.appcompat.R.attr.dialogTheme
            r5.resolveAttribute(r2, r6, r0)
            int r6 = r6.resourceId
        L_0x0035:
            r1.z(r6)
            r5 = 0
            r1.m(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.a.m.<init>(android.content.Context, int):void");
    }

    public g a() {
        if (this.c == null) {
            c<WeakReference<g>> cVar = g.c;
            this.c = new h(getContext(), getWindow(), this, this);
        }
        return this.c;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    public boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean c(int i) {
        return a().u(i);
    }

    public void dismiss() {
        super.dismiss();
        a().n();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return g.b(this.d, getWindow().getDecorView(), this, keyEvent);
    }

    public <T extends View> T findViewById(int i) {
        return a().e(i);
    }

    public void invalidateOptionsMenu() {
        a().k();
    }

    public void onCreate(Bundle bundle) {
        a().j();
        super.onCreate(bundle);
        a().m(bundle);
    }

    public void onStop() {
        super.onStop();
        a().s();
    }

    public void onSupportActionModeFinished(h0.b.e.a aVar) {
    }

    public void onSupportActionModeStarted(h0.b.e.a aVar) {
    }

    public h0.b.e.a onWindowStartingSupportActionMode(a.C0017a aVar) {
        return null;
    }

    public void setContentView(int i) {
        a().v(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().A(charSequence);
    }

    public void setContentView(View view) {
        a().w(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().x(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        a().A(getContext().getString(i));
    }
}
