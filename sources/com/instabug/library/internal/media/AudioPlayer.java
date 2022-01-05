package com.instabug.library.internal.media;

import android.media.MediaPlayer;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class AudioPlayer {
    public static final String TAG = "AudioPlayer";
    private String filePath;
    private MediaPlayer mediaPlayer;
    private MediaPlayer.OnCompletionListener onCompletionListener;
    private e onGetDurationListener;
    private final Map<String, OnStopListener> onStopListeners = new HashMap();

    public static abstract class OnStopListener {
        private String filePath;

        public OnStopListener(String str) {
            this.filePath = str;
        }

        public String getFilePath() {
            return this.filePath;
        }

        public abstract void onStop();
    }

    public class a implements MediaPlayer.OnPreparedListener {
        public final /* synthetic */ d a;

        public a(d dVar) {
            this.a = dVar;
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            AudioPlayer.this.doAction(this.a);
        }
    }

    public class b implements MediaPlayer.OnCompletionListener {
        public b() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            AudioPlayer.this.notifyOnStopListeners();
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001c */
        static {
            /*
                com.instabug.library.internal.media.AudioPlayer.d.values()
                r0 = 3
                int[] r1 = new int[r0]
                a = r1
                com.instabug.library.internal.media.AudioPlayer$d r2 = com.instabug.library.internal.media.AudioPlayer.d.START     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r3 = 1
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x001c }
                com.instabug.library.internal.media.AudioPlayer$d r2 = com.instabug.library.internal.media.AudioPlayer.d.PAUSE     // Catch:{ NoSuchFieldError -> 0x001c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r3 = 2
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0026 }
                com.instabug.library.internal.media.AudioPlayer$d r2 = com.instabug.library.internal.media.AudioPlayer.d.GET_DURATION     // Catch:{ NoSuchFieldError -> 0x0026 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0026 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.media.AudioPlayer.c.<clinit>():void");
        }
    }

    public enum d {
        START,
        PAUSE,
        GET_DURATION
    }

    public interface e {
        void e(int i);
    }

    /* access modifiers changed from: private */
    public void doAction(d dVar) {
        e eVar;
        MediaPlayer mediaPlayer2;
        int i = c.a[dVar.ordinal()];
        if (i == 1) {
            MediaPlayer mediaPlayer3 = this.mediaPlayer;
            if (mediaPlayer3 != null && !mediaPlayer3.isPlaying()) {
                this.mediaPlayer.start();
            }
        } else if (i == 2) {
            MediaPlayer mediaPlayer4 = this.mediaPlayer;
            if (mediaPlayer4 != null && mediaPlayer4.isPlaying()) {
                this.mediaPlayer.pause();
            }
        } else if (i == 3 && (eVar = this.onGetDurationListener) != null && (mediaPlayer2 = this.mediaPlayer) != null) {
            eVar.e(mediaPlayer2.getDuration());
        }
    }

    public static String getFormattedDurationText(long j) {
        int i = (int) (j / 3600000);
        int i2 = (int) ((j % 3600000) / 60000);
        int i3 = (int) ((j % 60000) / 1000);
        if (i > 0) {
            return String.format(Locale.getDefault(), "%02d:%02d:%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        }
        return String.format(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* access modifiers changed from: private */
    public void notifyOnStopListeners() {
        for (OnStopListener onStop : this.onStopListeners.values()) {
            onStop.onStop();
        }
    }

    private void prepare(d dVar) {
        try {
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            this.mediaPlayer = mediaPlayer2;
            String str = this.filePath;
            if (str != null) {
                mediaPlayer2.setDataSource(str);
            }
            this.mediaPlayer.setOnPreparedListener(new a(dVar));
            this.mediaPlayer.prepareAsync();
            MediaPlayer.OnCompletionListener onCompletionListener2 = this.onCompletionListener;
            if (onCompletionListener2 != null) {
                this.mediaPlayer.setOnCompletionListener(onCompletionListener2);
            }
        } catch (IOException e2) {
            InstabugSDKLogger.e(TAG, "Playing audio file failed", e2);
        }
    }

    private void stream(String str, d dVar) {
        if (str == null) {
            InstabugSDKLogger.e(TAG, "Audio file path can not be null");
        } else if (str.equals(this.filePath)) {
            doAction(dVar);
        } else {
            this.filePath = str;
            prepare(dVar);
        }
    }

    public void addOnStopListener(OnStopListener onStopListener) {
        this.onStopListeners.put(onStopListener.getFilePath(), onStopListener);
        if (this.onCompletionListener == null) {
            b bVar = new b();
            this.onCompletionListener = bVar;
            MediaPlayer mediaPlayer2 = this.mediaPlayer;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setOnCompletionListener(bVar);
            }
        }
    }

    public void getDurationAsync(String str, e eVar) {
        stream(str, d.GET_DURATION);
        this.onGetDurationListener = eVar;
    }

    public void pause() {
        notifyOnStopListeners();
        doAction(d.PAUSE);
    }

    public void release() {
        this.filePath = null;
        MediaPlayer mediaPlayer2 = this.mediaPlayer;
        if (mediaPlayer2 != null) {
            if (mediaPlayer2.isPlaying()) {
                this.mediaPlayer.stop();
            }
            this.mediaPlayer.release();
            this.mediaPlayer = null;
        }
    }

    public void start(String str) {
        pause();
        stream(str, d.START);
    }
}
