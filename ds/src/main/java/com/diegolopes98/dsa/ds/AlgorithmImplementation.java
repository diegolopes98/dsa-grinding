package com.diegolopes98.dsa.ds;

public interface AlgorithmImplementation<Input, Output> {
    Output execute(Input input);
    String toString();
}
