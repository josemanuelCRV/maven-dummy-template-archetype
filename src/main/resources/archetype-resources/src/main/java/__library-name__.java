package ${package};

import org.apache.log4j.Logger;

public class ${library-name} {

	private static final Logger logger = Logger.getLogger(${library-name}.class);
	
	public static void main(String[] args) {
		System.out.println("Hello from Main template");
		
		if (logger.isDebugEnabled()) {
			logger.debug("Logger se ha ejecutado");
		}
		
		
	}
	
	
	// Default constructor for ${library-name}
    public static void ${library-name}DefaultConstructor() {   
        	
    	// ...
    	
    }

}