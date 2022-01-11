package com.hyperledger.policy.verifier.repositories.model.DTMC;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
// TODO: ignore for now, probably would be used in the future
public class DTMCNodeWeightedModel extends DTMCNodeModel {
    private double totalSum;
    private double weight;

    DTMCNodeWeightedModel(DTMCNodeModel parent, boolean refusalParent, int id) {
        super(parent, refusalParent, id);
    }
}
