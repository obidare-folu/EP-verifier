package com.hyperledger.policy.verifier.utils;

import com.hyperledger.policy.verifier.exceptions.IncorrectCNFException;
import com.hyperledger.policy.verifier.repositories.model.CNF.CNFModel;
import com.hyperledger.policy.verifier.repositories.model.CNF.LiteralModel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CNFParserTest {
    File simpleConfigFile;
    File invalidProbabilitiesConfigFile;
    File invalidCNFConfigFile;
    private final String SIMPLE_SYSTEM_CONFIG_PATH = "src/test/resources/simple_system_config.yaml";
    private final String INVALID_PROBABILITIES_CONFIG_PATH = "src/test/resources/zero_system_parameters.yaml";
    private final String INVALID_CNF_PATH = "src/test/resources/zero_system_parameters.yaml";
    ModelParser modelParser = new ModelParser();

    @BeforeAll
    public void init() {
        simpleConfigFile = new File(SIMPLE_SYSTEM_CONFIG_PATH);
        invalidProbabilitiesConfigFile = new File(INVALID_PROBABILITIES_CONFIG_PATH);
        invalidCNFConfigFile = new File(INVALID_CNF_PATH);
    }

    @Test
    public void parseSimpleParametersTest() {

        CNFModel model = modelParser.parseCNFModel(simpleConfigFile);

        LiteralModel literal1 = model.getLiterals().get(0);
        assertEquals(2, literal1.getLiteralMembers().size());
        assertEquals("Org2", literal1.getLiteralMembers().get(0));
        assertEquals("Org3", literal1.getLiteralMembers().get(1));


        LiteralModel literal2 = model.getLiterals().get(1);
        assertEquals(2, literal2.getLiteralMembers().size());
        assertEquals("Org1", literal2.getLiteralMembers().get(0));
        assertEquals("Org2", literal2.getLiteralMembers().get(1));
    }

    @Test
    public void parseInvalidProbabilitiesTest() {
        Exception exception = assertThrows(IncorrectCNFException.class, () ->
                modelParser.parseAcceptanceProbabilities(invalidProbabilitiesConfigFile));

        assertEquals("probability of Org1 is less than zero, probability of Org2 is greater than one",
                exception.getMessage());
    }

    @Test
    public void parseInvalidProbabilityThresholdTest() {
        Exception exception = assertThrows(IncorrectCNFException.class, () ->
                modelParser.parseProbabilityThreshold(invalidProbabilitiesConfigFile));

        assertEquals("invalid probability threshold", exception.getMessage());
    }

    @Test
    public void parseInvalidCNFTest() {
        Exception exception = assertThrows(IncorrectCNFException.class, () ->
                modelParser.parseCNFModel(invalidCNFConfigFile));

        assertEquals("invalid CNF formula",
                exception.getMessage());
    }
}
