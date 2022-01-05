package i0.b.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.Carousel;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;

/* compiled from: CarouselModel_ */
public class g extends t<Carousel> implements z<Carousel>, f {
    public final BitSet i = new BitSet(7);
    public int j = 0;
    public int k = -1;
    public Carousel.Padding l = null;
    public List<? extends t<?>> m;

    public void A(int i2, Object obj) {
        Carousel carousel = (Carousel) obj;
    }

    public void B(Object obj) {
        Carousel carousel = (Carousel) obj;
        o oVar = carousel.q;
        if (oVar != null) {
            oVar.cancelPendingModelBuild();
        }
        carousel.q = null;
        carousel.swapAdapter((RecyclerView.Adapter<?>) null, true);
    }

    /* renamed from: D */
    public void k(Carousel carousel) {
        if (this.i.get(3)) {
            carousel.setPaddingRes(this.j);
        } else if (this.i.get(4)) {
            carousel.setPaddingDp(this.k);
        } else if (this.i.get(5)) {
            carousel.setPadding(this.l);
        } else {
            carousel.setPaddingDp(this.k);
        }
        carousel.setHasFixedSize(false);
        if (this.i.get(1)) {
            carousel.setNumViewsToShowOnScreen(0.0f);
        } else if (this.i.get(2)) {
            carousel.setInitialPrefetchItemCount(0);
        } else {
            carousel.setNumViewsToShowOnScreen(0.0f);
        }
        carousel.setModels(this.m);
    }

    public f E(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public f F(List list) {
        if (list != null) {
            this.i.set(6);
            w();
            this.m = list;
            return this;
        }
        throw new IllegalArgumentException("models cannot be null");
    }

    public f G(Carousel.Padding padding) {
        this.i.set(5);
        this.i.clear(3);
        this.j = 0;
        this.i.clear(4);
        this.k = -1;
        w();
        this.l = padding;
        return this;
    }

    public f H(int i2) {
        this.i.set(3);
        this.i.clear(4);
        this.k = -1;
        this.i.clear(5);
        this.l = null;
        w();
        this.j = i2;
        return this;
    }

    public void c(Object obj, int i2) {
        Carousel carousel = (Carousel) obj;
        C("The model was changed during the bind call.", i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g) || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        Objects.requireNonNull(gVar);
        if (Float.compare(0.0f, 0.0f) != 0 || this.j != gVar.j || this.k != gVar.k) {
            return false;
        }
        Carousel.Padding padding = this.l;
        if (padding == null ? gVar.l != null : !padding.equals(gVar.l)) {
            return false;
        }
        List<? extends t<?>> list = this.m;
        List<? extends t<?>> list2 = gVar.m;
        return list == null ? list2 == null : list.equals(list2);
    }

    public void g(w wVar, Object obj, int i2) {
        Carousel carousel = (Carousel) obj;
        C("The model was changed between being added to the controller and being bound.", i2);
    }

    public int hashCode() {
        int i2 = 0;
        int hashCode = ((((((((((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31) + this.j) * 31) + this.k) * 31;
        Carousel.Padding padding = this.l;
        int hashCode2 = (hashCode + (padding != null ? padding.hashCode() : 0)) * 31;
        List<? extends t<?>> list = this.m;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
        if (!this.i.get(6)) {
            throw new IllegalStateException("A value is required for setModels");
        }
    }

    public void l(Object obj, t tVar) {
        Carousel.Padding padding;
        Carousel carousel = (Carousel) obj;
        if (!(tVar instanceof g)) {
            k(carousel);
            return;
        }
        g gVar = (g) tVar;
        if (this.i.get(3)) {
            int i2 = this.j;
            if (i2 != gVar.j) {
                carousel.setPaddingRes(i2);
            }
        } else if (this.i.get(4)) {
            int i3 = this.k;
            if (i3 != gVar.k) {
                carousel.setPaddingDp(i3);
            }
        } else if (this.i.get(5)) {
            if (!gVar.i.get(5) || ((padding = this.l) == null ? gVar.l != null : !padding.equals(gVar.l))) {
                carousel.setPadding(this.l);
            }
        } else if (gVar.i.get(3) || gVar.i.get(4) || gVar.i.get(5)) {
            carousel.setPaddingDp(this.k);
        }
        Objects.requireNonNull(gVar);
        if (this.i.get(1)) {
            if (Float.compare(0.0f, 0.0f) != 0) {
                carousel.setNumViewsToShowOnScreen(0.0f);
            }
        } else if (!this.i.get(2) && (gVar.i.get(1) || gVar.i.get(2))) {
            carousel.setNumViewsToShowOnScreen(0.0f);
        }
        List<? extends t<?>> list = this.m;
        List<? extends t<?>> list2 = gVar.m;
        if (list != null) {
            if (list.equals(list2)) {
                return;
            }
        } else if (list2 == null) {
            return;
        }
        carousel.setModels(this.m);
    }

    public View n(ViewGroup viewGroup) {
        Carousel carousel = new Carousel(viewGroup.getContext());
        carousel.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return carousel;
    }

    public int o() {
        throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
    }

    public int p(int i2, int i3, int i4) {
        return i2;
    }

    public int q() {
        return 0;
    }

    public t r(long j2) {
        super.r(j2);
        return this;
    }

    public String toString() {
        return "CarouselModel_{hasFixedSize_Boolean=" + false + ", numViewsToShowOnScreen_Float=" + 0.0f + ", initialPrefetchItemCount_Int=" + 0 + ", paddingRes_Int=" + this.j + ", paddingDp_Int=" + this.k + ", padding_Padding=" + this.l + ", models_List=" + this.m + "}" + super.toString();
    }

    public void z(float f, float f2, int i2, int i3, Object obj) {
        Carousel carousel = (Carousel) obj;
    }
}
