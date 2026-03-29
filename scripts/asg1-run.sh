#!/bin/bash

DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" &>/dev/null && pwd)"
cd "$DIR"/.. || exit

arguments="comp5111.assignment.cut.Regression_6_Test "
arguments=$arguments'comp5111.assignment.cut.Subject '
arguments=$arguments'comp5111.assignment.cut.Subject$StringAlgorithms '
arguments=$arguments'comp5111.assignment.cut.Subject$DateTimeAlgorithms '
arguments=$arguments'comp5111.assignment.cut.Subject$GamePlayer '
arguments=$arguments'comp5111.assignment.cut.Subject$GamePlace '
arguments=$arguments'comp5111.assignment.cut.Subject$GameConfiguration '

mvn clean compile exec:java -Dexec.mainClass="comp5111.assignment.Assignment1" \
-Dexec.args="$arguments"
