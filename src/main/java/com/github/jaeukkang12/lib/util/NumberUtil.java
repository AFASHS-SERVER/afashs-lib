package com.github.jaeukkang12.lib.util;

import java.text.DecimalFormat;

public class NumberUtil {
    public static String format(int i) {
        return new DecimalFormat("###,###").format(i);
    }
}
