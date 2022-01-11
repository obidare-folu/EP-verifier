package com.hyperledger.policy.verifier.api.cli;


import picocli.CommandLine;

@CommandLine.Command(
        name = "verify"
)
public class VerifyCommand implements Runnable{
    @CommandLine.Option(names = {"-cnf"})
    private String message;

    @Override
    public void run() {

    }
}
