package com.sinch.verification.core.internal;

/* compiled from: VerificationStateStatus.kt */
public enum VerificationStateStatus {
    ONGOING,
    SUCCESS,
    ERROR;

    public final boolean isFinished() {
        return this != ONGOING;
    }
}
