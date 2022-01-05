package com.instabug.library.internal.utils.stability.execution;

@FunctionalInterface
public interface ReturnableExecutable<T> {
    T execute() throws Exception;
}
