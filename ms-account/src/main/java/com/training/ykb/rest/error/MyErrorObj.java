package com.training.ykb.rest.error;

import java.util.ArrayList;
import java.util.List;

public class MyErrorObj {

    private List<MyErrorObj> subErrors;
    private String           miscroservice;
    private String           desc;
    private int              errorCause;


    public MyErrorObj() {
    }

    public MyErrorObj(final String miscroserviceParam,
                      final String descParam,
                      final int errorCauseParam) {
        super();
        this.miscroservice = miscroserviceParam;
        this.desc = descParam;
        this.errorCause = errorCauseParam;
    }

    public MyErrorObj addSubErrorObj(final MyErrorObj me) {
        if (this.subErrors == null) {
            this.subErrors = new ArrayList<>();
        }
        this.subErrors.add(me);
        return this;
    }

    public List<MyErrorObj> getSubErrors() {
        return this.subErrors;
    }

    public MyErrorObj setSubErrors(final List<MyErrorObj> subErrorsParam) {
        this.subErrors = subErrorsParam;
        return this;
    }

    public String getMiscroservice() {
        return this.miscroservice;
    }

    public MyErrorObj setMiscroservice(final String miscroserviceParam) {
        this.miscroservice = miscroserviceParam;
        return this;
    }

    public String getDesc() {
        return this.desc;
    }

    public MyErrorObj setDesc(final String descParam) {
        this.desc = descParam;
        return this;
    }

    public int getErrorCause() {
        return this.errorCause;
    }

    public MyErrorObj setErrorCause(final int errorCauseParam) {
        this.errorCause = errorCauseParam;
        return this;
    }


}
