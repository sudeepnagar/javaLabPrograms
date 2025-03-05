package com.nit.multithreading_24_JAN;

public class Bakery {
      int goodsAvailable;
      final int MAX_GOODS_PER_DAY=100;
      int goodsProducedToday;
      
      public synchronized void bakeGoods() throws InterruptedException 
      {
    	  while(this.goodsAvailable>0) 
    	  {
    		  wait();
    	  }
    	  if(this.goodsProducedToday<this.MAX_GOODS_PER_DAY) {
    		  goodsAvailable += 10;
    		  this.goodsProducedToday+=10;
    		  notify();
    		  System.out.println("10 goods produced now..");
    	  }
    	  
      }
      
      public synchronized void buyGoods(String customerName) throws InterruptedException
      {
    	  while(goodsAvailable==0 && !isProductionFinished()) {
    		  wait();
    	  }
    	  if(goodsAvailable > 0) {
    		  goodsAvailable--;
    		  System.out.println(customerName + " buys one good");
    		  if(goodsAvailable == 0) {
    			  notifyAll();
    		  }
    	  }
      }
      
      public boolean isProductionFinished()
      {
    	  return goodsProducedToday >= MAX_GOODS_PER_DAY && goodsAvailable==0;
      }
}
