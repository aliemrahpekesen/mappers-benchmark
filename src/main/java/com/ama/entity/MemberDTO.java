package com.ama.entity;

import com.ama.model.EmailAddress;
import com.ama.model.Gender;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by emrah.pekesen on 09.05.2016.
 */
@Data
public class MemberDTO implements Serializable {
    private long Id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date birthDate;
    private Gender gender;
    List<EmailAddress> emailList;
}
