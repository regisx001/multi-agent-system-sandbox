package com.mas;

import jade.core.Agent;

public class HelloAgent extends Agent {

    @Override
    protected void setup() {
        System.out.println("Hello! I am agent: " + getLocalName());
    }
}