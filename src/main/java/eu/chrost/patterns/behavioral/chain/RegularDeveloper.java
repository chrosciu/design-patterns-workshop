package eu.chrost.patterns.behavioral.chain;

class RegularDeveloper extends BaseDeveloper {
    @Override
    protected boolean canSolve(Bug bug) {
        return bug.getSeverity().getRank() <= Severity.MAJOR.getRank();
    }

    @Override
    protected String prepareSolution(Bug bug) {
        return "Solved by regular developer";
    }
}
