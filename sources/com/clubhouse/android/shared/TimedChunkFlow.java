package com.clubhouse.android.shared;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.c;
import m0.n.b.i;
import n0.a.g2.d;
import n0.a.g2.s;

/* compiled from: TimedChunkFlow.kt */
public final class TimedChunkFlow<T> {
    public final ReentrantLock a = new ReentrantLock();
    public List<T> b = new ArrayList();
    public final d<List<T>> c;

    public TimedChunkFlow(d<? extends T> dVar, long j) {
        i.e(dVar, "sourceFlow");
        s sVar = new s(new TimedChunkFlow$resultFlow$1(dVar, this, (c<? super TimedChunkFlow$resultFlow$1>) null));
        if (j > 0) {
            this.c = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new n0.a.g2.d0.i(new FlowKt__DelayKt$sample$2(j, sVar, (c<? super FlowKt__DelayKt$sample$2>) null)), new TimedChunkFlow$resultFlow$2(this, (c<? super TimedChunkFlow$resultFlow$2>) null));
            return;
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }
}
