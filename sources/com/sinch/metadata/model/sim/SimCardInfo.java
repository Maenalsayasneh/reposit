package com.sinch.metadata.model.sim;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u0000  2\u00020\u0001:\u0002! B\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u001b\u0010\u001cB3\b\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001b\u0010\u001fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/sinch/metadata/model/sim/SimCardInfo;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sinch/metadata/model/sim/OperatorInfo;", "b", "Lcom/sinch/metadata/model/sim/OperatorInfo;", "getOperatorData", "()Lcom/sinch/metadata/model/sim/OperatorInfo;", "getOperatorData$annotations", "()V", "operatorData", "Lcom/sinch/metadata/model/sim/SimMetadata;", "a", "Lcom/sinch/metadata/model/sim/SimMetadata;", "getSimData", "()Lcom/sinch/metadata/model/sim/SimMetadata;", "getSimData$annotations", "simData", "<init>", "(Lcom/sinch/metadata/model/sim/SimMetadata;Lcom/sinch/metadata/model/sim/OperatorInfo;)V", "seen1", "serializationConstructorMarker", "(ILcom/sinch/metadata/model/sim/SimMetadata;Lcom/sinch/metadata/model/sim/OperatorInfo;Ljava/lang/Object;)V", "Companion", "serializer", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
@e
/* compiled from: SimCardInfo.kt */
public final class SimCardInfo {
    public static final Companion Companion = new Companion((f) null);
    public final SimMetadata a;
    public final OperatorInfo b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/sinch/metadata/model/sim/SimCardInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/metadata/model/sim/SimCardInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: SimCardInfo.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<SimCardInfo> serializer() {
            return SimCardInfo$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    public /* synthetic */ SimCardInfo(int i, SimMetadata simMetadata, OperatorInfo operatorInfo) {
        if (3 == (i & 3)) {
            this.a = simMetadata;
            this.b = operatorInfo;
            return;
        }
        a.W3(i, 3, SimCardInfo$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public SimCardInfo(SimMetadata simMetadata, OperatorInfo operatorInfo) {
        i.e(operatorInfo, "operatorData");
        this.a = null;
        this.b = operatorInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimCardInfo)) {
            return false;
        }
        SimCardInfo simCardInfo = (SimCardInfo) obj;
        return i.a(this.a, simCardInfo.a) && i.a(this.b, simCardInfo.b);
    }

    public int hashCode() {
        SimMetadata simMetadata = this.a;
        int i = 0;
        int hashCode = (simMetadata != null ? simMetadata.hashCode() : 0) * 31;
        OperatorInfo operatorInfo = this.b;
        if (operatorInfo != null) {
            i = operatorInfo.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SimCardInfo(simData=");
        P0.append(this.a);
        P0.append(", operatorData=");
        P0.append(this.b);
        P0.append(")");
        return P0.toString();
    }
}
