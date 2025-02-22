package com.example.util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerUtil {
    private static final Logger logger = Logger.getLogger("AppLog");
    private static FileHandler fileHandler;

    static {
        try {
            // Настройка обработчика файла
            fileHandler = new FileHandler("C:/Users/1/IdeaProjects/untitled4/logs/application_logs.txt", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void log(String message) {
        logger.info(message);
    }
}

