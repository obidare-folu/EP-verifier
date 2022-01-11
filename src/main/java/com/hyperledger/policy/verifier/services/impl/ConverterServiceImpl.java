package com.hyperledger.policy.verifier.services.impl;

import com.hyperledger.policy.verifier.repositories.model.CNF.CNFModel;
import com.hyperledger.policy.verifier.repositories.model.DTMC.DTMCModel;
import com.hyperledger.policy.verifier.repositories.model.DTMC.DTMCNodeWeightedModel;
import com.hyperledger.policy.verifier.services.ConverterService;
import org.springframework.stereotype.Service;

@Service
public class ConverterServiceImpl implements ConverterService {
    @Override
    public DTMCModel convertCNFToDTMC(CNFModel model) {
        return null;
    }

    @Override
    public DTMCNodeWeightedModel convertCNFToDTMCWeightedModel(CNFModel model) {
        return null;
    }
}
