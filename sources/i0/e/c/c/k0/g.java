package i0.e.c.c.k0;

import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.viewmodeladapter.R;
import com.clubhouse.backchannel.chat.style.MessageBubbleStyle;
import com.clubhouse.backchannel.chat.style.MessageColor;
import com.clubhouse.backchannel.data.models.local.DeliveryStatus;
import i0.b.a.j0;
import i0.b.a.k0;
import i0.b.a.o;
import i0.b.a.t;
import i0.b.a.w;
import i0.b.a.z;
import i0.b.c.g.e;
import i0.d.a.a.a;
import i0.e.c.c.k0.h;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: ChatMessageViewModel_ */
public class g extends t<d> implements z<d>, e {
    public static final e i = new h.b().b();
    public final BitSet j = new BitSet(15);
    public j0<g, d> k;
    public boolean l = false;
    public boolean m = false;
    public String n = null;
    public int o = 0;
    public boolean p = false;
    public boolean q = false;
    public DeliveryStatus r = null;
    public MessageColor s;
    public MessageBubbleStyle t;
    public k0 u = new k0((CharSequence) null);
    public k0 v = new k0((CharSequence) null);
    public View.OnClickListener w = null;
    public View.OnClickListener x = null;
    public View.OnLongClickListener y = null;
    public e z = i;

    public void A(int i2, Object obj) {
        d dVar = (d) obj;
        j0<g, d> j0Var = this.k;
        if (j0Var != null) {
            j0Var.a(this, dVar, i2);
        }
    }

    public void B(Object obj) {
        d dVar = (d) obj;
        dVar.setRetryClickListener((View.OnClickListener) null);
        dVar.setProfileClickListener((View.OnClickListener) null);
        dVar.setLongClickListener((View.OnLongClickListener) null);
    }

    public e D(int i2) {
        this.j.set(3);
        this.j.clear(2);
        this.n = null;
        w();
        this.o = i2;
        return this;
    }

    public e E(String str) {
        this.j.set(2);
        this.j.clear(3);
        this.o = 0;
        w();
        this.n = str;
        return this;
    }

    /* renamed from: F */
    public void k(d dVar) {
        e eVar = this.z;
        int i2 = R.id.epoxy_saved_view_style;
        if (!Objects.equals(eVar, dVar.getTag(i2))) {
            new h(dVar).a(this.z);
            dVar.setTag(i2, this.z);
        }
        dVar.setName(this.u.c(dVar.getContext()));
        if (this.j.get(2)) {
            dVar.setAvatar(this.n);
        } else if (this.j.get(3)) {
            dVar.setAvatar(this.o);
        } else {
            dVar.setAvatar(this.n);
        }
        dVar.setMessageBubbleStyle(this.t);
        dVar.setLongClickListener(this.y);
        dVar.setDeliveryStatus(this.r);
        dVar.setMessageBody(this.v.c(dVar.getContext()));
        dVar.setRetryClickListener(this.w);
        dVar.setIsEmoji(this.m);
        dVar.setProfileClickListener(this.x);
        dVar.setShowAvatar(this.p);
        dVar.setShowName(this.q);
        dVar.setMessageColor(this.s);
        dVar.t(this.l);
    }

    public e G(DeliveryStatus deliveryStatus) {
        w();
        this.r = deliveryStatus;
        return this;
    }

    public e H(CharSequence charSequence) {
        s(charSequence);
        return this;
    }

    public e I(boolean z2) {
        w();
        this.m = z2;
        return this;
    }

    public e J(boolean z2) {
        w();
        this.l = z2;
        return this;
    }

    public e K(View.OnLongClickListener onLongClickListener) {
        w();
        this.y = onLongClickListener;
        return this;
    }

    public e L(int i2) {
        w();
        this.v.a(i2, (Object[]) null);
        return this;
    }

    public e M(CharSequence charSequence) {
        w();
        k0 k0Var = this.v;
        k0Var.c = charSequence;
        k0Var.d = 0;
        return this;
    }

    public e N(MessageBubbleStyle messageBubbleStyle) {
        if (messageBubbleStyle != null) {
            this.j.set(8);
            w();
            this.t = messageBubbleStyle;
            return this;
        }
        throw new IllegalArgumentException("messageBubbleStyle cannot be null");
    }

    public e O(MessageColor messageColor) {
        if (messageColor != null) {
            this.j.set(7);
            w();
            this.s = messageColor;
            return this;
        }
        throw new IllegalArgumentException("messageColor cannot be null");
    }

    public e P(int i2) {
        w();
        this.u.a(i2, (Object[]) null);
        return this;
    }

