package com.hyperledger.policy.verifier.api.cli;

import picocli.CommandLine;

@CommandLine.Command(
        name = "ep",
        subcommands = {
                VerifyCommand.class,
                OptimizeCommand.class
        }
)
public class VerificationClient {
}
