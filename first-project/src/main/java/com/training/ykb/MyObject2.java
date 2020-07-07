package com.training.ykb;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mehmet")
public class MyObject2 implements IMyObject {

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    @Override
    public String execute() {
        return "Execute : " + this.name;
    }

}
