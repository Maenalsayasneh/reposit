package io.sentry;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pubnub.api.vendor.FileEncryptionUtil;
import io.sentry.adapters.CollectionAdapter;
import io.sentry.adapters.ContextsDeserializerAdapter;
import io.sentry.adapters.ContextsSerializerAdapter;
import io.sentry.adapters.DateDeserializerAdapter;
import io.sentry.adapters.DateSerializerAdapter;
import io.sentry.adapters.MapAdapter;
import io.sentry.adapters.OrientationDeserializerAdapter;
import io.sentry.adapters.OrientationSerializerAdapter;
import io.sentry.adapters.SentryIdDeserializerAdapter;
import io.sentry.adapters.SentryIdSerializerAdapter;
import io.sentry.adapters.SentryLevelDeserializerAdapter;
import io.sentry.adapters.SentryLevelSerializerAdapter;
import io.sentry.adapters.SpanIdDeserializerAdapter;
import io.sentry.adapters.SpanIdSerializerAdapter;
import io.sentry.adapters.SpanStatusDeserializerAdapter;
import io.sentry.adapters.SpanStatusSerializerAdapter;
import io.sentry.adapters.TimeZoneDeserializerAdapter;
import io.sentry.adapters.TimeZoneSerializerAdapter;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.Device;
import io.sentry.protocol.SentryId;
import io.sentry.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

public final class GsonSerializer implements ISerializer {
    private static final Charset UTF_8 = Charset.forName(FileEncryptionUtil.ENCODING_UTF_8);
    private final IEnvelopeReader envelopeReader;
    private final Gson gson = provideGson();
    private final ILogger logger;

    private static /* synthetic */ void $closeResource(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    public GsonSerializer(ILogger iLogger, IEnvelopeReader iEnvelopeReader) {
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "The ILogger object is required.");
        this.envelopeReader = (IEnvelopeReader) Objects.requireNonNull(iEnvelopeReader, "The IEnvelopeReader object is required.");
    }

