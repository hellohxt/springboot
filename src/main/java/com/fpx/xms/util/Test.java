package com.fpx.xms.util;

import java.text.DecimalFormat;

public class Test {

	public static void main(String[] args) {
		int i = 3000;
		double d = (double)i/1000;
        DecimalFormat df = new DecimalFormat("0.000");
        String result = df.format(Double.parseDouble(String.valueOf(d)));
		System.out.println(result);
	}
}
