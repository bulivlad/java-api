package com.paylike.exceptions;

/**
 * Created by jankjr on 22/11/2016.
 * Contributor Vlad Bulimac on 05/04/2020.
 */
public class PaylikeServerError extends PaylikeException {
  public PaylikeServerError(String msg, int statusCode) {
    super(msg, statusCode);
  }
}
