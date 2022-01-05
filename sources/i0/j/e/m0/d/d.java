package i0.j.e.m0.d;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instabug.library.Instabug;
import com.instabug.library.R;
import com.instabug.library.core.eventbus.CurrentActivityLifeCycleEventBus;
import com.instabug.library.internal.g.b.c;
import com.instabug.library.internal.media.AudioPlayer;
import com.instabug.library.internal.video.InternalScreenRecordHelper;
import com.instabug.library.invocation.InvocationManager;
import io.reactivex.disposables.CompositeDisposable;

/* compiled from: ScreenRecordingFab */
public class d implements View.OnClickListener {
    public int Y1 = 0;
    public int Z1 = 0;
    public int a2 = 0;
    public float b2;
    public FrameLayout.LayoutParams c;
    public int c2;
    public final CompositeDisposable d = new CompositeDisposable();
    public boolean d2 = false;
    public boolean e2 = false;
    public boolean f2;
    public boolean g2 = true;
    public i0.j.e.l0.i.b.c h2;
    public i0.j.e.l0.i.b.d i2;
    public i0.j.e.l0.i.a j2;
    public int k2;
    public int l2;
    public int m2;
    public int n2;
    public Handler o2 = new Handler();
    public long p2;
    public int q = 0;
    public FrameLayout q2;
    public int r2;
    public f s2;
    public h t2;
    public Runnable u2 = new a();
    public int x = 0;
    public int y = 0;

