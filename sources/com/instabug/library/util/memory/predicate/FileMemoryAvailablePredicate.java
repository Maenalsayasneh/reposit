package com.instabug.library.util.memory.predicate;

import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;

public abstract class FileMemoryAvailablePredicate extends MemoryAvailablePredicate {
    public final File file;

    public FileMemoryAvailablePredicate(File file2) {
        this.file = file2;
    }

    public abstract boolean a(File file2);

    public boolean check() {
        String str;
        File file2 = this.file;
        if (file2 == null || !file2.isFile() || !a(this.file)) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" is returning false due to ");
            File file3 = this.file;
            if (file3 == null) {
                str = "null file reference";
            } else {
                str = !file3.isFile() ? "the file object maybe representing a folder not a file" : "the file object is not a text file";
            }
            sb.append(str);
            InstabugSDKLogger.w(this, sb.toString());
            return false;
        }
        boolean isMemoryAvailable = isMemoryAvailable((this.file.length() * 2) + 40);
        InstabugSDKLogger.i(this, getClass().getSimpleName() + " is running test, results: " + isMemoryAvailable);
        return isMemoryAvailable;
    }
}
