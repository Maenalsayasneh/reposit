package com.clubhouse.android.data.repos;

/* compiled from: OnboardingRepo.kt */
public enum OnboardingRepo$Companion$OnboardingFlag {
    EnableSuggestUsername("ENABLE_SUGGEST_USERNAME");
    
    private final String key;

    private OnboardingRepo$Companion$OnboardingFlag(String str) {
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }
}
