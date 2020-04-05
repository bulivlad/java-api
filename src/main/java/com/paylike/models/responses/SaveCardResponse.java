package com.paylike.models.responses;

import com.paylike.models.CardWithId;
import lombok.AccessLevel;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * Created by jankjr on 22/11/2016.
 * Contributor Vlad Bulimac on 05/04/2020.
 */

@Data
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SaveCardResponse {
  CardWithId card;
}
