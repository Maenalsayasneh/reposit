package io.agora.rtc.internal;

public interface AudioRoutingListener {
    void onAudioRoutingChanged(int i);

    void onAudioRoutingDestroyed();

    void onAudioRoutingError(int i);
}
