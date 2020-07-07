package com.training.ykb;

import org.springframework.stereotype.Component;

@Component
@MapMeQ
public class MyObject3 implements IMyObject {

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
