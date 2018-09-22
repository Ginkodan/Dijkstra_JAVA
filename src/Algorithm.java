import java.awt.*;
import java.util.LinkedList;
import java.util.Map;

public class Algorithm {


    int startPoint;
    boolean destinationPoint;
    private int numbWaypoints;
    Waypoint[] waypoint;
    Network network;
    int currentWaypoint;


    public void startPoint(String startPoint) {

        for (int i = 0; i < waypoint.length; i++) {
            if (waypoint[i].getName() == startPoint) {
                waypoint[i].activated = true;
                waypoint[i] = node;
                i = currentWaypoint;
                compareAndSetShortestWaypointActivated(currentWaypoint);

            } else {
                waypoint[i].distanceFromStart = 0;
            }

        }

    }







    public void setVisited(boolean visited){


    waypoint[1].setVisited(true);

    }


    public void compareAndSetShortestWaypointActivated(int currentWaypoint, Node nodes ){

            if (waypoint[currentWaypoint].activated == true){

                for (int i = 0; i  > waypoint ; i++) {

                }


                    waypoint[currentWaypoint].getNeighbours.get(1);
                    network.getDistance(network.getNodes(waypoint[currentWaypoint], waypoint(currentWaypoint + 1)));

            }

        }









    public static void ifShortestToDestinyStop(){






    }


    public static void chooseShortestPath(){




    }



}
