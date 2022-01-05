package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.models.remote.request.OnboardingState;
import h0.u.x;
import i0.e.b.b3.b.e.j;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: UserRepo.kt */
public final class UserRepo$getSuggestedFollows$1 extends Lambda implements a<x<Integer, j>> {
    public final /* synthetic */ UserRepo c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepo$getSuggestedFollows$1(UserRepo userRepo) {
        super(0);
        this.c = userRepo;
    }

    public Object invoke() {
        return this.c.v.a(false, (OnboardingState) null, 0);
    }
}
