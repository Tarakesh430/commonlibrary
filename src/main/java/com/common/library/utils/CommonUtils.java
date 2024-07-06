package com.common.library.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;
import lombok.experimental.UtilityClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

@UtilityClass
public class CommonUtils {
    private static final Logger logger = LoggerFactory.getLogger(CommonUtils.class);
    public<T> Optional<T> getOptional(Supplier<T> resolver){
        try{
            return Optional.ofNullable(resolver.get());
        }catch(Exception ex){
            logger.info("Exception Occurred in Resolver {}",ex.getMessage());
        }
        return Optional.empty();
    }

    public long getEpochTimeStamp(){
        return Instant.now().toEpochMilli();
    }
    public JsonNode applyJsonPatches(List<JsonPatch> jsonPatches, JsonNode jsonNode) throws JsonPatchException {
        for (JsonPatch jsonPatch : jsonPatches) {
            jsonNode = jsonPatch.apply(jsonNode);
        }
        return jsonNode;
    }
}

