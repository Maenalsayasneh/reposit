package com.instabug.library.internal.utils.stability.handler.penalty;

public interface PenaltyHandler {
    int getPenaltyType();

    void handle(Exception exc);
}
