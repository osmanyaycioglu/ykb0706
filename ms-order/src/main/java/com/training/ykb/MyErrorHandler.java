package com.training.ykb;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MyErrorHandler extends Exception {

    private List<MyErrorHandler> subErrors;
    private String               miscroservice;
    private String               desc;
    private int                  errorCause;

    public List<MyErrorHandler> getSubErrors() {
        return this.subErrors;
    }

    public void setSubErrors(final List<MyErrorHandler> subErrorsParam) {
        this.subErrors = subErrorsParam;
    }

    public String getMiscroservice() {
        return this.miscroservice;
    }

    public void setMiscroservice(final String miscroserviceParam) {
        this.miscroservice = miscroserviceParam;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(final String descParam) {
        this.desc = descParam;
    }

    public int getErrorCause() {
        return this.errorCause;
    }

    public void setErrorCause(final int errorCauseParam) {
        this.errorCause = errorCauseParam;
    }


}
