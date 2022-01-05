package i0.e.b.g3.k.v0.e;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.databinding.RaisedHandsUserItemBinding;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: RaisedHandsUserItem.kt */
public abstract class a extends BaseEpoxyModelWithHolder<C0200a> {
    public UserInChannel j;
    public boolean k;
    public View.OnClickListener l;
    public View.OnClickListener m;

    /* renamed from: i0.e.b.g3.k.v0.e.a$a  reason: collision with other inner class name */
    /* compiled from: RaisedHandsUserItem.kt */
    public static final class C0200a extends d {
        public RaisedHandsUserItemBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            RaisedHandsUserItemBinding bind = RaisedHandsUserItemBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final RaisedHandsUserItemBinding b() {
            RaisedHandsUserItemBinding raisedHandsUserItemBinding = this.b;
            if (raisedHandsUserItemBinding != null) {
                return raisedHandsUserItemBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0099, code lost:
        if ((r0.length() > 0) == true) goto L_0x009d;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(i0.e.b.g3.k.v0.e.a.C0200a r5) {
        /*
            r4 = this;
            java.lang.String r0 = "holder"
            m0.n.b.i.e(r5, r0)
            com.clubhouse.android.databinding.RaisedHandsUserItemBinding r0 = r5.b()
            android.widget.TextView r0 = r0.e
            com.clubhouse.android.data.models.local.channel.UserInChannel r1 = r4.j
            r2 = 0
            if (r1 != 0) goto L_0x0012
            r1 = r2
            goto L_0x0014
        L_0x0012:
            java.lang.String r1 = r1.e2
        L_0x0014:
            r0.setText(r1)
            com.clubhouse.android.databinding.RaisedHandsUserItemBinding r0 = r5.b()
            com.clubhouse.android.shared.ui.AvatarView r0 = r0.b
            java.lang.String r1 = "holder.binding.avatar"
            m0.n.b.i.d(r0, r1)
            com.clubhouse.android.data.models.local.channel.UserInChannel r1 = r4.j
            i0.e.b.d3.k.u(r0, r1)
            com.clubhouse.android.databinding.RaisedHandsUserItemBinding r0 = r5.b()
            androidx.emoji.widget.EmojiTextView r0 = r0.f
            java.lang.String r1 = "holder.binding.startBadge"
            m0.n.b.i.d(r0, r1)
            com.clubhouse.android.data.models.local.channel.UserInChannel r1 = r4.j
            h0.b0.v.p(r0, r1)
            com.clubhouse.android.databinding.RaisedHandsUserItemBinding r0 = r5.b()
            android.widget.ImageView r0 = r0.d
            java.lang.String r1 = "holder.binding.inviteButton"
            m0.n.b.i.d(r0, r1)
            n0.a.f0 r1 = r5.a
            android.view.View$OnClickListener r3 = r4.l
            i0.e.b.d3.k.H(r0, r1, r3)
            com.clubhouse.android.databinding.RaisedHandsUserItemBinding r0 = r5.b()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.a
            java.lang.String r1 = "holder.binding.root"
            m0.n.b.i.d(r0, r1)
            n0.a.f0 r1 = r5.a
            android.view.View$OnClickListener r3 = r4.m
            i0.e.b.d3.k.H(r0, r1, r3)
            com.clubhouse.android.databinding.RaisedHandsUserItemBinding r0 = r5.b()
            android.widget.ImageView r0 = r0.d
            boolean r1 = r4.k
            r3 = 1
            r1 = r1 ^ r3
            r0.setClickable(r1)
            boolean r0 = r4.k
            if (r0 == 0) goto L_0x0079
            com.clubhouse.android.databinding.RaisedHandsUserItemBinding r0 = r5.b()
            android.widget.ImageView r0 = r0.d
            r1 = 2131231333(0x7f080265, float:1.8078744E38)
            r0.setImageResource(r1)
            goto L_0x0085
        L_0x0079:
            com.clubhouse.android.databinding.RaisedHandsUserItemBinding r0 = r5.b()
            android.widget.ImageView r0 = r0.d
            r1 = 2131231368(0x7f080288, float:1.8078815E38)
            r0.setImageResource(r1)
        L_0x0085:
            com.clubhouse.android.data.models.local.channel.UserInChannel r0 = r4.j
            r1 = 0
            if (r0 != 0) goto L_0x008b
            goto L_0x009c
        L_0x008b:
            java.lang.String r0 = r0.y
            if (r0 != 0) goto L_0x0090
            goto L_0x009c
        L_0x0090:
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0098
            r0 = r3
            goto L_0x0099
        L_0x0098:
            r0 = r1
        L_0x0099:
            if (r0 != r3) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r3 = r1
        L_0x009d:
            if (r3 == 0) goto L_0x00b8
            com.clubhouse.android.databinding.RaisedHandsUserItemBinding r0 = r5.b()
            android.widget.TextView r0 = r0.c
            com.clubhouse.android.data.models.local.channel.UserInChannel r3 = r4.j
            if (r3 != 0) goto L_0x00aa
            goto L_0x00ac
        L_0x00aa:
            java.lang.String r2 = r3.y
        L_0x00ac:
            r0.setText(r2)
            com.clubhouse.android.databinding.RaisedHandsUserItemBinding r5 = r5.b()
            android.widget.TextView r5 = r5.c
            r5.setVisibility(r1)
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.k.v0.e.a.k(i0.e.b.g3.k.v0.e.a$a):void");
    }
}
