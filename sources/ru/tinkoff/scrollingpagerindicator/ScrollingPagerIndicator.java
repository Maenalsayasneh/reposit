package ru.tinkoff.scrollingpagerindicator;

import android.animation.ArgbEvaluator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import u0.a.a.c;

public class ScrollingPagerIndicator extends View {
    public int Y1;
    public int Z1;
    public int a2;
    public float b2;
    public int c;
    public float c2;
    public final int d;
    public float d2;
    public SparseArray<Float> e2;
    public int f2;
    public final Paint g2;
    public final ArgbEvaluator h2 = new ArgbEvaluator();
    public int i2;
    public int j2;
    public boolean k2;
    public Runnable l2;
    public b<?> m2;
    public boolean n2;
    public final int q;
    public final int x;
    public final int y;

    public class a implements Runnable {
        public final /* synthetic */ Object c;
        public final /* synthetic */ b d;

        public a(Object obj, b bVar) {
            this.c = obj;
            this.d = bVar;
        }

        public void run() {
            ScrollingPagerIndicator scrollingPagerIndicator = ScrollingPagerIndicator.this;
            scrollingPagerIndicator.f2 = -1;
            scrollingPagerIndicator.b(this.c, this.d);
        }
    }

    public interface b<T> {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ScrollingPagerIndicator(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = ru.tinkoff.scrollingpagerindicator.R.attr.scrollingPagerIndicatorStyle
            r3.<init>(r4, r5, r0)
            android.animation.ArgbEvaluator r1 = new android.animation.ArgbEvaluator
            r1.<init>()
            r3.h2 = r1
            int[] r1 = ru.tinkoff.scrollingpagerindicator.R.styleable.ScrollingPagerIndicator
            int r2 = ru.tinkoff.scrollingpagerindicator.R.style.ScrollingPagerIndicator
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            int r5 = ru.tinkoff.scrollingpagerindicator.R.styleable.ScrollingPagerIndicator_spi_dotColor
            r0 = 0
            int r5 = r4.getColor(r5, r0)
            r3.i2 = r5
            int r1 = ru.tinkoff.scrollingpagerindicator.R.styleable.ScrollingPagerIndicator_spi_dotSelectedColor
            int r5 = r4.getColor(r1, r5)
            r3.j2 = r5
            int r5 = ru.tinkoff.scrollingpagerindicator.R.styleable.ScrollingPagerIndicator_spi_dotSize
            int r5 = r4.getDimensionPixelSize(r5, r0)
            r3.q = r5
            int r1 = ru.tinkoff.scrollingpagerindicator.R.styleable.ScrollingPagerIndicator_spi_dotSelectedSize
            int r1 = r4.getDimensionPixelSize(r1, r0)
            r3.x = r1
            int r1 = ru.tinkoff.scrollingpagerindicator.R.styleable.ScrollingPagerIndicator_spi_dotMinimumSize
            r2 = -1
            int r1 = r4.getDimensionPixelSize(r1, r2)
            if (r1 > r5) goto L_0x003f
            r2 = r1
        L_0x003f:
            r3.d = r2
            int r1 = ru.tinkoff.scrollingpagerindicator.R.styleable.ScrollingPagerIndicator_spi_dotSpacing
            int r1 = r4.getDimensionPixelSize(r1, r0)
            int r1 = r1 + r5
            r3.y = r1
            int r5 = ru.tinkoff.scrollingpagerindicator.R.styleable.ScrollingPagerIndicator_spi_looped
            boolean r5 = r4.getBoolean(r5, r0)
            r3.k2 = r5
            int r5 = ru.tinkoff.scrollingpagerindicator.R.styleable.ScrollingPagerIndicator_spi_visibleDotCount
            int r5 = r4.getInt(r5, r0)
            r3.setVisibleDotCount(r5)
            int r1 = ru.tinkoff.scrollingpagerindicator.R.styleable.ScrollingPagerIndicator_spi_visibleDotThreshold
            r2 = 2
            int r1 = r4.getInt(r1, r2)
            r3.Z1 = r1
            int r1 = ru.tinkoff.scrollingpagerindicator.R.styleable.ScrollingPagerIndicator_spi_orientation
            int r0 = r4.getInt(r1, r0)
            r3.a2 = r0
            r4.recycle()
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.g2 = r4
            r0 = 1
            r4.setAntiAlias(r0)
            boolean r4 = r3.isInEditMode()
            if (r4 == 0) goto L_0x0088
            r3.setDotCount(r5)
            int r5 = r5 / r2
            r4 = 0
            r3.d(r5, r4)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getDotCount() {
        if (!this.k2 || this.f2 <= this.Y1) {
            return this.f2;
        }
        return this.c;
    }

    public final void a(float f, int i) {
        int i3 = this.f2;
        int i4 = this.Y1;
        if (i3 <= i4) {
            this.b2 = 0.0f;
        } else if (this.k2 || i3 <= i4) {
            this.b2 = ((((float) this.y) * f) + c(this.c / 2)) - (this.c2 / 2.0f);
        } else {
            float f3 = this.d2;
            int i5 = this.y;
            this.b2 = ((((float) i5) * f) + (f3 + ((float) (i * i5)))) - (this.c2 / 2.0f);
            int i6 = i4 / 2;
            float c3 = c((getDotCount() - 1) - i6);
            if ((this.c2 / 2.0f) + this.b2 < c(i6)) {
                this.b2 = c(i6) - (this.c2 / 2.0f);
                return;
            }
            float f4 = this.b2;
            float f5 = this.c2;
            if ((f5 / 2.0f) + f4 > c3) {
                this.b2 = c3 - (f5 / 2.0f);
            }
        }
    }

    public <T> void b(T t, b<T> bVar) {
        b<?> bVar2 = this.m2;
        if (bVar2 != null) {
            c cVar = (c) bVar2;
            cVar.d.unregisterAdapterDataObserver(cVar.f);
            cVar.b.removeOnScrollListener(cVar.e);
            cVar.g = 0;
            this.m2 = null;
            this.l2 = null;
        }
        this.n2 = false;
        c cVar2 = (c) bVar;
        Objects.requireNonNull(cVar2);
        RecyclerView recyclerView = (RecyclerView) t;
        if (!(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            throw new IllegalStateException("Only LinearLayoutManager is supported");
        } else if (recyclerView.getAdapter() != null) {
            cVar2.c = (LinearLayoutManager) recyclerView.getLayoutManager();
            cVar2.b = recyclerView;
            RecyclerView.Adapter<?> adapter = recyclerView.getAdapter();
            cVar2.d = adapter;
            cVar2.a = this;
            u0.a.a.a aVar = new u0.a.a.a(cVar2, this);
            cVar2.f = aVar;
            adapter.registerAdapterDataObserver(aVar);
            setDotCount(cVar2.d.getItemCount());
            cVar2.f();
            u0.a.a.b bVar3 = new u0.a.a.b(cVar2, this);
            cVar2.e = bVar3;
            cVar2.b.addOnScrollListener(bVar3);
            this.m2 = bVar;
            this.l2 = new a(t, bVar);
        } else {
            throw new IllegalStateException("RecyclerView has not Adapter attached");
        }
    }

    public final float c(int i) {
        return this.d2 + ((float) (i * this.y));
    }

    public void d(int i, float f) {
        int i3;
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Offset must be [0, 1]");
        } else if (i < 0 || (i != 0 && i >= this.f2)) {
            throw new IndexOutOfBoundsException("page must be [0, adapter.getItemCount())");
        } else {
            if (!this.k2 || ((i3 = this.f2) <= this.Y1 && i3 > 1)) {
                this.e2.clear();
                if (this.a2 == 0) {
                    f(i, f);
                    int i4 = this.f2;
                    if (i < i4 - 1) {
                        f(i + 1, 1.0f - f);
                    } else if (i4 > 1) {
                        f(0, 1.0f - f);
                    }
                } else {
                    f(i - 1, f);
                    f(i, 1.0f - f);
                }
                invalidate();
            }
            if (this.a2 == 0) {
                a(f, i);
            } else {
                a(f, i - 1);
            }
            invalidate();
        }
    }

    public void e() {
        Runnable runnable = this.l2;
        if (runnable != null) {
            runnable.run();
            invalidate();
        }
    }

    public final void f(int i, float f) {
        if (this.e2 != null && getDotCount() != 0) {
            float abs = 1.0f - Math.abs(f);
            if (abs == 0.0f) {
                this.e2.remove(i);
            } else {
                this.e2.put(i, Float.valueOf(abs));
            }
        }
    }

    public int getDotColor() {
        return this.i2;
    }

    public int getOrientation() {
        return this.a2;
    }

    public int getSelectedDotColor() {
        return this.j2;
    }

    public int getVisibleDotCount() {
        return this.Y1;
    }

    public int getVisibleDotThreshold() {
        return this.Z1;
    }

    public void onDraw(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        int dotCount = getDotCount();
        if (dotCount >= this.Z1) {
            int i3 = this.y;
            int i4 = this.x;
            float f = ((float) (((i4 - this.q) / 2) + i3)) * 0.7f;
            float f3 = (float) (i4 / 2);
            float f4 = ((float) i3) * 0.85714287f;
            float f5 = this.b2;
            int i5 = ((int) (f5 - this.d2)) / i3;
            int c3 = (((int) ((f5 + this.c2) - c(i5))) / this.y) + i5;
            if (i5 == 0 && c3 + 1 > dotCount) {
                c3 = dotCount - 1;
            }
            while (i5 <= c3) {
                float c4 = c(i5);
                float f6 = this.b2;
                if (c4 >= f6) {
                    float f7 = this.c2;
                    if (c4 < f6 + f7) {
                        float f8 = 0.0f;
                        if (!this.k2 || this.f2 <= this.Y1) {
                            Float f9 = this.e2.get(i5);
                            if (f9 != null) {
                                f8 = f9.floatValue();
                            }
                        } else {
                            float f10 = (f7 / 2.0f) + f6;
                            if (c4 >= f10 - f4 && c4 <= f10) {
                                f8 = ((c4 - f10) + f4) / f4;
                            } else if (c4 > f10 && c4 < f10 + f4) {
                                f8 = 1.0f - ((c4 - f10) / f4);
                            }
                        }
                        int i6 = this.q;
                        float f11 = (((float) (this.x - i6)) * f8) + ((float) i6);
                        if (this.f2 > this.Y1) {
                            float f12 = (this.k2 || !(i5 == 0 || i5 == dotCount + -1)) ? f : f3;
                            int width = getWidth();
                            if (this.a2 == 1) {
                                width = getHeight();
                            }
                            float f13 = this.b2;
                            if (c4 - f13 < f12) {
                                float f14 = ((c4 - f13) * f11) / f12;
                                i = this.d;
                                if (f14 > ((float) i)) {
                                    if (f14 < f11) {
                                        f11 = f14;
                                    }
                                }
                            } else {
                                float f15 = (float) width;
                                if (c4 - f13 > f15 - f12) {
                                    float f16 = ((((-c4) + f13) + f15) * f11) / f12;
                                    i = this.d;
                                    if (f16 > ((float) i)) {
                                        if (f16 < f11) {
                                            f11 = f16;
                                        }
                                    }
                                }
                            }
                            f11 = (float) i;
                        }
                        this.g2.setColor(((Integer) this.h2.evaluate(f8, Integer.valueOf(this.i2), Integer.valueOf(this.j2))).intValue());
                        if (this.a2 == 0) {
                            canvas2.drawCircle(c4 - this.b2, (float) (getMeasuredHeight() / 2), f11 / 2.0f, this.g2);
                        } else {
                            canvas2.drawCircle((float) (getMeasuredWidth() / 2), c4 - this.b2, f11 / 2.0f, this.g2);
                        }
                    }
                }
                i5++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.a2
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x0040
            boolean r5 = r4.isInEditMode()
            if (r5 == 0) goto L_0x0019
            int r5 = r4.Y1
            int r5 = r5 + -1
            int r0 = r4.y
            int r5 = r5 * r0
            int r0 = r4.x
        L_0x0017:
            int r5 = r5 + r0
            goto L_0x002b
        L_0x0019:
            int r5 = r4.f2
            int r0 = r4.Y1
            if (r5 < r0) goto L_0x0023
            float r5 = r4.c2
            int r5 = (int) r5
            goto L_0x002b
        L_0x0023:
            int r5 = r5 + -1
            int r0 = r4.y
            int r5 = r5 * r0
            int r0 = r4.x
            goto L_0x0017
        L_0x002b:
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r3 = r4.x
            if (r0 == r2) goto L_0x003b
            if (r0 == r1) goto L_0x0077
            r6 = r3
            goto L_0x0077
        L_0x003b:
            int r6 = java.lang.Math.min(r3, r6)
            goto L_0x0077
        L_0x0040:
            boolean r6 = r4.isInEditMode()
            if (r6 == 0) goto L_0x0051
            int r6 = r4.Y1
            int r6 = r6 + -1
            int r0 = r4.y
            int r6 = r6 * r0
            int r0 = r4.x
        L_0x004f:
            int r6 = r6 + r0
            goto L_0x0063
        L_0x0051:
            int r6 = r4.f2
            int r0 = r4.Y1
            if (r6 < r0) goto L_0x005b
            float r6 = r4.c2
            int r6 = (int) r6
            goto L_0x0063
        L_0x005b:
            int r6 = r6 + -1
            int r0 = r4.y
            int r6 = r6 * r0
            int r0 = r4.x
            goto L_0x004f
        L_0x0063:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r3 = r4.x
            if (r0 == r2) goto L_0x0073
            if (r0 == r1) goto L_0x0077
            r5 = r3
            goto L_0x0077
        L_0x0073:
            int r5 = java.lang.Math.min(r3, r5)
        L_0x0077:
            r4.setMeasuredDimension(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator.onMeasure(int, int):void");
    }

    public void setCurrentPosition(int i) {
        if (i != 0 && (i < 0 || i >= this.f2)) {
            throw new IndexOutOfBoundsException("Position must be [0, adapter.getItemCount()]");
        } else if (this.f2 != 0) {
            a(0.0f, i);
            if (!this.k2 || this.f2 < this.Y1) {
                this.e2.clear();
                this.e2.put(i, Float.valueOf(1.0f));
                invalidate();
            }
        }
    }

    public void setDotColor(int i) {
        this.i2 = i;
        invalidate();
    }

    public void setDotCount(int i) {
        if (this.f2 != i || !this.n2) {
            this.f2 = i;
            this.n2 = true;
            this.e2 = new SparseArray<>();
            if (i < this.Z1) {
                requestLayout();
                invalidate();
                return;
            }
            this.d2 = (!this.k2 || this.f2 <= this.Y1) ? (float) (this.x / 2) : 0.0f;
            this.c2 = (float) (((this.Y1 - 1) * this.y) + this.x);
            requestLayout();
            invalidate();
        }
    }

    public void setLooped(boolean z) {
        this.k2 = z;
        e();
        invalidate();
    }

    public void setOrientation(int i) {
        this.a2 = i;
        if (this.l2 != null) {
            e();
        } else {
            requestLayout();
        }
    }

    public void setSelectedDotColor(int i) {
        this.j2 = i;
        invalidate();
    }

    public void setVisibleDotCount(int i) {
        if (i % 2 != 0) {
            this.Y1 = i;
            this.c = i + 2;
            if (this.l2 != null) {
                e();
            } else {
                requestLayout();
            }
        } else {
            throw new IllegalArgumentException("visibleDotCount must be odd");
        }
    }

    public void setVisibleDotThreshold(int i) {
        this.Z1 = i;
        if (this.l2 != null) {
            e();
        } else {
            requestLayout();
        }
    }
}
