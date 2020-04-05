package com.paylike.models.requests;

import lombok.*;
import lombok.experimental.FieldDefaults;

/**
 * Created by jankjr on 22/11/2016.
 * Contributor Vlad Bulimac on 05/04/2020.
 */

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SaveCardData {
  String transactionId;
  String notes;
}
