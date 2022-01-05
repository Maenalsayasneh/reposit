package m0.r.t.a.r.h;

import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import m0.r.t.a.r.h.l;

/* compiled from: AbstractParser */
public abstract class b<MessageType extends l> implements n<MessageType> {
    static {
        e eVar = e.a;
    }

    public final MessageType b(MessageType messagetype) throws InvalidProtocolBufferException {
        UninitializedMessageException uninitializedMessageException;
        if (messagetype == null || messagetype.g()) {
            return messagetype;
        }
        if (messagetype instanceof a) {
            a aVar = (a) messagetype;
            uninitializedMessageException = new UninitializedMessageException();
        } else {
            uninitializedMessageException = new UninitializedMessageException();
        }
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(uninitializedMessageException.getMessage());
        invalidProtocolBufferException.c = messagetype;
        throw invalidProtocolBufferException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r2 >= 64) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        r3 = r6.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r3 == -1) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if ((r3 & 128) != 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        r2 = r2 + 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        throw kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
        throw new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(java.io.InputStream r6, m0.r.t.a.r.h.e r7) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r5 = this;
            int r0 = r6.read()     // Catch:{ IOException -> 0x0057 }
            r1 = -1
            if (r0 != r1) goto L_0x0009
            r6 = 0
            goto L_0x0043
        L_0x0009:
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x000e
            goto L_0x003a
        L_0x000e:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            r2 = 7
        L_0x0011:
            r3 = 32
            if (r2 >= r3) goto L_0x002c
            int r3 = r6.read()     // Catch:{ IOException -> 0x0057 }
            if (r3 == r1) goto L_0x0027
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r4 = r4 << r2
            r0 = r0 | r4
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x0024
            goto L_0x003a
        L_0x0024:
            int r2 = r2 + 7
            goto L_0x0011
        L_0x0027:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r6 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.d()     // Catch:{ IOException -> 0x0057 }
            throw r6     // Catch:{ IOException -> 0x0057 }
        L_0x002c:
            r3 = 64
            if (r2 >= r3) goto L_0x004f
            int r3 = r6.read()     // Catch:{ IOException -> 0x0057 }
            if (r3 == r1) goto L_0x004a
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x0047
        L_0x003a:
            m0.r.t.a.r.h.a$a$a r1 = new m0.r.t.a.r.h.a$a$a
            r1.<init>(r6, r0)
            m0.r.t.a.r.h.l r6 = r5.d(r1, r7)
        L_0x0043:
            r5.b(r6)
            return r6
        L_0x0047:
            int r2 = r2 + 7
            goto L_0x002c
        L_0x004a:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r6 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.d()     // Catch:{ IOException -> 0x0057 }
            throw r6     // Catch:{ IOException -> 0x0057 }
        L_0x004f:
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r6 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ IOException -> 0x0057 }
            java.lang.String r7 = "CodedInputStream encountered a malformed varint."
            r6.<init>(r7)     // Catch:{ IOException -> 0x0057 }
            throw r6     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            r6 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r7 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.h.b.c(java.io.InputStream, m0.r.t.a.r.h.e):java.lang.Object");
    }

    public MessageType d(InputStream inputStream, e eVar) throws InvalidProtocolBufferException {
        d dVar = new d(inputStream);
        MessageType messagetype = (l) a(dVar, eVar);
        try {
            dVar.a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            e.c = messagetype;
            throw e;
        }
    }
}
