package i0.e.c.e.j;

import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.viewmodeladapter.R;
import i0.b.a.o;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.b.c.g.e;
import i0.d.a.a.a;
import i0.e.c.e.j.d;
import java.util.Objects;

/* compiled from: CreateChatUserViewModel_ */
public class c extends t<a> implements z<a> {
    public static final e i = new d.b().b();
    public String j = null;
    public String k = null;
    public View.OnClickListener l = null;
    public e m = i;

    public void A(int i2, Object obj) {
        a aVar = (a) obj;
    }

    public void B(Object obj) {
        ((a) obj).setRemoveClickListener((View.OnClickListener) null);
    }

    /* renamed from: D */
    public void k(a aVar) {
        e eVar = this.m;
        int i2 = R.id.epoxy_saved_view_style;
        if (!Objects.equals(eVar, aVar.getTag(i2))) {
            new d(aVar).a(this.m);
            aVar.setTag(i2, this.m);
        }
        aVar.setName(this.j);
        aVar.setAvatar(this.k);
        aVar.setRemoveClickListener(this.l);
    }

    public void c(Object obj, int i2) {
        a aVar = (a) obj;
        C("The model was changed during the bind call.", i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c) || !super.equals(obj)) {
            return false;
        }
        c cVar = (c) obj;
        Objects.requireNonNull(cVar);
        String str = this.j;
        if (str == null ? cVar.j != null : !str.equals(cVar.j)) {
            return false;
        }
        String str2 = this.k;
        if (str2 == null ? cVar.k != null : !str2.equals(cVar.k)) {
            return false;
        }
        if ((this.l == null) != (cVar.l == null)) {
            return false;
        }
        e eVar = this.m;
        e eVar2 = cVar.m;
        return eVar == null ? eVar2 == null : eVar.equals(eVar2);
    }

    public void g(w wVar, Object obj, int i2) {
        a aVar = (a) obj;
        C("The model was changed between being added to the controller and being bound.", i2);
        if (!Objects.equals(this.m, aVar.getTag(R.id.epoxy_saved_view_style))) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new b(this, aVar, i2));
        }
    }

    public int hashCode() {
        int i2 = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        String str = this.j;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.k;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.l != null ? 1 : 0)) * 31;
        e eVar = this.m;
        if (eVar != null) {
            i2 = eVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public void l(Object obj, t tVar) {
        a aVar = (a) obj;
        if (!(tVar instanceof c)) {
            k(aVar);
            return;
        }
        c cVar = (c) tVar;
        if (!Objects.equals(this.m, cVar.m)) {
            new d(aVar).a(this.m);
            aVar.setTag(R.id.epoxy_saved_view_style, this.m);
        }
        String str = this.j;
        if (str == null ? cVar.j != null : !str.equals(cVar.j)) {
            aVar.setName(this.j);
        }
        String str2 = this.k;
        if (str2 == null ? cVar.k != null : !str2.equals(cVar.k)) {
            aVar.setAvatar(this.k);
        }
        View.OnClickListener onClickListener = this.l;
        boolean z = true;
        boolean z2 = onClickListener == null;
        if (cVar.l != null) {
            z = false;
        }
        if (z2 != z) {
            aVar.setRemoveClickListener(onClickListener);
        }
    }

    public View n(ViewGroup viewGroup) {
        a aVar = new a(viewGroup.getContext());
        aVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return aVar;
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
        StringBuilder P0 = a.P0("CreateChatUserViewModel_{name_String=");
        P0.append(this.j);
        P0.append(", avatar_String=");
        P0.append(this.k);
        P0.append(", removeClickListener_OnClickListener=");
        P0.append(this.l);
        P0.append(", style=");
        P0.append(this.m);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i2, int i3, Object obj) {
        a aVar = (a) obj;
    }
}
