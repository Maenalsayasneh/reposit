package com.instabug.library.util.memory;

import android.content.Context;
import com.instabug.library.util.memory.predicate.Predicate;

public class MemoryGuard {
    public final Context a;

    public MemoryGuard(Context context) {
        this.a = context;
    }

    public static MemoryGuard from(Context context) {
        return new MemoryGuard(context);
    }

    public ActionExecutor withPredicate(Predicate predicate) {
        predicate.setContext(this.a);
        return new ActionExecutor(predicate);
    }

    public ActionExecutor withPredicates(Predicate... predicateArr) {
        for (Predicate context : predicateArr) {
            context.setContext(this.a);
        }
        return new ActionExecutor(predicateArr);
    }
}
