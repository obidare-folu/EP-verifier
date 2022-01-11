package com.hyperledger.policy.verifier.services.impl;

import com.hyperledger.policy.verifier.repositories.model.DTMC.DTMCNodeModel;
import com.hyperledger.policy.verifier.repositories.model.DTMC.DTMCNodeWeightedModel;
import com.hyperledger.policy.verifier.services.DTMCOptimizationService;
import org.springframework.stereotype.Service;

@Service
public class DTMCOptimizationServiceImpl implements DTMCOptimizationService {
    @Override
    public DTMCNodeModel optimizeWithBackwardTransitions(DTMCNodeModel model) {
        return null;
    }

    @Override
    public DTMCNodeWeightedModel optimizeWeights(DTMCNodeWeightedModel model) {
        return null;
    }
}
