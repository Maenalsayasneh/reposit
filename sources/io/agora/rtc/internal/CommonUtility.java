package io.agora.rtc.internal;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.model.PaymentMethod;
import i0.d.a.a.a;
import io.agora.rtc.internal.RtcEngineMessage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.UUID;

public class CommonUtility {
    private static final String PREFIX_URI = "content://";
    /* access modifiers changed from: private */
    public static final String TAG = "CommonUtility";
    private static final int VIDEO_SOURCE_TYPE_CUSTOMIZED = 2;
    private static final int VIDEO_SOURCE_TYPE_DEFAULT = 1;
    private static final int VIDEO_SOURCE_TYPE_EXTERNAL_DEPRECATED = 3;
    private static final int VIDEO_SOURCE_TYPE_NULL = 0;
    private static WeakReference<Application> mApplication;
    private int batteryPercentage = 255;
    /* access modifiers changed from: private */
    public volatile boolean mAccessible = false;
    private long mBridgeHandle = 0;
    private ConnectionChangeBroadcastReceiver mConnectionBroadcastReceiver = null;
    /* access modifiers changed from: private */
    public WeakReference<Context> mContext;
    private boolean mLocalVideoEnabled = false;
    private int mMobileType = -1;
    private int mOrientation = -1;
    private OrientationEventListener mOrientationListener = null;
    private BroadcastReceiver mOrientationObserver = null;
    private AgoraPhoneStateListener mPhoneStateListener = null;
    private PowerConnectionReceiver mPowerConnectionReceiver = null;
    private int mVideoSourceType = 1;

    public class AgoraPhoneStateListener extends PhoneStateListener {
        private SignalStrength mSignalStrenth;
        private boolean phoneStatusNeedResume = false;

        public AgoraPhoneStateListener() {
        }

        private int invokeMethod(String str) {
            Method declaredMethod;
            try {
                SignalStrength signalStrength = this.mSignalStrenth;
                if (!(signalStrength == null || (declaredMethod = signalStrength.getClass().getDeclaredMethod(str, new Class[0])) == null)) {
                    return ((Integer) declaredMethod.invoke(this.mSignalStrenth, new Object[0])).intValue();
                }
            } catch (Exception unused) {
            }
            return 0;
        }

        public int getAsuLevel() {
            if (Build.VERSION.SDK_INT <= 28) {
                return invokeMethod("getAsuLevel");
            }
            return 0;
        }

        public int getLevel() {
            return invokeMethod("getLevel");
        }

        public int getRssi() {
            if (Build.VERSION.SDK_INT <= 28) {
                return invokeMethod("getDbm");
            }
            return 0;
        }

