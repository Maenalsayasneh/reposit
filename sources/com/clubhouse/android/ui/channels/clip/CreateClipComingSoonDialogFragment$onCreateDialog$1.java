package com.clubhouse.android.ui.channels.clip;

import android.widget.TextView;
import com.clubhouse.android.databinding.DialogCreateClipComingSoonBinding;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.k.u0.c;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: CreateClipComingSoonDialogFragment.kt */
public final class CreateClipComingSoonDialogFragment$onCreateDialog$1 extends Lambda implements l<i0.e.b.z2.g.l, d> {
    public final /* synthetic */ CreateClipComingSoonDialogFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateClipComingSoonDialogFragment$onCreateDialog$1(CreateClipComingSoonDialogFragment createClipComingSoonDialogFragment) {
        super(1);
        this.c = createClipComingSoonDialogFragment;
    }

    public Object invoke(Object obj) {
        i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        i.e(lVar, "state");
        DialogCreateClipComingSoonBinding inflate = DialogCreateClipComingSoonBinding.inflate(this.c.getLayoutInflater());
        i.d(inflate, "inflate(layoutInflater)");
        inflate.c.setText(lVar.V ? R.string.create_clip_coming_soon_disable_clips : R.string.create_clip_coming_soon_got_it);
        inflate.c.setOnClickListener(new c(lVar, this.c));
        TextView textView = inflate.b;
        CreateClipComingSoonDialogFragment createClipComingSoonDialogFragment = this.c;
        textView.setPaintFlags(textView.getPaintFlags() | 8);
        textView.setOnClickListener(new i0.e.b.g3.k.u0.d(createClipComingSoonDialogFragment));
        d.a aVar = new d.a(this.c.requireContext(), 2132017388);
        aVar.f(inflate.a);
        aVar.a.k = true;
        return aVar.a();
    }
}
