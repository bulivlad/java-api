package com.paylike.models;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Map;

/**
 * Created by jankjr on 22/11/2016.
 * Contributor Vlad Bulimac on 05/04/2020.
 */

@Data
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Transaction {
  String id;

  boolean test;
  
  String merchantId;

  String created;

  long amount;

  long refundedAmount;
  long capturedAmount;
  long voidedAmount;
  long pendingAmount;
  long disputedAmount;

  Card card;
  boolean tds;

  String currency;

  Map custom;

  boolean recurring;
  boolean successful;
  boolean error;
  String descriptor;

  List<TrailEntry> trail;
}
