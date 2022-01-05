package com.sinch.metadata.model.sim;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\b\u0018\u0000 (2\u00020\u0001:\u0002)(B3\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b#\u0010$BU\b\u0017\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0018\u001a\u00020\t\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b#\u0010'J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000e\u0010\u0004R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u0012\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0013\u0010\u0004R\"\u0010\u0018\u001a\u00020\t8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u0012\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001c\u0010\u0004R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\r\u0012\u0004\b!\u0010\u0010\u001a\u0004\b \u0010\u0004¨\u0006*"}, d2 = {"Lcom/sinch/metadata/model/sim/OperatorInfo;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCountryId", "getCountryId$annotations", "()V", "countryId", "b", "getName", "getName$annotations", "name", "c", "Z", "isRoaming", "()Z", "isRoaming$annotations", "d", "getMcc", "getMcc$annotations", "mcc", "e", "getMnc", "getMnc$annotations", "mnc", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "seen1", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Companion", "serializer", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
@e
/* compiled from: OperatorInfo.kt */
public final class OperatorInfo {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/sinch/metadata/model/sim/OperatorInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/metadata/model/sim/OperatorInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: OperatorInfo.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<OperatorInfo> serializer() {
            return OperatorInfo$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    public /* synthetic */ OperatorInfo(int i, String str, String str2, boolean z, String str3, String str4) {
        if (31 == (i & 31)) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = str3;
            this.e = str4;
            return;
        }
        a.W3(i, 31, OperatorInfo$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public OperatorInfo(String str, String str2, boolean z, String str3, String str4) {
        i.e(str, "countryId");
        i.e(str2, "name");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OperatorInfo)) {
            return false;
        }
        OperatorInfo operatorInfo = (OperatorInfo) obj;
        return i.a(this.a, operatorInfo.a) && i.a(this.b, operatorInfo.b) && this.c == operatorInfo.c && i.a(this.d, operatorInfo.d) && i.a(this.e, operatorInfo.e);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str3 = this.d;
        int hashCode3 = (i2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("OperatorInfo(countryId=");
        P0.append(this.a);
        P0.append(", name=");
        P0.append(this.b);
        P0.append(", isRoaming=");
        P0.append(this.c);
        P0.append(", mcc=");
        P0.append(this.d);
        P0.append(", mnc=");
        return i0.d.a.a.a.y0(P0, this.e, ")");
    }
}
