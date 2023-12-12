package eu.chrost.patterns.behavioral.chain;

class SupportCenter {
    private final JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
    private final RegularDeveloper regularDeveloper = new RegularDeveloper();
    private final SeniorDeveloper seniorDeveloper = new SeniorDeveloper();

    SupportCenter() {
        juniorDeveloper.setMentor(regularDeveloper);
        regularDeveloper.setMentor(seniorDeveloper);
    }

    String solve(Bug bug) {
        return juniorDeveloper.solve(bug);
    }
}
