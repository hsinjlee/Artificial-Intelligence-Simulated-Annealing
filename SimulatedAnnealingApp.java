

public class SimulatedAnnealingApp {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            City city = new City();
            Repository.addCity(city);
        }

        SimulatedAnnealing annealing = new SimulatedAnnealing();
        annealing.simulation();

        System.out.println("Final approximated solution's distance is: " + annealing.getBest().getDistance());
        System.out.println("Tour: " + annealing.getBest());
    }
}

//	Initial solution distance: 4655.0
//		Final approximated solution's distance is: 2201.0
//		Tour: 82-2 -> 98-2 -> 73-31 -> 41-54 -> 20-72 -> 31-80 -> 64-42 -> 51-32 -> 64-8 -> 60-12 -> 36-46 -> 15-43 ->
//		34-48 -> 60-68 -> 65-72 -> 66-67 -> 46-40 -> 33-62 -> 48-92 -> 14-99 -> 24-94 -> 36-89 -> 45-76 -> 87-25 ->
//		81-26 -> 77-30 -> 73-60 -> 77-84 -> 74-91 -> 88-91 -> 92-67 -> 95-53 -> 94-87 -> 67-93 -> 50-55 -> 27-60 ->
//		12-73 -> 4-77 -> 22-93 -> 16-94 -> 36-85 -> 49-95 -> 36-97 -> 38-68 -> 3-93 -> 7-86 -> 62-44 -> 58-47 ->
//		49-74 -> 51-76 -> 39-83 -> 47-95 -> 1-4 -> 1-51 -> 10-47 -> 7-59 -> 38-17 -> 23-17 -> 24-39 -> 24-44 ->
//		17-48 -> 3-35 -> 10-22 -> 10-14 -> 3-13 -> 5-7 -> 35-10 -> 37-18 -> 43-4 -> 55-15 -> 72-44 -> 60-51 ->
//		61-57 -> 47-30 -> 48-25 -> 80-2 -> 75-45 -> 85-79 -> 76-85 -> 70-68 -> 73-59 -> 62-55 -> 45-57 -> 16-51 ->
//		15-41 -> 24-8 -> 63-26 -> 97-10 -> 64-6 -> 70-12 -> 90-26 -> 80-36 -> 81-39 -> 83-55 -> 87-56 -> 65-69 ->
//		74-69 -> 84-13 -> 71-16 -> 67-2 ->
