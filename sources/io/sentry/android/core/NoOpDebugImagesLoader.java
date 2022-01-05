package io.sentry.android.core;

import io.sentry.protocol.DebugImage;
import java.util.List;

public final class NoOpDebugImagesLoader implements IDebugImagesLoader {
    private static final NoOpDebugImagesLoader instance = new NoOpDebugImagesLoader();

    private NoOpDebugImagesLoader() {
    }

    public static NoOpDebugImagesLoader getInstance() {
        return instance;
    }

    public void clearDebugImages() {
    }

    public List<DebugImage> loadDebugImages() {
        return null;
    }
}
