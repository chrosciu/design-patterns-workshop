package eu.chrost.patterns.behavioral.chain;

import lombok.Setter;

abstract class Developer {
    @Setter
    private Developer mentor;

    abstract boolean canSolve(Bug bug);

    abstract String prepareSolution(Bug bug);

    public String solve(Bug bug) {
        if (canSolve(bug)) {
            return prepareSolution(bug);
        }
        if (mentor != null) {
            return mentor.solve(bug);
        }
        return "Not resolved!";
    }

}
