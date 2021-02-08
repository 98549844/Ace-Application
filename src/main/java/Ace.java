import entity.LogEnt;

import java.io.IOException;

public class Ace {

    public static void main(String[] args) throws IOException {
        LogEnt logEnt =  new LogEnt();
        logEnt.setLogId(100l);
        logEnt.setLogId(150l);
        System.out.println(logEnt.getLogId());

    }



}
