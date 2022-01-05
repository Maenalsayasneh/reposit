package i0.j.e.l0.m.l;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;

@TargetApi(21)
/* compiled from: VideoEncoder */
public class k extends c {
    public j e;
    public Surface f;

    public k(j jVar) {
        super(jVar.d);
        this.e = jVar;
    }

    public MediaFormat a() {
        j jVar = this.e;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", jVar.a, jVar.b);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", 8000000);
        createVideoFormat.setInteger("frame-rate", 30);
        createVideoFormat.setInteger("i-frame-interval", 5);
        createVideoFormat.setInteger("profile", 1);
        createVideoFormat.setInteger("level", 2);
        return createVideoFormat;
    }

    public void b(MediaCodec mediaCodec) {
        this.f = mediaCodec.createInputSurface();
        StringBuilder P0 = a.P0("VideoEncoder create input surface: ");
        P0.append(this.f);
        InstabugSDKLogger.i(this, P0.toString());
    }
}
