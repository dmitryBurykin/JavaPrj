package model;

import model.abstracts.AbstractLog;

public class TextLog extends AbstractLog {

	
	public void logInfo(String Msg) {
		System.out.println(this.getClass().getName() + ": " + Msg);
	}

	public void logWarning(String Msg) {
		System.out.println(this.getClass().getName() + ": ***WARN***. " + Msg);
	}

	public void logError(String Msg) {
		System.out.println(this.getClass().getName() + ": ***ERROR***. " + Msg);
	}

}
