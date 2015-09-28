package factory;

import model.*;

public class LogFactory {
	
	public static AbstractLog getLog(String logType){
		AbstractLog LogInstance = null;
		switch (logType) {
		case "TEXT":
			LogInstance = new TextLog();
			break;
		case "VISUAL":
			LogInstance = new VisualLog();
			break;	
		default:
			try {
				throw new Exception("���������� ������� ��� ���������� ����: " + logType);
			} catch (Exception e) {
				e.printStackTrace();
			} 
			break;
		}
		return LogInstance;
	}
}
