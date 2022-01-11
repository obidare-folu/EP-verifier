package com.hyperledger.policy.verifier.exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class IncorrectCNFException extends Exception {
    IncorrectCNFException(String message) {
        super(message);
    }
}