    public e Q(CharSequence charSequence) {
        w();
        k0 k0Var = this.u;
        k0Var.c = charSequence;
        k0Var.d = 0;
        return this;
    }

    public e R(j0 j0Var) {
        w();
        this.k = j0Var;
        return this;
    }

    public e S(View.OnClickListener onClickListener) {
        w();
        this.x = onClickListener;
        return this;
    }

    public e T(View.OnClickListener onClickListener) {
        w();
        this.w = onClickListener;
        return this;
    }

    public e U(boolean z2) {
        w();
        this.p = z2;
        return this;
    }

    public e V(boolean z2) {
        w();
        this.q = z2;
        return this;
    }

    public void c(Object obj, int i2) {
        d dVar = (d) obj;
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
        if ((this.k == null) != (gVar.k == null) || this.l != gVar.l || this.m != gVar.m) {
            return false;
        }
        String str = this.n;
        if (str == null ? gVar.n != null : !str.equals(gVar.n)) {
            return false;
        }
        if (this.o != gVar.o || this.p != gVar.p || this.q != gVar.q) {
            return false;
        }
        DeliveryStatus deliveryStatus = this.r;
        if (deliveryStatus == null ? gVar.r != null : !deliveryStatus.equals(gVar.r)) {
            return false;
        }
        MessageColor messageColor = this.s;
        if (messageColor == null ? gVar.s != null : !messageColor.equals(gVar.s)) {
            return false;
        }
        MessageBubbleStyle messageBubbleStyle = this.t;
        if (messageBubbleStyle == null ? gVar.t != null : !messageBubbleStyle.equals(gVar.t)) {
            return false;
        }
        k0 k0Var = this.u;
        if (k0Var == null ? gVar.u != null : !k0Var.equals(gVar.u)) {
            return false;
        }
        k0 k0Var2 = this.v;
        if (k0Var2 == null ? gVar.v != null : !k0Var2.equals(gVar.v)) {
            return false;
        }
        if ((this.w == null) != (gVar.w == null)) {
            return false;
        }
        if ((this.x == null) != (gVar.x == null)) {
            return false;
        }
        if ((this.y == null) != (gVar.y == null)) {
            return false;
        }
        e eVar = this.z;
        e eVar2 = gVar.z;
        return eVar == null ? eVar2 == null : eVar.equals(eVar2);
    }

