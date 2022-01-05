package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.models.local.PhoneContact;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.data.models.remote.response.GetSuggestedFollowsFriendsOnlyResponse;
import com.clubhouse.android.data.repos.OnboardingRepo;
import com.clubhouse.android.data.repos.PhoneContactsRepo;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.onboarding.FollowFriendsViewModel$getFriendsFollowSuggestions$1", f = "FollowFriendsViewModel.kt", l = {121, 122}, m = "invokeSuspend")
/* compiled from: FollowFriendsViewModel.kt */
public final class FollowFriendsViewModel$getFriendsFollowSuggestions$1 extends SuspendLambda implements l<m0.l.c<? super List<? extends UserInList>>, Object> {
    public int c;
    public final /* synthetic */ FollowFriendsViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowFriendsViewModel$getFriendsFollowSuggestions$1(FollowFriendsViewModel followFriendsViewModel, m0.l.c<? super FollowFriendsViewModel$getFriendsFollowSuggestions$1> cVar) {
        super(1, cVar);
        this.d = followFriendsViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new FollowFriendsViewModel$getFriendsFollowSuggestions$1(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new FollowFriendsViewModel$getFriendsFollowSuggestions$1(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            FollowFriendsViewModel followFriendsViewModel = this.d;
            AnonymousClass1 r1 = AnonymousClass1.c;
            int i2 = FollowFriendsViewModel.m;
            followFriendsViewModel.m(r1);
            PhoneContactsRepo phoneContactsRepo = this.d.r;
            this.c = 1;
            obj = phoneContactsRepo.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else if (i == 2) {
            h.d4(obj);
            return ((GetSuggestedFollowsFriendsOnlyResponse) obj).a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterable<PhoneContact> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(h.K(iterable, 10));
        for (PhoneContact phoneContact : iterable) {
            arrayList.add(phoneContact.a);
        }
        OnboardingRepo onboardingRepo = this.d.n;
        this.c = 2;
        obj = onboardingRepo.d(arrayList, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        return ((GetSuggestedFollowsFriendsOnlyResponse) obj).a;
    }
}
