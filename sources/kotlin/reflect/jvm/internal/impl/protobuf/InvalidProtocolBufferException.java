package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import m0.r.t.a.r.h.l;

public class InvalidProtocolBufferException extends IOException {
    public l c = null;

    public InvalidProtocolBufferException(String str) {
        super(str);
    }

    public static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static InvalidProtocolBufferException d() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public InvalidProtocolBufferException c(l lVar) {
        this.c = lVar;
        return this;
    }
}
