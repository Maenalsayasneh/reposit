package com.ults.listeners;

public interface SdkChallengeInterface {
    public static final String UL_HANDLE_CHALLENGE_ACTION = "com.ul.sdk.HANDLE_CHALLENGE_ACTION";

    BaseSdkChallenge getCurrentChallenge();
}
