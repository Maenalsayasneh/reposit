package h0.g.b.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;
import androidx.core.app.NotificationCompat;
import h0.g.b.a.c;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: KeyTimeCycle */
public class j extends d {
    public String f;
    public int g = -1;
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
    public int t = 0;
    public float u = Float.NaN;
    public float v = 0.0f;

    /* compiled from: KeyTimeCycle */
    public static class a {
        public static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTimeCycle_android_alpha, 1);
            a.append(R.styleable.KeyTimeCycle_android_elevation, 2);
            a.append(R.styleable.KeyTimeCycle_android_rotation, 4);
            a.append(R.styleable.KeyTimeCycle_android_rotationX, 5);
            a.append(R.styleable.KeyTimeCycle_android_rotationY, 6);
            a.append(R.styleable.KeyTimeCycle_android_scaleX, 7);
            a.append(R.styleable.KeyTimeCycle_transitionPathRotate, 8);
            a.append(R.styleable.KeyTimeCycle_transitionEasing, 9);
            a.append(R.styleable.KeyTimeCycle_motionTarget, 10);
            a.append(R.styleable.KeyTimeCycle_framePosition, 12);
            a.append(R.styleable.KeyTimeCycle_curveFit, 13);
            a.append(R.styleable.KeyTimeCycle_android_scaleY, 14);
            a.append(R.styleable.KeyTimeCycle_android_translationX, 15);
            a.append(R.styleable.KeyTimeCycle_android_translationY, 16);
            a.append(R.styleable.KeyTimeCycle_android_translationZ, 17);
            a.append(R.styleable.KeyTimeCycle_motionProgress, 18);
            a.append(R.styleable.KeyTimeCycle_wavePeriod, 20);
            a.append(R.styleable.KeyTimeCycle_waveOffset, 21);
            a.append(R.styleable.KeyTimeCycle_waveShape, 19);
        }
    }

    public j() {
        this.d = 3;
        this.e = new HashMap<>();
    }

    public void a(HashMap<String, c> hashMap) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    /* renamed from: b */
    public d clone() {
        j jVar = new j();
        super.c(this);
        jVar.f = this.f;
        jVar.g = this.g;
        jVar.t = this.t;
        jVar.u = this.u;
        jVar.v = this.v;
        jVar.s = this.s;
        jVar.h = this.h;
        jVar.i = this.i;
        jVar.j = this.j;
        jVar.m = this.m;
        jVar.k = this.k;
        jVar.l = this.l;
        jVar.n = this.n;
        jVar.o = this.o;
        jVar.p = this.p;
        jVar.q = this.q;
        jVar.r = this.r;
        return jVar;
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
        if (!Float.isNaN(this.p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add(NotificationCompat.CATEGORY_PROGRESS);
        }
        if (this.e.size() > 0) {
            for (String str : this.e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.KeyTimeCycle);
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
                    this.n = obtainStyledAttributes.getFloat(index, this.n);
                    break;
                case 8:
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 9:
                    this.f = obtainStyledAttributes.getString(index);
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
                    this.g = obtainStyledAttributes.getInteger(index, this.g);
                    break;
                case 14:
                    this.o = obtainStyledAttributes.getFloat(index, this.o);
                    break;
                case 15:
                    this.p = obtainStyledAttributes.getDimension(index, this.p);
                    break;
                case 16:
                    this.q = obtainStyledAttributes.getDimension(index, this.q);
                    break;
                case 17:
                    this.r = obtainStyledAttributes.getDimension(index, this.r);
                    break;
                case 18:
                    this.s = obtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 19:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        this.t = obtainStyledAttributes.getInt(index, this.t);
                        break;
                    } else {
                        obtainStyledAttributes.getString(index);
                        this.t = 7;
                        break;
                    }
                case 20:
                    this.u = obtainStyledAttributes.getFloat(index, this.u);
                    break;
                case 21:
                    if (obtainStyledAttributes.peekValue(index).type != 5) {
                        this.v = obtainStyledAttributes.getFloat(index, this.v);
                        break;
                    } else {
                        this.v = obtainStyledAttributes.getDimension(index, this.v);
                        break;
                    }
                default:
                    StringBuilder P0 = i0.d.a.a.a.P0("unused attribute 0x");
                    i0.d.a.a.a.d(index, P0, "   ");
                    P0.append(a.a.get(index));
                    Log.e("KeyTimeCycle", P0.toString());
                    break;
            }
        }
    }

    public void f(HashMap<String, Integer> hashMap) {
        if (this.g != -1) {
            if (!Float.isNaN(this.h)) {
                hashMap.put("alpha", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.i)) {
                hashMap.put("elevation", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.j)) {
                hashMap.put("rotation", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.k)) {
                hashMap.put("rotationX", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.l)) {
                hashMap.put("rotationY", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.p)) {
                hashMap.put("translationX", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.q)) {
                hashMap.put("translationY", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.r)) {
                hashMap.put("translationZ", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.m)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.n)) {
                hashMap.put("scaleX", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.n)) {
                hashMap.put("scaleY", Integer.valueOf(this.g));
            }
            if (!Float.isNaN(this.s)) {
                hashMap.put(NotificationCompat.CATEGORY_PROGRESS, Integer.valueOf(this.g));
            }
            if (this.e.size() > 0) {
                for (String n02 : this.e.keySet()) {
                    hashMap.put(i0.d.a.a.a.n0("CUSTOM,", n02), Integer.valueOf(this.g));
                }
            }
        }
    }
}
