package h0.g.b.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import com.instabug.library.network.RequestResponse;
import h0.g.c.c;
import h0.g.c.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MotionScene */
public class r {
    public final MotionLayout a;
    public h b = null;
    public b c = null;
    public ArrayList<b> d = new ArrayList<>();
    public b e = null;
    public ArrayList<b> f = new ArrayList<>();
    public SparseArray<c> g = new SparseArray<>();
    public HashMap<String, Integer> h = new HashMap<>();
    public SparseIntArray i = new SparseIntArray();
    public int j = RequestResponse.HttpStatusCode._4xx.BAD_REQUEST;
    public int k = 0;
    public MotionEvent l;
    public boolean m = false;
    public boolean n = false;
    public MotionLayout.f o;
    public boolean p;
    public final y q;
    public float r;
    public float s;

    /* compiled from: MotionScene */
    public class a implements Interpolator {
        public final /* synthetic */ h0.g.a.g.a.c a;

        public a(r rVar, h0.g.a.g.a.c cVar) {
            this.a = cVar;
        }

        public float getInterpolation(float f) {
            return (float) this.a.a((double) f);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public r(android.content.Context r12, androidx.constraintlayout.motion.widget.MotionLayout r13, int r14) {
        /*
            r11 = this;
            r11.<init>()
            r0 = 0
            r11.b = r0
            r11.c = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r11.d = r1
            r11.e = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r11.f = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r11.g = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r11.h = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            r11.i = r1
            r1 = 400(0x190, float:5.6E-43)
            r11.j = r1
            r1 = 0
            r11.k = r1
            r11.m = r1
            r11.n = r1
            r11.a = r13
            h0.g.b.b.y r2 = new h0.g.b.b.y
            r2.<init>(r13)
            r11.q = r2
            android.content.res.Resources r13 = r12.getResources()
            android.content.res.XmlResourceParser r13 = r13.getXml(r14)
            int r2 = r13.getEventType()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r3 = r0
        L_0x004e:
            r4 = 1
            if (r2 == r4) goto L_0x01a5
            if (r2 == 0) goto L_0x0193
            r5 = 2
            if (r2 == r5) goto L_0x0058
            goto L_0x0196
        L_0x0058:
            java.lang.String r2 = r13.getName()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            int r6 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r7 = 4
            r8 = 5
            java.lang.String r9 = "MotionScene"
            r10 = -1
            switch(r6) {
                case -1349929691: goto L_0x00c4;
                case -1239391468: goto L_0x00b9;
                case -687739768: goto L_0x00af;
                case 61998586: goto L_0x00a4;
                case 269306229: goto L_0x009a;
                case 312750793: goto L_0x0090;
                case 327855227: goto L_0x0087;
                case 793277014: goto L_0x007f;
                case 1382829617: goto L_0x0075;
                case 1942574248: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x00ce
        L_0x006a:
            java.lang.String r5 = "include"
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            if (r2 == 0) goto L_0x00ce
            r5 = 6
            goto L_0x00cf
        L_0x0075:
            java.lang.String r5 = "StateSet"
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            if (r2 == 0) goto L_0x00ce
            r5 = r7
            goto L_0x00cf
        L_0x007f:
            boolean r2 = r2.equals(r9)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            if (r2 == 0) goto L_0x00ce
            r5 = r1
            goto L_0x00cf
        L_0x0087:
            java.lang.String r6 = "OnSwipe"
            boolean r2 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            if (r2 == 0) goto L_0x00ce
            goto L_0x00cf
        L_0x0090:
            java.lang.String r5 = "OnClick"
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            if (r2 == 0) goto L_0x00ce
            r5 = 3
            goto L_0x00cf
        L_0x009a:
            java.lang.String r5 = "Transition"
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            if (r2 == 0) goto L_0x00ce
            r5 = r4
            goto L_0x00cf
        L_0x00a4:
            java.lang.String r5 = "ViewTransition"
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            if (r2 == 0) goto L_0x00ce
            r5 = 9
            goto L_0x00cf
        L_0x00af:
            java.lang.String r5 = "Include"
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            if (r2 == 0) goto L_0x00ce
            r5 = 7
            goto L_0x00cf
        L_0x00b9:
            java.lang.String r5 = "KeyFrameSet"
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            if (r2 == 0) goto L_0x00ce
            r5 = 8
            goto L_0x00cf
        L_0x00c4:
            java.lang.String r5 = "ConstraintSet"
            boolean r2 = r2.equals(r5)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            if (r2 == 0) goto L_0x00ce
            r5 = r8
            goto L_0x00cf
        L_0x00ce:
            r5 = r10
        L_0x00cf:
            switch(r5) {
                case 0: goto L_0x018f;
                case 1: goto L_0x015c;
                case 2: goto L_0x0121;
                case 3: goto L_0x0113;
                case 4: goto L_0x010a;
                case 5: goto L_0x0105;
                case 6: goto L_0x0100;
                case 7: goto L_0x0100;
                case 8: goto L_0x00f2;
                case 9: goto L_0x00d4;
                default: goto L_0x00d2;
            }     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
        L_0x00d2:
            goto L_0x0196
        L_0x00d4:
            h0.g.b.b.x r2 = new h0.g.b.b.x     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r2.<init>(r12, r13)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            h0.g.b.b.y r5 = r11.q     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            java.util.ArrayList<h0.g.b.b.x> r6 = r5.b     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r6.add(r2)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r5.c = r0     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            int r6 = r2.b     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            if (r6 != r7) goto L_0x00eb
            r5.a(r2, r4)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            goto L_0x0196
        L_0x00eb:
            if (r6 != r8) goto L_0x0196
            r5.a(r2, r1)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            goto L_0x0196
        L_0x00f2:
            h0.g.b.b.g r2 = new h0.g.b.b.g     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r2.<init>(r12, r13)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            if (r3 == 0) goto L_0x0196
            java.util.ArrayList<h0.g.b.b.g> r4 = r3.k     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r4.add(r2)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            goto L_0x0196
        L_0x0100:
            r11.l(r12, r13)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            goto L_0x0196
        L_0x0105:
            r11.j(r12, r13)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            goto L_0x0196
        L_0x010a:
            h0.g.c.h r2 = new h0.g.c.h     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r2.<init>(r12, r13)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r11.b = r2     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            goto L_0x0196
        L_0x0113:
            if (r3 == 0) goto L_0x0196
            java.util.ArrayList<h0.g.b.b.r$b$a> r2 = r3.m     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            h0.g.b.b.r$b$a r4 = new h0.g.b.b.r$b$a     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r4.<init>(r12, r3, r13)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r2.add(r4)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            goto L_0x0196
        L_0x0121:
            if (r3 != 0) goto L_0x0150
            android.content.res.Resources r2 = r12.getResources()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            java.lang.String r2 = r2.getResourceEntryName(r14)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            int r4 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            java.lang.String r6 = " OnSwipe ("
            r5.append(r6)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r5.append(r2)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            java.lang.String r2 = ".xml:"
            r5.append(r2)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r5.append(r4)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            java.lang.String r2 = ")"
            r5.append(r2)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            java.lang.String r2 = r5.toString()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            android.util.Log.v(r9, r2)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
        L_0x0150:
            if (r3 == 0) goto L_0x0196
            h0.g.b.b.u r2 = new h0.g.b.b.u     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r11.a     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r2.<init>(r12, r4, r13)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r3.l = r2     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            goto L_0x0196
        L_0x015c:
            java.util.ArrayList<h0.g.b.b.r$b> r2 = r11.d     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            h0.g.b.b.r$b r3 = new h0.g.b.b.r$b     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r3.<init>(r11, r12, r13)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r2.add(r3)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            h0.g.b.b.r$b r2 = r11.c     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            if (r2 != 0) goto L_0x0179
            boolean r2 = r3.b     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            if (r2 != 0) goto L_0x0179
            r11.c = r3     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            h0.g.b.b.u r2 = r3.l     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            if (r2 == 0) goto L_0x0179
            boolean r4 = r11.p     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r2.c(r4)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
        L_0x0179:
            boolean r2 = r3.b     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            if (r2 == 0) goto L_0x0196
            int r2 = r3.c     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            if (r2 != r10) goto L_0x0184
            r11.e = r3     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            goto L_0x0189
        L_0x0184:
            java.util.ArrayList<h0.g.b.b.r$b> r2 = r11.f     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r2.add(r3)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
        L_0x0189:
            java.util.ArrayList<h0.g.b.b.r$b> r2 = r11.d     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            r2.remove(r3)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            goto L_0x0196
        L_0x018f:
            r11.m(r12, r13)     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            goto L_0x0196
        L_0x0193:
            r13.getName()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
        L_0x0196:
            int r2 = r13.next()     // Catch:{ XmlPullParserException -> 0x01a1, IOException -> 0x019c }
            goto L_0x004e
        L_0x019c:
            r12 = move-exception
            r12.printStackTrace()
            goto L_0x01a5
        L_0x01a1:
            r12 = move-exception
            r12.printStackTrace()
        L_0x01a5:
            android.util.SparseArray<h0.g.c.c> r12 = r11.g
            int r13 = androidx.constraintlayout.widget.R.id.motion_base
            h0.g.c.c r14 = new h0.g.c.c
            r14.<init>()
            r12.put(r13, r14)
            java.util.HashMap<java.lang.String, java.lang.Integer> r12 = r11.h
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "motion_base"
            r12.put(r14, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.b.b.r.<init>(android.content.Context, androidx.constraintlayout.motion.widget.MotionLayout, int):void");
    }

    public boolean a(MotionLayout motionLayout, int i2) {
        if (this.o != null) {
            return false;
        }
        Iterator<b> it = this.d.iterator();
        while (it.hasNext()) {
            b next = it.next();
            int i3 = next.n;
            if (i3 != 0) {
                b bVar = this.c;
                if (bVar == next) {
                    if ((bVar.r & 2) != 0) {
                        continue;
                    }
                }
                if (i2 == next.d && (i3 == 4 || i3 == 2)) {
                    MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(next);
                    if (next.n == 4) {
                        motionLayout.I();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.w(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState);
                        motionLayout.C();
                    }
                    return true;
                } else if (i2 == next.c && (i3 == 3 || i3 == 1)) {
                    MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.FINISHED;
                    motionLayout.setState(transitionState2);
                    motionLayout.setTransition(next);
                    if (next.n == 3) {
                        motionLayout.u(0.0f);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.w(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(transitionState2);
                        motionLayout.C();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public c b(int i2) {
        int a2;
        h hVar = this.b;
        if (!(hVar == null || (a2 = hVar.a(i2, -1, -1)) == -1)) {
            i2 = a2;
        }
        if (this.g.get(i2) != null) {
            return this.g.get(i2);
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Warning could not find ConstraintSet id/");
        P0.append(g0.a.b.b.a.N(this.a.getContext(), i2));
        P0.append(" In MotionScene");
        Log.e("MotionScene", P0.toString());
        SparseArray<c> sparseArray = this.g;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public int c() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.h;
        }
        return this.j;
    }

    public int d() {
        b bVar = this.c;
        if (bVar == null) {
            return -1;
        }
        return bVar.c;
    }

    public final int e(Context context, String str) {
        int i2;
        if (str.contains("/")) {
            i2 = context.getResources().getIdentifier(i0.d.a.a.a.f0(str, 47, 1), "id", context.getPackageName());
        } else {
            i2 = -1;
        }
        if (i2 != -1) {
            return i2;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return i2;
    }

    public Interpolator f() {
        b bVar = this.c;
        int i2 = bVar.e;
        if (i2 == -2) {
            return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
        }
        if (i2 == -1) {
            return new a(this, h0.g.a.g.a.c.c(bVar.f));
        }
        if (i2 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i2 == 1) {
            return new AccelerateInterpolator();
        }
        if (i2 == 2) {
            return new DecelerateInterpolator();
        }
        if (i2 == 4) {
            return new BounceInterpolator();
        }
        if (i2 == 5) {
            return new OvershootInterpolator();
        }
        if (i2 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public void g(n nVar) {
        b bVar = this.c;
        if (bVar == null) {
            b bVar2 = this.e;
            if (bVar2 != null) {
                Iterator<g> it = bVar2.k.iterator();
                while (it.hasNext()) {
                    it.next().a(nVar);
                }
                return;
            }
            return;
        }
        Iterator<g> it2 = bVar.k.iterator();
        while (it2.hasNext()) {
            it2.next().a(nVar);
        }
    }

    public float h() {
        u uVar;
        b bVar = this.c;
        if (bVar == null || (uVar = bVar.l) == null) {
            return 0.0f;
        }
        return uVar.v;
    }

    public int i() {
        b bVar = this.c;
        if (bVar == null) {
            return -1;
        }
        return bVar.d;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int j(android.content.Context r11, org.xmlpull.v1.XmlPullParser r12) {
        /*
            r10 = this;
            h0.g.c.c r0 = new h0.g.c.c
            r0.<init>()
            r1 = 0
            r0.h = r1
            int r2 = r12.getAttributeCount()
            r3 = -1
            r4 = r1
            r5 = r3
            r6 = r5
        L_0x0010:
            if (r4 >= r2) goto L_0x007b
            java.lang.String r7 = r12.getAttributeName(r4)
            java.lang.String r8 = r12.getAttributeValue(r4)
            r7.hashCode()
            int r9 = r7.hashCode()
            switch(r9) {
                case -1995929160: goto L_0x003c;
                case -1496482599: goto L_0x0031;
                case 3355: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            r7 = r3
            goto L_0x0046
        L_0x0026:
            java.lang.String r9 = "id"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x002f
            goto L_0x0024
        L_0x002f:
            r7 = 2
            goto L_0x0046
        L_0x0031:
            java.lang.String r9 = "deriveConstraintsFrom"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x003a
            goto L_0x0024
        L_0x003a:
            r7 = 1
            goto L_0x0046
        L_0x003c:
            java.lang.String r9 = "ConstraintRotate"
            boolean r7 = r7.equals(r9)
            if (r7 != 0) goto L_0x0045
            goto L_0x0024
        L_0x0045:
            r7 = r1
        L_0x0046:
            switch(r7) {
                case 0: goto L_0x0072;
                case 1: goto L_0x006d;
                case 2: goto L_0x004a;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x0078
        L_0x004a:
            int r5 = r10.e(r11, r8)
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r10.h
            r9 = 47
            int r9 = r8.indexOf(r9)
            if (r9 >= 0) goto L_0x0059
            goto L_0x005f
        L_0x0059:
            int r9 = r9 + 1
            java.lang.String r8 = r8.substring(r9)
        L_0x005f:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.put(r8, r9)
            java.lang.String r7 = g0.a.b.b.a.N(r11, r5)
            r0.d = r7
            goto L_0x0078
        L_0x006d:
            int r6 = r10.e(r11, r8)
            goto L_0x0078
        L_0x0072:
            int r7 = java.lang.Integer.parseInt(r8)
            r0.f = r7
        L_0x0078:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x007b:
            if (r5 == r3) goto L_0x0090
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r10.a
            int r1 = r1.K2
            r0.k(r11, r12)
            if (r6 == r3) goto L_0x008b
            android.util.SparseIntArray r11 = r10.i
            r11.put(r5, r6)
        L_0x008b:
            android.util.SparseArray<h0.g.c.c> r11 = r10.g
            r11.put(r5, r0)
        L_0x0090:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.b.b.r.j(android.content.Context, org.xmlpull.v1.XmlPullParser):int");
    }

    public final int k(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return j(context, xml);
                }
            }
            return -1;
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
            return -1;
        } catch (IOException e3) {
            e3.printStackTrace();
            return -1;
        }
    }

    public final void l(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.include);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == R.styleable.include_constraintSet) {
                k(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void m(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == R.styleable.MotionScene_defaultDuration) {
                int i3 = obtainStyledAttributes.getInt(index, this.j);
                this.j = i3;
                if (i3 < 8) {
                    this.j = 8;
                }
            } else if (index == R.styleable.MotionScene_layoutDuringTransition) {
                this.k = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void n(int i2, MotionLayout motionLayout) {
        c cVar = this.g.get(i2);
        cVar.e = cVar.d;
        int i3 = this.i.get(i2);
        if (i3 > 0) {
            n(i3, motionLayout);
            c cVar2 = this.g.get(i3);
            if (cVar2 == null) {
                StringBuilder P0 = i0.d.a.a.a.P0("ERROR! invalid deriveConstraintsFrom: @id/");
                P0.append(g0.a.b.b.a.N(this.a.getContext(), i3));
                Log.e("MotionScene", P0.toString());
                return;
            }
            cVar.e += "/" + cVar2.e;
            for (Integer next : cVar2.i.keySet()) {
                int intValue = next.intValue();
                c.a aVar = cVar2.i.get(next);
                if (!cVar.i.containsKey(Integer.valueOf(intValue))) {
                    cVar.i.put(Integer.valueOf(intValue), new c.a());
                }
                c.a aVar2 = cVar.i.get(Integer.valueOf(intValue));
                if (aVar2 != null) {
                    c.b bVar = aVar2.e;
                    if (!bVar.c) {
                        bVar.a(aVar.e);
                    }
                    c.d dVar = aVar2.c;
                    if (!dVar.a) {
                        dVar.a(aVar.c);
                    }
                    c.e eVar = aVar2.f;
                    if (!eVar.b) {
                        eVar.a(aVar.f);
                    }
                    c.C0036c cVar3 = aVar2.d;
                    if (!cVar3.b) {
                        cVar3.a(aVar.d);
                    }
                    for (String next2 : aVar.g.keySet()) {
                        if (!aVar2.g.containsKey(next2)) {
                            aVar2.g.put(next2, aVar.g.get(next2));
                        }
                    }
                }
            }
        } else {
            cVar.e = i0.d.a.a.a.y0(new StringBuilder(), cVar.e, "  layout");
            int childCount = motionLayout.getChildCount();
            int i4 = 0;
            while (i4 < childCount) {
                View childAt = motionLayout.getChildAt(i4);
                ConstraintLayout.a aVar3 = (ConstraintLayout.a) childAt.getLayoutParams();
                int id = childAt.getId();
                if (!cVar.h || id != -1) {
                    if (!cVar.i.containsKey(Integer.valueOf(id))) {
                        cVar.i.put(Integer.valueOf(id), new c.a());
                    }
                    c.a aVar4 = cVar.i.get(Integer.valueOf(id));
                    if (aVar4 != null) {
                        if (!aVar4.e.c) {
                            aVar4.c(id, aVar3);
                            if (childAt instanceof h0.g.c.a) {
                                aVar4.e.f29j0 = ((h0.g.c.a) childAt).getReferencedIds();
                                if (childAt instanceof Barrier) {
                                    Barrier barrier = (Barrier) childAt;
                                    aVar4.e.f34o0 = barrier.getAllowsGoneWidget();
                                    aVar4.e.f26g0 = barrier.getType();
                                    aVar4.e.f27h0 = barrier.getMargin();
                                }
                            }
                            aVar4.e.c = true;
                        }
                        c.d dVar2 = aVar4.c;
                        if (!dVar2.a) {
                            dVar2.b = childAt.getVisibility();
                            aVar4.c.d = childAt.getAlpha();
                            aVar4.c.a = true;
                        }
                        c.e eVar2 = aVar4.f;
                        if (!eVar2.b) {
                            eVar2.b = true;
                            eVar2.c = childAt.getRotation();
                            aVar4.f.d = childAt.getRotationX();
                            aVar4.f.e = childAt.getRotationY();
                            aVar4.f.f = childAt.getScaleX();
                            aVar4.f.g = childAt.getScaleY();
                            float pivotX = childAt.getPivotX();
                            float pivotY = childAt.getPivotY();
                            if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                                c.e eVar3 = aVar4.f;
                                eVar3.h = pivotX;
                                eVar3.i = pivotY;
                            }
                            aVar4.f.k = childAt.getTranslationX();
                            aVar4.f.l = childAt.getTranslationY();
                            aVar4.f.m = childAt.getTranslationZ();
                            c.e eVar4 = aVar4.f;
                            if (eVar4.n) {
                                eVar4.o = childAt.getElevation();
                            }
                        }
                    }
                    i4++;
                } else {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
            }
        }
        for (c.a next3 : cVar.i.values()) {
            if (next3.h != null) {
                if (next3.b != null) {
                    for (Integer intValue2 : cVar.i.keySet()) {
                        c.a i5 = cVar.i(intValue2.intValue());
                        String str = i5.e.f31l0;
                        if (str != null && next3.b.matches(str)) {
                            next3.h.e(i5);
                            i5.g.putAll((HashMap) next3.g.clone());
                        }
                    }
                } else {
                    next3.h.e(cVar.i(next3.a));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(int r8, int r9) {
        /*
            r7 = this;
            h0.g.c.h r0 = r7.b
            r1 = -1
            if (r0 == 0) goto L_0x0016
            int r0 = r0.a(r8, r1, r1)
            if (r0 == r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r8
        L_0x000d:
            h0.g.c.h r2 = r7.b
            int r2 = r2.a(r9, r1, r1)
            if (r2 == r1) goto L_0x0017
            goto L_0x0018
        L_0x0016:
            r0 = r8
        L_0x0017:
            r2 = r9
        L_0x0018:
            h0.g.b.b.r$b r3 = r7.c
            if (r3 == 0) goto L_0x0025
            int r4 = r3.c
            if (r4 != r9) goto L_0x0025
            int r3 = r3.d
            if (r3 != r8) goto L_0x0025
            return
        L_0x0025:
            java.util.ArrayList<h0.g.b.b.r$b> r3 = r7.d
            java.util.Iterator r3 = r3.iterator()
        L_0x002b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0051
            java.lang.Object r4 = r3.next()
            h0.g.b.b.r$b r4 = (h0.g.b.b.r.b) r4
            int r5 = r4.c
            if (r5 != r2) goto L_0x003f
            int r6 = r4.d
            if (r6 == r0) goto L_0x0045
        L_0x003f:
            if (r5 != r9) goto L_0x002b
            int r5 = r4.d
            if (r5 != r8) goto L_0x002b
        L_0x0045:
            r7.c = r4
            h0.g.b.b.u r8 = r4.l
            if (r8 == 0) goto L_0x0050
            boolean r9 = r7.p
            r8.c(r9)
        L_0x0050:
            return
        L_0x0051:
            h0.g.b.b.r$b r8 = r7.e
            java.util.ArrayList<h0.g.b.b.r$b> r3 = r7.f
            java.util.Iterator r3 = r3.iterator()
        L_0x0059:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006b
            java.lang.Object r4 = r3.next()
            h0.g.b.b.r$b r4 = (h0.g.b.b.r.b) r4
            int r5 = r4.c
            if (r5 != r9) goto L_0x0059
            r8 = r4
            goto L_0x0059
        L_0x006b:
            h0.g.b.b.r$b r9 = new h0.g.b.b.r$b
            r9.<init>(r7, r8)
            r9.d = r0
            r9.c = r2
            if (r0 == r1) goto L_0x007b
            java.util.ArrayList<h0.g.b.b.r$b> r8 = r7.d
            r8.add(r9)
        L_0x007b:
            r7.c = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.b.b.r.o(int, int):void");
    }

    public boolean p() {
        Iterator<b> it = this.d.iterator();
        while (it.hasNext()) {
            if (it.next().l != null) {
                return true;
            }
        }
        b bVar = this.c;
        if (bVar == null || bVar.l == null) {
            return false;
        }
        return true;
    }

    /* compiled from: MotionScene */
    public static class b {
        public int a = -1;
        public boolean b = false;
        public int c = -1;
        public int d = -1;
        public int e = 0;
        public String f = null;
        public int g = -1;
        public int h = RequestResponse.HttpStatusCode._4xx.BAD_REQUEST;
        public float i = 0.0f;
        public final r j;
        public ArrayList<g> k = new ArrayList<>();
        public u l = null;
        public ArrayList<a> m = new ArrayList<>();
        public int n = 0;
        public boolean o = false;
        public int p = -1;
        public int q = 0;
        public int r = 0;

        /* compiled from: MotionScene */
        public static class a implements View.OnClickListener {
            public final b c;
            public int d = -1;
            public int q = 17;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.c = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == R.styleable.OnClick_targetId) {
                        this.d = obtainStyledAttributes.getResourceId(index, this.d);
                    } else if (index == R.styleable.OnClick_clickAction) {
                        this.q = obtainStyledAttributes.getInt(index, this.q);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            public void a(MotionLayout motionLayout, int i, b bVar) {
                int i2 = this.d;
                View view = motionLayout;
                if (i2 != -1) {
                    view = motionLayout.findViewById(i2);
                }
                if (view == null) {
                    StringBuilder P0 = i0.d.a.a.a.P0("OnClick could not find id ");
                    P0.append(this.d);
                    Log.e("MotionScene", P0.toString());
                    return;
                }
                int i3 = bVar.d;
                int i4 = bVar.c;
                if (i3 == -1) {
                    view.setOnClickListener(this);
                    return;
                }
                int i5 = this.q;
                int i6 = i5 & 1;
                boolean z = false;
                boolean z2 = (i6 != 0 && i == i3) | (i6 != 0 && i == i3) | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
                if ((i5 & 4096) != 0 && i == i4) {
                    z = true;
                }
                if (z2 || z) {
                    view.setOnClickListener(this);
                }
            }

            public void b(MotionLayout motionLayout) {
                int i = this.d;
                if (i != -1) {
                    View findViewById = motionLayout.findViewById(i);
                    if (findViewById == null) {
                        StringBuilder P0 = i0.d.a.a.a.P0(" (*)  could not find id ");
                        P0.append(this.d);
                        Log.e("MotionScene", P0.toString());
                        return;
                    }
                    findViewById.setOnClickListener((View.OnClickListener) null);
                }
            }

            public void onClick(View view) {
                b bVar = this.c;
                r rVar = bVar.j;
                MotionLayout motionLayout = rVar.a;
                if (motionLayout.x2) {
                    if (bVar.d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.J(this.c.c);
                            return;
                        }
                        b bVar2 = this.c;
                        b bVar3 = new b(bVar2.j, bVar2);
                        bVar3.d = currentState;
                        bVar3.c = this.c.c;
                        motionLayout.setTransition(bVar3);
                        motionLayout.I();
                        return;
                    }
                    b bVar4 = rVar.c;
                    int i = this.q;
                    boolean z = false;
                    boolean z2 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                    boolean z3 = ((i & 16) == 0 && (i & 4096) == 0) ? false : true;
                    if (z2 && z3) {
                        if (bVar4 != bVar) {
                            motionLayout.setTransition(bVar);
                        }
                        if (motionLayout.getCurrentState() == motionLayout.getEndState() || motionLayout.getProgress() > 0.5f) {
                            z2 = false;
                        } else {
                            z3 = false;
                        }
                    }
                    b bVar5 = this.c;
                    if (bVar5 != bVar4) {
                        int i2 = bVar5.c;
                        int i3 = bVar5.d;
                        if (i3 != -1) {
                        }
                    }
                    z = true;
                    if (!z) {
                        return;
                    }
                    if (z2 && (this.q & 1) != 0) {
                        motionLayout.setTransition(bVar5);
                        motionLayout.I();
                    } else if (z3 && (this.q & 16) != 0) {
                        motionLayout.setTransition(bVar5);
                        motionLayout.u(0.0f);
                    } else if (z2 && (this.q & 256) != 0) {
                        motionLayout.setTransition(bVar5);
                        motionLayout.setProgress(1.0f);
                    } else if (z3 && (this.q & 4096) != 0) {
                        motionLayout.setTransition(bVar5);
                        motionLayout.setProgress(0.0f);
                    }
                }
            }
        }

        public b(r rVar, b bVar) {
            this.j = rVar;
            this.h = rVar.j;
            if (bVar != null) {
                this.p = bVar.p;
                this.e = bVar.e;
                this.f = bVar.f;
                this.g = bVar.g;
                this.h = bVar.h;
                this.k = bVar.k;
                this.i = bVar.i;
                this.q = bVar.q;
            }
        }

        public b(int i2, r rVar, int i3, int i4) {
            this.a = i2;
            this.j = rVar;
            this.d = i3;
            this.c = i4;
            this.h = rVar.j;
            this.q = rVar.k;
        }

        public b(r rVar, Context context, XmlPullParser xmlPullParser) {
            this.h = rVar.j;
            this.q = rVar.k;
            this.j = rVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.Transition);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.Transition_constraintSetEnd) {
                    this.c = obtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        c cVar = new c();
                        cVar.j(context, this.c);
                        rVar.g.append(this.c, cVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.c = rVar.k(context, this.c);
                    }
                } else if (index == R.styleable.Transition_constraintSetStart) {
                    this.d = obtainStyledAttributes.getResourceId(index, this.d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.d);
                    if ("layout".equals(resourceTypeName2)) {
                        c cVar2 = new c();
                        cVar2.j(context, this.d);
                        rVar.g.append(this.d, cVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.d = rVar.k(context, this.d);
                    }
                } else if (index == R.styleable.Transition_motionInterpolator) {
                    int i3 = obtainStyledAttributes.peekValue(index).type;
                    if (i3 == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.g = resourceId;
                        if (resourceId != -1) {
                            this.e = -2;
                        }
                    } else if (i3 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.g = obtainStyledAttributes.getResourceId(index, -1);
                                this.e = -2;
                            } else {
                                this.e = -1;
                            }
                        }
                    } else {
                        this.e = obtainStyledAttributes.getInteger(index, this.e);
                    }
                } else if (index == R.styleable.Transition_duration) {
                    int i4 = obtainStyledAttributes.getInt(index, this.h);
                    this.h = i4;
                    if (i4 < 8) {
                        this.h = 8;
                    }
                } else if (index == R.styleable.Transition_staggered) {
                    this.i = obtainStyledAttributes.getFloat(index, this.i);
                } else if (index == R.styleable.Transition_autoTransition) {
                    this.n = obtainStyledAttributes.getInteger(index, this.n);
                } else if (index == R.styleable.Transition_android_id) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == R.styleable.Transition_transitionDisable) {
                    this.o = obtainStyledAttributes.getBoolean(index, this.o);
                } else if (index == R.styleable.Transition_pathMotionArc) {
                    this.p = obtainStyledAttributes.getInteger(index, -1);
                } else if (index == R.styleable.Transition_layoutDuringTransition) {
                    this.q = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == R.styleable.Transition_transitionFlags) {
                    this.r = obtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.d == -1) {
                this.b = true;
            }
            obtainStyledAttributes.recycle();
        }
    }
}