    /* compiled from: ScreenRecordingFab */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            d dVar = d.this;
            if (dVar.d2) {
                long currentTimeMillis = System.currentTimeMillis() - dVar.p2;
                f fVar = d.this.s2;
                if (fVar != null) {
                    fVar.g(AudioPlayer.getFormattedDurationText(currentTimeMillis), true);
                }
                if (currentTimeMillis > 30000) {
                    d.this.t2.stop();
                }
                d.this.o2.postDelayed(this, 1000);
            }
        }
    }

    /* compiled from: ScreenRecordingFab */
    public class b implements View.OnClickListener {
        public b() {
        }

        @SuppressLint({"NULL_DEREFERENCE"})
        public void onClick(View view) {
            Context applicationContext = Instabug.getApplicationContext();
            if (applicationContext != null) {
                i0.j.e.l0.i.b.c cVar = d.this.h2;
                if (cVar.f2) {
                    cVar.g();
                } else {
                    cVar.f2 = true;
                    cVar.b();
                    cVar.setTextColor(-1);
                }
                if (cVar.f2) {
                    i0.j.e.c1.b.r(applicationContext);
                    d.this.g2 = false;
                    return;
                }
                i0.j.e.c1.b.p(applicationContext);
                d.this.g2 = true;
            }
        }
    }

    /* compiled from: ScreenRecordingFab */
    public class c implements k0.b.y.d<Boolean> {
        public c() {
        }

        @SuppressLint({"NULL_DEREFERENCE"})
        public void b(Object obj) throws Exception {
            d.this.i2.setEnabled(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: i0.j.e.m0.d.d$d  reason: collision with other inner class name */
    /* compiled from: ScreenRecordingFab */
    public class C0182d implements View.OnClickListener {
        public C0182d() {
        }

        public void onClick(View view) {
            d dVar = d.this;
            if (dVar.d2) {
                dVar.e();
                h hVar = d.this.t2;
                if (hVar != null) {
                    hVar.stop();
                }
                d dVar2 = d.this;
                dVar2.d2 = false;
                dVar2.o2.removeCallbacks(dVar2.u2);
            }
        }
    }

    /* compiled from: ScreenRecordingFab */
    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0036 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0041 */
        static {
            /*
                com.instabug.library.tracking.ActivityLifeCycleEvent.values()
                r0 = 6
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                com.instabug.library.tracking.ActivityLifeCycleEvent r2 = com.instabug.library.tracking.ActivityLifeCycleEvent.RESUMED     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001c }
                com.instabug.library.tracking.ActivityLifeCycleEvent r3 = com.instabug.library.tracking.ActivityLifeCycleEvent.PAUSED     // Catch:{ NoSuchFieldError -> 0x001c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition.values()
                r2 = 4
                int[] r3 = new int[r2]
                a = r3
                com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition r4 = com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition.BOTTOM_RIGHT     // Catch:{ NoSuchFieldError -> 0x002c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002c }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x002c }
            L_0x002c:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0036 }
                com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition r3 = com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition.BOTTOM_LEFT     // Catch:{ NoSuchFieldError -> 0x0036 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0036 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0036 }
            L_0x0036:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0041 }
                com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition r1 = com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x0041 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0041 }
                r3 = 3
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0041 }
            L_0x0041:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition r1 = com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition.TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.j.e.m0.d.d.e.<clinit>():void");
        }
    }

    /* compiled from: ScreenRecordingFab */
    public class f extends com.instabug.library.internal.g.b.c {
        public GestureDetector j2;
        public boolean k2 = true;
        public a l2;
        public long m2;
        public float n2;
        public float o2;
        public boolean p2 = false;

        /* compiled from: ScreenRecordingFab */
        public class a implements Runnable {
            public Handler c = new Handler(Looper.getMainLooper());
            public float d;
            public float q;
            public long x;

            public a(a aVar) {
            }

            public void run() {
                if (f.this.getParent() != null) {
                    float min = Math.min(1.0f, ((float) (System.currentTimeMillis() - this.x)) / 400.0f);
                    float f = this.d;
                    f fVar = f.this;
                    d dVar = d.this;
                    int i = dVar.q;
                    float f2 = this.q;
                    int i2 = dVar.x;
                    fVar.h((int) (((float) i) + ((f - ((float) i)) * min)), (int) (((float) i2) + ((f2 - ((float) i2)) * min)));
                    if (min < 1.0f) {
                        this.c.post(this);
                    }
                }
            }
        }

        public f(Context context) {
            super(context);
            this.j2 = new GestureDetector(context, new g());
            this.l2 = new a((a) null);
            setId(R.id.instabug_floating_button);
        }

        public void h(int i, int i2) {
            d dVar = d.this;
            dVar.q = i;
            dVar.x = i2;
            FrameLayout.LayoutParams layoutParams = dVar.c;
            if (layoutParams != null) {
                layoutParams.leftMargin = i;
                int i3 = dVar.y;
                int i4 = i3 - i;
                layoutParams.rightMargin = i4;
                if (dVar.a2 == 2 && dVar.Z1 > i3) {
                    layoutParams.rightMargin = (int) ((dVar.b2 * 48.0f) + ((float) i4));
                }
                layoutParams.topMargin = i2;
                layoutParams.bottomMargin = dVar.Y1 - i2;
                setLayoutParams(layoutParams);
            }
        }

        public final void i() {
            int i;
            d dVar = d.this;
            int i2 = dVar.q >= dVar.y / 2 ? dVar.l2 : 0;
            if (dVar.x >= dVar.Y1 / 2) {
                i = dVar.n2;
            } else {
                i = dVar.m2;
            }
            a aVar = this.l2;
            if (aVar != null) {
                aVar.d = (float) i2;
                aVar.q = (float) i;
                aVar.x = System.currentTimeMillis();
                aVar.c.post(aVar);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r0 = r9.j2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r10) {
            /*
                r9 = this;
                boolean r0 = r9.k2
                r1 = 0
                if (r0 == 0) goto L_0x000e
                android.view.GestureDetector r0 = r9.j2
                if (r0 == 0) goto L_0x000e
                boolean r0 = r0.onTouchEvent(r10)
                goto L_0x000f
            L_0x000e:
                r0 = r1
            L_0x000f:
                r2 = 1
                if (r0 == 0) goto L_0x0017
                r9.i()
                goto L_0x00e0
            L_0x0017:
                float r0 = r10.getRawX()
                float r3 = r10.getRawY()
                int r10 = r10.getAction()
                if (r10 != 0) goto L_0x0038
                long r4 = java.lang.System.currentTimeMillis()
                r9.m2 = r4
                i0.j.e.m0.d.d$f$a r10 = r9.l2
                if (r10 == 0) goto L_0x0034
                android.os.Handler r1 = r10.c
                r1.removeCallbacks(r10)
            L_0x0034:
                r9.p2 = r2
                goto L_0x00dc
            L_0x0038:
                if (r10 != r2) goto L_0x0051
                long r4 = java.lang.System.currentTimeMillis()
                long r6 = r9.m2
                long r4 = r4 - r6
                r6 = 200(0xc8, double:9.9E-322)
                int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r10 >= 0) goto L_0x004a
                r9.performClick()
            L_0x004a:
                r9.p2 = r1
                r9.i()
                goto L_0x00dc
            L_0x0051:
                r4 = 2
                if (r10 != r4) goto L_0x00dc
                boolean r10 = r9.p2
                if (r10 == 0) goto L_0x00dc
                float r10 = r9.n2
                float r10 = r0 - r10
                float r5 = r9.o2
                float r5 = r3 - r5
                i0.j.e.m0.d.d r6 = i0.j.e.m0.d.d.this
                int r7 = r6.x
                float r7 = (float) r7
                float r7 = r7 + r5
                r8 = 1112014848(0x42480000, float:50.0)
                int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r8 <= 0) goto L_0x00a3
                int r6 = r6.q
                float r6 = (float) r6
                float r6 = r6 + r10
                int r6 = (int) r6
                int r7 = (int) r7
                r9.h(r6, r7)
                i0.j.e.m0.d.d r6 = i0.j.e.m0.d.d.this
                r6.g()
                i0.j.e.m0.d.d r6 = i0.j.e.m0.d.d.this
                boolean r7 = r6.e2
                if (r7 == 0) goto L_0x009e
                r7 = 0
                int r8 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r8 == 0) goto L_0x0091
                int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r7 == 0) goto L_0x0091
                float r7 = r10 * r5
                r8 = 1065353216(0x3f800000, float:1.0)
                int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r7 > 0) goto L_0x0098
            L_0x0091:
                float r10 = r10 * r5
                r5 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
                if (r10 >= 0) goto L_0x0099
            L_0x0098:
                r1 = r2
            L_0x0099:
                if (r1 == 0) goto L_0x009e
                r6.d()
            L_0x009e:
                i0.j.e.m0.d.d r10 = i0.j.e.m0.d.d.this
                r10.f()
            L_0x00a3:
                boolean r10 = r9.k2
                if (r10 == 0) goto L_0x00dc
                boolean r10 = r9.p2
                if (r10 != 0) goto L_0x00dc
                i0.j.e.m0.d.d r10 = i0.j.e.m0.d.d.this
                android.widget.FrameLayout$LayoutParams r10 = r10.c
                if (r10 == 0) goto L_0x00dc
                int r10 = r10.rightMargin
                int r10 = java.lang.Math.abs(r10)
                r1 = 50
                if (r10 >= r1) goto L_0x00dc
                i0.j.e.m0.d.d r10 = i0.j.e.m0.d.d.this
                android.widget.FrameLayout$LayoutParams r10 = r10.c
                int r10 = r10.topMargin
                android.content.Context r1 = r9.getContext()
                android.content.res.Resources r1 = r1.getResources()
                android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
                int r1 = r1.heightPixels
                int r1 = r1 / r4
                int r10 = r10 - r1
                int r10 = java.lang.Math.abs(r10)
                r1 = 250(0xfa, float:3.5E-43)
                if (r10 >= r1) goto L_0x00dc
                r9.i()
            L_0x00dc:
                r9.n2 = r0
                r9.o2 = r3
            L_0x00e0:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.j.e.m0.d.d.f.onTouchEvent(android.view.MotionEvent):boolean");
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            d.this.c = (FrameLayout.LayoutParams) layoutParams;
            super.setLayoutParams(layoutParams);
        }
    }

    /* compiled from: ScreenRecordingFab */
    public static class g extends GestureDetector.SimpleOnGestureListener {
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return Math.abs(motionEvent2.getX() - motionEvent.getX()) < 90.0f && motionEvent2.getY() - motionEvent.getY() > 90.0f;
        }
    }

    /* compiled from: ScreenRecordingFab */
    public interface h {
        void start();

        void stop();
    }

    public d(h hVar) {
        this.t2 = hVar;
    }

    public void a() {
        this.d.add(CurrentActivityLifeCycleEventBus.getInstance().subscribe(new f(this)));
        this.d.add(i0.j.e.y.a.a.a().subscribe(new e(this)));
    }

    public final void b(Activity activity, int i, int i3) {
        FrameLayout.LayoutParams layoutParams;
        i0.j.e.l0.i.a aVar;
        FrameLayout frameLayout = this.q2;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.q2 = new FrameLayout(activity);
        this.a2 = activity.getResources().getConfiguration().orientation;
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i4 = rect.top;
        this.b2 = activity.getResources().getDisplayMetrics().density;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        this.Z1 = displayMetrics.widthPixels;
        this.r2 = (int) activity.getResources().getDimension(R.dimen.instabug_fab_size_normal);
        this.c2 = (int) activity.getResources().getDimension(R.dimen.instabug_fab_size_mini);
        int dimension = (int) activity.getResources().getDimension(R.dimen.instabug_fab_actions_spacing);
        this.k2 = dimension;
        int i5 = this.r2 + dimension;
        this.l2 = i - i5;
        this.m2 = i4;
        this.n2 = i3 - i5;
        i0.j.e.l0.i.a aVar2 = new i0.j.e.l0.i.a(activity);
        this.j2 = aVar2;
        aVar2.setText(R.string.instabug_str_video_recording_hint);
        this.h2 = new i0.j.e.l0.i.b.c(activity);
        if (!i0.j.e.c1.b.o() && this.h2.getVisibility() == 0) {
            this.h2.setVisibility(8);
        }
        if (this.g2) {
            this.h2.g();
        } else {
            i0.j.e.l0.i.b.c cVar = this.h2;
            cVar.f2 = true;
            cVar.b();
            cVar.setTextColor(-1);
        }
        this.h2.setOnClickListener(new b());
        this.i2 = new i0.j.e.l0.i.b.d(activity);
        this.d.add(InternalScreenRecordHelper.getInstance().getIsStoppableObservable().t(new c(), k0.b.z.b.a.e, k0.b.z.b.a.c, k0.b.z.b.a.d));
        this.i2.setOnClickListener(new C0182d());
        this.s2 = new f(activity);
        if (this.c == null) {
            int i6 = this.r2;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i6, i6, 51);
            this.c = layoutParams2;
            this.s2.setLayoutParams(layoutParams2);
            int i7 = e.a[InvocationManager.getInstance().getCurrentInvocationSettings().getVideoRecordingButtonPosition().ordinal()];
            if (i7 == 1) {
                this.s2.h(this.l2, this.n2);
            } else if (i7 == 2) {
                this.s2.h(0, this.n2);
            } else if (i7 == 3) {
                this.s2.h(0, this.m2);
            } else if (i7 != 4) {
                this.s2.h(this.l2, this.n2);
            } else {
                this.s2.h(this.l2, this.m2);
            }
        } else {
            this.q = Math.round(((float) (this.q * i)) / ((float) i));
            int round = Math.round(((float) (this.x * i3)) / ((float) i3));
            this.x = round;
            FrameLayout.LayoutParams layoutParams3 = this.c;
            int i8 = this.q;
            layoutParams3.leftMargin = i8;
            layoutParams3.rightMargin = i - i8;
            layoutParams3.topMargin = round;
            layoutParams3.bottomMargin = i3 - round;
            this.s2.setLayoutParams(layoutParams3);
            this.s2.i();
        }
        if (!this.d2 && (layoutParams = this.c) != null && !this.f2 && layoutParams.leftMargin != 0) {
            this.f2 = true;
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            i0.j.e.l0.i.a aVar3 = this.j2;
            if (aVar3 != null) {
                aVar3.setLayoutParams(layoutParams4);
                this.j2.post(new g(this, layoutParams4));
            }
            FrameLayout frameLayout2 = this.q2;
            if (!(frameLayout2 == null || (aVar = this.j2) == null)) {
                frameLayout2.addView(aVar);
            }
        }
        this.s2.setOnClickListener(this);
        this.q2.addView(this.s2);
        c.b bVar = this.d2 ? c.b.RECORDING : c.b.STOPPED;
        f fVar = this.s2;
        if (fVar != null) {
            fVar.setRecordingState(bVar);
        }
        ((FrameLayout) activity.getWindow().getDecorView()).addView(this.q2, new ViewGroup.LayoutParams(-1, -1));
    }

    public void c() {
        this.d.clear();
        this.d2 = false;
        this.g2 = true;
        this.e2 = false;
        this.o2.removeCallbacks(this.u2);
        e();
    }

    public final void d() {
        i0.j.e.l0.i.b.d dVar;
        i0.j.e.l0.i.b.c cVar;
        FrameLayout frameLayout = this.q2;
        if (!(frameLayout == null || (cVar = this.h2) == null)) {
            frameLayout.removeView(cVar);
        }
        FrameLayout frameLayout2 = this.q2;
        if (!(frameLayout2 == null || (dVar = this.i2) == null)) {
            frameLayout2.removeView(dVar);
        }
        this.e2 = false;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public final void e() {
        FrameLayout frameLayout = this.q2;
        if (frameLayout != null) {
            frameLayout.setOnClickListener((View.OnClickListener) null);
            if (this.q2.getParent() != null && (this.q2.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.q2.getParent()).removeView(this.q2);
            }
        }
    }

    public final void f() {
        i0.j.e.l0.i.a aVar;
        if (this.f2) {
            this.f2 = false;
            FrameLayout frameLayout = this.q2;
            if (frameLayout != null && (aVar = this.j2) != null) {
                frameLayout.removeView(aVar);
            }
        }
    }

    public final void g() {
        int i;
        int i3;
        int i4 = this.c2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i4);
        FrameLayout.LayoutParams layoutParams2 = this.c;
        if (layoutParams2 != null) {
            int i5 = layoutParams2.leftMargin;
            int i6 = (this.r2 - this.c2) / 2;
            layoutParams.leftMargin = i5 + i6;
            layoutParams.rightMargin = layoutParams2.rightMargin + i6;
        }
        FrameLayout.LayoutParams layoutParams3 = null;
        if (!(this.i2 == null || layoutParams2 == null)) {
            layoutParams3 = new FrameLayout.LayoutParams(this.i2.getWidth(), this.i2.getHeight());
            FrameLayout.LayoutParams layoutParams4 = this.c;
            int i7 = layoutParams4.leftMargin;
            int i8 = (this.r2 - this.c2) / 2;
            layoutParams3.leftMargin = i7 + i8;
            layoutParams3.rightMargin = layoutParams4.rightMargin + i8;
        }
        int i9 = this.c2;
        int i10 = this.k2;
        int i11 = ((i10 * 2) + i9) * 2;
        FrameLayout.LayoutParams layoutParams5 = this.c;
        if (layoutParams5 != null) {
            int i12 = layoutParams5.topMargin;
            if (i12 > i11) {
                int i13 = i9 + i10;
                i = i12 - i13;
                i3 = i - i13;
            } else {
                i = i12 + this.r2 + i10;
                i3 = i9 + i + i10;
            }
            if (layoutParams3 != null) {
                layoutParams3.topMargin = i;
            }
            layoutParams.topMargin = i3;
        }
        i0.j.e.l0.i.b.c cVar = this.h2;
        if (cVar != null) {
            cVar.setLayoutParams(layoutParams);
        }
        i0.j.e.l0.i.b.d dVar = this.i2;
        if (dVar != null && layoutParams3 != null) {
            dVar.setLayoutParams(layoutParams3);
        }
    }

    public void onClick(View view) {
        i0.j.e.l0.i.b.d dVar;
        i0.j.e.l0.i.b.c cVar;
        if (this.e2) {
            d();
        } else {
            FrameLayout.LayoutParams layoutParams = this.c;
            if (layoutParams == null || ((Math.abs(layoutParams.leftMargin + 0) <= 20 || Math.abs(this.c.leftMargin - this.l2) <= 20) && (Math.abs(this.c.topMargin - this.m2) <= 20 || Math.abs(this.c.topMargin - this.n2) <= 20))) {
                g();
                i0.j.e.l0.i.b.c cVar2 = this.h2;
                if (!(cVar2 == null || cVar2.getParent() == null)) {
                    ((ViewGroup) this.h2.getParent()).removeView(this.h2);
                }
                FrameLayout frameLayout = this.q2;
                if (!(frameLayout == null || (cVar = this.h2) == null)) {
                    frameLayout.addView(cVar);
                }
                i0.j.e.l0.i.b.d dVar2 = this.i2;
                if (!(dVar2 == null || dVar2.getParent() == null)) {
                    ((ViewGroup) this.i2.getParent()).removeView(this.i2);
                }
                FrameLayout frameLayout2 = this.q2;
                if (!(frameLayout2 == null || (dVar = this.i2) == null)) {
                    frameLayout2.addView(dVar);
                }
                this.e2 = true;
            }
        }
        if (!this.d2) {
            f fVar = this.s2;
            if (fVar != null) {
                fVar.g("00:00", true);
            }
            this.d2 = true;
            h hVar = this.t2;
            if (hVar != null) {
                hVar.start();
            }
            f fVar2 = this.s2;
            if (fVar2 != null) {
                fVar2.setRecordingState(c.b.RECORDING);
            }
        }
        f();
    }
}
