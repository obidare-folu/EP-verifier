package com.hyperledger.policy.verifier.repositories.model.CNF;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Data
@Getter
@Setter
@Builder
public class LiteralModel {
    private List<String> literalMembers;
}
