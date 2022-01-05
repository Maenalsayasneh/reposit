package com.clubhouse.android.data.models.local;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import m0.j.g;
import m0.n.b.f;

/* compiled from: OnboardingDestination.kt */
public enum OnboardingDestination {
    ONBOARDING_FRIENDS(SourceLocation.ONBOARDING_FRIENDS, "clubhouse://onboarding/friends"),
    ONBOARDING_USERS(SourceLocation.ONBOARDING_SUGGESTED, "clubhouse://onboarding/users"),
    ONBOARDING_CLUBS(SourceLocation.ONBOARDING_CLUBS, "clubhouse://onboarding/clubs"),
    ONBOARDING_TOPICS(SourceLocation.ONBOARDING_TOPICS, "clubhouse://onboarding/topics"),
    ONBOARDING_WELCOME(SourceLocation.WELCOME_ROOM, "clubhouse://onboarding/welcome");
    
    public static final a Companion = null;
    /* access modifiers changed from: private */
    public static final List<SourceLocation> DEFAULT_SEQUENCE = null;
    private final SourceLocation sourceLocation;
    private final String uri;

    /* compiled from: OnboardingDestination.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* access modifiers changed from: public */
    static {
        OnboardingDestination onboardingDestination;
        OnboardingDestination onboardingDestination2;
        OnboardingDestination onboardingDestination3;
        OnboardingDestination onboardingDestination4;
        Companion = new a((f) null);
        List<OnboardingDestination> K = g.K(onboardingDestination, onboardingDestination2, onboardingDestination4, onboardingDestination3);
        ArrayList arrayList = new ArrayList(h.K(K, 10));
        for (OnboardingDestination sourceLocation2 : K) {
            arrayList.add(sourceLocation2.getSourceLocation());
        }
        DEFAULT_SEQUENCE = arrayList;
    }

    private OnboardingDestination(SourceLocation sourceLocation2, String str) {
        this.sourceLocation = sourceLocation2;
        this.uri = str;
    }

    public final SourceLocation getSourceLocation() {
        return this.sourceLocation;
    }

    public final String getUri() {
        return this.uri;
    }
}
