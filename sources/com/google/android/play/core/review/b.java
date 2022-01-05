package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import i0.h.a.d.a.j.m;

public final class b extends ResultReceiver {
    public final /* synthetic */ m c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Handler handler, m mVar) {
        super(handler);
        this.c = mVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        this.c.b(null);
    }
}
