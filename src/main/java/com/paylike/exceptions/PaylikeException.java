package com.paylike.exceptions;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

/**
 * Created by jankjr on 22/11/2016.
 * Contributor Vlad Bulimac on 05/04/2020.
 */

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PaylikeException extends Exception {
  String msg;
  int statusCode;

  public PaylikeException(String msg, int statusCode){
    super(msg);
    this.msg = msg;
    this.statusCode = statusCode;
  }
}
