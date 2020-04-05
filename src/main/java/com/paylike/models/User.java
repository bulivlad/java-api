package com.paylike.models;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * Created by jankjr on 22/11/2016.
 * Contributor Vlad Bulimac on 05/04/2020.
 */

@Data
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
  String id;
  String created;
  String email;
  String name;
}
