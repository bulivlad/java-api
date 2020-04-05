package com.paylike.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * Created by jankjr on 17/11/2016.
 * Contributor Vlad Bulimac on 05/04/2020.
 */

@Data
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Card {
  String bin;
  String last4;
  String expiry;
  String scheme;
}
