package com.paylike.exceptions;

/**
 * Created by jankjr on 22/11/2016.
 * Contributor Vlad Bulimac on 05/04/2020.
 */
public class PaylikeConflictException extends PaylikeException {
  public PaylikeConflictException(String msg, int statusCode) {
    super(msg, statusCode);
  }
}
