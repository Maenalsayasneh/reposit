package i0.h.a.c.k;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: CircularRevealWidget */
public interface c {

    /* compiled from: CircularRevealWidget */
    public static class b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> a = new b();
        public final e b = new e((a) null);

        public Object evaluate(float f, Object obj, Object obj2) {
            e eVar = (e) obj;
            e eVar2 = (e) obj2;
            e eVar3 = this.b;
            float c0 = i0.h.a.b.c.m.b.c0(eVar.a, eVar2.a, f);
            float c02 = i0.h.a.b.c.m.b.c0(eVar.b, eVar2.b, f);
            float c03 = i0.h.a.b.c.m.b.c0(eVar.c, eVar2.c, f);
            eVar3.a = c0;
            eVar3.b = c02;
            eVar3.c = c03;
            return this.b;
        }
    }

    /* renamed from: i0.h.a.c.k.c$c  reason: collision with other inner class name */
    /* compiled from: CircularRevealWidget */
    public static class C0140c extends Property<c, e> {
        public static final Property<c, e> a = new C0140c("circularReveal");

        public C0140c(String str) {
            super(e.class, str);
        }

        public Object get(Object obj) {
            return ((c) obj).getRevealInfo();
        }

        public void set(Object obj, Object obj2) {
            ((c) obj).setRevealInfo((e) obj2);
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class d extends Property<c, Integer> {
        public static final Property<c, Integer> a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        public Object get(Object obj) {
            return Integer.valueOf(((c) obj).getCircularRevealScrimColor());
        }

        public void set(Object obj, Object obj2) {
            ((c) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
        }
    }

    /* compiled from: CircularRevealWidget */
    public static class e {
        public float a;
        public float b;
        public float c;

        public e() {
        }

        public e(a aVar) {
        }

        public e(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
