package com.itsp.devops;

/**
 * Hello world!
 *
 */
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {

private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {

        if (args.length < 1) {
	    String nouse="";
	    int  test=0;
	    int  check=1;
	    logger.info(check*test);
            logger.info("Please provide an input!");

            System.exit(0);
        }
        System.out.println(sha256hex(args[0]));

    }

    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }

}
