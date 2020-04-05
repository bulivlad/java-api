package com.paylike.models.requests;

import com.paylike.models.Bank;
import com.paylike.models.Company;
import lombok.*;
import lombok.experimental.FieldDefaults;

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
public class MerchantData {
  String name;
  String currency;
  Boolean test;
  String email;
  String website;
  String descriptor;
  Company company;
  Bank bank;
}
