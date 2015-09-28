package model;

public class VisualLog extends AbstractLog {

	
	public void logInfo(String Msg) {
		System.out.println(this.getClass().getName() + ": " + "<p class=\"info\">" + Msg + "</p>");
	}

	
	public void logWarning(String Msg) {
		System.out.println(this.getClass().getName() + ": " + "<p class=\"warn\">" + Msg + "</p>");
	}

	
	public void logError(String Msg) {
		System.out.println(this.getClass().getName() + ": " + "<p class=\"error\">" + Msg + "</p>");
	}
	
	@Override
	public void logStep(String Msg) {
		System.out.println(this.getClass().getName() + ": " + "<p class=\"step\">" + Msg + "</p>");
	}
	
	@Override
	public void logMessage(String Msg) {
		System.out.println(this.getClass().getName() + ": " + "<p class=\"mess\">" + Msg + "</p>");
	}

}
