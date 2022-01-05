package h0.g.b.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;
import androidx.core.app.NotificationCompat;
import h0.g.a.g.a.j;
import h0.g.b.a.c;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: KeyCycle */
public class f extends d {
    public String f = null;
    public int g = 0;
    public int h = -1;
    public String i = null;
    public float j = Float.NaN;
    public float k = 0.0f;
    public float l = 0.0f;
    public float m = Float.NaN;
    public int n = -1;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public float r = Float.NaN;
    public float s = Float.NaN;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public float v = Float.NaN;
    public float w = Float.NaN;
    public float x = Float.NaN;
    public float y = Float.NaN;

    /* compiled from: KeyCycle */
    public static class a {
        public static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyCycle_motionTarget, 1);
            a.append(R.styleable.KeyCycle_framePosition, 2);
            a.append(R.styleable.KeyCycle_transitionEasing, 3);
            a.append(R.styleable.KeyCycle_curveFit, 4);
            a.append(R.styleable.KeyCycle_waveShape, 5);
            a.append(R.styleable.KeyCycle_wavePeriod, 6);
            a.append(R.styleable.KeyCycle_waveOffset, 7);
            a.append(R.styleable.KeyCycle_waveVariesBy, 8);
            a.append(R.styleable.KeyCycle_android_alpha, 9);
            a.append(R.styleable.KeyCycle_android_elevation, 10);
            a.append(R.styleable.KeyCycle_android_rotation, 11);
            a.append(R.styleable.KeyCycle_android_rotationX, 12);
            a.append(R.styleable.KeyCycle_android_rotationY, 13);
            a.append(R.styleable.KeyCycle_transitionPathRotate, 14);
            a.append(R.styleable.KeyCycle_android_scaleX, 15);
            a.append(R.styleable.KeyCycle_android_scaleY, 16);
            a.append(R.styleable.KeyCycle_android_translationX, 17);
            a.append(R.styleable.KeyCycle_android_translationY, 18);
            a.append(R.styleable.KeyCycle_android_translationZ, 19);
            a.append(R.styleable.KeyCycle_motionProgress, 20);
            a.append(R.styleable.KeyCycle_wavePhase, 21);
        }
    }

    public f() {
        this.d = 4;
        this.e = new HashMap<>();
    }

    public void a(HashMap<String, c> hashMap) {
        StringBuilder P0 = i0.d.a.a.a.P0("add ");
        P0.append(hashMap.size());
        P0.append(" values");
        String sb = P0.toString();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(2, stackTrace.length - 1);
        String str = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            StringBuilder P02 = i0.d.a.a.a.P0(".(");
            P02.append(stackTrace[i2].getFileName());
            P02.append(":");
            P02.append(stackTrace[i2].getLineNumber());
            P02.append(") ");
            P02.append(stackTrace[i2].getMethodName());
            String sb2 = P02.toString();
            str = i0.d.a.a.a.n0(str, " ");
            Log.v("KeyCycle", sb + str + sb2 + str);
        }
        for (String next : hashMap.keySet()) {
            j jVar = hashMap.get(next);
            if (jVar != null) {
                next.hashCode();
                next.hashCode();
                char c = 65535;
                switch (next.hashCode()) {
                    case -1249320806:
                        if (next.equals("rotationX")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1249320805:
                        if (next.equals("rotationY")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1225497657:
                        if (next.equals("translationX")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1225497656:
                        if (next.equals("translationY")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -1225497655:
                        if (next.equals("translationZ")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1001078227:
                        if (next.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                            c = 5;
                            break;
                        }
                        break;
                    case -908189618:
                        if (next.equals("scaleX")) {
                            c = 6;
                            break;
                        }
                        break;
                    case -908189617:
                        if (next.equals("scaleY")) {
                            c = 7;
                            break;
                        }
                        break;
                    case -40300674:
                        if (next.equals("rotation")) {
                            c = 8;
                            break;
                        }
                        break;
                    case -4379043:
                        if (next.equals("elevation")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 37232917:
                        if (next.equals("transitionPathRotate")) {
                            c = 10;
                            break;
                        }
                        break;
                    case 92909918:
                        if (next.equals("alpha")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (next.equals("waveOffset")) {
                            c = 12;
                            break;
                        }
                        break;
                    case 1530034690:
                        if (next.equals("wavePhase")) {
                            c = 13;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        jVar.b(this.a, this.s);
                        break;
                    case 1:
                        jVar.b(this.a, this.t);
                        break;
                    case 2:
                        jVar.b(this.a, this.w);
                        break;
                    case 3:
                        jVar.b(this.a, this.x);
                        break;
                    case 4:
                        jVar.b(this.a, this.y);
                        break;
                    case 5:
                        jVar.b(this.a, this.m);
                        break;
                    case 6:
                        jVar.b(this.a, this.u);
                        break;
                    case 7:
                        jVar.b(this.a, this.v);
                        break;
                    case 8:
                        jVar.b(this.a, this.q);
                        break;
                    case 9:
                        jVar.b(this.a, this.p);
                        break;
                    case 10:
                        jVar.b(this.a, this.r);
                        break;
                    case 11:
                        jVar.b(this.a, this.o);
                        break;
                    case 12:
                        jVar.b(this.a, this.k);
                        break;
                    case 13:
                        jVar.b(this.a, this.l);
                        break;
                    default:
                        if (next.startsWith("CUSTOM")) {
                            break;
                        } else {
                            Log.v("WARNING KeyCycle", "  UNKNOWN  " + next);
                            break;
                        }
                }
            }
        }
    }

    /* renamed from: b */
    public d clone() {
        f fVar = new f();
        super.c(this);
        fVar.f = this.f;
        fVar.g = this.g;
        fVar.h = this.h;
        fVar.i = this.i;
        fVar.j = this.j;
        fVar.k = this.k;
        fVar.l = this.l;
        fVar.m = this.m;
        fVar.n = this.n;
        fVar.o = this.o;
        fVar.p = this.p;
        fVar.q = this.q;
        fVar.r = this.r;
        fVar.s = this.s;
        fVar.t = this.t;
        fVar.u = this.u;
        fVar.v = this.v;
        fVar.w = this.w;
        fVar.x = this.x;
        fVar.y = this.y;
        return fVar;
    }

    public void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.o)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.w)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.x)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.y)) {
            hashSet.add("translationZ");
        }
        if (this.e.size() > 0) {
            for (String str : this.e.keySet()) {
                hashSet.add("CUSTOM," + str);
            }
        }
    }

    public void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.KeyCycle);
        SparseIntArray sparseIntArray = a.a;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (a.a.get(index)) {
                case 1:
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
                case 2:
                    this.a = obtainStyledAttributes.getInt(index, this.a);
                    break;
                case 3:
                    this.f = obtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.g = obtainStyledAttributes.getInteger(index, this.g);
                    break;
                case 5:
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        this.h = obtainStyledAttributes.getInt(index, this.h);
                        break;
                    } else {
                        this.i = obtainStyledAttributes.getString(index);
                        this.h = 7;
                        break;
                    }
                case 6:
                    this.j = obtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 7:
                    if (obtainStyledAttributes.peekValue(index).type != 5) {
                        this.k = obtainStyledAttributes.getFloat(index, this.k);
                        break;
                    } else {
                        this.k = obtainStyledAttributes.getDimension(index, this.k);
                        break;
                    }
                case 8:
                    this.n = obtainStyledAttributes.getInt(index, this.n);
                    break;
                case 9:
                    this.o = obtainStyledAttributes.getFloat(index, this.o);
                    break;
                case 10:
                    this.p = obtainStyledAttributes.getDimension(index, this.p);
                    break;
                case 11:
                    this.q = obtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 12:
                    this.s = obtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 13:
                    this.t = obtainStyledAttributes.getFloat(index, this.t);
                    break;
                case 14:
                    this.r = obtainStyledAttributes.getFloat(index, this.r);
                    break;
                case 15:
                    this.u = obtainStyledAttributes.getFloat(index, this.u);
                    break;
                case 16:
                    this.v = obtainStyledAttributes.getFloat(index, this.v);
                    break;
                case 17:
                    this.w = obtainStyledAttributes.getDimension(index, this.w);
                    break;
                case 18:
                    this.x = obtainStyledAttributes.getDimension(index, this.x);
                    break;
                case 19:
                    this.y = obtainStyledAttributes.getDimension(index, this.y);
                    break;
                case 20:
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 21:
                    this.l = obtainStyledAttributes.getFloat(index, this.l) / 360.0f;
                    break;
                default:
                    StringBuilder P0 = i0.d.a.a.a.P0("unused attribute 0x");
                    i0.d.a.a.a.d(index, P0, "   ");
                    P0.append(a.a.get(index));
                    Log.e("KeyCycle", P0.toString());
                    break;
            }
        }
    }
}
