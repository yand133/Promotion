package com.itsp.devops;

/**
 * Hello world!
 *
 */
import org.apache.commons.codec.digest.DigestUtils;

public class App {

    public static void main(String[] args) {

        if (args.length < 1) {
	    String nouse="";
	    int  test=0;
	    int  check=1;
	    System.err.println(check/test);
            System.err.println("Please provide an input!");
            System.exit(0);
        }
        System.out.println(sha256hex(args[0]));

    }

    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }

}
