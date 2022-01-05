package io.agora.rtc.audio;

import android.content.Context;
import io.agora.rtc.internal.Logging;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HuaweiHardwareEarback implements IHardwareEarback {
    private static final String TAG = "HuaweiHardwareEarback";
    public Class clsAudioKitCallback = null;
    public Class clsHwAudioKaraokeFeatureKit = null;
    public Class clsHwAudioKit = null;
    private int latency = 0;
    private boolean mClsInited = false;
    private Context mContext = null;
    private boolean mEarbackEnabled = false;
    private Object mHwAudioKaraokeFeatureKit = null;
    private Object mHwAudioKit = null;
    /* access modifiers changed from: private */
    public boolean mInited = false;
    private int volume = 0;

    public HuaweiHardwareEarback(Context context) {
        Logging.d(TAG, ">>ctor");
        this.mContext = context;
        initialize();
    }

    public static boolean hasHwAudioKitClass() {
        return (ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.IAudioKitCallback") == null || ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.HwAudioKit") == null || ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit") == null) ? false : true;
    }

    public void destroy() {
        Logging.d(TAG, ">>destroy");
        Object obj = this.mHwAudioKaraokeFeatureKit;
        if (obj != null) {
            ReflectUtils.safeCallMethod(this.clsHwAudioKaraokeFeatureKit, obj, "destroy", new Class[0], new Object[0]);
        }
        Object obj2 = this.mHwAudioKit;
        if (obj2 != null) {
            ReflectUtils.safeCallMethod(this.clsHwAudioKit, obj2, "destroy", new Class[0], new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00db, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00dd, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int enableEarbackFeature(boolean r10) {
        /*
            r9 = this;
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            monitor-enter(r9)
            boolean r1 = r9.mInited     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x00de
            boolean r1 = r9.mClsInited     // Catch:{ all -> 0x00e1 }
            if (r1 != 0) goto L_0x000d
            goto L_0x00de
        L_0x000d:
            java.lang.String r1 = "HuaweiHardwareEarback"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e1 }
            r2.<init>()     // Catch:{ all -> 0x00e1 }
            java.lang.String r3 = ">>enableEarbackFeature "
            r2.append(r3)     // Catch:{ all -> 0x00e1 }
            r2.append(r10)     // Catch:{ all -> 0x00e1 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00e1 }
            io.agora.rtc.internal.Logging.d(r1, r2)     // Catch:{ all -> 0x00e1 }
            java.lang.Class r1 = r9.clsHwAudioKaraokeFeatureKit     // Catch:{ all -> 0x00e1 }
            java.lang.Object r2 = r9.mHwAudioKaraokeFeatureKit     // Catch:{ all -> 0x00e1 }
            java.lang.String r3 = "isKaraokeFeatureSupport"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x00e1 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x00e1 }
            java.lang.Object r1 = io.agora.rtc.audio.ReflectUtils.safeCallMethod(r1, r2, r3, r5, r6)     // Catch:{ all -> 0x00e1 }
            r2 = -1
            if (r1 == 0) goto L_0x00dc
            java.lang.Class r3 = r1.getClass()     // Catch:{ all -> 0x00e1 }
            java.lang.Class<java.lang.Boolean> r5 = java.lang.Boolean.class
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x00e1 }
            if (r3 != 0) goto L_0x0043
            goto L_0x00dc
        L_0x0043:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00e1 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00e1 }
            if (r1 != 0) goto L_0x0054
            java.lang.String r10 = "HuaweiHardwareEarback"
            java.lang.String r0 = "karaoke not supported"
            io.agora.rtc.internal.Logging.e(r10, r0)     // Catch:{ all -> 0x00e1 }
            monitor-exit(r9)
            return r2
        L_0x0054:
            java.lang.Class r1 = r9.clsHwAudioKaraokeFeatureKit     // Catch:{ all -> 0x00e1 }
            java.lang.Object r3 = r9.mHwAudioKaraokeFeatureKit     // Catch:{ all -> 0x00e1 }
            java.lang.String r5 = "enableKaraokeFeature"
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ all -> 0x00e1 }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00e1 }
            r7[r4] = r8     // Catch:{ all -> 0x00e1 }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00e1 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x00e1 }
            r6[r4] = r8     // Catch:{ all -> 0x00e1 }
            java.lang.Object r1 = io.agora.rtc.audio.ReflectUtils.safeCallMethod(r1, r3, r5, r7, r6)     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x00da
            java.lang.Class r3 = r1.getClass()     // Catch:{ all -> 0x00e1 }
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x00e1 }
            if (r3 != 0) goto L_0x007a
            goto L_0x00da
        L_0x007a:
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x00e1 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x009a
            java.lang.String r10 = "HuaweiHardwareEarback"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e1 }
            r0.<init>()     // Catch:{ all -> 0x00e1 }
            java.lang.String r3 = "enableKaraokeFeature failed ret "
            r0.append(r3)     // Catch:{ all -> 0x00e1 }
            r0.append(r1)     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00e1 }
            io.agora.rtc.internal.Logging.e(r10, r0)     // Catch:{ all -> 0x00e1 }
            monitor-exit(r9)
            return r2
        L_0x009a:
            r9.mEarbackEnabled = r10     // Catch:{ all -> 0x00e1 }
            if (r10 == 0) goto L_0x00d8
            java.lang.Class r10 = r9.clsHwAudioKaraokeFeatureKit     // Catch:{ all -> 0x00e1 }
            java.lang.Object r1 = r9.mHwAudioKaraokeFeatureKit     // Catch:{ all -> 0x00e1 }
            java.lang.String r2 = "getKaraokeLatency"
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ all -> 0x00e1 }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x00e1 }
            java.lang.Object r10 = io.agora.rtc.audio.ReflectUtils.safeCallMethod(r10, r1, r2, r3, r5)     // Catch:{ all -> 0x00e1 }
            if (r10 == 0) goto L_0x00b8
            java.lang.Class r1 = r10.getClass()     // Catch:{ all -> 0x00e1 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x00c0
        L_0x00b8:
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x00e1 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x00e1 }
            r9.latency = r10     // Catch:{ all -> 0x00e1 }
        L_0x00c0:
            java.lang.String r10 = "HuaweiHardwareEarback"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e1 }
            r0.<init>()     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = "latency "
            r0.append(r1)     // Catch:{ all -> 0x00e1 }
            int r1 = r9.latency     // Catch:{ all -> 0x00e1 }
            r0.append(r1)     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00e1 }
            io.agora.rtc.internal.Logging.i(r10, r0)     // Catch:{ all -> 0x00e1 }
        L_0x00d8:
            monitor-exit(r9)
            return r4
        L_0x00da:
            monitor-exit(r9)
            return r2
        L_0x00dc:
            monitor-exit(r9)
            return r2
        L_0x00de:
            r10 = -7
            monitor-exit(r9)
            return r10
        L_0x00e1:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.audio.HuaweiHardwareEarback.enableEarbackFeature(boolean):int");
    }

    public void finalize() throws Throwable {
        Logging.d(TAG, ">>finalize");
        destroy();
        super.finalize();
    }

    public void initialize() {
        Constructor constructor;
        if (this.mContext == null) {
            Logging.e(TAG, "mContext is null!");
            return;
        }
        Logging.d(TAG, ">>initialize");
        this.clsHwAudioKit = ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.HwAudioKit");
        this.clsAudioKitCallback = ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.IAudioKitCallback");
        Class safeFindClass = ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit");
        this.clsHwAudioKaraokeFeatureKit = safeFindClass;
        Class cls = this.clsAudioKitCallback;
        if (cls != null && this.clsHwAudioKit != null && safeFindClass != null) {
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{this.clsAudioKitCallback}, new InvocationHandler() {
                public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                    if (!method.getName().equals("onResult")) {
                        return null;
                    }
                    int intValue = objArr[0].intValue();
                    if (intValue == 0) {
                        Logging.i(HuaweiHardwareEarback.TAG, "IAudioKitCallback: HwAudioKit init success");
                        return null;
                    } else if (intValue == 2) {
                        Logging.i(HuaweiHardwareEarback.TAG, "IAudioKitCallback: audio kit not installed");
                        return null;
                    } else if (intValue != 1000) {
                        Logging.e(HuaweiHardwareEarback.TAG, "IAudioKitCallback: onResult error number " + intValue);
                        return null;
                    } else {
                        boolean unused = HuaweiHardwareEarback.this.mInited = true;
                        Logging.i(HuaweiHardwareEarback.TAG, "IAudioKitCallback: HwAudioKaraokeFeatureKit init success ");
                        return null;
                    }
                }
            });
            Method method = null;
            try {
                constructor = this.clsHwAudioKit.getConstructor(new Class[]{Context.class, this.clsAudioKitCallback});
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
                constructor = null;
            }
            if (constructor == null) {
                Logging.e(TAG, "find HwAudioKit constructor failed");
                return;
            }
            try {
                this.mHwAudioKit = constructor.newInstance(new Object[]{this.mContext, newProxyInstance});
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (this.mHwAudioKit == null) {
                Logging.e(TAG, "create HwAudioKit failed");
                return;
            }
            try {
                Method method2 = this.clsHwAudioKit.getMethod("initialize", new Class[0]);
                if (method2 != null) {
                    method2.invoke(this.mHwAudioKit, new Object[0]);
                }
                Class safeFindClass2 = ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.HwAudioKit$FeatureType");
                if (safeFindClass2 == null) {
                    Logging.e(TAG, "cannot find class  HwAudioKit$FeatureType initialize failed");
                    return;
                }
                Object obj = safeFindClass2.isEnum() ? safeFindClass2.getEnumConstants()[0] : null;
                if (obj == null) {
                    Logging.e(TAG, "cannot find class  HwAudioKit$FeatureType initialize failed");
                    return;
                }
                try {
                    method = this.clsHwAudioKit.getMethod("createFeature", new Class[]{safeFindClass2});
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                }
                if (method == null) {
                    Logging.e(TAG, "cannot find method createFeature ");
                    return;
                }
                try {
                    this.mHwAudioKaraokeFeatureKit = method.invoke(this.mHwAudioKit, new Object[]{obj});
                } catch (IllegalAccessException e4) {
                    e4.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                }
                if (this.mHwAudioKaraokeFeatureKit == null) {
                    Logging.e(TAG, " createFeature failed");
                } else {
                    this.mClsInited = true;
                }
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
                Logging.e(TAG, "create HwAudioKit initialize failed");
            } catch (IllegalAccessException e7) {
                e7.printStackTrace();
                Logging.e(TAG, "create HwAudioKit initialize failed");
            } catch (InvocationTargetException e8) {
                e8.printStackTrace();
                Logging.e(TAG, "create HwAudioKit initialize failed");
            }
        }
    }

    public boolean isHardwareEarbackSupported() {
        boolean z = false;
        if (this.mInited && this.mClsInited) {
            Logging.d(TAG, ">>isHardwareEarbackSupported");
            try {
                z = ((Boolean) ReflectUtils.safeCallMethod(this.clsHwAudioKaraokeFeatureKit, this.mHwAudioKaraokeFeatureKit, "isKaraokeFeatureSupport", new Class[0], new Object[0])).booleanValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
            Logging.d(TAG, "isSupported " + z);
        }
        return z;
    }

    public synchronized int setHardwareEarbackVolume(int i) {
        int i2;
        if (this.mInited) {
            if (this.mClsInited) {
                Logging.d(TAG, ">>setHardwareEarbackVolume " + i);
                if (i < 0) {
                    i = 0;
                } else if (i > 100) {
                    i = 100;
                }
                Class safeFindClass = ReflectUtils.safeFindClass("com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit$ParameName");
                if (safeFindClass == null) {
                    Logging.e(TAG, "cannot find method  ParameName.getParameName");
                    return -1;
                }
                Method safeGetMethod = ReflectUtils.safeGetMethod(safeFindClass, "getParameName", new Class[0]);
                if (safeGetMethod == null) {
                    Logging.e(TAG, "cannot find method  ParameName.getParameName");
                    return -1;
                }
                Object obj = null;
                try {
                    for (Object obj2 : safeFindClass.getEnumConstants()) {
                        Object invoke = safeGetMethod.invoke(obj2, new Object[0]);
                        if (invoke != null && ((String) invoke).equals("Karaoke_volume=")) {
                            obj = obj2;
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e2) {
                    e2.printStackTrace();
                }
                if (obj == null) {
                    Logging.e(TAG, "cannot find object  ParameName.CMD_SET_VOCAL_VOLUME_BASE");
                    return -1;
                }
                try {
                    i2 = ((Integer) ReflectUtils.safeCallMethod(this.clsHwAudioKaraokeFeatureKit, this.mHwAudioKaraokeFeatureKit, "setParameter", new Class[]{safeFindClass, Integer.TYPE}, new Object[]{obj, Integer.valueOf(i)})).intValue();
                } catch (Exception e3) {
                    e3.printStackTrace();
                    i2 = -1;
                }
                if (i2 != 0) {
                    Logging.e(TAG, "setParameter error number " + i2);
                    return -1;
                }
                this.volume = i;
                return 0;
            }
        }
        return -7;
    }
}
