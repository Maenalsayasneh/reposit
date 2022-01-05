package com.pubnub.api.endpoints.files;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.endpoints.remoteaction.RemoteAction;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.enums.PNStatusCategory;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.models.consumer.PNErrorData;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.server.files.FileUploadRequestDetails;
import com.pubnub.api.models.server.files.FormField;
import com.pubnub.api.services.S3Service;
import com.pubnub.api.vendor.FileEncryptionUtil;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import m0.n.b.i;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import q0.d0;
import q0.y;
import q0.z;
import s0.c.b;
import s0.c.c;
import t0.d;
import t0.f;
import t0.v;

public class UploadFile implements RemoteAction<Void> {
    private static final y APPLICATION_OCTET_STREAM = y.b("application/octet-stream");
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    private static final String FILE_PART_MULTIPART = "file";
    private static final b log = c.e(UploadFile.class);
    private final String baseUrl;
    /* access modifiers changed from: private */
    public d<Void> call;
    private final String cipherKey;
    private final byte[] content;
    private final String fileName;
    private final List<FormField> formParams;
    private final FormField key;
    private final S3Service s3Service;

    public static class Factory {
        private final PubNub pubNub;
        private final RetrofitManager retrofitManager;

        public Factory(PubNub pubNub2, RetrofitManager retrofitManager2) {
            this.pubNub = pubNub2;
            this.retrofitManager = retrofitManager2;
        }

        public RemoteAction<Void> create(String str, byte[] bArr, String str2, FileUploadRequestDetails fileUploadRequestDetails) {
            return new UploadFile(this.retrofitManager.getS3Service(), str, bArr, FileEncryptionUtil.effectiveCipherKey(this.pubNub, str2), fileUploadRequestDetails.getKeyFormField(), fileUploadRequestDetails.getFormFields(), fileUploadRequestDetails.getUrl());
        }
    }

    public UploadFile(S3Service s3Service2, String str, byte[] bArr, String str2, FormField formField, List<FormField> list, String str3) {
        this.s3Service = s3Service2;
        this.fileName = str;
        this.content = bArr;
        this.cipherKey = str2;
        this.key = formField;
        this.formParams = list;
        this.baseUrl = str3;
    }

    private static void addFormParamsWithKeyFirst(FormField formField, List<FormField> list, z.a aVar) {
        aVar.a(formField.getKey(), formField.getValue());
        for (FormField next : list) {
            if (!next.getKey().equals(formField.getKey())) {
                aVar.a(next.getKey(), next.getValue());
            }
        }
    }

