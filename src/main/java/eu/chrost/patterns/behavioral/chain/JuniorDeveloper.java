package eu.chrost.patterns.behavioral.chain;

class JuniorDeveloper extends Developer {
    @Override
    boolean canSolve(Bug bug) {
        return bug.getSeverity().getRank() <= Severity.MINOR.getRank();
    }

    @Override
    String prepareResolution(Bug bug) {
        return "Solved by junior developer";
    }
}
