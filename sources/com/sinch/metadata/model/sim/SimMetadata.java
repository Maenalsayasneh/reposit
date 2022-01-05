package com.sinch.metadata.model.sim;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB?\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000e\u0010\u0004R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u0012\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0013\u0010\u0004R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\r\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0017\u0010\u0004¨\u0006 "}, d2 = {"Lcom/sinch/metadata/model/sim/SimMetadata;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getMcc", "getMcc$annotations", "()V", "mcc", "c", "getMnc", "getMnc$annotations", "mnc", "a", "getCountryId", "getCountryId$annotations", "countryId", "seen1", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Companion", "serializer", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
@e
/* compiled from: SimMetadata.kt */
public final class SimMetadata {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final String b;
    public final String c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/sinch/metadata/model/sim/SimMetadata$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/metadata/model/sim/SimMetadata;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SimMetadata.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<SimMetadata> serializer() {
            return SimMetadata$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    public /* synthetic */ SimMetadata(int i, String str, String str2, String str3) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        a.W3(i, 7, SimMetadata$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimMetadata)) {
            return false;
        }
        SimMetadata simMetadata = (SimMetadata) obj;
        return i.a(this.a, simMetadata.a) && i.a(this.b, simMetadata.b) && i.a(this.c, simMetadata.c);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SimMetadata(countryId=");
        P0.append(this.a);
        P0.append(", mcc=");
        P0.append(this.b);
        P0.append(", mnc=");
        return i0.d.a.a.a.y0(P0, this.c, ")");
    }
}
