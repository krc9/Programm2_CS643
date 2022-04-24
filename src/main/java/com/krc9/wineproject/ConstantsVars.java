package com.krc9.wineproject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ConstantsVars {
    public static final Logger logger =
            LogManager.getLogger(TrainingModel.class);

    // AWS CREDENTIALS
    public static final String ACCESS_KEY_ID = System.getProperty("ACCESS_KEY_ID");
    public static final String SECRET_KEY = System.getProperty("SECRET_KEY");
    public static final String BUCKET_NAME = System.getProperty("BUCKET_NAME");
    //APP
    public static final String APP_NAME = "Wine-Assigment-2-test";
    // DATA REFERENCES
    public static final String MODEL_PATH = "data/TrainingModel";
    public static final String TESTING_DATASET =  "data/TestDataset.csv";
    public static final String TRAINING_DATASET = "TrainingDataset.csv";
    public static final String VALIDATION_DATASET =  "ValidationDataset.csv";

}
