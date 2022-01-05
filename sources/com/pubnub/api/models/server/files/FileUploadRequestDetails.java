package com.pubnub.api.models.server.files;

import com.pubnub.api.models.consumer.files.PNFile;
import i0.d.a.a.a;
import java.util.List;

public class FileUploadRequestDetails {
    private final PNFile data;
    private final String expirationDate;
    private final List<FormField> formFields;
    private final FormField keyFormField;
    private final String method;
    private final Integer status;
    private final String url;

    public FileUploadRequestDetails(Integer num, PNFile pNFile, String str, String str2, String str3, FormField formField, List<FormField> list) {
        this.status = num;
        this.data = pNFile;
        this.url = str;
        this.method = str2;
        this.expirationDate = str3;
        this.keyFormField = formField;
        this.formFields = list;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof FileUploadRequestDetails;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FileUploadRequestDetails)) {
            return false;
        }
        FileUploadRequestDetails fileUploadRequestDetails = (FileUploadRequestDetails) obj;
        if (!fileUploadRequestDetails.canEqual(this)) {
            return false;
        }
        Integer status2 = getStatus();
        Integer status3 = fileUploadRequestDetails.getStatus();
        if (status2 != null ? !status2.equals(status3) : status3 != null) {
            return false;
        }
        PNFile data2 = getData();
        PNFile data3 = fileUploadRequestDetails.getData();
        if (data2 != null ? !data2.equals(data3) : data3 != null) {
            return false;
        }
        String url2 = getUrl();
        String url3 = fileUploadRequestDetails.getUrl();
        if (url2 != null ? !url2.equals(url3) : url3 != null) {
            return false;
        }
        String method2 = getMethod();
        String method3 = fileUploadRequestDetails.getMethod();
        if (method2 != null ? !method2.equals(method3) : method3 != null) {
            return false;
        }
        String expirationDate2 = getExpirationDate();
        String expirationDate3 = fileUploadRequestDetails.getExpirationDate();
        if (expirationDate2 != null ? !expirationDate2.equals(expirationDate3) : expirationDate3 != null) {
            return false;
        }
        FormField keyFormField2 = getKeyFormField();
        FormField keyFormField3 = fileUploadRequestDetails.getKeyFormField();
        if (keyFormField2 != null ? !keyFormField2.equals(keyFormField3) : keyFormField3 != null) {
            return false;
        }
        List<FormField> formFields2 = getFormFields();
        List<FormField> formFields3 = fileUploadRequestDetails.getFormFields();
        return formFields2 != null ? formFields2.equals(formFields3) : formFields3 == null;
    }

    public PNFile getData() {
        return this.data;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    public List<FormField> getFormFields() {
        return this.formFields;
    }

    public FormField getKeyFormField() {
        return this.keyFormField;
    }

    public String getMethod() {
        return this.method;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        Integer status2 = getStatus();
        int i = 43;
        int hashCode = status2 == null ? 43 : status2.hashCode();
        PNFile data2 = getData();
        int hashCode2 = ((hashCode + 59) * 59) + (data2 == null ? 43 : data2.hashCode());
        String url2 = getUrl();
        int hashCode3 = (hashCode2 * 59) + (url2 == null ? 43 : url2.hashCode());
        String method2 = getMethod();
        int hashCode4 = (hashCode3 * 59) + (method2 == null ? 43 : method2.hashCode());
        String expirationDate2 = getExpirationDate();
        int hashCode5 = (hashCode4 * 59) + (expirationDate2 == null ? 43 : expirationDate2.hashCode());
        FormField keyFormField2 = getKeyFormField();
        int hashCode6 = (hashCode5 * 59) + (keyFormField2 == null ? 43 : keyFormField2.hashCode());
        List<FormField> formFields2 = getFormFields();
        int i2 = hashCode6 * 59;
        if (formFields2 != null) {
            i = formFields2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("FileUploadRequestDetails(status=");
        P0.append(getStatus());
        P0.append(", data=");
        P0.append(getData());
        P0.append(", url=");
        P0.append(getUrl());
        P0.append(", method=");
        P0.append(getMethod());
        P0.append(", expirationDate=");
        P0.append(getExpirationDate());
        P0.append(", keyFormField=");
        P0.append(getKeyFormField());
        P0.append(", formFields=");
        P0.append(getFormFields());
        P0.append(")");
        return P0.toString();
    }
}
