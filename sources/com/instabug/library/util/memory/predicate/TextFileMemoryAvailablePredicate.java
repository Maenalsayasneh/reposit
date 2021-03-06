package com.instabug.library.util.memory.predicate;

import com.instabug.library.util.FileUtils;
import java.io.File;

public class TextFileMemoryAvailablePredicate extends FileMemoryAvailablePredicate {
    public TextFileMemoryAvailablePredicate(File file) {
        super(file);
    }

    public boolean a(File file) {
        return FileUtils.isTextFile(this.file);
    }
}
