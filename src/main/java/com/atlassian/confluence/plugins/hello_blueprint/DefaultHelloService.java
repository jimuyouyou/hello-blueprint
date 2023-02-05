package com.atlassian.confluence.plugins.hello_blueprint;

import java.text.DateFormat;
import java.util.Date;

/**
 * An unnecessary service that shows how a ContextProvider can retrieve information from *any* plugin-available
 * Component.
 *
 * @since 5.0
 */
public class DefaultHelloService implements HelloService
{
    @Override
    public String getFriendlyDate()
    {
        return DateFormat.getDateInstance(DateFormat.LONG).format(new Date());
    }

    @Override
    public String getFriendlyDateTime()
    {
        return DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(new Date());
    }
}
