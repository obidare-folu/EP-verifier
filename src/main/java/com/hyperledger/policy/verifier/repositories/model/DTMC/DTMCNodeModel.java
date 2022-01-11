package com.hyperledger.policy.verifier.repositories.model.DTMC;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DTMCNodeModel {
    private DTMCNodeModel parent;
    private boolean refusalParent;
    private int id;
}
