package eu.chrost.patterns.behavioral.chain;

class RegularDeveloper {
    String solve(Bug bug) {
        if (bug.getSeverity().getRank() <= Severity.MAJOR.getRank()) {
            return "Solved by regular developer";
        }
        return "Not resolved - not enough skills";
    }
}
