package com.google.android.gms.internal.recaptcha;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public enum zzhk {
    DOUBLE(zzhr.DOUBLE, 1),
    FLOAT(zzhr.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzhr.BOOLEAN, 0),
    STRING(zzhr.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzhr.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(zzhr.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzhr zzs;
    private final int zzt;

    private zzhk(zzhr zzhr, int i) {
        this.zzs = zzhr;
        this.zzt = i;
    }

    public final zzhr zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
