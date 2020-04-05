package com.paylike.models;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * Created by jankjr on 21/11/2016.
 * Contributor Vlad Bulimac on 05/04/2020.
 */

@Data
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Merchant {
  String id;
  String created;
  String name;
  String currency;
  boolean test;
  String key;
  String descriptor;
  String website;
  String email;
  Company company;
  Claim claim;

  long balance;

  Bank bank;

  Pricing pricing;
  Tds tds;
}
