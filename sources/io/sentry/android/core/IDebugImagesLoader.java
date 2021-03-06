package io.sentry.android.core;

import io.sentry.protocol.DebugImage;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public interface IDebugImagesLoader {
    void clearDebugImages();

    List<DebugImage> loadDebugImages();
}
