package h0.g.b.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Xml;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import h0.g.a.g.a.d;
import h0.g.b.b.r;
import h0.g.c.c;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: ViewTransition */
public class x {
    public int a;
    public int b = -1;
    public boolean c = false;
    public int d = 0;
    public int e;
    public g f;
    public c.a g;
    public int h = -1;
    public int i = -1;
    public int j;
    public String k;
    public int l = 0;
    public String m = null;
    public int n = -1;
    public Context o;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;

    /* compiled from: ViewTransition */
    public static class a {
        public final int a;
        public final int b;
        public long c;
        public n d;
        public int e;
        public d f = new d();
        public y g;
        public Interpolator h;
        public boolean i = false;
        public float j;
        public float k;
        public long l;
        public Rect m = new Rect();
        public boolean n = false;

        public a(y yVar, n nVar, int i2, int i3, int i4, Interpolator interpolator, int i5, int i6) {
            this.g = yVar;
            this.d = nVar;
            this.e = i3;
            long nanoTime = System.nanoTime();
            this.c = nanoTime;
            this.l = nanoTime;
            y yVar2 = this.g;
            if (yVar2.e == null) {
                yVar2.e = new ArrayList<>();
            }
            yVar2.e.add(this);
            this.h = interpolator;
            this.a = i5;
            this.b = i6;
            if (i4 == 3) {
                this.n = true;
            }
            this.k = i2 == 0 ? Float.MAX_VALUE : 1.0f / ((float) i2);
            a();
        }

        public void a() {
            if (this.i) {
                long nanoTime = System.nanoTime();
                this.l = nanoTime;
                float f2 = this.j - (((float) (((double) (nanoTime - this.l)) * 1.0E-6d)) * this.k);
                this.j = f2;
                if (f2 < 0.0f) {
                    this.j = 0.0f;
                }
                Interpolator interpolator = this.h;
                float interpolation = interpolator == null ? this.j : interpolator.getInterpolation(this.j);
                n nVar = this.d;
                boolean c2 = nVar.c(nVar.b, interpolation, nanoTime, this.f);
                if (this.j <= 0.0f) {
                    int i2 = this.a;
                    if (i2 != -1) {
                        this.d.b.setTag(i2, Long.valueOf(System.nanoTime()));
                    }
                    int i3 = this.b;
                    if (i3 != -1) {
                        this.d.b.setTag(i3, (Object) null);
                    }
                    this.g.f.add(this);
                }
                if (this.j > 0.0f || c2) {
                    this.g.a.invalidate();
                    return;
                }
                return;
            }
            long nanoTime2 = System.nanoTime();
            this.l = nanoTime2;
            float f3 = (((float) (((double) (nanoTime2 - this.l)) * 1.0E-6d)) * this.k) + this.j;
            this.j = f3;
            if (f3 >= 1.0f) {
                this.j = 1.0f;
            }
            Interpolator interpolator2 = this.h;
            float interpolation2 = interpolator2 == null ? this.j : interpolator2.getInterpolation(this.j);
            n nVar2 = this.d;
            boolean c3 = nVar2.c(nVar2.b, interpolation2, nanoTime2, this.f);
            if (this.j >= 1.0f) {
                int i4 = this.a;
                if (i4 != -1) {
                    this.d.b.setTag(i4, Long.valueOf(System.nanoTime()));
                }
                int i5 = this.b;
                if (i5 != -1) {
                    this.d.b.setTag(i5, (Object) null);
                }
                if (!this.n) {
                    this.g.f.add(this);
                }
            }
            if (this.j < 1.0f || c3) {
                this.g.a.invalidate();
            }
        }

