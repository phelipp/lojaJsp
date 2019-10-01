/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.phdtech.loja.util.database;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phelipp
 */
public class Criptograph {

    public static String toHash(String text) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest algorithm = MessageDigest.getInstance("SHA256");
        byte[] digest = algorithm.digest(text.getBytes("UTF-8"));
        StringBuilder hexString = new StringBuilder();
        for(byte b : digest){
            hexString.append(String.format("%02X",0xFF & b ));
        }
        return hexString.toString();
    }
}
