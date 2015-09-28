package implementation;

import factory.LogFactory;
import model.AbstractLog;

public class FactoryDemo {

	public static void main(String[] args) {
		
		AbstractLog Log = LogFactory.getLog("TEXT");
		Log.logInfo("Инфо");
		Log.logWarning("Предупреждение");
		Log.logError("Ошибка");
		
		// Не должно работать
		Log.logStep("02. Шаг");
		
		AbstractLog vLog = LogFactory.getLog("VISUAL");
		vLog.logMessage("Сообщение");
		vLog.logStep("01. Шаг");
		vLog.logInfo("Инфо");
		vLog.logWarning("Предупреждение");
		vLog.logError("Ошибка");
		
		//AbstractLog xLog = LogFactory.getLog("XML");
		//xLog.logInfo("Инфо");
	}

}
