package com.hyperledger.policy.verifier.repositories.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SpecificationModel {
    private double probabilityThreshold;
    private double weightThreshold;
}
