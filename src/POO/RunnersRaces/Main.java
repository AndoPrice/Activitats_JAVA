package POO.RunnersRaces;

public class Main {

    public static Team[] allTeams;
    public static Race[] allRaces;
    public static Runner[] allRunners;

    public static void main(String[] args) {
        allTeams = new Team[5];
        allRaces = new Race[10];
        allRunners = new Runner[100];

        allRunners[0] = new Runner("Paco");
        allRunners[1] = new Runner("Bel", "Equip B", true);
        allRunners[2] = new Runner("Maria", "Equip A", false);
        allRunners[3] = new Runner("Toni");
        allRunners[4] = new Runner("Lian", "Equip C", true);


        allRunners[0].setTeam("Equip A");
        allRunners[0].setProfessional(true);
        allRunners[3].setTeam("Equip B");
        allRunners[4].setProfessional(false);
        allRunners[2].setTeam("Equip C");

        allRunners[0].addRace("Palma");
        allRunners[0].addTime(12.5f);
        allRunners[1].addRace("Manacor");
        allRunners[1].addTime(14f);
        allRunners[1].addRace("Llucmajor");
        allRunners[1].addTime(12);
        allRunners[2].addRace("Campos");
        allRunners[2].addTime(11f);
        allRunners[3].addRace("Inca");
        allRunners[3].addTime(16f);
        allRunners[4].addRace("Felanitx");
        allRunners[4].addTime(14.5f);

        Runner r1 = allRunners[0];
        System.out.printf("Millor carrera de %s va ser a %s amb temps %.2f.\n", r1.getName(), r1.bestRace(), r1.bestTime());
        Runner r2 = allRunners[1];
        System.out.printf("Millor carrera de %s va ser a %s amb temps %.2f.\n", r2.getName(), r2.bestRace(), r2.bestTime());
        Runner r3 = allRunners[2];
        System.out.printf("Millor carrera de %s va ser a %s amb temps %.2f.\n", r3.getName(), r3.bestRace(), r3.bestTime());
        Runner r4 = allRunners[3];
        System.out.printf("Millor carrera de %s va ser a %s amb temps %.2f.\n", r4.getName(), r4.bestRace(), r4.bestTime());
        Runner r5 = allRunners[4];
        System.out.printf("Millor carrera de %s va ser a %s amb temps %.2f.\n", r5.getName(), r5.bestRace(), r5.bestTime());

        allTeams[0] = new Team("Equip A", true);
        allTeams[1] = new Team("Equip B", false);
        allTeams[2] = new Team("Equip C", true);

        allTeams[0].addRunner(allRunners[0]);
        allTeams[1].addRunner(allRunners[1]);
        allTeams[2].addRunner(allRunners[2]);
        allTeams[0].addRunner(allRunners[3]);
        allTeams[1].addRunner(allRunners[4]);

        Team t1 = allTeams[0];
        System.out.printf("Temps mig de l'equip %s és %.2f. \n", t1.getName(), t1.averageTimes());
        Team t2 = allTeams[1];
        System.out.printf("Temps mig de l'equip %s és %.2f. \n", t2.getName(), t2.averageTimes());
        Team t3 = allTeams[2];
        System.out.printf("Temps mig de l'equip %s és %.2f. \n", t3.getName(), t3.averageTimes());

        System.out.printf("L'equip %s té %d corredor/s professionals.\n", t3.getName(), t3.getNumProfessionals());

        allRaces[0] = new Race("Carrera 1", false, 14);
        allRaces[1] = new Race("Carrera 2");
        allRaces[2] = new Race("Carrera 3", true, 13.5f);

        allRaces[0].addRunner(allRunners[0]);
        allRaces[0].addTimeToRunner(allRunners[0], 12f);
        allRaces[0].addRunner(allRunners[1]);
        allRaces[0].addTimeToRunner(allRunners[1], 11.9f);
        allRaces[0].addRunner(allRunners[2]);
        allRaces[0].addTimeToRunner(allRunners[2], 12.2f);
        allRaces[0].addRunner(allRunners[3]);
        allRaces[0].addTimeToRunner(allRunners[2], 12.1f);

        allRaces[1].addRunner(allRunners[0]);
        allRaces[1].addTimeToRunner(allRunners[0], 12f);
        allRaces[1].addRunner(allRunners[1]);
        allRaces[1].addTimeToRunner(allRunners[1], 11.9f);
        allRaces[1].addRunner(allRunners[4]);
        allRaces[1].addTimeToRunner(allRunners[4], 13f);

        allRaces[2].addRunner(allRunners[0]);
        allRaces[2].addTimeToRunner(allRunners[0], 11.8f);
        allRaces[2].addRunner(allRunners[1]);
        allRaces[2].addTimeToRunner(allRunners[1], 12.9f);
        allRaces[2].addRunner(allRunners[2]);
        allRaces[2].addTimeToRunner(allRunners[3], 14.0f);

        Race c1 = allRaces[0];
        System.out.printf("Millor corredor/a de la %s és %s amb temps %.2f. \n", c1.getRaceID(), c1.bestRunner(), c1.bestTime());

        System.out.printf("%s és el millor corredor/a de l'equip %s.\n", bestProfessionalRunnerOfTeam(t1), t1.getName());

        printClassifiedRunners(allRaces[0], allTeams[0].getName());

        System.out.printf("%s és el millor equip.\n", bestTeam(allTeams));


    }

