package com.hyperledger.policy.verifier.repositories.model.DTMC;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
public class DTMCModel {
    private DTMCNodeModel root;
    private List<DTMCNodeModel> nodes;
    private List<DTMCNodeModel> desiredNodes;
}
