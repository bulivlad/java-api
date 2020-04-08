package com.paylike.models.requests;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Map;

/**
 * Created by jankjr on 17/11/2016.
 * Contributor Vlad Bulimac on 05/04/2020.
 */

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateTransactionFromPreviousTransactionData {
  String transactionId;
  String descriptor;
  String currency;
  long amount;
  Map custom;
}
