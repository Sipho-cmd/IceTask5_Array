void main() {

    int[][] makeOver = {{8, 7, 5, 2, 7, 7}, {2, 4, 5, 2, 7, 8}, {5, 5, 2, 3, 9, 5}};
    String[] months = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE"};
    String[] jobs = {"BATHROOMS", "KITCHENS", "GARDEN"};

    int total = 0;
    int maximum = makeOver[0][0];
    int minimum = makeOver[0][0];
    int[] monthlyTotals = new int[months.length];

    System.out.println("--------------------------------------------");
    System.out.println("HOME MAKEOVER REPORT");
    System.out.println("--------------------------------------------");

    //% starts the format, while -18 means jobs start from the left
    System.out.printf("%-18s", " ");
    for (int job = 0; job < jobs.length; job++) {
        System.out.printf("%-12s", jobs[job]);
    }

    System.out.println();

    for (int month = 0; month < months.length; month++) {
        System.out.printf("%-18s", months[month]);

        for (int job = 0; job < jobs.length; job++) {
            System.out.printf("%-12d", makeOver[job][month]);

            //adds this value to the overall total
            total += makeOver[job][month];
            monthlyTotals[month] += makeOver[job][month];

            //update the maximum if the value is lower
            if (makeOver[job][month] > maximum) {
                maximum = makeOver[job][month];
            }

            //update the minimum if the value is lower
            if (makeOver[job][month] < minimum) {
                minimum = makeOver[job][month];
            }
        }
        System.out.println();
    }

    System.out.println("--------------------------------------------");
    System.out.println("MONTHLY TOTALS");
    System.out.println("-----------------------------------------");

    //any month with a total at
    final int THRESHOLD = 15;

    //looping through each months total, printing the name, the total.
    //If that months total meets or exceeds the threshold
    for (int month = 0; month < monthlyTotals.length; month++){
        System.out.printf("%-18s%,-12d", months[month], monthlyTotals[month]);

        if (monthlyTotals[month] >= THRESHOLD){
            System.out.print("***");
        }

        System.out.println();
    }

    System.out.println("---------------------------------------");
}
