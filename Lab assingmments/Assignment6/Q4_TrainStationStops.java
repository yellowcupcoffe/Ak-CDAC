import java.util.LinkedList;
import java.util.Scanner;

class Station {
    int stationId;
    String stationName;
    String arrivalTime;

    Station(int stationId, String stationName, String arrivalTime) {
        this.stationId = stationId;
        this.stationName = stationName;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "ID: " + stationId + " | Station: " + stationName + " | Arrival: " + arrivalTime;
    }
}

public class Q4_TrainStationStops {
    public static void main(String[] args) {
        LinkedList<Station> stops = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== TRAIN STATION STOP MANAGEMENT =====");
            System.out.println("1. Add Stop (at end)");
            System.out.println("2. Add Stop (at start)");
            System.out.println("3. Add Stop (at position)");
            System.out.println("4. Display All Stops");
            System.out.println("5. Remove Stop by Station ID");
            System.out.println("6. Exit");
            System.out.print("Select option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Station ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Station Name: ");
                    String name = sc.nextLine();
                    System.out.print("Arrival Time: ");
                    String time = sc.nextLine();
                    Station station = new Station(id, name, time);
                    if (choice == 1) {
                        stops.addLast(station);
                        System.out.println("Stop added at end.");
                    } else if (choice == 2) {
                        stops.addFirst(station);
                        System.out.println("Stop added at start.");
                    } else {
                        System.out.print("Enter position (0-" + stops.size() + "): ");
                        int pos = sc.nextInt();
                        if (pos < 0 || pos > stops.size()) {
                            System.out.println("Invalid position!");
                        } else {
                            stops.add(pos, station);
                            System.out.println("Stop added at position " + pos + ".");
                        }
                    }
                    break;
                case 4:
                    if (stops.isEmpty()) {
                        System.out.println("No stops found.");
                    } else {
                        System.out.println("--- Train Stops ---");
                        int pos2 = 1;
                        for (Station s : stops) {
                            System.out.println(pos2++ + ". " + s);
                        }
                    }
                    break;
                case 5:
                    System.out.print("Enter Station ID to remove: ");
                    int removeId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < stops.size(); i++) {
                        if (stops.get(i).stationId == removeId) {
                            stops.remove(i);
                            System.out.println("Stop removed.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Station not found.");
                    break;
                case 6:
                    System.out.println("Exiting. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        sc.close();
    }
}
