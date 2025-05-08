package POO.RunnersRaces;

public class Team {
    private String name;
    private Runner[] runners = new Runner[5];
    private int numRunners;
    private boolean international;

    public Team(String name, boolean international){
        this.name = name;
        this.international = international;
        this.numRunners = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Runner[] getRunners() {
        return runners;
    }

    public void setRunners(Runner[] runners) {
        this.runners = runners;
    }

    public int getNumRunners() {
        return numRunners;
    }

    public void setNumRunners(int numRunners) {
        this.numRunners = numRunners;
    }

    public boolean isInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    public void addRunner (Runner runner) {
        runners[numRunners] = runner;
        numRunners++;
    }

    public float averageTimes(){
        float sumTimes = 0;
        for (int i = 0; i < numRunners; i++) {
            sumTimes += runners[i].averageTimes();
        }
        return sumTimes / numRunners;
    }

    public boolean areAllProfessionals(){
        for(int i=0; i<numRunners; i++){
            Runner r = getRunners()[i];
            if(!r.isProfessional()){
                return false;
            }
        }
        return true;
    }

    public int getNumProfessionals(){
        int n = 0;
        for(int i=0; i<numRunners; i++){
            Runner ri = runners[i];
            if(ri.isProfessional()){
                n++;
            }
        }
        return n;
    }
}
