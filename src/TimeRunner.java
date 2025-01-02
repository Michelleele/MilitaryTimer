public class TimeRunner {
    public static void main(String[] args) {

        Time time1 = new Time (8, 9, 58);
        System.out.print("Expected Results: 08:09:58 \nActual Results: ");
        System.out.println(time1);
        System.out.println();
        time1.tick();
        System.out.print("Expected Results: 08:09:59 \nActual Results: ");
        System.out.println(time1);
        System.out.println();
        time1.tick();
        System.out.print("Expected Results: 08:10:00 \nActual Results: ");
        System.out.println(time1);
        System.out.println();
        time1.tick();
        System.out.print("Expected Results: 08:10:01 \nActual Results: ");
        System.out.println(time1);
        System.out.println();
        time1.tick();
        System.out.print("Expected Results: 08:10:02 \nActual Results: ");
        System.out.println(time1);
        System.out.println();

        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        time1.tick();
        System.out.print("Expected Results: 08:10:10 \nActual Results: ");
        System.out.println(time1);
        System.out.println();

        Time time2 = new Time(15, 59, 58);
        System.out.print("Expected Results: 15:59:58 \nActual Results: ");
        System.out.println(time2);
        System.out.println();
        time2.tick();
        System.out.print("Expected Results: 15:59:59 \nActual Results: ");
        System.out.println(time2);
        System.out.println();
        time2.tick();
        System.out.print("Expected Results: 16:00:00 \nActual Results: ");
        System.out.println(time2);
        System.out.println();
        time2.tick();
        System.out.print("Expected Results: 16:00:01 \nActual Results: ");
        System.out.println(time2);
        System.out.println();

        Time time3 = new Time(23, 59, 58);
        System.out.print("Expected Results: 23:59:58 \nActual Results: ");
        System.out.println(time3);
        System.out.println();
        time3.tick();
        System.out.print("Expected Results: 23:59:59 \nActual Results: ");
        System.out.println(time3);
        System.out.println();
        time3.tick();
        System.out.print("Expected Results: 00:00:00 \nActual Results: ");
        System.out.println(time3);
        System.out.println();
        time3.tick();
        System.out.print("Expected Results: 00:00:01 \nActual Results: ");
        System.out.println(time3);
        System.out.println();

        Time time4 = new Time(10, 14, 43);
        System.out.print("Expected Results: 10:14:43 \nActual Results: ");
        System.out.println(time4);
        System.out.println();
        Time time5 = new Time(8, 30, 29);
        time4.add(time5);
        System.out.print("Expected Results: 18:45:12 \nActual Results: ");
        System.out.println(time4);
        System.out.println();
        System.out.print("Expected Results: 08:30:29 \nActual Results: ");
        System.out.println(time5);
        System.out.println();
        Time time6 = new Time(7, 20, 0);
        time4.add(time6);
        System.out.print("Expected Results: 02:05:12 \nActual Results: ");
        System.out.println(time4);

    }
}
