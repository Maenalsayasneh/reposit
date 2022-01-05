package kotlinx.coroutines.channels;

import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/ClosedReceiveChannelException;", "Ljava/util/NoSuchElementException;", "Lkotlin/NoSuchElementException;", "", "message", "<init>", "(Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
/* compiled from: Channel.kt */
public final class ClosedReceiveChannelException extends NoSuchElementException {
    public ClosedReceiveChannelException(String str) {
        super(str);
    }
}
