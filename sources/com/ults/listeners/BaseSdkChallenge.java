package com.ults.listeners;

public interface BaseSdkChallenge {
    void clickCancelButton();

    void clickSubmitButton();

    void expandTextsBeforeScreenshot();

    ChallengeType getChallengeType();
}
