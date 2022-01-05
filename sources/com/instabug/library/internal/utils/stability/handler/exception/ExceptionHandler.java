package com.instabug.library.internal.utils.stability.handler.exception;

import com.instabug.library.internal.utils.stability.execution.Executable;
import com.instabug.library.internal.utils.stability.execution.ReturnableExecutable;
import com.instabug.library.internal.utils.stability.handler.penalty.PenaltyHandler;
import i0.j.e.l0.l.a.a.a.a;
import i0.j.e.l0.l.a.a.a.b;
import i0.j.e.l0.l.a.a.a.c;

public final class ExceptionHandler {
    private static final String TAG = "ExceptionHandler";
    private PenaltyHandler penaltyHandler = new c();

    public void execute(Executable executable) {
        try {
            executable.execute();
        } catch (Exception e) {
            this.penaltyHandler.handle(e);
        }
    }

    public <T> T executeAndGet(ReturnableExecutable<T> returnableExecutable) {
        return executeAndGet(returnableExecutable, (Object) null);
    }

    public ExceptionHandler withPenalty(PenaltyHandler penaltyHandler2) {
        this.penaltyHandler = penaltyHandler2;
        return this;
    }

    public ExceptionHandler withPenaltyDeath() {
        this.penaltyHandler = new a();
        return this;
    }

    public ExceptionHandler withPenaltyLog() {
        this.penaltyHandler = new b(TAG);
        return this;
    }

    public ExceptionHandler withPenaltySwallow() {
        this.penaltyHandler = new c();
        return this;
    }

    public <T> T executeAndGet(ReturnableExecutable<T> returnableExecutable, T t) {
        try {
            return returnableExecutable.execute();
        } catch (Exception e) {
            this.penaltyHandler.handle(e);
            return t;
        }
    }

    public ExceptionHandler withPenaltyLog(String str) {
        this.penaltyHandler = new b(str);
        return this;
    }
}
