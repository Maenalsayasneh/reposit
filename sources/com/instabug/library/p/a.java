package com.instabug.library.p;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.HorizontalScrollView;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;
import com.instabug.library.Instabug;
import com.instabug.library.model.StepType;
import com.instabug.library.visualusersteps.VisualUserStep;
import i0.j.e.f1.g;
import i0.j.e.f1.m;
import i0.j.e.f1.n;

/* compiled from: MotionEventRecognizer */
public class a {
    public static a a;
    public final GestureDetector b = new GestureDetector(Instabug.getApplicationContext(), new c((C0108a) null));
    public final ScaleGestureDetector c = new ScaleGestureDetector(Instabug.getApplicationContext(), new d((C0108a) null));
    public final int d = ViewConfiguration.getLongPressTimeout();
    public final int e = 200;
    public float f;
    public float g;
    public long h = -1;
    public long i = -1;
    public boolean j = false;
    public boolean k = false;

    /* renamed from: com.instabug.library.p.a$a  reason: collision with other inner class name */
    /* compiled from: MotionEventRecognizer */
    public class C0108a implements g.b {
        public final /* synthetic */ View a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public C0108a(View view, String str, String str2) {
            this.a = view;
            this.b = str;
            this.c = str2;
        }

        public void a(i0.j.e.f1.c cVar, i0.j.e.f1.d dVar) {
            if (dVar != null) {
                View view = this.a;
                if (!(view instanceof EditText)) {
                    n.k().c(cVar, this.b, this.c, dVar.a, dVar.b);
                } else if (!view.isFocusable()) {
                    n.k().c(cVar, this.b, this.c, dVar.a, dVar.b);
                }
            }
        }
    }

    /* compiled from: MotionEventRecognizer */
    public static class b {
        public View a;
        public C0109a b;

        /* renamed from: com.instabug.library.p.a$b$a  reason: collision with other inner class name */
        /* compiled from: MotionEventRecognizer */
        public enum C0109a {
            SCROLLABLE,
            SWIPEABLE
        }

        public b(C0109a aVar, View view) {
            this.a = view;
            this.b = aVar;
        }
    }

    /* compiled from: MotionEventRecognizer */
    public class c extends GestureDetector.SimpleOnGestureListener {
        public MotionEvent a;

        public c(C0108a aVar) {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (a.this.k) {
                return false;
            }
            m mVar = n.k().c;
            if (mVar.b() != null && mVar.b().e.size() > 0) {
                VisualUserStep last = mVar.b().e.getLast();
                if (last.getStepType() != null && last.getStepType().equals(StepType.TAP)) {
                    i0.j.e.f1.c b2 = mVar.b();
                    if (!b2.e.isEmpty()) {
                        b2.e.pollLast();
                    }
                    mVar.b--;
                }
            }
            a.this.b(StepType.DOUBLE_TAP, motionEvent);
            a.this.k = true;
            return false;
        }

