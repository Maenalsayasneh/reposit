package com.clubhouse.android.ui.clubs.invites;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.clubhouse.android.databinding.AddableListUserBinding;
import com.clubhouse.app.R;
import com.clubhouse.core.ui.databinding.ListUserAnatomyBinding;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: AddableListUser.kt */
public abstract class AddableListUser extends i0.e.b.f3.m.b.a<a> {
    public AddMethod m;
    public boolean n;
    public boolean o;
    public View.OnClickListener p;

    /* compiled from: AddableListUser.kt */
    public enum AddMethod {
        INVITE,
        NOMINATE
    }

    /* compiled from: AddableListUser.kt */
    public static final class a extends d {
        public AddableListUserBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            AddableListUserBinding bind = AddableListUserBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final AddableListUserBinding b() {
            AddableListUserBinding addableListUserBinding = this.b;
            if (addableListUserBinding != null) {
                return addableListUserBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* compiled from: AddableListUser.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            AddMethod.values();
            int[] iArr = new int[2];
            iArr[AddMethod.INVITE.ordinal()] = 1;
            iArr[AddMethod.NOMINATE.ordinal()] = 2;
            a = iArr;
        }
    }

    /* renamed from: M */
    public void k(a aVar) {
        i.e(aVar, "holder");
        Resources resources = aVar.b().a.getResources();
        AddMethod addMethod = this.m;
        int i = addMethod == null ? -1 : b.a[addMethod.ordinal()];
        boolean z = true;
        if (i == 1) {
            aVar.b().c.setText(resources.getString(R.string.invite));
            aVar.b().b.setText(resources.getString(R.string.invited));
        } else if (i == 2) {
            aVar.b().c.setText(resources.getString(R.string.nominate));
            aVar.b().b.setText(resources.getString(R.string.nominated));
        } else {
            throw new IllegalStateException("Must set an AddMethod to AddableListUser");
        }
        ListUserAnatomyBinding listUserAnatomyBinding = aVar.b().e;
        i.d(listUserAnatomyBinding, "holder.binding.user");
        K(listUserAnatomyBinding);
        ProgressBar progressBar = aVar.b().d;
        i.d(progressBar, "holder.binding.loading");
        k.L(progressBar, Boolean.valueOf(this.o));
        TextView textView = aVar.b().b;
        i.d(textView, "holder.binding.added");
        int i2 = 0;
        k.L(textView, Boolean.valueOf(!this.o && this.n));
        if (this.o || this.n) {
            z = false;
        }
        Button button = aVar.b().c;
        if (!z) {
            i2 = 4;
        }
        button.setVisibility(i2);
        Button button2 = aVar.b().c;
        i.d(button2, "holder.binding.button");
        k.H(button2, aVar.a, this.p);
    }
}
