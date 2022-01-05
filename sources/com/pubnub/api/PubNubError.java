package com.pubnub.api;

import com.google.gson.JsonElement;
import i0.d.a.a.a;

public class PubNubError {
    private int errorCode;
    private int errorCodeExtended;
    private JsonElement errorObject;
    private String errorString;
    private String message;

    public static class PubNubErrorBuilder {
        private int errorCode;
        private int errorCodeExtended;
        private JsonElement errorObject;
        private String errorString;
        private String message;

        public PubNubError build() {
            return new PubNubError(this.errorCode, this.errorCodeExtended, this.errorObject, this.message, this.errorString);
        }

        public PubNubErrorBuilder errorCode(int i) {
            this.errorCode = i;
            return this;
        }

        public PubNubErrorBuilder errorCodeExtended(int i) {
            this.errorCodeExtended = i;
            return this;
        }

        public PubNubErrorBuilder errorObject(JsonElement jsonElement) {
            this.errorObject = jsonElement;
            return this;
        }

        public PubNubErrorBuilder errorString(String str) {
            this.errorString = str;
            return this;
        }

        public PubNubErrorBuilder message(String str) {
            this.message = str;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PubNubError.PubNubErrorBuilder(errorCode=");
            P0.append(this.errorCode);
            P0.append(", errorCodeExtended=");
            P0.append(this.errorCodeExtended);
            P0.append(", errorObject=");
            P0.append(this.errorObject);
            P0.append(", message=");
            P0.append(this.message);
            P0.append(", errorString=");
            return a.y0(P0, this.errorString, ")");
        }
    }

    public PubNubError(int i, int i2, JsonElement jsonElement, String str, String str2) {
        this.errorCode = i;
        this.errorCodeExtended = i2;
        this.errorObject = jsonElement;
        this.message = str;
        this.errorString = str2;
    }

    public static PubNubErrorBuilder builder() {
        return new PubNubErrorBuilder();
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public int getErrorCodeExtended() {
        return this.errorCodeExtended;
    }

    public JsonElement getErrorObject() {
        return this.errorObject;
    }

    public String getErrorString() {
        return this.errorString;
    }

    public String getMessage() {
        return this.message;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PubNubError(errorCode=");
        P0.append(getErrorCode());
        P0.append(", errorCodeExtended=");
        P0.append(getErrorCodeExtended());
        P0.append(", errorObject=");
        P0.append(getErrorObject());
        P0.append(", message=");
        P0.append(getMessage());
        P0.append(", errorString=");
        P0.append(getErrorString());
        P0.append(")");
        return P0.toString();
    }
}
