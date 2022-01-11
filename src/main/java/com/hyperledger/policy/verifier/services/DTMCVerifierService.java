package com.hyperledger.policy.verifier.services;

import com.hyperledger.policy.verifier.repositories.model.DTMC.DTMCNodeModel;

public interface DTMCVerifierService {
    void verifyDTMCModel(DTMCNodeModel model);
}
