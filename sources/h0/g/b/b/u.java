package h0.g.b.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: TouchResponse */
public class u {
    public static final float[][] a = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] b = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    public float A = 10.0f;
    public float B = 1.0f;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public int E = 0;
    public int F = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public float i = 0.5f;
    public float j = 0.5f;
    public int k = -1;
    public boolean l = false;
    public float m = 0.0f;
    public float n = 1.0f;
    public boolean o = false;
    public float[] p = new float[2];
    public int[] q = new int[2];
    public float r;
    public float s;
    public final MotionLayout t;
    public float u = 4.0f;
    public float v = 1.2f;
    public boolean w = true;
    public float x = 1.0f;
    public int y = 0;
    public float z = 10.0f;

    public u(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.t = motionLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.OnSwipe);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == R.styleable.OnSwipe_touchAnchorId) {
                this.f = obtainStyledAttributes.getResourceId(index, this.f);
            } else if (index == R.styleable.OnSwipe_touchAnchorSide) {
                int i3 = obtainStyledAttributes.getInt(index, this.c);
                this.c = i3;
                float[][] fArr = a;
                this.j = fArr[i3][0];
                this.i = fArr[i3][1];
            } else if (index == R.styleable.OnSwipe_dragDirection) {
                int i4 = obtainStyledAttributes.getInt(index, this.d);
                this.d = i4;
                float[][] fArr2 = b;
                if (i4 < fArr2.length) {
                    this.m = fArr2[i4][0];
                    this.n = fArr2[i4][1];
                } else {
                    this.n = Float.NaN;
                    this.m = Float.NaN;
                    this.l = true;
                }
            } else if (index == R.styleable.OnSwipe_maxVelocity) {
                this.u = obtainStyledAttributes.getFloat(index, this.u);
            } else if (index == R.styleable.OnSwipe_maxAcceleration) {
                this.v = obtainStyledAttributes.getFloat(index, this.v);
            } else if (index == R.styleable.OnSwipe_moveWhenScrollAtTop) {
                this.w = obtainStyledAttributes.getBoolean(index, this.w);
            } else if (index == R.styleable.OnSwipe_dragScale) {
                this.x = obtainStyledAttributes.getFloat(index, this.x);
            } else if (index == R.styleable.OnSwipe_dragThreshold) {
                this.z = obtainStyledAttributes.getFloat(index, this.z);
            } else if (index == R.styleable.OnSwipe_touchRegionId) {
                this.g = obtainStyledAttributes.getResourceId(index, this.g);
            } else if (index == R.styleable.OnSwipe_onTouchUp) {
                this.e = obtainStyledAttributes.getInt(index, this.e);
            } else if (index == R.styleable.OnSwipe_nestedScrollFlags) {
                this.y = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == R.styleable.OnSwipe_limitBoundsTo) {
                this.h = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == R.styleable.OnSwipe_rotationCenterId) {
                this.k = obtainStyledAttributes.getResourceId(index, this.k);
            } else if (index == R.styleable.OnSwipe_springDamping) {
                this.A = obtainStyledAttributes.getFloat(index, this.A);
            } else if (index == R.styleable.OnSwipe_springMass) {
                this.B = obtainStyledAttributes.getFloat(index, this.B);
            } else if (index == R.styleable.OnSwipe_springStiffness) {
                this.C = obtainStyledAttributes.getFloat(index, this.C);
            } else if (index == R.styleable.OnSwipe_springStopThreshold) {
                this.D = obtainStyledAttributes.getFloat(index, this.D);
            } else if (index == R.styleable.OnSwipe_springBoundary) {
                this.E = obtainStyledAttributes.getInt(index, this.E);
            } else if (index == R.styleable.OnSwipe_autoCompleteMode) {
                this.F = obtainStyledAttributes.getInt(index, this.F);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public RectF a(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i2 = this.h;
        if (i2 == -1 || (findViewById = viewGroup.findViewById(i2)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    public RectF b(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i2 = this.g;
        if (i2 == -1 || (findViewById = viewGroup.findViewById(i2)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    public void c(boolean z2) {
        if (z2) {
            float[][] fArr = b;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = a;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = b;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = a;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = a;
        int i2 = this.c;
        this.j = fArr5[i2][0];
        this.i = fArr5[i2][1];
        int i3 = this.d;
        float[][] fArr6 = b;
        if (i3 < fArr6.length) {
            this.m = fArr6[i3][0];
            this.n = fArr6[i3][1];
        }
    }

    public String toString() {
        if (Float.isNaN(this.m)) {
            return "rotation";
        }
        return this.m + " , " + this.n;
    }
}
