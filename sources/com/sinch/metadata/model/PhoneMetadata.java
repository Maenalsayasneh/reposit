package com.sinch.metadata.model;

import android.os.Build;
import com.sinch.metadata.model.network.NetworkInfo;
import com.sinch.metadata.model.sim.SimCardInfo;
import com.sinch.metadata.model.sim.SimState;
import i0.n.b.b.a.a;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u0000 V2\u00020\u0001:\u0002WVB»\u0001\b\u0017\u0012\u0006\u0010R\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010I\u001a\u0004\u0018\u00010C\u0012\u0010\b\u0001\u0010Q\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010B\u001a\u0004\u0018\u00010<\u0012\n\b\u0001\u0010/\u001a\u0004\u0018\u00010)\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u00107\u001a\u00020\u0005\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010S\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bT\u0010UJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0016\u0010\u0004R\"\u0010\u001c\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001a\u0010\u0004R\"\u0010 \u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u0012\u0004\b\u001f\u0010\u0012\u001a\u0004\b\u001e\u0010\u0004R\"\u0010$\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b!\u0010\u0015\u0012\u0004\b#\u0010\u0012\u001a\u0004\b\"\u0010\u0004R\u001e\u0010(\u001a\u0004\u0018\u00010\u00058\u0002@\u0003X\u0004¢\u0006\f\n\u0004\b%\u0010&\u0012\u0004\b'\u0010\u0012R\"\u0010/\u001a\u00020)8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010\u0012\u001a\u0004\b,\u0010-R\"\u00103\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b0\u0010\u0015\u0012\u0004\b2\u0010\u0012\u001a\u0004\b1\u0010\u0004R\u001c\u00107\u001a\u00020\u00058\u0002@\u0003XD¢\u0006\f\n\u0004\b4\u00105\u0012\u0004\b6\u0010\u0012R\"\u0010;\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b8\u0010\u0015\u0012\u0004\b:\u0010\u0012\u001a\u0004\b9\u0010\u0004R\"\u0010B\u001a\u00020<8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\bA\u0010\u0012\u001a\u0004\b?\u0010@R\"\u0010I\u001a\u00020C8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\bD\u0010E\u0012\u0004\bH\u0010\u0012\u001a\u0004\bF\u0010GR*\u0010Q\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010J8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\bL\u0010M\u0012\u0004\bP\u0010\u0012\u001a\u0004\bN\u0010O¨\u0006X"}, d2 = {"Lcom/sinch/metadata/model/PhoneMetadata;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sinch/metadata/model/sim/SimState;", "i", "Lcom/sinch/metadata/model/sim/SimState;", "getSimState", "()Lcom/sinch/metadata/model/sim/SimState;", "getSimState$annotations", "()V", "simState", "c", "Ljava/lang/String;", "getOs", "getOs$annotations", "os", "j", "getDefaultLocale", "getDefaultLocale$annotations", "defaultLocale", "m", "getBatteryLevel", "getBatteryLevel$annotations", "batteryLevel", "d", "getPlatform", "getPlatform$annotations", "platform", "b", "Ljava/lang/Integer;", "getSimCardCount$annotations", "simCardCount", "Lcom/sinch/metadata/model/network/NetworkInfo;", "l", "Lcom/sinch/metadata/model/network/NetworkInfo;", "getNetworkInfo", "()Lcom/sinch/metadata/model/network/NetworkInfo;", "getNetworkInfo$annotations", "networkInfo", "f", "getBuildFlavor", "getBuildFlavor$annotations", "buildFlavor", "a", "I", "getVersion$annotations", "version", "e", "getSdk", "getSdk$annotations", "sdk", "Lcom/sinch/metadata/model/PermissionsMetadata;", "k", "Lcom/sinch/metadata/model/PermissionsMetadata;", "getPermissionsMetadata", "()Lcom/sinch/metadata/model/PermissionsMetadata;", "getPermissionsMetadata$annotations", "permissionsMetadata", "Lcom/sinch/metadata/model/DeviceMetadata;", "g", "Lcom/sinch/metadata/model/DeviceMetadata;", "getDevice", "()Lcom/sinch/metadata/model/DeviceMetadata;", "getDevice$annotations", "device", "", "Lcom/sinch/metadata/model/sim/SimCardInfo;", "h", "Ljava/util/List;", "getSimCardsInfo", "()Ljava/util/List;", "getSimCardsInfo$annotations", "simCardsInfo", "seen1", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sinch/metadata/model/DeviceMetadata;Ljava/util/List;Lcom/sinch/metadata/model/sim/SimState;Ljava/lang/String;Lcom/sinch/metadata/model/PermissionsMetadata;Lcom/sinch/metadata/model/network/NetworkInfo;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Object;)V", "Companion", "serializer", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
@e
/* compiled from: PhoneMetadata.kt */
public final class PhoneMetadata {
    public static final Companion Companion = new Companion((f) null);
    public final int a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final DeviceMetadata g;
    public final List<SimCardInfo> h;
    public final SimState i;
    public final String j;
    public final PermissionsMetadata k;
    public final NetworkInfo l;
    public final String m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/sinch/metadata/model/PhoneMetadata$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/metadata/model/PhoneMetadata;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "METADATA_VERSION_NUMBER", "I", "<init>", "()V", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PhoneMetadata.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<PhoneMetadata> serializer() {
            return PhoneMetadata$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    public /* synthetic */ PhoneMetadata(int i2, String str, String str2, String str3, String str4, DeviceMetadata deviceMetadata, @e(with = a.class) List list, SimState simState, String str5, PermissionsMetadata permissionsMetadata, NetworkInfo networkInfo, String str6, int i3, Integer num) {
        int i4 = i2;
        List list2 = list;
        Integer num2 = null;
        if (2044 == (i4 & 2044)) {
            if ((i4 & 1) != 0) {
                this.c = str;
            } else {
                String str7 = Build.VERSION.RELEASE;
                i.d(str7, "Build.VERSION.RELEASE");
                this.c = str7;
            }
            if ((i4 & 2) != 0) {
                this.d = str2;
            } else {
                this.d = "Android";
            }
            this.e = str3;
            this.f = str4;
            this.g = deviceMetadata;
            this.h = list2;
            this.i = simState;
            this.j = str5;
            this.k = permissionsMetadata;
            this.l = networkInfo;
            this.m = str6;
            if ((i4 & 2048) != 0) {
                this.a = i3;
            } else {
                this.a = 2;
            }
            if ((i4 & 4096) != 0) {
                this.b = num;
            } else {
                this.b = list2 != null ? Integer.valueOf(list.size()) : num2;
            }
        } else {
            m0.r.t.a.r.m.a1.a.W3(i2, 2044, PhoneMetadata$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneMetadata)) {
            return false;
        }
        PhoneMetadata phoneMetadata = (PhoneMetadata) obj;
        return i.a(this.c, phoneMetadata.c) && i.a(this.d, phoneMetadata.d) && i.a(this.e, phoneMetadata.e) && i.a(this.f, phoneMetadata.f) && i.a(this.g, phoneMetadata.g) && i.a(this.h, phoneMetadata.h) && i.a(this.i, phoneMetadata.i) && i.a(this.j, phoneMetadata.j) && i.a(this.k, phoneMetadata.k) && i.a(this.l, phoneMetadata.l) && i.a(this.m, phoneMetadata.m);
    }

    public int hashCode() {
        String str = this.c;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        DeviceMetadata deviceMetadata = this.g;
        int hashCode5 = (hashCode4 + (deviceMetadata != null ? deviceMetadata.hashCode() : 0)) * 31;
        List<SimCardInfo> list = this.h;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        SimState simState = this.i;
        int hashCode7 = (hashCode6 + (simState != null ? simState.hashCode() : 0)) * 31;
        String str5 = this.j;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        PermissionsMetadata permissionsMetadata = this.k;
        int hashCode9 = (hashCode8 + (permissionsMetadata != null ? permissionsMetadata.hashCode() : 0)) * 31;
        NetworkInfo networkInfo = this.l;
        int hashCode10 = (hashCode9 + (networkInfo != null ? networkInfo.hashCode() : 0)) * 31;
        String str6 = this.m;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return hashCode10 + i2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("PhoneMetadata(os=");
        P0.append(this.c);
        P0.append(", platform=");
        P0.append(this.d);
        P0.append(", sdk=");
        P0.append(this.e);
        P0.append(", buildFlavor=");
        P0.append(this.f);
        P0.append(", device=");
        P0.append(this.g);
        P0.append(", simCardsInfo=");
        P0.append(this.h);
        P0.append(", simState=");
        P0.append(this.i);
        P0.append(", defaultLocale=");
        P0.append(this.j);
        P0.append(", permissionsMetadata=");
        P0.append(this.k);
        P0.append(", networkInfo=");
        P0.append(this.l);
        P0.append(", batteryLevel=");
        return i0.d.a.a.a.y0(P0, this.m, ")");
    }

    public PhoneMetadata(String str, String str2, String str3, String str4, DeviceMetadata deviceMetadata, List list, SimState simState, String str5, PermissionsMetadata permissionsMetadata, NetworkInfo networkInfo, String str6, int i2) {
        if ((i2 & 1) != 0) {
            str = Build.VERSION.RELEASE;
            i.d(str, "Build.VERSION.RELEASE");
        }
        Integer num = null;
        String str7 = (i2 & 2) != 0 ? "Android" : null;
        i.e(str, "os");
        i.e(str7, "platform");
        i.e(str3, "sdk");
        i.e(str4, "buildFlavor");
        i.e(deviceMetadata, "device");
        i.e(simState, "simState");
        i.e(str5, "defaultLocale");
        i.e(permissionsMetadata, "permissionsMetadata");
        i.e(networkInfo, "networkInfo");
        i.e(str6, "batteryLevel");
        this.c = str;
        this.d = str7;
        this.e = str3;
        this.f = str4;
        this.g = deviceMetadata;
        this.h = list;
        this.i = simState;
        this.j = str5;
        this.k = permissionsMetadata;
        this.l = networkInfo;
        this.m = str6;
        this.a = 2;
        this.b = list != null ? Integer.valueOf(list.size()) : num;
    }
}
