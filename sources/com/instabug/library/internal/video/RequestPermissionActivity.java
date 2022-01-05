package com.instabug.library.internal.video;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library._InstabugActivity;
import com.instabug.library.core.eventbus.ScreenRecordingEventBus;
import com.instabug.library.screenshot.ScreenshotProvider;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.StatusBarUtils;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import h0.b.a.e;
import i0.j.e.d.a;
import i0.j.e.y0.d;

@TargetApi(21)
@SuppressFBWarnings({"ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
public class RequestPermissionActivity extends e implements _InstabugActivity, a.C0178a {
    private static final int CREATE_SCREENSHOT = 101;
    private static final int CREATE_SCREEN_CAPTURE = 2020;
    public static final String KEY_IS_INITIAL = "isInitial";
    public static final String KEY_IS_PERMISSION_GRANDTED = "isPermissionGranted";
    public static final String KEY_IS_VIDEO = "isVideo";
    public static final int REQUEST_MEDIA_PROJECTION_PERMISSION = 2030;
    private static final int REQUEST_SCREEN_RECORDING_MIC_PERMISSION = 2022;
    public static ScreenshotProvider.ScreenshotCapturingListener screenshotCapturingListener;
    public boolean isInitial = true;
    public boolean isVideo = true;
    private a sdkInvokedBroadcast = new a(this);

    private void requestAudioRecordingPermission() {
        if (!(h0.i.b.a.checkSelfPermission(this, "android.permission.RECORD_AUDIO") == 0)) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.RECORD_AUDIO"}, REQUEST_SCREEN_RECORDING_MIC_PERMISSION);
        } else {
            requestScreenRecording();
        }
    }

    private void requestScreenRecording() {
        MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getSystemService("media_projection");
        if (InternalAutoScreenRecorderHelper.getStaticIntentData() != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                startForegroundService(ScreenRecordingService.a(this, InternalAutoScreenRecorderHelper.getStaticResultCode(), InternalAutoScreenRecorderHelper.getStaticIntentData(), false));
            } else {
                startService(ScreenRecordingService.a(this, InternalAutoScreenRecorderHelper.getStaticResultCode(), InternalAutoScreenRecorderHelper.getStaticIntentData(), false));
            }
            finish();
            return;
        }
        startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), CREATE_SCREEN_CAPTURE);
    }

    private void requestScreenShot(Intent intent) {
        if (InternalAutoScreenRecorderHelper.getStaticIntentData() != null) {
            if (!this.isInitial) {
                Intent intent2 = new Intent();
                intent2.putExtra(KEY_IS_PERMISSION_GRANDTED, true);
                setResult(REQUEST_MEDIA_PROJECTION_PERMISSION, intent2);
            }
            d.c.a(InternalAutoScreenRecorderHelper.getStaticResultCode(), InternalAutoScreenRecorderHelper.getStaticIntentData(), this.isInitial, screenshotCapturingListener);
            finish();
            return;
        }
        startActivityForResult(intent, 101);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == CREATE_SCREEN_CAPTURE) {
            if (i2 == -1) {
                try {
                    if (InternalAutoScreenRecorderHelper.getStaticResultCode() == 0 && InternalAutoScreenRecorderHelper.getStaticIntentData() == null) {
                        InternalAutoScreenRecorderHelper.setStaticIntentData(intent);
                        InternalAutoScreenRecorderHelper.setStaticResultCode(i2);
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        startForegroundService(ScreenRecordingService.a(this, InternalAutoScreenRecorderHelper.getStaticResultCode(), InternalAutoScreenRecorderHelper.getStaticIntentData(), false));
                    } else {
                        startService(ScreenRecordingService.a(this, InternalAutoScreenRecorderHelper.getStaticResultCode(), InternalAutoScreenRecorderHelper.getStaticIntentData(), false));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    finish();
                    throw th;
                }
            } else if (i2 == 0) {
                SettingsManager.getInstance().setAutoScreenRecordingDenied(true);
                ScreenRecordingEventBus.getInstance().post(new ScreenRecordingEvent(0, (Uri) null));
            }
        } else if (i == 101) {
            if (i2 == -1) {
                if (InternalAutoScreenRecorderHelper.getStaticResultCode() == 0 && InternalAutoScreenRecorderHelper.getStaticIntentData() == null) {
                    InternalAutoScreenRecorderHelper.setStaticIntentData(intent);
                    InternalAutoScreenRecorderHelper.setStaticResultCode(i2);
                }
                SettingsManager.getInstance().setProcessingForeground(true);
                if (!this.isInitial) {
                    Intent intent2 = new Intent();
                    intent2.putExtra(KEY_IS_PERMISSION_GRANDTED, true);
                    setResult(REQUEST_MEDIA_PROJECTION_PERMISSION, intent2);
                }
                d.c.a(i2, intent, this.isInitial, screenshotCapturingListener);
            } else {
                ScreenshotProvider.ScreenshotCapturingListener screenshotCapturingListener2 = screenshotCapturingListener;
                if (screenshotCapturingListener2 != null) {
                    screenshotCapturingListener2.onScreenshotCapturingFailed(new Exception("User declined media-projection permission"));
                }
            }
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StatusBarUtils.darkenStatusBarColor(this, Instabug.getPrimaryColor());
        if (bundle == null) {
            this.isVideo = getIntent().getBooleanExtra(KEY_IS_VIDEO, true);
            this.isInitial = getIntent().getBooleanExtra(KEY_IS_INITIAL, true);
            Intent createScreenCaptureIntent = ((MediaProjectionManager) getSystemService("media_projection")).createScreenCaptureIntent();
            if (!this.isVideo) {
                requestScreenShot(createScreenCaptureIntent);
            } else if (SettingsManager.getInstance().getAutoScreenRecordingAudioCapturingState() == Feature.State.ENABLED) {
                requestAudioRecordingPermission();
            } else {
                requestScreenRecording();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        screenshotCapturingListener = null;
    }

    public void onPause() {
        super.onPause();
        h0.s.a.a.a(getApplicationContext()).d(this.sdkInvokedBroadcast);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr.length <= 0 || iArr[0] != 0) {
            if (i == REQUEST_SCREEN_RECORDING_MIC_PERMISSION) {
                requestScreenRecording();
            }
        } else if (i != REQUEST_SCREEN_RECORDING_MIC_PERMISSION) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        } else {
            requestScreenRecording();
        }
    }

    public void onResume() {
        super.onResume();
        h0.s.a.a.a(getApplicationContext()).b(this.sdkInvokedBroadcast, new IntentFilter("SDK invoked"));
    }

    public void onSDKInvoked(boolean z) {
        if (z) {
            finish();
        }
    }

    public void onStart() {
        super.onStart();
        SettingsManager.getInstance().setRequestPermissionScreenShown(true);
    }

    public void onStop() {
        super.onStop();
        SettingsManager.getInstance().setRequestPermissionScreenShown(false);
        finish();
    }
}
