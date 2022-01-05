package com.instabug.library.invocation;

import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.invocation.util.InstabugFloatingButtonEdge;
import com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition;
import com.instabug.library.util.threading.PoolProvider;
import i0.j.e.m0.d.a;
import i0.j.e.m0.d.b;
import i0.j.e.m0.d.c;
import i0.j.e.m0.d.k;
import java.util.List;
import java.util.Objects;

public class InvocationSettings {
    public static final int SHAKE_DEFAULT_THRESHOLD = 650;
    private b.f floatingButtonParams = new b.f();
    private int shakeThreshold = SHAKE_DEFAULT_THRESHOLD;
    private InstabugVideoRecordingButtonPosition videoRecordingButtonPosition = InstabugVideoRecordingButtonPosition.BOTTOM_RIGHT;

    private void refreshButton() {
        if (InvocationManager.getInstance().getCurrentInvokers() != null) {
            for (a next : InvocationManager.getInstance().getCurrentInvokers()) {
                if (next instanceof b) {
                    b bVar = (b) next;
                    Objects.requireNonNull(bVar);
                    PoolProvider.postMainThreadTask(new c(bVar));
                    return;
                }
            }
        }
    }

    public b.f getFloatingButtonParams() {
        return this.floatingButtonParams;
    }

    public int getShakeThreshold() {
        return this.shakeThreshold;
    }

    public InstabugVideoRecordingButtonPosition getVideoRecordingButtonPosition() {
        return this.videoRecordingButtonPosition;
    }

    public void setFloatingButtonEdge(InstabugFloatingButtonEdge instabugFloatingButtonEdge) {
        if (Instabug.isEnabled()) {
            this.floatingButtonParams.a = instabugFloatingButtonEdge;
            if (!InstabugCore.isForegroundBusy()) {
                refreshButton();
            }
        }
    }

    public void setFloatingButtonOffsetFromTop(int i) {
        this.floatingButtonParams.b = i;
        refreshButton();
    }

    public void setShakingThreshold(int i) {
        if (i > 0) {
            this.shakeThreshold = i;
            List<a> currentInvokers = InvocationManager.getInstance().getCurrentInvokers();
            if (currentInvokers != null) {
                for (a next : currentInvokers) {
                    if (next instanceof k) {
                        ((k) next).c.a2 = i;
                    }
                }
            }
        }
    }

    public void setVideoRecordingButtonPosition(InstabugVideoRecordingButtonPosition instabugVideoRecordingButtonPosition) {
        this.videoRecordingButtonPosition = instabugVideoRecordingButtonPosition;
    }
}
