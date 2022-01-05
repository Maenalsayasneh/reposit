package io.agora.rtc.audio;

import androidx.recyclerview.widget.RecyclerView;
import i0.d.a.a.a;

public class AudioParams {
    public int channel = 1;
    public int mode = 0;
    public int sampleRate = 16000;
    public int samplesPerCall = RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE;

    public AudioParams(int i, int i2, int i3, int i4) {
        this.sampleRate = i;
        this.channel = i2;
        this.mode = i3;
        this.samplesPerCall = i4;
    }

    public String toString() {
        StringBuilder P0 = a.P0("AudioParams{sampleRate=");
        P0.append(this.sampleRate);
        P0.append(", channel=");
        P0.append(this.channel);
        P0.append(", mode=");
        P0.append(this.mode);
        P0.append(", samplesPerCall=");
        return a.s0(P0, this.samplesPerCall, '}');
    }
}