    public void g(w wVar, Object obj, int i2) {
        d dVar = (d) obj;
        C("The model was changed between being added to the controller and being bound.", i2);
        if (!Objects.equals(this.z, dVar.getTag(R.id.epoxy_saved_view_style))) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new f(this, dVar, i2));
        }
    }

    public int hashCode() {
        int i2 = 0;
        int i3 = 1;
        int hashCode = ((((((((((((super.hashCode() * 31) + 0) * 31) + 0) * 31) + (this.k != null ? 1 : 0)) * 31) + 0) * 31) + (this.l ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31;
        String str = this.n;
        int hashCode2 = (((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.o) * 31) + (this.p ? 1 : 0)) * 31) + (this.q ? 1 : 0)) * 31;
        DeliveryStatus deliveryStatus = this.r;
        int hashCode3 = (hashCode2 + (deliveryStatus != null ? deliveryStatus.hashCode() : 0)) * 31;
        MessageColor messageColor = this.s;
        int hashCode4 = (hashCode3 + (messageColor != null ? messageColor.hashCode() : 0)) * 31;
        MessageBubbleStyle messageBubbleStyle = this.t;
        int hashCode5 = (hashCode4 + (messageBubbleStyle != null ? messageBubbleStyle.hashCode() : 0)) * 31;
        k0 k0Var = this.u;
        int hashCode6 = (hashCode5 + (k0Var != null ? k0Var.hashCode() : 0)) * 31;
        k0 k0Var2 = this.v;
        int hashCode7 = (((((hashCode6 + (k0Var2 != null ? k0Var2.hashCode() : 0)) * 31) + (this.w != null ? 1 : 0)) * 31) + (this.x != null ? 1 : 0)) * 31;
        if (this.y == null) {
            i3 = 0;
        }
        int i4 = (hashCode7 + i3) * 31;
        e eVar = this.z;
        if (eVar != null) {
            i2 = eVar.hashCode();
        }
        return i4 + i2;
    }

    public void i(o oVar) {
        oVar.addInternal(this);
        j(oVar);
        if (!this.j.get(8)) {
            throw new IllegalStateException("A value is required for setMessageBubbleStyle");
        } else if (!this.j.get(7)) {
            throw new IllegalStateException("A value is required for setMessageColor");
        }
    }

    public void l(Object obj, t tVar) {
        String str;
        d dVar = (d) obj;
        if (!(tVar instanceof g)) {
            k(dVar);
            return;
        }
        g gVar = (g) tVar;
        if (!Objects.equals(this.z, gVar.z)) {
            new h(dVar).a(this.z);
            dVar.setTag(R.id.epoxy_saved_view_style, this.z);
        }
        k0 k0Var = this.u;
        if (k0Var == null ? gVar.u != null : !k0Var.equals(gVar.u)) {
            dVar.setName(this.u.c(dVar.getContext()));
        }
        if (this.j.get(2)) {
            if (!gVar.j.get(2) || ((str = this.n) == null ? gVar.n != null : !str.equals(gVar.n))) {
                dVar.setAvatar(this.n);
            }
        } else if (this.j.get(3)) {
            int i2 = this.o;
            if (i2 != gVar.o) {
                dVar.setAvatar(i2);
            }
        } else if (gVar.j.get(2) || gVar.j.get(3)) {
            dVar.setAvatar(this.n);
        }
        MessageBubbleStyle messageBubbleStyle = this.t;
        if (messageBubbleStyle == null ? gVar.t != null : !messageBubbleStyle.equals(gVar.t)) {
            dVar.setMessageBubbleStyle(this.t);
        }
        View.OnLongClickListener onLongClickListener = this.y;
        boolean z2 = true;
        if ((onLongClickListener == null) != (gVar.y == null)) {
            dVar.setLongClickListener(onLongClickListener);
        }
        DeliveryStatus deliveryStatus = this.r;
        if (deliveryStatus == null ? gVar.r != null : !deliveryStatus.equals(gVar.r)) {
            dVar.setDeliveryStatus(this.r);
        }
        k0 k0Var2 = this.v;
        if (k0Var2 == null ? gVar.v != null : !k0Var2.equals(gVar.v)) {
            dVar.setMessageBody(this.v.c(dVar.getContext()));
        }
        View.OnClickListener onClickListener = this.w;
        if ((onClickListener == null) != (gVar.w == null)) {
            dVar.setRetryClickListener(onClickListener);
        }
        boolean z3 = this.m;
        if (z3 != gVar.m) {
            dVar.setIsEmoji(z3);
        }
        View.OnClickListener onClickListener2 = this.x;
        boolean z4 = onClickListener2 == null;
        if (gVar.x != null) {
            z2 = false;
        }
        if (z4 != z2) {
            dVar.setProfileClickListener(onClickListener2);
        }
        boolean z5 = this.p;
        if (z5 != gVar.p) {
            dVar.setShowAvatar(z5);
        }
        boolean z6 = this.q;
        if (z6 != gVar.q) {
            dVar.setShowName(z6);
        }
        MessageColor messageColor = this.s;
        if (messageColor == null ? gVar.s != null : !messageColor.equals(gVar.s)) {
            dVar.setMessageColor(this.s);
        }
        boolean z7 = this.l;
        if (z7 != gVar.l) {
            dVar.t(z7);
        }
    }

    public View n(ViewGroup viewGroup) {
        d dVar = new d(viewGroup.getContext());
        dVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        return dVar;
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
        StringBuilder P0 = a.P0("ChatMessageViewModel_{isSelf_Boolean=");
        P0.append(this.l);
        P0.append(", isEmoji_Boolean=");
        P0.append(this.m);
        P0.append(", avatar_String=");
        P0.append(this.n);
        P0.append(", avatar_Int=");
        P0.append(this.o);
        P0.append(", showAvatar_Boolean=");
        P0.append(this.p);
        P0.append(", showName_Boolean=");
        P0.append(this.q);
        P0.append(", deliveryStatus_DeliveryStatus=");
        P0.append(this.r);
        P0.append(", messageColor_MessageColor=");
        P0.append(this.s);
        P0.append(", messageBubbleStyle_MessageBubbleStyle=");
        P0.append(this.t);
        P0.append(", name_StringAttributeData=");
        P0.append(this.u);
        P0.append(", messageBody_StringAttributeData=");
        P0.append(this.v);
        P0.append(", retryClickListener_OnClickListener=");
        P0.append(this.w);
        P0.append(", profileClickListener_OnClickListener=");
        P0.append(this.x);
        P0.append(", longClickListener_OnLongClickListener=");
        P0.append(this.y);
        P0.append(", style=");
        P0.append(this.z);
        P0.append("}");
        P0.append(super.toString());
        return P0.toString();
    }

    public void z(float f, float f2, int i2, int i3, Object obj) {
        d dVar = (d) obj;
    }
}
