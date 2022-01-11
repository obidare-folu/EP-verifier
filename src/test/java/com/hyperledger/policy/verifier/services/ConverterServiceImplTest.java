package com.hyperledger.policy.verifier.services;

import com.hyperledger.policy.verifier.repositories.model.CNF.CNFModel;
import com.hyperledger.policy.verifier.repositories.model.CNF.LiteralModel;
import com.hyperledger.policy.verifier.repositories.model.DTMC.DTMCModel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterServiceImplTest {
    CNFModel cnfModel;

    @Autowired
    ConverterService converterService;

    @BeforeAll
    public void init() {
        List<LiteralModel> literalModelList = new ArrayList<>(3);

        List<String> literalMembers1 = new ArrayList<>();
        literalMembers1.add("Org2");
        literalMembers1.add("Org3");
        literalModelList.add(LiteralModel.builder().literalMembers(literalMembers1).build());

        List<String> literalMembers2 = new ArrayList<>();
        literalMembers1.add("Org1");
        literalMembers1.add("Org2");
        literalModelList.add(LiteralModel.builder().literalMembers(literalMembers2).build());

        cnfModel = CNFModel.builder().literals(literalModelList).build();
    }

    @Test
    public void convertCNFToDTMC(){
        DTMCModel dtmcModel = converterService.convertCNFToDTMC(cnfModel);

        // we have 3 organization, thus in DTMC model shall be 2^3 states
        assertEquals(Math.pow(2, 3), dtmcModel.getNodes().size());

        // desired states depend on the root that is chosen random. Thus, check just the number of desired nodes
        assertEquals(3, dtmcModel.getDesiredNodes().size());
    }
}
