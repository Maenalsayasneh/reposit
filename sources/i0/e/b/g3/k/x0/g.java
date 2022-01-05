package i0.e.b.g3.k.x0;

import android.view.View;
import android.view.ViewParent;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.b.a.r;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.e.b.a3.f.d;
import i0.e.b.g3.k.x0.e;
import java.util.Objects;
import m0.i;
import m0.n.a.a;

/* compiled from: ChannelHeader_ */
public class g extends e implements z<e.a>, f {
    public void A(int i, Object obj) {
        super.G(i, (e.a) obj);
    }

    public void B(Object obj) {
        super.H((e.a) obj);
    }

    public r E(ViewParent viewParent) {
        return new e.a();
    }

    public void F(float f, float f2, int i, int i2, r rVar) {
        e.a aVar = (e.a) rVar;
    }

    public void G(int i, r rVar) {
        super.G(i, (e.a) rVar);
    }

    public void H(r rVar) {
        super.H((e.a) rVar);
    }

    public void I(int i, d dVar) {
        super.G(i, (e.a) dVar);
    }

    public void J(d dVar) {
        super.H((e.a) dVar);
    }

    public f L(Channel channel) {
        w();
        this.j = channel;
        return this;
    }

    public f M(View.OnClickListener onClickListener) {
        w();
        this.k = onClickListener;
        return this;
    }

    public f N(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public f O(View.OnClickListener onClickListener) {
        w();
        this.l = onClickListener;
        return this;
    }

    public void c(Object obj, int i) {
        e.a aVar = (e.a) obj;
        C("The model was changed during the bind call.", i);
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
        Channel channel = this.j;
        if (channel == null ? gVar.j != null : !channel.equals(gVar.j)) {
            return false;
        }
        View.OnClickListener onClickListener = this.k;
        if (onClickListener == null ? gVar.k != null : !onClickListener.equals(gVar.k)) {
            return false;
        }
        View.OnClickListener onClickListener2 = this.l;
        if (onClickListener2 == null ? gVar.l != null : !onClickListener2.equals(gVar.l)) {
            return false;
        }
        a<i> aVar = this.i;
        return aVar == null ? gVar.i == null : aVar.equals(gVar.i);
    }

    public void g(w wVar, Object obj, int i) {
        e.a aVar = (e.a) obj;
        C("The model was changed between being added to the controller and being bound.", i);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + 0) * 31) + 0) * 31;
        Channel channel = this.j;
        int hashCode2 = (hashCode + (channel != null ? channel.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener = this.k;
        int hashCode3 = (hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0)) * 31;
        View.OnClickListener onClickListener2 = this.l;
        int hashCode4 = (hashCode3 + (onClickListener2 != null ? onClickListener2.hashCode() : 0)) * 31;
        a<i> aVar = this.i;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 + i;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
    }

    public int o() {
        return R.layout.channel_header;
    }

    public t r(long j) {
        super.r(j);
        return this;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChannelHeader_{channel=");
        P0.append(this.j);
        P0.append(", clubClickListener=");
        P0.append(this.k);
        P0.append(", optionClickListener=");
        P0.append(this.l);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i, int i2, Object obj) {
        e.a aVar = (e.a) obj;
    }
}
