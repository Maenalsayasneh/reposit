package com.ults.listeners.challenges;

import com.ults.listeners.BaseSdkChallenge;

public interface MultiSelectChallenge extends BaseSdkChallenge {
    Object[] getCheckboxesOrdered();
}
