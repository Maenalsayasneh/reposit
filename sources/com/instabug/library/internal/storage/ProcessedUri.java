package com.instabug.library.internal.storage;

import android.net.Uri;

public class ProcessedUri {
    private final boolean isUriEncrypted;
    private final Uri uri;

    public ProcessedUri(Uri uri2, boolean z) {
        this.uri = uri2;
        this.isUriEncrypted = z;
    }

    public Uri getUri() {
        return this.uri;
    }

    public boolean isUriEncrypted() {
        return this.isUriEncrypted;
    }
}
