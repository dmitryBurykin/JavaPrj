package builder;

import model.*;

public class LogBuilder {
	
	public static TextLog getTextLog(){
		return new TextLog();
	}
	
	public static VisualLog getVisualLog(){
		return new VisualLog();
	}
}
