package com.paylike.exceptions;

/**
 * Created by Vlad Bulimac on 05/04/2020.
 */
public class PaylikeForbiddenException extends PaylikeException {
    public PaylikeForbiddenException(String msg, int statusCode) {
        super(msg, statusCode);
    }
}
