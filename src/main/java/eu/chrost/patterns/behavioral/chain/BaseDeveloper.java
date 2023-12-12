package eu.chrost.patterns.behavioral.chain;

import lombok.Setter;

abstract class BaseDeveloper implements Developer {
    @Setter
    protected Developer mentor;

    protected abstract boolean canSolve(Bug bug);

    protected abstract String prepareSolution(Bug bug);

    @Override
    public String solve(Bug bug) {
        if (canSolve(bug)) {
            return prepareSolution(bug);
        }
        if (mentor != null) {
            return mentor.solve(bug);
        }
        return "Not resolved";
    }
}
