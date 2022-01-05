package com.clubhouse.android.ui.onboarding;

import android.content.res.Resources;
import android.widget.TextView;
import com.clubhouse.android.databinding.FragmentInvitedByBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.d.a.a.a;
import i0.e.b.g3.r.h1;
import i0.e.b.g3.r.k1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: InvitedByFragment.kt */
public final class InvitedByFragment$invalidate$1 extends Lambda implements l<k1, i> {
    public final /* synthetic */ InvitedByFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvitedByFragment$invalidate$1(InvitedByFragment invitedByFragment) {
        super(1);
        this.c = invitedByFragment;
    }

    public Object invoke(Object obj) {
        CharSequence charSequence;
        k1 k1Var = (k1) obj;
        m0.n.b.i.e(k1Var, "state");
        TextView textView = InvitedByFragment.O0(this.c).d;
        h1 h1Var = k1Var.a;
        int i = 0;
        if (h1Var instanceof h1.c) {
            charSequence = this.c.getText(R.string.welcome_set_up_profile);
        } else if (h1Var instanceof h1.d) {
            Resources resources = this.c.getResources();
            m0.n.b.i.d(resources, "resources");
            Object[] objArr = {((h1.d) k1Var.a).a};
            ArrayList i1 = a.i1(resources, "<this>", objArr, "rawArgs", 1);
            int i2 = 0;
            for (int i3 = 1; i2 < i3; i3 = 1) {
                Object obj2 = objArr[i2];
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    obj2 = a.p0(str, "<this>", str, 63);
                }
                i1.add(obj2);
                i2++;
            }
            String string = resources.getString(R.string.welcome_inviter_name);
            m0.n.b.i.d(string, "getString(id)");
            Object[] array = i1.toArray(new Object[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Object[] copyOf = Arrays.copyOf(array, array.length);
            charSequence = a.L(copyOf, copyOf.length, string, "java.lang.String.format(format, *args)", 63, "fromHtml(\n            String.format(getString(id), *args.toTypedArray()),\n            HtmlCompat.FROM_HTML_MODE_COMPACT\n        )");
        } else if (h1Var instanceof h1.a) {
            Resources resources2 = this.c.getResources();
            m0.n.b.i.d(resources2, "resources");
            Object[] objArr2 = {((h1.a) k1Var.a).a};
            ArrayList i12 = a.i1(resources2, "<this>", objArr2, "rawArgs", 1);
            int i4 = 0;
            for (int i5 = 1; i4 < i5; i5 = 1) {
                Object obj3 = objArr2[i4];
                if (obj3 instanceof String) {
                    String str2 = (String) obj3;
                    obj3 = a.p0(str2, "<this>", str2, 63);
                }
                i12.add(obj3);
                i4++;
            }
            String string2 = resources2.getString(R.string.welcome_inviter_club);
            m0.n.b.i.d(string2, "getString(id)");
            Object[] array2 = i12.toArray(new Object[0]);
            Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
            Object[] copyOf2 = Arrays.copyOf(array2, array2.length);
            charSequence = a.L(copyOf2, copyOf2.length, string2, "java.lang.String.format(format, *args)", 63, "fromHtml(\n            String.format(getString(id), *args.toTypedArray()),\n            HtmlCompat.FROM_HTML_MODE_COMPACT\n        )");
        } else if (h1Var instanceof h1.b) {
            Resources resources3 = this.c.getResources();
            m0.n.b.i.d(resources3, "resources");
            h1.b bVar = (h1.b) k1Var.a;
            Object[] objArr3 = {bVar.a, bVar.b};
            ArrayList i13 = a.i1(resources3, "<this>", objArr3, "rawArgs", 2);
            int i6 = 0;
            for (int i7 = 2; i6 < i7; i7 = 2) {
                Object obj4 = objArr3[i6];
                if (obj4 instanceof String) {
                    String str3 = (String) obj4;
                    obj4 = a.p0(str3, "<this>", str3, 63);
                }
                i13.add(obj4);
                i6++;
            }
            String string3 = resources3.getString(R.string.welcome_inviter_club_name);
            m0.n.b.i.d(string3, "getString(id)");
            Object[] array3 = i13.toArray(new Object[0]);
            Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T>");
            Object[] copyOf3 = Arrays.copyOf(array3, array3.length);
            charSequence = a.L(copyOf3, copyOf3.length, string3, "java.lang.String.format(format, *args)", 63, "fromHtml(\n            String.format(getString(id), *args.toTypedArray()),\n            HtmlCompat.FROM_HTML_MODE_COMPACT\n        )");
        } else {
            throw new NoWhenBranchMatchedException();
        }
        textView.setText(charSequence);
        AvatarView avatarView = InvitedByFragment.O0(this.c).a;
        m0.n.b.i.d(avatarView, "binding.inviterImage");
        h1 h1Var2 = k1Var.a;
        h1.c cVar = h1.c.a;
        avatarView.setVisibility(m0.n.b.i.a(h1Var2, cVar) ^ true ? 0 : 8);
        TextView textView2 = InvitedByFragment.O0(this.c).b;
        m0.n.b.i.d(textView2, "binding.inviterName");
        if (!(!m0.n.b.i.a(k1Var.a, cVar))) {
            i = 8;
        }
        textView2.setVisibility(i);
        h1 h1Var3 = k1Var.a;
        if (h1Var3 instanceof h1.d) {
            String str4 = ((h1.d) h1Var3).a;
            InvitedByFragment.O0(this.c).b.setText(str4);
            InvitedByFragment.O0(this.c).a.setText(AvatarView.c.a(str4));
            AvatarView avatarView2 = InvitedByFragment.O0(this.c).a;
            m0.n.b.i.d(avatarView2, "binding.inviterImage");
            v.Q0(avatarView2, ((h1.d) k1Var.a).b);
        } else if (h1Var3 instanceof h1.a) {
            InvitedByFragment invitedByFragment = this.c;
            FragmentInvitedByBinding O0 = InvitedByFragment.O0(invitedByFragment);
            h1.a aVar = (h1.a) k1Var.a;
            InvitedByFragment.N0(invitedByFragment, O0, aVar.a, aVar.b);
        } else if (h1Var3 instanceof h1.b) {
            InvitedByFragment invitedByFragment2 = this.c;
            FragmentInvitedByBinding O02 = InvitedByFragment.O0(invitedByFragment2);
            h1.b bVar2 = (h1.b) k1Var.a;
            InvitedByFragment.N0(invitedByFragment2, O02, bVar2.b, bVar2.c);
        }
        return i.a;
    }
}
