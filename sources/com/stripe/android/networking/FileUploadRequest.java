package com.stripe.android.networking;

import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.AppInfo;
import com.stripe.android.model.StripeFileParams;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.RequestHeadersFactory;
import com.stripe.android.networking.StripeRequest;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URLConnection;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.random.Random;
import kotlin.text.StringsKt__IndentKt;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 <2\u00020\u0001:\u0001<BC\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00105\u001a\u000204\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\u0014\b\u0002\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000408\u0012\b\b\u0002\u0010+\u001a\u00020\u0004¢\u0006\u0004\b:\u0010;J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\r\u0010\fR\u001c\u0010\u0013\u001a\u00020\u00048@@\u0001X\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\u00020\u00148\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u00020\u00198\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\u00020\u001e8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R(\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0002\b\u0003\u0018\u00010#8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010(\u001a\u00020\u00048\u0016@\u0016XD¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0010R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u001c\u0010.\u001a\u00020\u00048@@\u0001X\u0004¢\u0006\f\u0012\u0004\b-\u0010\u0012\u001a\u0004\b,\u0010\u0010R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u00020\u00048P@\u0010X\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0010¨\u0006="}, d2 = {"Lcom/stripe/android/networking/FileUploadRequest;", "Lcom/stripe/android/networking/StripeRequest;", "Ljava/io/PrintWriter;", "writer", "", "contents", "Lm0/i;", "writeString", "(Ljava/io/PrintWriter;Ljava/lang/String;)V", "Ljava/io/OutputStream;", "outputStream", "writeFile", "(Ljava/io/OutputStream;)V", "writeBody$payments_core_release", "writeBody", "getPurposeContents$payments_core_release", "()Ljava/lang/String;", "getPurposeContents$payments_core_release$annotations", "()V", "purposeContents", "Lcom/stripe/android/networking/StripeRequest$Method;", "method", "Lcom/stripe/android/networking/StripeRequest$Method;", "getMethod", "()Lcom/stripe/android/networking/StripeRequest$Method;", "Lcom/stripe/android/networking/StripeRequest$MimeType;", "mimeType", "Lcom/stripe/android/networking/StripeRequest$MimeType;", "getMimeType", "()Lcom/stripe/android/networking/StripeRequest$MimeType;", "Lcom/stripe/android/networking/RequestHeadersFactory;", "headersFactory", "Lcom/stripe/android/networking/RequestHeadersFactory;", "getHeadersFactory", "()Lcom/stripe/android/networking/RequestHeadersFactory;", "", "params", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "baseUrl", "Ljava/lang/String;", "getBaseUrl", "boundary", "getFileMetadata$payments_core_release", "getFileMetadata$payments_core_release$annotations", "fileMetadata", "Lcom/stripe/android/model/StripeFileParams;", "fileParams", "Lcom/stripe/android/model/StripeFileParams;", "getContentType$payments_core_release", "contentType", "Lcom/stripe/android/networking/ApiRequest$Options;", "options", "Lcom/stripe/android/AppInfo;", "appInfo", "Lkotlin/Function1;", "systemPropertySupplier", "<init>", "(Lcom/stripe/android/model/StripeFileParams;Lcom/stripe/android/networking/ApiRequest$Options;Lcom/stripe/android/AppInfo;Lm0/n/a/l;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FileUploadRequest.kt */
public final class FileUploadRequest extends StripeRequest {
    public static final Companion Companion = new Companion((f) null);
    private static final String LINE_BREAK = "\r\n";
    private final String baseUrl;
    private final String boundary;
    private final StripeFileParams fileParams;
    private final RequestHeadersFactory headersFactory;
    private final StripeRequest.Method method;
    private final StripeRequest.MimeType mimeType;
    private final Map<String, ?> params;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/networking/FileUploadRequest$Companion;", "", "", "createBoundary", "()Ljava/lang/String;", "LINE_BREAK", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: FileUploadRequest.kt */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final String createBoundary() {
            return String.valueOf(Random.d.d(0, RecyclerView.FOREVER_NS));
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileUploadRequest(StripeFileParams stripeFileParams, ApiRequest.Options options, AppInfo appInfo, l<String, String> lVar, String str, int i, f fVar) {
        this(stripeFileParams, options, (i & 4) != 0 ? null : appInfo, (i & 8) != 0 ? StripeRequest.Companion.getDEFAULT_SYSTEM_PROPERTY_SUPPLIER$payments_core_release() : lVar, (i & 16) != 0 ? Companion.createBoundary() : str);
    }

    public static /* synthetic */ void getFileMetadata$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getPurposeContents$payments_core_release$annotations() {
    }

    private final void writeFile(OutputStream outputStream) {
        h.Y(new FileInputStream(this.fileParams.getFile$payments_core_release()), outputStream, 0, 2);
    }

    private final void writeString(PrintWriter printWriter, String str) {
        printWriter.write(StringsKt__IndentKt.B(str, "\n", "\r\n", false, 4));
        printWriter.flush();
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public String getContentType$payments_core_release() {
        return getMimeType().getCode() + "; boundary=" + this.boundary;
    }

    public final String getFileMetadata$payments_core_release() {
        String name = this.fileParams.getFile$payments_core_release().getName();
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(name);
        StringBuilder P0 = a.P0("\n                --");
        a.s(P0, this.boundary, "\n                Content-Disposition: form-data; name=\"file\"; filename=\"", name, "\"\n                Content-Type: ");
        P0.append(guessContentTypeFromName);
        P0.append("\n                Content-Transfer-Encoding: binary\n\n\n            ");
        return StringsKt__IndentKt.Y(P0.toString());
    }

    public RequestHeadersFactory getHeadersFactory() {
        return this.headersFactory;
    }

    public StripeRequest.Method getMethod() {
        return this.method;
    }

    public StripeRequest.MimeType getMimeType() {
        return this.mimeType;
    }

    public Map<String, ?> getParams() {
        return this.params;
    }

    public final String getPurposeContents$payments_core_release() {
        StringBuilder P0 = a.P0("\n                --");
        P0.append(this.boundary);
        P0.append("\n                Content-Disposition: form-data; name=\"purpose\"\n\n                ");
        P0.append(this.fileParams.getPurpose$payments_core_release().getCode$payments_core_release());
        P0.append("\n\n            ");
        return StringsKt__IndentKt.Y(P0.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        i0.j.f.p.h.H(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        i0.j.f.p.h.H(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeBody$payments_core_release(java.io.OutputStream r5) {
        /*
            r4 = this;
            java.lang.String r0 = "--"
            java.lang.String r1 = "outputStream"
            m0.n.b.i.e(r5, r1)
            java.nio.charset.Charset r1 = m0.t.a.a
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter
            r2.<init>(r5, r1)
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch:{ all -> 0x0053 }
            r3 = 1
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0053 }
            java.lang.String r3 = r4.getPurposeContents$payments_core_release()     // Catch:{ all -> 0x004c }
            r4.writeString(r1, r3)     // Catch:{ all -> 0x004c }
            java.lang.String r3 = r4.getFileMetadata$payments_core_release()     // Catch:{ all -> 0x004c }
            r4.writeString(r1, r3)     // Catch:{ all -> 0x004c }
            r4.writeFile(r5)     // Catch:{ all -> 0x004c }
            java.lang.String r5 = "\r\n"
            r1.write(r5)     // Catch:{ all -> 0x004c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r5.<init>()     // Catch:{ all -> 0x004c }
            r5.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r3 = r4.boundary     // Catch:{ all -> 0x004c }
            r5.append(r3)     // Catch:{ all -> 0x004c }
            r5.append(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x004c }
            r1.write(r5)     // Catch:{ all -> 0x004c }
            r1.flush()     // Catch:{ all -> 0x004c }
            r5 = 0
            i0.j.f.p.h.H(r1, r5)     // Catch:{ all -> 0x0053 }
            i0.j.f.p.h.H(r2, r5)
            return
        L_0x004c:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            i0.j.f.p.h.H(r1, r5)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            i0.j.f.p.h.H(r2, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.FileUploadRequest.writeBody$payments_core_release(java.io.OutputStream):void");
    }

    public FileUploadRequest(StripeFileParams stripeFileParams, ApiRequest.Options options, AppInfo appInfo, l<? super String, String> lVar, String str) {
        i.e(stripeFileParams, "fileParams");
        i.e(options, "options");
        i.e(lVar, "systemPropertySupplier");
        i.e(str, "boundary");
        this.fileParams = stripeFileParams;
        this.boundary = str;
        this.method = StripeRequest.Method.POST;
        this.baseUrl = "https://files.stripe.com/v1/files";
        this.mimeType = StripeRequest.MimeType.MultipartForm;
        this.headersFactory = new RequestHeadersFactory.Api(options, appInfo, (Locale) null, lVar, (String) null, (String) null, 52, (f) null);
    }
}
