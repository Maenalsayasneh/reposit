package h0.g.b.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;
import h0.g.b.a.c;
import java.util.HashMap;

/* compiled from: KeyPosition */
public class h extends i {
    public String g = null;
    public int h = -1;
    public int i = 0;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public int p = 0;
    public float q = Float.NaN;
    public float r = Float.NaN;

    /* compiled from: KeyPosition */
    public static class a {
        public static SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyPosition_motionTarget, 1);
            a.append(R.styleable.KeyPosition_framePosition, 2);
            a.append(R.styleable.KeyPosition_transitionEasing, 3);
            a.append(R.styleable.KeyPosition_curveFit, 4);
            a.append(R.styleable.KeyPosition_drawPath, 5);
            a.append(R.styleable.KeyPosition_percentX, 6);
            a.append(R.styleable.KeyPosition_percentY, 7);
            a.append(R.styleable.KeyPosition_keyPositionType, 9);
            a.append(R.styleable.KeyPosition_sizePercent, 8);
            a.append(R.styleable.KeyPosition_percentWidth, 11);
            a.append(R.styleable.KeyPosition_percentHeight, 12);
            a.append(R.styleable.KeyPosition_pathMotionArc, 10);
        }
    }

    public h() {
        this.d = 2;
    }

    public void a(HashMap<String, c> hashMap) {
    }

    public d b() {
        h hVar = new h();
        super.c(this);
        hVar.g = this.g;
        hVar.h = this.h;
        hVar.i = this.i;
        hVar.j = this.j;
        hVar.k = Float.NaN;
        hVar.l = this.l;
        hVar.m = this.m;
        hVar.n = this.n;
        hVar.o = this.o;
        hVar.q = this.q;
        hVar.r = this.r;
        return hVar;
    }

    public void e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.KeyPosition);
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
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        this.g = h0.g.a.g.a.c.b[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    } else {
                        this.g = obtainStyledAttributes.getString(index);
                        break;
                    }
                case 4:
                    this.f = obtainStyledAttributes.getInteger(index, this.f);
                    break;
                case 5:
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                    break;
                case 6:
                    this.l = obtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 7:
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 8:
                    float f = obtainStyledAttributes.getFloat(index, this.k);
                    this.j = f;
                    this.k = f;
                    break;
                case 9:
                    this.p = obtainStyledAttributes.getInt(index, this.p);
                    break;
                case 10:
                    this.h = obtainStyledAttributes.getInt(index, this.h);
                    break;
                case 11:
                    this.j = obtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 12:
                    this.k = obtainStyledAttributes.getFloat(index, this.k);
                    break;
                default:
                    StringBuilder P0 = i0.d.a.a.a.P0("unused attribute 0x");
                    i0.d.a.a.a.d(index, P0, "   ");
                    P0.append(a.a.get(index));
                    Log.e("KeyPosition", P0.toString());
                    break;
            }
        }
        if (this.a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }
}
