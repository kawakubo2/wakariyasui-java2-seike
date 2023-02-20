package chapter06;

import lib.Input;

public class Ex6_7_2 {
    public static void main(String[] args) {
        String str1 = "http://localhost:8080/index.html";
        String domainName = Input.getString("ドメイン名を入力してください:");
        String str2 = convertDomain(str1, domainName);
        // "http://k-webs.jp:8080/index.html";
        String str3 = str2.substring(str2.indexOf(domainName), str2.indexOf(domainName) + domainName.length());
        System.out.println("str1=" + str1);
        System.out.println("str2=" + str2);
        System.out.println("str3=" + str3);
    }

    public static String convertDomain(String url, String domain) {
        return url.replace("localhost", domain);
    }
}
