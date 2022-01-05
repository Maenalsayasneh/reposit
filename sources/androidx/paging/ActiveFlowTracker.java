package androidx.paging;

import m0.i;
import m0.l.c;

/* compiled from: CachedPagingData.kt */
public interface ActiveFlowTracker {

    /* compiled from: CachedPagingData.kt */
    public enum FlowType {
        PAGED_DATA_FLOW,
        PAGE_EVENT_FLOW
    }

    Object a(FlowType flowType, c<? super i> cVar);

    Object b(FlowType flowType, c<? super i> cVar);
}