        public boolean onDown(MotionEvent motionEvent) {
            this.a = motionEvent;
            return super.onDown(motionEvent);
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent2 == null) {
                motionEvent2 = this.a;
            }
            a.this.b(StepType.FLING, motionEvent2);
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            a aVar = a.this;
            if (!aVar.j) {
                aVar.b(StepType.LONG_PRESS, motionEvent);
                a.this.j = true;
            }
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return false;
        }
    }

    /* compiled from: MotionEventRecognizer */
    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public d(C0108a aVar) {
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            a.this.a(StepType.PINCH, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:383:0x077e  */
    /* JADX WARNING: Removed duplicated region for block: B:411:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:412:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0203  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r17, float r18, float r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            r2 = r19
            int r3 = (int) r0
            int r4 = (int) r2
            com.instabug.library.invocation.InvocationManager r5 = com.instabug.library.invocation.InvocationManager.getInstance()
            java.util.List r5 = r5.getCurrentInvokers()
            if (r5 == 0) goto L_0x005e
            java.util.Iterator r5 = r5.iterator()
        L_0x0016:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x005e
            java.lang.Object r6 = r5.next()
            i0.j.e.m0.d.a r6 = (i0.j.e.m0.d.a) r6
            boolean r7 = r6 instanceof i0.j.e.m0.d.b
            if (r7 == 0) goto L_0x0016
            i0.j.e.m0.d.b r6 = (i0.j.e.m0.d.b) r6
            i0.j.e.m0.d.b$d r5 = r6.e2
            if (r5 == 0) goto L_0x0054
            float r7 = r5.y
            r8 = 0
            int r9 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r9 == 0) goto L_0x0054
            float r9 = r5.Y1
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x003a
            goto L_0x0054
        L_0x003a:
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r5 = r5 + r7
            i0.j.e.m0.d.b$d r6 = r6.e2
            float r8 = r6.Y1
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r8 = r8 + r6
            android.graphics.Rect r6 = new android.graphics.Rect
            int r7 = (int) r7
            int r9 = (int) r9
            int r5 = (int) r5
            int r8 = (int) r8
            r6.<init>(r7, r9, r5, r8)
            goto L_0x0059
        L_0x0054:
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
        L_0x0059:
            boolean r3 = r6.contains(r3, r4)
            goto L_0x005f
        L_0x005e:
            r3 = 0
        L_0x005f:
            if (r3 == 0) goto L_0x0062
            return
        L_0x0062:
            com.instabug.library.tracking.InstabugInternalTrackingDelegate r3 = com.instabug.library.tracking.InstabugInternalTrackingDelegate.getInstance()
            android.app.Activity r3 = r3.getTargetActivity()
            if (r3 != 0) goto L_0x006d
            return
        L_0x006d:
            i0.j.e.f1.p.a r4 = new i0.j.e.f1.p.a
            r4.<init>()
            i0.j.e.f1.p.j r5 = new i0.j.e.f1.p.j
            android.view.Window r6 = r3.getWindow()
            android.view.View r6 = r6.getDecorView()
            boolean r7 = r6 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x008b
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r4.a(r6, r7)
            goto L_0x008f
        L_0x008b:
            java.util.Set r7 = java.util.Collections.singleton(r6)
        L_0x008f:
            r5.<init>(r7)
            k0.b.l r4 = k0.b.l.m(r7)
            i0.j.e.f1.p.b r5 = new i0.j.e.f1.p.b
            r5.<init>()
            k0.b.l r4 = r4.i(r5)
            i0.j.e.f1.p.c r5 = new i0.j.e.f1.p.c
            r5.<init>(r0, r2)
            k0.b.l r0 = r4.i(r5)
            java.util.Objects.requireNonNull(r0)
            r2 = 16
            java.lang.String r4 = "capacityHint"
            k0.b.z.b.b.a(r2, r4)
            k0.b.z.e.c.p r4 = new k0.b.z.e.c.p
            r4.<init>(r0, r2)
            k0.b.r r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r4)
            java.util.Objects.requireNonNull(r0)
            boolean r2 = r0 instanceof k0.b.z.c.a
            if (r2 == 0) goto L_0x00c9
            k0.b.z.c.a r0 = (k0.b.z.c.a) r0
            k0.b.g r0 = r0.a()
            goto L_0x00d2
        L_0x00c9:
            k0.b.z.e.b.c r2 = new k0.b.z.e.b.c
            r2.<init>(r0)
            k0.b.g r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r2)
        L_0x00d2:
            i0.j.e.f1.p.d r2 = new i0.j.e.f1.p.d
            r2.<init>()
            k0.b.g r0 = r0.b(r2)
            i0.j.e.f1.p.f r2 = new i0.j.e.f1.p.f
            r2.<init>()
            k0.b.g r0 = r0.b(r2)
            i0.j.e.f1.p.e r2 = new i0.j.e.f1.p.e
            r2.<init>()
            k0.b.g r0 = r0.b(r2)
            i0.j.e.f1.p.g r2 = new i0.j.e.f1.p.g
            r2.<init>()
            k0.b.g r0 = r0.b(r2)
            i0.j.e.f1.p.h r2 = new i0.j.e.f1.p.h
            r2.<init>()
            java.util.Objects.requireNonNull(r0)
            io.reactivex.internal.operators.maybe.MaybeFlatten r4 = new io.reactivex.internal.operators.maybe.MaybeFlatten
            r4.<init>(r0, r2)
            k0.b.g r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r4)
            java.util.Objects.requireNonNull(r0)
            k0.b.z.d.c r2 = new k0.b.z.d.c
            r2.<init>()
            r0.a(r2)
            long r4 = r2.getCount()
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r4 = 1
            if (r0 == 0) goto L_0x0133
            i0.j.f.p.h.C4()     // Catch:{ InterruptedException -> 0x0124 }
            r2.await()     // Catch:{ InterruptedException -> 0x0124 }
            goto L_0x0133
        L_0x0124:
            r0 = move-exception
            r2.x = r4
            k0.b.w.a r2 = r2.q
            if (r2 == 0) goto L_0x012e
            r2.dispose()
        L_0x012e:
            java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.a(r0)
            throw r0
        L_0x0133:
            java.lang.Throwable r0 = r2.d
            if (r0 != 0) goto L_0x07cf
            T r0 = r2.c
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L_0x013e
            return
        L_0x013e:
            java.lang.String r2 = "FLING"
            r5 = r17
            boolean r2 = r5.equals(r2)
            java.lang.String r6 = "SWIPE"
            java.lang.String r7 = "SCROLL"
            if (r2 == 0) goto L_0x01aa
            boolean r2 = r1.c(r0)
            if (r2 == 0) goto L_0x015a
            com.instabug.library.p.a$b r2 = new com.instabug.library.p.a$b
            com.instabug.library.p.a$b$a r8 = com.instabug.library.p.a.b.C0109a.SCROLLABLE
            r2.<init>(r8, r0)
            goto L_0x0198
        L_0x015a:
            boolean r2 = r1.d(r0)
            if (r2 == 0) goto L_0x0168
            com.instabug.library.p.a$b r2 = new com.instabug.library.p.a$b
            com.instabug.library.p.a$b$a r8 = com.instabug.library.p.a.b.C0109a.SWIPEABLE
            r2.<init>(r8, r0)
            goto L_0x0198
        L_0x0168:
            android.view.ViewParent r0 = r0.getParent()
        L_0x016c:
            if (r0 == 0) goto L_0x0197
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0197
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            boolean r8 = r1.c(r2)
            if (r8 == 0) goto L_0x0184
            com.instabug.library.p.a$b r0 = new com.instabug.library.p.a$b
            com.instabug.library.p.a$b$a r8 = com.instabug.library.p.a.b.C0109a.SCROLLABLE
            r0.<init>(r8, r2)
        L_0x0182:
            r2 = r0
            goto L_0x0198
        L_0x0184:
            boolean r8 = r1.d(r2)
            if (r8 == 0) goto L_0x0192
            com.instabug.library.p.a$b r0 = new com.instabug.library.p.a$b
            com.instabug.library.p.a$b$a r8 = com.instabug.library.p.a.b.C0109a.SWIPEABLE
            r0.<init>(r8, r2)
            goto L_0x0182
        L_0x0192:
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x016c
        L_0x0197:
            r2 = 0
        L_0x0198:
            if (r2 != 0) goto L_0x019b
            return
        L_0x019b:
            android.view.View r0 = r2.a
            com.instabug.library.p.a$b$a r2 = r2.b
            com.instabug.library.p.a$b$a r8 = com.instabug.library.p.a.b.C0109a.SCROLLABLE
            if (r2 != r8) goto L_0x01a5
            r5 = r7
            goto L_0x01aa
        L_0x01a5:
            com.instabug.library.p.a$b$a r8 = com.instabug.library.p.a.b.C0109a.SWIPEABLE
            if (r2 != r8) goto L_0x01aa
            r5 = r6
        L_0x01aa:
            boolean r2 = r0 instanceof android.widget.TextView
            if (r2 == 0) goto L_0x01d6
            r2 = r0
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.CharSequence r8 = r2.getText()
            boolean r8 = r8 instanceof java.lang.String
            if (r8 == 0) goto L_0x01d6
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = (java.lang.String) r2
            r8 = 15
            java.lang.String r8 = com.instabug.library.util.StringUtility.trimString(r2, r8)
            int r9 = r8.length()
            int r10 = r2.length()
            if (r9 >= r10) goto L_0x01d7
            java.lang.String r2 = "..."
            java.lang.String r2 = i0.d.a.a.a.n0(r8, r2)
            goto L_0x01d7
        L_0x01d6:
            r2 = 0
        L_0x01d7:
            if (r0 == 0) goto L_0x07ce
            int r8 = r0.getId()
            r9 = -1
            if (r8 != r9) goto L_0x01e1
            goto L_0x01f0
        L_0x01e1:
            android.content.res.Resources r9 = r3.getResources()     // Catch:{ NotFoundException -> 0x01f0 }
            if (r9 == 0) goto L_0x01f0
            android.content.res.Resources r9 = r3.getResources()     // Catch:{ NotFoundException -> 0x01f0 }
            java.lang.String r8 = r9.getResourceEntryName(r8)     // Catch:{ NotFoundException -> 0x01f0 }
            goto L_0x01f1
        L_0x01f0:
            r8 = 0
        L_0x01f1:
            i0.j.e.z r9 = i0.j.e.z.j()
            com.instabug.library.Feature r10 = com.instabug.library.Feature.TRACK_USER_STEPS
            com.instabug.library.Feature$State r9 = r9.h(r10)
            com.instabug.library.Feature$State r10 = com.instabug.library.Feature.State.ENABLED
            if (r9 != r10) goto L_0x0200
            goto L_0x0201
        L_0x0200:
            r4 = 0
        L_0x0201:
            if (r4 == 0) goto L_0x035d
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Class r9 = r3.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            int r12 = r5.hashCode()
            java.lang.String r13 = "DOUBLE_TAP"
            java.lang.String r14 = "LONG_PRESS"
            java.lang.String r15 = "PINCH"
            java.lang.String r1 = "TAP"
            switch(r12) {
                case -1854350643: goto L_0x0260;
                case 82819: goto L_0x0257;
                case 76133530: goto L_0x024e;
                case 78862054: goto L_0x0243;
                case 79316762: goto L_0x023a;
                case 1074528416: goto L_0x0231;
                case 1265144341: goto L_0x0228;
                default: goto L_0x0227;
            }
        L_0x0227:
            goto L_0x0269
        L_0x0228:
            boolean r12 = r5.equals(r13)
            if (r12 != 0) goto L_0x022f
            goto L_0x0269
        L_0x022f:
            r12 = 6
            goto L_0x026a
        L_0x0231:
            boolean r12 = r5.equals(r14)
            if (r12 != 0) goto L_0x0238
            goto L_0x0269
        L_0x0238:
            r12 = 5
            goto L_0x026a
        L_0x023a:
            boolean r12 = r5.equals(r6)
            if (r12 != 0) goto L_0x0241
            goto L_0x0269
        L_0x0241:
            r12 = 4
            goto L_0x026a
        L_0x0243:
            java.lang.String r12 = "SHAKE"
            boolean r12 = r5.equals(r12)
            if (r12 != 0) goto L_0x024c
            goto L_0x0269
        L_0x024c:
            r12 = 3
            goto L_0x026a
        L_0x024e:
            boolean r12 = r5.equals(r15)
            if (r12 != 0) goto L_0x0255
            goto L_0x0269
        L_0x0255:
            r12 = 2
            goto L_0x026a
        L_0x0257:
            boolean r12 = r5.equals(r1)
            if (r12 != 0) goto L_0x025e
            goto L_0x0269
        L_0x025e:
            r12 = 1
            goto L_0x026a
        L_0x0260:
            boolean r12 = r5.equals(r7)
            if (r12 != 0) goto L_0x0267
            goto L_0x0269
        L_0x0267:
            r12 = 0
            goto L_0x026a
        L_0x0269:
            r12 = -1
        L_0x026a:
            switch(r12) {
                case 0: goto L_0x0283;
                case 1: goto L_0x0283;
                case 2: goto L_0x0279;
                case 3: goto L_0x026f;
                case 4: goto L_0x0283;
                case 5: goto L_0x0283;
                case 6: goto L_0x0283;
                default: goto L_0x026d;
            }
        L_0x026d:
            goto L_0x0325
        L_0x026f:
            java.lang.String r1 = "The user shook the phone in "
            r11.append(r1)
            r11.append(r9)
            goto L_0x0325
        L_0x0279:
            java.lang.String r1 = "Pinch in "
            r11.append(r1)
            r11.append(r9)
            goto L_0x0325
        L_0x0283:
            int r12 = r5.hashCode()
            switch(r12) {
                case -1854350643: goto L_0x02b8;
                case 82819: goto L_0x02af;
                case 76133530: goto L_0x02a6;
                case 79316762: goto L_0x029d;
                case 1074528416: goto L_0x0294;
                case 1265144341: goto L_0x028b;
                default: goto L_0x028a;
            }
        L_0x028a:
            goto L_0x02c1
        L_0x028b:
            boolean r1 = r5.equals(r13)
            if (r1 != 0) goto L_0x0292
            goto L_0x02c1
        L_0x0292:
            r1 = 5
            goto L_0x02c2
        L_0x0294:
            boolean r1 = r5.equals(r14)
            if (r1 != 0) goto L_0x029b
            goto L_0x02c1
        L_0x029b:
            r1 = 4
            goto L_0x02c2
        L_0x029d:
            boolean r1 = r5.equals(r6)
            if (r1 != 0) goto L_0x02a4
            goto L_0x02c1
        L_0x02a4:
            r1 = 3
            goto L_0x02c2
        L_0x02a6:
            boolean r1 = r5.equals(r15)
            if (r1 != 0) goto L_0x02ad
            goto L_0x02c1
        L_0x02ad:
            r1 = 2
            goto L_0x02c2
        L_0x02af:
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x02b6
            goto L_0x02c1
        L_0x02b6:
            r1 = 1
            goto L_0x02c2
        L_0x02b8:
            boolean r1 = r5.equals(r7)
            if (r1 != 0) goto L_0x02bf
            goto L_0x02c1
        L_0x02bf:
            r1 = 0
            goto L_0x02c2
        L_0x02c1:
            r1 = -1
        L_0x02c2:
            if (r1 == 0) goto L_0x02e5
            r6 = 1
            if (r1 == r6) goto L_0x02e2
            r6 = 2
            if (r1 == r6) goto L_0x02df
            r6 = 3
            if (r1 == r6) goto L_0x02dc
            r6 = 4
            if (r1 == r6) goto L_0x02d9
            r6 = 5
            if (r1 == r6) goto L_0x02d6
            java.lang.String r1 = ""
            goto L_0x02e7
        L_0x02d6:
            java.lang.String r1 = "Double tap"
            goto L_0x02e7
        L_0x02d9:
            java.lang.String r1 = "Long press"
            goto L_0x02e7
        L_0x02dc:
            java.lang.String r1 = "Swipe"
            goto L_0x02e7
        L_0x02df:
            java.lang.String r1 = "Pinch"
            goto L_0x02e7
        L_0x02e2:
            java.lang.String r1 = "Tap"
            goto L_0x02e7
        L_0x02e5:
            java.lang.String r1 = "Scroll"
        L_0x02e7:
            r11.append(r1)
            java.lang.String r1 = " in "
            r11.append(r1)
            java.lang.String r1 = " of type \""
            java.lang.String r6 = "\""
            if (r2 == 0) goto L_0x0305
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto L_0x0305
            i0.d.a.a.a.s(r11, r6, r2, r6, r1)
            r11.append(r4)
            r11.append(r6)
            goto L_0x031a
        L_0x0305:
            if (r8 == 0) goto L_0x0311
            i0.d.a.a.a.s(r11, r6, r8, r6, r1)
            r11.append(r4)
            r11.append(r6)
            goto L_0x031a
        L_0x0311:
            r11.append(r6)
            r11.append(r4)
            r11.append(r6)
        L_0x031a:
            java.lang.String r1 = " in \""
            r11.append(r1)
            r11.append(r9)
            r11.append(r6)
        L_0x0325:
            java.lang.String r1 = r11.toString()
            i0.j.e.a1.e r4 = i0.j.e.a1.e.c()
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.Class r7 = r3.getClass()
            java.lang.String r7 = r7.getName()
            java.util.Objects.requireNonNull(r4)
            i0.j.e.t0.h r8 = new i0.j.e.t0.h
            r8.<init>()
            r8.c = r5
            r8.b = r1
            long r11 = com.instabug.library.util.InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds()
            r8.a = r11
            r8.f = r6
            r8.e = r2
            r8.d = r7
            r4.d()
            java.util.ArrayList<i0.j.e.t0.h> r1 = r4.b
            r1.add(r8)
        L_0x035d:
            i0.j.e.z r1 = i0.j.e.z.j()
            com.instabug.library.Feature r2 = com.instabug.library.Feature.REPRO_STEPS
            com.instabug.library.Feature$State r1 = r1.h(r2)
            if (r1 != r10) goto L_0x036b
            r1 = 1
            goto L_0x036c
        L_0x036b:
            r1 = 0
        L_0x036c:
            if (r1 == 0) goto L_0x07ce
            boolean r1 = r0 instanceof android.widget.SeekBar
            if (r1 == 0) goto L_0x0374
            java.lang.String r5 = "MOVE"
        L_0x0374:
            boolean r2 = r0 instanceof android.widget.CompoundButton
            if (r2 == 0) goto L_0x0386
            r4 = r0
            android.widget.CompoundButton r4 = (android.widget.CompoundButton) r4
            boolean r4 = r4.isChecked()
            if (r4 == 0) goto L_0x0384
            java.lang.String r5 = "DISABLE"
            goto L_0x0386
        L_0x0384:
            java.lang.String r5 = "ENABLE"
        L_0x0386:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            i0.j.e.f1.g r4 = i0.j.e.f1.g.a
            if (r4 != 0) goto L_0x0399
            i0.j.e.f1.g r4 = new i0.j.e.f1.g
            r4.<init>()
            i0.j.e.f1.g.a = r4
        L_0x0399:
            i0.j.e.f1.g r4 = i0.j.e.f1.g.a
            com.instabug.library.p.a$a r6 = new com.instabug.library.p.a$a
            r6.<init>(r0, r5, r3)
            java.util.Objects.requireNonNull(r4)
            i0.j.e.f1.n r3 = i0.j.e.f1.n.k()
            i0.j.e.f1.c r3 = r3.j()
            r4.a()
            boolean r5 = i0.j.e.c1.b.x(r0)
            if (r5 != 0) goto L_0x03ce
            boolean r5 = r0 instanceof android.widget.Button
            if (r5 == 0) goto L_0x03ce
            boolean r5 = r0 instanceof android.widget.Switch
            if (r5 != 0) goto L_0x03ce
            boolean r5 = r0 instanceof androidx.appcompat.widget.SwitchCompat
            if (r5 != 0) goto L_0x03ce
            boolean r5 = r0 instanceof android.widget.ToggleButton
            if (r5 != 0) goto L_0x03ce
            boolean r5 = r0 instanceof android.widget.CheckBox
            if (r5 != 0) goto L_0x03ce
            boolean r5 = r0 instanceof android.widget.RadioButton
            if (r5 != 0) goto L_0x03ce
            r5 = 1
            goto L_0x03cf
        L_0x03ce:
            r5 = 0
        L_0x03cf:
            java.lang.String r7 = "a button"
            java.lang.String r8 = "the button \"%s\""
            if (r5 == 0) goto L_0x044a
            android.widget.Button r0 = (android.widget.Button) r0
            java.lang.CharSequence r1 = r0.getText()
            if (r1 == 0) goto L_0x0402
            java.lang.CharSequence r1 = r0.getText()
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0402
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = java.lang.String.format(r8, r1)
            i0.j.e.f1.d r1 = r4.g
            r1.a = r0
            r6.a(r3, r1)
            goto L_0x07ce
        L_0x0402:
            android.graphics.drawable.Drawable[] r1 = r0.getCompoundDrawables()
            int r2 = r1.length
            if (r2 <= 0) goto L_0x0416
            int r2 = r1.length
            r5 = 0
            r9 = 0
        L_0x040c:
            if (r5 >= r2) goto L_0x0417
            r9 = r1[r5]
            if (r9 == 0) goto L_0x0413
            goto L_0x0417
        L_0x0413:
            int r5 = r5 + 1
            goto L_0x040c
        L_0x0416:
            r9 = 0
        L_0x0417:
            if (r9 == 0) goto L_0x0424
            boolean r1 = r4.e(r0)
            if (r1 != 0) goto L_0x0424
            r4.b(r0, r9, r3, r6)
            goto L_0x07ce
        L_0x0424:
            boolean r1 = r4.g(r0)
            if (r1 == 0) goto L_0x0441
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.CharSequence r0 = r0.getContentDescription()
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = java.lang.String.format(r8, r1)
            i0.j.e.f1.d r1 = r4.g
            r1.a = r0
            r6.a(r3, r1)
            goto L_0x07ce
        L_0x0441:
            i0.j.e.f1.d r0 = r4.g
            r0.a = r7
            r6.a(r3, r0)
            goto L_0x07ce
        L_0x044a:
            boolean r5 = i0.j.e.c1.b.x(r0)
            if (r5 != 0) goto L_0x0462
            boolean r5 = r0 instanceof android.widget.TextView
            if (r5 == 0) goto L_0x0462
            boolean r5 = r0 instanceof android.widget.Button
            if (r5 != 0) goto L_0x0462
            boolean r5 = r0 instanceof android.widget.EditText
            if (r5 != 0) goto L_0x0462
            boolean r5 = r0 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r5 != 0) goto L_0x0462
            r5 = 1
            goto L_0x0463
        L_0x0462:
            r5 = 0
        L_0x0463:
            if (r5 == 0) goto L_0x04ac
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r1 = r0.getText()
            if (r1 == 0) goto L_0x048c
            java.lang.CharSequence r1 = r0.getText()
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x048c
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "the label \"%s\""
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x04a3
        L_0x048c:
            r1 = 1
            r2 = 0
            boolean r5 = r4.g(r0)
            if (r5 == 0) goto L_0x04a1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.CharSequence r0 = r0.getContentDescription()
            r1[r2] = r0
            java.lang.String r0 = java.lang.String.format(r8, r1)
            goto L_0x04a3
        L_0x04a1:
            java.lang.String r0 = "a label"
        L_0x04a3:
            i0.j.e.f1.d r1 = r4.g
            r1.a = r0
            r6.a(r3, r1)
            goto L_0x07ce
        L_0x04ac:
            boolean r5 = i0.j.e.c1.b.x(r0)
            if (r5 != 0) goto L_0x04b8
            boolean r5 = r0 instanceof com.google.android.material.tabs.TabLayout
            if (r5 == 0) goto L_0x04b8
            r5 = 1
            goto L_0x04b9
        L_0x04b8:
            r5 = 0
        L_0x04b9:
            if (r5 == 0) goto L_0x04d1
            com.google.android.material.tabs.TabLayout r0 = (com.google.android.material.tabs.TabLayout) r0
            i0.j.e.f1.f r1 = new i0.j.e.f1.f
            r1.<init>(r4, r0, r6, r3)
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r2 = r0.B2
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L_0x07ce
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r0 = r0.B2
            r0.add(r1)
            goto L_0x07ce
        L_0x04d1:
            boolean r5 = i0.j.e.c1.b.x(r0)
            if (r5 != 0) goto L_0x04e1
            boolean r5 = r0 instanceof com.google.android.material.internal.NavigationMenuItemView
            if (r5 != 0) goto L_0x04df
            boolean r5 = r0 instanceof i0.h.a.c.f.a
            if (r5 == 0) goto L_0x04e1
        L_0x04df:
            r5 = 1
            goto L_0x04e2
        L_0x04e1:
            r5 = 0
        L_0x04e2:
            if (r5 == 0) goto L_0x055e
            boolean r1 = r0 instanceof com.google.android.material.internal.NavigationMenuItemView
            if (r1 == 0) goto L_0x04f0
            r1 = r0
            com.google.android.material.internal.NavigationMenuItemView r1 = (com.google.android.material.internal.NavigationMenuItemView) r1
            h0.b.e.i.i r1 = r1.getItemData()
            goto L_0x04fd
        L_0x04f0:
            boolean r1 = r0 instanceof i0.h.a.c.f.a
            if (r1 == 0) goto L_0x04fc
            r1 = r0
            i0.h.a.c.f.a r1 = (i0.h.a.c.f.a) r1
            h0.b.e.i.i r1 = r1.getItemData()
            goto L_0x04fd
        L_0x04fc:
            r1 = 0
        L_0x04fd:
            if (r1 == 0) goto L_0x0557
            java.lang.CharSequence r2 = r1.e
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x051c
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.CharSequence r1 = r1.e
            r2 = 0
            r0[r2] = r1
            java.lang.String r0 = java.lang.String.format(r8, r0)
            i0.j.e.f1.d r1 = r4.g
            r1.a = r0
            r6.a(r3, r1)
            goto L_0x07ce
        L_0x051c:
            android.graphics.drawable.Drawable r2 = r1.getIcon()
            if (r2 == 0) goto L_0x0531
            boolean r2 = r4.e(r0)
            if (r2 != 0) goto L_0x0531
            android.graphics.drawable.Drawable r1 = r1.getIcon()
            r4.b(r0, r1, r3, r6)
            goto L_0x07ce
        L_0x0531:
            java.lang.CharSequence r0 = r1.q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x054e
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.CharSequence r1 = r1.q
            r2 = 0
            r0[r2] = r1
            java.lang.String r0 = java.lang.String.format(r8, r0)
            i0.j.e.f1.d r1 = r4.g
            r1.a = r0
            r6.a(r3, r1)
            goto L_0x07ce
        L_0x054e:
            i0.j.e.f1.d r0 = r4.g
            r0.a = r7
            r6.a(r3, r0)
            goto L_0x07ce
        L_0x0557:
            i0.j.e.f1.d r0 = r4.g
            r6.a(r3, r0)
            goto L_0x07ce
        L_0x055e:
            boolean r5 = i0.j.e.c1.b.x(r0)
            if (r5 != 0) goto L_0x056a
            boolean r5 = r0 instanceof android.widget.ImageButton
            if (r5 == 0) goto L_0x056a
            r5 = 1
            goto L_0x056b
        L_0x056a:
            r5 = 0
        L_0x056b:
            if (r5 == 0) goto L_0x0611
            android.view.ViewParent r1 = r0.getParent()
            android.view.View r1 = (android.view.View) r1
            boolean r2 = i0.j.e.c1.b.x(r1)
            if (r2 != 0) goto L_0x057f
            boolean r1 = r1 instanceof androidx.appcompat.widget.Toolbar
            if (r1 == 0) goto L_0x057f
            r1 = 1
            goto L_0x0580
        L_0x057f:
            r1 = 0
        L_0x0580:
            if (r1 == 0) goto L_0x05bb
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            if (r1 == 0) goto L_0x0595
            boolean r2 = r4.e(r0)
            if (r2 != 0) goto L_0x0595
            r4.b(r0, r1, r3, r6)
            goto L_0x07ce
        L_0x0595:
            boolean r1 = r4.g(r0)
            if (r1 == 0) goto L_0x05b2
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.CharSequence r0 = r0.getContentDescription()
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = java.lang.String.format(r8, r1)
            i0.j.e.f1.d r1 = r4.g
            r1.a = r0
            r6.a(r3, r1)
            goto L_0x07ce
        L_0x05b2:
            i0.j.e.f1.d r0 = r4.g
            r0.a = r7
            r6.a(r3, r0)
            goto L_0x07ce
        L_0x05bb:
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            boolean r1 = r4.g(r0)
            if (r1 == 0) goto L_0x05da
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.CharSequence r0 = r0.getContentDescription()
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = java.lang.String.format(r8, r1)
            i0.j.e.f1.d r1 = r4.g
            r1.a = r0
            r6.a(r3, r1)
            goto L_0x07ce
        L_0x05da:
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            if (r1 == 0) goto L_0x05eb
            boolean r2 = r4.e(r0)
            if (r2 != 0) goto L_0x05eb
            r4.b(r0, r1, r3, r6)
            goto L_0x07ce
        L_0x05eb:
            boolean r1 = r4.g(r0)
            if (r1 == 0) goto L_0x0608
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.CharSequence r0 = r0.getContentDescription()
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = java.lang.String.format(r8, r1)
            i0.j.e.f1.d r1 = r4.g
            r1.a = r0
            r6.a(r3, r1)
            goto L_0x07ce
        L_0x0608:
            i0.j.e.f1.d r0 = r4.g
            r0.a = r7
            r6.a(r3, r0)
            goto L_0x07ce
        L_0x0611:
            boolean r5 = i0.j.e.c1.b.x(r0)
            if (r5 != 0) goto L_0x0621
            boolean r5 = r0 instanceof android.widget.ImageView
            if (r5 == 0) goto L_0x0621
            boolean r5 = r0 instanceof android.widget.ImageButton
            if (r5 != 0) goto L_0x0621
            r5 = 1
            goto L_0x0622
        L_0x0621:
            r5 = 0
        L_0x0622:
            if (r5 == 0) goto L_0x064c
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r1 = r4.g(r0)
            if (r1 == 0) goto L_0x0641
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.CharSequence r0 = r0.getContentDescription()
            java.lang.String r0 = r0.toString()
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "the image \"%s\""
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x0643
        L_0x0641:
            java.lang.String r0 = "an image"
        L_0x0643:
            i0.j.e.f1.d r1 = r4.g
            r1.a = r0
            r6.a(r3, r1)
            goto L_0x07ce
        L_0x064c:
            if (r2 == 0) goto L_0x06a3
            r1 = r0
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            java.lang.CharSequence r2 = r1.getText()
            if (r2 == 0) goto L_0x0667
            java.lang.CharSequence r2 = r1.getText()
            java.lang.String r2 = r2.toString()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0667
            r2 = 1
            goto L_0x0668
        L_0x0667:
            r2 = 0
        L_0x0668:
            java.lang.String r5 = "the switch \"%s\""
            if (r2 == 0) goto L_0x067f
            java.lang.CharSequence r0 = r1.getText()
            java.lang.String r0 = r0.toString()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = java.lang.String.format(r5, r1)
            goto L_0x069a
        L_0x067f:
            r1 = 1
            r2 = 0
            boolean r7 = r4.g(r0)
            if (r7 == 0) goto L_0x0698
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.CharSequence r0 = r0.getContentDescription()
            java.lang.String r0 = r0.toString()
            r1[r2] = r0
            java.lang.String r0 = java.lang.String.format(r5, r1)
            goto L_0x069a
        L_0x0698:
            java.lang.String r0 = "a switch"
        L_0x069a:
            i0.j.e.f1.d r1 = r4.g
            r1.a = r0
            r6.a(r3, r1)
            goto L_0x07ce
        L_0x06a3:
            if (r1 == 0) goto L_0x06eb
            r1 = r0
            android.widget.SeekBar r1 = (android.widget.SeekBar) r1
            boolean r2 = r4.g(r0)
            if (r2 == 0) goto L_0x06ce
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.CharSequence r0 = r0.getContentDescription()
            java.lang.String r0 = r0.toString()
            r5 = 0
            r2[r5] = r0
            int r0 = r1.getProgress()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            r2[r1] = r0
            java.lang.String r0 = "the slider \"%s\" to %d"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            goto L_0x06e2
        L_0x06ce:
            r0 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r1 = r1.getProgress()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r0] = r1
            java.lang.String r0 = "a slider to %d"
            java.lang.String r0 = java.lang.String.format(r0, r2)
        L_0x06e2:
            i0.j.e.f1.d r1 = r4.g
            r1.a = r0
            r6.a(r3, r1)
            goto L_0x07ce
        L_0x06eb:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x07c9
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            java.util.List<java.lang.ref.WeakReference<android.view.ViewGroup>> r1 = r4.d
            r4.c(r0, r1)
            java.util.List<java.lang.ref.WeakReference<android.view.ViewGroup>> r0 = r4.d
            java.util.List<java.lang.ref.WeakReference<android.view.ViewGroup>> r1 = r4.e
            r4.d(r0, r1)
            java.util.List<java.lang.ref.WeakReference<android.view.ViewGroup>> r0 = r4.e
            java.util.List<java.lang.ref.WeakReference<android.view.ViewGroup>> r1 = r4.f
            r4.d(r0, r1)
            java.util.List<java.lang.ref.WeakReference<android.view.ViewGroup>> r0 = r4.f
            r1 = 0
            r4.d(r0, r1)
            java.util.List<java.lang.ref.WeakReference<android.view.View>> r0 = r4.c
            java.util.Iterator r0 = r0.iterator()
        L_0x0710:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x076f
            java.lang.Object r2 = r0.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            boolean r5 = r2 instanceof android.widget.TextView
            if (r5 == 0) goto L_0x0765
            r5 = r2
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x0744
            java.lang.CharSequence r7 = r5.getText()
            if (r7 == 0) goto L_0x0744
            java.lang.CharSequence r7 = r5.getText()
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x0744
            java.lang.CharSequence r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            goto L_0x0745
        L_0x0744:
            r5 = r1
        L_0x0745:
            if (r5 == 0) goto L_0x0765
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x0765
            r7 = 2
            int[] r7 = new int[r7]
            r2.getLocationOnScreen(r7)
            r2 = 0
            r2 = r7[r2]
            r8 = 1
            r7 = r7[r8]
            java.util.List<i0.j.e.f1.b> r8 = r4.b
            i0.j.e.f1.b r9 = new i0.j.e.f1.b
            float r7 = (float) r7
            float r2 = (float) r2
            r9.<init>(r5, r7, r2)
            r8.add(r9)
        L_0x0765:
            java.util.List<i0.j.e.f1.b> r2 = r4.b
            int r2 = r2.size()
            r5 = 20
            if (r2 != r5) goto L_0x0710
        L_0x076f:
            java.util.List<i0.j.e.f1.b> r0 = r4.b
            i0.j.e.f1.e r2 = new i0.j.e.f1.e
            r2.<init>()
            java.util.Collections.sort(r0, r2)
            java.lang.StringBuilder r0 = r4.h
            if (r0 != 0) goto L_0x077e
            goto L_0x07c1
        L_0x077e:
            java.util.List<i0.j.e.f1.b> r0 = r4.b
            java.util.Iterator r0 = r0.iterator()
        L_0x0784:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x07a7
            java.lang.Object r2 = r0.next()
            i0.j.e.f1.b r2 = (i0.j.e.f1.b) r2
            java.lang.StringBuilder r5 = r4.h
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x079f
            java.lang.StringBuilder r5 = r4.h
            java.lang.String r7 = " - "
            r5.append(r7)
        L_0x079f:
            java.lang.StringBuilder r5 = r4.h
            java.lang.String r2 = r2.c
            r5.append(r2)
            goto L_0x0784
        L_0x07a7:
            java.lang.StringBuilder r0 = r4.h
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x07c1
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.StringBuilder r1 = r4.h
            java.lang.String r1 = r1.toString()
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "UI that contains \"%s\""
            java.lang.String r1 = java.lang.String.format(r1, r0)
        L_0x07c1:
            i0.j.e.f1.d r0 = r4.g
            r0.a = r1
            r6.a(r3, r0)
            goto L_0x07ce
        L_0x07c9:
            i0.j.e.f1.d r0 = r4.g
            r6.a(r3, r0)
        L_0x07ce:
            return
        L_0x07cf:
            java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.p.a.a(java.lang.String, float, float):void");
    }

    public final void b(String str, MotionEvent motionEvent) {
        if (motionEvent != null) {
            a(str, (float) ((int) motionEvent.getRawX()), (float) ((int) motionEvent.getRawY()));
        }
    }

    public final boolean c(View view) {
        return (view instanceof ScrollView) || (view instanceof HorizontalScrollView) || (view instanceof GridView) || (view instanceof ListView) || (view instanceof WebView) || (view instanceof NestedScrollView) || view.getClass().getName().equals("androidx.recyclerview.widget.RecyclerView") || view.getClass().getName().equals("com.google.android.material.tabs.TabLayout");
    }

    public final boolean d(View view) {
        return (view instanceof SwitchCompat) || (view instanceof AbsSeekBar) || (view instanceof ViewPager);
    }
}
