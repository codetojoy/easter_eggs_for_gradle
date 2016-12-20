
package net.codetojoy.app;

import net.codetojoy.service.EmployeeService;

public class Runner {
    private EmployeeService employeeService = new EmployeeService();

    public void run(String arg) {
        if (arg.equalsIgnoreCase("buildinfo")) {
            String buildInfo = employeeService.getBuildInfo();
            System.out.println("buildInfo: " + buildInfo);
        } else {
            String id = arg;
            String name = employeeService.getNameById(id);
            System.out.println("id: " + id + " , name: " + name);
        }
    }

    public static void main(String... args) {
        if (args.length >= 1) {
            Runner runner = new Runner();
            runner.run(args[0]);
        } else {
            System.err.println("check usage");
        }
    }
}
