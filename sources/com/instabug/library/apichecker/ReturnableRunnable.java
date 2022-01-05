package com.instabug.library.apichecker;

@FunctionalInterface
public interface ReturnableRunnable<T> {
    T run() throws Exception;
}
