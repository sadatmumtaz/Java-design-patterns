/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GOF.ChainOfResposibility.loggin;

/**
 *
 * @author fa20-bse-011
 */
public abstract class AbstractLogger {
   public static int INFO = 1;
   public static int DEBUG = 2;
   public static int ERROR = 3;
   public static int WARNING = 4;

   protected int level;

   //next element in chain or responsibility
   protected AbstractLogger nextLogger;

   public void setNextLogger(AbstractLogger nextLogger){
      this.nextLogger = nextLogger;
   }

   public void logMessage(int level, String message){
      if(this.level == level){
         write(message);
      }
      if(nextLogger !=null){
         nextLogger.logMessage(level, message);
      }
   }
   public void logOnceMessage(int ML, String message){
      if(this.level == ML){
         write(message);
      }
      else if(nextLogger !=null){
         nextLogger.logOnceMessage(ML, message);
      }
      else{
          System.out.println("not support");
      }
   }

   abstract protected void write(String message);
	
}