package com.paylike.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * Created by jankjr on 17/11/2016.
 * Contributor Vlad Bulimac on 05/04/2020.
 */

@Data
@ToString
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bank {
  String iban;
}
