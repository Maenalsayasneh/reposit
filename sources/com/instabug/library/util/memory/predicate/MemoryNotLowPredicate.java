package com.instabug.library.util.memory.predicate;

import android.content.Context;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.memory.MemoryUtils;

public class MemoryNotLowPredicate extends Predicate {
    public boolean check() {
        Context context = this.a;
        if (context != null) {
            return !MemoryUtils.isLowMemory(context);
        }
        InstabugSDKLogger.w("MemoryNotLowPredicate", "MemoryNotLowPredicate is returning false due to a null context reference");
        return false;
    }
}
