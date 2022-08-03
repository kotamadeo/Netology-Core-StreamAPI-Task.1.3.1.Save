package com.gmail.at.kotamadeo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Optional;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Начинаем работу программы");
        logger.info("Успешно создали директорию temp в директории Games");
        Path src = createSrc();
        Path resources = createResources();
        Path main = createMain(src);
        createTest(src);
        createMainJava(main);
        createMainUtils(main);
        createResourcesDrawables(resources);
        createResourcesVectors(resources);
        createResourcesIcons(resources);
    }

    private static Path createSrc() {
        String targetDirectory = "\\Module_1-Stream_API-Task_1.3.1-Save\\Games\\src";
        Path src = null;
        logger.warn("Пытаемся создать директорию src в директории Games");
        logger.info("Успешно создали директорию TMP в директории Games");
        try {
            Path path = Paths.get(targetDirectory);
            if (Files.exists(path)) {
                logger.info("Директория src в директории Games уже существует");
            } else {
                src = Files.createDirectory(Paths.get(targetDirectory));
                logger.info("Успешно создали директорию src в директории Games");
            }
        } catch (IOException e) {
            logger.fatal(e.getMessage());
            logger.fatal(Arrays.toString(e.getStackTrace()));
        }
        return src;
    }

    private static Path createResources() {
        String targetDirectory = "\\Module_1-Stream_API-Task_1.3.1-Save\\Games\\resources";
        Path resources = null;
        logger.warn("Пытаемся создать директорию resources в директории Games");
        try {
            if (Files.exists(Paths.get(targetDirectory))) {
                logger.info("Директория resources в директории Games уже существует");
            } else {
                resources = Files.createDirectory(Paths.get(targetDirectory));
                logger.info("Успешно создали директорию resources в директории Games");
            }
        } catch (IOException e) {
            logger.fatal(e.getMessage());
            logger.fatal(Arrays.toString(e.getStackTrace()));
        }
        return resources;
    }

    private static Path createMain(Path path) {
        String targetDirectory = path.toString() + "\\main";
        Path main = null;
        logger.warn("Пытаемся создать директорию main в директории src");
        try {
            if (Files.exists(Paths.get(targetDirectory))) {
                logger.info("Директория main в директории src уже существует");
            } else {
                main = Files.createDirectory(Paths.get(targetDirectory));
                logger.info("Успешно создали директорию main в директории src");
            }
        } catch (IOException e) {
            logger.fatal(e.getMessage());
            logger.fatal(Arrays.toString(e.getStackTrace()));
        }
        return main;
    }

    private static void createTest(Path path) {
        String targetDirectory = path.toString() + "\\test";
        logger.warn("Пытаемся создать директорию test в директории src");
        try {
            if (Files.exists(Paths.get(targetDirectory))) {
                logger.info("Директория test в директории src уже существует");
            } else {
                Files.createDirectory(Paths.get(targetDirectory));
                logger.info("Успешно создали директорию test в директории src");
            }
        } catch (IOException e) {
            logger.fatal(e.getMessage());
            logger.fatal(Arrays.toString(e.getStackTrace()));
        }
    }

    private static void createMainJava(Path path) {
        String targetFile = path.toString() + "\\Main.java";
        logger.warn("Пытаемся создать класс Main в директории Main");
        try {
            if (Files.exists(Paths.get(targetFile))) {
                logger.info("класс Main в директории Main уже существует");
            } else {
                Files.createFile(Paths.get(targetFile));
                logger.info("Успешно создали класс Main в директории Main");
            }
        } catch (IOException e) {
            logger.fatal(e.getMessage());
            logger.fatal(Arrays.toString(e.getStackTrace()));
        }
    }

    private static void createMainUtils(Path path) {
        String targetFile = path.toString() + "\\Utils.java";
        logger.warn("Пытаемся создать класс Utils в директории Main");
        try {
            if (Files.exists(Paths.get(targetFile))) {
                logger.info("класс Utils в директории Main уже существует");
            } else {
                Files.createFile(Paths.get(targetFile));
                logger.info("Успешно создали класс Utils в директории Main");
            }
        } catch (IOException e) {
            logger.fatal(e.getMessage());
            logger.fatal(Arrays.toString(e.getStackTrace()));
        }
    }

    private static void createResourcesDrawables(Path path) {
        String targetDirectory = path.toString() + "\\drawables";
        logger.warn("Пытаемся создать директорию drawables в директории resources");
        try {
            if (Files.exists(Paths.get(targetDirectory))) {
                logger.info("Директория drawables в директории resources уже существует");
            } else {
                Files.createDirectory(Paths.get(targetDirectory));
                logger.info("Успешно создали директорию drawables в директории resources");
            }
        } catch (IOException e) {
            logger.fatal(e.getMessage());
            logger.fatal(Arrays.toString(e.getStackTrace()));
        }
    }

    private static void createResourcesVectors(Path path) {
        String targetDirectory = path.toString() + "\\vectors";
        logger.warn("Пытаемся создать директорию vectors в директории resources");
        try {
            if (Files.exists(Paths.get(targetDirectory))) {
                logger.info("Директория vectors в директории resources уже существует");
            } else {
                Files.createDirectory(Paths.get(targetDirectory));
                logger.info("Успешно создали директорию vectors в директории resources");
            }
        } catch (IOException e) {
            logger.fatal(e.getMessage());
            logger.fatal(Arrays.toString(e.getStackTrace()));
        }
    }

    private static void createResourcesIcons(Path path) {
        String targetDirectory = path.toString() + "\\icons";
        logger.warn("Пытаемся создать директорию icons в директории resources");
        try {
            if (Files.exists(Paths.get(targetDirectory))) {
                logger.info("Директория icons в директории resources уже существует");
            } else {
                Files.createDirectory(Paths.get(targetDirectory));
                logger.info("Успешно создали директорию icons в директории resources");
            }
        } catch (IOException e) {
            logger.fatal(e.getMessage());
            logger.fatal(Arrays.toString(e.getStackTrace()));
        }
    }
}
