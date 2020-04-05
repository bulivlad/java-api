package com.paylike.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * Created by jankjr on 21/11/2016.
 * Contributor Vlad Bulimac on 05/04/2020.
 */

@Data
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Claim {
  boolean canCapture;
  boolean canRefund;
  boolean canVoid;
  boolean canChargeCard;
  boolean canSaveCard;
}
