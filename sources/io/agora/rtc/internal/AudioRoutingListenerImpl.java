package io.agora.rtc.internal;

public class AudioRoutingListenerImpl implements AudioRoutingListener {
    private long mAudioRoutingNativeHandle = 0;

    public AudioRoutingListenerImpl(long j) {
        this.mAudioRoutingNativeHandle = j;
    }

    public native void nativeAudioRoutingChanged(long j, int i);

    public native void nativeAudioRoutingError(long j, int i);

    public void onAudioRoutingChanged(int i) {
        synchronized (this) {
            nativeAudioRoutingChanged(this.mAudioRoutingNativeHandle, i);
        }
    }

    public void onAudioRoutingDestroyed() {
        synchronized (this) {
            this.mAudioRoutingNativeHandle = 0;
        }
    }

    public void onAudioRoutingError(int i) {
        synchronized (this) {
            nativeAudioRoutingError(this.mAudioRoutingNativeHandle, i);
        }
    }
}
