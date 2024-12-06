public class TimeRunner {

    public void test(String expected, Time time) {
        System.out.println("--------------------------------------------------------------- \nExpected: " + expected + "\nActual: " + time);
    }

    public static void main(String[] args) {

        TimeRunner run = new TimeRunner();

        Time time1 = new Time(23, 59, 59);
        //test for initiating variables and toString()
        run.test("23:59:59", time1);

        time1.tick();
        //test for all if statements for tick()
        run.test("00:00:00", time1);

        time1.tick();
        //test for seconds else statement for tick()
        run.test("00:00:01", time1);

        for (int x = 1; x <= 59; x++) {
            time1.tick();
        }
        //test for minute else statement for tick()
        run.test("00:01:00", time1);

        for (int x = 1; x <= 60; x++) {
            for (int y = 1; y <= 59; y++) {
                time1.tick();
            }
        }
        //test for hours else statement for tick()
        run.test("01:00:00", time1);

        Time time2 = new Time(23, 59, 59);
        Time time3 = new Time(0, 2, 1);
        time2.add(time3);

    }
}
