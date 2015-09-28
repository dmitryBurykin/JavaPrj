package model;

import model.abstracts.AbstractLog;

public class VisualLog extends AbstractLog {

	@Override
	public void logInfo(String Msg) {
		System.out.println(this.getClass().getName() + ": " + "<p class=\"info\">" + Msg + "</p>");
	}

	@Override
	public void logWarning(String Msg) {
		System.out.println(this.getClass().getName() + ": " + "<p class=\"warn\">" + Msg + "</p>");
	}

	@Override
	public void logError(String Msg) {
		System.out.println(this.getClass().getName() + ": " + "<p class=\"error\">" + Msg + "</p>");
	}
	
	
	public void logStep(String Msg) {
		System.out.println(this.getClass().getName() + ": " + "<p class=\"step\">" + Msg + "</p>");
	}
	
	
	public void logMessage(String Msg) {
		System.out.println(this.getClass().getName() + ": " + "<p class=\"mess\">" + Msg + "</p>");
	}

}
