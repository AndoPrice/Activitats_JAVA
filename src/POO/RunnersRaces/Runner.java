package POO.RunnersRaces;

public class Runner {

    private String name, team;
    private String[] raceIDs = new String[5];
    private float [] times = new float[5];
    private int numRaces;
    private boolean professional;


    public Runner (String name){
        this.name = name;
        this.team = "Sense equip";
        this.professional = false;
        this.numRaces = 0;
    }

    public Runner (String name, String team, boolean professional){
        this.name = name;
        this.team = team;
        this.professional = professional;
        this.numRaces = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String[] getRaceIDs() {
        return raceIDs;
    }

    public void setRaceIDs(String[] raceIDs) {
        this.raceIDs = raceIDs;
    }

    public float[] getTimes() {
        return times;
    }

    public void setTimes(float[] times) {
        this.times = times;
    }

    public int getNumRaces() {
        return numRaces;
    }

    public void setNumRaces(int numRaces) {
        this.numRaces = numRaces;
    }

    public boolean isProfessional() {
        return professional;
    }

    public void setProfessional(boolean professional) {
        this.professional = professional;
    }



    public void addRace(String raceID){
        raceIDs[numRaces] = raceID;
        numRaces++;
    }

    public void addTime(float time){
        times[numRaces-1]= time;
    }

    public float bestTime(){
        float best = 0;
        for(int i = 0; i<times.length; i++){
            if (times[i]>best){
                best = times[i];
            }
        }
        return best;
    }

    public float averageTimes(){
        float average = 0;
        for(int i = 0; i<numRaces; i++){
            average = average + times[i];
        }
        return average/numRaces;
    }

    public String bestRace(){
        float best = 0;
        int n = 0;
        for(int i = 0; i<times.length; i++){
            if (times[i]>best){
                best = times[i];
                n = i;
            }
        }
        return raceIDs[n];
    }

}
