package com.javainuse.main;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

import com.javainuse.model.Counter;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
    	    
    	    //get stateless session
        	StatelessKieSession kSession = kContainer.newStatelessKieSession();

           
        	Counter cnt1 = new Counter(1,"cnt1");
            Counter cnt2 = new Counter(2,"cnt2");
            
            System.out.println();
			System.out.println("Execute after inserting counter1");
			System.out.println();

            //execute with counter1
            kSession.execute(cnt1);
            
            System.out.println();
			System.out.println("Execute after inserting counter2");
			System.out.println();

          //execute with counter2
            kSession.execute(cnt2);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    

}