        public void onCallStateChanged(int i, String str) {
            if (((Context) CommonUtility.this.mContext.get()) != null && CommonUtility.this.mAccessible) {
                super.onCallStateChanged(i, str);
                if (i != 0) {
                    if (i == 1) {
                        Logging.i(CommonUtility.TAG, "system phone call ring");
                        this.phoneStatusNeedResume = true;
                        CommonUtility.this.onPhoneStateChanged(false, 22, 1);
                    } else if (i == 2) {
                        Logging.i(CommonUtility.TAG, "system phone call start");
                        this.phoneStatusNeedResume = true;
                        CommonUtility.this.onPhoneStateChanged(false, 22, 2);
                    }
                } else if (this.phoneStatusNeedResume) {
                    this.phoneStatusNeedResume = false;
                    Logging.i(CommonUtility.TAG, "system phone call end delay 1000ms");
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            try {
                                CommonUtility.this.onPhoneStateChanged(true, 22, 0);
                            } catch (Exception e) {
                                Logging.e(CommonUtility.TAG, "fail to resume ", e);
                            }
                        }
                    }, 1000);
                }
            }
        }

        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            if (((Context) CommonUtility.this.mContext.get()) != null && CommonUtility.this.mAccessible) {
                super.onSignalStrengthsChanged(signalStrength);
                this.mSignalStrenth = signalStrength;
            }
        }
    }

    public static class MobileType {
        public static final int Cdma = 1;
        public static final int Gsm = 0;
        public static final int Lte = 3;
        public static final int Unknown = -1;
        public static final int Wcdma = 2;
    }

    public CommonUtility(Context context, long j) {
        this.mContext = new WeakReference<>(context);
        this.mBridgeHandle = j;
        try {
            this.mPhoneStateListener = new AgoraPhoneStateListener();
            ((TelephonyManager) context.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE)).listen(this.mPhoneStateListener, 288);
        } catch (Exception e) {
            Logging.e(TAG, "Unable to create PhoneStateListener, ", e);
        }
        monitorConnectionEvent(true);
        monitorPowerChange(true);
        monitorOrientationChange(context, true);
        this.mAccessible = true;
        Logging.i(TAG, "[init] done!");
    }

    public static boolean canGetDefaultContext() {
        Looper myLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        return true;
    }

    private static boolean checkAccessNetworkState(Context context) {
        return context != null && context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    private static boolean checkAccessWifiState(Context context) {
        return context != null && context.checkPermission("android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0;
    }

    /* access modifiers changed from: private */
    public void checkOrientation(int i) {
        if (i != -1 && this.mAccessible) {
            if (i > 340 || i < 20 || ((i > 70 && i < 110) || ((i > 160 && i < 200) || (i > 250 && i < 290)))) {
                updateViewOrientation();
            }
        }
    }

    private void checkVoipPermissions(Context context, String str) throws SecurityException {
        if (context == null || context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            throw new SecurityException(a.n0(str, " is not granted"));
        }
    }

    private void disableOrientationListener() {
        OrientationEventListener orientationEventListener = this.mOrientationListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.mOrientationListener = null;
            Logging.i(TAG, "[disableOrientationListener] done!");
            return;
        }
        Logging.e(TAG, "[disableOrientationListener] mOrientationListener is null!");
    }

    private RtcEngineMessage.MediaNetworkInfo doGetNetworkInfo(Context context) {
        InetAddress intToInetAddress;
        if (context == null || !this.mAccessible) {
            return null;
        }
        RtcEngineMessage.MediaNetworkInfo mediaNetworkInfo = new RtcEngineMessage.MediaNetworkInfo();
        if (!checkAccessNetworkState(context)) {
            mediaNetworkInfo.ssid = "";
            mediaNetworkInfo.bssid = "";
            mediaNetworkInfo.rssi = 0;
            mediaNetworkInfo.signalLevel = 0;
            mediaNetworkInfo.frequency = 0;
            mediaNetworkInfo.linkspeed = 0;
            return mediaNetworkInfo;
        }
        String localHost = getLocalHost();
        if (localHost != null) {
            mediaNetworkInfo.localIp4 = localHost;
        }
        NetworkInfo networkInfo = Connectivity.getNetworkInfo(context);
        mediaNetworkInfo.networkType = Connectivity.getNetworkType(networkInfo);
        if (networkInfo != null) {
            mediaNetworkInfo.networkSubtype = networkInfo.getSubtype();
        }
        mediaNetworkInfo.dnsList = Connectivity.getDnsList();
        if (mediaNetworkInfo.networkType != 2) {
            AgoraPhoneStateListener agoraPhoneStateListener = this.mPhoneStateListener;
            if (agoraPhoneStateListener != null) {
                try {
                    mediaNetworkInfo.rssi = agoraPhoneStateListener.getRssi();
                    mediaNetworkInfo.signalLevel = this.mPhoneStateListener.getLevel();
                    mediaNetworkInfo.asu = this.mPhoneStateListener.getAsuLevel();
                } catch (Exception unused) {
                }
            }
        } else if (!checkAccessWifiState(context)) {
            mediaNetworkInfo.ssid = "";
            mediaNetworkInfo.bssid = "";
            mediaNetworkInfo.rssi = 0;
            mediaNetworkInfo.signalLevel = 0;
            mediaNetworkInfo.frequency = 0;
            mediaNetworkInfo.linkspeed = 0;
            return mediaNetworkInfo;
        } else {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
            if (!(dhcpInfo == null || (intToInetAddress = intToInetAddress(dhcpInfo.gateway)) == null)) {
                mediaNetworkInfo.gatewayIp4 = intToInetAddress.getHostAddress();
            }
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null) {
                mediaNetworkInfo.ssid = "";
                mediaNetworkInfo.bssid = "";
                int rssi = connectionInfo.getRssi();
                mediaNetworkInfo.rssi = rssi;
                mediaNetworkInfo.signalLevel = WifiManager.calculateSignalLevel(rssi, 5);
                mediaNetworkInfo.linkspeed = connectionInfo.getLinkSpeed();
                int frequency = connectionInfo.getFrequency();
                mediaNetworkInfo.frequency = frequency;
                if (frequency >= 5000) {
                    mediaNetworkInfo.networkSubtype = 101;
                } else if (frequency >= 2400) {
                    mediaNetworkInfo.networkSubtype = 100;
                }
            }
        }
        return mediaNetworkInfo;
    }

    private void enableOrientationListener(Context context) {
        try {
            if (this.mOrientationListener == null) {
                this.mOrientationListener = new OrientationEventListener(context, 2) {
                    public void onOrientationChanged(int i) {
                        if (i != -1) {
                            CommonUtility.this.checkOrientation(i);
                        }
                    }
                };
            }
            this.mOrientationListener.enable();
            Logging.i(TAG, "[enableOrientationListener] done!");
        } catch (Exception e) {
            Logging.e(TAG, "Unable to create OrientationEventListener, ", e);
        }
    }

    private static String getAndroidID(Context context) {
        return "";
    }

    public static String getAppPrivateStorageDir(Context context) {
        File externalFilesDir;
        if (!"mounted".equals(Environment.getExternalStorageState()) || (externalFilesDir = context.getExternalFilesDir((String) null)) == null) {
            return context.getFilesDir().getAbsolutePath();
        }
        return externalFilesDir.getAbsolutePath();
    }

    private String getAssetsCacheFile(Context context, String str) {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        String str2 = TAG;
        Logging.i(str2, "getAssetsCacheFile filePath: " + str);
        boolean startsWith = str.startsWith(PREFIX_URI);
        try {
            File file = new File(context.getCacheDir(), "wm_image_cache");
            if (file.exists()) {
                file.delete();
            }
            if (startsWith) {
                inputStream = new FileInputStream(context.getContentResolver().openFileDescriptor(Uri.parse(str), "r").getFileDescriptor());
            } else {
                inputStream = context.getAssets().open(str);
            }
            try {
                fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        inputStream.close();
                        return file.getAbsolutePath();
                    }
                }
            } catch (Throwable th) {
                inputStream.close();
                throw th;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private AudioManager getAudioManager(Context context) {
        if (context == null) {
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    public static byte[] getContextInfo(Context context) {
        if (context == null) {
            return null;
        }
        RtcEngineMessage.PAndroidContextInfo pAndroidContextInfo = new RtcEngineMessage.PAndroidContextInfo();
        pAndroidContextInfo.device = DeviceUtils.buildDeviceId();
        pAndroidContextInfo.deviceInfo = DeviceUtils.getDeviceInfo();
        pAndroidContextInfo.systemInfo = DeviceUtils.getSystemInfo();
        pAndroidContextInfo.configDir = getAppPrivateStorageDir(context);
        pAndroidContextInfo.dataDir = context.getCacheDir().getAbsolutePath();
        pAndroidContextInfo.pluginDir = context.getApplicationInfo().nativeLibraryDir;
        pAndroidContextInfo.androidID = "";
        if (TextUtils.isEmpty(pAndroidContextInfo.device)) {
            pAndroidContextInfo.device = "";
        }
        if (TextUtils.isEmpty(pAndroidContextInfo.deviceInfo)) {
            pAndroidContextInfo.deviceInfo = "";
        }
        if (TextUtils.isEmpty(pAndroidContextInfo.systemInfo)) {
            pAndroidContextInfo.systemInfo = "";
        }
        if (TextUtils.isEmpty(pAndroidContextInfo.configDir)) {
            pAndroidContextInfo.configDir = "";
        }
        if (TextUtils.isEmpty(pAndroidContextInfo.dataDir)) {
            pAndroidContextInfo.dataDir = "";
        }
        if (TextUtils.isEmpty(pAndroidContextInfo.pluginDir)) {
            pAndroidContextInfo.pluginDir = "";
        }
        if (TextUtils.isEmpty(pAndroidContextInfo.androidID)) {
            pAndroidContextInfo.androidID = "";
        }
        return pAndroidContextInfo.marshall();
    }

    public static String getLocalHost() {
        try {
            for (T t : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (!t.getName().startsWith("usb")) {
                    for (T inetAddressToIpAddress : Collections.list(t.getInetAddresses())) {
                        String inetAddressToIpAddress2 = inetAddressToIpAddress(inetAddressToIpAddress);
                        if (inetAddressToIpAddress2 != null && !inetAddressToIpAddress2.isEmpty()) {
                            return inetAddressToIpAddress2;
                        }
                    }
                    continue;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String[] getLocalHostList() {
        try {
            ArrayList<T> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (!t.getName().startsWith("usb")) {
                    for (T inetAddressToIpAddress : Collections.list(t.getInetAddresses())) {
                        String inetAddressToIpAddress2 = inetAddressToIpAddress(inetAddressToIpAddress);
                        if (inetAddressToIpAddress2 != null) {
                            arrayList.add(inetAddressToIpAddress2);
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            String[] strArr = new String[arrayList.size()];
            int i = 0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                strArr[i] = (String) it.next();
                i++;
            }
            return strArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getRandomUUID() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }

    private static String getSystemProperty(String str) throws Exception {
        Class<?> cls = Class.forName("android.os.SystemProperties");
        return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
    }

    private static String inetAddressToIpAddress(InetAddress inetAddress) {
        if (inetAddress.isLoopbackAddress()) {
            return null;
        }
        if (inetAddress instanceof Inet4Address) {
            return ((Inet4Address) inetAddress).getHostAddress();
        }
        boolean z = inetAddress instanceof Inet6Address;
        return null;
    }

    private static InetAddress intToInetAddress(int i) {
        try {
            return InetAddress.getByAddress(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)});
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isSimulatorProperty() {
        /*
            r11 = this;
            java.lang.String r0 = "android"
            java.lang.String r1 = ""
            java.lang.String r2 = android.os.Build.MANUFACTURER
            r3 = 0
            r4 = 1
            java.lang.String r5 = "ro.hardware"
            java.lang.String r1 = getSystemProperty(r5)     // Catch:{ Exception -> 0x001e }
            if (r1 == 0) goto L_0x001c
            java.lang.String r5 = r1.toLowerCase()     // Catch:{ Exception -> 0x001e }
            java.lang.String r6 = "intel"
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x001e }
            if (r5 == 0) goto L_0x0025
        L_0x001c:
            r5 = r4
            goto L_0x0026
        L_0x001e:
            java.lang.String r5 = TAG
            java.lang.String r6 = "get property hardware fail."
            io.agora.rtc.internal.Logging.e(r5, r6)
        L_0x0025:
            r5 = r3
        L_0x0026:
            java.lang.String r6 = TAG
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "hardware = "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r8 = ", suspectCount = "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            io.agora.rtc.internal.Logging.i(r6, r7)
            java.lang.String r7 = "os.arch"
            java.lang.String r7 = java.lang.System.getProperty(r7)     // Catch:{ Exception -> 0x0081 }
            if (r7 == 0) goto L_0x0064
            java.lang.String r9 = r7.toLowerCase()     // Catch:{ Exception -> 0x0081 }
            java.lang.String r10 = "i686"
            boolean r9 = r9.equals(r10)     // Catch:{ Exception -> 0x0081 }
            if (r9 == 0) goto L_0x0088
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ Exception -> 0x0081 }
            java.lang.String r9 = "asus"
            boolean r2 = r2.contains(r9)     // Catch:{ Exception -> 0x0081 }
            if (r2 != 0) goto L_0x0088
        L_0x0064:
            int r5 = r5 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0081 }
            r2.<init>()     // Catch:{ Exception -> 0x0081 }
            java.lang.String r9 = "arch = "
            r2.append(r9)     // Catch:{ Exception -> 0x0081 }
            r2.append(r7)     // Catch:{ Exception -> 0x0081 }
            r2.append(r8)     // Catch:{ Exception -> 0x0081 }
            r2.append(r5)     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0081 }
            io.agora.rtc.internal.Logging.i(r6, r2)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0088
        L_0x0081:
            java.lang.String r2 = TAG
            java.lang.String r6 = "get property arch fail."
            io.agora.rtc.internal.Logging.e(r2, r6)
        L_0x0088:
            int r2 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r2 <= r6) goto L_0x0157
            java.lang.String r2 = r1.toLowerCase()
            java.lang.String r6 = "ttvm"
            boolean r2 = r2.contains(r6)
            if (r2 == 0) goto L_0x009d
        L_0x009a:
            int r5 = r5 + 10
            goto L_0x00aa
        L_0x009d:
            java.lang.String r1 = r1.toLowerCase()
            java.lang.String r2 = "nox"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x00aa
            goto L_0x009a
        L_0x00aa:
            java.lang.String r1 = "ro.build.flavor"
            java.lang.String r1 = getSystemProperty(r1)     // Catch:{ Exception -> 0x00e1 }
            if (r1 == 0) goto L_0x00c2
            java.lang.String r2 = "vbox"
            boolean r2 = r1.contains(r2)     // Catch:{ Exception -> 0x00e1 }
            if (r2 != 0) goto L_0x00c2
            java.lang.String r2 = "sdk_gphone"
            boolean r2 = r1.contains(r2)     // Catch:{ Exception -> 0x00e1 }
            if (r2 == 0) goto L_0x00e8
        L_0x00c2:
            int r5 = r5 + 1
            java.lang.String r2 = TAG     // Catch:{ Exception -> 0x00e1 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e1 }
            r6.<init>()     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r7 = "buildFlavor = "
            r6.append(r7)     // Catch:{ Exception -> 0x00e1 }
            r6.append(r1)     // Catch:{ Exception -> 0x00e1 }
            r6.append(r8)     // Catch:{ Exception -> 0x00e1 }
            r6.append(r5)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x00e1 }
            io.agora.rtc.internal.Logging.i(r2, r1)     // Catch:{ Exception -> 0x00e1 }
            goto L_0x00e8
        L_0x00e1:
            java.lang.String r1 = TAG
            java.lang.String r2 = "get property buildFlavor fail."
            io.agora.rtc.internal.Logging.e(r1, r2)
        L_0x00e8:
            java.lang.String r1 = "ro.product.board"
            java.lang.String r1 = getSystemProperty(r1)     // Catch:{ Exception -> 0x011c }
            if (r1 == 0) goto L_0x00fd
            boolean r2 = r1.contains(r0)     // Catch:{ Exception -> 0x011c }
            java.lang.String r6 = "goldfish"
            boolean r6 = r1.contains(r6)     // Catch:{ Exception -> 0x011c }
            r2 = r2 | r6
            if (r2 == 0) goto L_0x0123
        L_0x00fd:
            int r5 = r5 + 1
            java.lang.String r2 = TAG     // Catch:{ Exception -> 0x011c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011c }
            r6.<init>()     // Catch:{ Exception -> 0x011c }
            java.lang.String r7 = "productBoard = "
            r6.append(r7)     // Catch:{ Exception -> 0x011c }
            r6.append(r1)     // Catch:{ Exception -> 0x011c }
            r6.append(r8)     // Catch:{ Exception -> 0x011c }
            r6.append(r5)     // Catch:{ Exception -> 0x011c }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x011c }
            io.agora.rtc.internal.Logging.i(r2, r1)     // Catch:{ Exception -> 0x011c }
            goto L_0x0123
        L_0x011c:
            java.lang.String r1 = TAG
            java.lang.String r2 = "get property productBoard fail."
            io.agora.rtc.internal.Logging.e(r1, r2)
        L_0x0123:
            java.lang.String r1 = "ro.board.platform"
            java.lang.String r1 = getSystemProperty(r1)     // Catch:{ Exception -> 0x0150 }
            if (r1 == 0) goto L_0x0131
            boolean r0 = r1.contains(r0)     // Catch:{ Exception -> 0x0150 }
            if (r0 == 0) goto L_0x0157
        L_0x0131:
            int r5 = r5 + 1
            java.lang.String r0 = TAG     // Catch:{ Exception -> 0x0150 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0150 }
            r2.<init>()     // Catch:{ Exception -> 0x0150 }
            java.lang.String r6 = "boardPlatform = "
            r2.append(r6)     // Catch:{ Exception -> 0x0150 }
            r2.append(r1)     // Catch:{ Exception -> 0x0150 }
            r2.append(r8)     // Catch:{ Exception -> 0x0150 }
            r2.append(r5)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x0150 }
            io.agora.rtc.internal.Logging.i(r0, r1)     // Catch:{ Exception -> 0x0150 }
            goto L_0x0157
        L_0x0150:
            java.lang.String r0 = TAG
            java.lang.String r1 = "get property boardPlatform fail."
            io.agora.rtc.internal.Logging.e(r0, r1)
        L_0x0157:
            if (r5 <= 0) goto L_0x015a
            r3 = r4
        L_0x015a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.internal.CommonUtility.isSimulatorProperty():boolean");
    }

    private void monitorOrientationChange(Context context, boolean z) {
        if (z) {
            enableOrientationListener(context);
            regiseterBroadcaster(context);
            return;
        }
        disableOrientationListener();
        unregisterBroadcaster(context);
    }

    private native void nativeAudioRoutingPhoneChanged(long j, boolean z, int i, int i2);

    private native int nativeNotifyNetworkChange(long j, byte[] bArr);

    private native int nativeNotifyOrientationChange(long j, int i);

    private void regiseterBroadcaster(Context context) {
        if (context != null) {
            this.mOrientationObserver = new BroadcastReceiver() {
                public void onReceive(Context context, Intent intent) {
                    if (intent.getAction().equals("android.intent.action.CONFIGURATION_CHANGED") && CommonUtility.this.mAccessible) {
                        CommonUtility.this.updateViewOrientation();
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.CONFIGURATION_CHANGED");
            context.registerReceiver(this.mOrientationObserver, intentFilter);
            Logging.i(TAG, "[regiseterBroadcaster] done!");
        }
    }

    private void unregisterBroadcaster(Context context) {
        BroadcastReceiver broadcastReceiver;
        if (context != null && (broadcastReceiver = this.mOrientationObserver) != null) {
            context.unregisterReceiver(broadcastReceiver);
            Logging.i(TAG, "[unregisterBroadcaster] done!");
        }
    }

    /* access modifiers changed from: private */
    public void updateViewOrientation() {
        if (this.mContext.get() == null || !this.mAccessible) {
            Logging.e(TAG, "[updateViewOrientation] mContext is null or mAccessible is false!");
            return;
        }
        Display defaultDisplay = ((WindowManager) ((Context) this.mContext.get()).getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay == null) {
            Logging.e(TAG, "[updateViewOrientation] display is null!");
            return;
        }
        int rotation = defaultDisplay.getRotation();
        if (rotation != this.mOrientation) {
            if (rotation == 0) {
                this.mOrientation = 0;
                nativeNotifyOrientationChange(this.mBridgeHandle, 0);
            } else if (rotation == 1) {
                this.mOrientation = 1;
                nativeNotifyOrientationChange(this.mBridgeHandle, 1);
            } else if (rotation == 2) {
                this.mOrientation = 2;
                nativeNotifyOrientationChange(this.mBridgeHandle, 2);
            } else if (rotation == 3) {
                this.mOrientation = 3;
                nativeNotifyOrientationChange(this.mBridgeHandle, 3);
            }
        }
    }

    public void destroy() {
        this.mAccessible = false;
        Context context = (Context) this.mContext.get();
        if (!(this.mPhoneStateListener == null || context == null)) {
            ((TelephonyManager) context.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE)).listen(this.mPhoneStateListener, 0);
            this.mPhoneStateListener = null;
        }
        monitorConnectionEvent(false);
        monitorPowerChange(false);
        monitorOrientationChange(context, false);
        this.mContext.clear();
        Logging.i(TAG, "[destroy] done!");
    }

    public int getAndroidVersion() {
        return Build.VERSION.SDK_INT;
    }

    public int getBatteryLifePercent() {
        if (((Context) this.mContext.get()) == null || !this.mAccessible) {
            return 255;
        }
        return this.batteryPercentage;
    }

    public int getFrontCameraIndex(Context context) {
        return DeviceUtils.selectFrontCamera(context);
    }

    public byte[] getNetworkInfo() {
        RtcEngineMessage.MediaNetworkInfo doGetNetworkInfo;
        Context context = (Context) this.mContext.get();
        if (context == null || !this.mAccessible || (doGetNetworkInfo = doGetNetworkInfo(context)) == null) {
            return null;
        }
        return doGetNetworkInfo.marshall();
    }

    public int getNetworkType() {
        Context context = (Context) this.mContext.get();
        if (context == null || !this.mAccessible || !checkAccessNetworkState(context)) {
            return -1;
        }
        return Connectivity.getNetworkType(context);
    }

    public int getNumberOfCameras(Context context) {
        return DeviceUtils.getNumberOfCameras(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060 A[Catch:{ Exception -> 0x0079 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int isSimulator() {
        /*
            r10 = this;
            java.lang.String r0 = "unknown"
            java.lang.String r1 = ""
            r2 = 28
            r3 = 0
            r4 = 1
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0049 }
            r6 = 26
            if (r5 >= r6) goto L_0x0011
            java.lang.String r7 = android.os.Build.SERIAL     // Catch:{ Exception -> 0x0049 }
            goto L_0x0019
        L_0x0011:
            if (r5 > r2) goto L_0x0018
            java.lang.String r7 = android.os.Build.getSerial()     // Catch:{ Exception -> 0x0049 }
            goto L_0x0019
        L_0x0018:
            r7 = r1
        L_0x0019:
            java.lang.String r8 = r7.toLowerCase()     // Catch:{ Exception -> 0x004a }
            boolean r8 = r8.equals(r0)     // Catch:{ Exception -> 0x004a }
            if (r8 == 0) goto L_0x0047
            if (r5 >= r6) goto L_0x0047
            java.lang.String r5 = TAG     // Catch:{ Exception -> 0x0045 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0045 }
            r6.<init>()     // Catch:{ Exception -> 0x0045 }
            java.lang.String r8 = "serial = "
            r6.append(r8)     // Catch:{ Exception -> 0x0045 }
            r6.append(r7)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r8 = ", suspectCount = "
            r6.append(r8)     // Catch:{ Exception -> 0x0045 }
            r6.append(r4)     // Catch:{ Exception -> 0x0045 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0045 }
            io.agora.rtc.internal.Logging.i(r5, r6)     // Catch:{ Exception -> 0x0045 }
            r5 = r4
            goto L_0x0052
        L_0x0045:
            r5 = r4
            goto L_0x004b
        L_0x0047:
            r5 = r3
            goto L_0x0052
        L_0x0049:
            r7 = r1
        L_0x004a:
            r5 = r3
        L_0x004b:
            java.lang.String r6 = TAG
            java.lang.String r8 = "get serial info fail."
            io.agora.rtc.internal.Logging.e(r6, r8)
        L_0x0052:
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0079 }
            java.lang.String r6 = r1.toLowerCase()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r8 = "netease"
            boolean r6 = r6.contains(r8)     // Catch:{ Exception -> 0x0079 }
            if (r6 == 0) goto L_0x0062
            int r5 = r5 + 1
        L_0x0062:
            java.lang.String r6 = TAG     // Catch:{ Exception -> 0x0079 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0079 }
            r8.<init>()     // Catch:{ Exception -> 0x0079 }
            java.lang.String r9 = "manufacturer = "
            r8.append(r9)     // Catch:{ Exception -> 0x0079 }
            r8.append(r1)     // Catch:{ Exception -> 0x0079 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0079 }
            io.agora.rtc.internal.Logging.i(r6, r8)     // Catch:{ Exception -> 0x0079 }
            goto L_0x0080
        L_0x0079:
            java.lang.String r6 = TAG
            java.lang.String r8 = "get manufacturer info fail."
            io.agora.rtc.internal.Logging.e(r6, r8)
        L_0x0080:
            boolean r6 = r10.isSimulatorProperty()
            if (r6 == 0) goto L_0x0088
            int r5 = r5 + 1
        L_0x0088:
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.String r8 = "welldo"
            if (r6 <= r2) goto L_0x00b8
            java.lang.String r0 = "nokia"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00ab
            java.lang.String r0 = android.os.Build.DEVICE
            java.lang.String r2 = "Nokia_N1"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x00aa
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r2 = "N1"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00ab
        L_0x00aa:
            return r3
        L_0x00ab:
            if (r5 <= 0) goto L_0x00cf
            java.lang.String r0 = r1.toLowerCase()
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x00cf
            return r4
        L_0x00b8:
            java.lang.String r2 = r7.toLowerCase()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00c4
            if (r5 <= 0) goto L_0x00cf
        L_0x00c4:
            java.lang.String r0 = r1.toLowerCase()
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x00cf
            return r4
        L_0x00cf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.internal.CommonUtility.isSimulator():int");
    }

    public int isSpeakerphoneEnabled(Context context) {
        if (context == null) {
            return 0;
        }
        return getAudioManager(context).isSpeakerphoneOn() ? 1 : 0;
    }

    public void monitorConnectionEvent(boolean z) {
        ConnectionChangeBroadcastReceiver connectionChangeBroadcastReceiver;
        ConnectionChangeBroadcastReceiver connectionChangeBroadcastReceiver2;
        if (!z) {
            try {
                Context context = (Context) this.mContext.get();
                if (!(context == null || (connectionChangeBroadcastReceiver = this.mConnectionBroadcastReceiver) == null)) {
                    context.unregisterReceiver(connectionChangeBroadcastReceiver);
                }
            } catch (IllegalArgumentException unused) {
            }
            this.mConnectionBroadcastReceiver = null;
        } else if (this.mConnectionBroadcastReceiver == null) {
            try {
                this.mConnectionBroadcastReceiver = new ConnectionChangeBroadcastReceiver(this);
                Context context2 = (Context) this.mContext.get();
                if (context2 != null && (connectionChangeBroadcastReceiver2 = this.mConnectionBroadcastReceiver) != null) {
                    context2.registerReceiver(connectionChangeBroadcastReceiver2, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            } catch (Exception e) {
                Logging.e(TAG, "Unable to create ConnectionChangeBroadcastReceiver, ", e);
            }
        }
    }

    public void monitorPowerChange(boolean z) {
        PowerConnectionReceiver powerConnectionReceiver;
        if (!z) {
            try {
                Context context = (Context) this.mContext.get();
                if (!(context == null || (powerConnectionReceiver = this.mPowerConnectionReceiver) == null)) {
                    context.unregisterReceiver(powerConnectionReceiver);
                }
            } catch (IllegalArgumentException unused) {
            }
            this.mPowerConnectionReceiver = null;
        } else if (this.mPowerConnectionReceiver == null) {
            try {
                this.mPowerConnectionReceiver = new PowerConnectionReceiver(this);
                Context context2 = (Context) this.mContext.get();
                if (context2 != null && this.mPowerConnectionReceiver != null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                    context2.registerReceiver(this.mPowerConnectionReceiver, intentFilter);
                }
            } catch (Exception e) {
                Logging.e(TAG, "Unable to create PowerConnectionReceiver, ", e);
            }
        }
    }

    public void notifyNetworkChange() {
        byte[] networkInfo;
        if (((Context) this.mContext.get()) != null && this.mAccessible && (networkInfo = getNetworkInfo()) != null && this.mAccessible) {
            nativeNotifyNetworkChange(this.mBridgeHandle, networkInfo);
        }
    }

    public void onPhoneStateChanged(boolean z, int i, int i2) {
        if (this.mBridgeHandle != 0 && this.mAccessible) {
            nativeAudioRoutingPhoneChanged(this.mBridgeHandle, z, i, i2);
        }
    }

    public void onPowerChange(int i) {
        if (((Context) this.mContext.get()) != null && this.mAccessible) {
            this.batteryPercentage = i;
        }
    }

    public void updateLocalVideoEnableState(boolean z) {
        String str = TAG;
        Logging.d(str, "updateLocalVideoEnableState: " + z);
        this.mLocalVideoEnabled = z;
    }

    public void updateVideoSourceType(int i) {
        String str = TAG;
        Logging.d(str, "updateVideoSourceType: " + i);
        this.mVideoSourceType = i;
    }

    private void checkVoipPermissions(Context context) throws SecurityException {
        checkVoipPermissions(context, "android.permission.INTERNET");
        checkVoipPermissions(context, "android.permission.RECORD_AUDIO");
        checkVoipPermissions(context, "android.permission.MODIFY_AUDIO_SETTINGS");
    }

    private int checkVoipPermissions(Context context, int i) {
        if (i == 1) {
            try {
                checkVoipPermissions(context);
                return 0;
            } catch (SecurityException e) {
                Logging.e(TAG, "Do not have enough permission! ", e);
                return -9;
            }
        } else if (i != 2) {
            return -2;
        } else {
            try {
                checkVoipPermissions(context, "android.permission.INTERNET");
                return 0;
            } catch (SecurityException unused) {
                Logging.e(TAG, "Do not have Internet permission!");
                return -9;
            }
        }
    }
}
