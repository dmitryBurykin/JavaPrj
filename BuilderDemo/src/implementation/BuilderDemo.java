package implementation;

import builder.LogBuilder;
import model.*;

public class BuilderDemo {

	public static void main(String[] args) {
		TextLog tLog = LogBuilder.getTextLog();
		tLog.logInfo("01. Step");
		tLog.logError("Тестовая ошибка");
		tLog.logWarning("Предупреждение");
		
		VisualLog vLog = LogBuilder.getVisualLog();
		vLog.logStep("02. Шаг");
		vLog.logMessage("Подготовка данных...");
		vLog.logError("Houston we have a problem!!!");
		vLog.logWarning("Предупреждение");
	}

}
