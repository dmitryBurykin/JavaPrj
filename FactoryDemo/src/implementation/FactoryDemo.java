package implementation;

import factory.LogFactory;
import model.AbstractLog;

public class FactoryDemo {

	public static void main(String[] args) {
		
		AbstractLog Log = LogFactory.getLog("TEXT");
		Log.logInfo("����");
		Log.logWarning("��������������");
		Log.logError("������");
		
		// �� ������ ��������
		Log.logStep("02. ���");
		
		AbstractLog vLog = LogFactory.getLog("VISUAL");
		vLog.logMessage("���������");
		vLog.logStep("01. ���");
		vLog.logInfo("����");
		vLog.logWarning("��������������");
		vLog.logError("������");
		
		//AbstractLog xLog = LogFactory.getLog("XML");
		//xLog.logInfo("����");
	}

}
