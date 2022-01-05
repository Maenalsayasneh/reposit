package h0.b.a;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.NavUtils;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import h0.b.a.q;
import h0.b.e.a;
import h0.b.e.e;
import h0.b.e.i.g;
import h0.b.e.i.m;
import h0.b.f.c1;
import h0.b.f.w0;
import h0.b.f.z;
import h0.i.i.a0;
import h0.i.i.d0;
import h0.i.i.q;
import h0.i.i.y;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AppCompatDelegateImpl */
public class h extends g implements g.a, LayoutInflater.Factory2 {
    public static final boolean Y1 = true;
    public static final h0.f.h<String, Integer> q = new h0.f.h<>();
    public static final int[] x = {16842836};
    public static final boolean y = (!"robolectric".equals(Build.FINGERPRINT));
    public boolean A2;
    public j[] B2;
    public j C2;
    public boolean D2;
    public boolean E2;
    public boolean F2;
    public boolean G2;
    public boolean H2;
    public int I2 = -100;
    public int J2;
    public boolean K2;
    public boolean L2;
    public g M2;
    public g N2;
    public boolean O2;
    public int P2;
    public final Runnable Q2 = new a();
    public boolean R2;
    public Rect S2;
    public Rect T2;
    public n U2;
    public final Object Z1;
    public final Context a2;
    public Window b2;
    public e c2;
    public final f d2;
    public a e2;
    public MenuInflater f2;
    public CharSequence g2;
    public z h2;
    public c i2;
    public k j2;
    public h0.b.e.a k2;
    public ActionBarContextView l2;
    public PopupWindow m2;
    public Runnable n2;
    public y o2 = null;
    public boolean p2;
    public ViewGroup q2;
    public TextView r2;
    public View s2;
    public boolean t2;
    public boolean u2;
    public boolean v2;
    public boolean w2;
    public boolean x2;
    public boolean y2;
    public boolean z2;

