package com.sinch.verification.core.internal.error;

import i0.d.a.a.a;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u0000  2\u00020\u0001:\u0002! B?\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000e\u0010\u0004R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u0012\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0013\u0010\u0004R$\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019¨\u0006\""}, d2 = {"Lcom/sinch/verification/core/internal/error/ApiErrorData;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "getMessage", "getMessage$annotations", "()V", "message", "c", "getReference", "getReference$annotations", "reference", "a", "Ljava/lang/Integer;", "getErrorCode", "()Ljava/lang/Integer;", "getErrorCode$annotations", "errorCode", "seen1", "serializationConstructorMarker", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Companion", "serializer", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
@e
/* compiled from: ApiErrorData.kt */
public final class ApiErrorData {
    public static final Companion Companion = new Companion((f) null);
    public final Integer a;
    public final String b;
    public final String c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/sinch/verification/core/internal/error/ApiErrorData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/verification/core/internal/error/ApiErrorData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ApiErrorData.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ApiErrorData> serializer() {
            return ApiErrorData$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    public ApiErrorData() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiErrorData)) {
            return false;
        }
        ApiErrorData apiErrorData = (ApiErrorData) obj;
        return i.a(this.a, apiErrorData.a) && i.a(this.b, apiErrorData.b) && i.a(this.c, apiErrorData.c);
    }

    public int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ApiErrorData(errorCode=");
        P0.append(this.a);
        P0.append(", message=");
        P0.append(this.b);
        P0.append(", reference=");
        return a.y0(P0, this.c, ")");
    }

    public /* synthetic */ ApiErrorData(int i, Integer num, String str, String str2) {
        if ((i & 0) == 0) {
            if ((i & 1) != 0) {
                this.a = num;
            } else {
                this.a = null;
            }
            if ((i & 2) != 0) {
                this.b = str;
            } else {
                this.b = null;
            }
            if ((i & 4) != 0) {
                this.c = str2;
            } else {
                this.c = null;
            }
        } else {
            m0.r.t.a.r.m.a1.a.W3(i, 0, ApiErrorData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
