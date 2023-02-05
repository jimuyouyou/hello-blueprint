package com.atlassian.confluence.plugins.hello_blueprint;

import com.atlassian.confluence.plugins.createcontent.api.contextproviders.AbstractBlueprintContextProvider;
import com.atlassian.confluence.plugins.createcontent.api.contextproviders.BlueprintContext;

/**
 * This provider adds dynamic data for substitution into the ContentTemplate's {@literal \<at:var>} elements.
 *
 * For the sake of illustration, the provider in turn gets its data from an injected service.
 */
public class HelloContextProvider extends AbstractBlueprintContextProvider
{
    private final HelloService helloService;

    public HelloContextProvider(HelloService helloService)
    {
        this.helloService = helloService;
    }

    @Override
    protected BlueprintContext updateBlueprintContext(BlueprintContext context)
    {
        context.put("friendlyDate", helloService.getFriendlyDate());
        // We're adding a string with HTML tags. It will be correctly rendered by our template
        // (check var declaration at content-template-a.xml)
        context.put("xhtmlString", "<em>Hello I am emphasised</em>");

        return context;
    }
}
