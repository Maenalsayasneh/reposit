package io.agora.rtc.audio;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.os.Process;
import i0.d.a.a.a;
import io.agora.rtc.internal.Logging;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantLock;

public class AudioDevice {
    public final String TAG = "AudioDevice Java";
    private final int _MaxRecPlay10msBlocks = 4;
    private AudioManager _audioManager;
    private AudioRecord _audioRecord = null;
    private AudioTrack _audioTrack = null;
    private int _bufferedPlaySamples = 0;
    private int _bufferedRecSamples = 0;
    private Context _context;
    private long _currentTotalPostion = 0;
    private boolean _doPlayInit = true;
    private boolean _doRecInit = true;
    private long _firstRenderTS = 0;
    private long _framePostion = 0;
    private boolean _isPlaying = false;
    private boolean _isRecording = false;
    private long _lastRecDelay = 0;
    private int _playBufSize = 0;
    private ByteBuffer _playBuffer;
    private int _playChannel = 0;
    private final ReentrantLock _playLock = new ReentrantLock();
    private int _playPosition = 0;
    private int _playPreviousUnderrun = 0;
    private int _playbackRestartCount = 0;
    private int _playbackSampleRate = 0;
    private ByteBuffer _recBuffer;
    private long _recDelay = 10;
    private final ReentrantLock _recLock = new ReentrantLock();
    private int _recStartDelay = 0;
    private long _recStartTS = 0;
    private int _recordBufSize = 0;
    private int _recordChannel = 0;
    private int _recordRestartCount = 0;
    private int _recordSampleRate = 0;
    private int _recordSource = 0;
    private boolean _renderStart = false;
    private int _streamType = 0;
    private byte[] _tempBufPlay;
    private byte[] _tempBufRec;
    private AcousticEchoCanceler aec = null;
    private long current_time_ms = 0;
    private int maxDelay = 0;
    private int playWriten = 0;
    private long previous_time_ms = 0;
    private int totalDelay = 0;
    private boolean useBuiltInAEC = false;

    public AudioDevice() {
        try {
            this._playBuffer = ByteBuffer.allocateDirect(7680);
            this._recBuffer = ByteBuffer.allocateDirect(7680);
        } catch (Exception e) {
            Logging.e("AudioDevice Java", "failed to allocate bytebuffer", e);
        }
        this._tempBufPlay = new byte[7680];
        this._tempBufRec = new byte[7680];
        Context context = this._context;
        if (context != null) {
            HardwareEarbackController.getInstance(context);
        }
    }

    private boolean BuiltInAECIsAvailable() {
        try {
            return AcousticEchoCanceler.isAvailable();
        } catch (ExceptionInInitializerError e) {
            Logging.e("AudioDevice Java", "Unable to create AEC object ", e);
            return false;
        } catch (Exception unused) {
            Logging.e("AudioDevice Java", "Unable to query Audio Effect: Acoustic Echo Cancellation");
            return false;
        }
    }

    private boolean BuiltInAECIsEnabled() {
        return this.useBuiltInAEC;
    }

    private int CheckAudioStatus(int i) {
        int i2 = -1;
        if (this._audioManager == null) {
            Context context = this._context;
            if (context != null) {
                this._audioManager = (AudioManager) context.getSystemService("audio");
            } else {
                Logging.e("AudioDevice Java", "CheckAudioStatus error");
                return -1;
            }
        }
        int i3 = 0;
        if (i == 0) {
            if (this._context.checkPermission("android.permission.RECORD_AUDIO", Process.myPid(), Process.myUid()) != 0 || this._context.checkPermission("android.permission.MODIFY_AUDIO_SETTINGS", Process.myPid(), Process.myUid()) != 0) {
                Logging.e("AudioDevice Java", "CheckAudioStatus Microphone Permission denied");
                return 2;
            } else if (this._audioManager != null) {
                AudioRecord audioRecord = this._audioRecord;
                if (audioRecord != null) {
                    i2 = audioRecord.getAudioSessionId();
                }
                for (AudioRecordingConfiguration clientAudioSessionId : this._audioManager.getActiveRecordingConfigurations()) {
                    if (clientAudioSessionId.getClientAudioSessionId() != i2) {
                        i3 = 1033;
                    }
                }
            } else {
                Logging.e("AudioDevice Java", "CheckAudioStatus unkonwn error");
                return -1;
            }
        }
        return i3;
    }

