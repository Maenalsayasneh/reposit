package com.instabug.library.network;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Build;
import com.instabug.library.model.State;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.networkv2.request.Header;
import com.instabug.library.util.DeviceStateProvider;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class Request {
    public static final String BASE_URL = "https://api.instabug.com/api/sdk/v3";
    public static final String BASIC_AUTH_VALUE_PREFIX = "Basic ";
    public static final String PRODUCTION_LOGS_URL = "https://api.instabug.com/sdklogs/upload";
    private static final String TAG = "Request";
    private static final String announcementVersion = "v2";
    private static final String surveysVersion = "v8";
    private ArrayList<RequestParameter> bodyParameters;
    private File downloadedFile;
    private String endPoint;
    private FileToUpload fileToUpload;
    private ArrayList<RequestParameter> headers;
    private RequestMethod requestMethod;
    private NetworkManager.RequestType requestType;
    private String requestUrl;
    private ArrayList<RequestParameter> urlParameters;

    public interface Callbacks<T, K> {
        void onFailed(K k);

        void onSucceeded(T t);
    }

    public enum Endpoint {
        REPORT_BUG("/bugs"),
        ADD_BUG_ATTACHMENT("/bugs/:bug_token/attachments"),
        REPORT_CRASH("/crashes"),
        ADD_CRASH_ATTACHMENT("/crashes/:crash_token/attachments"),
        REPORT_ANR("/crashes/anr"),
        TRIGGER_CHAT("/chats"),
        SEND_MESSAGE("/chats/:chat_number/messages"),
        ADD_MESSAGE_ATTACHMENT("/chats/:chat_number/messages/:message_id/attachments"),
        SYNC_CHATS("/chats/sync"),
        APP_SETTINGS("/features"),
        SEND_SESSION("/sessions/v2"),
        GET_SURVEYS("/surveys/v8"),
        SUBMIT_SURVEY("/surveys/:survey_id/v8/responses"),
        BUG_LOGS("/bugs/:bug_token/state_logs"),
        CRASH_LOGS("/crashes/:crash_token/state_logs"),
        CHAT_LOGS("/chats/:chat_token/state_logs"),
        MIGRATE_UUID("/migrate_uuid"),
        ANALYTICS("/analytics"),
        PUSH_TOKEN("/push_token"),
        REPORT_CATEGORIES("/application_categories"),
        GET_FEATURES_REQUEST("/feature_reqs"),
        GET_FEATURE_DETAILS("/feature_reqs/:feature_req_id"),
        GET_FEATURE_TIMELINE("/feature_reqs/:feature_req_id/timeline"),
        VOTE_FEATURE("/feature_reqs/:feature_req_id/like"),
        SEARCH("/search"),
        ADD_NEW_FEATURE("/feature_reqs"),
        ADD_COMMENT("/feature_reqs/:feature_req_id/comment"),
        RESOLVE_IP("/resolve_ip"),
        GET_ANNOUNCEMENTS("/announcements/v2"),
        SUBMIT_ANNOUNCEMENT("/announcements/:announcement_id/v2/responses"),
        USER_ATTRIBUTES("/users/attributes"),
        FIRST_SEEN("/first_seen");
        
        private final String name;

        private Endpoint(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    public static class FileToUpload {
        private String fileName;
        private String filePartName;
        private String filePath;
        private String fileType;

        public FileToUpload(String str, String str2, String str3, String str4) {
            this.filePartName = str;
            this.fileName = str2;
            this.filePath = str3;
            this.fileType = str4;
        }

        public String getFileName() {
            return this.fileName;
        }

        public String getFilePartName() {
            return this.filePartName;
        }

        public String getFilePath() {
            return this.filePath;
        }

        public String getFileType() {
            return this.fileType;
        }
    }

    public enum RequestMethod {
        Get(com.instabug.library.networkv2.request.RequestMethod.GET),
        Post(com.instabug.library.networkv2.request.RequestMethod.POST),
        put(com.instabug.library.networkv2.request.RequestMethod.PUT),
        Delete(com.instabug.library.networkv2.request.RequestMethod.DELETE);
        
        private final String name;

        private RequestMethod(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    public static class RequestParameter implements Serializable {
        private String key;
        private Object value;

        public RequestParameter(String str, Object obj) {
            this.key = str;
            this.value = obj;
        }

        public String getKey() {
            return this.key;
        }

        public Object getValue() {
            return this.value;
        }
    }

    public Request(Endpoint endpoint, NetworkManager.RequestType requestType2) {
        this.endPoint = endpoint.toString();
        StringBuilder P0 = a.P0(BASE_URL);
        P0.append(getEndpoint());
        this.requestUrl = P0.toString();
        this.requestType = requestType2;
        initialize();
        addHeaders();
    }

    private void addHeaders() {
        addHeader(new RequestParameter("IBG-OS", "android"));
        addHeader(new RequestParameter("IBG-OS-VERSION", Build.VERSION.RELEASE));
        addHeader(new RequestParameter(Header.SDK_VERSION, DeviceStateProvider.getSdkVersion()));
    }

    private String getUrlEncodedParameters() {
        Uri.Builder builder = new Uri.Builder();
        Iterator<RequestParameter> it = this.urlParameters.iterator();
        while (it.hasNext()) {
            RequestParameter next = it.next();
            if (next.getValue() != null) {
                builder.appendQueryParameter(next.getKey(), next.getValue().toString());
            }
        }
        return builder.toString();
    }

    private void initialize() {
        this.urlParameters = new ArrayList<>();
        this.bodyParameters = new ArrayList<>();
        this.headers = new ArrayList<>();
    }

    public Request addHeader(RequestParameter requestParameter) {
        this.headers.add(requestParameter);
        return this;
    }

    public Request addParameter(String str, Object obj) {
        RequestMethod requestMethod2 = this.requestMethod;
        if (requestMethod2 != null) {
            if (requestMethod2.equals(RequestMethod.Get) || this.requestMethod.equals(RequestMethod.Delete)) {
                addRequestUrlParameter(str, obj);
            } else {
                addRequestBodyParameter(str, obj);
            }
        }
        return this;
    }

    public void addRequestBodyParameter(String str, Object obj) {
        this.bodyParameters.add(new RequestParameter(str, obj));
    }

    public void addRequestUrlParameter(String str, Object obj) {
        this.urlParameters.add(new RequestParameter(str, obj));
    }

    public ArrayList<RequestParameter> clearRequestBodyParameters() {
        this.bodyParameters.clear();
        return this.bodyParameters;
    }

    public ArrayList<RequestParameter> clearRequestUrlParameters() {
        this.urlParameters.clear();
        return this.urlParameters;
    }

    public File getDownloadedFile() {
        return this.downloadedFile;
    }

    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public String getEndpoint() {
        return this.endPoint;
    }

    public FileToUpload getFileToUpload() {
        return this.fileToUpload;
    }

    public ArrayList<RequestParameter> getHeaders() {
        return this.headers;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public String getRequestBody() {
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<RequestParameter> it = getRequestBodyParameters().iterator();
            while (it.hasNext()) {
                RequestParameter next = it.next();
                jSONObject.put(next.getKey(), next.getValue());
            }
            return jSONObject.toString();
        } catch (OutOfMemoryError | JSONException e) {
            System.gc();
            InstabugSDKLogger.e(TAG, "OOM Exception trying to remove large logs...", e);
            e.printStackTrace();
            try {
                jSONObject.remove(State.KEY_CONSOLE_LOG);
                jSONObject.remove(State.KEY_INSTABUG_LOG);
                jSONObject.remove(State.KEY_NETWORK_LOGS);
                return jSONObject.toString();
            } catch (OutOfMemoryError e2) {
                InstabugSDKLogger.e(TAG, "Failed to resolve OOM, returning empty request body", e);
                e2.printStackTrace();
                return "";
            }
        }
    }

    public ArrayList<RequestParameter> getRequestBodyParameters() {
        return this.bodyParameters;
    }

    public RequestMethod getRequestMethod() {
        return this.requestMethod;
    }

    public NetworkManager.RequestType getRequestType() {
        return this.requestType;
    }

    public String getRequestUrl() {
        if (getUrlEncodedParameters() == null) {
            return this.requestUrl;
        }
        return this.requestUrl + getUrlEncodedParameters();
    }

    public ArrayList<RequestParameter> getRequestUrlParameters() {
        return this.urlParameters;
    }

    public boolean isMultiPartRequest() {
        return this.fileToUpload != null;
    }

    public Request setDownloadedFile(String str) {
        this.downloadedFile = new File(str);
        return this;
    }

    public void setEndpoint(String str) {
        this.endPoint = str;
        StringBuilder P0 = a.P0(BASE_URL);
        P0.append(getEndpoint());
        this.requestUrl = P0.toString();
    }

    public Request setFileToUpload(FileToUpload fileToUpload2) {
        this.fileToUpload = fileToUpload2;
        return this;
    }

    public ArrayList<RequestParameter> setRequestBodyParameters(ArrayList<RequestParameter> arrayList) {
        this.bodyParameters = arrayList;
        return arrayList;
    }

    public Request setRequestMethod(RequestMethod requestMethod2) {
        this.requestMethod = requestMethod2;
        return this;
    }

    public ArrayList<RequestParameter> setRequestUrlParameters(ArrayList<RequestParameter> arrayList) {
        this.urlParameters = arrayList;
        return arrayList;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public String toString() {
        if (this.requestMethod == RequestMethod.Get) {
            StringBuilder P0 = a.P0("Url: ");
            P0.append(getRequestUrl());
            P0.append(" | Method: ");
            P0.append(this.requestMethod);
            return P0.toString();
        }
        StringBuilder P02 = a.P0("Url: ");
        P02.append(getRequestUrl());
        P02.append(" | Method: ");
        P02.append(this.requestMethod);
        P02.append(" | Body: ");
        P02.append(getRequestBody());
        return P02.toString();
    }

    public Request(String str, NetworkManager.RequestType requestType2) {
        this.requestUrl = str;
        this.requestType = requestType2;
        initialize();
        addHeaders();
    }
}
