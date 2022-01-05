package com.instabug.library.internal.video;

import android.annotation.SuppressLint;
import android.media.MediaMetadataRetriever;
import android.text.TextUtils;
import com.instabug.library.util.FileUtils;
import com.instabug.library.util.InstabugSDKLogger;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.io.IOException;

@SuppressFBWarnings({"RV_RETURN_VALUE_IGNORED_BAD_PRACTICE"})
public class InstabugVideoUtils {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final String TAG = "InstabugVideoUtils";

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0104, code lost:
        if (r9 == false) goto L_0x010d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011a  */
    @android.annotation.SuppressLint({"RESOURCE_LEAK"})
    @android.annotation.TargetApi(21)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void genVideoUsingMuxer(java.lang.String r16, java.lang.String r17, int r18, int r19, boolean r20, boolean r21) throws java.io.IOException {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.String r3 = "The muxer has been released!"
            java.lang.String r4 = "The muxer skip release/stop since it has no written frames"
            java.lang.String r5 = "InstabugVideoUtils"
            android.media.MediaExtractor r6 = new android.media.MediaExtractor
            r6.<init>()
            r6.setDataSource(r0)
            int r7 = r6.getTrackCount()
            android.media.MediaMuxer r8 = new android.media.MediaMuxer
            r9 = 0
            r10 = r17
            r8.<init>(r10, r9)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>(r7)
            r11 = -1
            r12 = r9
        L_0x0027:
            if (r12 >= r7) goto L_0x0071
            android.media.MediaFormat r14 = r6.getTrackFormat(r12)
            java.lang.String r15 = "mime"
            java.lang.String r15 = r14.getString(r15)
            java.lang.String r13 = "audio/"
            boolean r13 = r15.startsWith(r13)
            if (r13 == 0) goto L_0x003e
            if (r20 == 0) goto L_0x003e
            goto L_0x0048
        L_0x003e:
            java.lang.String r13 = "video/"
            boolean r13 = r15.startsWith(r13)
            if (r13 == 0) goto L_0x004a
            if (r21 == 0) goto L_0x004a
        L_0x0048:
            r13 = 1
            goto L_0x004b
        L_0x004a:
            r13 = r9
        L_0x004b:
            if (r13 == 0) goto L_0x006e
            r6.selectTrack(r12)
            int r13 = r8.addTrack(r14)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r10.put(r15, r13)
            java.lang.String r13 = "max-input-size"
            boolean r15 = r14.containsKey(r13)
            if (r15 == 0) goto L_0x006e
            int r13 = r14.getInteger(r13)
            if (r13 <= r11) goto L_0x006e
            r11 = r13
        L_0x006e:
            int r12 = r12 + 1
            goto L_0x0027
        L_0x0071:
            if (r11 >= 0) goto L_0x0075
            r11 = 4096(0x1000, float:5.74E-42)
        L_0x0075:
            android.media.MediaMetadataRetriever r7 = new android.media.MediaMetadataRetriever
            r7.<init>()
            r7.setDataSource(r0)
            r12 = 24
            java.lang.String r12 = r7.extractMetadata(r12)
            r7.release()
            if (r12 == 0) goto L_0x0091
            int r7 = java.lang.Integer.parseInt(r12)
            if (r7 < 0) goto L_0x0091
            r8.setOrientationHint(r7)
        L_0x0091:
            if (r1 <= 0) goto L_0x009a
            int r1 = r1 * 1000
            long r12 = (long) r1
            r1 = 2
            r6.seekTo(r12, r1)
        L_0x009a:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r11)
            android.media.MediaCodec$BufferInfo r7 = new android.media.MediaCodec$BufferInfo
            r7.<init>()
            r8.start()     // Catch:{ IllegalStateException -> 0x00ff }
            r11 = r9
        L_0x00a7:
            r7.offset = r9     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            int r12 = r6.readSampleData(r1, r9)     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            r7.size = r12     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            if (r12 >= 0) goto L_0x00b4
            r7.size = r9     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            goto L_0x00c3
        L_0x00b4:
            long r12 = r6.getSampleTime()     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            r7.presentationTimeUs = r12     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            if (r2 <= 0) goto L_0x00d1
            int r14 = r2 * 1000
            long r14 = (long) r14     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 <= 0) goto L_0x00d1
        L_0x00c3:
            r8.stop()     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            java.io.File r1 = new java.io.File     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            r1.delete()     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            if (r11 == 0) goto L_0x010d
            goto L_0x0106
        L_0x00d1:
            int r12 = r6.getSampleFlags()     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            r7.flags = r12     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            int r12 = r6.getSampleTrackIndex()     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            java.lang.Object r12 = r10.get(r12)     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            if (r12 == 0) goto L_0x00a7
            int r12 = r12.intValue()     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            r8.writeSampleData(r12, r1, r7)     // Catch:{ IllegalStateException -> 0x00fb, all -> 0x00f8 }
            r6.advance()     // Catch:{ IllegalStateException -> 0x00f6, all -> 0x00f3 }
            r11 = 1
            goto L_0x00a7
        L_0x00f3:
            r0 = move-exception
            r9 = 1
            goto L_0x0111
        L_0x00f6:
            r9 = 1
            goto L_0x00ff
        L_0x00f8:
            r0 = move-exception
            r9 = r11
            goto L_0x0111
        L_0x00fb:
            r9 = r11
            goto L_0x00ff
        L_0x00fd:
            r0 = move-exception
            goto L_0x0111
        L_0x00ff:
            java.lang.String r0 = "The source video file is malformed"
            com.instabug.library.util.InstabugSDKLogger.w(r5, r0)     // Catch:{ all -> 0x00fd }
            if (r9 == 0) goto L_0x010d
        L_0x0106:
            r8.release()
            com.instabug.library.util.InstabugSDKLogger.d(r5, r3)
            goto L_0x0110
        L_0x010d:
            com.instabug.library.util.InstabugSDKLogger.w(r5, r4)
        L_0x0110:
            return
        L_0x0111:
            if (r9 == 0) goto L_0x011a
            r8.release()
            com.instabug.library.util.InstabugSDKLogger.d(r5, r3)
            goto L_0x011d
        L_0x011a:
            com.instabug.library.util.InstabugSDKLogger.w(r5, r4)
        L_0x011d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.video.InstabugVideoUtils.genVideoUsingMuxer(java.lang.String, java.lang.String, int, int, boolean, boolean):void");
    }

    public static double[] getDimensInBounded(double d, double d2, double d3, double d4) {
        double round = (double) Math.round(d > d2 ? d / d2 : d2 / d);
        while (true) {
            if (d3 < d || d4 < d2) {
                d /= round;
                d2 /= round;
            } else {
                return new double[]{d, d2};
            }
        }
    }

    @SuppressLint({"RESOURCE_LEAK"})
    private static int getVideoDuration(String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        int i = 0;
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (!TextUtils.isEmpty(extractMetadata)) {
                i = Integer.parseInt(extractMetadata);
            }
        } catch (Exception e) {
            InstabugSDKLogger.e(TAG, String.format("Error: %s occurred during getting video file with path: %s duration", new Object[]{e.getMessage(), str}));
        } finally {
            mediaMetadataRetriever.release();
        }
        return i;
    }

    private static boolean isDurationMoreThanAutoRecMaxDuration(int i, int i2) {
        return i > i2;
    }

    public static File startTrim(File file, File file2, int i) throws IOException {
        int videoDuration;
        if (file == null || file.length() <= 0 || !FileUtils.isVideoFile(file) || (videoDuration = getVideoDuration(file.getPath())) == 0 || !isDurationMoreThanAutoRecMaxDuration(videoDuration, i)) {
            return file;
        }
        genVideoUsingMuxer(file.getPath(), file2.getPath(), videoDuration - i, videoDuration, false, true);
        return file2;
    }
}
