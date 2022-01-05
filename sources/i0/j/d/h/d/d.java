package i0.j.d.h.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.ui.custom.SnackbarLayout;
import com.instabug.library.settings.SettingsManager;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import h0.i.i.a0;
import h0.i.i.q;
import h0.i.i.y;
import h0.k.a.e;
import i0.j.d.h.d.j;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressFBWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE"})
/* compiled from: InstaToast */
public final class d {
    public static final Interpolator a = new h0.p.a.a.b();
    public static final Handler b = new Handler(Looper.getMainLooper(), new a());
    public final ViewGroup c;
    public final Context d;
    public final SnackbarLayout e;
    public int f;
    public final j.b g = new b();

    /* compiled from: InstaToast */
    public static class a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            int i = message.what;
            boolean z = false;
            if (i == 0) {
                d dVar = (d) message.obj;
                if (dVar.e.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = dVar.e.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        b bVar = new b(dVar.g);
                        bVar.f = SwipeDismissBehavior.C(0.0f, 0.1f, 1.0f);
                        bVar.g = SwipeDismissBehavior.C(0.0f, 0.6f, 1.0f);
                        bVar.d = 0;
                        bVar.b = new f(dVar);
                        ((CoordinatorLayout.f) layoutParams).b(bVar);
                    }
                    dVar.c.addView(dVar.e);
                }
                dVar.e.setOnAttachStateChangeListener(new h(dVar));
                SnackbarLayout snackbarLayout = dVar.e;
                AtomicInteger atomicInteger = q.a;
                if (snackbarLayout.isLaidOut()) {
                    dVar.c();
                } else {
                    dVar.e.setOnLayoutChangeListener(new i(dVar));
                }
                return true;
            } else if (i != 1) {
                return false;
            } else {
                d dVar2 = (d) message.obj;
                int i2 = message.arg1;
                if (dVar2.e.getVisibility() == 0) {
                    ViewGroup.LayoutParams layoutParams2 = dVar2.e.getLayoutParams();
                    if (layoutParams2 instanceof CoordinatorLayout.f) {
                        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams2).a;
                        if (cVar instanceof SwipeDismissBehavior) {
                            e eVar = ((SwipeDismissBehavior) cVar).a;
                            if ((eVar != null ? eVar.b : 0) != 0) {
                                z = true;
                            }
                        }
                    }
                    if (!z) {
                        y b = q.b(dVar2.e);
                        b.j((float) (-dVar2.e.getHeight()));
                        b.d(d.a);
                        b.c(250);
                        c cVar2 = new c(dVar2, i2);
                        View view = (View) b.a.get();
                        if (view != null) {
                            b.f(view, cVar2);
                        }
                        b.i();
                        return true;
                    }
                }
                dVar2.d(i2);
                return true;
            }
        }
    }

    /* compiled from: InstaToast */
    public class b implements j.b {
        public b() {
        }

        public void a() {
            Handler handler = d.b;
            handler.sendMessage(handler.obtainMessage(0, d.this));
        }

        public void e(int i) {
            Handler handler = d.b;
            handler.sendMessage(handler.obtainMessage(1, i, 0, d.this));
        }
    }

    /* compiled from: InstaToast */
    public class c extends a0 {
        public c() {
        }

        public void b(View view) {
            Objects.requireNonNull(d.this);
            j.a().f(d.this.g);
        }

        public void c(View view) {
            SnackbarLayout snackbarLayout = d.this.e;
            TextView textView = snackbarLayout.c;
            AtomicInteger atomicInteger = q.a;
            textView.setAlpha(0.0f);
            y b = q.b(snackbarLayout.c);
            b.a(1.0f);
            long j = (long) SettingsManager.MAX_ASR_DURATION_IN_SECONDS;
            b.c(j);
            long j2 = (long) 70;
            b.g(j2);
            b.i();
            if (snackbarLayout.d.getVisibility() == 0) {
                snackbarLayout.d.setAlpha(0.0f);
                y b2 = q.b(snackbarLayout.d);
                b2.a(1.0f);
                b2.c(j);
                b2.g(j2);
                b2.i();
            }
        }
    }

    public d(ViewGroup viewGroup) {
        this.c = viewGroup;
        Context context = viewGroup.getContext();
        this.d = context;
        this.e = (SnackbarLayout) LayoutInflater.from(context).inflate(R.layout.ib_fr_insta_toast_layout, viewGroup, false);
    }

    public final Drawable a(Drawable drawable, int i) {
        boolean z;
        Bitmap bitmap;
        if (!(drawable.getIntrinsicWidth() == i && drawable.getIntrinsicHeight() == i) && ((z = drawable instanceof BitmapDrawable))) {
            Resources resources = this.d.getResources();
            if (z) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            } else if (drawable instanceof VectorDrawable) {
                VectorDrawable vectorDrawable = (VectorDrawable) drawable;
                Bitmap createBitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                vectorDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                vectorDrawable.draw(canvas);
                bitmap = createBitmap;
            } else {
                throw new IllegalArgumentException("unsupported drawable type");
            }
            drawable = new BitmapDrawable(resources, Bitmap.createScaledBitmap(bitmap, i, i, true));
        }
        drawable.setBounds(0, 0, i, i);
        return drawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r5) {
        /*
            r4 = this;
            i0.j.d.h.d.j r0 = i0.j.d.h.d.j.a()
            i0.j.d.h.d.j$b r1 = r4.g
            java.lang.Object r2 = r0.b
            monitor-enter(r2)
            i0.j.d.h.d.j$c r3 = r0.d     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x002b
            i0.j.d.h.d.j$c r3 = r0.e     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x0012
            goto L_0x002b
        L_0x0012:
            boolean r3 = r0.h(r1)     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x001e
            i0.j.d.h.d.j$c r1 = r0.d     // Catch:{ all -> 0x002d }
            r0.c(r1, r5)     // Catch:{ all -> 0x002d }
            goto L_0x0029
        L_0x001e:
            boolean r1 = r0.i(r1)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0029
            i0.j.d.h.d.j$c r1 = r0.e     // Catch:{ all -> 0x002d }
            r0.c(r1, r5)     // Catch:{ all -> 0x002d }
        L_0x0029:
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            goto L_0x002c
        L_0x002b:
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
        L_0x002c:
            return
        L_0x002d:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.d.h.d.d.b(int):void");
    }

    public final void c() {
        SnackbarLayout snackbarLayout = this.e;
        AtomicInteger atomicInteger = q.a;
        snackbarLayout.setTranslationY((float) (-snackbarLayout.getHeight()));
        y b2 = q.b(this.e);
        b2.j(0.0f);
        b2.d(a);
        b2.c(250);
        c cVar = new c();
        View view = (View) b2.a.get();
        if (view != null) {
            b2.f(view, cVar);
        }
        b2.i();
    }

    public final void d(int i) {
        j a2 = j.a();
        j.b bVar = this.g;
        synchronized (a2.b) {
            if (a2.h(bVar)) {
                a2.d = null;
                if (a2.e != null) {
                    a2.d();
                }
            }
        }
        ViewParent parent = this.e.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.e);
        }
    }
}
