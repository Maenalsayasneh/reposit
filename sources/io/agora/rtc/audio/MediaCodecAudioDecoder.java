package io.agora.rtc.audio;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.Surface;
import android.webkit.URLUtil;
import com.pubnub.api.vendor.FileEncryptionUtil;
import i0.d.a.a.a;
import io.agora.rtc.internal.Logging;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class MediaCodecAudioDecoder {
    private static final int EXTRACTOR_TIMEOUT_MS = 6000;
    private static final int HTTP_REQUEST_TIMEOUT = 400;
    private static final int MAX_DECODER_RETRY_COUNT = 300;
    private static final String PREFIX_ASSETS = "/assets/";
    private static final String PREFIX_DOCUMENT = "content://";
    private static final String TAG = "MediaCodec Audio Decoder";
    private boolean eoInputStream = false;
    private boolean eoOutputStream = false;
    private MediaCodec mAACDecoder = null;
    private ByteBuffer mAACOutputBuffer = ByteBuffer.allocateDirect(4096);
    private int mChannels = 2;
    /* access modifiers changed from: private */
    public Context mContext = null;
    private boolean mDecodedDataReady = false;
    private ByteBuffer mDecodedRAWBuffer;
    private MediaExtractorWrapper mExtractor = null;
    private long mFileLength;
    private ByteBuffer[] mInputBuffers;
    private MediaCodec mMediaCodec = null;
    private ByteBuffer[] mOutputBuffers;
    private int mRetryCount = 0;
    private int mSampleRate = 44100;
    private MediaFormat mTrackFormat = null;

    public class MediaExtractorWrapper {
        /* access modifiers changed from: private */
        public final CountDownLatch countDownLatch = new CountDownLatch(1);
        /* access modifiers changed from: private */
        public final Handler mHandler;
        /* access modifiers changed from: private */
        public final MediaExtractor mMediaExtractor = new MediaExtractor();
        /* access modifiers changed from: private */
        public volatile boolean mPrepared;
        /* access modifiers changed from: private */
        public final String threadName;

        public MediaExtractorWrapper() {
            StringBuilder P0 = a.P0("MediaExtractor-");
            P0.append(new Random().nextInt());
            String sb = P0.toString();
            this.threadName = sb;
            HandlerThread handlerThread = new HandlerThread(sb);
            handlerThread.start();
            this.mHandler = new Handler(handlerThread.getLooper());
        }

        /* access modifiers changed from: private */
        public boolean setDataSource(final String str) throws InterruptedException {
            Logging.d(MediaCodecAudioDecoder.TAG, "setDataSource()");
            final boolean startsWith = str.startsWith(MediaCodecAudioDecoder.PREFIX_ASSETS);
            final boolean startsWith2 = str.startsWith(MediaCodecAudioDecoder.PREFIX_DOCUMENT);
            this.mHandler.post(new Runnable() {
                public void run() {
                    StringBuilder P0 = a.P0("setDataSource in thread ");
                    P0.append(MediaExtractorWrapper.this.threadName);
                    Logging.d(MediaCodecAudioDecoder.TAG, P0.toString());
                    try {
                        if (startsWith && MediaCodecAudioDecoder.this.mContext != null) {
                            AssetFileDescriptor openFd = MediaCodecAudioDecoder.this.mContext.getAssets().openFd(str.substring(8));
                            MediaExtractorWrapper.this.mMediaExtractor.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                        } else if (!startsWith2 || MediaCodecAudioDecoder.this.mContext == null) {
                            MediaExtractorWrapper.this.mMediaExtractor.setDataSource(str);
                        } else {
                            MediaExtractorWrapper.this.mMediaExtractor.setDataSource(MediaCodecAudioDecoder.this.mContext.getContentResolver().openFileDescriptor(Uri.parse(str), "r").getFileDescriptor());
                        }
                        boolean unused = MediaExtractorWrapper.this.mPrepared = true;
                    } catch (Exception unused2) {
                        Logging.w(MediaCodecAudioDecoder.TAG, "setDataSource fail");
                    }
                    MediaExtractorWrapper.this.countDownLatch.countDown();
                }
            });
            this.countDownLatch.await(6000, TimeUnit.MILLISECONDS);
            return this.mPrepared;
        }

        public void advance() {
            checkPrepared();
            this.mMediaExtractor.advance();
        }

        public void checkPrepared() {
            if (!this.mPrepared) {
                throw new IllegalStateException("mMediaExtractor hasn't prepared");
            }
        }

        public int getSampleFlags() {
            checkPrepared();
            return this.mMediaExtractor.getSampleFlags();
        }

        public long getSampleTime() {
            checkPrepared();
            return this.mMediaExtractor.getSampleTime();
        }

        public int getTrackCount() {
            checkPrepared();
            return this.mMediaExtractor.getTrackCount();
        }

        public MediaFormat getTrackFormat(int i) {
            checkPrepared();
            return this.mMediaExtractor.getTrackFormat(i);
        }

        public int readSampleData(ByteBuffer byteBuffer, int i) {
            checkPrepared();
            return this.mMediaExtractor.readSampleData(byteBuffer, i);
        }

        public void release() {
            Logging.d(MediaCodecAudioDecoder.TAG, "release()");
            this.mHandler.post(new Runnable() {
                public void run() {
                    if (MediaExtractorWrapper.this.mMediaExtractor != null) {
                        MediaExtractorWrapper.this.mMediaExtractor.release();
                    }
                    MediaExtractorWrapper.this.mHandler.getLooper().quit();
                    Logging.d(MediaCodecAudioDecoder.TAG, "mediaExtractor released in thread " + MediaExtractorWrapper.this.threadName);
                }
            });
        }

        public void seekTo(long j, int i) {
            checkPrepared();
            this.mMediaExtractor.seekTo(j, i);
        }

        public void selectTrack(int i) {
            checkPrepared();
            this.mMediaExtractor.selectTrack(i);
        }

        public void unselectTrack(int i) {
            checkPrepared();
            this.mMediaExtractor.unselectTrack(i);
        }
    }

    private boolean checkInfoChange() {
        boolean z;
        try {
            MediaFormat outputFormat = this.mMediaCodec.getOutputFormat();
            int integer = outputFormat.getInteger("sample-rate");
            if (integer == 22050) {
                integer = 22000;
            } else if (integer == 11025) {
                integer = 11000;
            }
            int integer2 = outputFormat.getInteger("channel-count");
            if (this.mSampleRate == integer) {
                if (this.mChannels == integer2) {
                    z = false;
                    this.mSampleRate = integer;
                    this.mChannels = integer2;
                    return z;
                }
            }
            z = true;
            this.mSampleRate = integer;
            this.mChannels = integer2;
            return z;
        } catch (Exception e) {
            Logging.e(TAG, "Error when checking file's new format");
            e.printStackTrace();
            return false;
        }
    }

    private void cloneByteBuffer(ByteBuffer byteBuffer) {
        try {
            ByteBuffer byteBuffer2 = this.mDecodedRAWBuffer;
            if (byteBuffer2 == null || byteBuffer2.limit() != byteBuffer.limit()) {
                ByteBuffer byteBuffer3 = this.mDecodedRAWBuffer;
                if (byteBuffer3 != null) {
                    byteBuffer3.clear();
                    this.mDecodedRAWBuffer = null;
                }
                this.mDecodedRAWBuffer = ByteBuffer.allocateDirect(byteBuffer.limit());
            }
            this.mDecodedRAWBuffer.position(0);
            this.mDecodedRAWBuffer.put(byteBuffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cloneByteBufferByLength(ByteBuffer byteBuffer, int i) {
        try {
            ByteBuffer byteBuffer2 = this.mDecodedRAWBuffer;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i) {
                ByteBuffer byteBuffer3 = this.mDecodedRAWBuffer;
                if (byteBuffer3 != null) {
                    byteBuffer3.clear();
                    this.mDecodedRAWBuffer = null;
                }
                this.mDecodedRAWBuffer = ByteBuffer.allocateDirect(i);
            }
            this.mDecodedRAWBuffer.position(0);
            byteBuffer.limit(i);
            this.mDecodedRAWBuffer.put(byteBuffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String encodeUrl(String str) {
        Logging.d(TAG, "encodedUrl()");
        try {
            URL url = new URL(str);
            return new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toASCIIString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r4 != null) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean testNetworkUrlAvailable(java.lang.String r4) {
        /*
            java.lang.String r0 = "MediaCodec Audio Decoder"
            java.lang.String r1 = "testNetworkUrlAvailable encodedUrl"
            io.agora.rtc.internal.Logging.d(r0, r1)
            r0 = 0
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x0039, all -> 0x0037 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0039, all -> 0x0037 }
            java.net.URLConnection r4 = r2.openConnection()     // Catch:{ Exception -> 0x0039, all -> 0x0037 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Exception -> 0x0039, all -> 0x0037 }
            r1 = 400(0x190, float:5.6E-43)
            r4.setConnectTimeout(r1)     // Catch:{ Exception -> 0x0035 }
            r4.setReadTimeout(r1)     // Catch:{ Exception -> 0x0035 }
            r4.getResponseCode()     // Catch:{ Exception -> 0x0035 }
            int r1 = r4.getResponseCode()     // Catch:{ Exception -> 0x0035 }
            r2 = 404(0x194, float:5.66E-43)
            if (r1 == r2) goto L_0x0028
            r0 = 1
        L_0x0028:
            java.io.InputStream r1 = r4.getInputStream()     // Catch:{ Exception -> 0x0035 }
            if (r1 == 0) goto L_0x0031
            r1.close()     // Catch:{ Exception -> 0x0035 }
        L_0x0031:
            r4.disconnect()
            goto L_0x0043
        L_0x0035:
            r1 = move-exception
            goto L_0x003d
        L_0x0037:
            r0 = move-exception
            goto L_0x0046
        L_0x0039:
            r4 = move-exception
            r3 = r1
            r1 = r4
            r4 = r3
        L_0x003d:
            r1.printStackTrace()     // Catch:{ all -> 0x0044 }
            if (r4 == 0) goto L_0x0043
            goto L_0x0031
        L_0x0043:
            return r0
        L_0x0044:
            r0 = move-exception
            r1 = r4
        L_0x0046:
            if (r1 == 0) goto L_0x004b
            r1.disconnect()
        L_0x004b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.audio.MediaCodecAudioDecoder.testNetworkUrlAvailable(java.lang.String):boolean");
    }

    public boolean checkAACSupported() {
        try {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
                if (!mediaCodecInfo.isEncoder()) {
                    if (mediaCodecInfo.getName().toLowerCase().contains("nvidia")) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "Error when checking aac codec availability");
            e.printStackTrace();
            return false;
        }
    }

    public boolean checkUrlEncoded(String str) {
        try {
            return !TextUtils.equals(str, URLDecoder.decode(str, FileEncryptionUtil.ENCODING_UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean createAACStreaming(int i) {
        try {
            this.mAACDecoder = MediaCodec.createDecoderByType("audio/mp4a-latm");
            MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, 1);
            createAudioFormat.setInteger("sample-rate", i);
            createAudioFormat.setInteger("channel-count", 1);
            createAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(new byte[]{18, -120}));
            this.mAACDecoder.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 0);
            MediaCodec mediaCodec = this.mAACDecoder;
            if (mediaCodec != null) {
                mediaCodec.start();
            }
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "Error when creating aac decode stream");
            e.printStackTrace();
            return false;
        }
    }

    public boolean createStreaming(String str) {
        try {
            Logging.i(TAG, "Try to decode audio file : " + str);
            this.mRetryCount = 0;
            if (TextUtils.isEmpty(str)) {
                Logging.w(TAG, "Fail to open, empty url");
                return false;
            }
            if (URLUtil.isNetworkUrl(str)) {
                String encodeUrl = checkUrlEncoded(str) ? str : encodeUrl(str);
                if (encodeUrl == null || !testNetworkUrlAvailable(encodeUrl)) {
                    Logging.w(TAG, "Fail to open, 404 for url");
                    return false;
                }
            }
            MediaExtractorWrapper mediaExtractorWrapper = new MediaExtractorWrapper();
            this.mExtractor = mediaExtractorWrapper;
            if (!mediaExtractorWrapper.setDataSource(str)) {
                Logging.w(TAG, "Failed to setDataSource");
                releaseStreaming();
                return false;
            }
            int trackCount = this.mExtractor.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                this.mExtractor.unselectTrack(i);
            }
            int i2 = 0;
            while (true) {
                if (i2 >= trackCount) {
                    break;
                }
                MediaFormat trackFormat = this.mExtractor.getTrackFormat(i2);
                this.mTrackFormat = trackFormat;
                String string = trackFormat.getString("mime");
                this.mTrackFormat.setInteger("pcm-encoding", 2);
                if (string.contains("audio/")) {
                    this.mExtractor.selectTrack(i2);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(string);
                    this.mMediaCodec = createDecoderByType;
                    createDecoderByType.configure(this.mTrackFormat, (Surface) null, (MediaCrypto) null, 0);
                    break;
                }
                i2++;
            }
            MediaCodec mediaCodec = this.mMediaCodec;
            if (mediaCodec != null) {
                mediaCodec.start();
            }
            this.mChannels = this.mTrackFormat.getInteger("channel-count");
            int integer = this.mTrackFormat.getInteger("sample-rate");
            this.mSampleRate = integer;
            if (integer == 22050) {
                this.mSampleRate = 22000;
            } else if (integer == 11025) {
                this.mSampleRate = 11000;
            }
            this.mFileLength = this.mTrackFormat.getLong("durationUs");
            return true;
        } catch (Exception e) {
            Logging.e(TAG, "Error when creating aac audio file decoder");
            e.printStackTrace();
            return false;
        }
    }

    public int decodeAACFrame(byte[] bArr) {
        int i = 0;
        try {
            int dequeueInputBuffer = this.mAACDecoder.dequeueInputBuffer(200);
            if (dequeueInputBuffer >= 0) {
                ByteBuffer inputBuffer = this.mAACDecoder.getInputBuffer(dequeueInputBuffer);
                inputBuffer.clear();
                inputBuffer.put(bArr);
                this.mAACDecoder.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, 0, 0);
            }
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.mAACDecoder.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 || dequeueOutputBuffer == -2 || dequeueOutputBuffer == -1 || dequeueOutputBuffer < 0) {
                return 0;
            }
            ByteBuffer outputBuffer = this.mAACDecoder.getOutputBuffer(dequeueOutputBuffer);
            int i2 = bufferInfo.size;
            try {
                this.mAACOutputBuffer.position(0);
                outputBuffer.limit(i2);
                this.mAACOutputBuffer.put(outputBuffer);
                this.mAACDecoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                return i2;
            } catch (Exception e) {
                Exception exc = e;
                i = i2;
                e = exc;
                Logging.e(TAG, "Error when decoding aac stream");
                e.printStackTrace();
                return i;
            }
        } catch (Exception e2) {
            e = e2;
            Logging.e(TAG, "Error when decoding aac stream");
            e.printStackTrace();
            return i;
        }
    }

    public boolean decodeFrame() {
        int dequeueInputBuffer;
        int i;
        try {
            if (!this.eoInputStream && (dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(0)) >= 0) {
                int readSampleData = this.mExtractor.readSampleData(this.mMediaCodec.getInputBuffer(dequeueInputBuffer), 0);
                if (readSampleData <= 0) {
                    this.eoInputStream = true;
                    i = 0;
                } else {
                    i = readSampleData;
                }
                long sampleTime = this.mExtractor.getSampleTime();
                int sampleFlags = this.mExtractor.getSampleFlags();
                if (this.eoInputStream) {
                    sampleFlags |= 4;
                }
                this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, i, sampleTime, sampleFlags);
                this.mExtractor.advance();
            }
            if (!this.eoOutputStream) {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                int dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(bufferInfo, 0);
                this.mDecodedDataReady = false;
                if (!(dequeueOutputBuffer == -3 || dequeueOutputBuffer == -2)) {
                    if (dequeueOutputBuffer != -1) {
                        this.mRetryCount = 0;
                        if (dequeueOutputBuffer >= 0) {
                            if ((bufferInfo.flags & 4) == 4) {
                                this.eoOutputStream = true;
                            }
                            cloneByteBuffer(this.mMediaCodec.getOutputBuffer(dequeueOutputBuffer));
                            this.mMediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                            this.mDecodedDataReady = true;
                        }
                    } else {
                        int i2 = this.mRetryCount + 1;
                        this.mRetryCount = i2;
                        if (i2 >= MAX_DECODER_RETRY_COUNT) {
                            Logging.e(TAG, "EAGAIN count=" + this.mRetryCount + " presentationTimeUs=" + bufferInfo.presentationTimeUs + " totalUs=" + this.mFileLength + " Force EOS");
                            this.eoOutputStream = true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            Logging.e(TAG, "Error when decoding audio file stream");
            e.printStackTrace();
        }
        return this.eoOutputStream;
    }

    public int getChannelCount() {
        return this.mChannels;
    }

    public long getCurrentFilePosition() {
        return this.mExtractor.getSampleTime();
    }

    public boolean getDecodeDataReadyFlag() {
        return this.mDecodedDataReady;
    }

    public long getFileLength() {
        return this.mFileLength;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public void releaseAACStreaming() {
        try {
            MediaCodec mediaCodec = this.mAACDecoder;
            if (mediaCodec != null) {
                mediaCodec.stop();
                this.mAACDecoder.release();
                this.mAACDecoder = null;
            }
        } catch (Exception e) {
            Logging.e(TAG, "Error when releasing aac decode stream");
            e.printStackTrace();
        }
    }

    public void releaseStreaming() {
        try {
            MediaCodec mediaCodec = this.mMediaCodec;
            if (mediaCodec != null) {
                try {
                    mediaCodec.stop();
                } catch (Exception e) {
                    Logging.e(TAG, "Media decoder stop failed", e);
                }
                try {
                    this.mMediaCodec.release();
                } catch (Exception e2) {
                    Logging.e(TAG, "Media decoder release failed", e2);
                }
                this.mMediaCodec = null;
            }
            MediaExtractorWrapper mediaExtractorWrapper = this.mExtractor;
            if (mediaExtractorWrapper != null) {
                mediaExtractorWrapper.release();
                this.mExtractor = null;
            }
        } catch (Exception e3) {
            Logging.e(TAG, "Error when releasing audio file stream");
            e3.printStackTrace();
        }
        this.eoOutputStream = false;
        this.eoInputStream = false;
    }

    public void rewindStreaming() {
        try {
            this.mExtractor.seekTo(0, 1);
            this.mMediaCodec.flush();
        } catch (Exception e) {
            Logging.e(TAG, "Error when rewinding audio file stream");
            e.printStackTrace();
        }
        this.eoInputStream = false;
        this.eoOutputStream = false;
        this.mDecodedDataReady = false;
    }

    public void setCurrentFilePosition(long j) {
        this.mExtractor.seekTo(j, 2);
    }
}
