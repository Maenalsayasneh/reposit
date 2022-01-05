package h0.g.b.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: KeyAttributes */
public class e extends d {
    public int f = -1;
    public boolean g = false;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public float r = Float.NaN;
    public float s = Float.NaN;
    public float t = Float.NaN;
    public float u = Float.NaN;

    /* compiled from: KeyAttributes */
    public static class a {
        public static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyAttribute_android_alpha, 1);
            a.append(R.styleable.KeyAttribute_android_elevation, 2);
            a.append(R.styleable.KeyAttribute_android_rotation, 4);
            a.append(R.styleable.KeyAttribute_android_rotationX, 5);
            a.append(R.styleable.KeyAttribute_android_rotationY, 6);
            a.append(R.styleable.KeyAttribute_android_transformPivotX, 19);
            a.append(R.styleable.KeyAttribute_android_transformPivotY, 20);
            a.append(R.styleable.KeyAttribute_android_scaleX, 7);
            a.append(R.styleable.KeyAttribute_transitionPathRotate, 8);
            a.append(R.styleable.KeyAttribute_transitionEasing, 9);
            a.append(R.styleable.KeyAttribute_motionTarget, 10);
            a.append(R.styleable.KeyAttribute_framePosition, 12);
            a.append(R.styleable.KeyAttribute_curveFit, 13);
            a.append(R.styleable.KeyAttribute_android_scaleY, 14);
            a.append(R.styleable.KeyAttribute_android_translationX, 15);
            a.append(R.styleable.KeyAttribute_android_translationY, 16);
            a.append(R.styleable.KeyAttribute_android_translationZ, 17);
            a.append(R.styleable.KeyAttribute_motionProgress, 18);
        }
    }

    public e() {
        this.d = 1;
        this.e = new HashMap<>();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
        if (r1.equals("scaleY") == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.util.HashMap<java.lang.String, h0.g.b.a.c> r7) {
        /*
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01e2
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            h0.g.a.g.a.j r2 = (h0.g.a.g.a.j) r2
            if (r2 != 0) goto L_0x001d
            goto L_0x0008
        L_0x001d:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L_0x003e
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r6.e
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
            if (r1 == 0) goto L_0x0008
            h0.g.b.a.c$b r2 = (h0.g.b.a.c.b) r2
            int r3 = r6.a
            android.util.SparseArray<androidx.constraintlayout.widget.ConstraintAttribute> r2 = r2.f
            r2.append(r3, r1)
            goto L_0x0008
        L_0x003e:
            r3 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00e4;
                case -1249320805: goto L_0x00d8;
                case -1225497657: goto L_0x00cc;
                case -1225497656: goto L_0x00c0;
                case -1225497655: goto L_0x00b5;
                case -1001078227: goto L_0x00aa;
                case -908189618: goto L_0x009f;
                case -908189617: goto L_0x0096;
                case -760884510: goto L_0x008a;
                case -760884509: goto L_0x007d;
                case -40300674: goto L_0x0070;
                case -4379043: goto L_0x0063;
                case 37232917: goto L_0x0056;
                case 92909918: goto L_0x0049;
                default: goto L_0x0046;
            }
        L_0x0046:
            r4 = r3
            goto L_0x00ef
        L_0x0049:
            java.lang.String r4 = "alpha"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0052
            goto L_0x0046
        L_0x0052:
            r4 = 13
            goto L_0x00ef
        L_0x0056:
            java.lang.String r4 = "transitionPathRotate"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x005f
            goto L_0x0046
        L_0x005f:
            r4 = 12
            goto L_0x00ef
        L_0x0063:
            java.lang.String r4 = "elevation"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x006c
            goto L_0x0046
        L_0x006c:
            r4 = 11
            goto L_0x00ef
        L_0x0070:
            java.lang.String r4 = "rotation"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0079
            goto L_0x0046
        L_0x0079:
            r4 = 10
            goto L_0x00ef
        L_0x007d:
            java.lang.String r4 = "transformPivotY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0086
            goto L_0x0046
        L_0x0086:
            r4 = 9
            goto L_0x00ef
        L_0x008a:
            java.lang.String r4 = "transformPivotX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0093
            goto L_0x0046
        L_0x0093:
            r4 = 8
            goto L_0x00ef
        L_0x0096:
            java.lang.String r5 = "scaleY"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x00ef
            goto L_0x0046
        L_0x009f:
            java.lang.String r4 = "scaleX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00a8
            goto L_0x0046
        L_0x00a8:
            r4 = 6
            goto L_0x00ef
        L_0x00aa:
            java.lang.String r4 = "progress"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00b3
            goto L_0x0046
        L_0x00b3:
            r4 = 5
            goto L_0x00ef
        L_0x00b5:
            java.lang.String r4 = "translationZ"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00be
            goto L_0x0046
        L_0x00be:
            r4 = 4
            goto L_0x00ef
        L_0x00c0:
            java.lang.String r4 = "translationY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00ca
            goto L_0x0046
        L_0x00ca:
            r4 = 3
            goto L_0x00ef
        L_0x00cc:
            java.lang.String r4 = "translationX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00d6
            goto L_0x0046
        L_0x00d6:
            r4 = 2
            goto L_0x00ef
        L_0x00d8:
            java.lang.String r4 = "rotationY"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00e2
            goto L_0x0046
        L_0x00e2:
            r4 = 1
            goto L_0x00ef
        L_0x00e4:
            java.lang.String r4 = "rotationX"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00ee
            goto L_0x0046
        L_0x00ee:
            r4 = 0
        L_0x00ef:
            switch(r4) {
                case 0: goto L_0x01d1;
                case 1: goto L_0x01c0;
                case 2: goto L_0x01af;
                case 3: goto L_0x019e;
                case 4: goto L_0x018d;
                case 5: goto L_0x017c;
                case 6: goto L_0x016b;
                case 7: goto L_0x015a;
                case 8: goto L_0x0149;
                case 9: goto L_0x0138;
                case 10: goto L_0x0127;
                case 11: goto L_0x0116;
                case 12: goto L_0x0105;
                case 13: goto L_0x00f4;
                default: goto L_0x00f2;
            }
        L_0x00f2:
            goto L_0x0008
        L_0x00f4:
            float r1 = r6.h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.h
            r2.b(r1, r3)
            goto L_0x0008
        L_0x0105:
            float r1 = r6.o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.o
            r2.b(r1, r3)
            goto L_0x0008
        L_0x0116:
            float r1 = r6.i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.i
            r2.b(r1, r3)
            goto L_0x0008
        L_0x0127:
            float r1 = r6.j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.j
            r2.b(r1, r3)
            goto L_0x0008
        L_0x0138:
            float r1 = r6.l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.n
            r2.b(r1, r3)
            goto L_0x0008
        L_0x0149:
            float r1 = r6.k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.m
            r2.b(r1, r3)
            goto L_0x0008
        L_0x015a:
            float r1 = r6.q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.q
            r2.b(r1, r3)
            goto L_0x0008
        L_0x016b:
            float r1 = r6.p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.p
            r2.b(r1, r3)
            goto L_0x0008
        L_0x017c:
            float r1 = r6.u
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.u
            r2.b(r1, r3)
            goto L_0x0008
        L_0x018d:
            float r1 = r6.t
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.t
            r2.b(r1, r3)
            goto L_0x0008
        L_0x019e:
            float r1 = r6.s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.s
            r2.b(r1, r3)
            goto L_0x0008
        L_0x01af:
            float r1 = r6.r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.r
            r2.b(r1, r3)
            goto L_0x0008
        L_0x01c0:
            float r1 = r6.l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.l
            r2.b(r1, r3)
            goto L_0x0008
        L_0x01d1:
            float r1 = r6.k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.a
            float r3 = r6.k
            r2.b(r1, r3)
            goto L_0x0008
        L_0x01e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.b.b.e.a(java.util.HashMap):void");
    }

    /* renamed from: b */
    public d clone() {
        e eVar = new e();
        super.c(this);
        eVar.f = this.f;
        eVar.g = this.g;
        eVar.h = this.h;
        eVar.i = this.i;
        eVar.j = this.j;
        eVar.k = this.k;
        eVar.l = this.l;
        eVar.m = this.m;
        eVar.n = this.n;
        eVar.o = this.o;
        eVar.p = this.p;
        eVar.q = this.q;
        eVar.r = this.r;
        eVar.s = this.s;
        eVar.t = this.t;
        eVar.u = this.u;
        return eVar;
    }

    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.h)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.i)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add(NotificationCompat.CATEGORY_PROGRESS);
        }
        if (this.e.size() > 0) {
            for (String str : this.e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.KeyAttribute);
        SparseIntArray sparseIntArray = a.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (a.a.get(index)) {
                case 1:
                    this.h = obtainStyledAttributes.getFloat(index, this.h);
                    break;
                case 2:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 4:
                    this.j = obtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 5:
                    this.k = obtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 6:
                    this.l = obtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 7:
                    this.p = obtainStyledAttributes.getFloat(index, this.p);
                    break;
                case 8:
                    this.o = obtainStyledAttributes.getFloat(index, this.o);
                    break;
                case 9:
                    obtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.a = obtainStyledAttributes.getInt(index, this.a);
                    break;
                case 13:
                    this.f = obtainStyledAttributes.getInteger(index, this.f);
                    break;
                case 14:
                    this.q = obtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 15:
                    this.r = obtainStyledAttributes.getDimension(index, this.r);
                    break;
                case 16:
                    this.s = obtainStyledAttributes.getDimension(index, this.s);
                    break;
                case 17:
                    this.t = obtainStyledAttributes.getDimension(index, this.t);
                    break;
                case 18:
                    this.u = obtainStyledAttributes.getFloat(index, this.u);
                    break;
                case 19:
                    this.m = obtainStyledAttributes.getDimension(index, this.m);
                    break;
                case 20:
                    this.n = obtainStyledAttributes.getDimension(index, this.n);
                    break;
                default:
                    StringBuilder P0 = i0.d.a.a.a.P0("unused attribute 0x");
                    i0.d.a.a.a.d(index, P0, "   ");
                    P0.append(a.a.get(index));
                    Log.e("KeyAttribute", P0.toString());
                    break;
            }
        }
    }

    public void f(HashMap<String, Integer> hashMap) {
        if (this.f != -1) {
            if (!Float.isNaN(this.h)) {
                hashMap.put("alpha", Integer.valueOf(this.f));
            }
            if (!Float.isNaN(this.i)) {
                hashMap.put("elevation", Integer.valueOf(this.f));
            }
            if (!Float.isNaN(this.j)) {
                hashMap.put("rotation", Integer.valueOf(this.f));
            }
            if (!Float.isNaN(this.k)) {
                hashMap.put("rotationX", Integer.valueOf(this.f));
            }
            if (!Float.isNaN(this.l)) {
                hashMap.put("rotationY", Integer.valueOf(this.f));
            }
            if (!Float.isNaN(this.m)) {
                hashMap.put("transformPivotX", Integer.valueOf(this.f));
            }
            if (!Float.isNaN(this.n)) {
                hashMap.put("transformPivotY", Integer.valueOf(this.f));
            }
            if (!Float.isNaN(this.r)) {
                hashMap.put("translationX", Integer.valueOf(this.f));
            }
            if (!Float.isNaN(this.s)) {
                hashMap.put("translationY", Integer.valueOf(this.f));
            }
            if (!Float.isNaN(this.t)) {
                hashMap.put("translationZ", Integer.valueOf(this.f));
            }
            if (!Float.isNaN(this.o)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f));
            }
            if (!Float.isNaN(this.p)) {
                hashMap.put("scaleX", Integer.valueOf(this.f));
            }
            if (!Float.isNaN(this.q)) {
                hashMap.put("scaleY", Integer.valueOf(this.f));
            }
            if (!Float.isNaN(this.u)) {
                hashMap.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(this.f));
            }
            if (this.e.size() > 0) {
                for (String n02 : this.e.keySet()) {
                    hashMap.put(i0.d.a.a.a.n0("CUSTOM,", n02), Integer.valueOf(this.f));
                }
            }
        }
    }
}