    private Gson provideGson() {
        Class<SpanStatus> cls = SpanStatus.class;
        Class<SpanId> cls2 = SpanId.class;
        Class<SentryLevel> cls3 = SentryLevel.class;
        Class<Device.DeviceOrientation> cls4 = Device.DeviceOrientation.class;
        Class<SentryId> cls5 = SentryId.class;
        return new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).registerTypeAdapter(cls5, new SentryIdSerializerAdapter(this.logger)).registerTypeAdapter(cls5, new SentryIdDeserializerAdapter(this.logger)).registerTypeAdapter(Date.class, new DateSerializerAdapter(this.logger)).registerTypeAdapter(Date.class, new DateDeserializerAdapter(this.logger)).registerTypeAdapter(TimeZone.class, new TimeZoneSerializerAdapter(this.logger)).registerTypeAdapter(TimeZone.class, new TimeZoneDeserializerAdapter(this.logger)).registerTypeAdapter(cls4, new OrientationSerializerAdapter(this.logger)).registerTypeAdapter(cls4, new OrientationDeserializerAdapter(this.logger)).registerTypeAdapter(cls3, new SentryLevelSerializerAdapter(this.logger)).registerTypeAdapter(cls3, new SentryLevelDeserializerAdapter(this.logger)).registerTypeAdapter(Contexts.class, new ContextsDeserializerAdapter(this.logger)).registerTypeAdapter(Contexts.class, new ContextsSerializerAdapter(this.logger)).registerTypeAdapterFactory(UnknownPropertiesTypeAdapterFactory.get()).registerTypeAdapter(SentryEnvelopeHeader.class, new SentryEnvelopeHeaderAdapter()).registerTypeAdapter(SentryEnvelopeItemHeader.class, new SentryEnvelopeItemHeaderAdapter()).registerTypeAdapter(Session.class, new SessionAdapter(this.logger)).registerTypeAdapter(cls2, new SpanIdDeserializerAdapter(this.logger)).registerTypeAdapter(cls2, new SpanIdSerializerAdapter(this.logger)).registerTypeAdapter(cls, new SpanStatusDeserializerAdapter(this.logger)).registerTypeAdapter(cls, new SpanStatusSerializerAdapter(this.logger)).registerTypeHierarchyAdapter(Collection.class, new CollectionAdapter()).registerTypeHierarchyAdapter(Map.class, new MapAdapter()).disableHtmlEscaping().create();
    }

    public <T> T deserialize(Reader reader, Class<T> cls) {
        Objects.requireNonNull(reader, "The Reader object is required.");
        Objects.requireNonNull(cls, "The Class type is required.");
        return this.gson.fromJson(reader, cls);
    }

    public SentryEnvelope deserializeEnvelope(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "The InputStream object is required.");
        try {
            return this.envelopeReader.read(inputStream);
        } catch (IOException e) {
            this.logger.log(SentryLevel.ERROR, "Error deserializing envelope.", (Throwable) e);
            return null;
        }
    }

    public <T> void serialize(T t, Writer writer) throws IOException {
        Objects.requireNonNull(t, "The entity is required.");
        Objects.requireNonNull(writer, "The Writer object is required.");
        ILogger iLogger = this.logger;
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        if (iLogger.isEnabled(sentryLevel)) {
            this.logger.log(sentryLevel, "Serializing object: %s", this.gson.toJson((Object) t));
        }
        this.gson.toJson((Object) t, (Type) t.getClass(), (Appendable) writer);
        writer.flush();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        $closeResource(r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        $closeResource(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void serialize(io.sentry.SentryEnvelope r8, java.io.OutputStream r9) throws java.lang.Exception {
        /*
            r7 = this;
            java.lang.String r0 = "\n"
            java.lang.String r1 = "The SentryEnvelope object is required."
            io.sentry.util.Objects.requireNonNull(r8, r1)
            java.lang.String r1 = "The Stream object is required."
            io.sentry.util.Objects.requireNonNull(r9, r1)
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream
            r1.<init>(r9)
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ all -> 0x0078 }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0078 }
            java.nio.charset.Charset r4 = UTF_8     // Catch:{ all -> 0x0078 }
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0078 }
            r2.<init>(r3)     // Catch:{ all -> 0x0078 }
            com.google.gson.Gson r3 = r7.gson     // Catch:{ all -> 0x0071 }
            io.sentry.SentryEnvelopeHeader r4 = r8.getHeader()     // Catch:{ all -> 0x0071 }
            java.lang.Class<io.sentry.SentryEnvelopeHeader> r5 = io.sentry.SentryEnvelopeHeader.class
            r3.toJson((java.lang.Object) r4, (java.lang.reflect.Type) r5, (java.lang.Appendable) r2)     // Catch:{ all -> 0x0071 }
            r2.write(r0)     // Catch:{ all -> 0x0071 }
            java.lang.Iterable r8 = r8.getItems()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x0071 }
        L_0x0033:
            boolean r3 = r8.hasNext()     // Catch:{ all -> 0x0071 }
            if (r3 == 0) goto L_0x0066
            java.lang.Object r3 = r8.next()     // Catch:{ all -> 0x0071 }
            io.sentry.SentryEnvelopeItem r3 = (io.sentry.SentryEnvelopeItem) r3     // Catch:{ all -> 0x0071 }
            byte[] r4 = r3.getData()     // Catch:{ Exception -> 0x005b }
            com.google.gson.Gson r5 = r7.gson     // Catch:{ Exception -> 0x005b }
            io.sentry.SentryEnvelopeItemHeader r3 = r3.getHeader()     // Catch:{ Exception -> 0x005b }
            java.lang.Class<io.sentry.SentryEnvelopeItemHeader> r6 = io.sentry.SentryEnvelopeItemHeader.class
            r5.toJson((java.lang.Object) r3, (java.lang.reflect.Type) r6, (java.lang.Appendable) r2)     // Catch:{ Exception -> 0x005b }
            r2.write(r0)     // Catch:{ Exception -> 0x005b }
            r2.flush()     // Catch:{ Exception -> 0x005b }
            r9.write(r4)     // Catch:{ Exception -> 0x005b }
            r2.write(r0)     // Catch:{ Exception -> 0x005b }
            goto L_0x0033
        L_0x005b:
            r3 = move-exception
            io.sentry.ILogger r4 = r7.logger     // Catch:{ all -> 0x0071 }
            io.sentry.SentryLevel r5 = io.sentry.SentryLevel.ERROR     // Catch:{ all -> 0x0071 }
            java.lang.String r6 = "Failed to create envelope item. Dropping it."
            r4.log((io.sentry.SentryLevel) r5, (java.lang.String) r6, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0033
        L_0x0066:
            r2.flush()     // Catch:{ all -> 0x0071 }
            r8 = 0
            $closeResource(r8, r2)     // Catch:{ all -> 0x0078 }
            $closeResource(r8, r1)
            return
        L_0x0071:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r9 = move-exception
            $closeResource(r8, r2)     // Catch:{ all -> 0x0078 }
            throw r9     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x007a }
        L_0x007a:
            r9 = move-exception
            $closeResource(r8, r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.GsonSerializer.serialize(io.sentry.SentryEnvelope, java.io.OutputStream):void");
    }

    public String serialize(Map<String, Object> map) throws Exception {
        Objects.requireNonNull(map, "The SentryEnvelope object is required.");
        return this.gson.toJson((Object) map);
    }
}
