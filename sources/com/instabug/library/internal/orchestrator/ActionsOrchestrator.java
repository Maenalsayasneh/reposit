package com.instabug.library.internal.orchestrator;

import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public final class ActionsOrchestrator {
    public static final String TAG = "ActionsOrchestrator";
    private final Executor backgroundExecutor;
    private final List<Action> sameThreadActions = new ArrayList();
    /* access modifiers changed from: private */
    public final List<Action> workerThreadActions = new ArrayList();

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            for (Action access$100 : ActionsOrchestrator.this.workerThreadActions) {
                ActionsOrchestrator.this.runAction(access$100);
            }
        }
    }

    private ActionsOrchestrator(Executor executor) {
        this.backgroundExecutor = executor;
    }

    public static ActionsOrchestrator obtainOrchestrator() {
        return new ActionsOrchestrator(PoolProvider.getInstance().getBackgroundExecutor());
    }

    private void orchestrateSameThreadActions() {
        for (Action runAction : this.sameThreadActions) {
            runAction(runAction);
        }
    }

    private void orchestrateWorkerThreadActions() {
        PoolProvider.postTask(this.backgroundExecutor, new a());
    }

    /* access modifiers changed from: private */
    public void runAction(Action action) {
        InstabugSDKLogger.d(TAG, "runAction");
        try {
            action.run();
        } catch (Exception e) {
            InstabugSDKLogger.e(TAG, e.getMessage(), e);
        }
    }

    public ActionsOrchestrator addSameThreadAction(Action action) {
        this.sameThreadActions.add(action);
        return this;
    }

    public ActionsOrchestrator addWorkerThreadAction(Action action) {
        this.workerThreadActions.add(action);
        return this;
    }

    public void orchestrate() {
        orchestrateSameThreadActions();
        orchestrateWorkerThreadActions();
    }

    public static ActionsOrchestrator obtainOrchestrator(Executor executor) {
        return new ActionsOrchestrator(executor);
    }
}
