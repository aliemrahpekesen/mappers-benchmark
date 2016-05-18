package com.ama.util;

import java.util.Calendar;

/**
 * Created by emrah.pekesen on 10.05.2016.
 */
public class DateTimeOps {
    public static long getCurrentTimeInMiliSeconds() {
        return Calendar.getInstance().getTimeInMillis();
    }
}
