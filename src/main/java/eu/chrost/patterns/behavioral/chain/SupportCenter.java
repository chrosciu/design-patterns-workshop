package eu.chrost.patterns.behavioral.chain;

class SupportCenter {
    private final JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
    private final RegularDeveloper regularDeveloper = new RegularDeveloper();
    private final SeniorDeveloper seniorDeveloper = new SeniorDeveloper();

    SupportCenter() {
        //juniorDeveloper.setMentor(regularDeveloper);
    }

    String solve(Bug bug) {
        return juniorDeveloper.solve(bug);
//        if (bug.getSeverity().getRank() <= Severity.MINOR.getRank()) {
//            return juniorDeveloper.solve(bug);
//        } else if (bug.getSeverity().getRank() <= Severity.MAJOR.getRank()) {
//            return regularDeveloper.solve(bug);
//        } else {
//            return seniorDeveloper.solve(bug);
//        }
    }
}
