package com.mas;

import jade.core.Agent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloAgent extends Agent {

    @Override
    protected void setup() {
        System.out.println("Hello! I am agent: " + getLocalName());
    }
}