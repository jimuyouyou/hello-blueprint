package com.atlassian.confluence.plugins.hello_blueprint;

import com.atlassian.confluence.languages.LocaleManager;
import com.atlassian.confluence.plugins.createcontent.api.contextproviders.AbstractBlueprintContextProvider;
import com.atlassian.confluence.plugins.createcontent.api.contextproviders.BlueprintContext;
import com.atlassian.confluence.user.AuthenticatedUserThreadLocal;
import com.atlassian.confluence.util.i18n.I18NBean;
import com.atlassian.confluence.util.i18n.I18NBeanFactory;

import static com.atlassian.confluence.plugins.createcontent.actions.DefaultBlueprintContentGenerator.CONTENT_PAGE_TITLE_CONTEXT_KEY;

/**
 * Provides content for the "Hierarchy" Blueprint and its two child pages.
 *
 * @since 1.6
 */
public class HierarchyContextProvider extends AbstractBlueprintContextProvider
{
    private final LocaleManager localeManager;
    private final I18NBeanFactory i18NBeanFactory;
    private final HelloService helloService;

    public HierarchyContextProvider(LocaleManager localeManager, I18NBeanFactory i18NBeanFactory, HelloService helloService)
    {
        this.localeManager = localeManager;
        this.i18NBeanFactory = i18NBeanFactory;
        this.helloService = helloService;
    }

    @Override
    protected BlueprintContext updateBlueprintContext(BlueprintContext context)
    {
        final String pageTitle = i18nBean().getText("confluence.hierarchy.blueprint.content.title", new String[]{helloService.getFriendlyDateTime()});

        context.put(CONTENT_PAGE_TITLE_CONTEXT_KEY, pageTitle);

        return context;
    }

    private I18NBean i18nBean()
    {
        return i18NBeanFactory.getI18NBean(localeManager.getLocale(AuthenticatedUserThreadLocal.getUser()));
    }
}
