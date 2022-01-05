package h0.v.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import h0.i.i.q;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FastScroller */
public class i extends RecyclerView.m implements RecyclerView.r {
    public static final int[] c = {16842919};
    public static final int[] d = new int[0];
    public final Drawable Y1;
    public final int Z1;
    public final int a2;
    public final StateListDrawable b2;
    public final Drawable c2;
    public final int d2;
    public final int e2;
    public int f2;
    public int g2;
    public float h2;
    public int i2;
    public int j2;
    public float k2;
    public int l2 = 0;
    public int m2 = 0;
    public RecyclerView n2;
    public boolean o2 = false;
    public boolean p2 = false;
    public final int q;
    public int q2 = 0;
    public int r2 = 0;
    public final int[] s2 = new int[2];
    public final int[] t2 = new int[2];
    public final ValueAnimator u2;
    public int v2;
    public final Runnable w2;
    public final int x;
    public final RecyclerView.s x2;
    public final StateListDrawable y;

    /* compiled from: FastScroller */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            i iVar = i.this;
            int i = iVar.v2;
            if (i == 1) {
                iVar.u2.cancel();
            } else if (i != 2) {
                return;
            }
            iVar.v2 = 3;
            ValueAnimator valueAnimator = iVar.u2;
            valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
            iVar.u2.setDuration((long) 500);
            iVar.u2.start();
        }
    }

    /* compiled from: FastScroller */
    public class b extends RecyclerView.s {
        public b() {
        }

        public void c(RecyclerView recyclerView, int i, int i2) {
            i iVar = i.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = iVar.n2.computeVerticalScrollRange();
            int i3 = iVar.m2;
            iVar.o2 = computeVerticalScrollRange - i3 > 0 && i3 >= iVar.q;
            int computeHorizontalScrollRange = iVar.n2.computeHorizontalScrollRange();
            int i4 = iVar.l2;
            boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= iVar.q;
            iVar.p2 = z;
            boolean z2 = iVar.o2;
            if (z2 || z) {
                if (z2) {
                    float f = (float) i3;
                    iVar.g2 = (int) ((((f / 2.0f) + ((float) computeVerticalScrollOffset)) * f) / ((float) computeVerticalScrollRange));
                    iVar.f2 = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                }
                if (iVar.p2) {
                    float f2 = (float) computeHorizontalScrollOffset;
                    float f3 = (float) i4;
                    iVar.j2 = (int) ((((f3 / 2.0f) + f2) * f3) / ((float) computeHorizontalScrollRange));
                    iVar.i2 = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
                }
                int i5 = iVar.q2;
                if (i5 == 0 || i5 == 1) {
                    iVar.m(1);
                }
            } else if (iVar.q2 != 0) {
                iVar.m(0);
            }
        }
    }

    /* compiled from: FastScroller */
    public class c extends AnimatorListenerAdapter {
        public boolean a = false;

        public c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
            } else if (((Float) i.this.u2.getAnimatedValue()).floatValue() == 0.0f) {
                i iVar = i.this;
                iVar.v2 = 0;
                iVar.m(0);
            } else {
                i iVar2 = i.this;
                iVar2.v2 = 2;
                iVar2.n2.invalidate();
            }
        }
    }

    /* compiled from: FastScroller */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            i.this.y.setAlpha(floatValue);
            i.this.Y1.setAlpha(floatValue);
            i.this.n2.invalidate();
        }
    }

    public i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i3, int i4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.u2 = ofFloat;
        this.v2 = 0;
        this.w2 = new a();
        b bVar = new b();
        this.x2 = bVar;
        this.y = stateListDrawable;
        this.Y1 = drawable;
        this.b2 = stateListDrawable2;
        this.c2 = drawable2;
        this.Z1 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.a2 = Math.max(i, drawable.getIntrinsicWidth());
        this.d2 = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.e2 = Math.max(i, drawable2.getIntrinsicWidth());
        this.q = i3;
        this.x = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.n2;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.n2.removeOnItemTouchListener(this);
                this.n2.removeOnScrollListener(bVar);
                i();
            }
            this.n2 = recyclerView;
            recyclerView.addItemDecoration(this);
            this.n2.addOnItemTouchListener(this);
            this.n2.addOnScrollListener(bVar);
        }
    }

    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.q2 != 0) {
            if (motionEvent.getAction() == 0) {
                boolean k = k(motionEvent.getX(), motionEvent.getY());
                boolean j = j(motionEvent.getX(), motionEvent.getY());
                if (k || j) {
                    if (j) {
                        this.r2 = 1;
                        this.k2 = (float) ((int) motionEvent.getX());
                    } else if (k) {
                        this.r2 = 2;
                        this.h2 = (float) ((int) motionEvent.getY());
                    }
                    m(2);
                }
            } else if (motionEvent.getAction() == 1 && this.q2 == 2) {
                this.h2 = 0.0f;
                this.k2 = 0.0f;
                m(1);
                this.r2 = 0;
            } else if (motionEvent.getAction() == 2 && this.q2 == 2) {
                n();
                if (this.r2 == 1) {
                    float x3 = motionEvent.getX();
                    int[] iArr = this.t2;
                    int i = this.x;
                    iArr[0] = i;
                    iArr[1] = this.l2 - i;
                    float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x3));
                    if (Math.abs(((float) this.j2) - max) >= 2.0f) {
                        int l = l(this.k2, max, iArr, this.n2.computeHorizontalScrollRange(), this.n2.computeHorizontalScrollOffset(), this.l2);
                        if (l != 0) {
                            this.n2.scrollBy(l, 0);
                        }
                        this.k2 = max;
                    }
                }
                if (this.r2 == 2) {
                    float y2 = motionEvent.getY();
                    int[] iArr2 = this.s2;
                    int i3 = this.x;
                    iArr2[0] = i3;
                    iArr2[1] = this.m2 - i3;
                    float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y2));
                    if (Math.abs(((float) this.g2) - max2) >= 2.0f) {
                        int l3 = l(this.h2, max2, iArr2, this.n2.computeVerticalScrollRange(), this.n2.computeVerticalScrollOffset(), this.m2);
                        if (l3 != 0) {
                            this.n2.scrollBy(0, l3);
                        }
                        this.h2 = max2;
                    }
                }
            }
        }
    }

    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.q2;
        if (i == 1) {
            boolean k = k(motionEvent.getX(), motionEvent.getY());
            boolean j = j(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (k || j)) {
                if (j) {
                    this.r2 = 1;
                    this.k2 = (float) ((int) motionEvent.getX());
                } else if (k) {
                    this.r2 = 2;
                    this.h2 = (float) ((int) motionEvent.getY());
                }
                m(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    public void e(boolean z) {
    }

    public void h(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        if (this.l2 != this.n2.getWidth() || this.m2 != this.n2.getHeight()) {
            this.l2 = this.n2.getWidth();
            this.m2 = this.n2.getHeight();
            m(0);
        } else if (this.v2 != 0) {
            if (this.o2) {
                int i = this.l2;
                int i3 = this.Z1;
                int i4 = i - i3;
                int i5 = this.g2;
                int i6 = this.f2;
                int i7 = i5 - (i6 / 2);
                this.y.setBounds(0, 0, i3, i6);
                this.Y1.setBounds(0, 0, this.a2, this.m2);
                RecyclerView recyclerView2 = this.n2;
                AtomicInteger atomicInteger = q.a;
                boolean z = true;
                if (recyclerView2.getLayoutDirection() != 1) {
                    z = false;
                }
                if (z) {
                    this.Y1.draw(canvas);
                    canvas.translate((float) this.Z1, (float) i7);
                    canvas.scale(-1.0f, 1.0f);
                    this.y.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-this.Z1), (float) (-i7));
                } else {
                    canvas.translate((float) i4, 0.0f);
                    this.Y1.draw(canvas);
                    canvas.translate(0.0f, (float) i7);
                    this.y.draw(canvas);
                    canvas.translate((float) (-i4), (float) (-i7));
                }
            }
            if (this.p2) {
                int i8 = this.m2;
                int i9 = this.d2;
                int i10 = i8 - i9;
                int i11 = this.j2;
                int i12 = this.i2;
                int i13 = i11 - (i12 / 2);
                this.b2.setBounds(0, 0, i12, i9);
                this.c2.setBounds(0, 0, this.l2, this.e2);
                canvas.translate(0.0f, (float) i10);
                this.c2.draw(canvas);
                canvas.translate((float) i13, 0.0f);
                this.b2.draw(canvas);
                canvas.translate((float) (-i13), (float) (-i10));
            }
        }
    }

    public final void i() {
        this.n2.removeCallbacks(this.w2);
    }

    public boolean j(float f, float f3) {
        if (f3 >= ((float) (this.m2 - this.d2))) {
            int i = this.j2;
            int i3 = this.i2;
            return f >= ((float) (i - (i3 / 2))) && f <= ((float) ((i3 / 2) + i));
        }
    }

    public boolean k(float f, float f3) {
        RecyclerView recyclerView = this.n2;
        AtomicInteger atomicInteger = q.a;
        if (recyclerView.getLayoutDirection() == 1) {
            if (f > ((float) this.Z1)) {
                return false;
            }
        } else if (f < ((float) (this.l2 - this.Z1))) {
            return false;
        }
        int i = this.g2;
        int i3 = this.f2 / 2;
        if (f3 < ((float) (i - i3)) || f3 > ((float) (i3 + i))) {
            return false;
        }
        return true;
    }

    public final int l(float f, float f3, int[] iArr, int i, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i - i4;
        int i7 = (int) (((f3 - f) / ((float) i5)) * ((float) i6));
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    public void m(int i) {
        if (i == 2 && this.q2 != 2) {
            this.y.setState(c);
            i();
        }
        if (i == 0) {
            this.n2.invalidate();
        } else {
            n();
        }
        if (this.q2 == 2 && i != 2) {
            this.y.setState(d);
            i();
            this.n2.postDelayed(this.w2, (long) 1200);
        } else if (i == 1) {
            i();
            this.n2.postDelayed(this.w2, (long) 1500);
        }
        this.q2 = i;
    }

    public void n() {
        int i = this.v2;
        if (i != 0) {
            if (i == 3) {
                this.u2.cancel();
            } else {
                return;
            }
        }
        this.v2 = 1;
        ValueAnimator valueAnimator = this.u2;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.u2.setDuration(500);
        this.u2.setStartDelay(0);
        this.u2.start();
    }
}
