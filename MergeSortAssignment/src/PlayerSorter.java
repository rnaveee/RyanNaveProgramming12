import java.util.ArrayList;
import java.io.*;

/**
 * Class that takes in an ArrayList and sorts the players by various criteria
 * using a mergesort.
 */

public class PlayerSorter {



    private static int sort; //sort variable to keep the sort type

    //The following fields are the different sort types:
    public static int GAMESPLAYED = 0;
    public static int ATBATS = 1;
    public static int RUNS = 2;
    public static int PERCENTRUNS = 3; // Calculated by: runs/atBats
    public static int PERCENTONBASE = 4; // Calculated by (hits + doubles + triples) / atBats

    /**
     * This method is an interface that allows the sorting of a player given based on
     * certain criteria.  There are 5 options to sort a player which are by Games played,
     * at bats, runs, percent runs, percent on base.
     * The sort is in descending order (Largest to smallest)
     * This method calls one of 5 private methods that will do the sort based on the chosen criteria.
     * @param list List of players containing the statistics
     * @param sortType How the user wants the players sorted.  The value should be chosed from one of
     *                 the 5 static fields from the class.
     * @return An ArrayList that is sorted according to the users specification.
     */

    public static ArrayList<PlayerBattingStats> sort(ArrayList<PlayerBattingStats> list, int sortType) {

        sort = sortType; //sets the sort type based on user input

        mergeSort(list); //merge sorts the list

        checkDuplicates(list); // checks for duplicates after list has been sorted


        //writes the list into a file based on the sort type
        try {
            FileWriter sorted = new FileWriter("SortedPlayers.txt");
            switch (sort) {
                case 0 -> {
                    sorted.write("Most Games Played\n");
                    for (PlayerBattingStats p : list) {
                        sorted.write(p.getName() + ": " + p.getGames() + "\n");
                    }
                }
                case 1 -> {
                    sorted.write("Top AtBats\n");
                    for (PlayerBattingStats p : list) {
                        sorted.write(p.getName() + ": " + p.getAtBats() + "\n");
                    }
                }
                case 2 -> {
                    sorted.write("Top Runs\n");
                    for (PlayerBattingStats p : list) {
                        sorted.write(p.getName() + ": " + p.getRuns() + "\n");
                    }
                }
                case 3 -> {
                    sorted.write("Top Percentage of Runs\n");
                    for (PlayerBattingStats p : list) {
                        double perc = (((double) p.getRuns() / p.getAtBats()) * 100);
                        sorted.write(p.getName() + ": " + ((int) perc) + "%\n");
                    }
                }
                case 4 -> {
                    sorted.write("Top Percentage of Base\n");
                    for (PlayerBattingStats p : list) {
                        double perc = (((double) (p.getHits() + p.getDoubles() + p.getTriples()) / p.getAtBats()) * 100);
                        sorted.write(p.getName() + ": " + ((int) perc) + "%\n");
                    }
                }
            }
            sorted.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



        return list;
    }


    //merge sort
    public static ArrayList<PlayerBattingStats> mergeSort(ArrayList<PlayerBattingStats> inList) {
        int listLength = inList.size();

        if (listLength < 2) {
            return inList;
        }

        int mid = (listLength / 2);


        ArrayList<PlayerBattingStats> left = new ArrayList<>();
        for(int i = 0; i < mid; i++){
            left.add(inList.get(i));
        }
        ArrayList<PlayerBattingStats> right = new ArrayList<>();
        for(int i = mid; i < listLength; i++){
            right.add(inList.get(i));
        }

        //recursively sorts left and right lists until there is 1 element left
        left = mergeSort(left);
        right = mergeSort(right);

        //merges the lists
        merge(inList, left, right, sort);

        return inList;
    }

    public static void merge(ArrayList<PlayerBattingStats> orgList, ArrayList<PlayerBattingStats> leftList, ArrayList<PlayerBattingStats> rightList, int sortType) {
        int left = leftList.size();
        int right = rightList.size();


        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        //switch case based on the type of sort the user wants
        switch (sortType) {
            case 0 -> {
                while (p1 < left && p2 < right) {


                    if (leftList.get(p1).getGames() >= rightList.get(p2).getGames()) {
                        orgList.set(p3++, leftList.get(p1++));

                    } else {
                        orgList.add(p3++, rightList.get(p2++));

                    }


                }
                while (p1 < left) {
                    orgList.set(p3++, leftList.get(p1++));
                }
                while (p2 < right) {
                    orgList.add(p3++, rightList.get(p2++));
                }
            }
            case 1 -> {
                while (p1 < left && p2 < right) {


                    if (leftList.get(p1).getAtBats() >= rightList.get(p2).getAtBats()) {
                        orgList.set(p3++, leftList.get(p1++));
                    } else {
                        orgList.add(p3++, rightList.get(p2++));
                    }


                }
                while (p1 < left) {
                    orgList.set(p3++, leftList.get(p1++));
                }
                while (p2 < right) {
                    orgList.add(p3++, rightList.get(p2++));
                }
            }
            case 2 -> {
                while (p1 < left && p2 < right) {


                    if (leftList.get(p1).getRuns() >= rightList.get(p2).getRuns()) {
                        orgList.set(p3++, leftList.get(p1++));
                    } else {
                        orgList.add(p3++, rightList.get(p2++));
                    }


                }
                while (p1 < left) {
                    orgList.set(p3++, leftList.get(p1++));
                }
                while (p2 < right) {
                    orgList.add(p3++, rightList.get(p2++));

                }
            }
            case 3 -> {
                while (p1 < left && p2 < right) {
                    double leftPerc = (((double) leftList.get(p1).getRuns() / leftList.get(p1).getAtBats()) * 100);
                    double rightPerc = (((double) rightList.get(p2).getRuns() / rightList.get(p2).getAtBats()) * 100);

                    if ((int) leftPerc >= (int) rightPerc) {
                        orgList.set(p3++, leftList.get(p1++));
                    } else {
                        orgList.add(p3++, rightList.get(p2++));
                    }


                }
                while (p1 < left) {
                    orgList.set(p3++, leftList.get(p1++));
                }
                while (p2 < right) {
                    orgList.set(p3, rightList.get(p2++));
                }
            }
            case 4 -> {
                while (p1 < left && p2 < right) {
                    double leftPerc = (((double) (leftList.get(p1).getHits() + leftList.get(p1).getDoubles() + leftList.get(p1).getTriples()) / leftList.get(p1).getAtBats()) * 100);

                    double rightPerc = (((double) (rightList.get(p2).getHits() + rightList.get(p2).getDoubles() + rightList.get(p2).getTriples()) / rightList.get(p2).getAtBats()) * 100);

                    if ((int) leftPerc >= (int) rightPerc) {
                        orgList.set(p3++, leftList.get(p1++));
                    } else {
                        orgList.add(p3++, rightList.get(p2++));
                    }

                }
                while (p1 < left) {
                    orgList.set(p3++, leftList.get(p1++));
                }
                while (p2 < right) {
                    orgList.add(p3++, rightList.get(p2++));
                }
            }
        }

    }
    public static ArrayList<PlayerBattingStats> checkDuplicates(ArrayList<PlayerBattingStats> orgList){
        ArrayList<PlayerBattingStats> temp = new ArrayList<>();
        for (PlayerBattingStats player : orgList){
            if(!temp.contains(player)){
                temp.add(player);
            }
        }

        orgList.clear();
        for (PlayerBattingStats player : temp){
            orgList.add(player);
        }

        return orgList;
    }
}


