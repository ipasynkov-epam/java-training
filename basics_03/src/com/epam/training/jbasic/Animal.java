package com.epam.training.jbasic;

import java.io.IOException;

public class Animal {

	public String methodPublic() throws IOException {
		return "methodPublic Animal";
	}
	public String whoAmI(){
		return "I'm animal";
	}

	protected String methodProtected(){
		return "methodProtected Animal";
	}

	String methodDefault(){
		return "methodDefault Animal";
	}

	private String methodPrivate(){
		return "methodPrivate Animal";
	}
	public final String methodPublicFinal(){
		return "methodPublicFinal Animal";
	}

	public static String methodPublicStatic(){
		return "methodPublicStatic Animal";
	}
}
