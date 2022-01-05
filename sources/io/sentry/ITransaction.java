package io.sentry;

import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;

public interface ITransaction extends ISpan {
    Contexts getContexts();

    SentryId getEventId();

    Span getLatestActiveSpan();

    String getName();

    Request getRequest();

    List<Span> getSpans();

    @ApiStatus.Internal
    String getTransaction();

    Boolean isSampled();

    void setName(String str);

    void setRequest(Request request);
}
