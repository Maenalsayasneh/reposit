package g0.b;

import android.animation.LayoutTransition;
import android.view.ViewGroup;
import com.airbnb.paris.R;
import g0.b.b;
import i0.b.c.b;
import i0.b.c.f.d;
import i0.b.c.g.e;
import i0.b.c.h.c;

/* compiled from: ViewGroupStyleApplier */
public final class a extends b<d, ViewGroup> {

    /* renamed from: g0.b.a$a  reason: collision with other inner class name */
    /* compiled from: ViewGroupStyleApplier */
    public static abstract class C0013a<B extends C0013a<B, A>, A extends b<?, ?>> extends b.a<B, A> {
    }

    public a(ViewGroup viewGroup) {
        super(new d(viewGroup));
    }

    public void b(e eVar) {
        b bVar = new b(this.c);
        bVar.a = this.a;
        bVar.a(eVar);
    }

    public int[] c() {
        return R.styleable.Paris_ViewGroup;
    }

    public void d(e eVar, c cVar) {
        ((ViewGroup) this.c).getContext().getResources();
        int i = R.styleable.Paris_ViewGroup_android_animateLayoutChanges;
        if (cVar.l(i)) {
            ((ViewGroup) ((d) this.b).a).setLayoutTransition(cVar.a(i) ? new LayoutTransition() : null);
        }
        int i2 = R.styleable.Paris_ViewGroup_android_clipChildren;
        if (cVar.l(i2)) {
            ((ViewGroup) ((d) this.b).a).setClipChildren(cVar.a(i2));
        }
        int i3 = R.styleable.Paris_ViewGroup_android_clipToPadding;
        if (cVar.l(i3)) {
            ((ViewGroup) ((d) this.b).a).setClipToPadding(cVar.a(i3));
        }
    }

    public void e(e eVar, c cVar) {
        ((ViewGroup) this.c).getContext().getResources();
    }
}
