package eu.chrost.patterns.behavioral.chain;

class SeniorDeveloper extends BaseDeveloper {
    @Override
    protected boolean canSolve(Bug bug) {
        return true;
    }

    @Override
    protected String prepareSolution(Bug bug) {
        return "Solved by senior developer";
    }
}
