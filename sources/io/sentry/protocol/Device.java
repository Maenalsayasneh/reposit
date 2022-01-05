package io.sentry.protocol;

import io.sentry.IUnknownPropertiesConsumer;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

public final class Device implements IUnknownPropertiesConsumer, Cloneable {
    public static final String TYPE = "device";
    private String[] archs;
    private Float batteryLevel;
    private Float batteryTemperature;
    private Date bootTime;
    private String brand;
    private Boolean charging;
    private String connectionType;
    private Long externalFreeStorage;
    private Long externalStorageSize;
    private String family;
    private Long freeMemory;
    private Long freeStorage;
    private String id;
    private String language;
    private Boolean lowMemory;
    private String manufacturer;
    private Long memorySize;
    private String model;
    private String modelId;
    private String name;
    private Boolean online;
    private DeviceOrientation orientation;
    private Float screenDensity;
    private Integer screenDpi;
    private Integer screenHeightPixels;
    private Integer screenWidthPixels;
    private Boolean simulator;
    private Long storageSize;
    private TimeZone timezone;
    private Map<String, Object> unknown;
    private Long usableMemory;

    public enum DeviceOrientation {
        PORTRAIT,
        LANDSCAPE
    }

    @ApiStatus.Internal
    public void acceptUnknownProperties(Map<String, Object> map) {
        this.unknown = new ConcurrentHashMap(map);
    }

    public String[] getArchs() {
        return this.archs;
    }

    public Float getBatteryLevel() {
        return this.batteryLevel;
    }

    public Float getBatteryTemperature() {
        return this.batteryTemperature;
    }

    public Date getBootTime() {
        Date date = this.bootTime;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getConnectionType() {
        return this.connectionType;
    }

    public Long getExternalFreeStorage() {
        return this.externalFreeStorage;
    }

    public Long getExternalStorageSize() {
        return this.externalStorageSize;
    }

    public String getFamily() {
        return this.family;
    }

    public Long getFreeMemory() {
        return this.freeMemory;
    }

    public Long getFreeStorage() {
        return this.freeStorage;
    }

    public String getId() {
        return this.id;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public Long getMemorySize() {
        return this.memorySize;
    }

    public String getModel() {
        return this.model;
    }

    public String getModelId() {
        return this.modelId;
    }

    public String getName() {
        return this.name;
    }

    public DeviceOrientation getOrientation() {
        return this.orientation;
    }

    public Float getScreenDensity() {
        return this.screenDensity;
    }

    public Integer getScreenDpi() {
        return this.screenDpi;
    }

    public Integer getScreenHeightPixels() {
        return this.screenHeightPixels;
    }

    public Integer getScreenWidthPixels() {
        return this.screenWidthPixels;
    }

    public Long getStorageSize() {
        return this.storageSize;
    }

    public TimeZone getTimezone() {
        return this.timezone;
    }

    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    public Long getUsableMemory() {
        return this.usableMemory;
    }

    public Boolean isCharging() {
        return this.charging;
    }

    public Boolean isLowMemory() {
        return this.lowMemory;
    }

    public Boolean isOnline() {
        return this.online;
    }

    public Boolean isSimulator() {
        return this.simulator;
    }

    public void setArchs(String[] strArr) {
        this.archs = strArr;
    }

    public void setBatteryLevel(Float f) {
        this.batteryLevel = f;
    }

    public void setBatteryTemperature(Float f) {
        this.batteryTemperature = f;
    }

    public void setBootTime(Date date) {
        this.bootTime = date;
    }

    public void setBrand(String str) {
        this.brand = str;
    }

    public void setCharging(Boolean bool) {
        this.charging = bool;
    }

    public void setConnectionType(String str) {
        this.connectionType = str;
    }

    public void setExternalFreeStorage(Long l) {
        this.externalFreeStorage = l;
    }

    public void setExternalStorageSize(Long l) {
        this.externalStorageSize = l;
    }

    public void setFamily(String str) {
        this.family = str;
    }

    public void setFreeMemory(Long l) {
        this.freeMemory = l;
    }

    public void setFreeStorage(Long l) {
        this.freeStorage = l;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setLowMemory(Boolean bool) {
        this.lowMemory = bool;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public void setMemorySize(Long l) {
        this.memorySize = l;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setModelId(String str) {
        this.modelId = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOnline(Boolean bool) {
        this.online = bool;
    }

    public void setOrientation(DeviceOrientation deviceOrientation) {
        this.orientation = deviceOrientation;
    }

    public void setScreenDensity(Float f) {
        this.screenDensity = f;
    }

    public void setScreenDpi(Integer num) {
        this.screenDpi = num;
    }

    public void setScreenHeightPixels(Integer num) {
        this.screenHeightPixels = num;
    }

    public void setScreenWidthPixels(Integer num) {
        this.screenWidthPixels = num;
    }

    public void setSimulator(Boolean bool) {
        this.simulator = bool;
    }

    public void setStorageSize(Long l) {
        this.storageSize = l;
    }

    public void setTimezone(TimeZone timeZone) {
        this.timezone = timeZone;
    }

    public void setUsableMemory(Long l) {
        this.usableMemory = l;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.util.TimeZone} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.sentry.protocol.Device clone() throws java.lang.CloneNotSupportedException {
        /*
            r3 = this;
            java.lang.Object r0 = super.clone()
            io.sentry.protocol.Device r0 = (io.sentry.protocol.Device) r0
            java.lang.String[] r1 = r3.archs
            r2 = 0
            if (r1 == 0) goto L_0x0012
            java.lang.Object r1 = r1.clone()
            java.lang.String[] r1 = (java.lang.String[]) r1
            goto L_0x0013
        L_0x0012:
            r1 = r2
        L_0x0013:
            r0.archs = r1
            java.util.TimeZone r1 = r3.timezone
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r1.clone()
            r2 = r1
            java.util.TimeZone r2 = (java.util.TimeZone) r2
        L_0x0020:
            r0.timezone = r2
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.unknown
            java.util.Map r1 = io.sentry.util.CollectionUtils.shallowCopy(r1)
            r0.unknown = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.protocol.Device.clone():io.sentry.protocol.Device");
    }
}
