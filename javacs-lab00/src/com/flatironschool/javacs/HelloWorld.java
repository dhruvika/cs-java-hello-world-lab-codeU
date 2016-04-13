package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
    	String property = System.getProperty("java.specification.version");
        return Double.parseDouble(property);
    }

    public static void main(String[] args) {
    	System.out.print(getVersion());
    }
}


