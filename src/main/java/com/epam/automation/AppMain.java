package com.epam.automation;

/**
 * Hello world!
 *
 */
public class AppMain
{
    private Client client;
    private ConsoleEventLogger eventLogger;

    public static void main( String[] args )
    {
        AppMain app = new AppMain();

        app.client = new Client("Jonh Snow", "1");
        app.eventLogger = new ConsoleEventLogger();

        app.logEvent("Сlient is 1");
    }


    private void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }

}
