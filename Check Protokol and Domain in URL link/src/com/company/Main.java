package com.company;
/*
In this task, you need to check the URL.
A SIMPLE Scheme URL looks like this:
<network protocol>://<name
resource>.<domain>
The sheskProtocol(String) method checks what network protocol (http or https) the URL received by the incoming
parameter, and returns the result of the check - the term name of the network protocol. And the checkDomain(String) method
checks what domain (com, net, org or ru) is in the URL received by the input parameter and returns the result
inspection - deadline name to me.
 */
public class Main {

    public static void main(String[] args) {
        String[] urls = {
                "https://java.ua", "https://google.com", "http://wikipedia.org",
                "facebook.com", "https://instagram", "codegym.cc"
        };
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("In URL address - " + url + ", protocol - " + protocol + ", domain - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        if (url.startsWith("https")) {
            return "https";
        } else if (url.startsWith("http")) {
            return "http";
        } else {
            return "Unknown";
        }
    }

    public static String checkDomain(String url) {
        if (url.endsWith("com")) {
            return "com";
        } else if (url.endsWith("net")) {
            return "net";
        } else if (url.endsWith("org")) {
            return "org";
        } else if (url.endsWith("ua")) {
            return "ua";
        } else {
            return "Unknown";
        }
    }
}
