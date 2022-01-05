package com.instabug.library.annotation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import com.instabug.library.annotation.AnnotationLayout;
import com.instabug.library.util.OrientationUtils;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@SuppressFBWarnings({"LI_LAZY_INIT_UPDATE_STATIC", "ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
public class AnnotationView extends AppCompatImageView {
    public static volatile c c;
    public int Y1;
    public LinkedHashMap<Path, Integer> Z1 = new LinkedHashMap<>();
    public float a2;
    public float b2;
    public boolean c2;
    public final GestureDetector d;
    public volatile Drawable d2;
    public PointF[] e2 = new PointF[5];
    public Bitmap f2;
    public Bitmap g2;
    public int h2;
    public volatile boolean i2;
    public i0.j.e.b.b j2;
    public i0.j.e.b.b k2;
    public i0.j.e.b.b l2;
    public i0.j.e.b.b m2;
    public PointF n2 = new PointF();
    public volatile b o2 = b.NONE;
    public c p2 = c.NONE;
    public Path q;
    public d q2 = new d();
    public com.instabug.library.annotation.g.a r2 = new com.instabug.library.annotation.g.a();
    public volatile f s2;
    public g t2;
    public h u2;
    public boolean v2;
    public com.instabug.library.annotation.f.g w2;
    public List<PointF> x;
    public b x2;
    public Paint y;
    public volatile boolean y2 = false;
    public int z2;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0027 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0057 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0061 */
        static {
            /*
                com.instabug.library.annotation.AnnotationView.b.values()
                r0 = 7
                int[] r0 = new int[r0]
                b = r0
                r1 = 1
                com.instabug.library.annotation.AnnotationView$b r2 = com.instabug.library.annotation.AnnotationView.b.DRAG     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                r0 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001c }
                com.instabug.library.annotation.AnnotationView$b r3 = com.instabug.library.annotation.AnnotationView.b.RESIZE_BY_BOTTOM_RIGHT_BUTTON     // Catch:{ NoSuchFieldError -> 0x001c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0027 }
                com.instabug.library.annotation.AnnotationView$b r4 = com.instabug.library.annotation.AnnotationView.b.RESIZE_BY_BOTTOM_LEFT_BUTTON     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0032 }
                com.instabug.library.annotation.AnnotationView$b r4 = com.instabug.library.annotation.AnnotationView.b.RESIZE_BY_TOP_LEFT_BUTTON     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x003d }
                com.instabug.library.annotation.AnnotationView$b r4 = com.instabug.library.annotation.AnnotationView.b.RESIZE_BY_TOP_RIGHT_BUTTON     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                r3 = 6
                int[] r4 = b     // Catch:{ NoSuchFieldError -> 0x0048 }
                com.instabug.library.annotation.AnnotationView$b r5 = com.instabug.library.annotation.AnnotationView.b.DRAW     // Catch:{ NoSuchFieldError -> 0x0048 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0048 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0048 }
            L_0x0048:
                com.instabug.library.annotation.AnnotationView.c.values()
                int[] r3 = new int[r3]
                a = r3
                com.instabug.library.annotation.AnnotationView$c r4 = com.instabug.library.annotation.AnnotationView.c.DRAW_RECT     // Catch:{ NoSuchFieldError -> 0x0057 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0057 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0057 }
            L_0x0057:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0061 }
                com.instabug.library.annotation.AnnotationView$c r3 = com.instabug.library.annotation.AnnotationView.c.DRAW_CIRCLE     // Catch:{ NoSuchFieldError -> 0x0061 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0061 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0061 }
            L_0x0061:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x006b }
                com.instabug.library.annotation.AnnotationView$c r1 = com.instabug.library.annotation.AnnotationView.c.DRAW_BLUR     // Catch:{ NoSuchFieldError -> 0x006b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006b }
            L_0x006b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.annotation.AnnotationView.a.<clinit>():void");
        }
    }

    public enum b {
        NONE,
        DRAG,
        RESIZE_BY_TOP_LEFT_BUTTON,
        RESIZE_BY_TOP_RIGHT_BUTTON,
        RESIZE_BY_BOTTOM_RIGHT_BUTTON,
        RESIZE_BY_BOTTOM_LEFT_BUTTON,
        DRAW
    }

    public enum c implements Serializable {
        NONE,
        DRAW_PATH,
        DRAW_RECT,
        DRAW_CIRCLE,
        DRAW_BLUR,
        DRAW_ZOOM
    }

    public class d extends GestureDetector.SimpleOnGestureListener {
        public d(a aVar) {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            d dVar;
            if (!(AnnotationView.c == null || (dVar = AnnotationView.this.q2) == null)) {
                dVar.x.push(AnnotationView.c);
                c cVar = AnnotationView.c;
                Objects.requireNonNull(cVar);
                b bVar = new b(cVar.q);
                bVar.c2 = false;
                cVar.b(bVar);
                if (AnnotationView.c.c instanceof com.instabug.library.annotation.f.h) {
                    AnnotationView annotationView = AnnotationView.this;
                    annotationView.z2--;
                    annotationView.j();
                }
                AnnotationView.c = null;
                AnnotationView.this.l();
                AnnotationView.this.invalidate();
            }
            return true;
        }
    }

    public enum e {
        HIGH,
        LOW
    }

    public interface f {
    }

    public interface g {
    }

    public interface h {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnnotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i = 0;
        this.d = new GestureDetector(context, new d((a) null));
        new Paint(1).setColor(-65281);
        this.j2 = new i0.j.e.b.b();
        this.k2 = new i0.j.e.b.b();
        this.l2 = new i0.j.e.b.b();
        this.m2 = new i0.j.e.b.b();
        Paint paint = new Paint();
        this.y = paint;
        paint.setAntiAlias(true);
        this.y.setDither(true);
        this.Y1 = -65536;
        this.y.setColor(-65536);
        this.y.setStyle(Paint.Style.STROKE);
        this.y.setStrokeJoin(Paint.Join.ROUND);
        this.y.setStrokeCap(Paint.Cap.ROUND);
        this.y.setStrokeWidth(getContext().getResources().getDisplayMetrics().density * 4.0f);
        while (true) {
            PointF[] pointFArr = this.e2;
            if (i < pointFArr.length) {
                pointFArr[i] = new PointF();
                i++;
            } else {
                return;
            }
        }
    }

    private Bitmap getOriginalBitmap() {
        if (this.f2 == null) {
            this.f2 = h();
        }
        return this.f2;
    }

    private Bitmap getScaledBitmap() {
        Bitmap bitmap;
        if (getWidth() <= 0 || getHeight() <= 0) {
            return null;
        }
        if (this.g2 == null && (bitmap = this.f2) != null) {
            this.g2 = Bitmap.createScaledBitmap(bitmap, getWidth(), getHeight(), true);
        }
        return this.g2;
    }

    private d getScaledDrawables() {
        com.instabug.library.annotation.g.a aVar = this.r2;
        aVar.c = aVar.q;
        aVar.q = (float) getHeight();
        com.instabug.library.annotation.g.a aVar2 = this.r2;
        aVar2.d = aVar2.x;
        aVar2.x = (float) getWidth();
        d dVar = this.q2;
        if (dVar == null) {
            dVar = new d();
        }
        for (c next : dVar.c) {
            b bVar = new b();
            bVar.set(this.r2.b() * next.q.left, this.r2.a() * next.q.top, this.r2.b() * next.q.right, this.r2.a() * next.q.bottom);
            if (next.c instanceof com.instabug.library.annotation.f.a) {
                com.instabug.library.annotation.f.a aVar3 = (com.instabug.library.annotation.f.a) next.c;
                Objects.requireNonNull(aVar3);
                float max = Math.max(bVar.width(), bVar.height()) / 2.0f;
                float centerX = bVar.centerX() + max;
                PointF pointF = new PointF(bVar.centerX() - max, bVar.centerY());
                PointF pointF2 = new PointF(centerX, bVar.centerY());
                i0.j.c.l.a.i(bVar.centerX(), bVar.centerY(), aVar3.Z1, pointF);
                aVar3.y = pointF;
                i0.j.c.l.a.i(bVar.centerX(), bVar.centerY(), aVar3.Z1, pointF2);
                aVar3.Y1 = pointF2;
            }
            bVar.c2 = next.q.c2;
            b bVar2 = new b(bVar);
            next.q = bVar2;
            next.x.c(bVar2);
        }
        this.q2 = dVar;
        return dVar;
    }

    private c getSelectedMarkUpDrawable() {
        c cVar;
        boolean z;
        d dVar = this.q2;
        if (dVar == null) {
            return null;
        }
        int b3 = dVar.b();
        do {
            b3--;
            if (b3 < 0) {
                return null;
            }
            cVar = this.q2.c.get(b3);
            PointF pointF = this.n2;
            if (cVar.x.c2) {
                z = cVar.c.g(pointF, cVar.q);
                continue;
            } else {
                z = false;
                continue;
            }
        } while (!z);
        return cVar;
    }

    public void c() {
        g gVar;
        if (this.z2 < 5) {
            com.instabug.library.annotation.f.h hVar = new com.instabug.library.annotation.f.h(getScaledBitmap());
            int min = Math.min(getWidth(), getHeight()) / 2;
            int width = (getWidth() - min) / 2;
            int height = (getHeight() - min) / 2;
            b bVar = new b((float) width, (float) (height - 30), (float) (width + min), (float) (min + height + 30));
            e eVar = e.HIGH;
            c cVar = new c(hVar);
            cVar.q = bVar;
            cVar.x.c(bVar);
            getOriginalBitmap();
            c = cVar;
            d dVar = this.q2;
            if (dVar != null) {
                if (eVar == e.LOW) {
                    dVar.a(cVar);
                } else {
                    dVar.c(cVar);
                }
                invalidate();
            }
            this.z2++;
        }
        if (this.z2 == 5 && (gVar = this.t2) != null) {
            ((AnnotationLayout.d) gVar).a(false);
        }
    }

    public final synchronized void d(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        switch (a.b[this.o2.ordinal()]) {
            case 1:
                if (c != null) {
                    c cVar = c;
                    PointF pointF = this.n2;
                    cVar.c.e(cVar.q, cVar.x, (int) (x3 - pointF.x), (int) (y3 - pointF.y));
                    break;
                }
                break;
            case 2:
                if (c != null) {
                    b bVar = new b();
                    if (x3 < c.x.left) {
                        bVar.left = c.x.right + ((float) ((int) (x3 - this.n2.x)));
                        bVar.right = c.x.left;
                    } else {
                        bVar.left = c.x.left;
                        bVar.right = c.x.right + ((float) ((int) (x3 - this.n2.x)));
                    }
                    if (y3 < c.x.top) {
                        bVar.top = c.x.bottom + ((float) ((int) (y3 - this.n2.y)));
                        bVar.bottom = c.x.top;
                    } else {
                        bVar.top = c.x.top;
                        bVar.bottom = c.x.bottom + ((float) ((int) (y3 - this.n2.y)));
                    }
                    c cVar2 = c;
                    cVar2.c.f(bVar, cVar2.q, false);
                    if (c.c instanceof com.instabug.library.annotation.f.f) {
                        com.instabug.library.annotation.f.f fVar = (com.instabug.library.annotation.f.f) c.c;
                        b bVar2 = c.q;
                        if (fVar.p()) {
                            fVar.m(x3, y3, bVar2, true);
                            fVar.n(bVar2);
                            break;
                        }
                    }
                }
                break;
            case 3:
                if (c != null) {
                    b bVar3 = new b();
                    if (x3 > c.x.right) {
                        bVar3.left = c.x.right;
                        bVar3.right = c.x.left + ((float) ((int) (x3 - this.n2.x)));
                    } else {
                        bVar3.left = c.x.left + ((float) ((int) (x3 - this.n2.x)));
                        bVar3.right = c.x.right;
                    }
                    if (y3 < c.x.top) {
                        bVar3.top = c.x.bottom + ((float) ((int) (y3 - this.n2.y)));
                        bVar3.bottom = c.x.top;
                    } else {
                        bVar3.top = c.x.top;
                        bVar3.bottom = c.x.bottom + ((float) ((int) (y3 - this.n2.y)));
                    }
                    c cVar3 = c;
                    cVar3.c.f(bVar3, cVar3.q, false);
                    if (c.c instanceof com.instabug.library.annotation.f.f) {
                        com.instabug.library.annotation.f.f fVar2 = (com.instabug.library.annotation.f.f) c.c;
                        b bVar4 = c.q;
                        if (fVar2.p()) {
                            fVar2.q(x3, y3, bVar4, true);
                            fVar2.n(bVar4);
                            break;
                        }
                    }
                }
                break;
            case 4:
                if (c != null) {
                    if (!(c.c instanceof com.instabug.library.annotation.f.a)) {
                        b bVar5 = new b();
                        if (x3 > c.x.right) {
                            bVar5.left = c.x.right;
                            bVar5.right = c.x.left + ((float) ((int) (x3 - this.n2.x)));
                        } else {
                            bVar5.left = c.x.left + ((float) ((int) (x3 - this.n2.x)));
                            bVar5.right = c.x.right;
                        }
                        if (y3 > c.x.bottom) {
                            bVar5.top = c.x.bottom;
                            bVar5.bottom = c.x.top + ((float) ((int) (y3 - this.n2.y)));
                        } else {
                            bVar5.top = c.x.top + ((float) ((int) (y3 - this.n2.y)));
                            bVar5.bottom = c.x.bottom;
                        }
                        c cVar4 = c;
                        cVar4.c.f(bVar5, cVar4.q, false);
                        if (c.c instanceof com.instabug.library.annotation.f.f) {
                            com.instabug.library.annotation.f.f fVar3 = (com.instabug.library.annotation.f.f) c.c;
                            b bVar6 = c.q;
                            if (fVar3.p()) {
                                fVar3.h(x3, y3, bVar6, true);
                                fVar3.n(bVar6);
                                break;
                            }
                        }
                    } else {
                        com.instabug.library.annotation.f.a aVar = (com.instabug.library.annotation.f.a) c.c;
                        b bVar7 = c.q;
                        aVar.y.set(x3, y3);
                        aVar.h(bVar7);
                        break;
                    }
                }
                break;
            case 5:
                if (c != null) {
                    if (!(c.c instanceof com.instabug.library.annotation.f.a)) {
                        b bVar8 = new b();
                        if (x3 < c.x.left) {
                            bVar8.left = c.x.right + ((float) ((int) (x3 - this.n2.x)));
                            bVar8.right = c.x.left;
                        } else {
                            bVar8.left = c.x.left;
                            bVar8.right = c.x.right + ((float) ((int) (x3 - this.n2.x)));
                        }
                        if (y3 > c.x.bottom) {
                            bVar8.top = c.x.bottom;
                            bVar8.bottom = c.x.top + ((float) ((int) (y3 - this.n2.y)));
                        } else {
                            bVar8.top = c.x.top + ((float) ((int) (y3 - this.n2.y)));
                            bVar8.bottom = c.x.bottom;
                        }
                        c cVar5 = c;
                        cVar5.c.f(bVar8, cVar5.q, false);
                        if (c.c instanceof com.instabug.library.annotation.f.f) {
                            com.instabug.library.annotation.f.f fVar4 = (com.instabug.library.annotation.f.f) c.c;
                            b bVar9 = c.q;
                            if (fVar4.p()) {
                                fVar4.k(x3, y3, bVar9, true);
                                fVar4.n(bVar9);
                                break;
                            }
                        }
                    } else {
                        com.instabug.library.annotation.f.a aVar2 = (com.instabug.library.annotation.f.a) c.c;
                        b bVar10 = c.q;
                        aVar2.Y1.set(x3, y3);
                        aVar2.h(bVar10);
                        break;
                    }
                }
                break;
            case 6:
                if (c != null) {
                    b bVar11 = new b();
                    PointF pointF2 = this.n2;
                    float f3 = pointF2.x;
                    if (x3 < f3) {
                        bVar11.left = (float) ((int) x3);
                        bVar11.right = (float) ((int) f3);
                    } else {
                        bVar11.left = (float) ((int) f3);
                        bVar11.right = (float) ((int) x3);
                    }
                    float f4 = pointF2.y;
                    if (y3 < f4) {
                        bVar11.top = (float) ((int) y3);
                        bVar11.bottom = (float) ((int) f4);
                    } else {
                        bVar11.top = (float) ((int) f4);
                        bVar11.bottom = (float) ((int) y3);
                    }
                    c cVar6 = c;
                    cVar6.q = bVar11;
                    cVar6.x.c(bVar11);
                    break;
                }
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01e1, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void e(com.instabug.library.annotation.b r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            android.graphics.Path r0 = r11.q     // Catch:{ all -> 0x01e2 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r11)
            return
        L_0x0007:
            i0.j.e.b.c.b r1 = new i0.j.e.b.c.b     // Catch:{ all -> 0x01e2 }
            r1.<init>()     // Catch:{ all -> 0x01e2 }
            i0.j.e.b.c.b$a r0 = r1.a(r0)     // Catch:{ all -> 0x01e2 }
            r1 = 0
            com.instabug.library.annotation.e.e r2 = r0.a     // Catch:{ all -> 0x01e2 }
            com.instabug.library.annotation.e.e r3 = com.instabug.library.annotation.e.e.ARROW     // Catch:{ all -> 0x01e2 }
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 == r3) goto L_0x013e
            com.instabug.library.annotation.e.e r6 = com.instabug.library.annotation.e.e.LINE     // Catch:{ all -> 0x01e2 }
            if (r2 != r6) goto L_0x0020
            goto L_0x013e
        L_0x0020:
            com.instabug.library.annotation.e.e r3 = com.instabug.library.annotation.e.e.RECT     // Catch:{ all -> 0x01e2 }
            r6 = 110(0x6e, float:1.54E-43)
            r7 = 70
            r8 = 20
            r9 = 90
            if (r2 != r3) goto L_0x00dc
            float r1 = r12.width()     // Catch:{ all -> 0x01e2 }
            float r2 = r12.height()     // Catch:{ all -> 0x01e2 }
            float r1 = java.lang.Math.max(r1, r2)     // Catch:{ all -> 0x01e2 }
            float r2 = r12.centerX()     // Catch:{ all -> 0x01e2 }
            float r1 = r1 / r5
            float r2 = r2 - r1
            float r3 = r12.centerX()     // Catch:{ all -> 0x01e2 }
            float r3 = r3 + r1
            float r5 = r12.centerY()     // Catch:{ all -> 0x01e2 }
            float r5 = r5 - r1
            float r10 = r12.centerY()     // Catch:{ all -> 0x01e2 }
            float r10 = r10 + r1
            r12.set(r2, r5, r3, r10)     // Catch:{ all -> 0x01e2 }
            float r1 = r0.c     // Catch:{ all -> 0x01e2 }
            float r2 = r12.width()     // Catch:{ all -> 0x01e2 }
            float r1 = r1 * r2
            int r0 = r0.b     // Catch:{ all -> 0x01e2 }
            r2 = 160(0xa0, float:2.24E-43)
            r3 = 180(0xb4, float:2.52E-43)
            if (r0 > r8) goto L_0x0061
            r5 = r4
            goto L_0x006c
        L_0x0061:
            if (r0 < r7) goto L_0x0067
            if (r0 > r6) goto L_0x0067
            r5 = r9
            goto L_0x006c
        L_0x0067:
            if (r0 < r2) goto L_0x006b
            r5 = r3
            goto L_0x006c
        L_0x006b:
            r5 = r0
        L_0x006c:
            if (r5 == 0) goto L_0x009a
            if (r5 != r3) goto L_0x0071
            goto L_0x009a
        L_0x0071:
            if (r5 != r9) goto L_0x007e
            float r3 = r12.top     // Catch:{ all -> 0x01e2 }
            float r3 = r3 + r1
            r12.top = r3     // Catch:{ all -> 0x01e2 }
            float r3 = r12.bottom     // Catch:{ all -> 0x01e2 }
            float r3 = r3 - r1
            r12.bottom = r3     // Catch:{ all -> 0x01e2 }
            goto L_0x00a4
        L_0x007e:
            if (r5 <= r9) goto L_0x008f
            if (r5 >= r3) goto L_0x008f
            int r5 = r5 + -90
            float r3 = r12.top     // Catch:{ all -> 0x01e2 }
            float r3 = r3 + r1
            r12.top = r3     // Catch:{ all -> 0x01e2 }
            float r3 = r12.bottom     // Catch:{ all -> 0x01e2 }
            float r3 = r3 - r1
            r12.bottom = r3     // Catch:{ all -> 0x01e2 }
            goto L_0x00a4
        L_0x008f:
            float r3 = r12.left     // Catch:{ all -> 0x01e2 }
            float r3 = r3 + r1
            r12.left = r3     // Catch:{ all -> 0x01e2 }
            float r3 = r12.right     // Catch:{ all -> 0x01e2 }
            float r3 = r3 - r1
            r12.right = r3     // Catch:{ all -> 0x01e2 }
            goto L_0x00a4
        L_0x009a:
            float r3 = r12.left     // Catch:{ all -> 0x01e2 }
            float r3 = r3 + r1
            r12.left = r3     // Catch:{ all -> 0x01e2 }
            float r3 = r12.right     // Catch:{ all -> 0x01e2 }
            float r3 = r3 - r1
            r12.right = r3     // Catch:{ all -> 0x01e2 }
        L_0x00a4:
            if (r0 < r8) goto L_0x00a8
            if (r0 <= r7) goto L_0x00ac
        L_0x00a8:
            if (r0 < r6) goto L_0x00cd
            if (r0 > r2) goto L_0x00cd
        L_0x00ac:
            float r0 = r12.width()     // Catch:{ all -> 0x01e2 }
            r1 = 1036831949(0x3dcccccd, float:0.1)
            float r0 = r0 * r1
            float r2 = r12.height()     // Catch:{ all -> 0x01e2 }
            float r2 = r2 * r1
            float r1 = r12.left     // Catch:{ all -> 0x01e2 }
            float r1 = r1 + r0
            r12.left = r1     // Catch:{ all -> 0x01e2 }
            float r1 = r12.right     // Catch:{ all -> 0x01e2 }
            float r1 = r1 - r0
            r12.right = r1     // Catch:{ all -> 0x01e2 }
            float r0 = r12.top     // Catch:{ all -> 0x01e2 }
            float r0 = r0 + r2
            r12.top = r0     // Catch:{ all -> 0x01e2 }
            float r0 = r12.bottom     // Catch:{ all -> 0x01e2 }
            float r0 = r0 - r2
            r12.bottom = r0     // Catch:{ all -> 0x01e2 }
        L_0x00cd:
            com.instabug.library.annotation.f.f r1 = new com.instabug.library.annotation.f.f     // Catch:{ all -> 0x01e2 }
            int r0 = r11.Y1     // Catch:{ all -> 0x01e2 }
            android.graphics.Paint r2 = r11.y     // Catch:{ all -> 0x01e2 }
            float r2 = r2.getStrokeWidth()     // Catch:{ all -> 0x01e2 }
            r1.<init>(r0, r2, r5)     // Catch:{ all -> 0x01e2 }
            goto L_0x01c1
        L_0x00dc:
            com.instabug.library.annotation.e.e r3 = com.instabug.library.annotation.e.e.OVAL     // Catch:{ all -> 0x01e2 }
            if (r2 != r3) goto L_0x01c1
            float r1 = r12.width()     // Catch:{ all -> 0x01e2 }
            float r2 = r12.height()     // Catch:{ all -> 0x01e2 }
            float r1 = java.lang.Math.max(r1, r2)     // Catch:{ all -> 0x01e2 }
            float r2 = r12.centerX()     // Catch:{ all -> 0x01e2 }
            float r1 = r1 / r5
            float r2 = r2 - r1
            float r3 = r12.centerX()     // Catch:{ all -> 0x01e2 }
            float r3 = r3 + r1
            float r5 = r12.centerY()     // Catch:{ all -> 0x01e2 }
            float r5 = r5 - r1
            float r10 = r12.centerY()     // Catch:{ all -> 0x01e2 }
            float r10 = r10 + r1
            r12.set(r2, r5, r3, r10)     // Catch:{ all -> 0x01e2 }
            float r1 = r0.c     // Catch:{ all -> 0x01e2 }
            float r2 = r12.width()     // Catch:{ all -> 0x01e2 }
            float r1 = r1 * r2
            int r0 = r0.b     // Catch:{ all -> 0x01e2 }
            if (r0 > r8) goto L_0x0111
            r0 = r4
            goto L_0x0116
        L_0x0111:
            if (r0 < r7) goto L_0x0116
            if (r0 > r6) goto L_0x0116
            r0 = r9
        L_0x0116:
            if (r0 < r9) goto L_0x0125
            int r0 = r0 + -90
            float r2 = r12.top     // Catch:{ all -> 0x01e2 }
            float r2 = r2 + r1
            r12.top = r2     // Catch:{ all -> 0x01e2 }
            float r2 = r12.bottom     // Catch:{ all -> 0x01e2 }
            float r2 = r2 - r1
            r12.bottom = r2     // Catch:{ all -> 0x01e2 }
            goto L_0x012f
        L_0x0125:
            float r2 = r12.left     // Catch:{ all -> 0x01e2 }
            float r2 = r2 + r1
            r12.left = r2     // Catch:{ all -> 0x01e2 }
            float r2 = r12.right     // Catch:{ all -> 0x01e2 }
            float r2 = r2 - r1
            r12.right = r2     // Catch:{ all -> 0x01e2 }
        L_0x012f:
            com.instabug.library.annotation.f.d r1 = new com.instabug.library.annotation.f.d     // Catch:{ all -> 0x01e2 }
            int r2 = r11.Y1     // Catch:{ all -> 0x01e2 }
            android.graphics.Paint r3 = r11.y     // Catch:{ all -> 0x01e2 }
            float r3 = r3.getStrokeWidth()     // Catch:{ all -> 0x01e2 }
            r1.<init>(r2, r3, r0)     // Catch:{ all -> 0x01e2 }
            goto L_0x01c1
        L_0x013e:
            float r1 = r12.width()     // Catch:{ all -> 0x01e2 }
            float r2 = r12.height()     // Catch:{ all -> 0x01e2 }
            float r1 = java.lang.Math.max(r1, r2)     // Catch:{ all -> 0x01e2 }
            float r2 = r12.centerX()     // Catch:{ all -> 0x01e2 }
            float r1 = r1 / r5
            float r2 = r2 - r1
            float r5 = r12.centerX()     // Catch:{ all -> 0x01e2 }
            float r5 = r5 + r1
            android.graphics.PointF r1 = new android.graphics.PointF     // Catch:{ all -> 0x01e2 }
            float r6 = r12.centerY()     // Catch:{ all -> 0x01e2 }
            r1.<init>(r2, r6)     // Catch:{ all -> 0x01e2 }
            android.graphics.PointF r2 = new android.graphics.PointF     // Catch:{ all -> 0x01e2 }
            float r6 = r12.centerY()     // Catch:{ all -> 0x01e2 }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x01e2 }
            float r5 = r12.centerX()     // Catch:{ all -> 0x01e2 }
            float r6 = r12.centerY()     // Catch:{ all -> 0x01e2 }
            int r7 = r0.b     // Catch:{ all -> 0x01e2 }
            float r7 = (float) r7     // Catch:{ all -> 0x01e2 }
            i0.j.c.l.a.i(r5, r6, r7, r1)     // Catch:{ all -> 0x01e2 }
            float r5 = r12.centerX()     // Catch:{ all -> 0x01e2 }
            float r6 = r12.centerY()     // Catch:{ all -> 0x01e2 }
            int r7 = r0.b     // Catch:{ all -> 0x01e2 }
            float r7 = (float) r7     // Catch:{ all -> 0x01e2 }
            i0.j.c.l.a.i(r5, r6, r7, r2)     // Catch:{ all -> 0x01e2 }
            com.instabug.library.annotation.f.a r5 = new com.instabug.library.annotation.f.a     // Catch:{ all -> 0x01e2 }
            int r6 = r11.Y1     // Catch:{ all -> 0x01e2 }
            android.graphics.Paint r7 = r11.y     // Catch:{ all -> 0x01e2 }
            float r7 = r7.getStrokeWidth()     // Catch:{ all -> 0x01e2 }
            r5.<init>(r1, r2, r6, r7)     // Catch:{ all -> 0x01e2 }
            int r6 = r0.b     // Catch:{ all -> 0x01e2 }
            float r6 = (float) r6     // Catch:{ all -> 0x01e2 }
            r5.Z1 = r6     // Catch:{ all -> 0x01e2 }
            com.instabug.library.annotation.e.e r0 = r0.a     // Catch:{ all -> 0x01e2 }
            if (r0 != r3) goto L_0x019d
            java.lang.String r0 = "arrow"
            r5.a2 = r0     // Catch:{ all -> 0x01e2 }
        L_0x019d:
            float r0 = r1.x     // Catch:{ all -> 0x01e2 }
            float r3 = r2.x     // Catch:{ all -> 0x01e2 }
            float r0 = java.lang.Math.min(r0, r3)     // Catch:{ all -> 0x01e2 }
            float r3 = r1.x     // Catch:{ all -> 0x01e2 }
            float r6 = r2.x     // Catch:{ all -> 0x01e2 }
            float r3 = java.lang.Math.max(r3, r6)     // Catch:{ all -> 0x01e2 }
            float r6 = r1.y     // Catch:{ all -> 0x01e2 }
            float r7 = r2.y     // Catch:{ all -> 0x01e2 }
            float r6 = java.lang.Math.min(r6, r7)     // Catch:{ all -> 0x01e2 }
            float r1 = r1.y     // Catch:{ all -> 0x01e2 }
            float r2 = r2.y     // Catch:{ all -> 0x01e2 }
            float r1 = java.lang.Math.max(r1, r2)     // Catch:{ all -> 0x01e2 }
            r12.set(r0, r6, r3, r1)     // Catch:{ all -> 0x01e2 }
            r1 = r5
        L_0x01c1:
            r11.w2 = r1     // Catch:{ all -> 0x01e2 }
            r11.x2 = r12     // Catch:{ all -> 0x01e2 }
            if (r1 == 0) goto L_0x01e0
            android.graphics.Path r0 = r11.q     // Catch:{ all -> 0x01e2 }
            android.graphics.Path r12 = r1.a(r12)     // Catch:{ all -> 0x01e2 }
            com.instabug.library.annotation.AnnotationView$h r1 = r11.u2     // Catch:{ all -> 0x01e2 }
            if (r1 == 0) goto L_0x01e0
            com.instabug.library.annotation.AnnotationLayout$c r1 = (com.instabug.library.annotation.AnnotationLayout.c) r1     // Catch:{ all -> 0x01e2 }
            com.instabug.library.annotation.AnnotationLayout r1 = com.instabug.library.annotation.AnnotationLayout.this     // Catch:{ all -> 0x01e2 }
            r2 = 2
            android.graphics.Path[] r2 = new android.graphics.Path[r2]     // Catch:{ all -> 0x01e2 }
            r2[r4] = r0     // Catch:{ all -> 0x01e2 }
            r0 = 1
            r2[r0] = r12     // Catch:{ all -> 0x01e2 }
            r1.showShapeSuggestions(r2)     // Catch:{ all -> 0x01e2 }
        L_0x01e0:
            monitor-exit(r11)
            return
        L_0x01e2:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.annotation.AnnotationView.e(com.instabug.library.annotation.b):void");
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public final void f(com.instabug.library.annotation.f.g gVar, b bVar) {
        if (c != null && this.q2 != null && c.c != null) {
            c cVar = c;
            Objects.requireNonNull(cVar);
            cVar.b(new b(bVar));
            cVar.c = gVar;
            if (gVar instanceof com.instabug.library.annotation.f.a) {
                cVar.q = bVar;
            }
            c.c.q = true;
            d dVar = this.q2;
            dVar.x.push(c);
        }
    }

    public final void g(c cVar) {
        if (cVar.c instanceof com.instabug.library.annotation.f.h) {
            ((com.instabug.library.annotation.f.h) cVar.c).x = getScaledBitmap();
        } else if (cVar.c instanceof com.instabug.library.annotation.f.b) {
            com.instabug.library.annotation.f.b bVar = (com.instabug.library.annotation.f.b) cVar.c;
            Bitmap scaledBitmap = getScaledBitmap();
            Objects.requireNonNull(bVar);
            if (scaledBitmap != null) {
                bVar.x = i0.j.c.l.a.h(scaledBitmap, 18, bVar.y);
            }
        }
    }

    public c getDrawingMode() {
        return this.p2;
    }

    public Bitmap h() {
        d dVar;
        if (getWidth() <= 0 || getHeight() <= 0 || (dVar = this.q2) == null) {
            return null;
        }
        this.h2 = dVar.b();
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.i2 = true;
        invalidate();
        draw(canvas);
        this.i2 = false;
        invalidate();
        return createBitmap;
    }

    public final void i(float f3, float f4) {
        this.q = new Path();
        this.x = new ArrayList();
        this.Z1.put(this.q, Integer.valueOf(this.Y1));
        this.q.reset();
        this.q.moveTo(f3, f4);
        this.x.add(new PointF(f3, f4));
        this.a2 = f3;
        this.b2 = f4;
        for (PointF pointF : this.e2) {
            pointF.x = f3;
            pointF.y = f4;
        }
    }

    public final void j() {
        g gVar = this.t2;
        if (gVar != null) {
            if (this.z2 == 5) {
                ((AnnotationLayout.d) gVar).a(false);
            }
            if (this.z2 == 4) {
                ((AnnotationLayout.d) this.t2).a(true);
            }
        }
    }

    public final void k() {
        Path path = this.q;
        if (path != null && this.x != null) {
            path.lineTo(this.a2, this.b2);
            if (new PathMeasure(this.q, false).getLength() < 20.0f) {
                this.Z1.remove(this.q);
                return;
            }
            c = new c(new com.instabug.library.annotation.f.e(this.q, this.y.getStrokeWidth(), this.y, this.x));
            b bVar = new b();
            this.q.computeBounds(bVar, true);
            c cVar = c;
            b bVar2 = new b(bVar);
            cVar.q = bVar2;
            cVar.x.c(bVar2);
            d dVar = this.q2;
            if (dVar != null) {
                dVar.c(c);
            }
            this.Z1.remove(this.q);
            invalidate();
            e(bVar);
        }
    }

    public final void l() {
        if (this.o2 != b.DRAW && this.q2 != null && c != null) {
            for (int i = 1; i < this.q2.b(); i++) {
                c cVar = this.q2.c.get(i);
                d dVar = this.q2;
                if (dVar.c.indexOf(c) <= i && (cVar.c instanceof com.instabug.library.annotation.f.h) && cVar.x.c2) {
                    ((com.instabug.library.annotation.f.h) cVar.c).x = getScaledBitmap();
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        OrientationUtils.lockScreenOrientation(getContext());
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g2 = null;
        this.y2 = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q2 = null;
        c = null;
        OrientationUtils.unlockOrientation(getContext());
    }

    public synchronized void onDraw(Canvas canvas) {
        d dVar;
        super.onDraw(canvas);
        if (this.d2 != null) {
            this.d2.draw(canvas);
        }
        if (!this.i2 && (dVar = this.q2) != null) {
            this.h2 = dVar.c.size();
        }
        d dVar2 = this.q2;
        if (dVar2 != null) {
            for (c next : dVar2.c) {
                g(next);
                if (next.x.c2) {
                    canvas.save();
                    next.c.c(canvas, next.q, next.x);
                    canvas.restore();
                }
            }
        }
        if (!this.i2 && c != null) {
            if (this.v2) {
                c.a(canvas);
            }
            c cVar = c;
            cVar.c.d(canvas, cVar.q, new i0.j.e.b.b[]{this.j2, this.m2, this.k2, this.l2});
        }
        if (!this.Z1.isEmpty()) {
            Iterator<Map.Entry<Path, Integer>> it = this.Z1.entrySet().iterator();
            do {
                Map.Entry next2 = it.next();
                this.y.setColor(((Integer) next2.getValue()).intValue());
                canvas.drawPath((Path) next2.getKey(), this.y);
            } while (it.hasNext());
        }
        if (this.y2 && c != null) {
            this.y2 = false;
            if (!c.c.q) {
                e(c.q);
            }
        }
    }

    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + paddingLeft, getPaddingBottom() + getPaddingTop() + paddingTop);
    }

    @SuppressLint({"ERADICATE_FIELD_NOT_NULLABLE"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.r2 = (com.instabug.library.annotation.g.a) bundle.getSerializable("aspectRatioCalculator");
            this.h2 = bundle.getInt("drawingLevel");
            this.z2 = bundle.getInt("magnifiersCount");
            this.p2 = (c) bundle.getSerializable("drawingMode");
            parcelable = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putSerializable("aspectRatioCalculator", this.r2);
        bundle.putSerializable("drawingMode", getDrawingMode());
        bundle.putInt("drawingLevel", this.h2);
        bundle.putInt("magnifiersCount", this.z2);
        return bundle;
    }

    public void onSizeChanged(int i, int i3, int i4, int i5) {
        super.onSizeChanged(i, i3, i4, i5);
        getScaledDrawables();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0218, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            android.view.GestureDetector r0 = r9.d     // Catch:{ all -> 0x0219 }
            boolean r0 = r0.onTouchEvent(r10)     // Catch:{ all -> 0x0219 }
            r1 = 1
            if (r0 == 0) goto L_0x000c
            monitor-exit(r9)
            return r1
        L_0x000c:
            int r0 = r10.getActionMasked()     // Catch:{ all -> 0x0219 }
            float r2 = r10.getX()     // Catch:{ all -> 0x0219 }
            float r3 = r10.getY()     // Catch:{ all -> 0x0219 }
            r4 = 2
            r5 = 0
            if (r0 == 0) goto L_0x007f
            if (r0 == r1) goto L_0x002d
            if (r0 == r4) goto L_0x0022
            goto L_0x018c
        L_0x0022:
            r9.d(r10)     // Catch:{ all -> 0x0219 }
            r9.l()     // Catch:{ all -> 0x0219 }
            r9.invalidate()     // Catch:{ all -> 0x0219 }
            goto L_0x018c
        L_0x002d:
            r9.v2 = r5     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationView$b r0 = r9.o2     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationView$b r6 = com.instabug.library.annotation.AnnotationView.b.DRAG     // Catch:{ all -> 0x0219 }
            if (r0 == r6) goto L_0x004d
            com.instabug.library.annotation.AnnotationView$b r0 = r9.o2     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationView$b r6 = com.instabug.library.annotation.AnnotationView.b.RESIZE_BY_TOP_LEFT_BUTTON     // Catch:{ all -> 0x0219 }
            if (r0 == r6) goto L_0x004d
            com.instabug.library.annotation.AnnotationView$b r0 = r9.o2     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationView$b r6 = com.instabug.library.annotation.AnnotationView.b.RESIZE_BY_TOP_RIGHT_BUTTON     // Catch:{ all -> 0x0219 }
            if (r0 == r6) goto L_0x004d
            com.instabug.library.annotation.AnnotationView$b r0 = r9.o2     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationView$b r6 = com.instabug.library.annotation.AnnotationView.b.RESIZE_BY_BOTTOM_RIGHT_BUTTON     // Catch:{ all -> 0x0219 }
            if (r0 == r6) goto L_0x004d
            com.instabug.library.annotation.AnnotationView$b r0 = r9.o2     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationView$b r6 = com.instabug.library.annotation.AnnotationView.b.RESIZE_BY_BOTTOM_LEFT_BUTTON     // Catch:{ all -> 0x0219 }
            if (r0 != r6) goto L_0x006b
        L_0x004d:
            com.instabug.library.annotation.c r0 = c     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x006b
            com.instabug.library.annotation.d r0 = r9.q2     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x006b
            com.instabug.library.annotation.c r6 = c     // Catch:{ all -> 0x0219 }
            java.util.Stack<com.instabug.library.annotation.c> r0 = r0.x     // Catch:{ all -> 0x0219 }
            r0.push(r6)     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.c r0 = c     // Catch:{ all -> 0x0219 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.b r6 = new com.instabug.library.annotation.b     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.b r7 = r0.q     // Catch:{ all -> 0x0219 }
            r6.<init>(r7)     // Catch:{ all -> 0x0219 }
            r0.b(r6)     // Catch:{ all -> 0x0219 }
        L_0x006b:
            android.graphics.PointF r0 = r9.n2     // Catch:{ all -> 0x0219 }
            r0.set(r2, r3)     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationView$c r0 = r9.p2     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationView$c r6 = com.instabug.library.annotation.AnnotationView.c.DRAW_PATH     // Catch:{ all -> 0x0219 }
            if (r0 == r6) goto L_0x018c
            com.instabug.library.annotation.AnnotationView$b r0 = com.instabug.library.annotation.AnnotationView.b.NONE     // Catch:{ all -> 0x0219 }
            r9.o2 = r0     // Catch:{ all -> 0x0219 }
            r9.invalidate()     // Catch:{ all -> 0x0219 }
            goto L_0x018c
        L_0x007f:
            r9.v2 = r1     // Catch:{ all -> 0x0219 }
            r9.getOriginalBitmap()     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationView$f r0 = r9.s2     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x00ac
            com.instabug.library.annotation.AnnotationView$f r0 = r9.s2     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationLayout$b r0 = (com.instabug.library.annotation.AnnotationLayout.b) r0     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationLayout r6 = com.instabug.library.annotation.AnnotationLayout.this     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.ColorPickerPopUpView r6 = r6.colorPicker     // Catch:{ all -> 0x0219 }
            int r6 = r6.getVisibility()     // Catch:{ all -> 0x0219 }
            if (r6 != 0) goto L_0x00a3
            com.instabug.library.annotation.AnnotationLayout r6 = com.instabug.library.annotation.AnnotationLayout.this     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.ColorPickerPopUpView r6 = r6.colorPicker     // Catch:{ all -> 0x0219 }
            r7 = 8
            r6.setVisibility(r7)     // Catch:{ all -> 0x0219 }
        L_0x00a3:
            com.instabug.library.annotation.AnnotationLayout r0 = com.instabug.library.annotation.AnnotationLayout.this     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.ShapeSuggestionsLayout r0 = r0.shapeSuggestionsLayout     // Catch:{ all -> 0x0219 }
            r0.a()     // Catch:{ all -> 0x0219 }
        L_0x00ac:
            android.graphics.PointF r0 = r9.n2     // Catch:{ all -> 0x0219 }
            r0.set(r2, r3)     // Catch:{ all -> 0x0219 }
            i0.j.e.b.b r0 = r9.k2     // Catch:{ all -> 0x0219 }
            android.graphics.PointF r6 = r9.n2     // Catch:{ all -> 0x0219 }
            boolean r0 = r0.c(r6)     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x00c5
            com.instabug.library.annotation.c r0 = c     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x00c5
            com.instabug.library.annotation.AnnotationView$b r0 = com.instabug.library.annotation.AnnotationView.b.RESIZE_BY_BOTTOM_RIGHT_BUTTON     // Catch:{ all -> 0x0219 }
            r9.o2 = r0     // Catch:{ all -> 0x0219 }
            goto L_0x0186
        L_0x00c5:
            i0.j.e.b.b r0 = r9.l2     // Catch:{ all -> 0x0219 }
            android.graphics.PointF r6 = r9.n2     // Catch:{ all -> 0x0219 }
            boolean r0 = r0.c(r6)     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x00d9
            com.instabug.library.annotation.c r0 = c     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x00d9
            com.instabug.library.annotation.AnnotationView$b r0 = com.instabug.library.annotation.AnnotationView.b.RESIZE_BY_BOTTOM_LEFT_BUTTON     // Catch:{ all -> 0x0219 }
            r9.o2 = r0     // Catch:{ all -> 0x0219 }
            goto L_0x0186
        L_0x00d9:
            i0.j.e.b.b r0 = r9.j2     // Catch:{ all -> 0x0219 }
            android.graphics.PointF r6 = r9.n2     // Catch:{ all -> 0x0219 }
            boolean r0 = r0.c(r6)     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x00ed
            com.instabug.library.annotation.c r0 = c     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x00ed
            com.instabug.library.annotation.AnnotationView$b r0 = com.instabug.library.annotation.AnnotationView.b.RESIZE_BY_TOP_LEFT_BUTTON     // Catch:{ all -> 0x0219 }
            r9.o2 = r0     // Catch:{ all -> 0x0219 }
            goto L_0x0186
        L_0x00ed:
            i0.j.e.b.b r0 = r9.m2     // Catch:{ all -> 0x0219 }
            android.graphics.PointF r6 = r9.n2     // Catch:{ all -> 0x0219 }
            boolean r0 = r0.c(r6)     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x0101
            com.instabug.library.annotation.c r0 = c     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x0101
            com.instabug.library.annotation.AnnotationView$b r0 = com.instabug.library.annotation.AnnotationView.b.RESIZE_BY_TOP_RIGHT_BUTTON     // Catch:{ all -> 0x0219 }
            r9.o2 = r0     // Catch:{ all -> 0x0219 }
            goto L_0x0186
        L_0x0101:
            com.instabug.library.annotation.c r0 = r9.getSelectedMarkUpDrawable()     // Catch:{ all -> 0x0219 }
            c = r0     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.c r0 = c     // Catch:{ all -> 0x0219 }
            if (r0 != 0) goto L_0x0182
            com.instabug.library.annotation.d r0 = r9.q2     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x0182
            int[] r0 = com.instabug.library.annotation.AnnotationView.a.a     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationView$c r6 = r9.p2     // Catch:{ all -> 0x0219 }
            int r6 = r6.ordinal()     // Catch:{ all -> 0x0219 }
            r0 = r0[r6]     // Catch:{ all -> 0x0219 }
            if (r0 == r1) goto L_0x015f
            if (r0 == r4) goto L_0x0140
            r6 = 3
            if (r0 == r6) goto L_0x0121
            goto L_0x017d
        L_0x0121:
            com.instabug.library.annotation.c r0 = new com.instabug.library.annotation.c     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.f.b r6 = new com.instabug.library.annotation.f.b     // Catch:{ all -> 0x0219 }
            android.graphics.Bitmap r7 = r9.getOriginalBitmap()     // Catch:{ all -> 0x0219 }
            android.content.Context r8 = r9.getContext()     // Catch:{ all -> 0x0219 }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x0219 }
            r0.<init>(r6)     // Catch:{ all -> 0x0219 }
            c = r0     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.d r0 = r9.q2     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.c r6 = c     // Catch:{ all -> 0x0219 }
            r0.a(r6)     // Catch:{ all -> 0x0219 }
            r9.invalidate()     // Catch:{ all -> 0x0219 }
            goto L_0x017d
        L_0x0140:
            com.instabug.library.annotation.c r0 = new com.instabug.library.annotation.c     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.f.d r6 = new com.instabug.library.annotation.f.d     // Catch:{ all -> 0x0219 }
            int r7 = r9.Y1     // Catch:{ all -> 0x0219 }
            android.graphics.Paint r8 = r9.y     // Catch:{ all -> 0x0219 }
            float r8 = r8.getStrokeWidth()     // Catch:{ all -> 0x0219 }
            r6.<init>(r7, r8, r5)     // Catch:{ all -> 0x0219 }
            r0.<init>(r6)     // Catch:{ all -> 0x0219 }
            c = r0     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.d r0 = r9.q2     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.c r6 = c     // Catch:{ all -> 0x0219 }
            r0.c(r6)     // Catch:{ all -> 0x0219 }
            r9.invalidate()     // Catch:{ all -> 0x0219 }
            goto L_0x017d
        L_0x015f:
            com.instabug.library.annotation.c r0 = new com.instabug.library.annotation.c     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.f.f r6 = new com.instabug.library.annotation.f.f     // Catch:{ all -> 0x0219 }
            int r7 = r9.Y1     // Catch:{ all -> 0x0219 }
            android.graphics.Paint r8 = r9.y     // Catch:{ all -> 0x0219 }
            float r8 = r8.getStrokeWidth()     // Catch:{ all -> 0x0219 }
            r6.<init>(r7, r8, r5)     // Catch:{ all -> 0x0219 }
            r0.<init>(r6)     // Catch:{ all -> 0x0219 }
            c = r0     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.d r0 = r9.q2     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.c r6 = c     // Catch:{ all -> 0x0219 }
            r0.c(r6)     // Catch:{ all -> 0x0219 }
            r9.invalidate()     // Catch:{ all -> 0x0219 }
        L_0x017d:
            com.instabug.library.annotation.AnnotationView$b r0 = com.instabug.library.annotation.AnnotationView.b.DRAW     // Catch:{ all -> 0x0219 }
            r9.o2 = r0     // Catch:{ all -> 0x0219 }
            goto L_0x0186
        L_0x0182:
            com.instabug.library.annotation.AnnotationView$b r0 = com.instabug.library.annotation.AnnotationView.b.DRAG     // Catch:{ all -> 0x0219 }
            r9.o2 = r0     // Catch:{ all -> 0x0219 }
        L_0x0186:
            r9.l()     // Catch:{ all -> 0x0219 }
            r9.invalidate()     // Catch:{ all -> 0x0219 }
        L_0x018c:
            com.instabug.library.annotation.AnnotationView$b r0 = r9.o2     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationView$b r6 = com.instabug.library.annotation.AnnotationView.b.RESIZE_BY_TOP_LEFT_BUTTON     // Catch:{ all -> 0x0219 }
            if (r0 == r6) goto L_0x0217
            com.instabug.library.annotation.AnnotationView$b r0 = r9.o2     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationView$b r6 = com.instabug.library.annotation.AnnotationView.b.RESIZE_BY_TOP_RIGHT_BUTTON     // Catch:{ all -> 0x0219 }
            if (r0 == r6) goto L_0x0217
            com.instabug.library.annotation.AnnotationView$b r0 = r9.o2     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationView$b r6 = com.instabug.library.annotation.AnnotationView.b.RESIZE_BY_BOTTOM_RIGHT_BUTTON     // Catch:{ all -> 0x0219 }
            if (r0 == r6) goto L_0x0217
            com.instabug.library.annotation.AnnotationView$b r0 = r9.o2     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationView$b r6 = com.instabug.library.annotation.AnnotationView.b.RESIZE_BY_BOTTOM_LEFT_BUTTON     // Catch:{ all -> 0x0219 }
            if (r0 == r6) goto L_0x0217
            com.instabug.library.annotation.AnnotationView$b r0 = r9.o2     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationView$b r6 = com.instabug.library.annotation.AnnotationView.b.DRAG     // Catch:{ all -> 0x0219 }
            if (r0 == r6) goto L_0x0217
            com.instabug.library.annotation.AnnotationView$b r0 = r9.o2     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationView$b r6 = com.instabug.library.annotation.AnnotationView.b.DRAW     // Catch:{ all -> 0x0219 }
            if (r0 != r6) goto L_0x0217
            com.instabug.library.annotation.AnnotationView$c r0 = r9.p2     // Catch:{ all -> 0x0219 }
            com.instabug.library.annotation.AnnotationView$c r6 = com.instabug.library.annotation.AnnotationView.c.DRAW_PATH     // Catch:{ all -> 0x0219 }
            if (r0 != r6) goto L_0x0217
            int r10 = r10.getAction()     // Catch:{ all -> 0x0219 }
            if (r10 == 0) goto L_0x0212
            if (r10 == r1) goto L_0x0204
            if (r10 == r4) goto L_0x01c1
            goto L_0x0217
        L_0x01c1:
            r9.c2 = r1     // Catch:{ all -> 0x0219 }
            float r10 = r9.a2     // Catch:{ all -> 0x0219 }
            float r10 = r2 - r10
            float r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0219 }
            float r0 = r9.b2     // Catch:{ all -> 0x0219 }
            float r0 = r3 - r0
            float r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0219 }
            r4 = 1090519040(0x41000000, float:8.0)
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x01dd
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 < 0) goto L_0x0200
        L_0x01dd:
            android.graphics.Path r10 = r9.q     // Catch:{ all -> 0x0219 }
            if (r10 == 0) goto L_0x01f0
            float r0 = r9.a2     // Catch:{ all -> 0x0219 }
            float r4 = r9.b2     // Catch:{ all -> 0x0219 }
            float r5 = r2 + r0
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r7 = r3 + r4
            float r7 = r7 / r6
            r10.quadTo(r0, r4, r5, r7)     // Catch:{ all -> 0x0219 }
        L_0x01f0:
            r9.a2 = r2     // Catch:{ all -> 0x0219 }
            r9.b2 = r3     // Catch:{ all -> 0x0219 }
            java.util.List<android.graphics.PointF> r10 = r9.x     // Catch:{ all -> 0x0219 }
            if (r10 == 0) goto L_0x0200
            android.graphics.PointF r0 = new android.graphics.PointF     // Catch:{ all -> 0x0219 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0219 }
            r10.add(r0)     // Catch:{ all -> 0x0219 }
        L_0x0200:
            r9.invalidate()     // Catch:{ all -> 0x0219 }
            goto L_0x0217
        L_0x0204:
            r9.k()     // Catch:{ all -> 0x0219 }
            boolean r10 = r9.c2     // Catch:{ all -> 0x0219 }
            if (r10 != 0) goto L_0x020e
            r9.performClick()     // Catch:{ all -> 0x0219 }
        L_0x020e:
            r9.invalidate()     // Catch:{ all -> 0x0219 }
            goto L_0x0217
        L_0x0212:
            r9.c2 = r5     // Catch:{ all -> 0x0219 }
            r9.i(r2, r3)     // Catch:{ all -> 0x0219 }
        L_0x0217:
            monitor-exit(r9)
            return r1
        L_0x0219:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.annotation.AnnotationView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDrawingColor(int i) {
        this.Y1 = i;
        this.y.setColor(i);
    }

    public void setDrawingMode(c cVar) {
        this.p2 = cVar;
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f2 = bitmap;
        super.setImageBitmap(bitmap);
    }

    public void setOnActionDownListener(f fVar) {
        this.s2 = fVar;
    }

    /* renamed from: setOnNewMagnifierAddingAِِِbilityChangedListener  reason: contains not printable characters */
    public void m17setOnNewMagnifierAddingAbilityChangedListener(g gVar) {
        this.t2 = gVar;
    }

    public void setOnPathRecognizedListener(h hVar) {
        this.u2 = hVar;
    }

    public void setScreenshot(Drawable drawable) {
        this.d2 = drawable;
    }
}
