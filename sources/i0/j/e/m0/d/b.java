package i0.j.e.m0.d;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.instabug.library.Instabug;
import com.instabug.library.R;
import com.instabug.library._InstabugActivity;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.invocation.util.InstabugFloatingButtonEdge;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.threading.PoolProvider;
import h0.v.a.k;
import java.util.Objects;

/* compiled from: FloatingButtonInvoker */
public class b implements a<Void>, View.OnClickListener {
    public static final /* synthetic */ int c = 0;
    public int Y1 = 0;
    public int Z1 = 0;
    public int a2 = 0;
    public float b2;
    public i0.j.e.m0.a c2;
    public FrameLayout.LayoutParams d;
    public e d2;
    public d e2;
    public int f2;
    public volatile boolean g2;
    public int q;
    public int x = 0;
    public int y;

    /* compiled from: FloatingButtonInvoker */
    public class a implements Runnable {
        public final /* synthetic */ Activity c;

        public a(Activity activity) {
            this.c = activity;
        }

        public void run() {
            b bVar = b.this;
            Activity activity = this.c;
            Objects.requireNonNull(bVar);
            bVar.d2 = new e(activity);
            bVar.a2 = activity.getResources().getConfiguration().orientation;
            bVar.b2 = activity.getResources().getDisplayMetrics().density;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            int i = bVar.y;
            int i2 = bVar.Y1;
            bVar.Y1 = activity.getResources().getDisplayMetrics().heightPixels;
            bVar.y = activity.getResources().getDisplayMetrics().widthPixels;
            activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            bVar.Z1 = displayMetrics.widthPixels;
            bVar.f2 = (int) (bVar.b2 * 56.0f);
            bVar.e2 = new d(activity);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            shapeDrawable2.getPaint().setColor(Instabug.getPrimaryColor());
            shapeDrawable.getPaint().setColor(Instabug.getPrimaryColor());
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable2, shapeDrawable});
            LayerDrawable layerDrawable2 = layerDrawable;
            layerDrawable2.setLayerInset(0, 0, 0, 0, 0);
            layerDrawable2.setLayerInset(1, 2, 2, 2, 2);
            bVar.e2.setBackgroundDrawable(layerDrawable);
            bVar.e2.setImageDrawable(activity.getResources().getDrawable(R.drawable.ibg_core_ic_floating_btn));
            bVar.e2.setScaleType(ImageView.ScaleType.CENTER);
            if (bVar.d != null) {
                bVar.q = Math.round(((float) (bVar.q * bVar.y)) / ((float) i));
                int round = Math.round(((float) (bVar.x * bVar.Y1)) / ((float) i2));
                bVar.x = round;
                FrameLayout.LayoutParams layoutParams = bVar.d;
                int i3 = bVar.q;
                layoutParams.leftMargin = i3;
                layoutParams.rightMargin = bVar.y - i3;
                layoutParams.topMargin = round;
                layoutParams.bottomMargin = bVar.Y1 - round;
                bVar.e2.setLayoutParams(layoutParams);
                bVar.e2.a();
            } else if (InvocationManager.getInstance().getCurrentInvocationSettings().getFloatingButtonParams().a == InstabugFloatingButtonEdge.LEFT) {
                int i4 = bVar.f2;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i4, i4, 51);
                bVar.d = layoutParams2;
                bVar.e2.setLayoutParams(layoutParams2);
                bVar.e2.b(-10, InvocationManager.getInstance().getCurrentInvocationSettings().getFloatingButtonParams().b);
            } else {
                int i5 = bVar.f2;
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i5, i5, 53);
                bVar.d = layoutParams3;
                bVar.e2.setLayoutParams(layoutParams3);
                bVar.e2.b(bVar.y + 10, InvocationManager.getInstance().getCurrentInvocationSettings().getFloatingButtonParams().b);
            }
            bVar.e2.setOnClickListener(bVar);
            bVar.e2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            bVar.d2.addView(bVar.e2);
            ((FrameLayout) activity.getWindow().getDecorView()).addView(bVar.d2, new ViewGroup.LayoutParams(-1, -1));
            bVar.g2 = true;
        }
    }

    /* renamed from: i0.j.e.m0.d.b$b  reason: collision with other inner class name */
    /* compiled from: FloatingButtonInvoker */
    public class C0181b implements Runnable {
        public C0181b() {
        }

        public void run() {
            b.this.d();
        }
    }

    /* compiled from: FloatingButtonInvoker */
    public static class c extends GestureDetector.SimpleOnGestureListener {
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return Math.abs(motionEvent2.getX() - motionEvent.getX()) < 90.0f && motionEvent2.getY() - motionEvent.getY() > 90.0f;
        }
    }

    @SuppressLint({"AppCompatCustomView"})
    /* compiled from: FloatingButtonInvoker */
    public class d extends ImageButton {
        public float Y1;
        public boolean Z1 = false;
        public GestureDetector c;
        public boolean d = true;
        public a q;
        public long x;
        public float y;

        /* compiled from: FloatingButtonInvoker */
        public class a implements Runnable {
            public Handler c = new Handler(Looper.getMainLooper());
            public float d;
            public float q;
            public long x;

            public a(a aVar) {
            }

            public void run() {
                if (d.this.getParent() != null) {
                    float min = Math.min(1.0f, ((float) (System.currentTimeMillis() - this.x)) / 400.0f);
                    float f = this.d;
                    d dVar = d.this;
                    b bVar = b.this;
                    float f2 = (float) bVar.q;
                    float f3 = this.q;
                    float f4 = (float) bVar.x;
                    dVar.b((int) (f2 + ((f - f2) * min)), (int) (f4 + ((f3 - f4) * min)));
                    if (min < 1.0f) {
                        this.c.post(this);
                    }
                }
            }
        }

        public d(Context context) {
            super(context);
            this.c = new GestureDetector(context, new c());
            this.q = new a((a) null);
            setId(R.id.instabug_floating_button);
        }

        public final void a() {
            float f;
            if (InvocationManager.getInstance().getCurrentInvocationSettings().getFloatingButtonParams().a == InstabugFloatingButtonEdge.LEFT) {
                b bVar = b.this;
                int i = bVar.y;
                float f2 = ((float) bVar.q) >= ((float) i) / 2.0f ? (float) ((i - bVar.f2) + 10) : -10.0f;
                a aVar = this.q;
                if (aVar != null) {
                    int i2 = bVar.x;
                    int i3 = bVar.Y1;
                    int i4 = bVar.f2;
                    float f3 = i2 > i3 - i4 ? (float) (i3 - (i4 * 2)) : (float) i2;
                    aVar.d = f2;
                    aVar.q = f3;
                    aVar.x = System.currentTimeMillis();
                    aVar.c.post(aVar);
                    return;
                }
                return;
            }
            b bVar2 = b.this;
            int i5 = bVar2.y;
            if (((float) bVar2.q) >= ((float) i5) / 2.0f) {
                f = (float) (i5 + 10);
            } else {
                f = (float) (bVar2.f2 - 10);
            }
            a aVar2 = this.q;
            if (aVar2 != null) {
                int i6 = bVar2.x;
                int i7 = bVar2.Y1;
                int i8 = bVar2.f2;
                float f4 = i6 > i7 - i8 ? (float) (i7 - (i8 * 2)) : (float) i6;
                aVar2.d = f;
                aVar2.q = f4;
                aVar2.x = System.currentTimeMillis();
                aVar2.c.post(aVar2);
            }
        }

        public void b(int i, int i2) {
            b bVar = b.this;
            bVar.q = i;
            bVar.x = i2;
            FrameLayout.LayoutParams layoutParams = bVar.d;
            if (layoutParams != null) {
                layoutParams.leftMargin = i;
                int i3 = bVar.y;
                int i4 = i3 - i;
                layoutParams.rightMargin = i4;
                if (bVar.a2 == 2 && bVar.Z1 > i3) {
                    layoutParams.rightMargin = (int) ((bVar.b2 * 48.0f) + ((float) i4));
                }
                layoutParams.topMargin = i2;
                layoutParams.bottomMargin = bVar.Y1 - i2;
                setLayoutParams(layoutParams);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r0 = r8.c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                boolean r0 = r8.d
                r1 = 0
                if (r0 == 0) goto L_0x000e
                android.view.GestureDetector r0 = r8.c
                if (r0 == 0) goto L_0x000e
                boolean r0 = r0.onTouchEvent(r9)
                goto L_0x000f
            L_0x000e:
                r0 = r1
            L_0x000f:
                r2 = 1
                if (r0 == 0) goto L_0x0017
                r8.a()
                goto L_0x00b1
            L_0x0017:
                float r0 = r9.getRawX()
                float r3 = r9.getRawY()
                int r9 = r9.getAction()
                if (r9 != 0) goto L_0x0038
                long r4 = java.lang.System.currentTimeMillis()
                r8.x = r4
                i0.j.e.m0.d.b$d$a r9 = r8.q
                if (r9 == 0) goto L_0x0034
                android.os.Handler r1 = r9.c
                r1.removeCallbacks(r9)
            L_0x0034:
                r8.Z1 = r2
                goto L_0x00ad
            L_0x0038:
                if (r9 != r2) goto L_0x0050
                long r4 = java.lang.System.currentTimeMillis()
                long r6 = r8.x
                long r4 = r4 - r6
                r6 = 200(0xc8, double:9.9E-322)
                int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r9 >= 0) goto L_0x004a
                r8.performClick()
            L_0x004a:
                r8.Z1 = r1
                r8.a()
                goto L_0x00ad
            L_0x0050:
                r1 = 2
                if (r9 != r1) goto L_0x00ad
                boolean r9 = r8.Z1
                if (r9 == 0) goto L_0x00ad
                float r9 = r8.y
                float r9 = r0 - r9
                float r4 = r8.Y1
                float r4 = r3 - r4
                i0.j.e.m0.d.b r5 = i0.j.e.m0.d.b.this
                int r6 = r5.x
                float r6 = (float) r6
                float r6 = r6 + r4
                r4 = 1112014848(0x42480000, float:50.0)
                int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r4 <= 0) goto L_0x0074
                int r4 = r5.q
                float r4 = (float) r4
                float r4 = r4 + r9
                int r9 = (int) r4
                int r4 = (int) r6
                r8.b(r9, r4)
            L_0x0074:
                i0.j.e.m0.d.b r9 = i0.j.e.m0.d.b.this
                android.widget.FrameLayout$LayoutParams r9 = r9.d
                if (r9 == 0) goto L_0x00ad
                boolean r4 = r8.d
                if (r4 == 0) goto L_0x00ad
                boolean r4 = r8.Z1
                if (r4 != 0) goto L_0x00ad
                int r9 = r9.rightMargin
                int r9 = java.lang.Math.abs(r9)
                r4 = 50
                if (r9 >= r4) goto L_0x00ad
                i0.j.e.m0.d.b r9 = i0.j.e.m0.d.b.this
                android.widget.FrameLayout$LayoutParams r9 = r9.d
                int r9 = r9.topMargin
                android.content.Context r4 = r8.getContext()
                android.content.res.Resources r4 = r4.getResources()
                android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
                int r4 = r4.heightPixels
                int r4 = r4 / r1
                int r9 = r9 - r4
                int r9 = java.lang.Math.abs(r9)
                r1 = 250(0xfa, float:3.5E-43)
                if (r9 >= r1) goto L_0x00ad
                r8.a()
            L_0x00ad:
                r8.y = r0
                r8.Y1 = r3
            L_0x00b1:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.j.e.m0.d.b.d.onTouchEvent(android.view.MotionEvent):boolean");
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            b.this.d = (FrameLayout.LayoutParams) layoutParams;
            super.setLayoutParams(layoutParams);
        }
    }

    /* compiled from: FloatingButtonInvoker */
    public static class e extends FrameLayout {
        public e(Context context) {
            super(context);
        }
    }

    /* compiled from: FloatingButtonInvoker */
    public static class f {
        public InstabugFloatingButtonEdge a = InstabugFloatingButtonEdge.RIGHT;
        public int b = k.d.DEFAULT_SWIPE_ANIMATION_DURATION;
    }

    static {
        Class<b> cls = b.class;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public b(i0.j.e.m0.a aVar) {
        this.c2 = aVar;
    }

    public void a() {
        Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
        if (currentActivity != null && !(currentActivity instanceof _InstabugActivity) && !currentActivity.getClass().getName().contains("PlayCoreDialogWrapperActivity")) {
            PoolProvider.postMainThreadTask(new a(currentActivity));
        }
    }

    public boolean b() {
        return this.g2;
    }

    public void c() {
        this.g2 = false;
        PoolProvider.postMainThreadTask(new C0181b());
    }

    public final void d() {
        e eVar = this.d2;
        if (eVar != null) {
            eVar.removeAllViews();
            this.d = null;
            this.e2 = null;
            if (this.d2.getParent() != null && (this.d2.getParent() instanceof ViewGroup)) {
                ((ViewGroup) this.d2.getParent()).removeView(this.d2);
                this.g2 = false;
                this.d2 = null;
            }
        }
    }

    public void onClick(View view) {
        d();
        ((i0.j.e.m0.c) this.c2).c((Uri) null);
        InvocationManager.getInstance().setLastUsedInvoker(this);
    }
}
