package eu.chrost.patterns.behavioral.chain;

class RegularDeveloper extends Developer {

    @Override
    boolean canSolve(Bug bug) {
        return false;
    }

    @Override
    String prepareSolution(Bug bug) {
        return "";
    }
}
