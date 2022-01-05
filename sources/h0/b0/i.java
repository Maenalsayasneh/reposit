package h0.b0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import h0.i.i.q;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Slide */
public class i extends e0 {
    public static final g A2 = new d();
    public static final g B2 = new e();
    public static final g C2 = new f();
    public static final TimeInterpolator v2 = new DecelerateInterpolator();
    public static final TimeInterpolator w2 = new AccelerateInterpolator();
    public static final g x2 = new a();
    public static final g y2 = new b();
    public static final g z2 = new c();
    public g D2;

    /* compiled from: Slide */
    public static class a extends h {
        public a() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* compiled from: Slide */
    public static class b extends h {
        public b() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            AtomicInteger atomicInteger = q.a;
            boolean z = true;
            if (viewGroup.getLayoutDirection() != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* compiled from: Slide */
    public static class c extends C0023i {
        public c() {
            super((a) null);
        }

        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    /* compiled from: Slide */
    public static class d extends h {
        public d() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* compiled from: Slide */
    public static class e extends h {
        public e() {
            super((a) null);
        }

        public float b(ViewGroup viewGroup, View view) {
            AtomicInteger atomicInteger = q.a;
            boolean z = true;
            if (viewGroup.getLayoutDirection() != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* compiled from: Slide */
    public static class f extends C0023i {
        public f() {
            super((a) null);
        }

        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    /* compiled from: Slide */
    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* compiled from: Slide */
    public static abstract class h implements g {
        public h(a aVar) {
        }

        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: h0.b0.i$i  reason: collision with other inner class name */
    /* compiled from: Slide */
    public static abstract class C0023i implements g {
        public C0023i(a aVar) {
        }

        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public i(int i) {
        g gVar = C2;
        this.D2 = gVar;
        if (i == 3) {
            this.D2 = x2;
        } else if (i == 5) {
            this.D2 = A2;
        } else if (i == 48) {
            this.D2 = z2;
        } else if (i == 80) {
            this.D2 = gVar;
        } else if (i == 8388611) {
            this.D2 = y2;
        } else if (i == 8388613) {
            this.D2 = B2;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        h hVar = new h();
        hVar.b = i;
        this.q2 = hVar;
    }

    public Animator O(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        int[] iArr = (int[]) rVar2.a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return t.a(view, rVar2, iArr[0], iArr[1], this.D2.b(viewGroup, view), this.D2.a(viewGroup, view), translationX, translationY, v2, this);
    }

    public Animator P(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        int[] iArr = (int[]) rVar.a.get("android:slide:screenPosition");
        return t.a(view, rVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.D2.b(viewGroup, view), this.D2.a(viewGroup, view), w2, this);
    }

    public void f(r rVar) {
        M(rVar);
        int[] iArr = new int[2];
        rVar.b.getLocationOnScreen(iArr);
        rVar.a.put("android:slide:screenPosition", iArr);
    }

    public void i(r rVar) {
        M(rVar);
        int[] iArr = new int[2];
        rVar.b.getLocationOnScreen(iArr);
        rVar.a.put("android:slide:screenPosition", iArr);
    }
}
