package com.mas;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;

public class MainContainer {

    public static void main(String[] args) {
        Runtime rt = Runtime.instance();

        Profile profile = new ProfileImpl();
        profile.setParameter(Profile.GUI, "true");

        ContainerController container = rt.createMainContainer(profile);

        try {
            AgentController agent = container.createNewAgent(
                    "agent1",
                    "com.mas.HelloAgent",
                    null);
            agent.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}