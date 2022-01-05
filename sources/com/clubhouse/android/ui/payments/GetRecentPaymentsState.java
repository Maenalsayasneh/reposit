package com.clubhouse.android.ui.payments;

import g0.a.b.b.a;
import h0.u.w;
import i0.b.b.b;
import i0.b.b.g0;
import i0.b.b.j;
import i0.e.b.b3.b.e.k;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptySet;
import m0.i;
import m0.l.c;
import m0.n.b.f;

/* compiled from: RecentPaymentsViewModel.kt */
public final class GetRecentPaymentsState implements j {
    public final w<k> a;
    public final Set<Integer> b;
    public final b<i> c;
    public final w<k> d;

    public GetRecentPaymentsState() {
        this((w) null, (Set) null, (b) null, 7, (f) null);
    }

    public GetRecentPaymentsState(w<k> wVar, Set<Integer> set, b<i> bVar) {
        m0.n.b.i.e(wVar, "initialRecentPaymentsData");
        m0.n.b.i.e(set, "acknowledgedRecentPayments");
        m0.n.b.i.e(bVar, "acknowledgePaymentRequest");
        this.a = wVar;
        this.b = set;
        this.c = bVar;
        this.d = a.d0(wVar, new GetRecentPaymentsState$recentPaymentsData$1(this, (c<? super GetRecentPaymentsState$recentPaymentsData$1>) null));
    }

    public static GetRecentPaymentsState copy$default(GetRecentPaymentsState getRecentPaymentsState, w<k> wVar, Set<Integer> set, b<i> bVar, int i, Object obj) {
        if ((i & 1) != 0) {
            wVar = getRecentPaymentsState.a;
        }
        if ((i & 2) != 0) {
            set = getRecentPaymentsState.b;
        }
        if ((i & 4) != 0) {
            bVar = getRecentPaymentsState.c;
        }
        Objects.requireNonNull(getRecentPaymentsState);
        m0.n.b.i.e(wVar, "initialRecentPaymentsData");
        m0.n.b.i.e(set, "acknowledgedRecentPayments");
        m0.n.b.i.e(bVar, "acknowledgePaymentRequest");
        return new GetRecentPaymentsState(wVar, set, bVar);
    }

    public final Set<Integer> component2() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetRecentPaymentsState)) {
            return false;
        }
        GetRecentPaymentsState getRecentPaymentsState = (GetRecentPaymentsState) obj;
        return m0.n.b.i.a(this.a, getRecentPaymentsState.a) && m0.n.b.i.a(this.b, getRecentPaymentsState.b) && m0.n.b.i.a(this.c, getRecentPaymentsState.c);
    }

    public int hashCode() {
        return this.c.hashCode() + i0.d.a.a.a.I(this.b, this.a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("GetRecentPaymentsState(initialRecentPaymentsData=");
        P0.append(this.a);
        P0.append(", acknowledgedRecentPayments=");
        P0.append(this.b);
        P0.append(", acknowledgePaymentRequest=");
        P0.append(this.c);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GetRecentPaymentsState(w wVar, Set set, b bVar, int i, f fVar) {
        this((i & 1) != 0 ? w.c.a() : wVar, (i & 2) != 0 ? EmptySet.c : set, (i & 4) != 0 ? g0.b : bVar);
    }
}