        public void b(boolean z) {
            int i2;
            this.i = z;
            if (z && (i2 = this.e) != -1) {
                this.k = i2 == 0 ? Float.MAX_VALUE : 1.0f / ((float) i2);
            }
            this.g.a.invalidate();
            this.l = System.nanoTime();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.b = r0
            r1 = 0
            r9.c = r1
            r9.d = r1
            r9.h = r0
            r9.i = r0
            r9.l = r1
            r2 = 0
            r9.m = r2
            r9.n = r0
            r9.p = r0
            r9.q = r0
            r9.r = r0
            r9.s = r0
            r9.t = r0
            r9.u = r0
            r9.o = r10
            int r2 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
        L_0x0028:
            r3 = 1
            if (r2 == r3) goto L_0x00e5
            r4 = 3
            r5 = 2
            java.lang.String r6 = "ViewTransition"
            if (r2 == r5) goto L_0x0040
            if (r2 == r4) goto L_0x0035
            goto L_0x00d6
        L_0x0035:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            boolean r2 = r6.equals(r2)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            if (r2 == 0) goto L_0x00d6
            return
        L_0x0040:
            java.lang.String r2 = r11.getName()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            int r7 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            r8 = 4
            switch(r7) {
                case -1962203927: goto L_0x0073;
                case -1239391468: goto L_0x0069;
                case 61998586: goto L_0x0061;
                case 366511058: goto L_0x0057;
                case 1791837707: goto L_0x004d;
                default: goto L_0x004c;
            }     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
        L_0x004c:
            goto L_0x007d
        L_0x004d:
            java.lang.String r7 = "CustomAttribute"
            boolean r7 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            if (r7 == 0) goto L_0x007d
            r7 = r4
            goto L_0x007e
        L_0x0057:
            java.lang.String r7 = "CustomMethod"
            boolean r7 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            if (r7 == 0) goto L_0x007d
            r7 = r8
            goto L_0x007e
        L_0x0061:
            boolean r7 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            if (r7 == 0) goto L_0x007d
            r7 = r1
            goto L_0x007e
        L_0x0069:
            java.lang.String r7 = "KeyFrameSet"
            boolean r7 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            if (r7 == 0) goto L_0x007d
            r7 = r3
            goto L_0x007e
        L_0x0073:
            java.lang.String r7 = "ConstraintOverride"
            boolean r7 = r2.equals(r7)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            if (r7 == 0) goto L_0x007d
            r7 = r5
            goto L_0x007e
        L_0x007d:
            r7 = r0
        L_0x007e:
            if (r7 == 0) goto L_0x00d3
            if (r7 == r3) goto L_0x00cb
            if (r7 == r5) goto L_0x00c4
            if (r7 == r4) goto L_0x00bc
            if (r7 == r8) goto L_0x00bc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            java.lang.String r4 = g0.a.b.b.a.K()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            java.lang.String r4 = " unknown tag "
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            java.lang.String r2 = r3.toString()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            android.util.Log.e(r6, r2)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            java.lang.String r3 = ".xml:"
            r2.append(r3)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            int r3 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            r2.append(r3)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            java.lang.String r2 = r2.toString()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            android.util.Log.e(r6, r2)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            goto L_0x00d6
        L_0x00bc:
            h0.g.c.c$a r2 = r9.g     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r2.g     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            androidx.constraintlayout.widget.ConstraintAttribute.f(r10, r11, r2)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            goto L_0x00d6
        L_0x00c4:
            h0.g.c.c$a r2 = h0.g.c.c.d(r10, r11)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            r9.g = r2     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            goto L_0x00d6
        L_0x00cb:
            h0.g.b.b.g r2 = new h0.g.b.b.g     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            r2.<init>(r10, r11)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            r9.f = r2     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            goto L_0x00d6
        L_0x00d3:
            r9.d(r10, r11)     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
        L_0x00d6:
            int r2 = r11.next()     // Catch:{ XmlPullParserException -> 0x00e1, IOException -> 0x00dc }
            goto L_0x0028
        L_0x00dc:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x00e5
        L_0x00e1:
            r10 = move-exception
            r10.printStackTrace()
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.b.b.x.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void a(y yVar, MotionLayout motionLayout, int i2, c cVar, View... viewArr) {
        w wVar;
        Interpolator interpolator;
        MotionLayout motionLayout2 = motionLayout;
        int i3 = i2;
        c cVar2 = cVar;
        View[] viewArr2 = viewArr;
        if (!this.c) {
            int i4 = this.e;
            if (i4 == 2) {
                View view = viewArr2[0];
                n nVar = new n(view);
                q qVar = nVar.e;
                qVar.x = 0.0f;
                qVar.y = 0.0f;
                nVar.H = true;
                qVar.f(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
                nVar.f.f(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
                nVar.g.g(view);
                nVar.h.g(view);
                ArrayList arrayList = this.f.b.get(-1);
                if (arrayList != null) {
                    nVar.w.addAll(arrayList);
                }
                nVar.f(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
                int i5 = this.h;
                int i6 = this.i;
                int i7 = this.b;
                Context context = motionLayout.getContext();
                int i8 = this.l;
                if (i8 == -2) {
                    interpolator = AnimationUtils.loadInterpolator(context, this.n);
                } else if (i8 == -1) {
                    wVar = new w(this, h0.g.a.g.a.c.c(this.m));
                    new a(yVar, nVar, i5, i6, i7, wVar, this.p, this.q);
                    return;
                } else if (i8 == 0) {
                    interpolator = new AccelerateDecelerateInterpolator();
                } else if (i8 == 1) {
                    interpolator = new AccelerateInterpolator();
                } else if (i8 == 2) {
                    interpolator = new DecelerateInterpolator();
                } else if (i8 == 4) {
                    interpolator = new BounceInterpolator();
                } else if (i8 == 5) {
                    interpolator = new OvershootInterpolator();
                } else if (i8 != 6) {
                    interpolator = null;
                } else {
                    interpolator = new AnticipateInterpolator();
                }
                wVar = interpolator;
                new a(yVar, nVar, i5, i6, i7, wVar, this.p, this.q);
                return;
            }
            if (i4 == 1) {
                int[] constraintSetIds = motionLayout.getConstraintSetIds();
                for (int i9 : constraintSetIds) {
                    if (i9 != i3) {
                        c A = motionLayout2.A(i9);
                        for (View id : viewArr2) {
                            c.a i10 = A.i(id.getId());
                            c.a aVar = this.g;
                            if (aVar != null) {
                                c.a.C0035a aVar2 = aVar.h;
                                if (aVar2 != null) {
                                    aVar2.e(i10);
                                }
                                i10.g.putAll(this.g.g);
                            }
                        }
                    }
                }
            }
            c cVar3 = new c();
            cVar3.i.clear();
            for (Integer next : cVar2.i.keySet()) {
                c.a aVar3 = cVar2.i.get(next);
                if (aVar3 != null) {
                    cVar3.i.put(next, aVar3.clone());
                }
            }
            for (View id2 : viewArr2) {
                c.a i11 = cVar3.i(id2.getId());
                c.a aVar4 = this.g;
                if (aVar4 != null) {
                    c.a.C0035a aVar5 = aVar4.h;
                    if (aVar5 != null) {
                        aVar5.e(i11);
                    }
                    i11.g.putAll(this.g.g);
                }
            }
            motionLayout2.K(i3, cVar3);
            int i12 = R.id.view_transition;
            motionLayout2.K(i12, cVar2);
            motionLayout2.F(i12, -1, -1);
            r.b bVar = new r.b(-1, motionLayout2.o2, i12, i3);
            for (View view2 : viewArr2) {
                int i13 = this.h;
                if (i13 != -1) {
                    bVar.h = Math.max(i13, 8);
                }
                bVar.p = this.d;
                int i14 = this.l;
                String str = this.m;
                int i15 = this.n;
                bVar.e = i14;
                bVar.f = str;
                bVar.g = i15;
                int id3 = view2.getId();
                g gVar = this.f;
                if (gVar != null) {
                    g gVar2 = new g();
                    Iterator it = gVar.b.get(-1).iterator();
                    while (it.hasNext()) {
                        d b2 = ((d) it.next()).clone();
                        b2.b = id3;
                        gVar2.b(b2);
                    }
                    bVar.k.add(gVar2);
                }
            }
            motionLayout2.setTransition(bVar);
            a aVar6 = new a(this, viewArr2);
            motionLayout2.u(1.0f);
            motionLayout2.r3 = aVar6;
        }
    }

    public boolean b(View view) {
        int i2 = this.r;
        boolean z = i2 == -1 || view.getTag(i2) != null;
        int i3 = this.s;
        boolean z2 = i3 == -1 || view.getTag(i3) == null;
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.j == -1 && this.k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        if (this.k != null && (view.getLayoutParams() instanceof ConstraintLayout.a) && (str = ((ConstraintLayout.a) view.getLayoutParams()).X) != null && str.matches(this.k)) {
            return true;
        }
        return false;
    }

    public final void d(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.ViewTransition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == R.styleable.ViewTransition_android_id) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == R.styleable.ViewTransition_motionTarget) {
                if (MotionLayout.n2) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.k = obtainStyledAttributes.getString(index);
                } else {
                    this.j = obtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == R.styleable.ViewTransition_onStateTransition) {
                this.b = obtainStyledAttributes.getInt(index, this.b);
            } else if (index == R.styleable.ViewTransition_transitionDisable) {
                this.c = obtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == R.styleable.ViewTransition_pathMotionArc) {
                this.d = obtainStyledAttributes.getInt(index, this.d);
            } else if (index == R.styleable.ViewTransition_duration) {
                this.h = obtainStyledAttributes.getInt(index, this.h);
            } else if (index == R.styleable.ViewTransition_upDuration) {
                this.i = obtainStyledAttributes.getInt(index, this.i);
            } else if (index == R.styleable.ViewTransition_viewTransitionMode) {
                this.e = obtainStyledAttributes.getInt(index, this.e);
            } else if (index == R.styleable.ViewTransition_motionInterpolator) {
                int i3 = obtainStyledAttributes.peekValue(index).type;
                if (i3 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.n = resourceId2;
                    if (resourceId2 != -1) {
                        this.l = -2;
                    }
                } else if (i3 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.l = -1;
                    } else {
                        this.n = obtainStyledAttributes.getResourceId(index, -1);
                        this.l = -2;
                    }
                } else {
                    this.l = obtainStyledAttributes.getInteger(index, this.l);
                }
            } else if (index == R.styleable.ViewTransition_setsTag) {
                this.p = obtainStyledAttributes.getResourceId(index, this.p);
            } else if (index == R.styleable.ViewTransition_clearsTag) {
                this.q = obtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == R.styleable.ViewTransition_ifTagSet) {
                this.r = obtainStyledAttributes.getResourceId(index, this.r);
            } else if (index == R.styleable.ViewTransition_ifTagNotSet) {
                this.s = obtainStyledAttributes.getResourceId(index, this.s);
            } else if (index == R.styleable.ViewTransition_SharedValueId) {
                this.u = obtainStyledAttributes.getResourceId(index, this.u);
            } else if (index == R.styleable.ViewTransition_SharedValue) {
                this.t = obtainStyledAttributes.getInteger(index, this.t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ViewTransition(");
        P0.append(g0.a.b.b.a.N(this.o, this.a));
        P0.append(")");
        return P0.toString();
    }
}
