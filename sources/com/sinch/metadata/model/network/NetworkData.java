package com.sinch.metadata.model.network;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015B'\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0018J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/sinch/metadata/model/network/NetworkData;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sinch/metadata/model/network/NetworkType;", "a", "Lcom/sinch/metadata/model/network/NetworkType;", "getType", "()Lcom/sinch/metadata/model/network/NetworkType;", "getType$annotations", "()V", "type", "<init>", "(Lcom/sinch/metadata/model/network/NetworkType;)V", "seen1", "serializationConstructorMarker", "(ILcom/sinch/metadata/model/network/NetworkType;Ljava/lang/Object;)V", "Companion", "serializer", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
@e
/* compiled from: NetworkData.kt */
public final class NetworkData {
    public static final Companion Companion = new Companion((f) null);
    public final NetworkType a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/sinch/metadata/model/network/NetworkData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/metadata/model/network/NetworkData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: NetworkData.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<NetworkData> serializer() {
            return NetworkData$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    public /* synthetic */ NetworkData(int i, NetworkType networkType) {
        if (1 == (i & 1)) {
            this.a = networkType;
        } else {
            a.W3(i, 1, NetworkData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public NetworkData(NetworkType networkType) {
        i.e(networkType, "type");
        this.a = networkType;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof NetworkData) && i.a(this.a, ((NetworkData) obj).a);
        }
        return true;
    }

    public int hashCode() {
        NetworkType networkType = this.a;
        if (networkType != null) {
            return networkType.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("NetworkData(type=");
        P0.append(this.a);
        P0.append(")");
        return P0.toString();
    }
}
