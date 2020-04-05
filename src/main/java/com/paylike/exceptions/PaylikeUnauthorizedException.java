package com.paylike.exceptions;

/**
 * Created by jankjr on 22/11/2016.
 * Contributor Vlad Bulimac on 05/04/2020.
 */
public class PaylikeUnauthorizedException extends PaylikeError {
  public PaylikeUnauthorizedException(String msg, int statusCode) {
    super(msg, statusCode);
  }
}
