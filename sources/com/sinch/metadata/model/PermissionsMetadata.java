package com.sinch.metadata.model;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import m0.r.t.a.r.m.a1.a;
import n0.c.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b)\b\b\u0018\u0000 02\u00020\u0001:\u000210B?\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\u0006\u0010&\u001a\u00020\t\u0012\u0006\u0010\"\u001a\u00020\t\u0012\u0006\u0010*\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b+\u0010,Ba\b\u0017\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u001e\u001a\u00020\t\u0012\b\b\u0001\u0010&\u001a\u00020\t\u0012\b\b\u0001\u0010\"\u001a\u00020\t\u0012\b\b\u0001\u0010*\u001a\u00020\t\u0012\b\b\u0001\u0010\u0016\u001a\u00020\t\u0012\b\b\u0001\u0010\u001a\u001a\u00020\t\u0012\b\b\u0001\u0010\u0012\u001a\u00020\t\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b+\u0010/J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0012\u001a\u00020\t8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\t8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u0012\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0014\u0010\u000fR\"\u0010\u001a\u001a\u00020\t8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u0012\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0018\u0010\u000fR\"\u0010\u001e\u001a\u00020\t8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\r\u0012\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001c\u0010\u000fR\"\u0010\"\u001a\u00020\t8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\r\u0012\u0004\b!\u0010\u0011\u001a\u0004\b \u0010\u000fR\"\u0010&\u001a\u00020\t8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b#\u0010\r\u0012\u0004\b%\u0010\u0011\u001a\u0004\b$\u0010\u000fR\"\u0010*\u001a\u00020\t8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b'\u0010\r\u0012\u0004\b)\u0010\u0011\u001a\u0004\b(\u0010\u000f¨\u00062"}, d2 = {"Lcom/sinch/metadata/model/PermissionsMetadata;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "g", "Z", "getHasCellularSignalPermission", "()Z", "getHasCellularSignalPermission$annotations", "()V", "hasCellularSignalPermission", "e", "getHasReceiveSmsPermission", "getHasReceiveSmsPermission$annotations", "hasReceiveSmsPermission", "f", "getHasAccessNetworkStatePermission", "getHasAccessNetworkStatePermission$annotations", "hasAccessNetworkStatePermission", "a", "getHasReadPhoneStatePermission", "getHasReadPhoneStatePermission$annotations", "hasReadPhoneStatePermission", "c", "getHasCallPhonePermission", "getHasCallPhonePermission$annotations", "hasCallPhonePermission", "b", "getHasReadCallLogPermission", "getHasReadCallLogPermission$annotations", "hasReadCallLogPermission", "d", "getHasReadSmsPermission", "getHasReadSmsPermission$annotations", "hasReadSmsPermission", "<init>", "(ZZZZZZZ)V", "seen1", "serializationConstructorMarker", "(IZZZZZZZLjava/lang/Object;)V", "Companion", "serializer", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
@e
/* compiled from: PermissionsMetadata.kt */
public final class PermissionsMetadata {
    public static final Companion Companion = new Companion((f) null);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/sinch/metadata/model/PermissionsMetadata$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/metadata/model/PermissionsMetadata;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PermissionsMetadata.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<PermissionsMetadata> serializer() {
            return PermissionsMetadata$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    public /* synthetic */ PermissionsMetadata(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (127 == (i & 127)) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = z6;
            this.g = z7;
            return;
        }
        a.W3(i, 127, PermissionsMetadata$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public PermissionsMetadata(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermissionsMetadata)) {
            return false;
        }
        PermissionsMetadata permissionsMetadata = (PermissionsMetadata) obj;
        return this.a == permissionsMetadata.a && this.b == permissionsMetadata.b && this.c == permissionsMetadata.c && this.d == permissionsMetadata.d && this.e == permissionsMetadata.e && this.f == permissionsMetadata.f && this.g == permissionsMetadata.g;
    }

    public int hashCode() {
        boolean z = this.a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.c;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.d;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.e;
        if (z6) {
            z6 = true;
        }
        int i5 = (i4 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.f;
        if (z7) {
            z7 = true;
        }
        int i6 = (i5 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.g;
        if (!z8) {
            z2 = z8;
        }
        return i6 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("PermissionsMetadata(hasReadPhoneStatePermission=");
        P0.append(this.a);
        P0.append(", hasReadCallLogPermission=");
        P0.append(this.b);
        P0.append(", hasCallPhonePermission=");
        P0.append(this.c);
        P0.append(", hasReadSmsPermission=");
        P0.append(this.d);
        P0.append(", hasReceiveSmsPermission=");
        P0.append(this.e);
        P0.append(", hasAccessNetworkStatePermission=");
        P0.append(this.f);
        P0.append(", hasCellularSignalPermission=");
        return i0.d.a.a.a.D0(P0, this.g, ")");
    }
}
