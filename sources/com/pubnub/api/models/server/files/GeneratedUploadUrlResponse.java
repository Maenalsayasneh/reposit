package com.pubnub.api.models.server.files;

import com.google.gson.annotations.SerializedName;
import com.pubnub.api.models.consumer.files.PNUploadedFile;
import i0.d.a.a.a;
import java.util.List;

public class GeneratedUploadUrlResponse {
    private final PNUploadedFile data;
    @SerializedName("file_upload_request")
    private final FileUploadRequest fileUploadRequest;
    private final Integer status;

    public static class FileUploadRequest {
        @SerializedName("expiration_date")
        private final String expirationDate;
        @SerializedName("form_fields")
        private final List<FormField> formFields;
        private final String method;
        private final String url;

        public FileUploadRequest(String str, String str2, String str3, List<FormField> list) {
            this.url = str;
            this.method = str2;
            this.expirationDate = str3;
            this.formFields = list;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof FileUploadRequest;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileUploadRequest)) {
                return false;
            }
            FileUploadRequest fileUploadRequest = (FileUploadRequest) obj;
            if (!fileUploadRequest.canEqual(this)) {
                return false;
            }
            String url2 = getUrl();
            String url3 = fileUploadRequest.getUrl();
            if (url2 != null ? !url2.equals(url3) : url3 != null) {
                return false;
            }
            String method2 = getMethod();
            String method3 = fileUploadRequest.getMethod();
            if (method2 != null ? !method2.equals(method3) : method3 != null) {
                return false;
            }
            String expirationDate2 = getExpirationDate();
            String expirationDate3 = fileUploadRequest.getExpirationDate();
            if (expirationDate2 != null ? !expirationDate2.equals(expirationDate3) : expirationDate3 != null) {
                return false;
            }
            List<FormField> formFields2 = getFormFields();
            List<FormField> formFields3 = fileUploadRequest.getFormFields();
            return formFields2 != null ? formFields2.equals(formFields3) : formFields3 == null;
        }

        public String getExpirationDate() {
            return this.expirationDate;
        }

        public List<FormField> getFormFields() {
            return this.formFields;
        }

        public String getMethod() {
            return this.method;
        }

        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String url2 = getUrl();
            int i = 43;
            int hashCode = url2 == null ? 43 : url2.hashCode();
            String method2 = getMethod();
            int hashCode2 = ((hashCode + 59) * 59) + (method2 == null ? 43 : method2.hashCode());
            String expirationDate2 = getExpirationDate();
            int hashCode3 = (hashCode2 * 59) + (expirationDate2 == null ? 43 : expirationDate2.hashCode());
            List<FormField> formFields2 = getFormFields();
            int i2 = hashCode3 * 59;
            if (formFields2 != null) {
                i = formFields2.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("GeneratedUploadUrlResponse.FileUploadRequest(url=");
            P0.append(getUrl());
            P0.append(", method=");
            P0.append(getMethod());
            P0.append(", expirationDate=");
            P0.append(getExpirationDate());
            P0.append(", formFields=");
            P0.append(getFormFields());
            P0.append(")");
            return P0.toString();
        }
    }

    public GeneratedUploadUrlResponse(Integer num, PNUploadedFile pNUploadedFile, FileUploadRequest fileUploadRequest2) {
        this.status = num;
        this.data = pNUploadedFile;
        this.fileUploadRequest = fileUploadRequest2;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof GeneratedUploadUrlResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GeneratedUploadUrlResponse)) {
            return false;
        }
        GeneratedUploadUrlResponse generatedUploadUrlResponse = (GeneratedUploadUrlResponse) obj;
        if (!generatedUploadUrlResponse.canEqual(this)) {
            return false;
        }
        Integer status2 = getStatus();
        Integer status3 = generatedUploadUrlResponse.getStatus();
        if (status2 != null ? !status2.equals(status3) : status3 != null) {
            return false;
        }
        PNUploadedFile data2 = getData();
        PNUploadedFile data3 = generatedUploadUrlResponse.getData();
        if (data2 != null ? !data2.equals(data3) : data3 != null) {
            return false;
        }
        FileUploadRequest fileUploadRequest2 = getFileUploadRequest();
        FileUploadRequest fileUploadRequest3 = generatedUploadUrlResponse.getFileUploadRequest();
        return fileUploadRequest2 != null ? fileUploadRequest2.equals(fileUploadRequest3) : fileUploadRequest3 == null;
    }

    public PNUploadedFile getData() {
        return this.data;
    }

    public FileUploadRequest getFileUploadRequest() {
        return this.fileUploadRequest;
    }

    public Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        Integer status2 = getStatus();
        int i = 43;
        int hashCode = status2 == null ? 43 : status2.hashCode();
        PNUploadedFile data2 = getData();
        int hashCode2 = ((hashCode + 59) * 59) + (data2 == null ? 43 : data2.hashCode());
        FileUploadRequest fileUploadRequest2 = getFileUploadRequest();
        int i2 = hashCode2 * 59;
        if (fileUploadRequest2 != null) {
            i = fileUploadRequest2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("GeneratedUploadUrlResponse(status=");
        P0.append(getStatus());
        P0.append(", data=");
        P0.append(getData());
        P0.append(", fileUploadRequest=");
        P0.append(getFileUploadRequest());
        P0.append(")");
        return P0.toString();
    }
}
