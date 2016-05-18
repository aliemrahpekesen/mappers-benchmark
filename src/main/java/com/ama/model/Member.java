package com.ama.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by emrah.pekesen on 09.05.2016.
 */
@Data
public class Member implements Serializable{
    private long Id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date birthDate;
    private Gender gender;
    List<EmailAddress> emailList;
}
