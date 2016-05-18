package com.ama.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Created by emrah.pekesen on 09.05.2016.
 */
@Data
public class EmailAddress {
    private long Id;
    private String emailAddress;
    private EmailType emailType;
    private boolean preferred;
}