    /* access modifiers changed from: private */
    public PubNubException createException(v<Void> vVar) {
        String str = "N/A";
        try {
            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(vVar.c.byteStream());
            parse.getDocumentElement().normalize();
            NodeList elementsByTagName = parse.getElementsByTagName("Message");
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                str = elementsByTagName.item(0).getFirstChild().getNodeValue();
            }
            return PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_HTTP_ERROR).errormsg(str).affectedCall(this.call).statusCode(vVar.a.y).build();
        } catch (IOException | NullPointerException | ParserConfigurationException | SAXException e) {
            return PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_HTTP_ERROR).errormsg(e.getMessage()).affectedCall(this.call).statusCode(vVar.a.y).cause(e).build();
        }
    }

    /* access modifiers changed from: private */
    public PNStatus createStatusResponse(PNStatusCategory pNStatusCategory, v<Void> vVar, Exception exc) {
        PNStatus.PNStatusBuilder builder = PNStatus.builder();
        if (vVar == null || exc != null) {
            builder.error(true);
        }
        if (exc != null) {
            builder.errorData(new PNErrorData(exc.getMessage(), exc));
        }
        if (vVar != null) {
            builder.statusCode(vVar.a.y);
            builder.tlsEnabled(vVar.a.d.b.c);
            builder.origin(vVar.a.d.b.g);
            builder.clientRequest(vVar.a.d);
        }
        builder.operation(getOperationType());
        builder.category(pNStatusCategory);
        return builder.build();
    }

    private String getContentType(List<FormField> list) {
        for (FormField next : list) {
            if (next.getKey().equalsIgnoreCase("Content-Type")) {
                return next.getValue();
            }
        }
        return null;
    }

    private y getMediaType(String str) {
        if (str == null) {
            return APPLICATION_OCTET_STREAM;
        }
        try {
            return y.b(str);
        } catch (Throwable th) {
            b bVar = log;
            bVar.a("Content-Type: " + str + " was not recognized by MediaType.get", th);
            return APPLICATION_OCTET_STREAM;
        }
    }

    private PNOperationType getOperationType() {
        return PNOperationType.PNFileAction;
    }

    private d<Void> prepareCall() throws PubNubException, IOException {
        d0 d0Var;
        z.a aVar = new z.a((String) null, 1);
        aVar.d(z.c);
        addFormParamsWithKeyFirst(this.key, this.formParams, aVar);
        y mediaType = getMediaType(getContentType(this.formParams));
        String str = this.cipherKey;
        if (str == null) {
            d0Var = d0.c(mediaType, this.content);
        } else {
            d0Var = d0.c(mediaType, FileEncryptionUtil.encryptToBytes(str, this.content));
        }
        String str2 = this.fileName;
        i.e(FILE_PART_MULTIPART, "name");
        i.e(d0Var, "body");
        aVar.b(z.c.b(FILE_PART_MULTIPART, str2, d0Var));
        return this.s3Service.upload(this.baseUrl, aVar.c());
    }

    public void async(final PNCallback<Void> pNCallback) {
        try {
            d<Void> prepareCall = prepareCall();
            this.call = prepareCall;
            prepareCall.J(new f<Void>() {
                public void onFailure(d<Void> dVar, Throwable th) {
                    PubNubException.PubNubExceptionBuilder cause;
                    PNStatusCategory pNStatusCategory;
                    if (!UploadFile.this.call.isCanceled()) {
                        cause = PubNubException.builder().errormsg(th.getMessage()).cause(th);
                        try {
                            throw th;
                        } catch (UnknownHostException unused) {
                            cause.pubnubError(PubNubErrorBuilder.PNERROBJ_CONNECTION_NOT_SET);
                            pNStatusCategory = PNStatusCategory.PNUnexpectedDisconnectCategory;
                        } catch (SocketException | SSLException unused2) {
                            cause.pubnubError(PubNubErrorBuilder.PNERROBJ_CONNECT_EXCEPTION);
                            pNStatusCategory = PNStatusCategory.PNUnexpectedDisconnectCategory;
                        } catch (SocketTimeoutException unused3) {
                            cause.pubnubError(PubNubErrorBuilder.PNERROBJ_SOCKET_TIMEOUT);
                            pNStatusCategory = PNStatusCategory.PNTimeoutCategory;
                        } catch (Throwable unused4) {
                            cause.pubnubError(PubNubErrorBuilder.PNERROBJ_HTTP_ERROR);
                            if (dVar.isCanceled()) {
                                pNStatusCategory = PNStatusCategory.PNCancelledCategory;
                            } else {
                                pNStatusCategory = PNStatusCategory.PNBadRequestCategory;
                            }
                        }
                    } else {
                        return;
                    }
                    pNCallback.onResponse(null, UploadFile.this.createStatusResponse(pNStatusCategory, (v<Void>) null, cause.build()));
                }

                public void onResponse(d<Void> dVar, v<Void> vVar) {
                    if (!vVar.a()) {
                        PubNubException access$000 = UploadFile.this.createException(vVar);
                        PNStatusCategory pNStatusCategory = PNStatusCategory.PNUnknownCategory;
                        int i = vVar.a.y;
                        if (i == 401 || i == 403) {
                            pNStatusCategory = PNStatusCategory.PNAccessDeniedCategory;
                        }
                        if (i == 400) {
                            pNStatusCategory = PNStatusCategory.PNBadRequestCategory;
                        }
                        pNCallback.onResponse(null, UploadFile.this.createStatusResponse(pNStatusCategory, vVar, access$000));
                        return;
                    }
                    pNCallback.onResponse(null, UploadFile.this.createStatusResponse(PNStatusCategory.PNAcknowledgmentCategory, vVar, (Exception) null));
                }
            });
        } catch (PubNubException | IOException e) {
            pNCallback.onResponse(null, createStatusResponse(PNStatusCategory.PNUnknownCategory, (v<Void>) null, e));
        }
    }

    public void retry() {
    }

    public void silentCancel() {
        if (!this.call.isCanceled()) {
            this.call.cancel();
        }
    }

    public Void sync() throws PubNubException {
        try {
            d<Void> prepareCall = prepareCall();
            this.call = prepareCall;
            try {
                v<Void> execute = prepareCall.execute();
                if (execute.a()) {
                    return null;
                }
                throw createException(execute);
            } catch (IOException e) {
                throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PARSING_ERROR).errormsg(e.toString()).affectedCall(this.call).cause(e).build();
            }
        } catch (IOException e2) {
            throw PubNubException.builder().errormsg(e2.getMessage()).cause(e2).build();
        }
    }
}
