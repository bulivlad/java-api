package com.paylike.models.requests;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * Created by jankjr on 17/11/2016.
 * Contributor Vlad Bulimac on 05/04/2020.
 */

@Data
@ToString
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class VoidData {
  long amount;
}
