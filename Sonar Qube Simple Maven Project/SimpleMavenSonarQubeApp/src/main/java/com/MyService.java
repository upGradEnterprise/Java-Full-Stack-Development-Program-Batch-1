package com;

import java.util.logging.Logger;

public class MyService {
        Logger logger = Logger.getLogger("MyService");
        public void someOperation() {
            //Scanner sc = new Scanner(System.in);
            

            try{
                int result = 100/0;
                logger.info("result "+result);
            }catch(Exception e){
                    logger.severe(e.toString());
            }
            
        }
}
