package オブジェクト指向とJavaの構造理解.パッケージとimport;

// package com.company.product.util;

class StringUtil {
    public static String trim(String s) {
        return s.trim();
    }
}

public class PackageDesign {
    public static void main(String[] args) {
        String result = StringUtil.trim("  こんにちは  ");
        System.out.println("結果: " + result);
    }
}