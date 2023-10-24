package Crypt;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class Encriptador {
	
	    public static void main(String[] ARGS)throws NoSuchAlgorithmException,
        UnsupportedEncodingException {
	    	String senha = "Coloque os dados aqui.";

            MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));

            System.out.println(messageDigest);
	    }
	}
