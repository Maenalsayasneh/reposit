package com.airbnb.epoxy;

import android.os.Handler;
import i0.b.a.n;
import i0.b.a.o;

public abstract class AsyncEpoxyController extends o {
    public AsyncEpoxyController() {
        this(true);
    }

    private static Handler getHandler(boolean z) {
        return z ? n.b() : n.a;
    }

    public AsyncEpoxyController(boolean z) {
        this(z, z);
    }

    public AsyncEpoxyController(boolean z, boolean z2) {
        super(getHandler(z), getHandler(z2));
    }
}
