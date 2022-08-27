package edu.wctc.Consoleoutput;

import edu.wctc.interfaces.IMessenger;

public class Messenger implements IMessenger {
    @Override
    public void generateMessage(String message) {

        System.out.println(message);

    }
}
