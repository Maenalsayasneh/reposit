package i0.j.e.l0.m.l;

import android.media.MediaFormat;
import java.util.Objects;

/* compiled from: AudioEncoder */
public class b extends c {
    public final a e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super("OMX.google.aac.encoder");
        Objects.requireNonNull(aVar);
        this.e = aVar;
    }

    public MediaFormat a() {
        Objects.requireNonNull(this.e);
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 44100, 2);
        createAudioFormat.setInteger("aac-profile", 1);
        createAudioFormat.setInteger("bitrate", 80000);
        return createAudioFormat;
    }
}
