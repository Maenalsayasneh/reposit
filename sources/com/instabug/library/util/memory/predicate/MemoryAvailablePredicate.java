package com.instabug.library.util.memory.predicate;

import android.content.Context;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.memory.MemoryUtils;

public abstract class MemoryAvailablePredicate extends Predicate {
    public boolean isMemoryAvailable(long j) {
        Context context = this.a;
        if (context == null) {
            InstabugSDKLogger.w("MemoryAvailablePredicate", "isMemoryAvailable is returning false due to a null context reference");
            return false;
        } else if (j < MemoryUtils.getFreeMemory(context)) {
            return true;
        } else {
            return false;
        }
    }
}
