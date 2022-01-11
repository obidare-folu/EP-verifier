package com.hyperledger.policy.verifier.services;

import com.hyperledger.policy.verifier.repositories.model.DTMC.DTMCNodeModel;
import com.hyperledger.policy.verifier.repositories.model.DTMC.DTMCNodeWeightedModel;

public interface DTMCOptimizationService {
    DTMCNodeModel optimizeWithBackwardTransitions(DTMCNodeModel model);

    DTMCNodeWeightedModel optimizeWeights(DTMCNodeWeightedModel model);
}
