package com.stripe.android.stripe3ds2.init;

import android.os.Build;
import com.stripe.android.stripe3ds2.utils.Supplier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import m0.j.g;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001aB\u001f\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0017\u0010\u0018B\u0017\b\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0017\u0010\u0019J\u001b\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR(\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028@@\u0001X\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\t\u0010\u0005R(\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028@@\u0001X\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\u0005R(\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028@@\u0001X\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\u0005R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl;", "Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;", "", "", "create", "()Ljava/util/Map;", "", "apiVersion", "I", "getPlatformVersionParams$3ds2sdk_release", "getPlatformVersionParams$3ds2sdk_release$annotations", "()V", "platformVersionParams", "getMarketOrRegionRestrictionParams$3ds2sdk_release", "getMarketOrRegionRestrictionParams$3ds2sdk_release$annotations", "marketOrRegionRestrictionParams", "getPermissionParams$3ds2sdk_release", "getPermissionParams$3ds2sdk_release$annotations", "permissionParams", "Lcom/stripe/android/stripe3ds2/utils/Supplier;", "Lcom/stripe/android/stripe3ds2/init/HardwareId;", "hardwareIdSupplier", "Lcom/stripe/android/stripe3ds2/utils/Supplier;", "<init>", "(ILcom/stripe/android/stripe3ds2/utils/Supplier;)V", "(Lcom/stripe/android/stripe3ds2/utils/Supplier;)V", "Reason", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DeviceParamNotAvailableFactoryImpl.kt */
public final class DeviceParamNotAvailableFactoryImpl implements DeviceParamNotAvailableFactory {
    private final int apiVersion;
    private final Supplier<HardwareId> hardwareIdSupplier;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactoryImpl$Reason;", "", "", "toString", "()Ljava/lang/String;", "code", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "MARKET_OR_REGION_RESTRICTION", "PLATFORM_VERSION", "PERMISSION", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DeviceParamNotAvailableFactoryImpl.kt */
    public enum Reason {
        MARKET_OR_REGION_RESTRICTION("RE01"),
        PLATFORM_VERSION("RE02"),
        PERMISSION("RE03");
        
        private final String code;

        private Reason(String str) {
            this.code = str;
        }

        public String toString() {
            return this.code;
        }
    }

    public DeviceParamNotAvailableFactoryImpl(int i, Supplier<HardwareId> supplier) {
        i.e(supplier, "hardwareIdSupplier");
        this.apiVersion = i;
        this.hardwareIdSupplier = supplier;
    }

    public static /* synthetic */ void getMarketOrRegionRestrictionParams$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getPermissionParams$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getPlatformVersionParams$3ds2sdk_release$annotations() {
    }

    public Map<String, String> create() {
        return g.b0(g.b0(getMarketOrRegionRestrictionParams$3ds2sdk_release(), getPlatformVersionParams$3ds2sdk_release()), getPermissionParams$3ds2sdk_release());
    }

    public final Map<String, String> getMarketOrRegionRestrictionParams$3ds2sdk_release() {
        HashMap hashMap = new HashMap();
        List K = g.K(DeviceParam.PARAM_PLATFORM, DeviceParam.PARAM_DEVICE_MODEL, DeviceParam.PARAM_OS_NAME, DeviceParam.PARAM_OS_VERSION, DeviceParam.PARAM_LOCALE, DeviceParam.PARAM_TIME_ZONE, DeviceParam.PARAM_HARDWARE_ID, DeviceParam.PARAM_SCREEN_RESOLUTION);
        DeviceParam[] values = DeviceParam.values();
        for (int i = 0; i < 148; i++) {
            DeviceParam deviceParam = values[i];
            if (!K.contains(deviceParam)) {
                hashMap.put(deviceParam.toString(), Reason.MARKET_OR_REGION_RESTRICTION.toString());
            }
        }
        return hashMap;
    }

    public final Map<String, String> getPermissionParams$3ds2sdk_release() {
        HashMap hashMap = new HashMap();
        String deviceParam = DeviceParam.PARAM_WIFI_MAC.toString();
        Reason reason = Reason.PERMISSION;
        hashMap.put(deviceParam, reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_BSSID.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_SSID.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_NETWORK_ID.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_IS_5GHZ_BAND_SUPPORTED.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_IS_DEVICE_TO_AP_RTT_SUPPORTED.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_IS_ENHANCED_POWER_REPORTING_SUPPORTED.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_IS_P2P_SUPPORTED.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_IS_PREFERRED_NETWORK_OFFLOAD_SUPPORTED.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_IS_SCAN_ALWAYS_AVAILABLE.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_WIFI_IS_TDLS_SUPPORTED.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_LATITUDE.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_LONGITUDE.toString(), reason.toString());
        if (!this.hardwareIdSupplier.get().isPresent()) {
            hashMap.put(DeviceParam.PARAM_HARDWARE_ID.toString(), Reason.PLATFORM_VERSION.toString());
        }
        hashMap.put(DeviceParam.PARAM_DEVICE_NAME.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_BLUETOOTH_ADDRESS.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_BLUETOOTH_BONDED_DEVICE.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_BLUETOOTH_IS_ENABLED.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_TELE_DEVICE_ID.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_TELE_SUBSCRIBER_ID.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_TELE_IMEI_SV.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_TELE_GROUP_IDENTIFIER_L1.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_TELE_SIM_SERIAL_NUMBER.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_TELE_VOICE_MAIL_ALPHA_TAG.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_TELE_VOICE_MAIL_NUMBER.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_TELE_IS_TTY_MODE_SUPPORTED.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_TELE_IS_WORLD_PHONE.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_BUILD_SERIAL.toString(), reason.toString());
        hashMap.put(DeviceParam.PARAM_SECURE_INSTALL_NON_MARKET_APPS.toString(), reason.toString());
        return hashMap;
    }

    public final Map<String, String> getPlatformVersionParams$3ds2sdk_release() {
        HashMap hashMap = new HashMap();
        if (this.apiVersion < 26) {
            String deviceParam = DeviceParam.PARAM_TELE_IMEI_SV.toString();
            Reason reason = Reason.PLATFORM_VERSION;
            hashMap.put(deviceParam, reason.toString());
            hashMap.put(DeviceParam.PARAM_BUILD_SERIAL.toString(), reason.toString());
            hashMap.put(DeviceParam.PARAM_SECURE_INSTALL_NON_MARKET_APPS.toString(), reason.toString());
        }
        if (this.apiVersion < 23) {
            String deviceParam2 = DeviceParam.PARAM_TELE_PHONE_COUNT.toString();
            Reason reason2 = Reason.PLATFORM_VERSION;
            hashMap.put(deviceParam2, reason2.toString());
            hashMap.put(DeviceParam.PARAM_TELE_IS_HEARING_AID_COMPATIBILITY_SUPPORTED.toString(), reason2.toString());
            hashMap.put(DeviceParam.PARAM_TELE_IS_TTY_MODE_SUPPORTED.toString(), reason2.toString());
            hashMap.put(DeviceParam.PARAM_TELE_IS_WORLD_PHONE.toString(), reason2.toString());
            hashMap.put(DeviceParam.PARAM_BUILD_VERSION_PREVIEW_SDK_INT.toString(), reason2.toString());
            hashMap.put(DeviceParam.PARAM_BUILD_VERSION_SDK_INT.toString(), reason2.toString());
            hashMap.put(DeviceParam.PARAM_BUILD_VERSION_SECURITY_PATCH.toString(), reason2.toString());
            hashMap.put(DeviceParam.PARAM_SYSTEM_DTMF_TONE_TYPE_WHEN_DIALING.toString(), reason2.toString());
            hashMap.put(DeviceParam.PARAM_SYSTEM_VIBRATE_WHEN_RINGING.toString(), reason2.toString());
        }
        if (this.apiVersion > 23) {
            hashMap.put(DeviceParam.PARAM_SECURE_SYS_PROP_SETTING_VERSION.toString(), Reason.PLATFORM_VERSION.toString());
        }
        if (this.apiVersion < 22) {
            hashMap.put(DeviceParam.PARAM_TELE_IS_VOICE_CAPABLE.toString(), Reason.PLATFORM_VERSION.toString());
        }
        return hashMap;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DeviceParamNotAvailableFactoryImpl(Supplier<HardwareId> supplier) {
        this(Build.VERSION.SDK_INT, supplier);
        i.e(supplier, "hardwareIdSupplier");
    }
}
