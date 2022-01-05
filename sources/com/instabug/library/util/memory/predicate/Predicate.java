package com.instabug.library.util.memory.predicate;

import android.content.Context;

public abstract class Predicate {
    public Context a;

    public abstract boolean check();

    public void setContext(Context context) {
        this.a = context;
    }
}
