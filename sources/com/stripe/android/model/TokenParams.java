package com.stripe.android.model;

import android.os.Parcelable;
import com.stripe.android.model.Token;
import i0.j.f.p.h;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/TokenParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "getTypeDataParams", "typeDataParams", "Lcom/stripe/android/model/Token$Type;", "tokenType", "Lcom/stripe/android/model/Token$Type;", "getTokenType$payments_core_release", "()Lcom/stripe/android/model/Token$Type;", "", "attribution", "Ljava/util/Set;", "getAttribution$payments_core_release", "()Ljava/util/Set;", "<init>", "(Lcom/stripe/android/model/Token$Type;Ljava/util/Set;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: TokenParams.kt */
public abstract class TokenParams implements StripeParamsModel, Parcelable {
    private final Set<String> attribution;
    private final Token.Type tokenType;

    public TokenParams(Token.Type type, Set<String> set) {
        i.e(type, "tokenType");
        i.e(set, "attribution");
        this.tokenType = type;
        this.attribution = set;
    }

    public final Set<String> getAttribution$payments_core_release() {
        return this.attribution;
    }

    public final Token.Type getTokenType$payments_core_release() {
        return this.tokenType;
    }

    public abstract Map<String, Object> getTypeDataParams();

    public Map<String, Object> toParamMap() {
        return h.S2(new Pair(this.tokenType.getCode$payments_core_release(), getTypeDataParams()));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TokenParams(Token.Type type, Set set, int i, f fVar) {
        this(type, (i & 2) != 0 ? EmptySet.c : set);
    }
}
