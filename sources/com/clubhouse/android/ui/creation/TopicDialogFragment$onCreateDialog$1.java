package com.clubhouse.android.ui.creation;

import com.clubhouse.android.databinding.DialogEditTextBinding;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.n.m;
import i0.e.b.g3.n.n;
import i0.e.b.g3.n.t;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.k;

/* compiled from: TopicDialogFragment.kt */
public final class TopicDialogFragment$onCreateDialog$1 extends Lambda implements l<t, d> {
    public final /* synthetic */ TopicDialogFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopicDialogFragment$onCreateDialog$1(TopicDialogFragment topicDialogFragment) {
        super(1);
        this.c = topicDialogFragment;
    }

    public Object invoke(Object obj) {
        String str;
        t tVar = (t) obj;
        i.e(tVar, "state");
        DialogEditTextBinding inflate = DialogEditTextBinding.inflate(this.c.getLayoutInflater());
        inflate.b.setText(tVar.e);
        i.d(inflate, "inflate(layoutInflater).apply {\n                text.setText(state.topic)\n            }");
        d.a aVar = new d.a(this.c.requireContext(), 2132017388);
        TopicDialogFragment topicDialogFragment = this.c;
        k<Object>[] kVarArr = TopicDialogFragment.j2;
        Objects.requireNonNull(topicDialogFragment);
        String str2 = tVar.e;
        boolean z = false;
        if (str2 == null || str2.length() == 0) {
            str = topicDialogFragment.getString(R.string.add_a_title);
            i.d(str, "getString(R.string.add_a_title)");
        } else {
            str = topicDialogFragment.getString(R.string.edit_title);
            i.d(str, "getString(R.string.edit_title)");
        }
        aVar.a.d = str;
        TopicDialogFragment topicDialogFragment2 = this.c;
        Objects.requireNonNull(topicDialogFragment2);
        String str3 = tVar.e;
        if (str3 == null || str3.length() == 0) {
            z = true;
        }
        aVar.a.f = z ? topicDialogFragment2.getString(R.string.topic_example) : null;
        aVar.f(inflate.a);
        aVar.c(R.string.cancel, new m(this.c));
        aVar.d(R.string.set_title, new n(this.c, inflate));
        return aVar.a();
    }
}
