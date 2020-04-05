package com.paylike.exceptions;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

/**
 * Created by jankjr on 22/11/2016.
 * Contributor Vlad Bulimac on 05/04/2020.
 */

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PaylikeError extends Error {
  String responseMessage;
  int responseCode;

  public PaylikeError(String responseMessage, int responseCode) {
    super(responseMessage);
    this.responseMessage = responseMessage;
    this.responseCode = responseCode;
  }
}
