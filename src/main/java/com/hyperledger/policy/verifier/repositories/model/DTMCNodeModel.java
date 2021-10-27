package com.hyperledger.policy.verifier.repositories.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DTMCNodeModel {
    private DTMCNodeModel parent;
    private boolean refusalParent;
    private double totalSum;
    private double weight;
    private int id;
}
