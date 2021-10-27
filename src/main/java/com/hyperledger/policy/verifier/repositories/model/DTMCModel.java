package com.hyperledger.policy.verifier.repositories.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class DTMCModel {
    private SpecificationModel specificationModel;
    private List<DTMCNodeModel> nodes;
}
