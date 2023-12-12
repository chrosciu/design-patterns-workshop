package eu.chrost.patterns.behavioral.chain;

class JuniorDeveloper extends BaseDeveloper {
    @Override
    protected boolean canSolve(Bug bug) {
        return bug.getSeverity().getRank() <= Severity.MINOR.getRank();
    }

    @Override
    protected String prepareSolution(Bug bug) {
        return "Solved by junior developer";
    }
}
