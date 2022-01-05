package k0.c.x;

import io.sentry.cache.EnvelopeCache;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: lambda */
public final /* synthetic */ class b implements FilenameFilter {
    public static final /* synthetic */ b a = new b();

    public final boolean accept(File file, String str) {
        String str2 = EnvelopeCache.SUFFIX_ENVELOPE_FILE;
        return str.endsWith(EnvelopeCache.SUFFIX_ENVELOPE_FILE);
    }
}
