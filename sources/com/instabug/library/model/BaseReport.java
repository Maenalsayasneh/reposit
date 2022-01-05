package com.instabug.library.model;

import java.io.Serializable;

public abstract class BaseReport implements Serializable {
    private boolean hasVideo = false;
    public String id;
    private boolean isVideoEncoded = false;
    public State state;

    public String getId() {
        return this.id;
    }

    public State getState() {
        return this.state;
    }

    public boolean hasVideo() {
        return this.hasVideo;
    }

    public boolean isVideoEncoded() {
        return this.isVideoEncoded;
    }

    public BaseReport setHasVideo(boolean z) {
        this.hasVideo = z;
        return this;
    }

    public BaseReport setId(String str) {
        this.id = str;
        return this;
    }

    public BaseReport setState(State state2) {
        this.state = state2;
        return this;
    }

    public BaseReport setVideoEncoded(boolean z) {
        this.isVideoEncoded = z;
        return this;
    }
}
