package com.clubhouse.android.ui.events.creation;

import android.widget.TextView;
import com.clubhouse.app.R;
import i0.e.b.g3.o.w0.w;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: AddEditEventFragment.kt */
public final class AddEditEventFragment$updateRemainingDescription$1 extends Lambda implements l<w, i> {
    public final /* synthetic */ String c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ AddEditEventFragment q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEditEventFragment$updateRemainingDescription$1(String str, TextView textView, AddEditEventFragment addEditEventFragment) {
        super(1);
        this.c = str;
        this.d = textView;
        this.q = addEditEventFragment;
    }

    public Object invoke(Object obj) {
        w wVar = (w) obj;
        m0.n.b.i.e(wVar, "state");
        int length = wVar.f - this.c.length();
        if (length >= 0) {
            this.d.setText(this.q.getResources().getQuantityString(R.plurals.characters_remaining, length, new Object[]{Integer.valueOf(length)}));
            this.d.setTextColor(this.q.getResources().getColor(R.color.clubhouse_remaining_color));
        } else {
            int i = -length;
            this.d.setText(this.q.getResources().getQuantityString(R.plurals.characters_over_limit, i, new Object[]{Integer.valueOf(i)}));
            this.d.setTextColor(this.q.getResources().getColor(R.color.clubhouse_red));
        }
        return i.a;
    }
}
