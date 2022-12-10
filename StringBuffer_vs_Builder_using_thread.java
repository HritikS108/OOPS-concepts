// it shows that stringbuffer (thread safe) is synchronized whereas stringbuilder(thread unsafe) is not synchronized.

public class StringBuffer_vs_Builder_using_thread {
          
	public static void main(String[] args) throws InterruptedException {

	    StringBuilder sbuilder = new StringBuilder();
	    
	    StringBuilderDemo builderThread1 = new StringBuilderDemo(sbuilder);
	    StringBuilderDemo builderThread2 = new StringBuilderDemo(sbuilder);

	    builderThread1.start();
	    builderThread2.start();
	    builderThread1.join();
	    builderThread2.join();

	    System.out.println("StringBuilder: " + sbuilder.toString());

	    StringBuffer sbuffer = new StringBuffer();

	    StringBufferDemo bufferThread1 = new StringBufferDemo(sbuffer);
	    StringBufferDemo bufferThread2 = new StringBufferDemo(sbuffer);

	    bufferThread1.start();
	    bufferThread2.start();
	    bufferThread1.join();
	    bufferThread2.join();
//	    Join method in Java allows one thread to wait until another thread completes its execution
	    System.out.println("StringBuffer: " + sbuffer.toString());
	  }
	}

//   2 ways to create a thread :- i). by extending the Thread class and overriding its run() method
//                               ii). by implement the Runnable interface:


//If the class extends the Thread class, the thread can be run by creating an instance of the class and 
//call its start() method:

	class StringBuilderDemo extends Thread {

	  StringBuilder sbuilder;

	  public StringBuilderDemo(StringBuilder sb) {
	    sbuilder = sb;
	  }

	  @Override
	  public void run() {
	    for (int i = 0; i < 10; i++) {
	      sbuilder.append(i);
	    }
	  }
	}

	class StringBufferDemo extends Thread {

	  StringBuffer sbuffer;

	  public StringBufferDemo(StringBuffer sb) {
	    sbuffer = sb;
	  }

	  @Override
	  public void run() {
	    for (int i = 0; i < 10; i++) {
	      sbuffer.append(i);
	    }
	  }
}
// output of stringbuffer objects remains the same at different run but that of stringbuilder changes.