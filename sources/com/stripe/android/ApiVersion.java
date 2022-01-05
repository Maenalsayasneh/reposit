package com.stripe.android;

import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000  2\u00020\u0001:\u0001 B!\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u001d\u0010\u001eB\u0017\b\u0016\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u001d\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÀ\u0003¢\u0006\u0004\b\b\u0010\tJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0013\u0010\u001a\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u000b\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004¨\u0006!"}, d2 = {"Lcom/stripe/android/ApiVersion;", "", "", "component1$payments_core_release", "()Ljava/lang/String;", "component1", "", "Lcom/stripe/android/StripeApiBeta;", "component2$payments_core_release", "()Ljava/util/Set;", "component2", "version", "betas", "copy", "(Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/ApiVersion;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getBetas$payments_core_release", "getCode", "code", "Ljava/lang/String;", "getVersion$payments_core_release", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", "(Ljava/util/Set;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ApiVersion.kt */
public final class ApiVersion {
    public static final String API_VERSION_CODE = "2020-03-02";
    public static final Companion Companion = new Companion((f) null);
    /* access modifiers changed from: private */
    public static final ApiVersion INSTANCE = new ApiVersion(API_VERSION_CODE, (Set) null, 2, (f) null);
    private final Set<StripeApiBeta> betas;
    private final String version;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/ApiVersion$Companion;", "", "Lcom/stripe/android/ApiVersion;", "get$payments_core_release", "()Lcom/stripe/android/ApiVersion;", "get", "", "API_VERSION_CODE", "Ljava/lang/String;", "INSTANCE", "Lcom/stripe/android/ApiVersion;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ApiVersion.kt */
    public static final class Companion {
        private Companion() {
        }

        public final /* synthetic */ ApiVersion get$payments_core_release() {
            return ApiVersion.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public ApiVersion(String str, Set<? extends StripeApiBeta> set) {
        i.e(str, "version");
        i.e(set, "betas");
        this.version = str;
        this.betas = set;
    }

    public static /* synthetic */ ApiVersion copy$default(ApiVersion apiVersion, String str, Set<StripeApiBeta> set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiVersion.version;
        }
        if ((i & 2) != 0) {
            set = apiVersion.betas;
        }
        return apiVersion.copy(str, set);
    }

    public final String component1$payments_core_release() {
        return this.version;
    }

    public final Set<StripeApiBeta> component2$payments_core_release() {
        return this.betas;
    }

    public final ApiVersion copy(String str, Set<? extends StripeApiBeta> set) {
        i.e(str, "version");
        i.e(set, "betas");
        return new ApiVersion(str, set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiVersion)) {
            return false;
        }
        ApiVersion apiVersion = (ApiVersion) obj;
        return i.a(this.version, apiVersion.version) && i.a(this.betas, apiVersion.betas);
    }

    public final Set<StripeApiBeta> getBetas$payments_core_release() {
        return this.betas;
    }

    public final String getCode() {
        List L2 = h.L2(this.version);
        Set<StripeApiBeta> set = this.betas;
        ArrayList arrayList = new ArrayList(h.K(set, 10));
        for (StripeApiBeta code : set) {
            arrayList.add(code.getCode());
        }
        return g.E(g.Z(L2, arrayList), ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
    }

    public final String getVersion$payments_core_release() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Set<StripeApiBeta> set = this.betas;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ApiVersion(version=");
        P0.append(this.version);
        P0.append(", betas=");
        P0.append(this.betas);
        P0.append(")");
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ApiVersion(Set<? extends StripeApiBeta> set) {
        this(API_VERSION_CODE, set);
        i.e(set, "betas");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ApiVersion(String str, Set set, int i, f fVar) {
        this(str, (i & 2) != 0 ? EmptySet.c : set);
    }
}
