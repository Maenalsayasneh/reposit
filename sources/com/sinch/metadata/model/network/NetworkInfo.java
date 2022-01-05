package com.sinch.metadata.model.network;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u001b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0019\u0010\u001aB3\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0019\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/sinch/metadata/model/network/NetworkInfo;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "isVoiceCapable", "()Ljava/lang/Boolean;", "isVoiceCapable$annotations", "()V", "Lcom/sinch/metadata/model/network/NetworkData;", "b", "Lcom/sinch/metadata/model/network/NetworkData;", "getNetworkData", "()Lcom/sinch/metadata/model/network/NetworkData;", "getNetworkData$annotations", "networkData", "<init>", "(Ljava/lang/Boolean;Lcom/sinch/metadata/model/network/NetworkData;)V", "seen1", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/sinch/metadata/model/network/NetworkData;Ljava/lang/Object;)V", "Companion", "serializer", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
@e
/* compiled from: NetworkInfo.kt */
public final class NetworkInfo {
    public static final Companion Companion = new Companion((f) null);
    public final Boolean a;
    public final NetworkData b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/sinch/metadata/model/network/NetworkInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/metadata/model/network/NetworkInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: NetworkInfo.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<NetworkInfo> serializer() {
            return NetworkInfo$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    public /* synthetic */ NetworkInfo(int i, Boolean bool, NetworkData networkData) {
        if (3 == (i & 3)) {
            this.a = bool;
            this.b = networkData;
            return;
        }
        a.W3(i, 3, NetworkInfo$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public NetworkInfo(Boolean bool, NetworkData networkData) {
        this.a = bool;
        this.b = networkData;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkInfo)) {
            return false;
        }
        NetworkInfo networkInfo = (NetworkInfo) obj;
        return i.a(this.a, networkInfo.a) && i.a(this.b, networkInfo.b);
    }

    public int hashCode() {
        Boolean bool = this.a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        NetworkData networkData = this.b;
        if (networkData != null) {
            i = networkData.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("NetworkInfo(isVoiceCapable=");
        P0.append(this.a);
        P0.append(", networkData=");
        P0.append(this.b);
        P0.append(")");
        return P0.toString();
    }
}
