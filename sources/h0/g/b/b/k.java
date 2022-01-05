package h0.g.b.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import h0.g.b.a.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: KeyTrigger */
public class k extends d {
    public int f = -1;
    public String g = null;
    public int h = -1;
    public String i = null;
    public String j = null;
    public int k = -1;
    public int l = -1;
    public View m = null;
    public float n = 0.1f;
    public boolean o = true;
    public boolean p = true;
    public boolean q = true;
    public float r = Float.NaN;
    public float s;
    public boolean t = false;
    public int u = -1;
    public int v = -1;
    public int w = -1;
    public RectF x = new RectF();
    public RectF y = new RectF();
    public HashMap<String, Method> z = new HashMap<>();

    /* compiled from: KeyTrigger */
    public static class a {
        public static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTrigger_framePosition, 8);
            a.append(R.styleable.KeyTrigger_onCross, 4);
            a.append(R.styleable.KeyTrigger_onNegativeCross, 1);
            a.append(R.styleable.KeyTrigger_onPositiveCross, 2);
            a.append(R.styleable.KeyTrigger_motionTarget, 7);
            a.append(R.styleable.KeyTrigger_triggerId, 6);
            a.append(R.styleable.KeyTrigger_triggerSlack, 5);
            a.append(R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
            a.append(R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
            a.append(R.styleable.KeyTrigger_triggerReceiver, 11);
            a.append(R.styleable.KeyTrigger_viewTransitionOnCross, 12);
            a.append(R.styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
            a.append(R.styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }
    }

    public k() {
        this.d = 5;
        this.e = new HashMap<>();
    }

    public void a(HashMap<String, c> hashMap) {
    }

    /* renamed from: b */
    public d clone() {
        k kVar = new k();
        super.c(this);
        kVar.f = this.f;
        kVar.g = this.g;
        kVar.h = this.h;
        kVar.i = this.i;
        kVar.j = this.j;
        kVar.k = this.k;
        kVar.l = this.l;
        kVar.m = this.m;
        kVar.n = this.n;
        kVar.o = this.o;
        kVar.p = this.p;
        kVar.q = this.q;
        kVar.r = this.r;
        kVar.s = this.s;
        kVar.t = this.t;
        kVar.x = this.x;
        kVar.y = this.y;
        kVar.z = this.z;
        return kVar;
    }

    public void d(HashSet<String> hashSet) {
    }

    public void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.KeyTrigger);
        SparseIntArray sparseIntArray = a.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (a.a.get(index)) {
                case 1:
                    this.i = obtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.j = obtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.g = obtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.n = obtainStyledAttributes.getFloat(index, this.n);
                    break;
                case 6:
                    this.k = obtainStyledAttributes.getResourceId(index, this.k);
                    break;
                case 7:
                    if (!MotionLayout.n2) {
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.b = obtainStyledAttributes.getResourceId(index, this.b);
                            break;
                        } else {
                            this.c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    } else {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    }
                case 8:
                    int integer = obtainStyledAttributes.getInteger(index, this.a);
                    this.a = integer;
                    this.r = (((float) integer) + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.l = obtainStyledAttributes.getResourceId(index, this.l);
                    break;
                case 10:
                    this.t = obtainStyledAttributes.getBoolean(index, this.t);
                    break;
                case 11:
                    this.h = obtainStyledAttributes.getResourceId(index, this.h);
                    break;
                case 12:
                    this.w = obtainStyledAttributes.getResourceId(index, this.w);
                    break;
                case 13:
                    this.u = obtainStyledAttributes.getResourceId(index, this.u);
                    break;
                case 14:
                    this.v = obtainStyledAttributes.getResourceId(index, this.v);
                    break;
                default:
                    StringBuilder P0 = i0.d.a.a.a.P0("unused attribute 0x");
                    i0.d.a.a.a.d(index, P0, "   ");
                    P0.append(a.a.get(index));
                    Log.e("KeyTrigger", P0.toString());
                    break;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(float r12, android.view.View r13) {
        /*
            r11 = this;
            int r0 = r11.l
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0061
            android.view.View r0 = r11.m
            if (r0 != 0) goto L_0x0019
            android.view.ViewParent r0 = r13.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r4 = r11.l
            android.view.View r0 = r0.findViewById(r4)
            r11.m = r0
        L_0x0019:
            android.graphics.RectF r0 = r11.x
            android.view.View r4 = r11.m
            boolean r5 = r11.t
            r11.i(r0, r4, r5)
            android.graphics.RectF r0 = r11.y
            boolean r4 = r11.t
            r11.i(r0, r13, r4)
            android.graphics.RectF r0 = r11.x
            android.graphics.RectF r4 = r11.y
            boolean r0 = r0.intersect(r4)
            if (r0 == 0) goto L_0x004b
            boolean r0 = r11.o
            if (r0 == 0) goto L_0x003b
            r11.o = r2
            r0 = r3
            goto L_0x003c
        L_0x003b:
            r0 = r2
        L_0x003c:
            boolean r4 = r11.q
            if (r4 == 0) goto L_0x0044
            r11.q = r2
            r4 = r3
            goto L_0x0045
        L_0x0044:
            r4 = r2
        L_0x0045:
            r11.p = r3
            r5 = r4
            r4 = r2
            goto L_0x00df
        L_0x004b:
            boolean r0 = r11.o
            if (r0 != 0) goto L_0x0053
            r11.o = r3
            r0 = r3
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            boolean r4 = r11.p
            if (r4 == 0) goto L_0x005c
            r11.p = r2
            r4 = r3
            goto L_0x005d
        L_0x005c:
            r4 = r2
        L_0x005d:
            r11.q = r3
            goto L_0x00de
        L_0x0061:
            boolean r0 = r11.o
            r4 = 0
            if (r0 == 0) goto L_0x0076
            float r0 = r11.r
            float r5 = r12 - r0
            float r6 = r11.s
            float r6 = r6 - r0
            float r6 = r6 * r5
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0086
            r11.o = r2
            r0 = r3
            goto L_0x0087
        L_0x0076:
            float r0 = r11.r
            float r0 = r12 - r0
            float r0 = java.lang.Math.abs(r0)
            float r5 = r11.n
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0086
            r11.o = r3
        L_0x0086:
            r0 = r2
        L_0x0087:
            boolean r5 = r11.p
            if (r5 == 0) goto L_0x009f
            float r5 = r11.r
            float r6 = r12 - r5
            float r7 = r11.s
            float r7 = r7 - r5
            float r7 = r7 * r6
            int r5 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00af
            int r5 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x00af
            r11.p = r2
            r5 = r3
            goto L_0x00b0
        L_0x009f:
            float r5 = r11.r
            float r5 = r12 - r5
            float r5 = java.lang.Math.abs(r5)
            float r6 = r11.n
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x00af
            r11.p = r3
        L_0x00af:
            r5 = r2
        L_0x00b0:
            boolean r6 = r11.q
            if (r6 == 0) goto L_0x00cd
            float r6 = r11.r
            float r7 = r12 - r6
            float r8 = r11.s
            float r8 = r8 - r6
            float r8 = r8 * r7
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x00c8
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c8
            r11.q = r2
            r4 = r3
            goto L_0x00c9
        L_0x00c8:
            r4 = r2
        L_0x00c9:
            r10 = r5
            r5 = r4
            r4 = r10
            goto L_0x00df
        L_0x00cd:
            float r4 = r11.r
            float r4 = r12 - r4
            float r4 = java.lang.Math.abs(r4)
            float r6 = r11.n
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x00dd
            r11.q = r3
        L_0x00dd:
            r4 = r5
        L_0x00de:
            r5 = r2
        L_0x00df:
            r11.s = r12
            if (r4 != 0) goto L_0x00e7
            if (r0 != 0) goto L_0x00e7
            if (r5 == 0) goto L_0x010e
        L_0x00e7:
            android.view.ViewParent r6 = r13.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r6 = (androidx.constraintlayout.motion.widget.MotionLayout) r6
            int r7 = r11.k
            androidx.constraintlayout.motion.widget.MotionLayout$i r8 = r6.H2
            if (r8 == 0) goto L_0x00f6
            r8.c(r6, r7, r5, r12)
        L_0x00f6:
            java.util.concurrent.CopyOnWriteArrayList<androidx.constraintlayout.motion.widget.MotionLayout$i> r8 = r6.a3
            if (r8 == 0) goto L_0x010e
            java.util.Iterator r8 = r8.iterator()
        L_0x00fe:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x010e
            java.lang.Object r9 = r8.next()
            androidx.constraintlayout.motion.widget.MotionLayout$i r9 = (androidx.constraintlayout.motion.widget.MotionLayout.i) r9
            r9.c(r6, r7, r5, r12)
            goto L_0x00fe
        L_0x010e:
            int r12 = r11.h
            if (r12 != r1) goto L_0x0114
            r12 = r13
            goto L_0x0120
        L_0x0114:
            android.view.ViewParent r12 = r13.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r12 = (androidx.constraintlayout.motion.widget.MotionLayout) r12
            int r6 = r11.h
            android.view.View r12 = r12.findViewById(r6)
        L_0x0120:
            if (r4 == 0) goto L_0x013c
            java.lang.String r4 = r11.i
            if (r4 == 0) goto L_0x0129
            r11.h(r4, r12)
        L_0x0129:
            int r4 = r11.u
            if (r4 == r1) goto L_0x013c
            android.view.ViewParent r4 = r13.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r4 = (androidx.constraintlayout.motion.widget.MotionLayout) r4
            int r6 = r11.u
            android.view.View[] r7 = new android.view.View[r3]
            r7[r2] = r12
            r4.L(r6, r7)
        L_0x013c:
            if (r5 == 0) goto L_0x0158
            java.lang.String r4 = r11.j
            if (r4 == 0) goto L_0x0145
            r11.h(r4, r12)
        L_0x0145:
            int r4 = r11.v
            if (r4 == r1) goto L_0x0158
            android.view.ViewParent r4 = r13.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r4 = (androidx.constraintlayout.motion.widget.MotionLayout) r4
            int r5 = r11.v
            android.view.View[] r6 = new android.view.View[r3]
            r6[r2] = r12
            r4.L(r5, r6)
        L_0x0158:
            if (r0 == 0) goto L_0x0174
            java.lang.String r0 = r11.g
            if (r0 == 0) goto L_0x0161
            r11.h(r0, r12)
        L_0x0161:
            int r0 = r11.w
            if (r0 == r1) goto L_0x0174
            android.view.ViewParent r13 = r13.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r13 = (androidx.constraintlayout.motion.widget.MotionLayout) r13
            int r0 = r11.w
            android.view.View[] r1 = new android.view.View[r3]
            r1[r2] = r12
            r13.L(r0, r1)
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.b.b.k.g(float, android.view.View):void");
    }

    public final void h(String str, View view) {
        Method method;
        ConstraintAttribute constraintAttribute;
        if (str != null) {
            if (str.startsWith(".")) {
                boolean z2 = str.length() == 1;
                if (!z2) {
                    str = str.substring(1).toLowerCase(Locale.ROOT);
                }
                for (String next : this.e.keySet()) {
                    String lowerCase = next.toLowerCase(Locale.ROOT);
                    if ((z2 || lowerCase.matches(str)) && (constraintAttribute = this.e.get(next)) != null) {
                        Class<?> cls = view.getClass();
                        String str2 = constraintAttribute.b;
                        String n02 = !constraintAttribute.a ? i0.d.a.a.a.n0("set", str2) : str2;
                        try {
                            switch (constraintAttribute.c.ordinal()) {
                                case 0:
                                case 7:
                                    cls.getMethod(n02, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(constraintAttribute.d)});
                                    break;
                                case 1:
                                    cls.getMethod(n02, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(constraintAttribute.e)});
                                    break;
                                case 2:
                                    cls.getMethod(n02, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(constraintAttribute.h)});
                                    break;
                                case 3:
                                    Method method2 = cls.getMethod(n02, new Class[]{Drawable.class});
                                    ColorDrawable colorDrawable = new ColorDrawable();
                                    colorDrawable.setColor(constraintAttribute.h);
                                    method2.invoke(view, new Object[]{colorDrawable});
                                    break;
                                case 4:
                                    cls.getMethod(n02, new Class[]{CharSequence.class}).invoke(view, new Object[]{constraintAttribute.f});
                                    break;
                                case 5:
                                    cls.getMethod(n02, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(constraintAttribute.g)});
                                    break;
                                case 6:
                                    cls.getMethod(n02, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(constraintAttribute.e)});
                                    break;
                            }
                        } catch (NoSuchMethodException e) {
                            Log.e("TransitionLayout", e.getMessage());
                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                            StringBuilder sb = new StringBuilder();
                            sb.append(cls.getName());
                            sb.append(" must have a method ");
                            sb.append(n02);
                            Log.e("TransitionLayout", sb.toString());
                        } catch (IllegalAccessException e2) {
                            StringBuilder T0 = i0.d.a.a.a.T0(" Custom Attribute \"", str2, "\" not found on ");
                            T0.append(cls.getName());
                            Log.e("TransitionLayout", T0.toString());
                            e2.printStackTrace();
                        } catch (InvocationTargetException e3) {
                            StringBuilder T02 = i0.d.a.a.a.T0(" Custom Attribute \"", str2, "\" not found on ");
                            T02.append(cls.getName());
                            Log.e("TransitionLayout", T02.toString());
                            e3.printStackTrace();
                        }
                    }
                }
                return;
            }
            if (this.z.containsKey(str)) {
                method = this.z.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.z.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.z.put(str, (Object) null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + g0.a.b.b.a.O(view));
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused2) {
                StringBuilder P0 = i0.d.a.a.a.P0("Exception in call \"");
                P0.append(this.g);
                P0.append("\"on class ");
                P0.append(view.getClass().getSimpleName());
                P0.append(" ");
                P0.append(g0.a.b.b.a.O(view));
                Log.e("KeyTrigger", P0.toString());
            }
        }
    }

    public final void i(RectF rectF, View view, boolean z2) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z2) {
            view.getMatrix().mapRect(rectF);
        }
    }
}
