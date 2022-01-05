package com.clubhouse.android.ui.creation;

import com.clubhouse.android.databinding.CreateChannelEventCellBinding;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: CreateChannelFragment.kt */
public final class CreateChannelFragment$eventBinding$2 extends Lambda implements a<CreateChannelEventCellBinding> {
    public final /* synthetic */ CreateChannelFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateChannelFragment$eventBinding$2(CreateChannelFragment createChannelFragment) {
        super(0);
        this.c = createChannelFragment;
    }

    public Object invoke() {
        return CreateChannelEventCellBinding.inflate(this.c.getLayoutInflater());
    }
}