    private boolean EnableBuiltInAEC(boolean z) {
        this.useBuiltInAEC = z;
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler == null) {
            return true;
        }
        if (acousticEchoCanceler.setEnabled(z) != 0) {
            Logging.e("AudioDevice Java", "AcousticEchoCanceler.setEnabled failed");
            return false;
        }
        StringBuilder P0 = a.P0("AcousticEchoCanceler.getEnabled: ");
        P0.append(this.aec.getEnabled());
        Logging.e("AudioDevice Java", P0.toString());
        return true;
    }

    private int GetAudioMode() {
        Context context;
        if (this._audioManager == null && (context = this._context) != null) {
            this._audioManager = (AudioManager) context.getSystemService("audio");
        }
        AudioManager audioManager = this._audioManager;
        if (audioManager != null) {
            return audioManager.getMode();
        }
        Logging.e("AudioDevice Java", "Could not change audio routing - no audio manager");
        return -1;
    }

    private int GetNativePlayDelay() {
        if (this._recDelay < 0) {
            this._recDelay = -1;
        }
        if (this.totalDelay < 0) {
            this.totalDelay = -1;
        }
        return this.totalDelay + ((int) this._recDelay);
    }

    private int GetNativeSampleRate() {
        Context context;
        if (this._audioManager == null && (context = this._context) != null) {
            this._audioManager = (AudioManager) context.getSystemService("audio");
        }
        AudioManager audioManager = this._audioManager;
        if (audioManager == null) {
            Logging.w("AudioDevice Java", "Could not set audio mode - no audio manager");
            return 44100;
        }
        String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property != null) {
            return Integer.parseInt(property);
        }
        return 44100;
    }

    private int GetPlayoutMaxVolume() {
        Context context;
        if (this._audioManager == null && (context = this._context) != null) {
            this._audioManager = (AudioManager) context.getSystemService("audio");
        }
        AudioManager audioManager = this._audioManager;
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(this._streamType);
        }
        return -1;
    }

    private int GetPlayoutVolume() {
        Context context;
        if (this._audioManager == null && (context = this._context) != null) {
            this._audioManager = (AudioManager) context.getSystemService("audio");
        }
        AudioManager audioManager = this._audioManager;
        if (audioManager != null) {
            return audioManager.getStreamVolume(this._streamType);
        }
        return -1;
    }

    private int GetPreferedSampleRate() {
        int i;
        Context context;
        try {
            if (this._audioManager == null && (context = this._context) != null) {
                this._audioManager = (AudioManager) context.getSystemService("audio");
            }
            i = Integer.parseInt(this._audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE"));
        } catch (Exception e) {
            Logging.e("AudioDevice Java", "GetPreferedSampleRate error", e);
            i = 0;
        }
        if (i == 0) {
            return 16000;
        }
        return i;
    }

    private int GetUnderrunCount() {
        return GetUnderrunCountOnNougatOrHigher();
    }

    private int GetUnderrunCountOnLowerThanNougat() {
        return -1;
    }

    @TargetApi(24)
    private int GetUnderrunCountOnNougatOrHigher() {
        int i;
        int i2 = 0;
        try {
            i = this._audioTrack.getUnderrunCount();
        } catch (Exception e) {
            Logging.e("AudioDevice Java", "getUnderrun fail ", e);
            i = 0;
        }
        int i3 = i - this._playPreviousUnderrun;
        if (i3 >= 0) {
            i2 = i3;
        }
        this._playPreviousUnderrun = i;
        if (i2 > 0) {
            Logging.d("AudioDevice Java", "Android AudioTrack underrun count: " + i2);
        }
        return i2;
    }

    private int InitPlayback(int i, int i2, int i3, int i4) {
        Context context;
        int i5 = i;
        int i6 = i2;
        this._streamType = i3;
        int i7 = (((i4 * i5) * i6) * 2) / 1000;
        int i8 = 4;
        int minBufferSize = AudioTrack.getMinBufferSize(i5, i6 == 2 ? 12 : 4, 2);
        StringBuilder R0 = a.R0("Java minimum playback buffer size is ", minBufferSize, ", profiledMiniOutBufferSize is ", i7, " stream type ");
        R0.append(this._streamType);
        Logging.d("AudioDevice Java", R0.toString());
        int i9 = minBufferSize < i7 ? i7 : minBufferSize;
        this._bufferedPlaySamples = 0;
        this._currentTotalPostion = 0;
        StringBuilder Q0 = a.Q0("Java playback buffer size is ", i9, ", duration is ");
        Q0.append((i9 * 1000) / ((i5 * i6) * 2));
        Q0.append(" ms");
        Logging.d("AudioDevice Java", Q0.toString());
        AudioTrack audioTrack = this._audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this._audioTrack = null;
        }
        try {
            int i10 = this._streamType;
            if (i6 == 2) {
                i8 = 12;
            }
            AudioTrack audioTrack2 = new AudioTrack(i10, i, i8, 2, i9, 1);
            this._audioTrack = audioTrack2;
            this._playbackSampleRate = i5;
            this._playChannel = i6;
            this._playBufSize = i9;
            this._playbackRestartCount = 0;
            if (audioTrack2.getState() != 1) {
                Logging.e("AudioDevice Java", "Java playback not initialized " + i5);
                return -1;
            }
            Logging.d("AudioDevice Java", "Java play sample rate is set to " + i5);
            if (this._audioManager == null && (context = this._context) != null) {
                this._audioManager = (AudioManager) context.getSystemService("audio");
            }
            AudioManager audioManager = this._audioManager;
            if (audioManager == null) {
                return 0;
            }
            return audioManager.getStreamMaxVolume(this._streamType);
        } catch (Exception e) {
            Logging.e("AudioDevice Java", "Unable to new AudioTrack: ", e);
            return -1;
        }
    }

    private int InitRecording(int i, int i2, int i3) {
        int minBufferSize = AudioRecord.getMinBufferSize(i2, i3 == 2 ? 12 : 16, 2);
        Logging.d("AudioDevice Java", "Java minimum recording buffer size is " + minBufferSize);
        this._bufferedRecSamples = (i2 * 5) / 200;
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        AudioRecord audioRecord = this._audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this._audioRecord = null;
        }
        try {
            AudioRecord audioRecord2 = new AudioRecord(i, i2, i3 == 2 ? 12 : 16, 2, minBufferSize);
            this._audioRecord = audioRecord2;
            if (audioRecord2.getState() != 1) {
                Logging.e("AudioDevice Java", "Java recording not initialized " + i2);
                return -2;
            }
            this._recordSampleRate = i2;
            this._recordChannel = i3;
            this._recordSource = i;
            this._recordBufSize = minBufferSize;
            this._recordRestartCount = 0;
            Logging.d("AudioDevice Java", "Java recording sample rate set to " + i2);
            Logging.d("AudioDevice Java", "AcousticEchoCanceler.isAvailable: " + BuiltInAECIsAvailable());
            if (!BuiltInAECIsAvailable()) {
                return this._bufferedRecSamples;
            }
            AcousticEchoCanceler create = AcousticEchoCanceler.create(this._audioRecord.getAudioSessionId());
            this.aec = create;
            if (create == null) {
                Logging.e("AudioDevice Java", "AcousticEchoCanceler.create failed");
            } else {
                AudioEffect.Descriptor descriptor = create.getDescriptor();
                if (descriptor == null) {
                    Logging.e("AudioDevice Java", "getDescriptor() failed");
                } else {
                    StringBuilder P0 = a.P0("AcousticEchoCanceler name: ");
                    P0.append(descriptor.name);
                    P0.append(", implementor: ");
                    P0.append(descriptor.implementor);
                    P0.append(", uuid: ");
                    P0.append(descriptor.uuid);
                    Logging.d("AudioDevice Java", P0.toString());
                }
                EnableBuiltInAEC(this.useBuiltInAEC);
            }
            return this._bufferedRecSamples;
        } catch (Exception e) {
            Logging.e("AudioDevice Java", "Unable to new AudioRecord: ", e);
            return -1;
        }
    }

    private int PlayAudio(int i) {
        this._playLock.lock();
        try {
            if (this._audioTrack == null) {
                this._playLock.unlock();
                return -2;
            }
            if (this._doPlayInit) {
                try {
                    Process.setThreadPriority(-19);
                } catch (Exception e) {
                    Logging.e("AudioDevice Java", "Set play thread priority failed: ", e);
                }
                this._doPlayInit = false;
                this.previous_time_ms = (System.nanoTime() / 1000) / 1000;
            }
            this._playBuffer.get(this._tempBufPlay);
            int write = this._audioTrack.write(this._tempBufPlay, 0, i);
            this._playBuffer.rewind();
            int i2 = write >> 1;
            this._bufferedPlaySamples += i2;
            this.playWriten += write;
            this._currentTotalPostion += (long) (i2 / this._playChannel);
            long nanoTime = (System.nanoTime() / 1000) / 1000;
            this.current_time_ms = nanoTime;
            if (nanoTime - this.previous_time_ms >= 50) {
                AudioTimestamp audioTimestamp = new AudioTimestamp();
                this._audioTrack.getTimestamp(audioTimestamp);
                long j = audioTimestamp.framePosition;
                this._framePostion = j;
                if (this.current_time_ms - this.previous_time_ms > 65) {
                    this._bufferedPlaySamples = (int) (this._currentTotalPostion - ((long) (this._playPosition / this._playChannel)));
                } else {
                    this._bufferedPlaySamples = (int) (this._currentTotalPostion - j);
                }
                this.previous_time_ms = (audioTimestamp.nanoTime / 1000) / 1000;
            }
            int playbackHeadPosition = this._audioTrack.getPlaybackHeadPosition() * this._playChannel;
            if (playbackHeadPosition < this._playPosition) {
                this._playPosition = 0;
            }
            this._playPosition = playbackHeadPosition;
            boolean z = this._isRecording;
            if (write != i) {
                if (this._playbackRestartCount <= 20) {
                    Logging.e("AudioDevice Java", "Error writing AudioTrack! Restart AudioTrack " + this._playbackRestartCount);
                    this._playbackRestartCount = this._playbackRestartCount + 1;
                    this._audioTrack.stop();
                    this._audioTrack.release();
                    this._audioTrack = null;
                    try {
                        AudioTrack audioTrack = new AudioTrack(this._streamType, this._playbackSampleRate, this._playChannel == 2 ? 12 : 4, 2, this._playBufSize, 1);
                        this._audioTrack = audioTrack;
                        audioTrack.play();
                    } catch (Exception e2) {
                        Logging.e("AudioDevice Java", "restart audio fail", e2);
                    }
                }
                this._playLock.unlock();
                return write;
            }
            this._playLock.unlock();
            return this._bufferedPlaySamples * this._playChannel;
        } catch (Exception e3) {
            Logging.e("AudioDevice Java", "PlayAudio got fatal error ", e3);
        } catch (Throwable th) {
            this._playLock.unlock();
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b2 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int QuerySpeakerStatus() {
        /*
            r13 = this;
            java.lang.String r0 = "bluetooth"
            java.lang.String r1 = "headset"
            java.lang.String r2 = "phone"
            java.lang.String r3 = "AudioDevice Java"
            android.media.AudioManager r4 = r13._audioManager
            if (r4 != 0) goto L_0x001a
            android.content.Context r4 = r13._context
            if (r4 == 0) goto L_0x001a
            java.lang.String r5 = "audio"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            r13._audioManager = r4
        L_0x001a:
            r4 = 0
            r5 = 1
            r6 = 5
            r7 = -1
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00b3 }
            r9 = 26
            if (r8 < r9) goto L_0x00bc
            android.content.Context r8 = r13._context     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r9 = "media_router"
            java.lang.Object r8 = r8.getSystemService(r9)     // Catch:{ Exception -> 0x00b3 }
            android.media.MediaRouter r8 = (android.media.MediaRouter) r8     // Catch:{ Exception -> 0x00b3 }
            android.media.MediaRouter$RouteInfo r8 = r8.getSelectedRoute(r5)     // Catch:{ Exception -> 0x00b3 }
            java.lang.CharSequence r9 = r8.getName()     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00b3 }
            r9.compareToIgnoreCase(r2)     // Catch:{ Exception -> 0x00b3 }
            android.content.Context r9 = r13._context     // Catch:{ Exception -> 0x00b3 }
            android.content.res.Resources r9 = r9.getResources()     // Catch:{ Exception -> 0x00b3 }
            android.content.res.Configuration r9 = r9.getConfiguration()     // Catch:{ Exception -> 0x00b3 }
            android.os.LocaleList r10 = r9.getLocales()     // Catch:{ Exception -> 0x00b3 }
            android.content.Context r11 = r13._context     // Catch:{ Exception -> 0x00b3 }
            android.content.res.Resources r11 = r11.getResources()     // Catch:{ Exception -> 0x00b3 }
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()     // Catch:{ Exception -> 0x00b3 }
            java.util.Locale r12 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x00b3 }
            r9.setLocale(r12)     // Catch:{ Exception -> 0x00b3 }
            android.content.Context r12 = r13._context     // Catch:{ Exception -> 0x00b3 }
            android.content.res.Resources r12 = r12.getResources()     // Catch:{ Exception -> 0x00b3 }
            r12.updateConfiguration(r9, r11)     // Catch:{ Exception -> 0x00b3 }
            android.content.Context r12 = r13._context     // Catch:{ Exception -> 0x00b3 }
            java.lang.CharSequence r12 = r8.getName(r12)     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x00b3 }
            int r2 = r12.compareToIgnoreCase(r2)     // Catch:{ Exception -> 0x00b3 }
            if (r2 != 0) goto L_0x0079
            java.lang.String r0 = "speaker"
            io.agora.rtc.internal.Logging.e(r3, r0)     // Catch:{ Exception -> 0x00b3 }
            goto L_0x00a3
        L_0x0079:
            android.content.Context r2 = r13._context     // Catch:{ Exception -> 0x00b3 }
            java.lang.CharSequence r2 = r8.getName(r2)     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00b3 }
            int r2 = r2.compareToIgnoreCase(r1)     // Catch:{ Exception -> 0x00b3 }
            if (r2 != 0) goto L_0x008e
            io.agora.rtc.internal.Logging.e(r3, r1)     // Catch:{ Exception -> 0x00b3 }
            r0 = r4
            goto L_0x00a4
        L_0x008e:
            android.content.Context r1 = r13._context     // Catch:{ Exception -> 0x00b3 }
            java.lang.CharSequence r1 = r8.getName(r1)     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00b3 }
            int r1 = r1.compareToIgnoreCase(r0)     // Catch:{ Exception -> 0x00b3 }
            if (r1 != 0) goto L_0x00a3
            io.agora.rtc.internal.Logging.e(r3, r0)     // Catch:{ Exception -> 0x00b3 }
            r0 = r6
            goto L_0x00a4
        L_0x00a3:
            r0 = r7
        L_0x00a4:
            r9.setLocales(r10)     // Catch:{ Exception -> 0x00b3 }
            android.content.Context r1 = r13._context     // Catch:{ Exception -> 0x00b3 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ Exception -> 0x00b3 }
            r1.updateConfiguration(r9, r11)     // Catch:{ Exception -> 0x00b3 }
            if (r0 == r7) goto L_0x00bc
            return r0
        L_0x00b3:
            r0 = move-exception
            java.lang.String r1 = "error in Query audio route "
            io.agora.rtc.internal.Logging.e(r1)
            r0.printStackTrace()
        L_0x00bc:
            android.media.AudioManager r0 = r13._audioManager
            if (r0 != 0) goto L_0x00c6
            java.lang.String r0 = "Could not get audio routing - no audio manager"
            io.agora.rtc.internal.Logging.e(r3, r0)
            return r7
        L_0x00c6:
            boolean r0 = r0.isBluetoothA2dpOn()
            if (r0 == 0) goto L_0x00cd
            return r6
        L_0x00cd:
            android.media.AudioManager r0 = r13._audioManager
            boolean r0 = r0.isSpeakerphoneOn()
            if (r0 == 0) goto L_0x00d7
            r0 = 3
            return r0
        L_0x00d7:
            android.media.AudioManager r0 = r13._audioManager
            boolean r0 = r0.isBluetoothScoOn()
            if (r0 == 0) goto L_0x00e0
            return r6
        L_0x00e0:
            android.media.AudioManager r0 = r13._audioManager
            boolean r0 = r0.isWiredHeadsetOn()
            if (r0 == 0) goto L_0x00e9
            return r4
        L_0x00e9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.audio.AudioDevice.QuerySpeakerStatus():int");
    }

    private int RecordAudio(int i) {
        this._recLock.lock();
        int i2 = 0;
        try {
            if (this._audioRecord == null) {
                this._recLock.unlock();
                return -4;
            }
            if (this._doRecInit) {
                try {
                    Process.setThreadPriority(-19);
                } catch (Exception e) {
                    Logging.e("AudioDevice Java", "Set rec thread priority failed: ", e);
                }
                this._doRecInit = false;
            }
            this._recBuffer.rewind();
            int read = this._audioRecord.read(this._tempBufRec, 0, i);
            this._recBuffer.put(this._tempBufRec);
            if (this._recDelay == 10) {
                AudioTimestamp audioTimestamp = new AudioTimestamp();
                this._audioRecord.getTimestamp(audioTimestamp, 0);
                long nanoTime = ((System.nanoTime() - audioTimestamp.nanoTime) / 1000) / 1000;
                this._recDelay = nanoTime;
                if (nanoTime > 50) {
                    this._recDelay = 10;
                }
                if (this._recStartDelay == 0) {
                    this._recStartDelay = (((int) (System.nanoTime() - this._recStartTS)) / 1000) / 1000;
                }
                this._recDelay += (long) this._recStartDelay;
            }
            if (this._lastRecDelay != this._recDelay) {
                int bufferSizeInFrames = this._audioRecord.getBufferSizeInFrames();
                Logging.i("AudioDevice Java", "frames  " + bufferSizeInFrames + " recDelay " + this._recDelay + " caculated frames delay " + (bufferSizeInFrames / (this._audioRecord.getSampleRate() / 1000)));
                this._lastRecDelay = this._recDelay;
            }
            if (read != i) {
                if (this._recordRestartCount % 10 == 0) {
                    Logging.e("AudioDevice Java", "Error reading AudioRecord! AudioRecord.read returns " + read);
                }
                this._recordRestartCount++;
                this._audioRecord.stop();
                this._audioRecord.release();
                this._audioRecord = null;
                AudioRecord audioRecord = new AudioRecord(this._recordSource, this._recordSampleRate, this._recordChannel == 2 ? 12 : 16, 2, this._recordBufSize);
                this._audioRecord = audioRecord;
                audioRecord.startRecording();
                this._recStartTS = System.nanoTime();
                this._recStartDelay = 0;
                this._recLock.unlock();
                return read;
            }
            this._recLock.unlock();
            return i2;
        } catch (Exception e2) {
            i2 = -10;
            Logging.e("AudioDevice Java", "RecordAudio try failed: ", e2);
        } catch (Throwable th) {
            this._recLock.unlock();
            throw th;
        }
    }

    private int SetAudioMode(int i) {
        int i2;
        Context context;
        try {
            if (this._audioManager == null && (context = this._context) != null) {
                this._audioManager = (AudioManager) context.getSystemService("audio");
            }
            AudioManager audioManager = this._audioManager;
            if (audioManager == null) {
                Logging.e("AudioDevice Java", "Could not change audio routing - no audio manager");
                return -1;
            }
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = this._audioManager.getStreamVolume(3);
            int streamMaxVolume2 = this._audioManager.getStreamMaxVolume(0);
            int streamVolume2 = this._audioManager.getStreamVolume(0);
            int i3 = streamMaxVolume - streamMaxVolume2;
            double d = ((double) streamMaxVolume2) / ((double) streamMaxVolume);
            if (this._audioManager.getMode() == i) {
                return 0;
            }
            if (this._isPlaying) {
                Logging.e("AudioDevice Java", "_audioManager.getMode() = " + this._audioManager.getMode() + " target mode = " + i + "factorX = " + i3 + "mMediaMaxVolume=" + streamMaxVolume + "mCommMaxVolume=" + streamMaxVolume2 + "mCurrMediaVolume=" + streamVolume + "mCurrCommVolume=" + streamVolume2 + "delta" + d);
                if (i == 3) {
                    if (i3 < 12) {
                        i2 = streamVolume - i3;
                        if (i2 < 1) {
                            i2 = 1;
                        }
                    } else {
                        i2 = (int) ((((double) streamVolume) * d) + 0.5d);
                    }
                    if (i2 < 1) {
                        i2 = 1;
                    }
                    Logging.d("[Java AudioDevice] set voice call vol = " + i2);
                    this._audioManager.setStreamVolume(0, i2, 0);
                } else if (i == 0) {
                    if (i3 < 12) {
                        int i4 = streamVolume2 + i3;
                        if (i4 < streamMaxVolume) {
                            streamMaxVolume = i4;
                        }
                    } else {
                        streamMaxVolume = (int) ((((double) streamVolume2) / d) + 0.5d);
                    }
                    if (streamMaxVolume < 1) {
                        streamMaxVolume = 1;
                    }
                    this._audioManager.setStreamVolume(3, streamMaxVolume, 0);
                    Logging.d("[Java AudioDevice] set music vol = " + streamMaxVolume);
                }
            }
            if (i == 0) {
                this._audioManager.setMode(0);
            } else if (i == 1) {
                this._audioManager.setMode(1);
            } else if (i == 2) {
                this._audioManager.setMode(2);
            } else if (i != 3) {
                this._audioManager.setMode(0);
            } else {
                this._audioManager.setMode(3);
            }
            return 0;
        } catch (Exception unused) {
            Logging.e("AudioDevice Java", "set audio mode failed! ");
        }
    }

    private int SetPlayoutSpeaker(boolean z) {
        Context context;
        if (this._audioManager == null && (context = this._context) != null) {
            this._audioManager = (AudioManager) context.getSystemService("audio");
        }
        AudioManager audioManager = this._audioManager;
        if (audioManager == null) {
            Logging.e("AudioDevice Java", "Could not change audio routing - no audio manager");
            return -1;
        }
        audioManager.setSpeakerphoneOn(z);
        return 0;
    }

    private int SetPlayoutVolume(int i) {
        Context context;
        if (this._audioManager == null && (context = this._context) != null) {
            this._audioManager = (AudioManager) context.getSystemService("audio");
        }
        AudioManager audioManager = this._audioManager;
        if (audioManager == null) {
            return -1;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(this._streamType);
        if (i < 255) {
            streamMaxVolume = (i * streamMaxVolume) / 255;
        }
        this._audioManager.setStreamVolume(this._streamType, streamMaxVolume, 0);
        return 0;
    }

    private int StartPlayback() {
        this._firstRenderTS = 0;
        this._renderStart = false;
        try {
            this.playWriten = 0;
            this._audioTrack.play();
            this.maxDelay = 0;
            this.totalDelay = 0;
            this._isPlaying = true;
            return 0;
        } catch (IllegalStateException e) {
            e.printStackTrace();
            return -1;
        } catch (Exception e2) {
            Logging.e("AudioDevice Java", "startplayback fail", e2);
            return -1;
        }
    }

    private int StartRecording() {
        try {
            AudioRecord audioRecord = this._audioRecord;
            if (audioRecord == null) {
                return -2;
            }
            audioRecord.startRecording();
            Logging.e("AudioDevice Java", "Recording start time " + System.nanoTime());
            this._recStartTS = System.nanoTime();
            this._recStartDelay = 0;
            this._recDelay = 10;
            this._isRecording = true;
            return 0;
        } catch (IllegalStateException e) {
            Logging.e("AudioDevice Java", "failed to startRecording", e);
            return -1;
        } catch (Exception e2) {
            Logging.e("AudioDevice Java", "failed to startRecording Exception", e2);
            return -2;
        }
    }

    private int StopPlayback() {
        this._firstRenderTS = 0;
        this._playLock.lock();
        try {
            this._audioTrack.setVolume(0.0f);
            if (this._audioTrack.getPlayState() == 3) {
                this._audioTrack.stop();
                this._audioTrack.flush();
            }
            this._audioTrack.release();
            this._audioTrack = null;
        } catch (IllegalStateException e) {
            Logging.e("AudioDevice Java", "Unable to stop playback: ", e);
            AudioTrack audioTrack = this._audioTrack;
            if (audioTrack != null) {
                audioTrack.flush();
                this._audioTrack.release();
                this._audioTrack = null;
            }
            this._doPlayInit = true;
            this._playLock.unlock();
            return -1;
        } catch (Exception e2) {
            Logging.e("AudioDevice Java", "Stop playback fail", e2);
            AudioTrack audioTrack2 = this._audioTrack;
            if (audioTrack2 != null) {
                audioTrack2.flush();
                this._audioTrack.release();
                this._audioTrack = null;
            }
        } catch (Throwable th) {
            AudioTrack audioTrack3 = this._audioTrack;
            if (audioTrack3 != null) {
                audioTrack3.flush();
                this._audioTrack.release();
                this._audioTrack = null;
            }
            this._doPlayInit = true;
            this._playLock.unlock();
            throw th;
        }
        this._doPlayInit = true;
        this._playLock.unlock();
        this._isPlaying = false;
        return 0;
    }

    private int StopRecording() {
        this._recLock.lock();
        try {
            if (this._audioRecord.getRecordingState() == 3) {
                this._audioRecord.stop();
            }
            AcousticEchoCanceler acousticEchoCanceler = this.aec;
            if (acousticEchoCanceler != null) {
                acousticEchoCanceler.release();
                this.aec = null;
            }
            this._audioRecord.release();
            this._audioRecord = null;
        } catch (Exception e) {
            Logging.e("AudioDevice Java", "error in StopRecording ", e);
            AudioRecord audioRecord = this._audioRecord;
            if (audioRecord != null) {
                audioRecord.release();
                this._audioRecord = null;
            }
        } catch (Throwable th) {
            AudioRecord audioRecord2 = this._audioRecord;
            if (audioRecord2 != null) {
                audioRecord2.release();
                this._audioRecord = null;
            }
            this._doRecInit = true;
            this._recLock.unlock();
            throw th;
        }
        this._doRecInit = true;
        this._recLock.unlock();
        this._isRecording = false;
        return 0;
    }

    private int enableHardwareEarback(boolean z) {
        Logging.i("AudioDevice Java", "enableHardwareEarback " + z);
        int enableHardwareEarback = HardwareEarbackController.getInstance(this._context).enableHardwareEarback(z);
        Logging.i("AudioDevice Java", "enableHardwareEarback " + z + " ret " + enableHardwareEarback);
        return enableHardwareEarback;
    }

    private boolean isHardwareEarbackSupported() {
        Context context = this._context;
        if (context != null) {
            return HardwareEarbackController.getInstance(context).isHardwareEarbackSupported();
        }
        return false;
    }

    private int setHardwareEarbackVolume(int i) {
        Context context = this._context;
        if (context != null) {
            return HardwareEarbackController.getInstance(context).setHardwareEarbackVolume(i);
        }
        return -1;
    }
}