    public static String bestProfessionalRunnerOfTeam (Team t){
        float min = Float.MAX_VALUE;
        String name = null;
        for(int i=0; i<t.getNumRunners();  i++){
            Runner r = t.getRunners()[i];
            if(r.isProfessional()){
                float time = r.bestTime();
                if(time < min){
                    min = time;
                    name = r.getName();
                }
            }
        }
        return name;
    }

    public static String bestTeam(Team[] teams){
        float min = Float.MAX_VALUE;
        int j = -1;
        for(int i=0; i<teams.length; i++){
            if(teams[i]!=null) {
                float time = teams[i].averageTimes();
                if (time < min) {
                    min = time;
                    j = i;
                }
            }
        }
        return teams[j].getName();
    }

    public static Runner[] getClassifiedRunners(Race r, String nameTeam){
        Runner[] classified = new Runner[r.getNumRunners()];
        int numClassified = 0;
        for(int i=0; i<r.getNumRunners(); i++){
            Runner runner = r.getRunners()[i];
            float time = r.getTimes()[i];
            if(time < r.getClassificationTime() && runner.getTeam() == nameTeam){
                classified[numClassified] = runner;
                numClassified++;
            }
        }
        return classified;
    }

    public static void printClassifiedRunners(Race r, String nameTeam){
        System.out.printf("Corredors classificats de l'equip %s a la carrera %s: \n", nameTeam, r.getRaceID());
        for(int i=0; i<r.getNumRunners(); i++){
            Runner runner = r.getRunners()[i];
            float time = r.getTimes()[i];
            if(time < r.getClassificationTime() && runner.getTeam() == nameTeam){
                System.out.printf("\t%s amb temps %.2f.\n", runner.getName(), time);
            }
        }
    }

    public static boolean hasImproved(Runner r, Race[] races){
        float lastTime = Float.MAX_VALUE;
        for(int i=0; i<races.length; i++){
            for(int j=0; j<races[i].getNumRunners(); j++){
                if(races[i].getRunners()[j] == r){
                    float temps = races[i].getTimes()[j];
                    if(temps > lastTime){
                        return false;
                    }
                    else {
                        lastTime = temps;
                    }
                }
            }
        }
        return true;
    }

    public static boolean everClassified(Runner r, Race[] races){
        for(int i=0; i<races.length; i++){
            Race race = races[i];
            for(int j=0; j<race.getNumRunners(); j++){
                Runner rr = race.getRunners()[j];
                float times = race.getTimes()[j];
                if(r == rr && times > race.getClassificationTime()){
                    return false;
                }
            }
        }
        return true;
    }

    public static float avgNumRunners(Race[] races){
        float sum = 0;
        for(int i=0; i<races.length; i++){
            sum += races[i].getNumRunners();
        }
        return sum/races.length;
    }

    public static float avgTimesRaces(Race[] races){
        float sum = 0;
        for(int i=0; i<races.length; i++){
            sum += races[i].averageTimes();
        }
        return sum/races.length;
    }

    public static String[] racesWhereWinnerIsNotProfessional(Race[] races){
        String[] racesIDs = new String[races.length];
        int numWinners = 0;

        for(int i=0; i<races.length; i++){
            String winner = races[i].bestRunner();
            for(int j=0; j<races[i].getNumRunners(); j++){
                Runner r = races[i].getRunners()[j];
                if(r.getName().equals(winner)){
                    if(!r.isProfessional()){
                        racesIDs[numWinners] = races[i].getRaceID();
                        numWinners++;
                    }
                    break;
                }
            }
        }
        return racesIDs;
    }



}
