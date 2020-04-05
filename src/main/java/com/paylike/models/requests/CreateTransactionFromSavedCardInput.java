package com.paylike.models.requests;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Map;

/**
 * Created by jankjr on 22/11/2016.
 * Contributor Vlad Bulimac on 05/04/2020.
 */

@Data
@Builder
@ToString
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CreateTransactionFromSavedCardInput {
  String cardId;
  String currency;
  String descriptor;
  int amount;
  Map custom;
}