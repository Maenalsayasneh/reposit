package i0.j.e.l0.m.l;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.instabug.library.internal.video.InstabugVideoUtils;
import i0.d.a.a.a;

@TargetApi(21)
/* compiled from: VideoEncodeConfig */
public class j {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public MediaCodecInfo e;

    public j(int i, int i2, int i3) {
        double[] dArr;
        double d2 = (double) i;
        double d3 = (double) i2;
        MediaCodecInfo a2 = a("OMX.MTK.VIDEO.ENCODER.AVC");
        if (a2 != null) {
            MediaCodecInfo.VideoCapabilities videoCapabilities = a2.getCapabilitiesForType("video/avc").getVideoCapabilities();
            dArr = InstabugVideoUtils.getDimensInBounded(d2, d3, (double) videoCapabilities.getSupportedWidths().getUpper().intValue(), (double) videoCapabilities.getSupportedHeights().getUpper().intValue());
        } else {
            dArr = new double[]{0.0d, 0.0d};
        }
        this.a = (int) dArr[0];
        this.b = (int) dArr[1];
        this.d = a("OMX.MTK.VIDEO.ENCODER.AVC") != null ? a("OMX.MTK.VIDEO.ENCODER.AVC").getName() : "";
        this.c = i3;
    }

    public final MediaCodecInfo a(String str) {
        MediaCodecInfo mediaCodecInfo;
        if (this.e == null) {
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            int length = codecInfos.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    mediaCodecInfo = null;
                    break;
                }
                mediaCodecInfo = codecInfos[i];
                if (mediaCodecInfo.isEncoder()) {
                    try {
                        if (mediaCodecInfo.getCapabilitiesForType("video/avc") != null) {
                            break;
                        }
                    } catch (IllegalArgumentException unused) {
                        continue;
                    }
                }
                i++;
            }
            this.e = mediaCodecInfo;
        }
        return this.e;
    }

    public String toString() {
        StringBuilder P0 = a.P0("VideoEncodeConfig{width=");
        P0.append(this.a);
        P0.append(", height=");
        P0.append(this.b);
        P0.append(", bitrate=");
        P0.append(8000000);
        P0.append(", framerate=");
        P0.append(30);
        P0.append(", iframeInterval=");
        P0.append(5);
        P0.append(", codecName='");
        P0.append(this.d);
        P0.append('\'');
        P0.append(", mimeType='");
        P0.append("video/avc");
        P0.append('\'');
        P0.append('}');
        return P0.toString();
    }
}
