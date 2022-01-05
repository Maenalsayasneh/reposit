package k0.c;

import io.sentry.DirectoryProcessor;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: lambda */
public final /* synthetic */ class a implements FilenameFilter {
    public final /* synthetic */ DirectoryProcessor a;

    public /* synthetic */ a(DirectoryProcessor directoryProcessor) {
        this.a = directoryProcessor;
    }

    public final boolean accept(File file, String str) {
        return this.a.isRelevantFileName(str);
    }
}
