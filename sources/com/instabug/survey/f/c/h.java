package com.instabug.survey.f.c;

import com.instabug.library.networkv2.connection.InstabugBaseConnectionManagerImpl;
import java.io.Serializable;

/* compiled from: Trigger */
public class h implements Serializable {
    public int c = 0;
    public int d;
    public String q;
    public int x = InstabugBaseConnectionManagerImpl.DEFAULT_READ_TIME_OUT;

    public String a() {
        String str = this.q;
        return str == null ? "" : str;
    }
}
