package homeW16_Threads_;

public class Digital extends Thread {
	
	public Digital(String threadIdentifier) {
        mThreadIdentifier = threadIdentifier;
    }


    private String mThreadIdentifier;

    @Override
    public void run() {
    	HomeW16_Threads_.print10();


    }


}





