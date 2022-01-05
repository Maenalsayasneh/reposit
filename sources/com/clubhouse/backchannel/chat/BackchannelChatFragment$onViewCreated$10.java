package com.clubhouse.backchannel.chat;

import android.widget.EditText;
import com.clubhouse.backchannel.R;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;
import m0.r.k;

/* compiled from: BackchannelChatFragment.kt */
public final class BackchannelChatFragment$onViewCreated$10 extends Lambda implements p<Boolean, Integer, i> {
    public final /* synthetic */ BackchannelChatFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatFragment$onViewCreated$10(BackchannelChatFragment backchannelChatFragment) {
        super(2);
        this.c = backchannelChatFragment;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        if (booleanValue) {
            BackchannelChatFragment backchannelChatFragment = this.c;
            k<Object>[] kVarArr = BackchannelChatFragment.Z1;
            EditText editText = backchannelChatFragment.O0().f;
            m0.n.b.i.d(editText, "binding.composer");
            i0.e.b.d3.k.G(editText, intValue);
            this.c.O0().e.scrollToPosition(0);
        } else {
            BackchannelChatFragment backchannelChatFragment2 = this.c;
            k<Object>[] kVarArr2 = BackchannelChatFragment.Z1;
            EditText editText2 = backchannelChatFragment2.O0().f;
            m0.n.b.i.d(editText2, "binding.composer");
            i0.e.b.d3.k.G(editText2, this.c.getResources().getDimensionPixelSize(R.dimen.composer_bottom_margin));
        }
        return i.a;
    }
}
