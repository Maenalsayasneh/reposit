package com.instabug.library.model.common;

public interface Session {
    String getAppVersion();

    String getId();

    String getOs();

    long getStartNanoTime();

    long getStartTimestampMicros();

    String getUuid();
}
