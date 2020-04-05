package com.paylike.models.responses;

import com.paylike.models.Transaction;
import lombok.AccessLevel;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * Created by jankjr on 17/11/2016.
 * Contributor Vlad Bulimac on 05/04/2020.
 */

@Data
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RefundResponse {
  Transaction transaction;
}