    /* compiled from: AppCompatDelegateImpl */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            h hVar = h.this;
            if ((hVar.P2 & 1) != 0) {
                hVar.K(0);
            }
            h hVar2 = h.this;
            if ((hVar2.P2 & 4096) != 0) {
                hVar2.K(108);
            }
            h hVar3 = h.this;
            hVar3.O2 = false;
            hVar3.P2 = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public class b implements b {
        public b(h hVar) {
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public final class c implements m.a {
        public c() {
        }

        public void c(h0.b.e.i.g gVar, boolean z) {
            h.this.G(gVar);
        }

        public boolean d(h0.b.e.i.g gVar) {
            Window.Callback R = h.this.R();
            if (R == null) {
                return true;
            }
            R.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public class d implements a.C0017a {
        public a.C0017a a;

        /* compiled from: AppCompatDelegateImpl */
        public class a extends a0 {
            public a() {
            }

            public void b(View view) {
                h.this.l2.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.m2;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.l2.getParent() instanceof View) {
                    AtomicInteger atomicInteger = q.a;
                    ((View) h.this.l2.getParent()).requestApplyInsets();
                }
                h.this.l2.h();
                h.this.o2.e((h0.i.i.z) null);
                h hVar2 = h.this;
                hVar2.o2 = null;
                ViewGroup viewGroup = hVar2.q2;
                AtomicInteger atomicInteger2 = q.a;
                viewGroup.requestApplyInsets();
            }
        }

        public d(a.C0017a aVar) {
            this.a = aVar;
        }

        public void a(h0.b.e.a aVar) {
            this.a.a(aVar);
            h hVar = h.this;
            if (hVar.m2 != null) {
                hVar.b2.getDecorView().removeCallbacks(h.this.n2);
            }
            h hVar2 = h.this;
            if (hVar2.l2 != null) {
                hVar2.L();
                h hVar3 = h.this;
                y b2 = q.b(hVar3.l2);
                b2.a(0.0f);
                hVar3.o2 = b2;
                y yVar = h.this.o2;
                a aVar2 = new a();
                View view = (View) yVar.a.get();
                if (view != null) {
                    yVar.f(view, aVar2);
                }
            }
            h hVar4 = h.this;
            f fVar = hVar4.d2;
            if (fVar != null) {
                fVar.onSupportActionModeFinished(hVar4.k2);
            }
            h hVar5 = h.this;
            hVar5.k2 = null;
            ViewGroup viewGroup = hVar5.q2;
            AtomicInteger atomicInteger = q.a;
            viewGroup.requestApplyInsets();
        }

        public boolean b(h0.b.e.a aVar, Menu menu) {
            return this.a.b(aVar, menu);
        }

        public boolean c(h0.b.e.a aVar, Menu menu) {
            ViewGroup viewGroup = h.this.q2;
            AtomicInteger atomicInteger = q.a;
            viewGroup.requestApplyInsets();
            return this.a.c(aVar, menu);
        }

        public boolean d(h0.b.e.a aVar, MenuItem menuItem) {
            return this.a.d(aVar, menuItem);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public class e extends h0.b.e.h {
        public e(Window.Callback callback) {
            super(callback);
        }

        public final ActionMode a(ActionMode.Callback callback) {
            e.a aVar = new e.a(h.this.a2, callback);
            h0.b.e.a B = h.this.B(aVar);
            if (B != null) {
                return aVar.e(B);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.J(keyEvent) || this.c.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
            if (r6 != false) goto L_0x001d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                android.view.Window$Callback r0 = r5.c
                boolean r0 = r0.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x004f
                h0.b.a.h r0 = h0.b.a.h.this
                int r3 = r6.getKeyCode()
                r0.S()
                h0.b.a.a r4 = r0.e2
                if (r4 == 0) goto L_0x001f
                boolean r3 = r4.j(r3, r6)
                if (r3 == 0) goto L_0x001f
            L_0x001d:
                r6 = r2
                goto L_0x004d
            L_0x001f:
                h0.b.a.h$j r3 = r0.C2
                if (r3 == 0) goto L_0x0034
                int r4 = r6.getKeyCode()
                boolean r3 = r0.W(r3, r4, r6, r2)
                if (r3 == 0) goto L_0x0034
                h0.b.a.h$j r6 = r0.C2
                if (r6 == 0) goto L_0x001d
                r6.l = r2
                goto L_0x001d
            L_0x0034:
                h0.b.a.h$j r3 = r0.C2
                if (r3 != 0) goto L_0x004c
                h0.b.a.h$j r3 = r0.Q(r1)
                r0.X(r3, r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.W(r3, r4, r6, r2)
                r3.k = r1
                if (r6 == 0) goto L_0x004c
                goto L_0x001d
            L_0x004c:
                r6 = r1
            L_0x004d:
                if (r6 == 0) goto L_0x0050
            L_0x004f:
                r1 = r2
            L_0x0050:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.b.a.h.e.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof h0.b.e.i.g)) {
                return this.c.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            this.c.onMenuOpened(i, menu);
            h hVar = h.this;
            Objects.requireNonNull(hVar);
            if (i == 108) {
                hVar.S();
                a aVar = hVar.e2;
                if (aVar != null) {
                    aVar.c(true);
                }
            }
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            this.c.onPanelClosed(i, menu);
            h hVar = h.this;
            Objects.requireNonNull(hVar);
            if (i == 108) {
                hVar.S();
                a aVar = hVar.e2;
                if (aVar != null) {
                    aVar.c(false);
                }
            } else if (i == 0) {
                j Q = hVar.Q(i);
                if (Q.m) {
                    hVar.H(Q, false);
                }
            }
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            h0.b.e.i.g gVar = menu instanceof h0.b.e.i.g ? (h0.b.e.i.g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.y = true;
            }
            boolean onPreparePanel = this.c.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.y = false;
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            h0.b.e.i.g gVar = h.this.Q(0).h;
            if (gVar != null) {
                this.c.onProvideKeyboardShortcuts(list, gVar, i);
            } else {
                this.c.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            Objects.requireNonNull(h.this);
            if (i != 0) {
                return this.c.onWindowStartingActionMode(callback, i);
            }
            return a(callback);
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public class f extends g {
        public final PowerManager c;

        public f(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            return this.c.isPowerSaveMode() ? 2 : 1;
        }

        public void d() {
            h.this.C();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public abstract class g {
        public BroadcastReceiver a;

        /* compiled from: AppCompatDelegateImpl */
        public class a extends BroadcastReceiver {
            public a() {
            }

            public void onReceive(Context context, Intent intent) {
                g.this.d();
            }
        }

        public g() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    h.this.a2.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 != null && b2.countActions() != 0) {
                if (this.a == null) {
                    this.a = new a();
                }
                h.this.a2.registerReceiver(this.a, b2);
            }
        }
    }

    /* renamed from: h0.b.a.h$h  reason: collision with other inner class name */
    /* compiled from: AppCompatDelegateImpl */
    public class C0016h extends g {
        public final q c;

        public C0016h(q qVar) {
            super();
            this.c = qVar;
        }

        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public int c() {
            boolean z;
            long j;
            q qVar = this.c;
            q.a aVar = qVar.d;
            if (aVar.b > System.currentTimeMillis()) {
                z = aVar.a;
            } else {
                Location location = null;
                Location a = g0.a.b.b.a.n(qVar.b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? qVar.a(SDKCoreEvent.Network.TYPE_NETWORK) : null;
                if (g0.a.b.b.a.n(qVar.b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    location = qVar.a("gps");
                }
                if (location == null || a == null ? location != null : location.getTime() > a.getTime()) {
                    a = location;
                }
                if (a != null) {
                    q.a aVar2 = qVar.d;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (p.a == null) {
                        p.a = new p();
                    }
                    p pVar = p.a;
                    pVar.a(currentTimeMillis - 86400000, a.getLatitude(), a.getLongitude());
                    p pVar2 = pVar;
                    pVar.a(currentTimeMillis, a.getLatitude(), a.getLongitude());
                    boolean z2 = pVar2.d == 1;
                    long j2 = pVar2.c;
                    long j3 = pVar2.b;
                    pVar2.a(currentTimeMillis + 86400000, a.getLatitude(), a.getLongitude());
                    long j4 = pVar2.c;
                    if (j2 == -1 || j3 == -1) {
                        j = currentTimeMillis + 43200000;
                    } else {
                        j = (currentTimeMillis > j3 ? j4 + 0 : currentTimeMillis > j2 ? j3 + 0 : j2 + 0) + 60000;
                    }
                    aVar2.a = z2;
                    aVar2.b = j;
                    z = aVar.a;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    z = i < 6 || i >= 22;
                }
            }
            if (z) {
                return 2;
            }
            return 1;
        }

        public void d() {
            h.this.C();
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public class i extends ContentFrameLayout {
        public i(Context context) {
            super(context, (AttributeSet) null);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.J(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    h hVar = h.this;
                    hVar.H(hVar.Q(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(h0.b.b.a.a.a(getContext(), i));
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public static final class j {
        public int a;
        public int b;
        public int c;
        public int d;
        public ViewGroup e;
        public View f;
        public View g;
        public h0.b.e.i.g h;
        public h0.b.e.i.e i;
        public Context j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o = false;
        public boolean p;
        public Bundle q;

        public j(int i2) {
            this.a = i2;
        }

        public void a(h0.b.e.i.g gVar) {
            h0.b.e.i.e eVar;
            h0.b.e.i.g gVar2 = this.h;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.u(this.i);
                }
                this.h = gVar;
                if (gVar != null && (eVar = this.i) != null) {
                    gVar.b(eVar, gVar.b);
                }
            }
        }
    }

    /* compiled from: AppCompatDelegateImpl */
    public final class k implements m.a {
        public k() {
        }

        public void c(h0.b.e.i.g gVar, boolean z) {
            h0.b.e.i.g k = gVar.k();
            boolean z2 = k != gVar;
            h hVar = h.this;
            if (z2) {
                gVar = k;
            }
            j O = hVar.O(gVar);
            if (O == null) {
                return;
            }
            if (z2) {
                h.this.F(O.a, O, k);
                h.this.H(O, true);
                return;
            }
            h.this.H(O, z);
        }

        public boolean d(h0.b.e.i.g gVar) {
            Window.Callback R;
            if (gVar != gVar.k()) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.v2 || (R = hVar.R()) == null || h.this.H2) {
                return true;
            }
            R.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r4 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(android.content.Context r4, android.view.Window r5, h0.b.a.f r6, java.lang.Object r7) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.o2 = r0
            r1 = -100
            r3.I2 = r1
            h0.b.a.h$a r2 = new h0.b.a.h$a
            r2.<init>()
            r3.Q2 = r2
            r3.a2 = r4
            r3.d2 = r6
            r3.Z1 = r7
            boolean r6 = r7 instanceof android.app.Dialog
            if (r6 == 0) goto L_0x003c
        L_0x001b:
            if (r4 == 0) goto L_0x002f
            boolean r6 = r4 instanceof h0.b.a.e
            if (r6 == 0) goto L_0x0024
            h0.b.a.e r4 = (h0.b.a.e) r4
            goto L_0x0030
        L_0x0024:
            boolean r6 = r4 instanceof android.content.ContextWrapper
            if (r6 == 0) goto L_0x002f
            android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
            android.content.Context r4 = r4.getBaseContext()
            goto L_0x001b
        L_0x002f:
            r4 = r0
        L_0x0030:
            if (r4 == 0) goto L_0x003c
            h0.b.a.g r4 = r4.getDelegate()
            int r4 = r4.g()
            r3.I2 = r4
        L_0x003c:
            int r4 = r3.I2
            if (r4 != r1) goto L_0x0067
            h0.f.h<java.lang.String, java.lang.Integer> r4 = q
            java.lang.Object r6 = r3.Z1
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.Object r6 = r4.getOrDefault(r6, r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x0067
            int r6 = r6.intValue()
            r3.I2 = r6
            java.lang.Object r6 = r3.Z1
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4.remove(r6)
        L_0x0067:
            if (r5 == 0) goto L_0x006c
            r3.E(r5)
        L_0x006c:
            h0.b.f.j.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.a.h.<init>(android.content.Context, android.view.Window, h0.b.a.f, java.lang.Object):void");
    }

    public final void A(CharSequence charSequence) {
        this.g2 = charSequence;
        z zVar = this.h2;
        if (zVar != null) {
            zVar.setWindowTitle(charSequence);
            return;
        }
        a aVar = this.e2;
        if (aVar != null) {
            aVar.v(charSequence);
            return;
        }
        TextView textView = this.r2;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h0.b.e.a B(h0.b.e.a.C0017a r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x01aa
            h0.b.e.a r0 = r7.k2
            if (r0 == 0) goto L_0x0009
            r0.c()
        L_0x0009:
            h0.b.a.h$d r0 = new h0.b.a.h$d
            r0.<init>(r8)
            r7.S()
            h0.b.a.a r8 = r7.e2
            if (r8 == 0) goto L_0x0024
            h0.b.e.a r8 = r8.x(r0)
            r7.k2 = r8
            if (r8 == 0) goto L_0x0024
            h0.b.a.f r1 = r7.d2
            if (r1 == 0) goto L_0x0024
            r1.onSupportActionModeStarted(r8)
        L_0x0024:
            h0.b.e.a r8 = r7.k2
            if (r8 != 0) goto L_0x01a7
            r7.L()
            h0.b.e.a r8 = r7.k2
            if (r8 == 0) goto L_0x0032
            r8.c()
        L_0x0032:
            h0.b.a.f r8 = r7.d2
            r1 = 0
            if (r8 == 0) goto L_0x0040
            boolean r2 = r7.H2
            if (r2 != 0) goto L_0x0040
            h0.b.e.a r8 = r8.onWindowStartingSupportActionMode(r0)     // Catch:{ AbstractMethodError -> 0x0040 }
            goto L_0x0041
        L_0x0040:
            r8 = r1
        L_0x0041:
            if (r8 == 0) goto L_0x0047
            r7.k2 = r8
            goto L_0x0198
        L_0x0047:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.l2
            r2 = 0
            r3 = 1
            if (r8 != 0) goto L_0x00ff
            boolean r8 = r7.y2
            if (r8 == 0) goto L_0x00d3
            android.util.TypedValue r8 = new android.util.TypedValue
            r8.<init>()
            android.content.Context r4 = r7.a2
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = androidx.appcompat.R.attr.actionBarTheme
            r4.resolveAttribute(r5, r8, r3)
            int r5 = r8.resourceId
            if (r5 == 0) goto L_0x0086
            android.content.Context r5 = r7.a2
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r8.resourceId
            r5.applyStyle(r4, r3)
            h0.b.e.c r4 = new h0.b.e.c
            android.content.Context r6 = r7.a2
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x0088
        L_0x0086:
            android.content.Context r4 = r7.a2
        L_0x0088:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4, r1)
            r7.l2 = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = androidx.appcompat.R.attr.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.m2 = r5
            r6 = 2
            r5.setWindowLayoutType(r6)
            android.widget.PopupWindow r5 = r7.m2
            androidx.appcompat.widget.ActionBarContextView r6 = r7.l2
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.m2
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = androidx.appcompat.R.attr.actionBarSize
            r5.resolveAttribute(r6, r8, r3)
            int r8 = r8.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r8 = android.util.TypedValue.complexToDimensionPixelSize(r8, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.l2
            r4.setContentHeight(r8)
            android.widget.PopupWindow r8 = r7.m2
            r4 = -2
            r8.setHeight(r4)
            h0.b.a.k r8 = new h0.b.a.k
            r8.<init>(r7)
            r7.n2 = r8
            goto L_0x00ff
        L_0x00d3:
            android.view.ViewGroup r8 = r7.q2
            int r4 = androidx.appcompat.R.id.action_mode_bar_stub
            android.view.View r8 = r8.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r8 = (androidx.appcompat.widget.ViewStubCompat) r8
            if (r8 == 0) goto L_0x00ff
            r7.S()
            h0.b.a.a r4 = r7.e2
            if (r4 == 0) goto L_0x00eb
            android.content.Context r4 = r4.e()
            goto L_0x00ec
        L_0x00eb:
            r4 = r1
        L_0x00ec:
            if (r4 != 0) goto L_0x00f0
            android.content.Context r4 = r7.a2
        L_0x00f0:
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r8.setLayoutInflater(r4)
            android.view.View r8 = r8.a()
            androidx.appcompat.widget.ActionBarContextView r8 = (androidx.appcompat.widget.ActionBarContextView) r8
            r7.l2 = r8
        L_0x00ff:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.l2
            if (r8 == 0) goto L_0x0198
            r7.L()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.l2
            r8.h()
            h0.b.e.d r8 = new h0.b.e.d
            androidx.appcompat.widget.ActionBarContextView r4 = r7.l2
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.l2
            android.widget.PopupWindow r6 = r7.m2
            if (r6 != 0) goto L_0x011a
            goto L_0x011b
        L_0x011a:
            r3 = r2
        L_0x011b:
            r8.<init>(r4, r5, r0, r3)
            h0.b.e.i.g r3 = r8.a2
            h0.b.e.a$a r0 = r0.a
            boolean r0 = r0.b(r8, r3)
            if (r0 == 0) goto L_0x0196
            r8.i()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.l2
            r0.f(r8)
            r7.k2 = r8
            boolean r8 = r7.Y()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x015e
            androidx.appcompat.widget.ActionBarContextView r8 = r7.l2
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.l2
            h0.i.i.y r8 = h0.i.i.q.b(r8)
            r8.a(r0)
            r7.o2 = r8
            h0.b.a.l r0 = new h0.b.a.l
            r0.<init>(r7)
            java.lang.ref.WeakReference<android.view.View> r1 = r8.a
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0186
            r8.f(r1, r0)
            goto L_0x0186
        L_0x015e:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.l2
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.l2
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.l2
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.l2
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0186
            androidx.appcompat.widget.ActionBarContextView r8 = r7.l2
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            java.util.concurrent.atomic.AtomicInteger r0 = h0.i.i.q.a
            r8.requestApplyInsets()
        L_0x0186:
            android.widget.PopupWindow r8 = r7.m2
            if (r8 == 0) goto L_0x0198
            android.view.Window r8 = r7.b2
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.n2
            r8.post(r0)
            goto L_0x0198
        L_0x0196:
            r7.k2 = r1
        L_0x0198:
            h0.b.e.a r8 = r7.k2
            if (r8 == 0) goto L_0x01a3
            h0.b.a.f r0 = r7.d2
            if (r0 == 0) goto L_0x01a3
            r0.onSupportActionModeStarted(r8)
        L_0x01a3:
            h0.b.e.a r8 = r7.k2
            r7.k2 = r8
        L_0x01a7:
            h0.b.e.a r8 = r7.k2
            return r8
        L_0x01aa:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ActionMode callback can not be null."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.a.h.B(h0.b.e.a$a):h0.b.e.a");
    }

    public boolean C() {
        return D(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean D(boolean r12) {
        /*
            r11 = this;
            boolean r0 = r11.H2
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r11.I2
            r2 = -100
            if (r0 == r2) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r2
        L_0x000e:
            android.content.Context r2 = r11.a2
            int r2 = r11.U(r2, r0)
            android.content.Context r3 = r11.a2
            r4 = 0
            android.content.res.Configuration r3 = r11.I(r3, r2, r4)
            boolean r5 = r11.L2
            r6 = 1
            if (r5 != 0) goto L_0x0064
            java.lang.Object r5 = r11.Z1
            boolean r5 = r5 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0064
            android.content.Context r5 = r11.a2
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            if (r5 != 0) goto L_0x0030
            r5 = r1
            goto L_0x0068
        L_0x0030:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x005a }
            r8 = 29
            if (r7 < r8) goto L_0x0039
            r7 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x003b
        L_0x0039:
            r7 = 786432(0xc0000, float:1.102026E-39)
        L_0x003b:
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x005a }
            android.content.Context r9 = r11.a2     // Catch:{ NameNotFoundException -> 0x005a }
            java.lang.Object r10 = r11.Z1     // Catch:{ NameNotFoundException -> 0x005a }
            java.lang.Class r10 = r10.getClass()     // Catch:{ NameNotFoundException -> 0x005a }
            r8.<init>(r9, r10)     // Catch:{ NameNotFoundException -> 0x005a }
            android.content.pm.ActivityInfo r5 = r5.getActivityInfo(r8, r7)     // Catch:{ NameNotFoundException -> 0x005a }
            if (r5 == 0) goto L_0x0056
            int r5 = r5.configChanges     // Catch:{ NameNotFoundException -> 0x005a }
            r5 = r5 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x0056
            r5 = r6
            goto L_0x0057
        L_0x0056:
            r5 = r1
        L_0x0057:
            r11.K2 = r5     // Catch:{ NameNotFoundException -> 0x005a }
            goto L_0x0064
        L_0x005a:
            r5 = move-exception
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r8 = "Exception while getting ActivityInfo"
            android.util.Log.d(r7, r8, r5)
            r11.K2 = r1
        L_0x0064:
            r11.L2 = r6
            boolean r5 = r11.K2
        L_0x0068:
            android.content.Context r7 = r11.a2
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.uiMode
            r7 = r7 & 48
            int r3 = r3.uiMode
            r3 = r3 & 48
            if (r7 == r3) goto L_0x00a2
            if (r12 == 0) goto L_0x00a2
            if (r5 != 0) goto L_0x00a2
            boolean r12 = r11.E2
            if (r12 == 0) goto L_0x00a2
            boolean r12 = y
            if (r12 != 0) goto L_0x008c
            boolean r12 = r11.F2
            if (r12 == 0) goto L_0x00a2
        L_0x008c:
            java.lang.Object r12 = r11.Z1
            boolean r8 = r12 instanceof android.app.Activity
            if (r8 == 0) goto L_0x00a2
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r12 = r12.isChild()
            if (r12 != 0) goto L_0x00a2
            java.lang.Object r12 = r11.Z1
            android.app.Activity r12 = (android.app.Activity) r12
            androidx.core.app.ActivityCompat.recreate(r12)
            r1 = r6
        L_0x00a2:
            if (r1 != 0) goto L_0x016f
            if (r7 == r3) goto L_0x016f
            android.content.Context r12 = r11.a2
            android.content.res.Resources r12 = r12.getResources()
            android.content.res.Configuration r1 = new android.content.res.Configuration
            android.content.res.Configuration r7 = r12.getConfiguration()
            r1.<init>(r7)
            android.content.res.Configuration r7 = r12.getConfiguration()
            int r7 = r7.uiMode
            r7 = r7 & -49
            r3 = r3 | r7
            r1.uiMode = r3
            r12.updateConfiguration(r1, r4)
            int r3 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r3 >= r7) goto L_0x012e
            r7 = 28
            if (r3 < r7) goto L_0x00ce
            goto L_0x012e
        L_0x00ce:
            boolean r3 = g0.a.b.b.a.h
            java.lang.String r7 = "ResourcesFlusher"
            if (r3 != 0) goto L_0x00ea
            java.lang.Class<android.content.res.Resources> r3 = android.content.res.Resources.class
            java.lang.String r8 = "mResourcesImpl"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x00e2 }
            g0.a.b.b.a.g = r3     // Catch:{ NoSuchFieldException -> 0x00e2 }
            r3.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x00e2 }
            goto L_0x00e8
        L_0x00e2:
            r3 = move-exception
            java.lang.String r8 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r7, r8, r3)
        L_0x00e8:
            g0.a.b.b.a.h = r6
        L_0x00ea:
            java.lang.reflect.Field r3 = g0.a.b.b.a.g
            if (r3 != 0) goto L_0x00ef
            goto L_0x012e
        L_0x00ef:
            java.lang.Object r12 = r3.get(r12)     // Catch:{ IllegalAccessException -> 0x00f4 }
            goto L_0x00fb
        L_0x00f4:
            r12 = move-exception
            java.lang.String r3 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r7, r3, r12)
            r12 = r4
        L_0x00fb:
            if (r12 != 0) goto L_0x00fe
            goto L_0x012e
        L_0x00fe:
            boolean r3 = g0.a.b.b.a.b
            if (r3 != 0) goto L_0x011a
            java.lang.Class r3 = r12.getClass()     // Catch:{ NoSuchFieldException -> 0x0112 }
            java.lang.String r8 = "mDrawableCache"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x0112 }
            g0.a.b.b.a.a = r3     // Catch:{ NoSuchFieldException -> 0x0112 }
            r3.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x0112 }
            goto L_0x0118
        L_0x0112:
            r3 = move-exception
            java.lang.String r8 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r7, r8, r3)
        L_0x0118:
            g0.a.b.b.a.b = r6
        L_0x011a:
            java.lang.reflect.Field r3 = g0.a.b.b.a.a
            if (r3 == 0) goto L_0x0129
            java.lang.Object r4 = r3.get(r12)     // Catch:{ IllegalAccessException -> 0x0123 }
            goto L_0x0129
        L_0x0123:
            r12 = move-exception
            java.lang.String r3 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r7, r3, r12)
        L_0x0129:
            if (r4 == 0) goto L_0x012e
            g0.a.b.b.a.I(r4)
        L_0x012e:
            int r12 = r11.J2
            if (r12 == 0) goto L_0x0142
            android.content.Context r3 = r11.a2
            r3.setTheme(r12)
            android.content.Context r12 = r11.a2
            android.content.res.Resources$Theme r12 = r12.getTheme()
            int r3 = r11.J2
            r12.applyStyle(r3, r6)
        L_0x0142:
            if (r5 == 0) goto L_0x0170
            java.lang.Object r12 = r11.Z1
            boolean r3 = r12 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0170
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r3 = r12 instanceof h0.q.p
            if (r3 == 0) goto L_0x0167
            r3 = r12
            h0.q.p r3 = (h0.q.p) r3
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycle()
            h0.q.r r3 = (h0.q.r) r3
            androidx.lifecycle.Lifecycle$State r3 = r3.c
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r3 = r3.isAtLeast(r4)
            if (r3 == 0) goto L_0x0170
            r12.onConfigurationChanged(r1)
            goto L_0x0170
        L_0x0167:
            boolean r3 = r11.G2
            if (r3 == 0) goto L_0x0170
            r12.onConfigurationChanged(r1)
            goto L_0x0170
        L_0x016f:
            r6 = r1
        L_0x0170:
            if (r6 == 0) goto L_0x017d
            java.lang.Object r12 = r11.Z1
            boolean r1 = r12 instanceof h0.b.a.e
            if (r1 == 0) goto L_0x017d
            h0.b.a.e r12 = (h0.b.a.e) r12
            r12.onNightModeChanged(r2)
        L_0x017d:
            if (r0 != 0) goto L_0x0189
            android.content.Context r12 = r11.a2
            h0.b.a.h$g r12 = r11.P(r12)
            r12.e()
            goto L_0x0190
        L_0x0189:
            h0.b.a.h$g r12 = r11.M2
            if (r12 == 0) goto L_0x0190
            r12.a()
        L_0x0190:
            r12 = 3
            if (r0 != r12) goto L_0x01a6
            android.content.Context r12 = r11.a2
            h0.b.a.h$g r0 = r11.N2
            if (r0 != 0) goto L_0x01a0
            h0.b.a.h$f r0 = new h0.b.a.h$f
            r0.<init>(r12)
            r11.N2 = r0
        L_0x01a0:
            h0.b.a.h$g r12 = r11.N2
            r12.e()
            goto L_0x01ad
        L_0x01a6:
            h0.b.a.h$g r12 = r11.N2
            if (r12 == 0) goto L_0x01ad
            r12.a()
        L_0x01ad:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.a.h.D(boolean):boolean");
    }

    public final void E(Window window) {
        if (this.b2 == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof e)) {
                e eVar = new e(callback);
                this.c2 = eVar;
                window.setCallback(eVar);
                w0 p = w0.p(this.a2, (AttributeSet) null, x);
                Drawable h = p.h(0);
                if (h != null) {
                    window.setBackgroundDrawable(h);
                }
                p.b.recycle();
                this.b2 = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public void F(int i3, j jVar, Menu menu) {
        if (menu == null && jVar != null) {
            menu = jVar.h;
        }
        if ((jVar == null || jVar.m) && !this.H2) {
            this.c2.c.onPanelClosed(i3, menu);
        }
    }

    public void G(h0.b.e.i.g gVar) {
        if (!this.A2) {
            this.A2 = true;
            this.h2.j();
            Window.Callback R = R();
            if (R != null && !this.H2) {
                R.onPanelClosed(108, gVar);
            }
            this.A2 = false;
        }
    }

    public void H(j jVar, boolean z) {
        ViewGroup viewGroup;
        z zVar;
        if (!z || jVar.a != 0 || (zVar = this.h2) == null || !zVar.b()) {
            WindowManager windowManager = (WindowManager) this.a2.getSystemService("window");
            if (!(windowManager == null || !jVar.m || (viewGroup = jVar.e) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    F(jVar.a, jVar, (Menu) null);
                }
            }
            jVar.k = false;
            jVar.l = false;
            jVar.m = false;
            jVar.f = null;
            jVar.o = true;
            if (this.C2 == jVar) {
                this.C2 = null;
                return;
            }
            return;
        }
        G(jVar.h);
    }

    public final Configuration I(Context context, int i3, Configuration configuration) {
        int i4 = i3 != 1 ? i3 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i4 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean J(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.Z1
            boolean r1 = r0 instanceof h0.i.i.g.a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof h0.b.a.m
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.b2
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = h0.i.i.g.a(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 82
            if (r0 != r1) goto L_0x002d
            h0.b.a.h$e r0 = r6.c2
            android.view.Window$Callback r0 = r0.c
            boolean r0 = r0.dispatchKeyEvent(r7)
            if (r0 == 0) goto L_0x002d
            return r2
        L_0x002d:
            int r0 = r7.getKeyCode()
            int r3 = r7.getAction()
            r4 = 0
            if (r3 != 0) goto L_0x003a
            r3 = r2
            goto L_0x003b
        L_0x003a:
            r3 = r4
        L_0x003b:
            r5 = 4
            if (r3 == 0) goto L_0x0065
            if (r0 == r5) goto L_0x0056
            if (r0 == r1) goto L_0x0043
            goto L_0x0062
        L_0x0043:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x011a
            h0.b.a.h$j r0 = r6.Q(r4)
            boolean r1 = r0.m
            if (r1 != 0) goto L_0x011a
            r6.X(r0, r7)
            goto L_0x011a
        L_0x0056:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r2 = r4
        L_0x0060:
            r6.D2 = r2
        L_0x0062:
            r2 = r4
            goto L_0x011a
        L_0x0065:
            if (r0 == r5) goto L_0x00ee
            if (r0 == r1) goto L_0x006a
            goto L_0x0062
        L_0x006a:
            h0.b.e.a r0 = r6.k2
            if (r0 == 0) goto L_0x0070
            goto L_0x011a
        L_0x0070:
            h0.b.a.h$j r0 = r6.Q(r4)
            h0.b.f.z r1 = r6.h2
            if (r1 == 0) goto L_0x00aa
            boolean r1 = r1.d()
            if (r1 == 0) goto L_0x00aa
            android.content.Context r1 = r6.a2
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00aa
            h0.b.f.z r1 = r6.h2
            boolean r1 = r1.b()
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r6.H2
            if (r1 != 0) goto L_0x00ca
            boolean r7 = r6.X(r0, r7)
            if (r7 == 0) goto L_0x00ca
            h0.b.f.z r7 = r6.h2
            boolean r7 = r7.h()
            goto L_0x00d0
        L_0x00a3:
            h0.b.f.z r7 = r6.h2
            boolean r7 = r7.g()
            goto L_0x00d0
        L_0x00aa:
            boolean r1 = r0.m
            if (r1 != 0) goto L_0x00cc
            boolean r3 = r0.l
            if (r3 == 0) goto L_0x00b3
            goto L_0x00cc
        L_0x00b3:
            boolean r1 = r0.k
            if (r1 == 0) goto L_0x00ca
            boolean r1 = r0.p
            if (r1 == 0) goto L_0x00c2
            r0.k = r4
            boolean r1 = r6.X(r0, r7)
            goto L_0x00c3
        L_0x00c2:
            r1 = r2
        L_0x00c3:
            if (r1 == 0) goto L_0x00ca
            r6.V(r0, r7)
            r7 = r2
            goto L_0x00d0
        L_0x00ca:
            r7 = r4
            goto L_0x00d0
        L_0x00cc:
            r6.H(r0, r2)
            r7 = r1
        L_0x00d0:
            if (r7 == 0) goto L_0x011a
            android.content.Context r7 = r6.a2
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00e6
            r7.playSoundEffect(r4)
            goto L_0x011a
        L_0x00e6:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            goto L_0x011a
        L_0x00ee:
            boolean r7 = r6.D2
            r6.D2 = r4
            h0.b.a.h$j r0 = r6.Q(r4)
            boolean r1 = r0.m
            if (r1 == 0) goto L_0x0100
            if (r7 != 0) goto L_0x011a
            r6.H(r0, r2)
            goto L_0x011a
        L_0x0100:
            h0.b.e.a r7 = r6.k2
            if (r7 == 0) goto L_0x0108
            r7.c()
            goto L_0x0115
        L_0x0108:
            r6.S()
            h0.b.a.a r7 = r6.e2
            if (r7 == 0) goto L_0x0117
            boolean r7 = r7.b()
            if (r7 == 0) goto L_0x0117
        L_0x0115:
            r7 = r2
            goto L_0x0118
        L_0x0117:
            r7 = r4
        L_0x0118:
            if (r7 == 0) goto L_0x0062
        L_0x011a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.a.h.J(android.view.KeyEvent):boolean");
    }

    public void K(int i3) {
        j Q = Q(i3);
        if (Q.h != null) {
            Bundle bundle = new Bundle();
            Q.h.w(bundle);
            if (bundle.size() > 0) {
                Q.q = bundle;
            }
            Q.h.z();
            Q.h.clear();
        }
        Q.p = true;
        Q.o = true;
        if ((i3 == 108 || i3 == 0) && this.h2 != null) {
            j Q3 = Q(0);
            Q3.k = false;
            X(Q3, (KeyEvent) null);
        }
    }

    public void L() {
        y yVar = this.o2;
        if (yVar != null) {
            yVar.b();
        }
    }

    public final void M() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.p2) {
            TypedArray obtainStyledAttributes = this.a2.obtainStyledAttributes(R.styleable.AppCompatTheme);
            int i3 = R.styleable.AppCompatTheme_windowActionBar;
            if (obtainStyledAttributes.hasValue(i3)) {
                if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowNoTitle, false)) {
                    u(1);
                } else if (obtainStyledAttributes.getBoolean(i3, false)) {
                    u(108);
                }
                if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionBarOverlay, false)) {
                    u(109);
                }
                if (obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_windowActionModeOverlay, false)) {
                    u(10);
                }
                this.y2 = obtainStyledAttributes.getBoolean(R.styleable.AppCompatTheme_android_windowIsFloating, false);
                obtainStyledAttributes.recycle();
                N();
                this.b2.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.a2);
                if (this.z2) {
                    viewGroup = this.x2 ? (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.y2) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.w2 = false;
                    this.v2 = false;
                } else if (this.v2) {
                    TypedValue typedValue = new TypedValue();
                    this.a2.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new h0.b.e.c(this.a2, typedValue.resourceId);
                    } else {
                        context = this.a2;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    z zVar = (z) viewGroup.findViewById(R.id.decor_content_parent);
                    this.h2 = zVar;
                    zVar.setWindowCallback(R());
                    if (this.w2) {
                        this.h2.i(109);
                    }
                    if (this.t2) {
                        this.h2.i(2);
                    }
                    if (this.u2) {
                        this.h2.i(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    i iVar = new i(this);
                    AtomicInteger atomicInteger = h0.i.i.q.a;
                    q.c.c(viewGroup, iVar);
                    if (this.h2 == null) {
                        this.r2 = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = c1.a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e3) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
                    } catch (IllegalAccessException e4) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e4);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.b2.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.b2.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new j(this));
                    this.q2 = viewGroup;
                    Object obj = this.Z1;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.g2;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        z zVar2 = this.h2;
                        if (zVar2 != null) {
                            zVar2.setWindowTitle(charSequence);
                        } else {
                            a aVar = this.e2;
                            if (aVar != null) {
                                aVar.v(charSequence);
                            } else {
                                TextView textView = this.r2;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.q2.findViewById(16908290);
                    View decorView = this.b2.getDecorView();
                    contentFrameLayout2.Z1.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    AtomicInteger atomicInteger2 = h0.i.i.q.a;
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.a2.obtainStyledAttributes(R.styleable.AppCompatTheme);
                    obtainStyledAttributes2.getValue(R.styleable.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(R.styleable.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
                    int i4 = R.styleable.AppCompatTheme_windowFixedWidthMajor;
                    if (obtainStyledAttributes2.hasValue(i4)) {
                        obtainStyledAttributes2.getValue(i4, contentFrameLayout2.getFixedWidthMajor());
                    }
                    int i5 = R.styleable.AppCompatTheme_windowFixedWidthMinor;
                    if (obtainStyledAttributes2.hasValue(i5)) {
                        obtainStyledAttributes2.getValue(i5, contentFrameLayout2.getFixedWidthMinor());
                    }
                    int i6 = R.styleable.AppCompatTheme_windowFixedHeightMajor;
                    if (obtainStyledAttributes2.hasValue(i6)) {
                        obtainStyledAttributes2.getValue(i6, contentFrameLayout2.getFixedHeightMajor());
                    }
                    int i7 = R.styleable.AppCompatTheme_windowFixedHeightMinor;
                    if (obtainStyledAttributes2.hasValue(i7)) {
                        obtainStyledAttributes2.getValue(i7, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.p2 = true;
                    j Q = Q(0);
                    if (!this.H2 && Q.h == null) {
                        T(108);
                        return;
                    }
                    return;
                }
                StringBuilder P0 = i0.d.a.a.a.P0("AppCompat does not support the current theme features: { windowActionBar: ");
                P0.append(this.v2);
                P0.append(", windowActionBarOverlay: ");
                P0.append(this.w2);
                P0.append(", android:windowIsFloating: ");
                P0.append(this.y2);
                P0.append(", windowActionModeOverlay: ");
                P0.append(this.x2);
                P0.append(", windowNoTitle: ");
                throw new IllegalArgumentException(i0.d.a.a.a.D0(P0, this.z2, " }"));
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void N() {
        if (this.b2 == null) {
            Object obj = this.Z1;
            if (obj instanceof Activity) {
                E(((Activity) obj).getWindow());
            }
        }
        if (this.b2 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public j O(Menu menu) {
        j[] jVarArr = this.B2;
        int length = jVarArr != null ? jVarArr.length : 0;
        for (int i3 = 0; i3 < length; i3++) {
            j jVar = jVarArr[i3];
            if (jVar != null && jVar.h == menu) {
                return jVar;
            }
        }
        return null;
    }

    public final g P(Context context) {
        if (this.M2 == null) {
            if (q.a == null) {
                Context applicationContext = context.getApplicationContext();
                q.a = new q(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.M2 = new C0016h(q.a);
        }
        return this.M2;
    }

    public j Q(int i3) {
        j[] jVarArr = this.B2;
        if (jVarArr == null || jVarArr.length <= i3) {
            j[] jVarArr2 = new j[(i3 + 1)];
            if (jVarArr != null) {
                System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
            }
            this.B2 = jVarArr2;
            jVarArr = jVarArr2;
        }
        j jVar = jVarArr[i3];
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(i3);
        jVarArr[i3] = jVar2;
        return jVar2;
    }

    public final Window.Callback R() {
        return this.b2.getCallback();
    }

    public final void S() {
        M();
        if (this.v2 && this.e2 == null) {
            Object obj = this.Z1;
            if (obj instanceof Activity) {
                this.e2 = new r((Activity) this.Z1, this.w2);
            } else if (obj instanceof Dialog) {
                this.e2 = new r((Dialog) this.Z1);
            }
            a aVar = this.e2;
            if (aVar != null) {
                aVar.o(this.R2);
            }
        }
    }

    public final void T(int i3) {
        this.P2 = (1 << i3) | this.P2;
        if (!this.O2) {
            View decorView = this.b2.getDecorView();
            Runnable runnable = this.Q2;
            AtomicInteger atomicInteger = h0.i.i.q.a;
            decorView.postOnAnimation(runnable);
            this.O2 = true;
        }
    }

    public int U(Context context, int i3) {
        if (i3 == -100) {
            return -1;
        }
        if (i3 != -1) {
            if (i3 != 0) {
                if (!(i3 == 1 || i3 == 2)) {
                    if (i3 == 3) {
                        if (this.N2 == null) {
                            this.N2 = new f(context);
                        }
                        return this.N2.c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return P(context).c();
            }
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0154, code lost:
        if (r15 != null) goto L_0x0156;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void V(h0.b.a.h.j r14, android.view.KeyEvent r15) {
        /*
            r13 = this;
            boolean r0 = r14.m
            if (r0 != 0) goto L_0x01d5
            boolean r0 = r13.H2
            if (r0 == 0) goto L_0x000a
            goto L_0x01d5
        L_0x000a:
            int r0 = r14.a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r13.a2
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = r2
            goto L_0x0024
        L_0x0023:
            r0 = r1
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r13.R()
            if (r0 == 0) goto L_0x003b
            int r3 = r14.a
            h0.b.e.i.g r4 = r14.h
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r13.H(r14, r2)
            return
        L_0x003b:
            android.content.Context r0 = r13.a2
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r15 = r13.X(r14, r15)
            if (r15 != 0) goto L_0x004f
            return
        L_0x004f:
            android.view.ViewGroup r15 = r14.e
            r3 = -1
            r4 = -2
            if (r15 == 0) goto L_0x006b
            boolean r5 = r14.o
            if (r5 == 0) goto L_0x005a
            goto L_0x006b
        L_0x005a:
            android.view.View r15 = r14.g
            if (r15 == 0) goto L_0x01b2
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 == 0) goto L_0x01b2
            int r15 = r15.width
            if (r15 != r3) goto L_0x01b2
            r6 = r3
            goto L_0x01b3
        L_0x006b:
            if (r15 != 0) goto L_0x00e5
            r13.S()
            h0.b.a.a r15 = r13.e2
            if (r15 == 0) goto L_0x0079
            android.content.Context r15 = r15.e()
            goto L_0x007a
        L_0x0079:
            r15 = 0
        L_0x007a:
            if (r15 != 0) goto L_0x007e
            android.content.Context r15 = r13.a2
        L_0x007e:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources r5 = r15.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            android.content.res.Resources$Theme r6 = r15.getTheme()
            r5.setTo(r6)
            int r6 = androidx.appcompat.R.attr.actionBarPopupTheme
            r5.resolveAttribute(r6, r3, r2)
            int r6 = r3.resourceId
            if (r6 == 0) goto L_0x009e
            r5.applyStyle(r6, r2)
        L_0x009e:
            int r6 = androidx.appcompat.R.attr.panelMenuListTheme
            r5.resolveAttribute(r6, r3, r2)
            int r3 = r3.resourceId
            if (r3 == 0) goto L_0x00ab
            r5.applyStyle(r3, r2)
            goto L_0x00b0
        L_0x00ab:
            int r3 = androidx.appcompat.R.style.Theme_AppCompat_CompactMenu
            r5.applyStyle(r3, r2)
        L_0x00b0:
            h0.b.e.c r3 = new h0.b.e.c
            r3.<init>((android.content.Context) r15, (int) r1)
            android.content.res.Resources$Theme r15 = r3.getTheme()
            r15.setTo(r5)
            r14.j = r3
            int[] r15 = androidx.appcompat.R.styleable.AppCompatTheme
            android.content.res.TypedArray r15 = r3.obtainStyledAttributes(r15)
            int r3 = androidx.appcompat.R.styleable.AppCompatTheme_panelBackground
            int r3 = r15.getResourceId(r3, r1)
            r14.b = r3
            int r3 = androidx.appcompat.R.styleable.AppCompatTheme_android_windowAnimationStyle
            int r3 = r15.getResourceId(r3, r1)
            r14.d = r3
            r15.recycle()
            h0.b.a.h$i r15 = new h0.b.a.h$i
            android.content.Context r3 = r14.j
            r15.<init>(r3)
            r14.e = r15
            r15 = 81
            r14.c = r15
            goto L_0x00f4
        L_0x00e5:
            boolean r3 = r14.o
            if (r3 == 0) goto L_0x00f4
            int r15 = r15.getChildCount()
            if (r15 <= 0) goto L_0x00f4
            android.view.ViewGroup r15 = r14.e
            r15.removeAllViews()
        L_0x00f4:
            android.view.View r15 = r14.g
            if (r15 == 0) goto L_0x00fb
            r14.f = r15
            goto L_0x0156
        L_0x00fb:
            h0.b.e.i.g r15 = r14.h
            if (r15 != 0) goto L_0x0100
            goto L_0x0158
        L_0x0100:
            h0.b.a.h$k r15 = r13.j2
            if (r15 != 0) goto L_0x010b
            h0.b.a.h$k r15 = new h0.b.a.h$k
            r15.<init>()
            r13.j2 = r15
        L_0x010b:
            h0.b.a.h$k r15 = r13.j2
            h0.b.e.i.e r3 = r14.i
            if (r3 != 0) goto L_0x0125
            h0.b.e.i.e r3 = new h0.b.e.i.e
            android.content.Context r5 = r14.j
            int r6 = androidx.appcompat.R.layout.abc_list_menu_item_layout
            r3.<init>(r5, r6)
            r14.i = r3
            r3.Y1 = r15
            h0.b.e.i.g r15 = r14.h
            android.content.Context r5 = r15.b
            r15.b(r3, r5)
        L_0x0125:
            h0.b.e.i.e r15 = r14.i
            android.view.ViewGroup r3 = r14.e
            androidx.appcompat.view.menu.ExpandedMenuView r5 = r15.x
            if (r5 != 0) goto L_0x0150
            android.view.LayoutInflater r5 = r15.d
            int r6 = androidx.appcompat.R.layout.abc_expanded_menu_layout
            android.view.View r3 = r5.inflate(r6, r3, r1)
            androidx.appcompat.view.menu.ExpandedMenuView r3 = (androidx.appcompat.view.menu.ExpandedMenuView) r3
            r15.x = r3
            h0.b.e.i.e$a r3 = r15.Z1
            if (r3 != 0) goto L_0x0144
            h0.b.e.i.e$a r3 = new h0.b.e.i.e$a
            r3.<init>()
            r15.Z1 = r3
        L_0x0144:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r15.x
            h0.b.e.i.e$a r5 = r15.Z1
            r3.setAdapter(r5)
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r15.x
            r3.setOnItemClickListener(r15)
        L_0x0150:
            androidx.appcompat.view.menu.ExpandedMenuView r15 = r15.x
            r14.f = r15
            if (r15 == 0) goto L_0x0158
        L_0x0156:
            r15 = r2
            goto L_0x0159
        L_0x0158:
            r15 = r1
        L_0x0159:
            if (r15 == 0) goto L_0x01d3
            android.view.View r15 = r14.f
            if (r15 != 0) goto L_0x0160
            goto L_0x0175
        L_0x0160:
            android.view.View r15 = r14.g
            if (r15 == 0) goto L_0x0165
            goto L_0x0173
        L_0x0165:
            h0.b.e.i.e r15 = r14.i
            android.widget.ListAdapter r15 = r15.a()
            h0.b.e.i.e$a r15 = (h0.b.e.i.e.a) r15
            int r15 = r15.getCount()
            if (r15 <= 0) goto L_0x0175
        L_0x0173:
            r15 = r2
            goto L_0x0176
        L_0x0175:
            r15 = r1
        L_0x0176:
            if (r15 != 0) goto L_0x0179
            goto L_0x01d3
        L_0x0179:
            android.view.View r15 = r14.f
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            if (r15 != 0) goto L_0x0186
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r4, r4)
        L_0x0186:
            int r3 = r14.b
            android.view.ViewGroup r5 = r14.e
            r5.setBackgroundResource(r3)
            android.view.View r3 = r14.f
            android.view.ViewParent r3 = r3.getParent()
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x019e
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r5 = r14.f
            r3.removeView(r5)
        L_0x019e:
            android.view.ViewGroup r3 = r14.e
            android.view.View r5 = r14.f
            r3.addView(r5, r15)
            android.view.View r15 = r14.f
            boolean r15 = r15.hasFocus()
            if (r15 != 0) goto L_0x01b2
            android.view.View r15 = r14.f
            r15.requestFocus()
        L_0x01b2:
            r6 = r4
        L_0x01b3:
            r14.l = r1
            android.view.WindowManager$LayoutParams r15 = new android.view.WindowManager$LayoutParams
            r7 = -2
            r8 = 0
            r9 = 0
            r10 = 1002(0x3ea, float:1.404E-42)
            r11 = 8519680(0x820000, float:1.1938615E-38)
            r12 = -3
            r5 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            int r1 = r14.c
            r15.gravity = r1
            int r1 = r14.d
            r15.windowAnimations = r1
            android.view.ViewGroup r1 = r14.e
            r0.addView(r1, r15)
            r14.m = r2
            return
        L_0x01d3:
            r14.o = r2
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.a.h.V(h0.b.a.h$j, android.view.KeyEvent):void");
    }

    public final boolean W(j jVar, int i3, KeyEvent keyEvent, int i4) {
        h0.b.e.i.g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((jVar.k || X(jVar, keyEvent)) && (gVar = jVar.h) != null) {
            z = gVar.performShortcut(i3, keyEvent, i4);
        }
        if (z && (i4 & 1) == 0 && this.h2 == null) {
            H(jVar, true);
        }
        return z;
    }

    public final boolean X(j jVar, KeyEvent keyEvent) {
        z zVar;
        z zVar2;
        z zVar3;
        Resources.Theme theme;
        z zVar4;
        if (this.H2) {
            return false;
        }
        if (jVar.k) {
            return true;
        }
        j jVar2 = this.C2;
        if (!(jVar2 == null || jVar2 == jVar)) {
            H(jVar2, false);
        }
        Window.Callback R = R();
        if (R != null) {
            jVar.g = R.onCreatePanelView(jVar.a);
        }
        int i3 = jVar.a;
        boolean z = i3 == 0 || i3 == 108;
        if (z && (zVar4 = this.h2) != null) {
            zVar4.c();
        }
        if (jVar.g == null && (!z || !(this.e2 instanceof o))) {
            h0.b.e.i.g gVar = jVar.h;
            if (gVar == null || jVar.p) {
                if (gVar == null) {
                    Context context = this.a2;
                    int i4 = jVar.a;
                    if ((i4 == 0 || i4 == 108) && this.h2 != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            h0.b.e.c cVar = new h0.b.e.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    h0.b.e.i.g gVar2 = new h0.b.e.i.g(context);
                    gVar2.f = this;
                    jVar.a(gVar2);
                    if (jVar.h == null) {
                        return false;
                    }
                }
                if (z && (zVar3 = this.h2) != null) {
                    if (this.i2 == null) {
                        this.i2 = new c();
                    }
                    zVar3.a(jVar.h, this.i2);
                }
                jVar.h.z();
                if (!R.onCreatePanelMenu(jVar.a, jVar.h)) {
                    jVar.a((h0.b.e.i.g) null);
                    if (z && (zVar2 = this.h2) != null) {
                        zVar2.a((Menu) null, this.i2);
                    }
                    return false;
                }
                jVar.p = false;
            }
            jVar.h.z();
            Bundle bundle = jVar.q;
            if (bundle != null) {
                jVar.h.v(bundle);
                jVar.q = null;
            }
            if (!R.onPreparePanel(0, jVar.g, jVar.h)) {
                if (z && (zVar = this.h2) != null) {
                    zVar.a((Menu) null, this.i2);
                }
                jVar.h.y();
                return false;
            }
            boolean z3 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            jVar.n = z3;
            jVar.h.setQwertyMode(z3);
            jVar.h.y();
        }
        jVar.k = true;
        jVar.l = false;
        this.C2 = jVar;
        return true;
    }

    public final boolean Y() {
        ViewGroup viewGroup;
        if (this.p2 && (viewGroup = this.q2) != null) {
            AtomicInteger atomicInteger = h0.i.i.q.a;
            if (viewGroup.isLaidOut()) {
                return true;
            }
        }
        return false;
    }

    public final void Z() {
        if (this.p2) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public boolean a(h0.b.e.i.g gVar, MenuItem menuItem) {
        j O;
        Window.Callback R = R();
        if (R == null || this.H2 || (O = O(gVar.k())) == null) {
            return false;
        }
        return R.onMenuItemSelected(O.a, menuItem);
    }

    public final int a0(d0 d0Var, Rect rect) {
        boolean z;
        int i3;
        int i4;
        boolean z3;
        int i5;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i6;
        int e3 = d0Var.e();
        ActionBarContextView actionBarContextView = this.l2;
        int i7 = 8;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.l2.getLayoutParams();
            boolean z4 = true;
            if (this.l2.isShown()) {
                if (this.S2 == null) {
                    this.S2 = new Rect();
                    this.T2 = new Rect();
                }
                Rect rect2 = this.S2;
                Rect rect3 = this.T2;
                rect2.set(d0Var.c(), d0Var.e(), d0Var.d(), d0Var.b());
                c1.a(this.q2, rect2, rect3);
                int i8 = rect2.top;
                int i9 = rect2.left;
                int i10 = rect2.right;
                ViewGroup viewGroup = this.q2;
                AtomicInteger atomicInteger = h0.i.i.q.a;
                d0 a3 = q.d.a(viewGroup);
                if (a3 == null) {
                    i3 = 0;
                } else {
                    i3 = a3.c();
                }
                if (a3 == null) {
                    i4 = 0;
                } else {
                    i4 = a3.d();
                }
                if (marginLayoutParams2.topMargin == i8 && marginLayoutParams2.leftMargin == i9 && marginLayoutParams2.rightMargin == i10) {
                    z3 = false;
                } else {
                    marginLayoutParams2.topMargin = i8;
                    marginLayoutParams2.leftMargin = i9;
                    marginLayoutParams2.rightMargin = i10;
                    z3 = true;
                }
                if (i8 <= 0 || this.s2 != null) {
                    View view = this.s2;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i6 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4))) {
                        marginLayoutParams.height = i6;
                        marginLayoutParams.leftMargin = i3;
                        marginLayoutParams.rightMargin = i4;
                        this.s2.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.a2);
                    this.s2 = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i3;
                    layoutParams.rightMargin = i4;
                    this.q2.addView(this.s2, -1, layoutParams);
                }
                View view3 = this.s2;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.s2;
                    if ((view4.getWindowSystemUiVisibility() & 8192) == 0) {
                        z4 = false;
                    }
                    if (z4) {
                        i5 = h0.i.b.a.getColor(this.a2, R.color.abc_decor_view_status_guard_light);
                    } else {
                        i5 = h0.i.b.a.getColor(this.a2, R.color.abc_decor_view_status_guard);
                    }
                    view4.setBackgroundColor(i5);
                }
                if (!this.x2 && z) {
                    e3 = 0;
                }
                z4 = z3;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z4 = false;
                z = false;
            }
            if (z4) {
                this.l2.setLayoutParams(marginLayoutParams2);
            }
        }
        View view5 = this.s2;
        if (view5 != null) {
            if (z) {
                i7 = 0;
            }
            view5.setVisibility(i7);
        }
        return e3;
    }

    public void b(h0.b.e.i.g gVar) {
        z zVar = this.h2;
        if (zVar == null || !zVar.d() || (ViewConfiguration.get(this.a2).hasPermanentMenuKey() && !this.h2.f())) {
            j Q = Q(0);
            Q.o = true;
            H(Q, false);
            V(Q, (KeyEvent) null);
            return;
        }
        Window.Callback R = R();
        if (this.h2.b()) {
            this.h2.g();
            if (!this.H2) {
                R.onPanelClosed(108, Q(0).h);
            }
        } else if (R != null && !this.H2) {
            if (this.O2 && (1 & this.P2) != 0) {
                this.b2.getDecorView().removeCallbacks(this.Q2);
                this.Q2.run();
            }
            j Q3 = Q(0);
            h0.b.e.i.g gVar2 = Q3.h;
            if (gVar2 != null && !Q3.p && R.onPreparePanel(0, Q3.g, gVar2)) {
                R.onMenuOpened(108, Q3.h);
                this.h2.h();
            }
        }
    }

    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        M();
        ((ViewGroup) this.q2.findViewById(16908290)).addView(view, layoutParams);
        this.c2.c.onContentChanged();
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Context d(android.content.Context r10) {
        /*
            r9 = this;
            r0 = 1
            r9.E2 = r0
            int r1 = r9.I2
            r2 = -100
            if (r1 == r2) goto L_0x000a
            goto L_0x000b
        L_0x000a:
            r1 = r2
        L_0x000b:
            int r1 = r9.U(r10, r1)
            boolean r2 = Y1
            r3 = 0
            if (r2 == 0) goto L_0x0023
            boolean r2 = r10 instanceof android.view.ContextThemeWrapper
            if (r2 == 0) goto L_0x0023
            android.content.res.Configuration r2 = r9.I(r10, r1, r3)
            r4 = r10
            android.view.ContextThemeWrapper r4 = (android.view.ContextThemeWrapper) r4     // Catch:{ IllegalStateException -> 0x0023 }
            r4.applyOverrideConfiguration(r2)     // Catch:{ IllegalStateException -> 0x0023 }
            return r10
        L_0x0023:
            boolean r2 = r10 instanceof h0.b.e.c
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r2 = r9.I(r10, r1, r3)
            r4 = r10
            h0.b.e.c r4 = (h0.b.e.c) r4     // Catch:{ IllegalStateException -> 0x0032 }
            r4.a(r2)     // Catch:{ IllegalStateException -> 0x0032 }
            return r10
        L_0x0032:
            boolean r2 = y
            if (r2 != 0) goto L_0x0037
            return r10
        L_0x0037:
            int r2 = android.os.Build.VERSION.SDK_INT
            android.content.res.Configuration r4 = new android.content.res.Configuration
            r4.<init>()
            r5 = -1
            r4.uiMode = r5
            r5 = 0
            r4.fontScale = r5
            android.content.Context r4 = r10.createConfigurationContext(r4)
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            android.content.res.Resources r6 = r10.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r7 = r6.uiMode
            r4.uiMode = r7
            boolean r7 = r4.equals(r6)
            if (r7 != 0) goto L_0x016d
            android.content.res.Configuration r7 = new android.content.res.Configuration
            r7.<init>()
            r7.fontScale = r5
            int r5 = r4.diff(r6)
            if (r5 != 0) goto L_0x0071
            goto L_0x016e
        L_0x0071:
            float r5 = r4.fontScale
            float r8 = r6.fontScale
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x007b
            r7.fontScale = r8
        L_0x007b:
            int r5 = r4.mcc
            int r8 = r6.mcc
            if (r5 == r8) goto L_0x0083
            r7.mcc = r8
        L_0x0083:
            int r5 = r4.mnc
            int r8 = r6.mnc
            if (r5 == r8) goto L_0x008b
            r7.mnc = r8
        L_0x008b:
            android.os.LocaleList r5 = r4.getLocales()
            android.os.LocaleList r8 = r6.getLocales()
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x00a0
            r7.setLocales(r8)
            java.util.Locale r5 = r6.locale
            r7.locale = r5
        L_0x00a0:
            int r5 = r4.touchscreen
            int r8 = r6.touchscreen
            if (r5 == r8) goto L_0x00a8
            r7.touchscreen = r8
        L_0x00a8:
            int r5 = r4.keyboard
            int r8 = r6.keyboard
            if (r5 == r8) goto L_0x00b0
            r7.keyboard = r8
        L_0x00b0:
            int r5 = r4.keyboardHidden
            int r8 = r6.keyboardHidden
            if (r5 == r8) goto L_0x00b8
            r7.keyboardHidden = r8
        L_0x00b8:
            int r5 = r4.navigation
            int r8 = r6.navigation
            if (r5 == r8) goto L_0x00c0
            r7.navigation = r8
        L_0x00c0:
            int r5 = r4.navigationHidden
            int r8 = r6.navigationHidden
            if (r5 == r8) goto L_0x00c8
            r7.navigationHidden = r8
        L_0x00c8:
            int r5 = r4.orientation
            int r8 = r6.orientation
            if (r5 == r8) goto L_0x00d0
            r7.orientation = r8
        L_0x00d0:
            int r5 = r4.screenLayout
            r5 = r5 & 15
            int r8 = r6.screenLayout
            r8 = r8 & 15
            if (r5 == r8) goto L_0x00df
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x00df:
            int r5 = r4.screenLayout
            r5 = r5 & 192(0xc0, float:2.69E-43)
            int r8 = r6.screenLayout
            r8 = r8 & 192(0xc0, float:2.69E-43)
            if (r5 == r8) goto L_0x00ee
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x00ee:
            int r5 = r4.screenLayout
            r5 = r5 & 48
            int r8 = r6.screenLayout
            r8 = r8 & 48
            if (r5 == r8) goto L_0x00fd
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x00fd:
            int r5 = r4.screenLayout
            r5 = r5 & 768(0x300, float:1.076E-42)
            int r8 = r6.screenLayout
            r8 = r8 & 768(0x300, float:1.076E-42)
            if (r5 == r8) goto L_0x010c
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x010c:
            r5 = 26
            if (r2 < r5) goto L_0x012e
            int r2 = r4.colorMode
            r2 = r2 & 3
            int r5 = r6.colorMode
            r5 = r5 & 3
            if (r2 == r5) goto L_0x011f
            int r2 = r7.colorMode
            r2 = r2 | r5
            r7.colorMode = r2
        L_0x011f:
            int r2 = r4.colorMode
            r2 = r2 & 12
            int r5 = r6.colorMode
            r5 = r5 & 12
            if (r2 == r5) goto L_0x012e
            int r2 = r7.colorMode
            r2 = r2 | r5
            r7.colorMode = r2
        L_0x012e:
            int r2 = r4.uiMode
            r2 = r2 & 15
            int r5 = r6.uiMode
            r5 = r5 & 15
            if (r2 == r5) goto L_0x013d
            int r2 = r7.uiMode
            r2 = r2 | r5
            r7.uiMode = r2
        L_0x013d:
            int r2 = r4.uiMode
            r2 = r2 & 48
            int r5 = r6.uiMode
            r5 = r5 & 48
            if (r2 == r5) goto L_0x014c
            int r2 = r7.uiMode
            r2 = r2 | r5
            r7.uiMode = r2
        L_0x014c:
            int r2 = r4.screenWidthDp
            int r5 = r6.screenWidthDp
            if (r2 == r5) goto L_0x0154
            r7.screenWidthDp = r5
        L_0x0154:
            int r2 = r4.screenHeightDp
            int r5 = r6.screenHeightDp
            if (r2 == r5) goto L_0x015c
            r7.screenHeightDp = r5
        L_0x015c:
            int r2 = r4.smallestScreenWidthDp
            int r5 = r6.smallestScreenWidthDp
            if (r2 == r5) goto L_0x0164
            r7.smallestScreenWidthDp = r5
        L_0x0164:
            int r2 = r4.densityDpi
            int r4 = r6.densityDpi
            if (r2 == r4) goto L_0x016e
            r7.densityDpi = r4
            goto L_0x016e
        L_0x016d:
            r7 = r3
        L_0x016e:
            android.content.res.Configuration r1 = r9.I(r10, r1, r7)
            h0.b.e.c r2 = new h0.b.e.c
            int r4 = androidx.appcompat.R.style.Theme_AppCompat_Empty
            r2.<init>((android.content.Context) r10, (int) r4)
            r2.a(r1)
            r1 = 0
            android.content.res.Resources$Theme r10 = r10.getTheme()     // Catch:{ NullPointerException -> 0x0185 }
            if (r10 == 0) goto L_0x0185
            r10 = r0
            goto L_0x0186
        L_0x0185:
            r10 = r1
        L_0x0186:
            if (r10 == 0) goto L_0x01d2
            android.content.res.Resources$Theme r10 = r2.getTheme()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 < r5) goto L_0x0196
            r10.rebase()
            goto L_0x01d2
        L_0x0196:
            java.lang.Object r4 = h0.i.b.d.i.a
            monitor-enter(r4)
            boolean r5 = h0.i.b.d.i.c     // Catch:{ all -> 0x01cf }
            if (r5 != 0) goto L_0x01b7
            java.lang.Class<android.content.res.Resources$Theme> r5 = android.content.res.Resources.Theme.class
            java.lang.String r6 = "rebase"
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x01ad }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x01ad }
            h0.i.b.d.i.b = r5     // Catch:{ NoSuchMethodException -> 0x01ad }
            r5.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x01ad }
            goto L_0x01b5
        L_0x01ad:
            r5 = move-exception
            java.lang.String r6 = "ResourcesCompat"
            java.lang.String r7 = "Failed to retrieve rebase() method"
            android.util.Log.i(r6, r7, r5)     // Catch:{ all -> 0x01cf }
        L_0x01b5:
            h0.i.b.d.i.c = r0     // Catch:{ all -> 0x01cf }
        L_0x01b7:
            java.lang.reflect.Method r0 = h0.i.b.d.i.b     // Catch:{ all -> 0x01cf }
            if (r0 == 0) goto L_0x01cd
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException -> 0x01c3, InvocationTargetException -> 0x01c1 }
            r0.invoke(r10, r1)     // Catch:{ IllegalAccessException -> 0x01c3, InvocationTargetException -> 0x01c1 }
            goto L_0x01cd
        L_0x01c1:
            r10 = move-exception
            goto L_0x01c4
        L_0x01c3:
            r10 = move-exception
        L_0x01c4:
            java.lang.String r0 = "ResourcesCompat"
            java.lang.String r1 = "Failed to invoke rebase() method via reflection"
            android.util.Log.i(r0, r1, r10)     // Catch:{ all -> 0x01cf }
            h0.i.b.d.i.b = r3     // Catch:{ all -> 0x01cf }
        L_0x01cd:
            monitor-exit(r4)     // Catch:{ all -> 0x01cf }
            goto L_0x01d2
        L_0x01cf:
            r10 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01cf }
            throw r10
        L_0x01d2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.a.h.d(android.content.Context):android.content.Context");
    }

    public <T extends View> T e(int i3) {
        M();
        return this.b2.findViewById(i3);
    }

    public final b f() {
        return new b(this);
    }

    public int g() {
        return this.I2;
    }

    public MenuInflater h() {
        if (this.f2 == null) {
            S();
            a aVar = this.e2;
            this.f2 = new h0.b.e.f(aVar != null ? aVar.e() : this.a2);
        }
        return this.f2;
    }

    public a i() {
        S();
        return this.e2;
    }

    public void j() {
        LayoutInflater from = LayoutInflater.from(this.a2);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof h)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public void k() {
        S();
        a aVar = this.e2;
        if (aVar == null || !aVar.g()) {
            T(0);
        }
    }

    public void l(Configuration configuration) {
        if (this.v2 && this.p2) {
            S();
            a aVar = this.e2;
            if (aVar != null) {
                aVar.h(configuration);
            }
        }
        h0.b.f.j a3 = h0.b.f.j.a();
        Context context = this.a2;
        synchronized (a3) {
            a3.c.onConfigurationChanged(context);
        }
        D(false);
    }

    public void m(Bundle bundle) {
        this.E2 = true;
        D(false);
        N();
        Object obj = this.Z1;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = NavUtils.getParentActivityName((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a aVar = this.e2;
                if (aVar == null) {
                    this.R2 = true;
                } else {
                    aVar.o(true);
                }
            }
            synchronized (g.d) {
                g.t(this);
                g.c.add(new WeakReference(this));
            }
        }
        this.F2 = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.Z1
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = h0.b.a.g.d
            monitor-enter(r0)
            h0.b.a.g.t(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        L_0x0011:
            boolean r0 = r3.O2
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.b2
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.Q2
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 0
            r3.G2 = r0
            r0 = 1
            r3.H2 = r0
            int r0 = r3.I2
            r1 = -100
            if (r0 == r1) goto L_0x0050
            java.lang.Object r0 = r3.Z1
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0050
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0050
            h0.f.h<java.lang.String, java.lang.Integer> r0 = q
            java.lang.Object r1 = r3.Z1
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.I2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005f
        L_0x0050:
            h0.f.h<java.lang.String, java.lang.Integer> r0 = q
            java.lang.Object r1 = r3.Z1
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005f:
            h0.b.a.a r0 = r3.e2
            if (r0 == 0) goto L_0x0066
            r0.i()
        L_0x0066:
            h0.b.a.h$g r0 = r3.M2
            if (r0 == 0) goto L_0x006d
            r0.a()
        L_0x006d:
            h0.b.a.h$g r0 = r3.N2
            if (r0 == 0) goto L_0x0074
            r0.a()
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.a.h.n():void");
    }

    public void o(Bundle bundle) {
        M();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v71 */
    /* JADX WARNING: type inference failed for: r2v72 */
    /* JADX WARNING: type inference failed for: r2v73 */
    /* JADX WARNING: type inference failed for: r2v74 */
    /* JADX WARNING: type inference failed for: r2v75 */
    /* JADX WARNING: type inference failed for: r2v76 */
    /* JADX WARNING: type inference failed for: r2v77 */
    /* JADX WARNING: type inference failed for: r2v78 */
    /* JADX WARNING: type inference failed for: r2v79 */
    /* JADX WARNING: type inference failed for: r2v80 */
    /* JADX WARNING: type inference failed for: r2v81 */
    /* JADX WARNING: type inference failed for: r2v82 */
    /* JADX WARNING: type inference failed for: r2v83 */
    /* JADX WARNING: type inference failed for: r2v84 */
    /* JADX WARNING: type inference failed for: r2v85 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r7, java.lang.String r8, android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r6 = this;
            h0.b.a.n r7 = r6.U2
            r0 = 0
            if (r7 != 0) goto L_0x0055
            android.content.Context r7 = r6.a2
            int[] r1 = androidx.appcompat.R.styleable.AppCompatTheme
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r1)
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_viewInflaterClass
            java.lang.String r7 = r7.getString(r1)
            if (r7 != 0) goto L_0x001d
            h0.b.a.n r7 = new h0.b.a.n
            r7.<init>()
            r6.U2 = r7
            goto L_0x0055
        L_0x001d:
            java.lang.Class r1 = java.lang.Class.forName(r7)     // Catch:{ all -> 0x0032 }
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x0032 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch:{ all -> 0x0032 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ all -> 0x0032 }
            h0.b.a.n r1 = (h0.b.a.n) r1     // Catch:{ all -> 0x0032 }
            r6.U2 = r1     // Catch:{ all -> 0x0032 }
            goto L_0x0055
        L_0x0032:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to instantiate custom view inflater "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r7 = ". Falling back to default."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            java.lang.String r2 = "AppCompatDelegate"
            android.util.Log.i(r2, r7, r1)
            h0.b.a.n r7 = new h0.b.a.n
            r7.<init>()
            r6.U2 = r7
        L_0x0055:
            h0.b.a.n r7 = r6.U2
            int r1 = h0.b.f.b1.a
            java.util.Objects.requireNonNull(r7)
            int[] r1 = androidx.appcompat.R.styleable.View
            android.content.res.TypedArray r1 = r9.obtainStyledAttributes(r10, r1, r0, r0)
            int r2 = androidx.appcompat.R.styleable.View_theme
            int r2 = r1.getResourceId(r2, r0)
            if (r2 == 0) goto L_0x0071
            java.lang.String r3 = "AppCompatViewInflater"
            java.lang.String r4 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r3, r4)
        L_0x0071:
            r1.recycle()
            if (r2 == 0) goto L_0x0087
            boolean r1 = r9 instanceof h0.b.e.c
            if (r1 == 0) goto L_0x0081
            r1 = r9
            h0.b.e.c r1 = (h0.b.e.c) r1
            int r1 = r1.a
            if (r1 == r2) goto L_0x0087
        L_0x0081:
            h0.b.e.c r1 = new h0.b.e.c
            r1.<init>((android.content.Context) r9, (int) r2)
            goto L_0x0088
        L_0x0087:
            r1 = r9
        L_0x0088:
            r8.hashCode()
            int r2 = r8.hashCode()
            r3 = -1
            r4 = 1
            switch(r2) {
                case -1946472170: goto L_0x0135;
                case -1455429095: goto L_0x0129;
                case -1346021293: goto L_0x011d;
                case -938935918: goto L_0x0111;
                case -937446323: goto L_0x0106;
                case -658531749: goto L_0x00fb;
                case -339785223: goto L_0x00f0;
                case 776382189: goto L_0x00e5;
                case 799298502: goto L_0x00d8;
                case 1125864064: goto L_0x00cb;
                case 1413872058: goto L_0x00be;
                case 1601505219: goto L_0x00b1;
                case 1666676343: goto L_0x00a4;
                case 2001146706: goto L_0x0097;
                default: goto L_0x0094;
            }
        L_0x0094:
            r2 = r3
            goto L_0x0140
        L_0x0097:
            java.lang.String r2 = "Button"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x00a0
            goto L_0x0094
        L_0x00a0:
            r2 = 13
            goto L_0x0140
        L_0x00a4:
            java.lang.String r2 = "EditText"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x00ad
            goto L_0x0094
        L_0x00ad:
            r2 = 12
            goto L_0x0140
        L_0x00b1:
            java.lang.String r2 = "CheckBox"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x00ba
            goto L_0x0094
        L_0x00ba:
            r2 = 11
            goto L_0x0140
        L_0x00be:
            java.lang.String r2 = "AutoCompleteTextView"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x00c7
            goto L_0x0094
        L_0x00c7:
            r2 = 10
            goto L_0x0140
        L_0x00cb:
            java.lang.String r2 = "ImageView"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x00d4
            goto L_0x0094
        L_0x00d4:
            r2 = 9
            goto L_0x0140
        L_0x00d8:
            java.lang.String r2 = "ToggleButton"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x00e1
            goto L_0x0094
        L_0x00e1:
            r2 = 8
            goto L_0x0140
        L_0x00e5:
            java.lang.String r2 = "RadioButton"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x00ee
            goto L_0x0094
        L_0x00ee:
            r2 = 7
            goto L_0x0140
        L_0x00f0:
            java.lang.String r2 = "Spinner"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x00f9
            goto L_0x0094
        L_0x00f9:
            r2 = 6
            goto L_0x0140
        L_0x00fb:
            java.lang.String r2 = "SeekBar"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x0104
            goto L_0x0094
        L_0x0104:
            r2 = 5
            goto L_0x0140
        L_0x0106:
            java.lang.String r2 = "ImageButton"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x010f
            goto L_0x0094
        L_0x010f:
            r2 = 4
            goto L_0x0140
        L_0x0111:
            java.lang.String r2 = "TextView"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x011b
            goto L_0x0094
        L_0x011b:
            r2 = 3
            goto L_0x0140
        L_0x011d:
            java.lang.String r2 = "MultiAutoCompleteTextView"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x0127
            goto L_0x0094
        L_0x0127:
            r2 = 2
            goto L_0x0140
        L_0x0129:
            java.lang.String r2 = "CheckedTextView"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x0133
            goto L_0x0094
        L_0x0133:
            r2 = r4
            goto L_0x0140
        L_0x0135:
            java.lang.String r2 = "RatingBar"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x013f
            goto L_0x0094
        L_0x013f:
            r2 = r0
        L_0x0140:
            switch(r2) {
                case 0: goto L_0x01bb;
                case 1: goto L_0x01b2;
                case 2: goto L_0x01a9;
                case 3: goto L_0x01a1;
                case 4: goto L_0x0198;
                case 5: goto L_0x018f;
                case 6: goto L_0x0186;
                case 7: goto L_0x017e;
                case 8: goto L_0x0175;
                case 9: goto L_0x016c;
                case 10: goto L_0x0164;
                case 11: goto L_0x015c;
                case 12: goto L_0x0152;
                case 13: goto L_0x0149;
                default: goto L_0x0143;
            }
        L_0x0143:
            android.view.View r2 = r7.f()
            goto L_0x01c3
        L_0x0149:
            h0.b.f.f r2 = r7.b(r1, r10)
            r7.h(r2, r8)
            goto L_0x01c3
        L_0x0152:
            h0.b.f.k r2 = new h0.b.f.k
            r2.<init>(r1, r10)
            r7.h(r2, r8)
            goto L_0x01c3
        L_0x015c:
            h0.b.f.g r2 = r7.c(r1, r10)
            r7.h(r2, r8)
            goto L_0x01c3
        L_0x0164:
            h0.b.f.d r2 = r7.a(r1, r10)
            r7.h(r2, r8)
            goto L_0x01c3
        L_0x016c:
            androidx.appcompat.widget.AppCompatImageView r2 = new androidx.appcompat.widget.AppCompatImageView
            r2.<init>(r1, r10)
            r7.h(r2, r8)
            goto L_0x01c3
        L_0x0175:
            h0.b.f.y r2 = new h0.b.f.y
            r2.<init>(r1, r10)
            r7.h(r2, r8)
            goto L_0x01c3
        L_0x017e:
            h0.b.f.p r2 = r7.d(r1, r10)
            r7.h(r2, r8)
            goto L_0x01c3
        L_0x0186:
            androidx.appcompat.widget.AppCompatSpinner r2 = new androidx.appcompat.widget.AppCompatSpinner
            r2.<init>((android.content.Context) r1, (android.util.AttributeSet) r10)
            r7.h(r2, r8)
            goto L_0x01c3
        L_0x018f:
            h0.b.f.s r2 = new h0.b.f.s
            r2.<init>(r1, r10)
            r7.h(r2, r8)
            goto L_0x01c3
        L_0x0198:
            androidx.appcompat.widget.AppCompatImageButton r2 = new androidx.appcompat.widget.AppCompatImageButton
            r2.<init>(r1, r10)
            r7.h(r2, r8)
            goto L_0x01c3
        L_0x01a1:
            androidx.appcompat.widget.AppCompatTextView r2 = r7.e(r1, r10)
            r7.h(r2, r8)
            goto L_0x01c3
        L_0x01a9:
            h0.b.f.m r2 = new h0.b.f.m
            r2.<init>(r1, r10)
            r7.h(r2, r8)
            goto L_0x01c3
        L_0x01b2:
            h0.b.f.h r2 = new h0.b.f.h
            r2.<init>(r1, r10)
            r7.h(r2, r8)
            goto L_0x01c3
        L_0x01bb:
            h0.b.f.q r2 = new h0.b.f.q
            r2.<init>(r1, r10)
            r7.h(r2, r8)
        L_0x01c3:
            if (r2 != 0) goto L_0x021e
            if (r9 == r1) goto L_0x021e
            java.lang.String r9 = "view"
            boolean r9 = r8.equals(r9)
            r2 = 0
            if (r9 == 0) goto L_0x01d6
            java.lang.String r8 = "class"
            java.lang.String r8 = r10.getAttributeValue(r2, r8)
        L_0x01d6:
            java.lang.Object[] r9 = r7.e     // Catch:{ Exception -> 0x0218, all -> 0x0210 }
            r9[r0] = r1     // Catch:{ Exception -> 0x0218, all -> 0x0210 }
            r9[r4] = r10     // Catch:{ Exception -> 0x0218, all -> 0x0210 }
            r9 = 46
            int r9 = r8.indexOf(r9)     // Catch:{ Exception -> 0x0218, all -> 0x0210 }
            if (r3 != r9) goto L_0x0204
            r9 = r0
        L_0x01e5:
            java.lang.String[] r3 = h0.b.a.n.c     // Catch:{ Exception -> 0x0218, all -> 0x0210 }
            int r5 = r3.length     // Catch:{ Exception -> 0x0218, all -> 0x0210 }
            if (r9 >= r5) goto L_0x01fd
            r3 = r3[r9]     // Catch:{ Exception -> 0x0218, all -> 0x0210 }
            android.view.View r3 = r7.g(r1, r8, r3)     // Catch:{ Exception -> 0x0218, all -> 0x0210 }
            if (r3 == 0) goto L_0x01fa
            java.lang.Object[] r7 = r7.e
            r7[r0] = r2
            r7[r4] = r2
            r2 = r3
            goto L_0x021e
        L_0x01fa:
            int r9 = r9 + 1
            goto L_0x01e5
        L_0x01fd:
            java.lang.Object[] r7 = r7.e
            r7[r0] = r2
            r7[r4] = r2
            goto L_0x021e
        L_0x0204:
            android.view.View r8 = r7.g(r1, r8, r2)     // Catch:{ Exception -> 0x0218, all -> 0x0210 }
            java.lang.Object[] r7 = r7.e
            r7[r0] = r2
            r7[r4] = r2
            r2 = r8
            goto L_0x021e
        L_0x0210:
            r8 = move-exception
            java.lang.Object[] r7 = r7.e
            r7[r0] = r2
            r7[r4] = r2
            throw r8
        L_0x0218:
            java.lang.Object[] r7 = r7.e
            r7[r0] = r2
            r7[r4] = r2
        L_0x021e:
            if (r2 == 0) goto L_0x0248
            android.content.Context r7 = r2.getContext()
            boolean r8 = r7 instanceof android.content.ContextWrapper
            if (r8 == 0) goto L_0x0248
            java.util.concurrent.atomic.AtomicInteger r8 = h0.i.i.q.a
            boolean r8 = r2.hasOnClickListeners()
            if (r8 != 0) goto L_0x0231
            goto L_0x0248
        L_0x0231:
            int[] r8 = h0.b.a.n.b
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r10, r8)
            java.lang.String r8 = r7.getString(r0)
            if (r8 == 0) goto L_0x0245
            h0.b.a.n$a r9 = new h0.b.a.n$a
            r9.<init>(r2, r8)
            r2.setOnClickListener(r9)
        L_0x0245:
            r7.recycle()
        L_0x0248:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.a.h.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public void p() {
        S();
        a aVar = this.e2;
        if (aVar != null) {
            aVar.s(true);
        }
    }

    public void q(Bundle bundle) {
    }

    public void r() {
        this.G2 = true;
        C();
    }

    public void s() {
        this.G2 = false;
        S();
        a aVar = this.e2;
        if (aVar != null) {
            aVar.s(false);
        }
    }

    public boolean u(int i3) {
        if (i3 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i3 = 108;
        } else if (i3 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i3 = 109;
        }
        if (this.z2 && i3 == 108) {
            return false;
        }
        if (this.v2 && i3 == 1) {
            this.v2 = false;
        }
        if (i3 == 1) {
            Z();
            this.z2 = true;
            return true;
        } else if (i3 == 2) {
            Z();
            this.t2 = true;
            return true;
        } else if (i3 == 5) {
            Z();
            this.u2 = true;
            return true;
        } else if (i3 == 10) {
            Z();
            this.x2 = true;
            return true;
        } else if (i3 == 108) {
            Z();
            this.v2 = true;
            return true;
        } else if (i3 != 109) {
            return this.b2.requestFeature(i3);
        } else {
            Z();
            this.w2 = true;
            return true;
        }
    }

    public void v(int i3) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.q2.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.a2).inflate(i3, viewGroup);
        this.c2.c.onContentChanged();
    }

    public void w(View view) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.q2.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.c2.c.onContentChanged();
    }

    public void x(View view, ViewGroup.LayoutParams layoutParams) {
        M();
        ViewGroup viewGroup = (ViewGroup) this.q2.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.c2.c.onContentChanged();
    }

    public void y(Toolbar toolbar) {
        CharSequence charSequence;
        if (this.Z1 instanceof Activity) {
            S();
            a aVar = this.e2;
            if (!(aVar instanceof r)) {
                this.f2 = null;
                if (aVar != null) {
                    aVar.i();
                }
                if (toolbar != null) {
                    Object obj = this.Z1;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.g2;
                    }
                    o oVar = new o(toolbar, charSequence, this.c2);
                    this.e2 = oVar;
                    this.b2.setCallback(oVar.c);
                } else {
                    this.e2 = null;
                    this.b2.setCallback(this.c2);
                }
                k();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public void z(int i3) {
        this.J2 = i3;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
