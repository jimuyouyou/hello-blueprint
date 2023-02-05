package com.atlassian.confluence.plugins.hello_blueprint;

/**
 * A dummy interface that just provides the current date in a 'friendly' format.
 */
public interface HelloService
{
    String getFriendlyDate();

    String getFriendlyDateTime();
}
