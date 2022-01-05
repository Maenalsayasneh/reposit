package com.clubhouse.android.ui.hallway.buddyList.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.user.UserInStatus;
import com.clubhouse.android.databinding.BuddyListUserBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: BuddyListUser.kt */
public abstract class BuddyListUser extends BaseEpoxyModelWithHolder<a> {
    public UserInStatus j;
    public SpannableString k;
    public View.OnClickListener l;
    public Action m;
    public View.OnClickListener n;

    /* compiled from: BuddyListUser.kt */
    public enum Action {
        AcceptWave,
        SendWave,
        CancelWave,
        StartRoom
    }

    /* compiled from: BuddyListUser.kt */
    public static final class a extends d {
        public BuddyListUserBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            BuddyListUserBinding bind = BuddyListUserBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final BuddyListUserBinding b() {
            BuddyListUserBinding buddyListUserBinding = this.b;
            if (buddyListUserBinding != null) {
                return buddyListUserBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* compiled from: BuddyListUser.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            Action.values();
            int[] iArr = new int[4];
            iArr[Action.AcceptWave.ordinal()] = 1;
            iArr[Action.SendWave.ordinal()] = 2;
            iArr[Action.CancelWave.ordinal()] = 3;
            iArr[Action.StartRoom.ordinal()] = 4;
            a = iArr;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        String str;
        Integer num;
        i.e(aVar, "holder");
        AvatarView avatarView = aVar.b().c;
        i.d(avatarView, "holder.binding.avatar");
        k.u(avatarView, this.j);
        TextView textView = aVar.b().f;
        UserInStatus userInStatus = this.j;
        String str2 = null;
        if (userInStatus == null) {
            str = null;
        } else {
            str = userInStatus.Y1;
        }
        textView.setText(str);
        SpannableString spannableString = this.k;
        if (spannableString != null) {
            aVar.b().i.setText(spannableString);
        }
        ImageView imageView = aVar.b().e;
        i.d(imageView, "holder.binding.endBadge");
        UserInStatus userInStatus2 = this.j;
        i.e(imageView, "<this>");
        if (userInStatus2 == null) {
            num = null;
        } else {
            num = userInStatus2.x;
        }
        k.b(imageView, num);
        ConstraintLayout constraintLayout = aVar.b().a;
        i.d(constraintLayout, "holder.binding.root");
        k.H(constraintLayout, aVar.a, this.l);
        Button button = aVar.b().h;
        i.d(button, "holder.binding.startRoom");
        k.L(button, Boolean.valueOf(this.m == Action.StartRoom));
        Button button2 = aVar.b().g;
        i.d(button2, "holder.binding.sendWave");
        k.L(button2, Boolean.valueOf(this.m == Action.SendWave));
        Button button3 = aVar.b().d;
        i.d(button3, "holder.binding.cancelWave");
        k.L(button3, Boolean.valueOf(this.m == Action.CancelWave));
        Button button4 = aVar.b().b;
        i.d(button4, "holder.binding.acceptWave");
        k.L(button4, Boolean.valueOf(this.m == Action.AcceptWave));
        Action action = this.m;
        int i = action == null ? -1 : b.a[action.ordinal()];
        if (i == 1) {
            Button button5 = aVar.b().b;
            i.d(button5, "holder.binding.acceptWave");
            k.H(button5, aVar.a, this.n);
        } else if (i == 2) {
            UserInStatus userInStatus3 = this.j;
            if (userInStatus3 != null) {
                str2 = userInStatus3.Y1;
            }
            Context context = aVar.b().a.getContext();
            SpannableString spannableString2 = new SpannableString(context.getString(R.string.button_emoji));
            spannableString2.setSpan(new ImageSpan(context, R.drawable.ic_hand_wave_emoji), 0, 1, 33);
            aVar.b().g.setText(spannableString2);
            aVar.b().g.setContentDescription(context.getString(R.string.cd_send_wave, new Object[]{str2}));
            Button button6 = aVar.b().g;
            i.d(button6, "holder.binding.sendWave");
            k.H(button6, aVar.a, this.n);
        } else if (i == 3) {
            Button button7 = aVar.b().d;
            i.d(button7, "holder.binding.cancelWave");
            k.H(button7, aVar.a, this.n);
        } else if (i == 4) {
            Context context2 = aVar.b().a.getContext();
            Drawable drawable = h0.i.b.a.getDrawable(context2, R.drawable.ic_lock);
            if (drawable != null) {
                drawable.setBounds(0, 0, (int) (((double) drawable.getIntrinsicWidth()) * 0.65d), (int) (((double) drawable.getIntrinsicHeight()) * 0.65d));
            }
            if (drawable != null) {
                drawable.setAlpha(127);
            }
            Drawable drawable2 = h0.i.b.a.getDrawable(context2, R.drawable.ic_add);
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, (int) (((double) drawable2.getIntrinsicWidth()) * 0.75d), (int) (((double) drawable2.getIntrinsicHeight()) * 0.75d));
            }
            aVar.b().h.setCompoundDrawables(drawable2, (Drawable) null, drawable, (Drawable) null);
            Button button8 = aVar.b().h;
            i.d(button8, "holder.binding.startRoom");
            k.H(button8, aVar.a, this.n);
        }
    }
}
