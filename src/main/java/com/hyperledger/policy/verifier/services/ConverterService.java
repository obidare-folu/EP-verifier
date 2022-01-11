package com.hyperledger.policy.verifier.services;

import com.hyperledger.policy.verifier.repositories.model.CNF.CNFModel;
import com.hyperledger.policy.verifier.repositories.model.DTMC.DTMCModel;
import com.hyperledger.policy.verifier.repositories.model.DTMC.DTMCNodeWeightedModel;

public interface ConverterService {
    DTMCModel convertCNFToDTMC(CNFModel model);

    DTMCNodeWeightedModel convertCNFToDTMCWeightedModel(CNFModel model);
}
