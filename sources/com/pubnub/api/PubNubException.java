package com.pubnub.api;

import com.google.gson.JsonElement;
import i0.d.a.a.a;
import t0.d;

public class PubNubException extends Exception {
    private d affectedCall;
    private String errormsg;
    private JsonElement jso;
    private PubNubError pubnubError;
    private String response;
    private int statusCode;

    public static class PubNubExceptionBuilder {
        private d affectedCall;
        private Throwable cause;
        private String errormsg;
        private JsonElement jso;
        private PubNubError pubnubError;
        private String response;
        private int statusCode;

        public PubNubExceptionBuilder affectedCall(d dVar) {
            this.affectedCall = dVar;
            return this;
        }

        public PubNubException build() {
            return new PubNubException(this.errormsg, this.pubnubError, this.jso, this.response, this.statusCode, this.affectedCall, this.cause);
        }

        public PubNubExceptionBuilder cause(Throwable th) {
            this.cause = th;
            return this;
        }

        public PubNubExceptionBuilder errormsg(String str) {
            this.errormsg = str;
            return this;
        }

        public PubNubExceptionBuilder jso(JsonElement jsonElement) {
            this.jso = jsonElement;
            return this;
        }

        public PubNubExceptionBuilder pubnubError(PubNubError pubNubError) {
            this.pubnubError = pubNubError;
            return this;
        }

        public PubNubExceptionBuilder response(String str) {
            this.response = str;
            return this;
        }

        public PubNubExceptionBuilder statusCode(int i) {
            this.statusCode = i;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PubNubException.PubNubExceptionBuilder(errormsg=");
            P0.append(this.errormsg);
            P0.append(", pubnubError=");
            P0.append(this.pubnubError);
            P0.append(", jso=");
            P0.append(this.jso);
            P0.append(", response=");
            P0.append(this.response);
            P0.append(", statusCode=");
            P0.append(this.statusCode);
            P0.append(", affectedCall=");
            P0.append(this.affectedCall);
            P0.append(", cause=");
            P0.append(this.cause);
            P0.append(")");
            return P0.toString();
        }
    }

    public PubNubException(String str, PubNubError pubNubError, JsonElement jsonElement, String str2, int i, d dVar, Throwable th) {
        super(th);
        this.errormsg = str;
        this.pubnubError = pubNubError;
        this.jso = jsonElement;
        this.response = str2;
        this.statusCode = i;
        this.affectedCall = dVar;
    }

    public static PubNubExceptionBuilder builder() {
        return new PubNubExceptionBuilder();
    }

    public Throwable getCause() {
        return super.getCause();
    }

    public String getErrormsg() {
        return this.errormsg;
    }

    public JsonElement getJso() {
        return this.jso;
    }

    public String getMessage() {
        return this.errormsg;
    }

    public PubNubError getPubnubError() {
        return this.pubnubError;
    }

    public String getResponse() {
        return this.response;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PubNubException(errormsg=");
        P0.append(getErrormsg());
        P0.append(", pubnubError=");
        P0.append(getPubnubError());
        P0.append(", jso=");
        P0.append(getJso());
        P0.append(", response=");
        P0.append(getResponse());
        P0.append(", statusCode=");
        P0.append(getStatusCode());
        P0.append(", getCause=");
        P0.append(getCause());
        P0.append(")");
        return P0.toString();
    }
}
