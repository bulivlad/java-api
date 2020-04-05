package com.paylike.models;

import com.google.gson.annotations.SerializedName;
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
public class TrailEntry {
  long amount;
  long balance;
  String created;
  Fee fee;

  @SerializedName(value = "void")
  boolean voided;
}
