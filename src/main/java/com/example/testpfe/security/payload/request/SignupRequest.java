package com.example.testpfe.security.payload.request;



import com.example.testpfe.bean.User;

import javax.validation.constraints.*;

public class SignupRequest extends User {

    private String registerAs;
    private String agenceCode;

    public String getRegisterAs() {
        return registerAs;
    }

    public void setRegisterAs(String registerAs) {
        this.registerAs = registerAs;
    }

    public String getAgenceCode() {
        return agenceCode;
    }

    public void setAgenceCode(String agenceCode) {
        this.agenceCode = agenceCode;
    }


}
