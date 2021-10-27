package com.hyperledger.policy.verifier.utils;

import com.hyperledger.policy.verifier.repositories.model.DTMCModel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ParametersParserTest {
    File simpleSystemParameters;
    File multipleOrgsSystemParameters;
    File invalidSystemParameters;
    private final String SIMPLE_SYSTEM_PARAMETERS_PATH = "src/test/resources/zero_system_parameters.yaml";
    private final String MULTIPLE_ORGS_SYSTEM_PARAMETERS_PATH = "src/test/resources/zero_system_parameters.yaml";
    private final String INVALID_SYSTEM_PARAMETERS_PATH = "src/test/resources/zero_system_parameters.yaml";

    @BeforeAll
    public void init() {
        simpleSystemParameters = new File(SIMPLE_SYSTEM_PARAMETERS_PATH);
        multipleOrgsSystemParameters = new File(MULTIPLE_ORGS_SYSTEM_PARAMETERS_PATH);
        invalidSystemParameters = new File(INVALID_SYSTEM_PARAMETERS_PATH);
    }

    @Test
    public void parseSimpleParametersTest() {
        SystemParametersUtils systemParametersUtils = new SystemParametersUtils();

        DTMCModel model = systemParametersUtils.parseSystemParametersToModel(simpleSystemParameters);
        assertEquals(0d, model.getSpecificationModel().getProbabilityThreshold());
        assertEquals(0d, model.getSpecificationModel().getWeightThreshold());
        assertEquals(0d, model.getNodes().size());
    }

    @Test
    public void parseMultipleOrgsParametersTest() {
        SystemParametersUtils systemParametersUtils = new SystemParametersUtils();

        DTMCModel model = systemParametersUtils.parseSystemParametersToModel(multipleOrgsSystemParameters);
        assertEquals(0d, model.getSpecificationModel().getProbabilityThreshold());
        assertEquals(0d, model.getSpecificationModel().getWeightThreshold());
        assertEquals(0d, model.getNodes().size());
    }

    @Test
    public void parseInvalidParametersTest() {
        SystemParametersUtils systemParametersUtils = new SystemParametersUtils();

        DTMCModel model = systemParametersUtils.parseSystemParametersToModel(invalidSystemParameters);
        assertEquals(0d, model.getSpecificationModel().getProbabilityThreshold());
        assertEquals(0d, model.getSpecificationModel().getWeightThreshold());
        assertEquals(0d, model.getNodes().size());
    }
}
