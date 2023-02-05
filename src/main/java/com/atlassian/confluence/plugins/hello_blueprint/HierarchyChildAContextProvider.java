package com.atlassian.confluence.plugins.hello_blueprint;

import com.atlassian.confluence.plugins.createcontent.api.contextproviders.AbstractBlueprintContextProvider;
import com.atlassian.confluence.plugins.createcontent.api.contextproviders.BlueprintContext;

/**
 * Provides content for the "Hierarchy" Child A Blueprint.
 *
 * @since 1.6
 */
public class HierarchyChildAContextProvider extends AbstractBlueprintContextProvider
{
    @Override
    protected BlueprintContext updateBlueprintContext(BlueprintContext context)
    {
        context.put("foo", "bar");

        return context;
    }
}
