package implementation;

import builder.LogBuilder;
import model.*;

public class BuilderDemo {

	public static void main(String[] args) {
		TextLog tLog = LogBuilder.getTextLog();
		tLog.logInfo("01. Step");
		tLog.logError("�������� ������");
		tLog.logWarning("��������������");
		
		VisualLog vLog = LogBuilder.getVisualLog();
		vLog.logStep("02. ���");
		vLog.logMessage("���������� ������...");
		vLog.logError("Houston we have a problem!!!");
		vLog.logWarning("��������������");
	}

}
