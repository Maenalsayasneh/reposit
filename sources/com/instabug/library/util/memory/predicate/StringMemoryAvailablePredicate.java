package com.instabug.library.util.memory.predicate;

public class StringMemoryAvailablePredicate extends MemoryAvailablePredicate {
    public final long b;

    public StringMemoryAvailablePredicate(String str) {
        this.b = str != null ? (long) str.length() : 0;
    }

    public boolean check() {
        long j = this.b;
        if (j == 0) {
            return true;
        }
        return isMemoryAvailable((j * 2) + 40);
    }

    public StringMemoryAvailablePredicate(long j) {
        this.b = j;
    }
}
