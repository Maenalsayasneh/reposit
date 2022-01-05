package com.stripe.android;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.EphemeralOperation;
import com.stripe.android.model.parsers.EphemeralKeyJsonParser;
import i0.j.f.p.h;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.EmptySet;
import kotlin.text.StringsKt__IndentKt;
import m0.n.a.a;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 12\u00020\u0001:\u00042134BI\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010-\u001a\u00020,\u0012\b\b\u0002\u0010.\u001a\u00020\u0014\u0012\u0012\b\u0002\u0010#\u001a\f\u0012\u0004\u0012\u00020!0 j\u0002`\"\u0012\b\b\u0002\u0010%\u001a\u00020!¢\u0006\u0004\b/\u00100J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010#\u001a\f\u0012\u0004\u0012\u00020!0 j\u0002`\"8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020!8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00065"}, d2 = {"Lcom/stripe/android/EphemeralKeyManager;", "", "Lcom/stripe/android/EphemeralOperation;", "operation", "", "key", "Lm0/i;", "updateKey", "(Lcom/stripe/android/EphemeralOperation;Ljava/lang/String;)V", "operationId", "", "errorCode", "errorMessage", "updateKeyError", "(Ljava/lang/String;ILjava/lang/String;)V", "retrieveEphemeralKey$payments_core_release", "(Lcom/stripe/android/EphemeralOperation;)V", "retrieveEphemeralKey", "Lcom/stripe/android/EphemeralKey;", "ephemeralKey", "", "shouldRefreshKey$payments_core_release", "(Lcom/stripe/android/EphemeralKey;)Z", "shouldRefreshKey", "Lcom/stripe/android/EphemeralKeyProvider;", "ephemeralKeyProvider", "Lcom/stripe/android/EphemeralKeyProvider;", "apiVersion", "Ljava/lang/String;", "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", "listener", "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", "Lkotlin/Function0;", "", "Lcom/stripe/android/TimeSupplier;", "timeSupplier", "Lm0/n/a/a;", "timeBufferInSeconds", "J", "Lcom/stripe/android/EphemeralKey;", "getEphemeralKey$payments_core_release", "()Lcom/stripe/android/EphemeralKey;", "setEphemeralKey$payments_core_release", "(Lcom/stripe/android/EphemeralKey;)V", "Lcom/stripe/android/OperationIdFactory;", "operationIdFactory", "shouldPrefetchEphemeralKey", "<init>", "(Lcom/stripe/android/EphemeralKeyProvider;Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;Lcom/stripe/android/OperationIdFactory;ZLm0/n/a/a;J)V", "Companion", "ClientKeyUpdateListener", "Factory", "KeyManagerListener", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: EphemeralKeyManager.kt */
public final class EphemeralKeyManager {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final long REFRESH_BUFFER_IN_SECONDS = 30;
    private final String apiVersion;
    private /* synthetic */ EphemeralKey ephemeralKey;
    private final EphemeralKeyProvider ephemeralKeyProvider;
    private final KeyManagerListener listener;
    private final long timeBufferInSeconds;
    private final a<Long> timeSupplier;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/EphemeralKeyManager$ClientKeyUpdateListener;", "Lcom/stripe/android/EphemeralKeyUpdateListener;", "", "stripeResponseJson", "Lm0/i;", "onKeyUpdate", "(Ljava/lang/String;)V", "", "responseCode", "message", "onKeyUpdateFailure", "(ILjava/lang/String;)V", "Lcom/stripe/android/EphemeralKeyManager;", "ephemeralKeyManager", "Lcom/stripe/android/EphemeralKeyManager;", "Lcom/stripe/android/EphemeralOperation;", "operation", "Lcom/stripe/android/EphemeralOperation;", "<init>", "(Lcom/stripe/android/EphemeralKeyManager;Lcom/stripe/android/EphemeralOperation;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: EphemeralKeyManager.kt */
    public static final class ClientKeyUpdateListener implements EphemeralKeyUpdateListener {
        private final EphemeralKeyManager ephemeralKeyManager;
        private final EphemeralOperation operation;

        public ClientKeyUpdateListener(EphemeralKeyManager ephemeralKeyManager2, EphemeralOperation ephemeralOperation) {
            i.e(ephemeralKeyManager2, "ephemeralKeyManager");
            i.e(ephemeralOperation, "operation");
            this.ephemeralKeyManager = ephemeralKeyManager2;
            this.operation = ephemeralOperation;
        }

        public void onKeyUpdate(String str) {
            i.e(str, "stripeResponseJson");
            this.ephemeralKeyManager.updateKey(this.operation, str);
        }

        public void onKeyUpdateFailure(int i, String str) {
            i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            this.ephemeralKeyManager.updateKeyError(this.operation.getId$payments_core_release(), i, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/EphemeralKeyManager$Companion;", "", "", "REFRESH_BUFFER_IN_SECONDS", "J", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: EphemeralKeyManager.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bà\u0001\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/stripe/android/EphemeralKeyManager$Factory;", "", "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", "arg", "Lcom/stripe/android/EphemeralKeyManager;", "create", "(Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;)Lcom/stripe/android/EphemeralKeyManager;", "Default", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: EphemeralKeyManager.kt */
    public interface Factory {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0012\b\u0002\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/EphemeralKeyManager$Factory$Default;", "Lcom/stripe/android/EphemeralKeyManager$Factory;", "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", "arg", "Lcom/stripe/android/EphemeralKeyManager;", "create", "(Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;)Lcom/stripe/android/EphemeralKeyManager;", "Lcom/stripe/android/OperationIdFactory;", "operationIdFactory", "Lcom/stripe/android/OperationIdFactory;", "Lkotlin/Function0;", "", "Lcom/stripe/android/TimeSupplier;", "timeSupplier", "Lm0/n/a/a;", "", "shouldPrefetchEphemeralKey", "Z", "Lcom/stripe/android/EphemeralKeyProvider;", "keyProvider", "Lcom/stripe/android/EphemeralKeyProvider;", "<init>", "(Lcom/stripe/android/EphemeralKeyProvider;ZLcom/stripe/android/OperationIdFactory;Lm0/n/a/a;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: EphemeralKeyManager.kt */
        public static final class Default implements Factory {
            private final EphemeralKeyProvider keyProvider;
            private final OperationIdFactory operationIdFactory;
            private final boolean shouldPrefetchEphemeralKey;
            private final a<Long> timeSupplier;

            public Default(EphemeralKeyProvider ephemeralKeyProvider, boolean z, OperationIdFactory operationIdFactory2, a<Long> aVar) {
                i.e(ephemeralKeyProvider, "keyProvider");
                i.e(operationIdFactory2, "operationIdFactory");
                i.e(aVar, "timeSupplier");
                this.keyProvider = ephemeralKeyProvider;
                this.shouldPrefetchEphemeralKey = z;
                this.operationIdFactory = operationIdFactory2;
                this.timeSupplier = aVar;
            }

            public /* synthetic */ EphemeralKeyManager create(KeyManagerListener keyManagerListener) {
                i.e(keyManagerListener, "arg");
                return new EphemeralKeyManager(this.keyProvider, keyManagerListener, this.operationIdFactory, this.shouldPrefetchEphemeralKey, this.timeSupplier, 0, 32, (f) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Default(EphemeralKeyProvider ephemeralKeyProvider, boolean z, OperationIdFactory operationIdFactory2, a aVar, int i, f fVar) {
                this(ephemeralKeyProvider, z, (i & 4) != 0 ? new StripeOperationIdFactory() : operationIdFactory2, (i & 8) != 0 ? AnonymousClass1.INSTANCE : aVar);
            }
        }

        EphemeralKeyManager create(KeyManagerListener keyManagerListener);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", "", "Lcom/stripe/android/EphemeralKey;", "ephemeralKey", "Lcom/stripe/android/EphemeralOperation;", "operation", "Lm0/i;", "onKeyUpdate", "(Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/EphemeralOperation;)V", "", "operationId", "", "errorCode", "errorMessage", "onKeyError", "(Ljava/lang/String;ILjava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: EphemeralKeyManager.kt */
    public interface KeyManagerListener {
        void onKeyError(String str, int i, String str2);

        void onKeyUpdate(EphemeralKey ephemeralKey, EphemeralOperation ephemeralOperation);
    }

    public EphemeralKeyManager(EphemeralKeyProvider ephemeralKeyProvider2, KeyManagerListener keyManagerListener, OperationIdFactory operationIdFactory, boolean z, a<Long> aVar, long j) {
        i.e(ephemeralKeyProvider2, "ephemeralKeyProvider");
        i.e(keyManagerListener, "listener");
        i.e(operationIdFactory, "operationIdFactory");
        i.e(aVar, "timeSupplier");
        this.ephemeralKeyProvider = ephemeralKeyProvider2;
        this.listener = keyManagerListener;
        this.timeSupplier = aVar;
        this.timeBufferInSeconds = j;
        this.apiVersion = ApiVersion.Companion.get$payments_core_release().getCode();
        if (z) {
            retrieveEphemeralKey$payments_core_release(new EphemeralOperation.RetrieveKey(operationIdFactory.create(), EmptySet.c));
        }
    }

    /* access modifiers changed from: private */
    public final void updateKey(EphemeralOperation ephemeralOperation, String str) {
        EphemeralKey ephemeralKey2;
        String str2;
        if (str == null) {
            this.listener.onKeyError(ephemeralOperation.getId$payments_core_release(), 500, "EphemeralKeyUpdateListener.onKeyUpdate was called with a null value");
            return;
        }
        try {
            EphemeralKey parse = new EphemeralKeyJsonParser().parse(new JSONObject(str));
            this.ephemeralKey = parse;
            ephemeralKey2 = parse;
        } catch (Throwable th) {
            ephemeralKey2 = h.l0(th);
        }
        Throwable a = Result.a(ephemeralKey2);
        if (a == null) {
            this.listener.onKeyUpdate((EphemeralKey) ephemeralKey2, ephemeralOperation);
            return;
        }
        if (a instanceof JSONException) {
            StringBuilder P0 = i0.d.a.a.a.P0("\n                        Received an ephemeral key that could not be parsed. See https://stripe.com/docs/mobile/android/basic for more details.\n                        \n                        ");
            P0.append(a.getMessage());
            P0.append("\n                        ");
            str2 = StringsKt__IndentKt.Y(P0.toString());
        } else {
            StringBuilder P02 = i0.d.a.a.a.P0("\n                        Received an invalid ephemeral key. See https://stripe.com/docs/mobile/android/basic for more details.\n                        \n                        ");
            P02.append(a.getMessage());
            P02.append("\n                        ");
            str2 = StringsKt__IndentKt.Y(P02.toString());
        }
        this.listener.onKeyError(ephemeralOperation.getId$payments_core_release(), 500, str2);
    }

    /* access modifiers changed from: private */
    public final void updateKeyError(String str, int i, String str2) {
        this.ephemeralKey = null;
        this.listener.onKeyError(str, i, str2);
    }

    public final EphemeralKey getEphemeralKey$payments_core_release() {
        return this.ephemeralKey;
    }

    public final /* synthetic */ void retrieveEphemeralKey$payments_core_release(EphemeralOperation ephemeralOperation) {
        i.e(ephemeralOperation, "operation");
        EphemeralKey ephemeralKey2 = this.ephemeralKey;
        if (ephemeralKey2 == null || shouldRefreshKey$payments_core_release(ephemeralKey2)) {
            ephemeralKey2 = null;
        }
        if (ephemeralKey2 != null) {
            this.listener.onKeyUpdate(ephemeralKey2, ephemeralOperation);
        } else {
            this.ephemeralKeyProvider.createEphemeralKey(this.apiVersion, new ClientKeyUpdateListener(this, ephemeralOperation));
        }
    }

    public final void setEphemeralKey$payments_core_release(EphemeralKey ephemeralKey2) {
        this.ephemeralKey = ephemeralKey2;
    }

    public final boolean shouldRefreshKey$payments_core_release(EphemeralKey ephemeralKey2) {
        if (ephemeralKey2 == null) {
            return true;
        }
        if (ephemeralKey2.getExpires$payments_core_release() < TimeUnit.MILLISECONDS.toSeconds(this.timeSupplier.invoke().longValue()) + this.timeBufferInSeconds) {
            return true;
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EphemeralKeyManager(EphemeralKeyProvider ephemeralKeyProvider2, KeyManagerListener keyManagerListener, OperationIdFactory operationIdFactory, boolean z, a aVar, long j, int i, f fVar) {
        this(ephemeralKeyProvider2, keyManagerListener, (i & 4) != 0 ? new StripeOperationIdFactory() : operationIdFactory, (i & 8) != 0 ? true : z, (i & 16) != 0 ? AnonymousClass1.INSTANCE : aVar, (i & 32) != 0 ? 30 : j);
    }
}
