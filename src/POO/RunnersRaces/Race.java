package POO.RunnersRaces;

public class Race{

    private String raceID;
    private Runner[] runners = new Runner[8];
    private float[] times = new float[8];
    private boolean isFinals;
    private int numRunners;
    private float classificationTime;

    public Race (String raceID){
        this.raceID = raceID;
        this.isFinals = false;
        this.classificationTime = 0;
        this.numRunners = 0;
    }

    public Race (String raceID, boolean finals, float classificationTime){
        this.raceID = raceID;
        this.isFinals = finals;
        this.classificationTime = classificationTime;
        this.numRunners = 0;
    }

    public String getRaceID() {
        return raceID;
    }

    public void setRaceID(String raceID) {
        this.raceID = raceID;
    }

    public Runner[] getRunners() {
        return runners;
    }

    public void setRunners(Runner[] runners) {
        this.runners = runners;
    }

    public float[] getTimes() {
        return times;
    }

    public void setTimes(float[] times) {
        this.times = times;
    }

    public boolean isFinals() {
        return isFinals;
    }

    public void setFinals(boolean finals) {
        isFinals = finals;
    }

    public int getNumRunners() {
        return numRunners;
    }

    public void setNumRunners(int numRunners) {
        this.numRunners = numRunners;
    }

    public float getClassificationTime() {
        return classificationTime;
    }

    public void setClassificationTime(float classificationTime) {
        this.classificationTime = classificationTime;
    }


    public void addRunner (Runner runner){
        runners[numRunners] = runner;
        numRunners++;
    }

    public void addTimeToRunner(Runner runner, float time){
        times[numRunners-1] = time;
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

    public String bestRunner(){
        float best = 0;
        int n = 0;
        for(int i = 0; i<times.length; i++){
            if (times[i]>best){
                best = times[i];
                n = i;
            }
        }
        return runners[n].getName();
    }

    public float averageTimes(){
        float average = 0;
        for(int i = 0; i<numRunners; i++){
            average = average + times[i];
        }
        return average/numRunners;
    }

    public float differenceBestFromWorst(){
        float min = times[0];
        float max = times[0];

        for(int i = 1; i<times.length; i++){
            if(times[i]<min){
                min = times[i];
            }
            if(times[i]>max){
                max = times[i];
            }
        }

        return max-min;
    }

}

    

