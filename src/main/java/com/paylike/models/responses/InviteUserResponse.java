package com.paylike.models.responses;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 * Created by jankjr on 17/11/2016.
 * Contributor Vlad Bulimac on 05/04/2020.
 */

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InviteUserResponse {
  boolean isMember;
}
