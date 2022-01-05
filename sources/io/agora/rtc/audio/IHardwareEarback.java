package io.agora.rtc.audio;

public interface IHardwareEarback {
    void destroy();

    int enableEarbackFeature(boolean z);

    void initialize();

    boolean isHardwareEarbackSupported();

    int setHardwareEarbackVolume(int i);
}
