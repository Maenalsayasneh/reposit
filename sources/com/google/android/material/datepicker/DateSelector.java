package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import h0.i.h.b;
import i0.h.a.c.l.p;
import java.util.Collection;

public interface DateSelector<S> extends Parcelable {
    View N(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, p<S> pVar);

    int Y(Context context);

    boolean d0();

    Collection<Long> i0();

    String l(Context context);

    S m0();

    Collection<b<Long, Long>> n();

    void y0(long j);
}
