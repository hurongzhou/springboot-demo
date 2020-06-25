package com.example.demo.util;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;

import java.util.UUID;

@Slf4j
public class LogUtil {

    private static final String LOG_ID = "LOG_ID";

    public static void buildLogId() {
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.replace("-", "");
        MDC.put(LOG_ID,uuid);
    }
}
