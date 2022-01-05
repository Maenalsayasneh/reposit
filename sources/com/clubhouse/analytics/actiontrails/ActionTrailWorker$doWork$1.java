package com.clubhouse.analytics.actiontrails;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.analytics.actiontrails.ActionTrailWorker", f = "ActionTrailWorker.kt", l = {57}, m = "doWork")
/* compiled from: ActionTrailWorker.kt */
public final class ActionTrailWorker$doWork$1 extends ContinuationImpl {
    public int Y1;
    public Object c;
    public Object d;
    public Object q;
    public /* synthetic */ Object x;
    public final /* synthetic */ ActionTrailWorker y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionTrailWorker$doWork$1(ActionTrailWorker actionTrailWorker, m0.l.c<? super ActionTrailWorker$doWork$1> cVar) {
        super(cVar);
        this.y = actionTrailWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.Y1 |= Integer.MIN_VALUE;
        return this.y.g(this);
    }
}
