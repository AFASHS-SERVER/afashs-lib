package com.github.jaeukkang12.lib.util;

import java.text.DecimalFormat;

public class NumberUtil {
    public static boolean isNumber(double d) {
        return d % 1 == 0;
    }

    public static boolean isNumber(float f) {
        return f % 1 == 0;
    }

    public static String format(int i) {
        return new DecimalFormat("###,###").format(i);
    }

    public static String format(double d) {
        if (isNumber(d)) {
            return new DecimalFormat("###,###").format(d);
        } else {
            throw new RuntimeException();
        }
    }

    public static String format(float f) {
        if (isNumber(f)) {
            return new DecimalFormat("###,###").format(f);
        } else {
            throw new RuntimeException();
        }
    }
}
