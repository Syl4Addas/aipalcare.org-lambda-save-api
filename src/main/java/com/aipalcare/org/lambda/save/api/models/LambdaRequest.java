package com.aipalcare.org.lambda.save.api.models;

import lombok.Data;

@Data
public class LambdaRequest {
    private String companyName;
    private String nhpn;
    private String licenseNo;
    private String pryRepFname;
    private String pryRepLname;
    private String govtBody;

}
