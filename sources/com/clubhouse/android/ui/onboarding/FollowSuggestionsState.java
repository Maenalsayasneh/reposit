package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.local.OnboardingDestination;
import h0.u.w;
import i0.b.b.b;
import i0.b.b.g0;
import i0.b.b.j;
import i0.e.b.a3.d.a;
import i0.e.b.b3.b.e.m;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptySet;
import m0.l.c;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: FollowSuggestionsViewModel.kt */
public final class FollowSuggestionsState implements j {
    public final w<i0.e.b.b3.b.e.j> a;
    public final b<OnboardingDestination> b;
    public final Set<Integer> c;
    public final Set<Integer> d;
    public final w<a<m>> e;

    public FollowSuggestionsState() {
        this((w) null, (b) null, (Set) null, (Set) null, 15, (f) null);
    }

    public FollowSuggestionsState(w<i0.e.b.b3.b.e.j> wVar, b<? extends OnboardingDestination> bVar, Set<Integer> set, Set<Integer> set2) {
        i.e(bVar, "navigateTo");
        i.e(set, "usersToFollow");
        i.e(set2, "preSelected");
        this.a = wVar;
        this.b = bVar;
        this.c = set;
        this.d = set2;
        this.e = wVar != null ? g0.a.b.b.a.d0(wVar, new FollowSuggestionsState$users$1(this, (c<? super FollowSuggestionsState$users$1>) null)) : null;
    }

    public static FollowSuggestionsState copy$default(FollowSuggestionsState followSuggestionsState, w<i0.e.b.b3.b.e.j> wVar, b<OnboardingDestination> bVar, Set<Integer> set, Set<Integer> set2, int i, Object obj) {
        if ((i & 1) != 0) {
            wVar = followSuggestionsState.a;
        }
        if ((i & 2) != 0) {
            bVar = followSuggestionsState.b;
        }
        if ((i & 4) != 0) {
            set = followSuggestionsState.c;
        }
        if ((i & 8) != 0) {
            set2 = followSuggestionsState.d;
        }
        Objects.requireNonNull(followSuggestionsState);
        i.e(bVar, "navigateTo");
        i.e(set, "usersToFollow");
        i.e(set2, "preSelected");
        return new FollowSuggestionsState(wVar, bVar, set, set2);
    }

    public final b<OnboardingDestination> component2() {
        return this.b;
    }

    public final Set<Integer> component3() {
        return this.c;
    }

    public final Set<Integer> component4() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowSuggestionsState)) {
            return false;
        }
        FollowSuggestionsState followSuggestionsState = (FollowSuggestionsState) obj;
        return i.a(this.a, followSuggestionsState.a) && i.a(this.b, followSuggestionsState.b) && i.a(this.c, followSuggestionsState.c) && i.a(this.d, followSuggestionsState.d);
    }

    public int hashCode() {
        w<i0.e.b.b3.b.e.j> wVar = this.a;
        int hashCode = wVar == null ? 0 : wVar.hashCode();
        return this.d.hashCode() + i0.d.a.a.a.I(this.c, (this.b.hashCode() + (hashCode * 31)) * 31, 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("FollowSuggestionsState(data=");
        P0.append(this.a);
        P0.append(", navigateTo=");
        P0.append(this.b);
        P0.append(", usersToFollow=");
        P0.append(this.c);
        P0.append(", preSelected=");
        P0.append(this.d);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FollowSuggestionsState(w wVar, b bVar, Set set, Set set2, int i, f fVar) {
        this((i & 1) != 0 ? null : wVar, (i & 2) != 0 ? g0.b : bVar, (i & 4) != 0 ? EmptySet.c : set, (i & 8) != 0 ? EmptySet.c : set2);
    }
}
